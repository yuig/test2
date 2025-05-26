package ja1;

import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import wt1.e0;

/* loaded from: classes5.dex */
public final class e extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f75306h;

    /* renamed from: i, reason: collision with root package name */
    public final wy0 f75307i;

    public e(int i13, wy0 wy0Var) {
        List j13;
        this.f75306h = i13;
        if (i13 != 1) {
            this.f75307i = wy0Var;
            o(0, new s91.b(1));
            o(2, new s91.b(2));
            o(1, new s91.b(3));
            return;
        }
        this.f75307i = wy0Var;
        o(2, new s91.b(14));
        if (wy0Var != null) {
            Boolean G3 = wy0Var.G3();
            Intrinsics.checkNotNullExpressionValue(G3, "getIsPartner(...)");
            if (G3.booleanValue()) {
                j13 = f0.j(hb1.a.f68526e, hb1.c.f68528e);
                k(j13);
            }
        }
        j13 = f0.j(hb1.b.f68527e, hb1.a.f68526e, hb1.c.f68528e);
        k(j13);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.f75306h) {
            case 0:
                return ((d) d().get(i13)).f75305a;
            default:
                return ((hb1.d) d().get(i13)).f68529a;
        }
    }

    @Override // wt1.e0, wt1.b
    public final void n() {
        List u23;
        switch (this.f75306h) {
            case 0:
                super.n();
                ArrayList arrayList = new ArrayList();
                wy0 wy0Var = this.f75307i;
                if (wy0Var != null) {
                    arrayList.add(new c(wy0Var));
                }
                if (wy0Var != null && (u23 = wy0Var.u2()) != null) {
                    List list = u23;
                    ArrayList arrayList2 = new ArrayList(g0.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new c((wy0) it.next()));
                    }
                    arrayList.addAll(arrayList2);
                }
                d[] dVarArr = (d[]) arrayList.toArray(new c[0]);
                b20.c cVar = new b20.c(3);
                cVar.b(new b(wy0Var));
                cVar.c(dVarArr);
                cVar.b(new a(wy0Var));
                k(f0.j(cVar.D(new d[cVar.C()])));
                break;
            default:
                super.n();
                break;
        }
    }
}
