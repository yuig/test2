package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final am2.c1 f100786a;

    /* renamed from: b, reason: collision with root package name */
    public final c f100787b;

    public e1(am2.c1 typeParameter, c typeAttr) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        this.f100786a = typeParameter;
        this.f100787b = typeAttr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.d(e1Var.f100786a, this.f100786a) && Intrinsics.d(e1Var.f100787b, this.f100787b);
    }

    public final int hashCode() {
        int hashCode = this.f100786a.hashCode();
        return this.f100787b.hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f100786a + ", typeAttr=" + this.f100787b + ')';
    }
}
