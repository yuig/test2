package pd1;

import com.pinterest.api.model.deserializer.OnebarmoduleDeserializer;
import com.pinterest.api.model.deserializer.PinDeserializer;
import com.pinterest.repository.pin.PinService;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import o82.k0;

/* loaded from: classes5.dex */
public final class e implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final PinService f99809a;

    /* renamed from: b, reason: collision with root package name */
    public final PinDeserializer f99810b;

    /* renamed from: c, reason: collision with root package name */
    public final OnebarmoduleDeserializer f99811c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f99812d;

    public e(PinService pinService, PinDeserializer pinDeserializer, OnebarmoduleDeserializer onebarmoduleDeserializer) {
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        Intrinsics.checkNotNullParameter(onebarmoduleDeserializer, "onebarmoduleDeserializer");
        this.f99809a = pinService;
        this.f99810b = pinDeserializer;
        this.f99811c = onebarmoduleDeserializer;
        this.f99812d = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // o82.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r20, java.lang.String r21, java.lang.Object r22, o82.d2 r23, bl2.c r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            r2 = r24
            boolean r3 = r2 instanceof pd1.d
            if (r3 == 0) goto L1a
            r3 = r2
            pd1.d r3 = (pd1.d) r3
            int r4 = r3.f99808u
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.f99808u = r4
        L18:
            r9 = r3
            goto L20
        L1a:
            pd1.d r3 = new pd1.d
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r9.f99806s
            cl2.a r3 = cl2.a.COROUTINE_SUSPENDED
            int r4 = r9.f99808u
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            pd1.e r1 = r9.f99805r
            ue.c.H(r2)
            goto Lc0
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            ue.c.H(r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.pinterest.feature.shopping.closeup.stllandingpage.data.STLLandingPageLoaderArgs"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            pd1.f r1 = (pd1.f) r1
            n00.c r2 = n00.c.UNIFIED_FLASHLIGHT_SHOPPING_FIELDS
            java.lang.String r8 = n00.b.a(r2)
            java.lang.Boolean r2 = r1.f99814b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            kotlin.Pair r10 = new kotlin.Pair
            java.lang.String r4 = "is_shopping"
            r10.<init>(r4, r2)
            kotlin.Pair r11 = new kotlin.Pair
            java.lang.String r2 = "entry_source"
            java.lang.String r4 = r1.f99815c
            r11.<init>(r2, r4)
            kotlin.Pair r12 = new kotlin.Pair
            java.lang.String r2 = "entrypoint"
            java.lang.String r4 = r1.f99816d
            r12.<init>(r2, r4)
            kotlin.Pair r13 = new kotlin.Pair
            java.lang.String r2 = "crop_source"
            java.lang.String r4 = r1.f99817e
            r13.<init>(r2, r4)
            kotlin.Pair r14 = new kotlin.Pair
            java.lang.String r2 = "request_params"
            java.lang.String r4 = r1.f99818f
            r14.<init>(r2, r4)
            kotlin.Pair r15 = new kotlin.Pair
            java.lang.String r2 = "x"
            java.lang.String r4 = r1.f99819g
            r15.<init>(r2, r4)
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r4 = "y"
            java.lang.String r6 = r1.f99820h
            r2.<init>(r4, r6)
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r6 = "w"
            java.lang.String r7 = r1.f99821i
            r4.<init>(r6, r7)
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r7 = "h"
            java.lang.String r5 = r1.f99822j
            r6.<init>(r7, r5)
            r16 = r2
            r17 = r4
            r18 = r6
            kotlin.Pair[] r2 = new kotlin.Pair[]{r10, r11, r12, r13, r14, r15, r16, r17, r18}
            java.util.Map r7 = kotlin.collections.z0.g(r2)
            r9.f99805r = r0
            r2 = 1
            r9.f99808u = r2
            com.pinterest.repository.pin.PinService r4 = r0.f99809a
            java.lang.String r5 = r1.f99813a
            r6 = r21
            java.lang.Object r2 = r4.loadUnifiedFeedModule(r5, r6, r7, r8, r9)
            if (r2 != r3) goto Lbf
            return r3
        Lbf:
            r1 = r0
        Lc0:
            com.pinterest.api.adapter.coroutine.NetworkResponse r2 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r2
            kc1.w r3 = new kc1.w
            r4 = 18
            r3.<init>(r1, r4)
            com.pinterest.api.adapter.coroutine.NetworkResponse r1 = kh2.k3.y1(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pd1.e.a(int, java.lang.String, java.lang.Object, o82.d2, bl2.c):java.lang.Object");
    }
}
