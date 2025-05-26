package pd2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class q extends u {

    @NotNull
    public static final p Companion = new p();

    /* renamed from: b, reason: collision with root package name */
    public final hd2.f f99865b;

    /* renamed from: c, reason: collision with root package name */
    public final qd2.x f99866c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f99867d;

    public q(int i13, hd2.f fVar, qd2.x xVar, l0 l0Var) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, o.f99862b);
            throw null;
        }
        this.f99865b = fVar;
        if ((i13 & 2) == 0) {
            this.f99866c = null;
        } else {
            this.f99866c = xVar;
        }
        if ((i13 & 4) == 0) {
            this.f99867d = new l0(fVar);
        } else {
            this.f99867d = l0Var;
        }
    }

    @Override // pd2.u
    public final p0 a() {
        return this.f99867d;
    }

    @Override // pd2.u
    public final qd2.c b() {
        return this.f99866c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f99865b, qVar.f99865b) && Intrinsics.d(this.f99866c, qVar.f99866c);
    }

    public final int hashCode() {
        int hashCode = this.f99865b.hashCode() * 31;
        qd2.x xVar = this.f99866c;
        return hashCode + (xVar == null ? 0 : xVar.f103609b.hashCode());
    }

    public final String toString() {
        return "Line(defaultValue=" + this.f99865b + ", limits=" + this.f99866c + ')';
    }

    public q(hd2.f defaultValue, qd2.x xVar) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.f99865b = defaultValue;
        this.f99866c = xVar;
        this.f99867d = new l0(defaultValue);
    }
}
