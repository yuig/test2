package com.pinterest.feature.search.visual.flashlight.datasource;

import com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest;
import com.pinterest.hairball.network.d;
import j90.b;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/search/visual/flashlight/datasource/FlashlightRetrofitPagedRemoteRequest;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/RetrofitPagedRemoteRequest;", "j90/b", "kg/p", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FlashlightRetrofitPagedRemoteRequest extends RetrofitPagedRemoteRequest {

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f48043b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48044a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FlashlightRetrofitPagedRemoteRequest(java.util.Map r13, com.pinterest.api.model.ow r14, lk1.a r15, x12.a r16, xt1.d r17, java.util.Map r18, boolean r19) {
        /*
            r12 = this;
            o10.c r3 = o10.c.f92770a
            java.lang.String r0 = "registeredDeserializers"
            r1 = r13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "modelStorage"
            r2 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "modelExtractorProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "pagedListService"
            r5 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "headers"
            r8 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r9 = 0
            r10 = 256(0x100, float:3.59E-43)
            r7 = 0
            r11 = 0
            r0 = r12
            r4 = r15
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = r19
            r0.f48044a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.search.visual.flashlight.datasource.FlashlightRetrofitPagedRemoteRequest.<init>(java.util.Map, com.pinterest.api.model.ow, lk1.a, x12.a, xt1.d, java.util.Map, boolean):void");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest, com.pinterest.hairball.network.e
    public final d getBuilder(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new b(this, Arrays.copyOf(params, params.length));
    }
}
