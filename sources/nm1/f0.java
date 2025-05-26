package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k f91424a;

    /* renamed from: b, reason: collision with root package name */
    public final l f91425b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f91426c;

    /* renamed from: d, reason: collision with root package name */
    public final int f91427d;

    public f0(k user, l endActions, h0 variant, int i13) {
        variant = (i13 & 4) != 0 ? h0.NORMAL : variant;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(endActions, "endActions");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f91424a = user;
        this.f91425b = endActions;
        this.f91426c = variant;
        this.f91427d = Integer.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f91424a, f0Var.f91424a) && Intrinsics.d(this.f91425b, f0Var.f91425b) && this.f91426c == f0Var.f91426c && this.f91427d == f0Var.f91427d;
    }

    @Override // nm1.m
    public final int getId() {
        throw null;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91427d) + ((this.f91426c.hashCode() + ((this.f91425b.hashCode() + (this.f91424a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UserAndActions(user=" + this.f91424a + ", endActions=" + this.f91425b + ", variant=" + this.f91426c + ", id=" + this.f91427d + ")";
    }
}
