package hh0;

import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.b2;
import c50.k6;
import cj0.l0;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.c6;
import com.pinterest.api.model.d40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.expressSurvey.view.ExpressSurveyView;
import com.pinterest.feature.account.recovery.view.ResetPasswordView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import d70.g;
import df.j1;
import f0.h;
import fk0.x;
import gb2.i;
import h32.f1;
import h32.u0;
import hn1.p;
import i32.a0;
import i92.k;
import il0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.t;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l82.n;
import m60.r0;
import m60.u;
import m60.x0;
import mf0.l;
import rm1.q;
import sk0.j;
import sk0.y;
import tk0.i0;
import u50.f0;
import u50.k0;
import u50.r;
import zy.d0;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69133i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f69134j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i13) {
        super(1);
        this.f69133i = i13;
        this.f69134j = obj;
    }

    public final om1.c b(om1.c it) {
        int i13 = this.f69133i;
        Object obj = this.f69134j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, ((Boolean) ((ui0.e) obj).H0.getValue()).booleanValue() ? fm1.c.VISIBLE : fm1.c.GONE, null, false, 0, 1015);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                gj0.c cVar = (gj0.c) obj;
                fm1.c Z = d7.b.Z(cVar.f65194g.f65186a);
                boolean z13 = cVar.f65194g.f65187b;
                om1.f fVar = cVar.f65193f;
                if (fVar == null) {
                    fVar = it.f96641c;
                }
                return om1.c.e(it, null, null, fVar, Z, null, z13, 0, 979);
        }
    }

    public final yl1.b e(yl1.b it) {
        int i13 = this.f69133i;
        Object obj = this.f69134j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = wh0.c.f129901g;
                return yl1.b.f(it, bs1.c.j2(new String[0], ((wh0.c) obj).f129911c == null ? x0.next : v70.c.finish), false, null, null, null, null, null, null, 0, null, 1022);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = wh0.e.f129905f;
                return yl1.b.f(it, bs1.c.j2(new String[0], ((wh0.e) obj).f129911c == null ? x0.next : v70.c.finish), false, null, null, null, null, null, null, 0, null, 1022);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(((sh0.b) obj).f112919b), false, null, null, null, null, null, null, 0, null, 1022);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = ((ResetPasswordView) obj).getResources().getString(yr1.c.account_recovery_okay);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                return yl1.b.f(it, new f0(string), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String A = ((c6) obj).A();
                if (A == null) {
                    A = "";
                }
                return yl1.b.f(it, bs1.c.h2(A), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    public final void f(Throwable th3) {
        int i13 = this.f69133i;
        Object obj = this.f69134j;
        switch (i13) {
            case 6:
                ((ki0.c) ((ei0.a) ((fi0.c) obj).getView())).f7().d(new of0.a(new l()));
                return;
            case 7:
                ki0.c cVar = (ki0.c) ((ei0.a) obj);
                k kVar = cVar.f79785k0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                String string = cVar.getString(x0.generic_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                kVar.i(string);
                return;
            default:
                if (((gi0.a) ((ii0.a) obj).getViewIfBound()) != null) {
                    a.c.y(u.f85943a);
                    return;
                }
                return;
        }
    }

    public final void h(n buildAndStart) {
        int i13 = this.f69133i;
        Object obj = this.f69134j;
        switch (i13) {
            case 22:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$buildAndStart");
                x xVar = (x) obj;
                n.b(buildAndStart, xVar.f62330c);
                w60.d dVar = xVar.f62331d;
                buildAndStart.a(dVar, new k6(21), dVar.a());
                break;
            default:
                Intrinsics.checkNotNullParameter(buildAndStart, "$this$start");
                v vVar = (v) obj;
                j jVar = vVar.f72547c;
                buildAndStart.a(jVar, new k6(22), jVar.a());
                i60.a aVar = vVar.f72548d;
                buildAndStart.a(aVar, new k6(23), aVar.a());
                p70.e eVar = vVar.f72549e;
                buildAndStart.a(eVar, new k6(24), eVar.a());
                i60.a aVar2 = vVar.f72550f;
                buildAndStart.a(aVar2, new k6(25), aVar2.a());
                k92.l lVar = vVar.f72553i;
                buildAndStart.a(lVar, new k6(27), lVar.a());
                il0.u uVar = vVar.f72551g;
                buildAndStart.a(uVar, new k6(26), uVar.a());
                d0 d0Var = vVar.f72552h;
                buildAndStart.a(d0Var, new k6(28), d0Var.a());
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int indexOf;
        ik0.a aVar;
        int i13 = this.f69133i;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        Object obj2 = this.f69134j;
        switch (i13) {
            case 0:
                f fVar = (f) obj;
                Intrinsics.checkNotNullParameter(fVar, "$this$null");
                return Boolean.valueOf(fVar.f69148e == ((a0) obj2));
            case 1:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                ExpressSurveyView expressSurveyView = (ExpressSurveyView) obj2;
                CharSequence a03 = j1.a0(expressSurveyView.getContext().getString(rh0.e.brand_survey_learn_more));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                Context context = expressSurveyView.getContext();
                int i17 = eo1.b.color_themed_base_red_300;
                Object obj3 = d5.a.f53679a;
                bind.f(h.l0(context.getColor(i17), a03));
                bind.f108896k = true;
                return Unit.f80348a;
            case 2:
                return e((yl1.b) obj);
            case 3:
                return e((yl1.b) obj);
            case 4:
                return e((yl1.b) obj);
            case 5:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.p2(((xh0.h) obj2).f134980x.f112918a), null, e0.b(vn1.b.CENTER), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097146);
            case 6:
                f((Throwable) obj);
                return Unit.f80348a;
            case 7:
                f((Throwable) obj);
                return Unit.f80348a;
            case 8:
                f((Throwable) obj);
                return Unit.f80348a;
            case 9:
                return e((yl1.b) obj);
            case 10:
                i iVar = (i) obj;
                if (ni0.c.f90574a[iVar.f64754b.ordinal()] == 1) {
                    ni0.d dVar = (ni0.d) obj2;
                    Iterator it2 = dVar.d().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            int i18 = i15 + 1;
                            if (i15 < 0) {
                                kotlin.collections.f0.p();
                                throw null;
                            }
                            f30 f30Var = (f30) next;
                            if (Intrinsics.d(f30Var.getUid(), iVar.f64753a)) {
                                b40.Z0((f30) dVar.d().get(i15), d40.COMPLETE_HIDDEN);
                                ArrayList arrayList = dVar.f126435b;
                                if (!arrayList.isEmpty() && (indexOf = arrayList.indexOf(f30Var)) != -1) {
                                    arrayList.remove(f30Var);
                                    sq0.d0 adapter = dVar.getAdapter();
                                    if (adapter != null) {
                                        ((b2) adapter).p(indexOf);
                                    }
                                }
                            } else {
                                i15 = i18;
                            }
                        }
                    }
                }
                return Unit.f80348a;
            case 11:
                return b((om1.c) obj);
            case 12:
                return e((yl1.b) obj);
            case 13:
                ej0.b it3 = (ej0.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                r rVar = ((cj0.f) obj2).f27814b;
                if (rVar != null) {
                    rVar.a(new l0(it3));
                    return Unit.f80348a;
                }
                Intrinsics.r("eventIntake");
                throw null;
            case 14:
                return b((om1.c) obj);
            case 15:
                o12.b response = (o12.b) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                List list = response.f92783a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof f30) {
                        arrayList2.add(obj4);
                    }
                }
                dj0.f fVar2 = (dj0.f) obj2;
                ArrayList arrayList3 = new ArrayList(g0.q(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    int i19 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    arrayList3.add(new cj0.i(i14, (f30) next2, fVar2.f55134b));
                    i14 = i19;
                }
                return new o82.l0(arrayList3, response.f92784b);
            case 16:
                Navigation navigateToBoard = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                navigateToBoard.z(gl0.b.BOARD_NEW_IDEA_TAB.ordinal(), "com.pinterest.EXTRA_SELECTED_BOARD_CONTENT_TAB");
                navigateToBoard.z(((x22.c) obj2).getValue(), "com.pinterest.EXTRA_IDEAS_REFERRER_TYPE");
                return Unit.f80348a;
            case 17:
                float floatValue = ((Number) obj).floatValue();
                mj0.a aVar2 = ((tj0.h) obj2).X0;
                if (aVar2 != null) {
                    pj0.s sVar = (pj0.s) aVar2;
                    if (floatValue >= 1.0f) {
                        nx.d0.B(sVar.getPinalytics(), f1.BOTTOM_SHEET_SNAP_FULLY_OPEN, null, null, null, 30);
                    }
                }
                return Unit.f80348a;
            case 18:
                Intrinsics.checkNotNullParameter((om1.l) obj, "it");
                ((tj0.v) ((tj0.e0) obj2)).a();
                return Unit.f80348a;
            case 19:
                kn1.b it5 = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                vj0.b bVar = (vj0.b) obj2;
                int i23 = vj0.b.f125917i0;
                p pVar = ((Boolean) bVar.f125919h0.getValue()).booleanValue() ? p.LEFT_ARROW : p.DISMISS;
                hn1.c cVar = ((Boolean) bVar.f125919h0.getValue()).booleanValue() ? new hn1.c(q.CANCEL, null, null, 14) : null;
                hn1.q qVar = hn1.q.Center;
                int i24 = g.about_board_recommendations_title;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return kn1.b.e(it5, false, false, qVar, new k0(i24, new ArrayList(0)), pVar, cVar, null, 1938);
            case 20:
                ao1.b it6 = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return ao1.b.e(it6, bs1.c.h2(((bk0.c) obj2).f23148a), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            case 21:
                yl1.l bind2 = (yl1.l) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                bind2.f139349b = ((fk0.a) obj2).f62274a;
                return Unit.f80348a;
            case 22:
                h((n) obj);
                return Unit.f80348a;
            case 23:
                Integer num = (Integer) obj;
                Intrinsics.f(num);
                int intValue = num.intValue();
                hk0.j jVar = (hk0.j) obj2;
                int i25 = jVar.f69323k;
                Context context2 = jVar.f69313a;
                if (intValue > i25) {
                    if (!jVar.f69324l) {
                        jVar.f69324l = true;
                        float dimension = context2.getResources().getDimension(r0.lego_floating_nav_bottom_screen_offset) + context2.getResources().getDimension(r0.lego_floating_nav_bottom_bar_height);
                        View view = jVar.f69321i;
                        if (view != null) {
                            view.animate().translationY((-1) * dimension).setStartDelay(0L).setInterpolator(new DecelerateInterpolator(1.5f)).setListener(new hk0.d(jVar, i16)).start();
                        }
                    }
                } else if (num.intValue() < jVar.f69323k && !jVar.f69324l) {
                    jVar.f69324l = true;
                    float dimension2 = context2.getResources().getDimension(r0.lego_floating_nav_bottom_screen_offset);
                    View view2 = jVar.f69321i;
                    if (view2 != null) {
                        view2.animate().translationY((-1) * dimension2).setStartDelay(0L).setInterpolator(new DecelerateInterpolator(2.0f)).setListener(new hk0.d(jVar, r7 ? 1 : 0)).start();
                    }
                }
                jVar.f69323k = num.intValue();
                return Unit.f80348a;
            case 24:
                int intValue2 = ((Number) obj).intValue();
                k41.b.Companion.getClass();
                k41.b a13 = k41.a.a(intValue2);
                int i26 = a13 != null ? jk0.c.f76375a[a13.ordinal()] : -1;
                if (i26 == 1) {
                    ik0.a aVar3 = ((jk0.d) obj2).f76381f;
                    if (aVar3 != null) {
                        aVar3.f72403f.X(u0.CREATE_STORY_PIN_BUTTON);
                        if (aVar3.isBound()) {
                            jk0.d dVar2 = (jk0.d) ((jk0.a) aVar3.getView());
                            dVar2.getClass();
                            String boardId = aVar3.f72398a;
                            Intrinsics.checkNotNullParameter(boardId, "boardId");
                            Context context3 = dVar2.getContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                            t.M0(dVar2.f76378c, context3, ou1.e.BOARD_PLUS_BUTTON, boardId, aVar3.f72399b, 0, 32);
                            dVar2.dismiss();
                        }
                    }
                } else if (i26 == 2) {
                    ik0.a aVar4 = ((jk0.d) obj2).f76381f;
                    if (aVar4 != null) {
                        aVar4.f72403f.X(u0.COLLAGE_BUTTON);
                        if (aVar4.isBound()) {
                            jk0.d dVar3 = (jk0.d) ((jk0.a) aVar4.getView());
                            dVar3.getClass();
                            t.L0(dVar3.f76378c, null, null, d32.c.BOARD_TOOLBAR_ACTION_SHEET_COLLAGE_BUTTON, null, 22);
                            dVar3.dismiss();
                        }
                    }
                } else if (i26 == 3) {
                    ik0.a aVar5 = ((jk0.d) obj2).f76381f;
                    if (aVar5 != null) {
                        aVar5.f72403f.X(u0.CREATE_SECTION_BUTTON);
                        NavigationImpl w13 = Navigation.w1((ScreenLocation) com.pinterest.screens.t.f51365f.getValue());
                        w13.m0("com.pinterest.EXTRA_BOARD_ID", aVar5.f72398a);
                        w13.m0("com.pinterest.EXTRA_BOARD_SECTION_ACTION_MODE", com.pinterest.feature.boardsection.a.BOARD_ADD_SECTION.getValue());
                        aVar5.f72400c.d(w13);
                        if (aVar5.isBound()) {
                            ((jk0.d) ((jk0.a) aVar5.getView())).dismiss();
                        }
                    }
                } else if (i26 == 4 && (aVar = ((jk0.d) obj2).f76381f) != null) {
                    aVar.f72403f.X(u0.BOARD_ADD_COLLABORATOR_BUTTON);
                    if (aVar.isBound()) {
                        ((jk0.d) ((jk0.a) aVar.getView())).dismiss();
                    }
                    v7 v7Var = (v7) aVar.f72401d.O(aVar.f72398a);
                    if (v7Var != null) {
                        aVar.f72402e.n(v7Var, 5, aVar.f72400c, false, 1);
                    }
                }
                return Unit.f80348a;
            case 25:
                BoardFeed it7 = (BoardFeed) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                List q13 = it7.q();
                Intrinsics.checkNotNullExpressionValue(q13, "getItems(...)");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : q13) {
                    if (obj5 instanceof v7) {
                        arrayList4.add(obj5);
                    }
                }
                qk0.c cVar2 = (qk0.c) obj2;
                ArrayList arrayList5 = new ArrayList();
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    Object next3 = it8.next();
                    if (!Intrinsics.d(((v7) next3).getUid(), cVar2.f104049k)) {
                        arrayList5.add(next3);
                    }
                }
                List y03 = CollectionsKt.y0(arrayList5, 10);
                return y03.isEmpty() ^ true ? e0.b(new qk0.a(y03, cVar2.f104052n, cVar2.f104049k)) : q0.f80391a;
            case 26:
                y it9 = (y) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                sk0.f fVar3 = (sk0.f) obj2;
                List boardToolList = fVar3.f113054a;
                String boardId2 = it9.f113091b;
                Intrinsics.checkNotNullParameter(boardToolList, "boardToolList");
                Intrinsics.checkNotNullParameter(boardId2, "boardId");
                zy.l0 pinalyticsVMState = it9.f113097h;
                Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
                return new y(boardToolList, boardId2, it9.f113092c, it9.f113093d, fVar3.f113055b, fVar3.f113056c, fVar3.f113057d, pinalyticsVMState);
            case 27:
                i0 priorVMState = (i0) obj;
                Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
                tk0.g gVar = (tk0.g) obj2;
                return i0.b(priorVMState, null, gVar.f117962a, gVar.f117963b, gVar.f117964c, gVar.f117965d, 543);
            case 28:
                tk0.e it10 = (tk0.e) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                return tk0.e.e(it10, null, null, null, ((tk0.n) ((tk0.q) obj2)).f117985a, 7);
            default:
                h((n) obj);
                return Unit.f80348a;
        }
    }
}
