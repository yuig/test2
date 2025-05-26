package h31;

import com.pinterest.repository.pin.PinService;
import kotlin.jvm.internal.Intrinsics;
import o82.k0;

/* loaded from: classes5.dex */
public final class c implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final PinService f66806a;

    public c(PinService pinService) {
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        this.f66806a = pinService;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // o82.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r7, java.lang.String r8, java.lang.Object r9, o82.d2 r10, bl2.c r11) {
        /*
            r6 = this;
            boolean r10 = r11 instanceof h31.b
            if (r10 == 0) goto L14
            r10 = r11
            h31.b r10 = (h31.b) r10
            int r0 = r10.f66805u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L14
            int r0 = r0 - r1
            r10.f66805u = r0
        L12:
            r5 = r10
            goto L1a
        L14:
            h31.b r10 = new h31.b
            r10.<init>(r6, r11)
            goto L12
        L1a:
            java.lang.Object r10 = r5.f66803s
            cl2.a r11 = cl2.a.COROUTINE_SUSPENDED
            int r0 = r5.f66805u
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            boolean r7 = r5.f66802r
            ue.c.H(r10)
            goto L59
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ue.c.H(r10)
            java.lang.String r10 = "null cannot be cast to non-null type com.pinterest.feature.profile.allpins.userpins.UserPinsPageLoader.LoadingArgs"
            kotlin.jvm.internal.Intrinsics.g(r9, r10)
            h31.a r9 = (h31.a) r9
            n00.c r10 = n00.c.PROFILE_ALL_PINS_FIELDS
            java.lang.String r2 = n00.b.a(r10)
            java.lang.String r3 = java.lang.String.valueOf(r7)
            boolean r7 = r9.f66801b
            r5.f66802r = r7
            r5.f66805u = r1
            com.pinterest.repository.pin.PinService r0 = r6.f66806a
            java.lang.String r1 = r9.f66800a
            r4 = r8
            java.lang.Object r10 = r0.getUserPins(r1, r2, r3, r4, r5)
            if (r10 != r11) goto L59
            return r11
        L59:
            com.pinterest.api.adapter.coroutine.NetworkResponse r10 = (com.pinterest.api.adapter.coroutine.NetworkResponse) r10
            dv0.n r8 = new dv0.n
            r9 = 29
            r8.<init>(r7, r9)
            com.pinterest.api.adapter.coroutine.NetworkResponse r7 = kh2.k3.y1(r10, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h31.c.a(int, java.lang.String, java.lang.Object, o82.d2, bl2.c):java.lang.Object");
    }
}
