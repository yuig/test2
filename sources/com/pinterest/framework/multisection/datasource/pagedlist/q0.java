package com.pinterest.framework.multisection.datasource.pagedlist;

import com.pinterest.repository.TypedId;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RetrofitPagedRemoteRequest f49157a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(RetrofitPagedRemoteRequest retrofitPagedRemoteRequest, Object... params) {
        super(retrofitPagedRemoteRequest, Arrays.copyOf(params, params.length));
        Intrinsics.checkNotNullParameter(params, "params");
        this.f49157a = retrofitPagedRemoteRequest;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.o0, com.pinterest.hairball.network.c
    public final uj2.b0 buildRequest() {
        Object obj = getParams()[2];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<com.pinterest.repository.TypedId>");
        TypedId[] typedIdArr = (TypedId[]) obj;
        Object obj2 = getParams()[5];
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null) {
            str = "";
        }
        kk2.t l13 = new kk2.m(new kk2.b(new uv0.a(13, typedIdArr, this.f49157a), 0), new h(4, new oh1.u(25, typedIdArr, str)), 0).l(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(l13, "observeOn(...)");
        return l13;
    }
}
