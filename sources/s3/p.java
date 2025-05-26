package s3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f110859a = false;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.k f110860b = xk2.m.a(xk2.n.NONE, i.f110788j);

    /* renamed from: c, reason: collision with root package name */
    public final k2 f110861c = new k2(new o(0));

    public final void a(k0 k0Var) {
        if (!k0Var.G()) {
            jk.r.y("DepthSortedSet.add called on an unattached node");
            throw null;
        }
        if (this.f110859a) {
            Integer num = (Integer) c().get(k0Var);
            if (num == null) {
                c().put(k0Var, Integer.valueOf(k0Var.f110823k));
            } else {
                if (num.intValue() != k0Var.f110823k) {
                    jk.r.y("invalid node depth");
                    throw null;
                }
            }
        }
        this.f110861c.add(k0Var);
    }

    public final boolean b(k0 k0Var) {
        boolean contains = this.f110861c.contains(k0Var);
        if (!this.f110859a || contains == c().containsKey(k0Var)) {
            return contains;
        }
        jk.r.y("inconsistency in TreeSet");
        throw null;
    }

    public final Map c() {
        return (Map) this.f110860b.getValue();
    }

    public final boolean d(k0 k0Var) {
        if (!k0Var.G()) {
            jk.r.y("DepthSortedSet.remove called on an unattached node");
            throw null;
        }
        boolean remove = this.f110861c.remove(k0Var);
        if (this.f110859a) {
            if (!Intrinsics.d((Integer) c().remove(k0Var), remove ? Integer.valueOf(k0Var.f110823k) : null)) {
                jk.r.y("invalid node depth");
                throw null;
            }
        }
        return remove;
    }

    public final String toString() {
        return this.f110861c.toString();
    }
}
