package com.pinterest.framework.multisection.datasource.pagedlist;

import a.k1;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public class o0 extends com.pinterest.hairball.network.d {
    final /* synthetic */ RetrofitPagedRemoteRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(RetrofitPagedRemoteRequest retrofitPagedRemoteRequest, Object... params) {
        super(retrofitPagedRemoteRequest, Arrays.copyOf(params, params.length));
        Intrinsics.checkNotNullParameter(params, "params");
        this.this$0 = retrofitPagedRemoteRequest;
    }

    @Override // com.pinterest.hairball.network.c
    @NotNull
    public uj2.b0<i0> buildRequest() {
        kk2.k kVar = new kk2.k(new k1(this, 20), 1);
        RetrofitPagedRemoteRequest retrofitPagedRemoteRequest = this.this$0;
        kk2.g gVar = new kk2.g(new kk2.g(new kk2.m(kVar, new h(2, new oh1.u(24, retrofitPagedRemoteRequest, this)), 0).k(new h(3, new n0(retrofitPagedRemoteRequest, 0))), new wk1.l(25, new n0(this.this$0, 1)), 0), new wk1.l(26, a.f49080w), 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
        return gVar;
    }
}
