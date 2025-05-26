package gy;

import ey.u1;
import ey.v1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import s92.l;
import s92.o;

/* loaded from: classes.dex */
public final class c extends v1 {

    /* renamed from: f, reason: collision with root package name */
    public a f66314f;

    /* renamed from: g, reason: collision with root package name */
    public e f66315g;

    @Override // ey.v1
    public final Set b() {
        Set set = d.f66316a;
        Intrinsics.checkNotNullExpressionValue(set, "access$getEVENT_TYPES$p(...)");
        return set;
    }

    @Override // ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof f) {
            x((f) e13);
            return true;
        }
        if (e13 instanceof a) {
            v((a) e13);
            return true;
        }
        if (e13 instanceof e) {
            w((e) e13);
            return true;
        }
        if (e13 instanceof g) {
            q(e13.c());
            return true;
        }
        if (!(e13 instanceof h)) {
            return true;
        }
        r(e13.c());
        return true;
    }

    public final void v(a aVar) {
        if (aVar.f66310d.length() > 0) {
            String str = aVar.f66310d;
            if (!Intrinsics.d(str, "other")) {
                j("pin_create_method", str);
            }
        }
        o oVar = o.COMPLETE;
        o oVar2 = aVar.f66309c;
        if (oVar2 == oVar) {
            this.f66314f = aVar;
            y();
        } else {
            a(oVar2, l.USER_NAVIGATION, aVar.f66311e, aVar.f66312f, aVar.c(), false);
            Intrinsics.checkNotNullParameter("openBoardPicker", "scenarioName");
        }
    }

    public final void w(e eVar) {
        o oVar = eVar.f66317c;
        if (oVar == o.COMPLETE) {
            this.f66315g = eVar;
            y();
        } else {
            a(oVar, l.USER_NAVIGATION, eVar.f66318d, eVar.f66319e, eVar.c(), false);
            Intrinsics.checkNotNullParameter("openBoardPicker", "scenarioName");
        }
    }

    public final void x(f fVar) {
        q(fVar.c());
        String str = fVar.f66320c;
        if (Intrinsics.d(str, "other")) {
            return;
        }
        j("navigation.origin", str);
    }

    public final void y() {
        a aVar = this.f66314f;
        u1 u1Var = this.f66315g;
        if (aVar == null || u1Var == null) {
            return;
        }
        if (aVar.f60583a >= u1Var.f60583a) {
            u1Var = aVar;
        }
        s(u1Var);
        a(o.COMPLETE, l.USER_NAVIGATION, aVar.f66311e, aVar.f66312f, 0L, false);
        Intrinsics.checkNotNullParameter("openBoardPicker", "scenarioName");
    }
}
