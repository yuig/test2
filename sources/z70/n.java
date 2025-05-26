package z70;

import h32.f1;
import h32.w0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.s0;
import nx.d0;
import nx.z0;

/* loaded from: classes5.dex */
public final class n extends uk1.d {

    /* renamed from: g, reason: collision with root package name */
    public final String f141011g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f141012h;

    /* renamed from: i, reason: collision with root package name */
    public final String f141013i;

    /* renamed from: j, reason: collision with root package name */
    public final z0 f141014j;

    /* renamed from: k, reason: collision with root package name */
    public final bz.d f141015k;

    /* renamed from: l, reason: collision with root package name */
    public final s0 f141016l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(nx.f0 r5, java.lang.String r6, boolean r7, java.lang.String r8, nx.z0 r9, bz.d r10, lh0.s0 r11) {
        /*
            r4 = this;
            java.lang.String r0 = "pinalyticsFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "pinId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "offPinterestTimeSpentManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "experiments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            e3.a r0 = new e3.a
            r1 = 5
            r0.<init>(r1)
            h32.d4 r1 = h32.d4.BROWSER
            h32.a4 r2 = h32.a4.BROWSER
            r3 = 0
            r0.p(r1, r2, r3, r3)
            kotlin.Unit r1 = kotlin.Unit.f80348a
            r4.<init>(r6, r0, r5)
            r4.f141011g = r6
            r4.f141012h = r7
            r4.f141013i = r8
            r4.f141014j = r9
            r4.f141015k = r10
            r4.f141016l = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z70.n.<init>(nx.f0, java.lang.String, boolean, java.lang.String, nx.z0, bz.d, lh0.s0):void");
    }

    @Override // uk1.d, nx.i1
    public final w0 e() {
        kotlin.collections.z0.d();
        return new w0(null, null, null, null, kotlin.collections.z0.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, this.f141013i, null, null, null, null);
    }

    public final HashMap l() {
        z0 z0Var = this.f141014j;
        return z0Var == null ? new HashMap() : new HashMap(z0Var);
    }

    public final void m(String str) {
        d0 d0Var = this.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        f1 f1Var = f1.URL_LOAD_ERROR;
        String str2 = this.f122380b;
        HashMap l13 = l();
        l13.put("url", str);
        l13.put("status_code", String.valueOf(0));
        l13.put("is_promoted_pin", String.valueOf(this.f141012h));
        Unit unit = Unit.f80348a;
        d0Var.g(f1Var, str2, l13, false);
    }

    @Override // uk1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap f63135d0 = super.getF63135d0();
        if (f63135d0 == null) {
            f63135d0 = new LinkedHashMap();
        }
        z0 z0Var = this.f141014j;
        if (z0Var != null) {
            f63135d0.putAll(z0Var);
        }
        f63135d0.put("pin_id", this.f141011g);
        return f63135d0;
    }
}
