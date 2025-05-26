package uu0;

import a7.b1;
import a7.i0;
import android.os.Bundle;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import d7.h0;
import g8.e1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import m7.l0;
import m7.o1;
import m7.q0;
import m7.t1;
import pk.a0;
import pk.c1;
import pk.v2;
import rq.l4;
import tu0.j;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class d extends t {
    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        j view = (j) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((c) view).f123134h0 = this;
    }

    public final void p3(Bundle bundle) {
        j jVar = (j) getView();
        int i13 = bundle.getInt("education.title", 0);
        GestaltText gestaltText = ((c) jVar).f123137k0;
        if (gestaltText == null) {
            Intrinsics.r("titleTextView");
            throw null;
        }
        a0.o(gestaltText, i13, new Object[0]);
        j jVar2 = (j) getView();
        Object obj = bundle.get("education.video.link");
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
        String videoLink = (String) obj;
        c cVar = (c) jVar2;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(videoLink, "videoLink");
        i0 b13 = i0.b(videoLink);
        Intrinsics.checkNotNullExpressionValue(b13, "fromUri(...)");
        l0 l0Var = cVar.f123135i0;
        int i14 = 1;
        if (l0Var != null) {
            v2 v13 = c1.v(b13);
            l0Var.L0();
            ArrayList j03 = l0Var.j0(v13);
            l0Var.L0();
            ArrayList arrayList = l0Var.f86282q;
            int min = Math.min(Integer.MAX_VALUE, arrayList.size());
            if (arrayList.isEmpty()) {
                l0Var.z0(j03, l0Var.f86278n0 == -1);
            } else {
                o1 o1Var = l0Var.f86276m0;
                b1 b1Var = o1Var.f86330a;
                l0Var.f86251J++;
                ArrayList g03 = l0Var.g0(min, j03);
                t1 t1Var = new t1(arrayList, l0Var.O);
                o1 r03 = l0Var.r0(o1Var, t1Var, l0Var.o0(b1Var, t1Var, l0Var.n0(o1Var), l0Var.l0(o1Var)));
                e1 e1Var = l0Var.O;
                d7.i0 i0Var = l0Var.f86275m.f86417h;
                q0 q0Var = new q0(g03, e1Var, -1, -9223372036854775807L);
                i0Var.getClass();
                h0 c13 = d7.i0.c();
                c13.f53827a = i0Var.f53829a.obtainMessage(18, min, 0, q0Var);
                c13.b();
                l0Var.J0(r03, 0, false, 5, -9223372036854775807L, -1, false);
            }
        }
        l0 l0Var2 = cVar.f123135i0;
        if (l0Var2 != null) {
            l0Var2.b();
        }
        j jVar3 = (j) getView();
        int i15 = bundle.getInt("education.desc", 0);
        GestaltText gestaltText2 = ((c) jVar3).f123138l0;
        if (gestaltText2 == null) {
            Intrinsics.r("descTextView");
            throw null;
        }
        a0.o(gestaltText2, i15, new Object[0]);
        j jVar4 = (j) getView();
        Integer valueOf = bundle.containsKey("education.button.text") ? Integer.valueOf(bundle.getInt("education.button.text")) : null;
        GestaltButton gestaltButton = ((c) jVar4).f123139m0;
        if (gestaltButton != null) {
            gestaltButton.d(new l4(valueOf, i14));
        } else {
            Intrinsics.r("actionButton");
            throw null;
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        j view = (j) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((c) view).f123134h0 = this;
    }
}
