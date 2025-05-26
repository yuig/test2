package n3;

import j1.x0;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public q3.x f89143a;

    /* renamed from: b, reason: collision with root package name */
    public x f89144b = x.Unknown;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f89145c;

    public z(a0 a0Var) {
        this.f89145c = a0Var;
    }

    public final void a(j jVar) {
        List list = jVar.f89070a;
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            a0 a0Var = this.f89145c;
            if (i14 >= size) {
                q3.x xVar = this.f89143a;
                if (xVar == null) {
                    throw new IllegalStateException("layoutCoordinates not set".toString());
                }
                l3.c.b1(jVar, xVar.c0(0L), new x0(21, this, a0Var));
                if (this.f89144b == x.Dispatching) {
                    int size2 = list.size();
                    while (i13 < size2) {
                        ((q) list.get(i13)).a();
                        i13++;
                    }
                    e eVar = jVar.f89071b;
                    if (eVar == null) {
                        return;
                    }
                    eVar.e(!a0Var.f89031d);
                    return;
                }
                return;
            }
            if (((q) list.get(i14)).m()) {
                if (this.f89144b == x.Dispatching) {
                    q3.x xVar2 = this.f89143a;
                    if (xVar2 == null) {
                        throw new IllegalStateException("layoutCoordinates not set".toString());
                    }
                    l3.c.Y0(jVar, xVar2.c0(0L), new y(a0Var, i13));
                }
                this.f89144b = x.NotDispatching;
                return;
            }
            i14++;
        }
    }
}
