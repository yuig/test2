package n3;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final k2.e f89065a = new k2.e(new h[16]);

    public boolean a(g1.p pVar, q3.x xVar, e eVar, boolean z13) {
        k2.e eVar2 = this.f89065a;
        int i13 = eVar2.f78184c;
        if (i13 <= 0) {
            return false;
        }
        Object[] objArr = eVar2.f78182a;
        int i14 = 0;
        boolean z14 = false;
        do {
            z14 = ((h) objArr[i14]).a(pVar, xVar, eVar, z13) || z14;
            i14++;
        } while (i14 < i13);
        return z14;
    }

    public void b(e eVar) {
        k2.e eVar2 = this.f89065a;
        int i13 = eVar2.f78184c;
        while (true) {
            i13--;
            if (-1 >= i13) {
                return;
            }
            if (((h) eVar2.f78182a[i13]).f89058c.f()) {
                eVar2.o(i13);
            }
        }
    }

    public final void c() {
        int i13 = 0;
        while (true) {
            k2.e eVar = this.f89065a;
            if (i13 >= eVar.f78184c) {
                return;
            }
            h hVar = (h) eVar.f78182a[i13];
            if (hVar.f89057b.f120054m) {
                i13++;
                hVar.c();
            } else {
                hVar.d();
                eVar.o(i13);
            }
        }
    }
}
