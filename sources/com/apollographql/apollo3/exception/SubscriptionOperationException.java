package com.apollographql.apollo3.exception;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo3/exception/SubscriptionOperationException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "apollo-api"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class SubscriptionOperationException extends ApolloException {

    /* renamed from: a, reason: collision with root package name */
    public final Object f29071a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionOperationException(Map map, String operationName) {
        super("Operation error " + operationName, 2);
        Intrinsics.checkNotNullParameter(operationName, "operationName");
        this.f29071a = map;
    }
}
