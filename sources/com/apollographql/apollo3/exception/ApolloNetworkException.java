package com.apollographql.apollo3.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloNetworkException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "apollo-api"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ApolloNetworkException extends ApolloException {

    /* renamed from: a, reason: collision with root package name */
    public final Object f29068a;

    public ApolloNetworkException() {
        this((String) null, 3);
    }

    public /* synthetic */ ApolloNetworkException(String str, int i13) {
        this((Object) null, (i13 & 1) != 0 ? null : str);
    }

    public ApolloNetworkException(Object obj, String str) {
        super(str, obj instanceof Throwable ? (Throwable) obj : null);
        this.f29068a = obj;
    }
}
