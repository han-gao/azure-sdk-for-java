/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2020_12_01.ExtendedSqlPoolBlobAuditingPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2020_12_01.ExtendedSqlPoolBlobAuditingPolicy;

class ExtendedSqlPoolBlobAuditingPoliciesImpl extends WrapperImpl<ExtendedSqlPoolBlobAuditingPoliciesInner> implements ExtendedSqlPoolBlobAuditingPolicies {
    private final SynapseManager manager;

    ExtendedSqlPoolBlobAuditingPoliciesImpl(SynapseManager manager) {
        super(manager.inner().extendedSqlPoolBlobAuditingPolicies());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public ExtendedSqlPoolBlobAuditingPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private ExtendedSqlPoolBlobAuditingPolicyImpl wrapModel(ExtendedSqlPoolBlobAuditingPolicyInner inner) {
        return  new ExtendedSqlPoolBlobAuditingPolicyImpl(inner, manager());
    }

    private ExtendedSqlPoolBlobAuditingPolicyImpl wrapModel(String name) {
        return new ExtendedSqlPoolBlobAuditingPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<ExtendedSqlPoolBlobAuditingPolicy> listBySqlPoolAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        ExtendedSqlPoolBlobAuditingPoliciesInner client = this.inner();
        return client.listBySqlPoolAsync(resourceGroupName, workspaceName, sqlPoolName)
        .flatMapIterable(new Func1<Page<ExtendedSqlPoolBlobAuditingPolicyInner>, Iterable<ExtendedSqlPoolBlobAuditingPolicyInner>>() {
            @Override
            public Iterable<ExtendedSqlPoolBlobAuditingPolicyInner> call(Page<ExtendedSqlPoolBlobAuditingPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ExtendedSqlPoolBlobAuditingPolicyInner, ExtendedSqlPoolBlobAuditingPolicy>() {
            @Override
            public ExtendedSqlPoolBlobAuditingPolicy call(ExtendedSqlPoolBlobAuditingPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ExtendedSqlPoolBlobAuditingPolicy> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        ExtendedSqlPoolBlobAuditingPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, sqlPoolName)
        .flatMap(new Func1<ExtendedSqlPoolBlobAuditingPolicyInner, Observable<ExtendedSqlPoolBlobAuditingPolicy>>() {
            @Override
            public Observable<ExtendedSqlPoolBlobAuditingPolicy> call(ExtendedSqlPoolBlobAuditingPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ExtendedSqlPoolBlobAuditingPolicy)wrapModel(inner));
                }
            }
       });
    }

}
