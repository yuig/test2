package qo2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class j0 implements oo2.g {

    /* renamed from: a, reason: collision with root package name */
    public final oo2.g f104574a;

    /* renamed from: b, reason: collision with root package name */
    public final int f104575b = 1;

    public j0(oo2.g gVar) {
        this.f104574a = gVar;
    }

    @Override // oo2.g
    public final boolean b() {
        return false;
    }

    @Override // oo2.g
    public final oo2.n c() {
        return oo2.o.f96904b;
    }

    @Override // oo2.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(a.a.C(name, " is not a valid list index"));
    }

    @Override // oo2.g
    public final int e() {
        return this.f104575b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.f104574a, j0Var.f104574a) && Intrinsics.d(i(), j0Var.i());
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
        StringBuilder s13 = a.a.s("Illegal index ", i13, ", ");
        s13.append(i());
        s13.append(" expects only non-negative indices");
        throw new IllegalArgumentException(s13.toString().toString());
    }

    @Override // oo2.g
    public final List getAnnotations() {
        return kotlin.collections.q0.f80391a;
    }

    @Override // oo2.g
    public final oo2.g h(int i13) {
        if (i13 >= 0) {
            return this.f104574a;
        }
        StringBuilder s13 = a.a.s("Illegal index ", i13, ", ");
        s13.append(i());
        s13.append(" expects only non-negative indices");
        throw new IllegalArgumentException(s13.toString().toString());
    }

    public final int hashCode() {
        return i().hashCode() + (this.f104574a.hashCode() * 31);
    }

    @Override // oo2.g
    public final boolean isInline() {
        return false;
    }

    @Override // oo2.g
    public final boolean j(int i13) {
        if (i13 >= 0) {
            return false;
        }
        StringBuilder s13 = a.a.s("Illegal index ", i13, ", ");
        s13.append(i());
        s13.append(" expects only non-negative indices");
        throw new IllegalArgumentException(s13.toString().toString());
    }

    public final String toString() {
        return i() + '(' + this.f104574a + ')';
    }
}
