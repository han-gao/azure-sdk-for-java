// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the listQueuesSegmentNext operation. */
public final class ServicesListQueuesSegmentNextResponse
        extends ResponseBase<ServicesListQueuesSegmentNextHeaders, ListQueuesSegmentResponse> {
    /**
     * Creates an instance of ServicesListQueuesSegmentNextResponse.
     *
     * @param request the request which resulted in this ServicesListQueuesSegmentNextResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ServicesListQueuesSegmentNextResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            ListQueuesSegmentResponse value,
            ServicesListQueuesSegmentNextHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public ListQueuesSegmentResponse getValue() {
        return super.getValue();
    }
}
