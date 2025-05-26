package v90;

import com.pinterest.shuffles.core.ui.model.CutoutModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.b0 f124925a;

    /* renamed from: b, reason: collision with root package name */
    public final s90.v0 f124926b;

    /* renamed from: c, reason: collision with root package name */
    public final d32.c f124927c;

    /* renamed from: d, reason: collision with root package name */
    public final r72.i1 f124928d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.l0 f124929e;

    /* renamed from: f, reason: collision with root package name */
    public final CutoutModel f124930f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f124931g;

    public k1(sa0.b0 source, s90.v0 editSource, d32.c entryPointSource, r72.i1 i1Var, zy.l0 pinalyticsState, CutoutModel cutoutModel, boolean z13) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(editSource, "editSource");
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f124925a = source;
        this.f124926b = editSource;
        this.f124927c = entryPointSource;
        this.f124928d = i1Var;
        this.f124929e = pinalyticsState;
        this.f124930f = cutoutModel;
        this.f124931g = z13;
    }

    public static k1 b(k1 k1Var, zy.l0 l0Var, CutoutModel cutoutModel, boolean z13, int i13) {
        sa0.b0 source = k1Var.f124925a;
        s90.v0 editSource = k1Var.f124926b;
        d32.c entryPointSource = k1Var.f124927c;
        r72.i1 i1Var = k1Var.f124928d;
        if ((i13 & 16) != 0) {
            l0Var = k1Var.f124929e;
        }
        zy.l0 pinalyticsState = l0Var;
        if ((i13 & 32) != 0) {
            cutoutModel = k1Var.f124930f;
        }
        CutoutModel cutoutModel2 = cutoutModel;
        if ((i13 & 64) != 0) {
            z13 = k1Var.f124931g;
        }
        k1Var.getClass();
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(editSource, "editSource");
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new k1(source, editSource, entryPointSource, i1Var, pinalyticsState, cutoutModel2, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Intrinsics.d(this.f124925a, k1Var.f124925a) && this.f124926b == k1Var.f124926b && this.f124927c == k1Var.f124927c && Intrinsics.d(this.f124928d, k1Var.f124928d) && Intrinsics.d(this.f124929e, k1Var.f124929e) && Intrinsics.d(this.f124930f, k1Var.f124930f) && this.f124931g == k1Var.f124931g;
    }

    public final int hashCode() {
        int hashCode = (this.f124927c.hashCode() + ((this.f124926b.hashCode() + (this.f124925a.hashCode() * 31)) * 31)) * 31;
        r72.i1 i1Var = this.f124928d;
        int a13 = jq.b.a(this.f124929e, (hashCode + (i1Var == null ? 0 : i1Var.hashCode())) * 31, 31);
        CutoutModel cutoutModel = this.f124930f;
        return Boolean.hashCode(this.f124931g) + ((a13 + (cutoutModel != null ? cutoutModel.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageCutoutVMStateV2(source=");
        sb3.append(this.f124925a);
        sb3.append(", editSource=");
        sb3.append(this.f124926b);
        sb3.append(", entryPointSource=");
        sb3.append(this.f124927c);
        sb3.append(", initialMask=");
        sb3.append(this.f124928d);
        sb3.append(", pinalyticsState=");
        sb3.append(this.f124929e);
        sb3.append(", lastCutoutModel=");
        sb3.append(this.f124930f);
        sb3.append(", hasMadeSelectChanges=");
        return a.a.r(sb3, this.f124931g, ")");
    }
}
