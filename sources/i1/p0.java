package i1;

import a.cb;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final u2.e f70866a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f70867b;

    /* renamed from: c, reason: collision with root package name */
    public final j1.h0 f70868c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f70869d;

    public p0(j1.h0 h0Var, u2.e eVar, Function1 function1, boolean z13) {
        this.f70866a = eVar;
        this.f70867b = function1;
        this.f70868c = h0Var;
        this.f70869d = z13;
    }

    public final u2.e a() {
        return this.f70866a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.f70866a, p0Var.f70866a) && Intrinsics.d(this.f70867b, p0Var.f70867b) && Intrinsics.d(this.f70868c, p0Var.f70868c) && this.f70869d == p0Var.f70869d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70869d) + ((this.f70868c.hashCode() + d7.g.c(this.f70867b, this.f70866a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChangeSize(alignment=");
        sb3.append(this.f70866a);
        sb3.append(", size=");
        sb3.append(this.f70867b);
        sb3.append(", animationSpec=");
        sb3.append(this.f70868c);
        sb3.append(", clip=");
        return cb.m(sb3, this.f70869d, ')');
    }
}
