package ch0;

import com.pinterest.api.model.vh;
import com.pinterest.framework.screens.q;
import com.pinterest.gestalt.callout.GestaltCallout;
import i32.y0;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import ra0.l0;
import rg0.s;
import sv.y;
import t3.s1;
import ug0.i;
import vq0.h;
import wl1.r;
import yk1.n;

/* loaded from: classes5.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final i f27734a;

    /* renamed from: b, reason: collision with root package name */
    public final s f27735b;

    /* renamed from: c, reason: collision with root package name */
    public final w f27736c;

    /* renamed from: d, reason: collision with root package name */
    public final lu1.b f27737d;

    public d(i experiencesApi, s experiences, w eventManager, lu1.b baseActivityHelper) {
        Intrinsics.checkNotNullParameter(experiencesApi, "experiencesApi");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        this.f27734a = experiencesApi;
        this.f27735b = experiences;
        this.f27736c = eventManager;
        this.f27737d = baseActivityHelper;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        e view = (e) nVar;
        vh model = (vh) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        GestaltCallout gestaltCallout = (GestaltCallout) view.f27738a;
        hh0.e eVar = model.f42854l;
        if (!(eVar instanceof hh0.e)) {
            eVar = null;
        }
        int i14 = 13;
        if (eVar == null) {
            c nextState = c.f27733i;
            gestaltCallout.getClass();
            Intrinsics.checkNotNullParameter(nextState, "nextState");
            return;
        }
        y0 i03 = k3.i0(eVar);
        rg0.n b13 = i03 != null ? ((dh0.d) this.f27735b).b(i03) : null;
        l0 nextState2 = new l0(eVar, 29);
        gestaltCallout.getClass();
        Intrinsics.checkNotNullParameter(nextState2, "nextState");
        q qVar = new q(i14, gestaltCallout, gestaltCallout.L());
        com.google.firebase.messaging.q qVar2 = gestaltCallout.f49348a;
        if (!model.f42866x) {
            model.f42866x = true;
            String str = b13 != null ? b13.f108062d : null;
            String str2 = eVar.f69139a;
            if (Intrinsics.d(str, str2) && b13.f108074p) {
                el.a.o2(str2);
            } else {
                if (Intrinsics.d(b13 != null ? b13.f108062d : null, str2)) {
                    b13.f108074p = true;
                }
                String str3 = model.f42862t;
                i iVar = this.f27734a;
                iVar.getClass();
                tg0.d sideEffect = tg0.d.f117578b;
                String placementId = eVar.f69141c;
                Intrinsics.checkNotNullParameter(placementId, "placementId");
                String experienceId = eVar.f69140b;
                Intrinsics.checkNotNullParameter(experienceId, "experienceId");
                Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
                nl.b.s(s1.f(iVar.l(placementId, experienceId, str3, null).H(tk2.e.f118017c), "observeOn(...)"), null, null, null, 7);
            }
        }
        y onDismiss = new y(eVar, this, model, 19);
        hh0.e eVar2 = eVar;
        b onPrimaryActionClick = new b(eVar2, this, model, gestaltCallout, 0);
        b onSecondaryActionClick = new b(eVar2, this, model, gestaltCallout, 1);
        Intrinsics.checkNotNullParameter(gestaltCallout, "<this>");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onPrimaryActionClick, "onPrimaryActionClick");
        Intrinsics.checkNotNullParameter(onSecondaryActionClick, "onSecondaryActionClick");
        r eventHandler = new r(onDismiss, onPrimaryActionClick, onSecondaryActionClick, 1);
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        vh model = (vh) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
