package com.apollographql.apollo3.exception;

import kotlin.Metadata;
import xk2.f;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloCompositeException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "apollo-api"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ApolloCompositeException extends ApolloException {
    public ApolloCompositeException(Throwable th3, Throwable th4) {
        super("multiple exceptions happened", th4);
        if (th3 != null) {
            f.a(this, th3);
        }
        if (th4 != null) {
            f.a(this, th4);
        }
    }
}
