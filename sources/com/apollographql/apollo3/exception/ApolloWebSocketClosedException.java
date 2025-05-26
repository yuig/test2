package com.apollographql.apollo3.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloWebSocketClosedException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "apollo-api"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ApolloWebSocketClosedException extends ApolloException {

    /* renamed from: a, reason: collision with root package name */
    public final int f29069a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29070b;

    public ApolloWebSocketClosedException(int i13, String str) {
        super("WebSocket Closed code='" + i13 + "' reason='" + str + '\'', (Throwable) null);
        this.f29069a = i13;
        this.f29070b = str;
    }

    /* renamed from: a, reason: from getter */
    public final int getF29069a() {
        return this.f29069a;
    }
}
