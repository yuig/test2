package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18162c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final p1 f18163a = new p1(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f18164b;

    static {
        new x(0);
    }

    public x() {
    }

    public static void b(q qVar, q2 q2Var, int i13, Object obj) {
        if (q2Var == q2.GROUP) {
            qVar.i0(i13, 3);
            ((b) obj).c(qVar);
            qVar.i0(i13, 4);
            return;
        }
        qVar.i0(i13, q2Var.getWireType());
        switch (w.f18159b[q2Var.ordinal()]) {
            case 1:
                qVar.Q(((Double) obj).doubleValue());
                break;
            case 2:
                qVar.W(((Float) obj).floatValue());
                break;
            case 3:
                qVar.Z(((Long) obj).longValue());
                break;
            case 4:
                qVar.m0(((Long) obj).longValue());
                break;
            case 5:
                qVar.Y(((Integer) obj).intValue());
                break;
            case 6:
                qVar.V(((Long) obj).longValue());
                break;
            case 7:
                qVar.T(((Integer) obj).intValue());
                break;
            case 8:
                qVar.L(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((b) obj).c(qVar);
                break;
            case 10:
                qVar.b0((b) obj);
                break;
            case 11:
                if (!(obj instanceof i)) {
                    qVar.h0((String) obj);
                    break;
                } else {
                    qVar.P((i) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof i)) {
                    qVar.M((byte[]) obj);
                    break;
                } else {
                    qVar.P((i) obj);
                    break;
                }
            case 13:
                qVar.k0(((Integer) obj).intValue());
                break;
            case 14:
                qVar.c0(((Integer) obj).intValue());
                break;
            case 15:
                qVar.d0(((Long) obj).longValue());
                break;
            case 16:
                qVar.e0(((Integer) obj).intValue());
                break;
            case 17:
                qVar.f0(((Long) obj).longValue());
                break;
            case 18:
                qVar.R(((Integer) obj).intValue());
                break;
        }
    }

    public final void a() {
        if (this.f18164b) {
            return;
        }
        p1 p1Var = this.f18163a;
        if (!p1Var.f18126d) {
            if (p1Var.f18124b.size() > 0) {
                ep.b.A(p1Var.h(0).getKey());
                throw null;
            }
            Iterator it = p1Var.i().iterator();
            if (it.hasNext()) {
                ep.b.A(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        if (!p1Var.f18126d) {
            p1Var.f18125c = p1Var.f18125c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(p1Var.f18125c);
            p1Var.f18128f = p1Var.f18128f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(p1Var.f18128f);
            p1Var.f18126d = true;
        }
        this.f18164b = true;
    }

    public final Object clone() {
        x xVar = new x();
        p1 p1Var = this.f18163a;
        if (p1Var.f18124b.size() > 0) {
            Map.Entry h10 = p1Var.h(0);
            ep.b.A(h10.getKey());
            h10.getValue();
            throw null;
        }
        Iterator it = p1Var.i().iterator();
        if (!it.hasNext()) {
            return xVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ep.b.A(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        return this.f18163a.equals(((x) obj).f18163a);
    }

    public final int hashCode() {
        return this.f18163a.hashCode();
    }

    public x(int i13) {
        a();
        a();
    }
}
