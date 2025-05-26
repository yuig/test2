package pn2;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class l implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public int f100813a;

    /* renamed from: b, reason: collision with root package name */
    public final on2.e f100814b;

    public l(on2.u storageManager) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        nn2.v vVar = new nn2.v(this, 1);
        k kVar = new k(this, 2);
        on2.q qVar = (on2.q) storageManager;
        qVar.getClass();
        this.f100814b = new on2.e(qVar, vVar, kVar);
    }

    public abstract Collection e();

    public abstract b0 g();

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1) || obj.hashCode() != hashCode()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (b1Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        am2.j b13 = b();
        am2.j b14 = b1Var.b();
        if (b14 == null || rn2.m.g(b13) || bn2.e.q(b13) || rn2.m.g(b14) || bn2.e.q(b14)) {
            return false;
        }
        return m(b14);
    }

    public Collection i() {
        return kotlin.collections.q0.f80391a;
    }

    public abstract am2.a1 j();

    @Override // pn2.b1
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final List c() {
        return ((i) this.f100814b.invoke()).f100798b;
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int i13 = this.f100813a;
        if (i13 != 0) {
            return i13;
        }
        am2.j b13 = b();
        int identityHashCode = (rn2.m.g(b13) || bn2.e.q(b13)) ? System.identityHashCode(this) : bn2.e.h(b13).f139473a.hashCode();
        this.f100813a = identityHashCode;
        return identityHashCode;
    }

    public abstract boolean m(am2.j jVar);

    public List n(List supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        return supertypes;
    }

    public void o(b0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
