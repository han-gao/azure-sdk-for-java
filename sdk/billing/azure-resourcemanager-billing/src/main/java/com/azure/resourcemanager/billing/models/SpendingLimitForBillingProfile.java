// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SpendingLimitForBillingProfile. */
public final class SpendingLimitForBillingProfile extends ExpandableStringEnum<SpendingLimitForBillingProfile> {
    /** Static value Off for SpendingLimitForBillingProfile. */
    public static final SpendingLimitForBillingProfile OFF = fromString("Off");

    /** Static value On for SpendingLimitForBillingProfile. */
    public static final SpendingLimitForBillingProfile ON = fromString("On");

    /**
     * Creates or finds a SpendingLimitForBillingProfile from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SpendingLimitForBillingProfile.
     */
    @JsonCreator
    public static SpendingLimitForBillingProfile fromString(String name) {
        return fromString(name, SpendingLimitForBillingProfile.class);
    }

    /** @return known SpendingLimitForBillingProfile values. */
    public static Collection<SpendingLimitForBillingProfile> values() {
        return values(SpendingLimitForBillingProfile.class);
    }
}
