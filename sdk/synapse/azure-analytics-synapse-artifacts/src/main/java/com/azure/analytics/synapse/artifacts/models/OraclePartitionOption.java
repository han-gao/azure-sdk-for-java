// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OraclePartitionOption. */
public final class OraclePartitionOption extends ExpandableStringEnum<OraclePartitionOption> {
    /** Static value None for OraclePartitionOption. */
    public static final OraclePartitionOption NONE = fromString("None");

    /** Static value PhysicalPartitionsOfTable for OraclePartitionOption. */
    public static final OraclePartitionOption PHYSICAL_PARTITIONS_OF_TABLE = fromString("PhysicalPartitionsOfTable");

    /** Static value DynamicRange for OraclePartitionOption. */
    public static final OraclePartitionOption DYNAMIC_RANGE = fromString("DynamicRange");

    /**
     * Creates or finds a OraclePartitionOption from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OraclePartitionOption.
     */
    @JsonCreator
    public static OraclePartitionOption fromString(String name) {
        return fromString(name, OraclePartitionOption.class);
    }

    /** @return known OraclePartitionOption values. */
    public static Collection<OraclePartitionOption> values() {
        return values(OraclePartitionOption.class);
    }
}
