package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vn0 implements a.q4 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f12573a;

    public vn0(Map handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.f12573a = handlers;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(a.ce r10, bl2.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.un0
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.un0 r0 = (ads_mobile_sdk.un0) r0
            int r1 = r0.f12129e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12129e = r1
            goto L18
        L13:
            ads_mobile_sdk.un0 r0 = new ads_mobile_sdk.un0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f12127c
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12129e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Iterator r10 = r0.f12126b
            a.ce r2 = r0.f12125a
            ue.c.H(r11)
            goto L42
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            ue.c.H(r11)
            java.util.Map r11 = r9.f12573a
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r2 = r10
            r10 = r11
        L42:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L76
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r4 = r11.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r11 = r11.getValue()
            a.cd r11 = (a.cd) r11
            ok.e0 r5 = ads_mobile_sdk.gk0.f5596a
            java.lang.String r5 = r11.d()
            java.lang.String r6 = "Installing gmsg handler for ["
            java.lang.String r7 = "] adKey: ["
            java.lang.String r8 = "]"
            a.c.u(r6, r4, r7, r5, r8)
            r0.f12125a = r2
            r0.f12126b = r10
            r0.f12129e = r3
            java.lang.Object r11 = r2.a(r4, r11, r0)
            if (r11 != r1) goto L42
            return r1
        L76:
            kotlin.Unit r10 = kotlin.Unit.f80348a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.vn0.a(a.ce, bl2.c):java.lang.Object");
    }

    @Override // a.q4
    public final /* bridge */ /* synthetic */ Object a(Object obj, w31 w31Var) {
        return a((a.ce) obj, (bl2.c) w31Var);
    }
}
