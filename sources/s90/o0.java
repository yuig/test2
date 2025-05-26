package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.s f111997a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f111998b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.l0 f111999c;

    /* renamed from: d, reason: collision with root package name */
    public final d32.c f112000d;

    public o0(sa0.s cutoutEditorVMState, v0 editSource, zy.l0 pinalyticsState, d32.c entryPointSource) {
        Intrinsics.checkNotNullParameter(cutoutEditorVMState, "cutoutEditorVMState");
        Intrinsics.checkNotNullParameter(editSource, "editSource");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        this.f111997a = cutoutEditorVMState;
        this.f111998b = editSource;
        this.f111999c = pinalyticsState;
        this.f112000d = entryPointSource;
    }

    public static o0 b(o0 o0Var, sa0.s cutoutEditorVMState, zy.l0 pinalyticsState, int i13) {
        if ((i13 & 1) != 0) {
            cutoutEditorVMState = o0Var.f111997a;
        }
        v0 editSource = o0Var.f111998b;
        if ((i13 & 4) != 0) {
            pinalyticsState = o0Var.f111999c;
        }
        d32.c entryPointSource = o0Var.f112000d;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(cutoutEditorVMState, "cutoutEditorVMState");
        Intrinsics.checkNotNullParameter(editSource, "editSource");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        return new o0(cutoutEditorVMState, editSource, pinalyticsState, entryPointSource);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.f111997a, o0Var.f111997a) && this.f111998b == o0Var.f111998b && Intrinsics.d(this.f111999c, o0Var.f111999c) && this.f112000d == o0Var.f112000d;
    }

    public final int hashCode() {
        return this.f112000d.hashCode() + jq.b.a(this.f111999c, (this.f111998b.hashCode() + (this.f111997a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "CollageCutoutVMState(cutoutEditorVMState=" + this.f111997a + ", editSource=" + this.f111998b + ", pinalyticsState=" + this.f111999c + ", entryPointSource=" + this.f112000d + ")";
    }
}
