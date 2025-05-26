package com.apollographql.apollo3.exception;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wo2.l;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloHttpException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "apollo-api"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ApolloHttpException extends ApolloException {

    /* renamed from: a, reason: collision with root package name */
    public final int f29065a;

    /* renamed from: b, reason: collision with root package name */
    public final List f29066b;

    /* renamed from: c, reason: collision with root package name */
    public final l f29067c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloHttpException(int i13, List headers, l lVar, String message) {
        super(message, (Throwable) null);
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f29065a = i13;
        this.f29066b = headers;
        this.f29067c = lVar;
    }

    /* renamed from: a, reason: from getter */
    public final int getF29065a() {
        return this.f29065a;
    }
}
