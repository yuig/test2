package u42;

import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.f30;
import com.pinterest.framework.multisection.datasource.pagedlist.f;
import com.pinterest.gestalt.text.GestaltText;
import dl1.s;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import pk.a0;
import s42.j;
import s42.k;
import wa2.i;
import wk1.n;
import yk1.v;

/* loaded from: classes4.dex */
public abstract class b extends n implements k {

    /* renamed from: a, reason: collision with root package name */
    public final v f120489a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f120490b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f120491c;

    /* renamed from: d, reason: collision with root package name */
    public Set f120492d;

    /* renamed from: e, reason: collision with root package name */
    public final t42.a f120493e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f120494f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v viewResources, wk1.c params) {
        super(params);
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f120489a = viewResources;
        this.f120490b = true;
        this.f120491c = true;
        this.f120492d = new LinkedHashSet();
        ((yk1.a) viewResources).f139224a.getString(j.select_pins);
        this.f120493e = new t42.a(viewResources);
        this.f120494f = true;
        i iVar = params.f130131b.f103320a;
        iVar.f128803w = false;
        iVar.f128797t = true;
        iVar.f128799u = true;
    }

    @Override // s42.k
    public final boolean H0(f30 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return this.f120492d.contains(model);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        f fVar = new f(v3(), 14);
        if (this.f120491c) {
            fVar.g(67);
        }
        if (this.f120490b) {
            ((wk1.i) dataSources).b(this.f120493e);
        }
        ((wk1.i) dataSources).b(fVar);
    }

    @Override // wk1.n, nr0.d
    public final void onPinClicked(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        for (s sVar : v3().d()) {
            if (sVar instanceof f30) {
                f30 f30Var = (f30) sVar;
                if (Intrinsics.d(f30Var.getUid(), pin.getUid())) {
                    z0(f30Var);
                }
            }
        }
    }

    public abstract String u3();

    public abstract t42.b v3();

    public boolean w3() {
        return this.f120494f;
    }

    public final void x3() {
        String headerText;
        int size = this.f120492d.size();
        boolean w33 = w3();
        t42.a aVar = this.f120493e;
        if (!w33) {
            String headerText2 = u3();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(headerText2, "headerText");
            s42.f fVar = aVar.f116420h;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(headerText2, "<set-?>");
            fVar.f111143a = headerText2;
            aVar.u1(0, fVar);
            return;
        }
        if (size == 0) {
            headerText = u3();
        } else {
            v vVar = this.f120489a;
            if (size > 0) {
                headerText = ((yk1.a) vVar).f139224a.getString(j.num_generic_selected, Integer.valueOf(size));
            } else {
                headerText = ((yk1.a) vVar).f139224a.getString(x0.select_or_reorder);
            }
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        s42.f fVar2 = aVar.f116420h;
        fVar2.getClass();
        Intrinsics.checkNotNullParameter(headerText, "<set-?>");
        fVar2.f111143a = headerText;
        aVar.u1(0, fVar2);
    }

    public void z0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "model");
        Intrinsics.checkNotNullParameter(pin, "pin");
        s42.b bVar = H0(pin) ? s42.b.SELECTED : s42.b.UNSELECTED;
        s42.b bVar2 = s42.b.UNSELECTED;
        if (bVar == bVar2) {
            bVar2 = s42.b.SELECTED;
        }
        int i13 = a.f120488a[bVar2.ordinal()];
        if (i13 == 1) {
            this.f120492d.add(pin);
        } else if (i13 == 2) {
            this.f120492d.remove(pin);
        }
        v3().u1(v3().d().indexOf(pin), pin);
        s42.a aVar = (s42.a) getView();
        int size = this.f120492d.size();
        v42.c cVar = (v42.c) aVar;
        if (cVar.R0) {
            cVar.T0 = size > 0;
            if (size == 0) {
                GestaltText f111139h1 = cVar.getF111139h1();
                if (f111139h1 != null) {
                    a0.p(f111139h1, "");
                }
                bs1.c.X0(cVar.getF111140i1());
            } else {
                GestaltText f111139h12 = cVar.getF111139h1();
                if (f111139h12 != null) {
                    a0.p(f111139h12, qb0.j.b(size));
                }
                RecyclerView g83 = cVar.g8();
                if ((g83 != null ? g83.computeVerticalScrollOffset() : 0) > cVar.S0 && !cVar.l9()) {
                    bs1.c.U1(cVar.getF111140i1());
                }
            }
        }
        x3();
    }
}
