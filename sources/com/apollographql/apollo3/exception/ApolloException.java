package com.apollographql.apollo3.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "apollo-api"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class ApolloException extends RuntimeException {
    public ApolloException() {
        this(null, 3);
    }

    public ApolloException(String str, int i13) {
        super((i13 & 1) != 0 ? null : str, null);
    }
}
