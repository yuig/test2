package t3;

import java.util.List;

/* loaded from: classes.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public final z3.j f116159a;

    /* renamed from: b, reason: collision with root package name */
    public final g1.v f116160b;

    public p3(z3.q qVar, g1.u uVar) {
        this.f116159a = qVar.f140714d;
        int[] iArr = g1.n.f63289a;
        this.f116160b = new g1.v();
        List i13 = z3.q.i(qVar, true, 4);
        int size = i13.size();
        for (int i14 = 0; i14 < size; i14++) {
            z3.q qVar2 = (z3.q) i13.get(i14);
            if (uVar.b(qVar2.f140717g)) {
                this.f116160b.a(qVar2.f140717g);
            }
        }
    }
}
