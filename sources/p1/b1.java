package p1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public float f98486a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public boolean f98487b = true;

    /* renamed from: c, reason: collision with root package name */
    public d f98488c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Float.compare(this.f98486a, b1Var.f98486a) == 0 && this.f98487b == b1Var.f98487b && Intrinsics.d(this.f98488c, b1Var.f98488c) && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f98487b, Float.hashCode(this.f98486a) * 31, 31);
        d dVar = this.f98488c;
        return (e13 + (dVar == null ? 0 : dVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f98486a + ", fill=" + this.f98487b + ", crossAxisAlignment=" + this.f98488c + ", flowLayoutData=null)";
    }
}
