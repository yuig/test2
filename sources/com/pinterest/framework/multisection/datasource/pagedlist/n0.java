package com.pinterest.framework.multisection.datasource.pagedlist;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f49150i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ RetrofitPagedRemoteRequest f49151j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(RetrofitPagedRemoteRequest retrofitPagedRemoteRequest, int i13) {
        super(1);
        this.f49150i = i13;
        this.f49151j = retrofitPagedRemoteRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f49150i;
        RetrofitPagedRemoteRequest retrofitPagedRemoteRequest = this.f49151j;
        switch (i13) {
            case 0:
                vd0.c it = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return retrofitPagedRemoteRequest.parseResponse(it);
            default:
                i0 i0Var = (i0) obj;
                Intrinsics.f(i0Var);
                retrofitPagedRemoteRequest.postParseResponse(i0Var);
                return Unit.f80348a;
        }
    }
}
