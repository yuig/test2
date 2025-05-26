package pd2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class n extends u {

    @NotNull
    public static final m Companion = new m();

    /* renamed from: e, reason: collision with root package name */
    public static final no2.b[] f99857e = {null, qd2.u.Companion.serializer(), null};

    /* renamed from: b, reason: collision with root package name */
    public final int f99858b;

    /* renamed from: c, reason: collision with root package name */
    public final qd2.u f99859c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f99860d;

    public n(int i13, int i14, qd2.u uVar, i0 i0Var) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, l.f99853b);
            throw null;
        }
        this.f99858b = i14;
        if ((i13 & 2) == 0) {
            this.f99859c = null;
        } else {
            this.f99859c = uVar;
        }
        if ((i13 & 4) == 0) {
            this.f99860d = new i0(i14);
        } else {
            this.f99860d = i0Var;
        }
    }

    @Override // pd2.u
    public final p0 a() {
        return this.f99860d;
    }

    @Override // pd2.u
    public final qd2.c b() {
        return this.f99859c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f99858b == nVar.f99858b && Intrinsics.d(this.f99859c, nVar.f99859c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f99858b) * 31;
        qd2.u uVar = this.f99859c;
        return hashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "Int(defaultValue=" + this.f99858b + ", limits=" + this.f99859c + ')';
    }

    public n(int i13, qd2.u uVar) {
        this.f99858b = i13;
        this.f99859c = uVar;
        this.f99860d = new i0(i13);
    }
}
