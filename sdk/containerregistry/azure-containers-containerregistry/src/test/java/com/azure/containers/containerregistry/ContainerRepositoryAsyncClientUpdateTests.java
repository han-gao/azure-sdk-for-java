// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.models.RegistryArtifactProperties;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.List;
import java.util.stream.Collectors;

import static com.azure.containers.containerregistry.TestUtils.DIGEST_UNKNOWN;
import static com.azure.containers.containerregistry.TestUtils.HELLO_WORLD_SEATTLE_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.TAG_TO_DELETE;
import static com.azure.containers.containerregistry.TestUtils.TAG_TO_UPDATE;
import static com.azure.containers.containerregistry.TestUtils.TAG_UNKNOWN;

public class ContainerRepositoryAsyncClientUpdateTests extends ContainerRegistryClientsTestBase {
    private String recordFileName;
    private static final String PARENT_FILENAME = "ContainerRepositoryAsyncClientUpdateIntegrationTests.";

    private ContainerRepositoryAsyncClient getContainerRepositoryAsyncClient() {
        return getContainerRepositoryBuilder(HELLO_WORLD_SEATTLE_REPOSITORY_NAME, new LocalHttpClient(recordFileName)).buildAsyncClient();
    }

    private ContainerRepositoryAsyncClient getUnknownContainerRepositoryAsyncClient() {
        return getContainerRepositoryBuilder(TAG_UNKNOWN, new LocalHttpClient(recordFileName)).buildAsyncClient();
    }

    private ContainerRegistryAsyncClient getContainerRegistryAsyncClient() {
        return getContainerRegistryBuilder(new LocalHttpClient(recordFileName)).buildAsyncClient();
    }

    @Test
    public void setRepositoryProperties() {
        recordFileName = PARENT_FILENAME + "setRepositoryPropertiesWithResponse[1].json";
        ContainerRepositoryAsyncClient client = getContainerRepositoryAsyncClient();

        StepVerifier.create(client.setProperties(writeableProperties).then(monoDelay().flatMap(res -> client.getProperties())))
            .assertNext(res -> validateContentProperties(res.getWriteableProperties()))
            .verifyComplete();
    }

    @Test
    public void setRepositoryPropertiesThrows() {
        recordFileName = PARENT_FILENAME + "setRepositoryPropertiesThrowsWithResponse[1].json";
        ContainerRepositoryAsyncClient client = getUnknownContainerRepositoryAsyncClient();

        StepVerifier.create(client.setProperties(writeableProperties).then(monoDelay().flatMap(res -> client.getProperties())))
            .expectError(ResourceNotFoundException.class)
            .verify();

        StepVerifier.create(client.setProperties(null).then(monoDelay().flatMap(res -> client.getProperties())))
            .expectError(NullPointerException.class)
            .verify();
    }

    @Test
    public void setManifestProperties() {
        recordFileName = PARENT_FILENAME + "setManifestPropertiesWithResponse[1].json";
        ContainerRepositoryAsyncClient client = getContainerRepositoryAsyncClient();

        PagedIterable<RegistryArtifactProperties> props = new PagedIterable<>(client.listRegistryArtifacts());
        List<RegistryArtifactProperties> repositories = props.stream().collect(Collectors.toList());
        String digest = getChildArtifactDigest(repositories);

        StepVerifier.create(client.setManifestProperties(digest, writeableProperties).then(monoDelay().flatMap(res -> client.getRegistryArtifactProperties(digest))))
            .assertNext(res -> validateContentProperties(res.getWriteableProperties()))
            .verifyComplete();
    }

    @Test
    public void setManifestPropertiesThrows() {
        recordFileName = PARENT_FILENAME + "setManifestPropertiesThrowsWithResponse[1].json";
        ContainerRepositoryAsyncClient client = getContainerRepositoryAsyncClient();

        StepVerifier.create(client.setManifestProperties(DIGEST_UNKNOWN, writeableProperties))
            .expectError(ResourceNotFoundException.class)
            .verify();

        StepVerifier.create(client.setManifestProperties(null, writeableProperties))
            .expectError(NullPointerException.class)
            .verify();

        StepVerifier.create(client.setManifestProperties(DIGEST_UNKNOWN, null))
            .expectError(NullPointerException.class)
            .verify();

    }

    @Test
    public void deleteRegistryArtifact() {
        recordFileName = PARENT_FILENAME + "deleteRegistryArtifactWithResponse[1].json";
        ContainerRepositoryAsyncClient client = getContainerRepositoryAsyncClient();

        PagedIterable<RegistryArtifactProperties> props = new PagedIterable<>(client.listRegistryArtifacts());
        List<RegistryArtifactProperties> repositories = props.stream().collect(Collectors.toList());
        String digest = getChildArtifactDigest(repositories);

        StepVerifier.create(client.deleteRegistryArtifact(digest).then(Mono.defer(() -> monoDelay().flatMap(res -> client.getRegistryArtifactProperties(digest)))))
            .expectError(ResourceNotFoundException.class)
            .verify();
    }

    @Test
    public void deleteRegistryArtifactThrows() {
        recordFileName = PARENT_FILENAME + "deleteRegistryArtifactThrowsWithResponse[1].json";
        ContainerRepositoryAsyncClient client = getContainerRepositoryAsyncClient();

        StepVerifier.create(client.deleteRegistryArtifact(DIGEST_UNKNOWN))
            .expectError(ResourceNotFoundException.class)
            .verify();

        StepVerifier.create(client.deleteRegistryArtifact(null))
            .expectError(NullPointerException.class)
            .verify();
    }

    @Test
    public void setTagProperties() {
        recordFileName = PARENT_FILENAME + "setTagPropertiesWithResponse[1].json";
        ContainerRepositoryAsyncClient client = getContainerRepositoryAsyncClient();

        StepVerifier.create(client.setTagProperties(TAG_TO_UPDATE, writeableProperties).then(monoDelay().flatMap(res -> client.getTagProperties(TAG_TO_UPDATE))))
            .assertNext(res -> validateContentProperties(res.getWriteableProperties()))
            .verifyComplete();
    }

    @Test
    public void setTagPropertiesThrows() {
        recordFileName = PARENT_FILENAME + "setTagPropertiesThrowsWithResponse[1].json";
        ContainerRepositoryAsyncClient client = getContainerRepositoryAsyncClient();

        StepVerifier.create(client.setTagProperties(TAG_UNKNOWN, writeableProperties))
            .expectError(ResourceNotFoundException.class)
            .verify();

        StepVerifier.create(client.setTagProperties(null, writeableProperties))
            .expectError(NullPointerException.class)
            .verify();

        StepVerifier.create(client.setTagProperties(TAG_UNKNOWN, null))
            .expectError(NullPointerException.class)
            .verify();
    }

    @Test
    public void deleteTag() {
        recordFileName = PARENT_FILENAME + "deleteTagWithResponse[1].json";
        ContainerRepositoryAsyncClient client = getContainerRepositoryAsyncClient();

        StepVerifier.create(client.deleteTag(TAG_TO_DELETE).then(monoDelay().flatMap(res -> client.getTagProperties(TAG_TO_DELETE))))
            .expectError(ResourceNotFoundException.class)
            .verify();
    }

    @Test
    public void deleteTagThrows() {
        recordFileName = PARENT_FILENAME + "deleteTagThrowsWithResponse[1].json";
        ContainerRepositoryAsyncClient client = getContainerRepositoryAsyncClient();

        StepVerifier.create(client.deleteTag(TAG_UNKNOWN))
            .expectError(ResourceNotFoundException.class)
            .verify();

        StepVerifier.create(client.deleteTag(null))
            .expectError(NullPointerException.class)
            .verify();
    }

    @Test
    public void deleteRepository() {
        recordFileName = "ContainerRepositoryAsyncClientUpdateIntegrationTests.deleteRepositoryWithResponse[1].json";
        ContainerRepositoryAsyncClient client = getContainerRepositoryAsyncClient();

        StepVerifier.create(client.delete())
            .assertNext(res -> {
                validateDeletedRepositoryResponse(res);
            })
            .verifyComplete();
    }

    @Test
    public void deleteRepositoryThrows() {
        recordFileName = PARENT_FILENAME + "deleteRepositoryThrowsWithResponse[1].json";
        ContainerRepositoryAsyncClient client = getUnknownContainerRepositoryAsyncClient();

        StepVerifier.create(client.delete())
            .expectError(ResourceNotFoundException.class)
            .verify();
    }
}
