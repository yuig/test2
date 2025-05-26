package ex1;

import com.pinterest.api.model.w30;
import com.pinterest.api.model.xb;
import java.util.List;
import kh2.u2;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yk1.v;

/* loaded from: classes4.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60403i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f60404j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i13) {
        super(1);
        this.f60403i = i13;
        this.f60404j = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h hVar = h.f60399a;
        int i13 = this.f60403i;
        l lVar = this.f60404j;
        switch (i13) {
            case 0:
                xb topPins = (xb) obj;
                Intrinsics.checkNotNullParameter(topPins, "topPins");
                boolean[] zArr = topPins.f43647l;
                if (zArr.length > 1 && zArr[1]) {
                    List n13 = topPins.n();
                    if (n13 == null || n13.isEmpty()) {
                        ((j) lVar.getView()).F1(hVar);
                    } else {
                        j jVar = (j) lVar.getView();
                        Intrinsics.checkNotNullExpressionValue(jVar, "access$getView(...)");
                        zx.l c13 = ((xw1.a) lVar.f60416j.getValue()).f136124b.c();
                        v viewResources = lVar.f60407a;
                        String T = u2.T(c13, viewResources);
                        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
                        zx.f fVar = c13.f142973a.f142969a;
                        jVar.Y5(fVar == zx.f.CUSTOM ? c13.g() : ((yk1.a) viewResources).f139224a.getString(fVar.getDescription()), T);
                        j jVar2 = (j) lVar.getView();
                        List n14 = topPins.n();
                        if (n14 == null) {
                            n14 = q0.f80391a;
                        }
                        jVar2.F1(new i(n14, ww1.c.IMPRESSION));
                        w30 l13 = topPins.l();
                        lVar.p3(l13 != null ? l13.p() : null);
                    }
                } else if (zArr.length > 0 && zArr[0]) {
                    List m13 = topPins.m();
                    if (m13 == null || m13.isEmpty()) {
                        ((j) lVar.getView()).F1(hVar);
                    } else {
                        j jVar3 = (j) lVar.getView();
                        List m14 = topPins.m();
                        if (m14 == null) {
                            m14 = q0.f80391a;
                        }
                        jVar3.F1(new i(m14, ww1.c.ENGAGEMENT));
                        w30 l14 = topPins.l();
                        lVar.p3(l14 != null ? l14.o() : null);
                    }
                } else if (zArr.length > 3 && zArr[3]) {
                    List p13 = topPins.p();
                    if (p13 == null || p13.isEmpty()) {
                        ((j) lVar.getView()).F1(hVar);
                    } else {
                        j jVar4 = (j) lVar.getView();
                        List p14 = topPins.p();
                        if (p14 == null) {
                            p14 = q0.f80391a;
                        }
                        jVar4.F1(new i(p14, ww1.c.PIN_CLICK));
                        w30 l15 = topPins.l();
                        lVar.p3(l15 != null ? l15.r() : null);
                    }
                } else if (zArr.length > 2 && zArr[2]) {
                    List o13 = topPins.o();
                    if (o13 == null || o13.isEmpty()) {
                        ((j) lVar.getView()).F1(hVar);
                    } else {
                        j jVar5 = (j) lVar.getView();
                        List o14 = topPins.o();
                        if (o14 == null) {
                            o14 = q0.f80391a;
                        }
                        jVar5.F1(new i(o14, ww1.c.OUTBOUND_CLICK));
                        w30 l16 = topPins.l();
                        lVar.p3(l16 != null ? l16.q() : null);
                    }
                } else if (zArr.length > 5 && zArr[5]) {
                    List r13 = topPins.r();
                    if (r13 == null || r13.isEmpty()) {
                        ((j) lVar.getView()).F1(hVar);
                    } else {
                        j jVar6 = (j) lVar.getView();
                        List r14 = topPins.r();
                        if (r14 == null) {
                            r14 = q0.f80391a;
                        }
                        jVar6.F1(new i(r14, ww1.c.SAVE));
                        w30 l17 = topPins.l();
                        lVar.p3(l17 != null ? l17.t() : null);
                    }
                } else if (zArr.length > 8 && zArr[8]) {
                    List u13 = topPins.u();
                    if (u13 == null || u13.isEmpty()) {
                        ((j) lVar.getView()).F1(hVar);
                    } else {
                        j jVar7 = (j) lVar.getView();
                        List u14 = topPins.u();
                        if (u14 == null) {
                            u14 = q0.f80391a;
                        }
                        jVar7.F1(new i(u14, ww1.c.VIDEO_MRC_VIEW));
                        w30 l18 = topPins.l();
                        lVar.p3(l18 != null ? l18.w() : null);
                    }
                } else if (zArr.length > 9 && zArr[9]) {
                    List v13 = topPins.v();
                    if (v13 == null || v13.isEmpty()) {
                        ((j) lVar.getView()).F1(hVar);
                    } else {
                        j jVar8 = (j) lVar.getView();
                        List v14 = topPins.v();
                        if (v14 == null) {
                            v14 = q0.f80391a;
                        }
                        jVar8.F1(new i(v14, ww1.c.VIDEO_V50_WATCH_TIME));
                        w30 l19 = topPins.l();
                        lVar.p3(l19 != null ? l19.x() : null);
                    }
                } else if (zArr.length > 7 && zArr[7]) {
                    List t13 = topPins.t();
                    if (t13 == null || t13.isEmpty()) {
                        ((j) lVar.getView()).F1(hVar);
                    } else {
                        j jVar9 = (j) lVar.getView();
                        List t14 = topPins.t();
                        if (t14 == null) {
                            t14 = q0.f80391a;
                        }
                        jVar9.F1(new i(t14, ww1.c.VIDEO_AVG_WATCH_TIME));
                        w30 l23 = topPins.l();
                        lVar.p3(l23 != null ? l23.v() : null);
                    }
                } else if (zArr.length > 4 && zArr[4]) {
                    List q13 = topPins.q();
                    if (q13 == null || q13.isEmpty()) {
                        ((j) lVar.getView()).F1(hVar);
                    } else {
                        j jVar10 = (j) lVar.getView();
                        List q14 = topPins.q();
                        if (q14 == null) {
                            q14 = q0.f80391a;
                        }
                        jVar10.F1(new i(q14, ww1.c.QUARTILE_95_PERCENT_VIEW));
                        w30 l24 = topPins.l();
                        lVar.p3(l24 != null ? l24.s() : null);
                    }
                } else if (zArr.length <= 6 || !zArr[6]) {
                    ((j) lVar.getView()).F1(hVar);
                } else {
                    List s13 = topPins.s();
                    if (s13 == null || s13.isEmpty()) {
                        ((j) lVar.getView()).F1(hVar);
                    } else {
                        j jVar11 = (j) lVar.getView();
                        List s14 = topPins.s();
                        if (s14 == null) {
                            s14 = q0.f80391a;
                        }
                        jVar11.F1(new i(s14, ww1.c.VIDEO_10S_VIEW));
                        w30 l25 = topPins.l();
                        lVar.p3(l25 != null ? l25.u() : null);
                    }
                }
                j jVar12 = (j) lVar.getView();
                Intrinsics.checkNotNullExpressionValue(jVar12, "access$getView(...)");
                zx.l c14 = ((xw1.a) lVar.f60416j.getValue()).f136124b.c();
                v viewResources2 = lVar.f60407a;
                String T2 = u2.T(c14, viewResources2);
                Intrinsics.checkNotNullParameter(viewResources2, "viewResources");
                zx.f fVar2 = c14.f142973a.f142969a;
                jVar12.Y5(fVar2 == zx.f.CUSTOM ? c14.g() : ((yk1.a) viewResources2).f139224a.getString(fVar2.getDescription()), T2);
                break;
            default:
                ((j) lVar.getView()).F1(hVar);
                break;
        }
        return Unit.f80348a;
    }
}
