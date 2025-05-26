package bp;

import a.l2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.pc;
import com.pinterest.api.model.qc;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import dl1.s;
import kh2.k3;
import kh2.m0;
import pk.a0;

/* loaded from: classes3.dex */
public abstract class g extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public Feed f23630d;

    /* renamed from: e, reason: collision with root package name */
    public final v7 f23631e;

    /* renamed from: f, reason: collision with root package name */
    public final f f23632f;

    /* renamed from: g, reason: collision with root package name */
    public final c f23633g;

    public g(v7 v7Var, Feed feed, f fVar, xo.n nVar) {
        this.f23630d = feed;
        this.f23631e = v7Var;
        this.f23632f = fVar;
        hashCode();
        this.f23633g = nVar;
        nVar.f23621b = this;
    }

    public abstract k C(View view);

    public abstract m D();

    public abstract void E();

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f23630d.n();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        wy0 wy0Var;
        boolean z13;
        boolean z14;
        e eVar = (e) y2Var;
        s k13 = this.f23630d.k(i13);
        if (k13 != null) {
            eVar.f23624u = k13;
            k kVar = (k) eVar;
            int i14 = kVar.B;
            switch (i14) {
                case 0:
                    wy0Var = ((qc) k13).f41259b;
                    break;
                default:
                    wy0Var = (wy0) k13;
                    break;
            }
            boolean z15 = true;
            int i15 = 0;
            switch (i14) {
                case 0:
                    pc pcVar = ((qc) k13).f41260c;
                    pc pcVar2 = pc.OWNER;
                    if (pcVar != pcVar2 && pcVar != pcVar2 && pcVar != pc.ACCEPTED) {
                        z13 = true;
                        break;
                    }
                    z13 = false;
                    break;
                default:
                    z13 = false;
                    break;
            }
            m0.V0(eVar.f23625v, wy0Var);
            String Z2 = wy0Var.Z2();
            String z43 = wy0Var.z4();
            if (a0.s0(Z2)) {
                Z2 = z43;
            }
            a0.p(eVar.f23626w, Z2);
            k3.R1(eVar.f23628y, false);
            if (z13) {
                eVar.f23625v.setAlpha(0.5f);
                eVar.f23626w.i(new xo.j(7));
            }
            ImageButton imageButton = eVar.f23628y;
            int i16 = 3;
            g gVar = kVar.C;
            switch (i14) {
                case 0:
                    qc qcVar = (qc) k13;
                    wy0 wy0Var2 = qcVar.f41259b;
                    l lVar = (l) gVar;
                    if (lVar.f23641i.d(wy0Var2)) {
                        if (qcVar.f41260c != pc.OWNER) {
                            kVar.f23628y.setImageResource(le0.c.ic_header_cancel_nonpds);
                            z14 = true;
                            break;
                        }
                        z14 = false;
                        break;
                    } else {
                        String str = qcVar.f41261d;
                        if (str != null && str.contains("delete")) {
                            kVar.f23628y.setImageResource(le0.c.ic_header_cancel_nonpds);
                            String str2 = qcVar.f41261d;
                            if (str2 == null || !str2.contains("approve") || !pc.PENDING_APPROVAL.equals(qcVar.f41260c) || qcVar.f41259b == null) {
                                kVar.f23629z.d(new xo.j(4));
                            } else {
                                kVar.f23629z.d(new xo.j(i16));
                                kVar.f23629z.e(new j(i15, kVar, qcVar));
                            }
                            z14 = !lVar.f23641i.d(wy0Var2);
                            break;
                        }
                        z14 = false;
                    }
                    break;
                default:
                    z14 = false;
                    break;
            }
            k3.R1(imageButton, z14);
            switch (i14) {
                case 0:
                    qc qcVar2 = (qc) k13;
                    pc pcVar3 = qcVar2.f41260c;
                    pc pcVar4 = pc.OWNER;
                    int i17 = 2;
                    if ((pcVar3 == pcVar4 || pcVar3 == pcVar4 || pcVar3 == pc.ACCEPTED) ? false : true) {
                        kVar.f23627x.i(new xo.j(i17));
                    }
                    pc pcVar5 = qcVar2.f41260c;
                    if (pcVar5 != null) {
                        if (pcVar5 != pcVar4) {
                            int i18 = i.f23636a[pcVar5.ordinal()];
                            if (i18 == 1) {
                                a0.o(kVar.f23627x, vc0.d.invite_pending, new Object[0]);
                                break;
                            } else if (i18 == 2 || i18 == 3) {
                                a0.o(kVar.f23627x, vc0.d.board_invite_pending, new Object[0]);
                                break;
                            } else if (((l) gVar).f23641i.d(qcVar2.f41259b)) {
                                a0.o(kVar.f23627x, vc0.d.self_identifier, new Object[0]);
                                break;
                            } else {
                                a0.p(kVar.f23627x, "");
                            }
                        } else {
                            a0.o(kVar.f23627x, vc0.d.board_owner, new Object[0]);
                            break;
                        }
                    } else {
                        a0.p(kVar.f23627x, "");
                    }
                    z15 = false;
                    break;
                default:
                    z15 = false;
                    break;
            }
            eVar.f23627x.i(new d(z15, i15));
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView recyclerView, int i13) {
        View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(vc0.c.board_collab_item, (ViewGroup) recyclerView, false);
        k C = C(inflate);
        inflate.findViewById(vc0.b.action_btn).setOnClickListener(new l2(C, 14));
        return C;
    }
}
