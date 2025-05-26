package i1;

import j1.o2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f70924a;

    /* renamed from: b, reason: collision with root package name */
    public final j1.h0 f70925b;

    public w1(o2 o2Var, Function1 function1) {
        this.f70924a = function1;
        this.f70925b = o2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return Intrinsics.d(this.f70924a, w1Var.f70924a) && Intrinsics.d(this.f70925b, w1Var.f70925b);
    }

    public final int hashCode() {
        return this.f70925b.hashCode() + (this.f70924a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f70924a + ", animationSpec=" + this.f70925b + ')';
    }
}
