package y2;

import b3.c0;
import g1.a0;
import jk.r;
import kotlin.collections.z;

/* loaded from: classes2.dex */
public final class j implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public a0 f136679a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f136680b;

    @Override // b3.c0
    public final e3.d a() {
        c0 c0Var = this.f136680b;
        if (c0Var == null) {
            r.y("GraphicsContext not provided");
            throw null;
        }
        e3.d a13 = c0Var.a();
        a0 a0Var = this.f136679a;
        if (a0Var == null) {
            a0 a0Var2 = new a0(1);
            a0Var2.a(a13);
            this.f136679a = a0Var2;
        } else {
            a0Var.a(a13);
        }
        return a13;
    }

    @Override // b3.c0
    public final void b(e3.d dVar) {
        c0 c0Var = this.f136680b;
        if (c0Var != null) {
            c0Var.b(dVar);
        }
    }

    public final void c() {
        a0 a0Var = this.f136679a;
        if (a0Var != null) {
            Object[] objArr = a0Var.f63228a;
            int i13 = a0Var.f63229b;
            for (int i14 = 0; i14 < i13; i14++) {
                b((e3.d) objArr[i14]);
            }
            z.o(0, a0Var.f63229b, null, a0Var.f63228a);
            a0Var.f63229b = 0;
        }
    }
}
