package dy0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f56556a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56557b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.i0 f56558c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.i0 f56559d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.w f56560e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.a0 f56561f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(boolean r9, int r10) {
        /*
            r8 = this;
            r0 = 1
            r10 = r10 & r0
            if (r10 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r9
        L7:
            int r9 = jv1.h.nux_end_header_1
            r10 = 0
            java.lang.String[] r0 = new java.lang.String[r10]
            java.lang.String r1 = "formatArgs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r10)
            u50.k0 r4 = new u50.k0
            r4.<init>(r9, r0)
            int r9 = jv1.h.nux_end_header_2
            java.lang.String[] r0 = new java.lang.String[r10]
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r10)
            u50.k0 r5 = new u50.k0
            r5.<init>(r9, r0)
            xk2.w r6 = new xk2.w
            kc0.a r9 = new kc0.a
            r10 = 0
            r0 = 7
            r9.<init>(r10, r10, r0)
            kc0.a r1 = new kc0.a
            r1.<init>(r10, r10, r0)
            kc0.a r3 = new kc0.a
            r3.<init>(r10, r10, r0)
            r6.<init>(r9, r1, r3)
            zy.a0 r7 = new zy.a0
            r7.<init>()
            r3 = 5000(0x1388, float:7.006E-42)
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dy0.e.<init>(boolean, int):void");
    }

    public static e e(e eVar, xk2.w wVar, zy.a0 a0Var, int i13) {
        boolean z13 = (i13 & 1) != 0 ? eVar.f56556a : false;
        int i14 = eVar.f56557b;
        u50.i0 startHeaderText = eVar.f56558c;
        u50.i0 endHeaderText = eVar.f56559d;
        if ((i13 & 16) != 0) {
            wVar = eVar.f56560e;
        }
        xk2.w animatedPins = wVar;
        if ((i13 & 32) != 0) {
            a0Var = eVar.f56561f;
        }
        zy.a0 pinalyticsDisplayState = a0Var;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(startHeaderText, "startHeaderText");
        Intrinsics.checkNotNullParameter(endHeaderText, "endHeaderText");
        Intrinsics.checkNotNullParameter(animatedPins, "animatedPins");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        return new e(z13, i14, startHeaderText, endHeaderText, animatedPins, pinalyticsDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f56556a == eVar.f56556a && this.f56557b == eVar.f56557b && Intrinsics.d(this.f56558c, eVar.f56558c) && Intrinsics.d(this.f56559d, eVar.f56559d) && Intrinsics.d(this.f56560e, eVar.f56560e) && Intrinsics.d(this.f56561f, eVar.f56561f);
    }

    public final int hashCode() {
        return this.f56561f.hashCode() + ((this.f56560e.hashCode() + ep.b.d(this.f56559d, ep.b.d(this.f56558c, ep.b.b(this.f56557b, Boolean.hashCode(this.f56556a) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "NuxEndDisplayState(isLoading=" + this.f56556a + ", loadingTimeMillis=" + this.f56557b + ", startHeaderText=" + this.f56558c + ", endHeaderText=" + this.f56559d + ", animatedPins=" + this.f56560e + ", pinalyticsDisplayState=" + this.f56561f + ")";
    }

    public e(boolean z13, int i13, u50.i0 startHeaderText, u50.i0 endHeaderText, xk2.w animatedPins, zy.a0 pinalyticsDisplayState) {
        Intrinsics.checkNotNullParameter(startHeaderText, "startHeaderText");
        Intrinsics.checkNotNullParameter(endHeaderText, "endHeaderText");
        Intrinsics.checkNotNullParameter(animatedPins, "animatedPins");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f56556a = z13;
        this.f56557b = i13;
        this.f56558c = startHeaderText;
        this.f56559d = endHeaderText;
        this.f56560e = animatedPins;
        this.f56561f = pinalyticsDisplayState;
    }
}
