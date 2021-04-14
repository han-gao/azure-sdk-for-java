// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.resourcemanager.billing.fluent.models.BillingPeriodInner;
import java.time.LocalDate;
import java.util.List;

/** An immutable client-side representation of BillingPeriod. */
public interface BillingPeriod {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the billingPeriodStartDate property: The start of the date range covered by the billing period.
     *
     * @return the billingPeriodStartDate value.
     */
    LocalDate billingPeriodStartDate();

    /**
     * Gets the billingPeriodEndDate property: The end of the date range covered by the billing period.
     *
     * @return the billingPeriodEndDate value.
     */
    LocalDate billingPeriodEndDate();

    /**
     * Gets the invoiceIds property: Array of invoice ids that associated with.
     *
     * @return the invoiceIds value.
     */
    List<String> invoiceIds();

    /**
     * Gets the inner com.azure.resourcemanager.billing.fluent.models.BillingPeriodInner object.
     *
     * @return the inner object.
     */
    BillingPeriodInner innerModel();
}
