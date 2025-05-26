package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f136396a;

    /* renamed from: b, reason: collision with root package name */
    public final a11.u f136397b;

    public d0(Integer num, a11.u uVar) {
        this.f136396a = num;
        this.f136397b = uVar;
    }

    public final Integer a() {
        return this.f136396a;
    }

    public final a11.u b() {
        return this.f136397b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f136396a, d0Var.f136396a) && Intrinsics.d(this.f136397b, d0Var.f136397b);
    }

    public final int hashCode() {
        Integer num = this.f136396a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        a11.u uVar = this.f136397b;
        return hashCode + (uVar != null ? uVar.hashCode() : 0);
    }

    public final String toString() {
        return "PageSelected(selectedPosition=" + this.f136396a + ", swipeData=" + this.f136397b + ")";
    }
}
