package a41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 {

    /* renamed from: f, reason: collision with root package name */
    public static final m0 f631f;

    /* renamed from: a, reason: collision with root package name */
    public final f0 f632a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f633b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f634c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f635d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f636e;

    static {
        f0 f0Var = f0.f588f;
        f631f = new m0(f0Var, f0Var, f0Var, e0.f584d, false);
    }

    public m0(f0 leftIcon, f0 centerRightIcon, f0 rightIcon, e0 rightButton, boolean z13) {
        Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
        Intrinsics.checkNotNullParameter(centerRightIcon, "centerRightIcon");
        Intrinsics.checkNotNullParameter(rightIcon, "rightIcon");
        Intrinsics.checkNotNullParameter(rightButton, "rightButton");
        this.f632a = leftIcon;
        this.f633b = centerRightIcon;
        this.f634c = rightIcon;
        this.f635d = rightButton;
        this.f636e = z13;
    }

    public final f0 a() {
        return this.f633b;
    }

    public final f0 b() {
        return this.f632a;
    }

    public final e0 c() {
        return this.f635d;
    }

    public final f0 d() {
        return this.f634c;
    }

    public final boolean e() {
        return this.f636e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.f632a, m0Var.f632a) && Intrinsics.d(this.f633b, m0Var.f633b) && Intrinsics.d(this.f634c, m0Var.f634c) && Intrinsics.d(this.f635d, m0Var.f635d) && this.f636e == m0Var.f636e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f636e) + ((this.f635d.hashCode() + ((this.f634c.hashCode() + ((this.f633b.hashCode() + (this.f632a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProfileActionsToolbarState(leftIcon=");
        sb3.append(this.f632a);
        sb3.append(", centerRightIcon=");
        sb3.append(this.f633b);
        sb3.append(", rightIcon=");
        sb3.append(this.f634c);
        sb3.append(", rightButton=");
        sb3.append(this.f635d);
        sb3.append(", isOverlayVisible=");
        return a.a.r(sb3, this.f636e, ")");
    }
}
