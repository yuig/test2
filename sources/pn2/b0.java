package pn2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b0 implements bm2.a, sn2.f {

    /* renamed from: a */
    public int f100771a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (x0() == b0Var.x0()) {
            v1 a13 = z0();
            v1 b13 = b0Var.z0();
            Intrinsics.checkNotNullParameter(a13, "a");
            Intrinsics.checkNotNullParameter(b13, "b");
            qn2.p context = qn2.p.f104516a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(a13, "a");
            Intrinsics.checkNotNullParameter(b13, "b");
            if (c.e(context, a13, b13)) {
                return true;
            }
        }
        return false;
    }

    @Override // bm2.a
    public final bm2.i getAnnotations() {
        return n.a(v0());
    }

    public final int hashCode() {
        int hashCode;
        int i13 = this.f100771a;
        if (i13 != 0) {
            return i13;
        }
        if (ao2.m0.U(this)) {
            hashCode = super.hashCode();
        } else {
            hashCode = (x0() ? 1 : 0) + ((u0().hashCode() + (w0().hashCode() * 31)) * 31);
        }
        this.f100771a = hashCode;
        return hashCode;
    }

    public abstract List u0();

    public abstract u0 v0();

    public abstract in2.n w();

    public abstract b1 w0();

    public abstract boolean x0();

    public abstract b0 y0(qn2.i iVar);

    public abstract v1 z0();
}
