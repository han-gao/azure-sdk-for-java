// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/** The list of file ranges. */
@JacksonXmlRootElement(localName = "ShareFileRangeList")
@Fluent
@JsonDeserialize(using = ShareFileRangeListDeserializer.class)
public final class ShareFileRangeList {
    /*
     * The Ranges property.
     */
    @JsonProperty("Range")
    private List<FileRange> ranges = new ArrayList<>();

    /*
     * The ClearRanges property.
     */
    @JsonProperty("ClearRange")
    private List<ClearRange> clearRanges = new ArrayList<>();

    /**
     * Get the ranges property: The Ranges property.
     *
     * @return the ranges value.
     */
    public List<FileRange> getRanges() {
        return this.ranges;
    }

    /**
     * Set the ranges property: The Ranges property.
     *
     * @param ranges the ranges value to set.
     * @return the ShareFileRangeList object itself.
     */
    public ShareFileRangeList setRanges(List<FileRange> ranges) {
        this.ranges = ranges;
        return this;
    }

    /**
     * Get the clearRanges property: The ClearRanges property.
     *
     * @return the clearRanges value.
     */
    public List<ClearRange> getClearRanges() {
        return this.clearRanges;
    }

    /**
     * Set the clearRanges property: The ClearRanges property.
     *
     * @param clearRanges the clearRanges value to set.
     * @return the ShareFileRangeList object itself.
     */
    public ShareFileRangeList setClearRanges(List<ClearRange> clearRanges) {
        this.clearRanges = clearRanges;
        return this;
    }
}
