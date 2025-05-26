package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f112023a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f112024b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f112025c;

    public /* synthetic */ t0(int i13, int i14) {
        this((i14 & 1) != 0 ? d1.collage_cutout_save_button : i13, new s0(false, false), new s0(false, false));
    }

    public static t0 e(t0 t0Var, s0 undoState, s0 redoState) {
        int i13 = t0Var.f112023a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(undoState, "undoState");
        Intrinsics.checkNotNullParameter(redoState, "redoState");
        return new t0(i13, undoState, redoState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f112023a == t0Var.f112023a && Intrinsics.d(this.f112024b, t0Var.f112024b) && Intrinsics.d(this.f112025c, t0Var.f112025c);
    }

    public final int hashCode() {
        return this.f112025c.hashCode() + ((this.f112024b.hashCode() + (Integer.hashCode(this.f112023a) * 31)) * 31);
    }

    public final String toString() {
        return "CutoutToolbarState(labelResId=" + this.f112023a + ", undoState=" + this.f112024b + ", redoState=" + this.f112025c + ")";
    }

    public t0(int i13, s0 undoState, s0 redoState) {
        Intrinsics.checkNotNullParameter(undoState, "undoState");
        Intrinsics.checkNotNullParameter(redoState, "redoState");
        this.f112023a = i13;
        this.f112024b = undoState;
        this.f112025c = redoState;
    }
}
