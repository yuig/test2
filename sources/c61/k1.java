package c61;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26596a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26597b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.l0 f26598c;

    /* renamed from: d, reason: collision with root package name */
    public final o82.j0 f26599d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26600e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26601f;

    public k1(String returningSearchType, boolean z13, zy.l0 pinalyticsVMState, o82.j0 multiSectionVMState, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(returningSearchType, "returningSearchType");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        this.f26596a = returningSearchType;
        this.f26597b = z13;
        this.f26598c = pinalyticsVMState;
        this.f26599d = multiSectionVMState;
        this.f26600e = z14;
        this.f26601f = z15;
    }

    public static k1 b(k1 k1Var, zy.l0 l0Var, o82.j0 j0Var, boolean z13, int i13) {
        String returningSearchType = k1Var.f26596a;
        boolean z14 = k1Var.f26597b;
        if ((i13 & 4) != 0) {
            l0Var = k1Var.f26598c;
        }
        zy.l0 pinalyticsVMState = l0Var;
        if ((i13 & 8) != 0) {
            j0Var = k1Var.f26599d;
        }
        o82.j0 multiSectionVMState = j0Var;
        if ((i13 & 16) != 0) {
            z13 = k1Var.f26600e;
        }
        boolean z15 = k1Var.f26601f;
        k1Var.getClass();
        Intrinsics.checkNotNullParameter(returningSearchType, "returningSearchType");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        return new k1(returningSearchType, z14, pinalyticsVMState, multiSectionVMState, z13, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Intrinsics.d(this.f26596a, k1Var.f26596a) && this.f26597b == k1Var.f26597b && Intrinsics.d(this.f26598c, k1Var.f26598c) && Intrinsics.d(this.f26599d, k1Var.f26599d) && this.f26600e == k1Var.f26600e && this.f26601f == k1Var.f26601f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26601f) + ep.b.e(this.f26600e, ep.b.c(this.f26599d.f93634a, jq.b.a(this.f26598c, ep.b.e(this.f26597b, this.f26596a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SearchLandingVMState(returningSearchType=");
        sb3.append(this.f26596a);
        sb3.append(", shouldMockModules=");
        sb3.append(this.f26597b);
        sb3.append(", pinalyticsVMState=");
        sb3.append(this.f26598c);
        sb3.append(", multiSectionVMState=");
        sb3.append(this.f26599d);
        sb3.append(", isInitialRenderCompleted=");
        sb3.append(this.f26600e);
        sb3.append(", isSearchLandingExperiencePwtFixEnabled=");
        return a.a.r(sb3, this.f26601f, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ k1(boolean r9, zy.l0 r10, boolean r11, int r12) {
        /*
            r8 = this;
            r0 = 2
            r12 = r12 & r0
            if (r12 == 0) goto L5
            r9 = 0
        L5:
            r3 = r9
            o82.j0 r5 = new o82.j0
            o82.i2 r9 = new o82.i2
            c61.o0 r12 = new c61.o0
            r12.<init>(r3)
            r9.<init>(r12, r0)
            java.util.List r9 = kotlin.collections.e0.b(r9)
            r5.<init>(r9)
            r6 = 0
            java.lang.String r2 = ""
            r1 = r8
            r4 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.k1.<init>(boolean, zy.l0, boolean, int):void");
    }
}
