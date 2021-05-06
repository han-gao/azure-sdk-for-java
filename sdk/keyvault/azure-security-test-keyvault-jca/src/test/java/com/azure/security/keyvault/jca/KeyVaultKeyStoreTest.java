// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.jca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.util.StringUtils;

import java.io.ByteArrayInputStream;
import java.security.ProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * The JUnit tests for the KeyVaultKeyStore class.
 */
@EnabledIfEnvironmentVariable(named = "AZURE_KEYVAULT_CERTIFICATE_NAME", matches = ".*")
public class KeyVaultKeyStoreTest {


    /**
     * Stores the CER test certificate (which is valid til 2120).
     */
    private static final String TEST_CERTIFICATE
        = "MIIDeDCCAmCgAwIBAgIQGghBu97rQJKNnUHPWU7xjDANBgkqhkiG9w0BAQsFADAk"
        + "MSIwIAYDVQQDExlodW5kcmVkLXllYXJzLmV4YW1wbGUuY29tMCAXDTIwMDkwMjE3"
        + "NDUyNFoYDzIxMjAwOTAyMTc1NTI0WjAkMSIwIAYDVQQDExlodW5kcmVkLXllYXJz"
        + "LmV4YW1wbGUuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuU14"
        + "btkN5wmcO2WKXqm1NUKXzi79EtqiFFkrLgPAwj5NNwMw2Akm3GpdEpwkJ8/q3l7d"
        + "frDEVOO9gwZbz7xppyqutjxjllw8CCgjFdfK02btz56CGgh3X25ZZtzPbuMZJM0j"
        + "o4mVEdaFNJ0eUeMppS0DcbbuTWCF7Jf1gvr8GVqx+E0IJUFkE+D4kdTbnJSaeK0A"
        + "KEt94z88MPX18h8ud14uRVmUCYVZrZeswdE2tO1BpazrXELHuXCtrjGxsDDjDzeP"
        + "98aFI9kblkqoJS4TsmloLEjwZLm80cyJDEmpXXMtR7C0FFXFI1BAtIa4mxSgBLsT"
        + "L4GVPEGNANR8COYkHQIDAQABo4GjMIGgMA4GA1UdDwEB/wQEAwIFoDAJBgNVHRME"
        + "AjAAMB0GA1UdJQQWMBQGCCsGAQUFBwMBBggrBgEFBQcDAjAkBgNVHREEHTAbghlo"
        + "dW5kcmVkLXllYXJzLmV4YW1wbGUuY29tMB8GA1UdIwQYMBaAFOGTt4H3ho30O4e+"
        + "hebwJjm2VMvIMB0GA1UdDgQWBBThk7eB94aN9DuHvoXm8CY5tlTLyDANBgkqhkiG"
        + "9w0BAQsFAAOCAQEAGp8mCioVCmM+kZv6r+K2j2uog1k4HBwN1NfRoSsibDB8+QXF"
        + "bmNf3M0imiuR/KJgODyuROwaa/AalxNFMOP8XTL2YmP7XsddBs9ONHHQXKjY/Ojl"
        + "PsIPR7vZjwYPfEB+XEKl2fOIxDQQ921POBV7M6DdTC49T5X+FsLR1AIIfinVetT9"
        + "QmNuvzulBX0T0rea/qpcPK4HTj7ToyImOaf8sXRv2s2ODLUrKWu5hhTNH2l6RIkQ"
        + "U/aIAdQRfDaSE9jhtcVu5d5kCgBs7nz5AzeCisDPo5zIt4Mxej3iVaAJ79oEbHOE"
        + "p192KLXLV/pscA4Wgb+PJ8AAEa5B6xq8p9JO+Q==";

    private KeyVaultKeyStore keystore;

    private String certificateName;

    public static void putEnvironmentPropertyToSystemProperty(String key) {
        Optional.of(key)
                .map(System::getenv)
                .filter(StringUtils::hasText)
                .ifPresent(value -> {
                    if (key.equals("AZURE_KEYVAULT_URI")) {
                        System.getProperties().put(
                            key.toLowerCase().replaceAll("_", "."), value);
                    } else {
                        int index = key.lastIndexOf("_");
                        StringBuilder sb = new StringBuilder(key.toLowerCase().replaceAll("_", "."));
                        System.getProperties().put(sb.replace(index, index + 1, "-").toString(), value);
                    }
                });
    }

    @BeforeEach
    public void setEnvironmentProperty() {
        KeyVaultLoadStoreParameter parameter = new KeyVaultLoadStoreParameter(
            System.getenv("AZURE_KEYVAULT_URI"),
            System.getenv("AZURE_KEYVAULT_TENANT_ID"),
            System.getenv("AZURE_KEYVAULT_CLIENT_ID"),
            System.getenv("AZURE_KEYVAULT_CLIENT_SECRET"));
        certificateName = System.getenv("AZURE_KEYVAULT_CERTIFICATE_NAME");
        putEnvironmentPropertyToSystemProperty("AZURE_KEYVAULT_URI");
        putEnvironmentPropertyToSystemProperty("azure.keyvault.aad-authentication-url");
        putEnvironmentPropertyToSystemProperty("AZURE_KEYVAULT_TENANT_ID");
        putEnvironmentPropertyToSystemProperty("AZURE_KEYVAULT_CLIENT_ID");
        putEnvironmentPropertyToSystemProperty("AZURE_KEYVAULT_CLIENT_SECRET");
        keystore = new KeyVaultKeyStore();
        keystore.engineLoad(parameter);
    }

    @Test
    public void testEngineGetCertificate() {
        assertNotNull(keystore.engineGetCertificate(certificateName));
    }

    @Test
    public void testEngineGetCertificateAlias() {
        X509Certificate certificate;

        try {
            byte[] certificateBytes = Base64.getDecoder().decode(TEST_CERTIFICATE);
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            certificate = (X509Certificate) cf.generateCertificate(new ByteArrayInputStream(certificateBytes));
        } catch (CertificateException e) {
            throw new ProviderException(e);
        }
        keystore.engineSetCertificateEntry("setcert", certificate);
        assertNotNull(keystore.engineGetCertificateAlias(certificate));
    }

    @Test
    public void testEngineGetCertificateChain() {
        assertNotNull(keystore.engineGetCertificateChain(certificateName));
    }


    @Test
    public void testEngineSetCertificateEntry() {

        X509Certificate certificate;

        try {
            byte[] certificateBytes = Base64.getDecoder().decode(TEST_CERTIFICATE);
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            certificate = (X509Certificate) cf.generateCertificate(new ByteArrayInputStream(certificateBytes));
        } catch (CertificateException e) {
            throw new ProviderException(e);
        }

        keystore.engineSetCertificateEntry("setcert", certificate);
        assertNotNull(keystore.engineGetCertificate("setcert"));
    }

    @Test
    public void testEngineGetKey() {
        assertNotNull(keystore.engineGetKey(certificateName, null));
    }


    @Test
    public void testEngineSetKeyEntry() {
        KeyVaultKeyStore keystore = new KeyVaultKeyStore();
        keystore.engineSetKeyEntry(certificateName, null, null);
    }

    @Test
    public void testEngineSetKeyEntry2() {
        KeyVaultKeyStore keystore = new KeyVaultKeyStore();
        keystore.engineSetKeyEntry(certificateName, null, null, null);
    }

    @Test
    public void testEngineAliases() {
        assertTrue(keystore.engineAliases().hasMoreElements());
    }


    @Test
    public void testEngineGetCreationDate() {
        KeyVaultKeyStore keystore = new KeyVaultKeyStore();
        assertNotNull(keystore.engineGetCreationDate(certificateName));
    }

    @Test
    public void testEngineDeleteEntry() {
        KeyVaultKeyStore keystore = new KeyVaultKeyStore();
        keystore.engineDeleteEntry(certificateName);
    }

    @Test
    public void testEngineSize() {
        KeyVaultKeyStore keystore = new KeyVaultKeyStore();
        assertTrue(keystore.engineSize() >= 0);
    }

    @Test
    public void testEngineStore() {
        KeyVaultKeyStore keystore = new KeyVaultKeyStore();
        keystore.engineStore(null, null);
    }
}
