package com.pinterest.error;

import is1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v.f1;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/error/NetworkResponseError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lis1/n;", "networking_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class NetworkResponseError extends Exception implements n {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f45043a;

    public NetworkResponseError() {
        this((f1) null);
    }

    public NetworkResponseError(f1 f1Var) {
        this.f45043a = f1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkResponseError(Object obj) {
        super("Failure to extract a Conversation Response from a successful request");
        Intrinsics.checkNotNullParameter("Failure to extract a Conversation Response from a successful request", "exceptionMessage");
        this.f45043a = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkResponseError(Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f45043a = null;
    }
}
