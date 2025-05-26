package qo2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class h0 implements oo2.g {

    /* renamed from: a, reason: collision with root package name */
    public final oo2.g f104563a;

    /* renamed from: b, reason: collision with root package name */
    public final oo2.g f104564b;

    public h0(oo2.g keyDesc, oo2.g valueDesc) {
        Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
        Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
        this.f104563a = keyDesc;
        this.f104564b = valueDesc;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        h0Var.getClass();
        return Intrinsics.d("kotlin.collections.LinkedHashMap", "kotlin.collections.LinkedHashMap") && Intrinsics.d(this.f104563a, h0Var.f104563a) && Intrinsics.d(this.f104564b, h0Var.f104564b);
    }

    @Override // oo2.g
    public final /* bridge */ /* synthetic */ boolean b() {
        return false;
    }

    @Override // oo2.g
    public final /* bridge */ /* synthetic */ oo2.n c() {
        return oo2.o.f96905c;
    }

    @Override // oo2.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(a.a.C(name, " is not a valid map index"));
    }

    @Override // oo2.g
    public final int e() {
        return 2;
    }

    @Override // oo2.g
    public final String f(int i13) {
        return String.valueOf(i13);
    }

    @Override // oo2.g
    public final List g(int i13) {
        if (i13 >= 0) {
            return kotlin.collections.q0.f80391a;
        }
        throw new IllegalArgumentException(a.a.e("Illegal index ", i13, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // oo2.g
    public final List getAnnotations() {
        return kotlin.collections.q0.f80391a;
    }

    @Override // oo2.g
    public final oo2.g h(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Illegal index ", i13, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i14 = i13 % 2;
        if (i14 == 0) {
            return this.f104563a;
        }
        if (i14 == 1) {
            return this.f104564b;
        }
        throw new IllegalStateException("Unreached".toString());
    }

    @Override // oo2.g
    public final String i() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // oo2.g
    public final /* bridge */ /* synthetic */ boolean isInline() {
        return false;
    }

    @Override // oo2.g
    public final boolean j(int i13) {
        if (i13 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(a.a.e("Illegal index ", i13, ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        return this.f104564b.hashCode() + ((this.f104563a.hashCode() + 710441009) * 31);
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f104563a + ", " + this.f104564b + ')';
    }
}
