package i01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f70660a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70661b;

    public g1(int i13, int i14) {
        this.f70660a = i13;
        this.f70661b = i14;
    }

    public static g1 a(g1 g1Var, int i13, int i14, int i15) {
        if ((i15 & 1) != 0) {
            i13 = g1Var.f70660a;
        }
        if ((i15 & 2) != 0) {
            i14 = g1Var.f70661b;
        }
        g1Var.getClass();
        return new g1(i13, i14);
    }

    public final int b() {
        return this.f70660a;
    }

    public final int c() {
        return this.f70661b;
    }

    public final f d(sq0.f0 dataSourceProvider) {
        com.pinterest.framework.multisection.datasource.pagedlist.f fVar;
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        sq0.o r13 = dataSourceProvider.r(this.f70660a);
        sq0.o r14 = dataSourceProvider.r(this.f70661b);
        if (r13 == null || r14 == null) {
            return f.Unknown;
        }
        sq0.e0 e0Var = r13.f115027a;
        boolean z13 = ((vq0.e) e0Var) instanceof com.pinterest.feature.pin.closeup.datasource.l;
        sq0.e0 e0Var2 = r14.f115027a;
        boolean z14 = ((vq0.e) e0Var2) instanceof com.pinterest.feature.pin.closeup.datasource.l;
        if (!z13 && !z14) {
            return f.FullscreenCloseup;
        }
        int i13 = 0;
        if (!z13 && z14) {
            fVar = e0Var2 instanceof com.pinterest.framework.multisection.datasource.pagedlist.f ? (com.pinterest.framework.multisection.datasource.pagedlist.f) e0Var2 : null;
            if (fVar != null && fVar.f49196g) {
                i13 = fVar.f49193d.size();
            }
            return r14.f115028b < i13 ? f.FullscreenCloseup : f.Mixed;
        }
        if (!z13 || !z14) {
            return f.Unknown;
        }
        fVar = e0Var instanceof com.pinterest.framework.multisection.datasource.pagedlist.f ? (com.pinterest.framework.multisection.datasource.pagedlist.f) e0Var : null;
        if (fVar != null && fVar.f49196g) {
            i13 = fVar.f49193d.size();
        }
        return r13.f115028b < i13 ? f.Mixed : f.FullscreenRelatedPins;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f70660a == g1Var.f70660a && this.f70661b == g1Var.f70661b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70661b) + (Integer.hashCode(this.f70660a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VisibleItems(firstVisibleItem=");
        sb3.append(this.f70660a);
        sb3.append(", lastVisibleItem=");
        return a.a.n(sb3, this.f70661b, ")");
    }
}
