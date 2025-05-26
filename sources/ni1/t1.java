package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t1 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final si1.a f90801a;

    /* renamed from: b, reason: collision with root package name */
    public final si1.a f90802b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90803c;

    /* renamed from: d, reason: collision with root package name */
    public final int f90804d;

    /* renamed from: e, reason: collision with root package name */
    public final int f90805e;

    public t1(si1.a globalVisiblePinRect, si1.a pinDrawableRect, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(globalVisiblePinRect, "globalVisiblePinRect");
        Intrinsics.checkNotNullParameter(pinDrawableRect, "pinDrawableRect");
        this.f90801a = globalVisiblePinRect;
        this.f90802b = pinDrawableRect;
        this.f90803c = i13;
        this.f90804d = i14;
        this.f90805e = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return Intrinsics.d(this.f90801a, t1Var.f90801a) && Intrinsics.d(this.f90802b, t1Var.f90802b) && this.f90803c == t1Var.f90803c && this.f90804d == t1Var.f90804d && this.f90805e == t1Var.f90805e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90805e) + ep.b.b(this.f90804d, ep.b.b(this.f90803c, (this.f90802b.hashCode() + (this.f90801a.hashCode() * 31)) * 31, 31), 31);
    }

    public final si1.a j() {
        return this.f90801a;
    }

    public final int k() {
        return this.f90805e;
    }

    public final si1.a l() {
        return this.f90802b;
    }

    public final int m() {
        return this.f90804d;
    }

    public final int n() {
        return this.f90803c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShowContextMenuEvent(globalVisiblePinRect=");
        sb3.append(this.f90801a);
        sb3.append(", pinDrawableRect=");
        sb3.append(this.f90802b);
        sb3.append(", rootViewWidth=");
        sb3.append(this.f90803c);
        sb3.append(", pinRepViewHeight=");
        sb3.append(this.f90804d);
        sb3.append(", gridTop=");
        return a.a.n(sb3, this.f90805e, ")");
    }
}
