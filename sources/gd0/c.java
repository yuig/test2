package gd0;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.view.ViewGroup;
import c50.k6;
import cj0.c0;
import com.google.android.gms.internal.measurement.x;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.creatorHub.feature.hub.data.CreatorHubRecentPinsRemoteRequest;
import com.pinterest.creatorHub.feature.hub.view.components.CreatorHubStatsRow;
import com.pinterest.education.view.EducationNewContainerView;
import com.pinterest.education.view.EducationPromptView;
import com.pinterest.feature.board.collab.service.BoardActionService;
import com.pinterest.feature.board.common.newideas.view.OneTapSaveCarouselPinView;
import com.pinterest.feature.board.common.newideas.view.OneTapSavePinVideoGridCell;
import com.pinterest.feature.board.create.namingview.view.BoardCreateBoardNameSuggestionCell;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.bannerOverlay.GestaltBannerOverlay;
import df.j1;
import fk0.w;
import i32.y0;
import ja.j0;
import ja.y;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kl2.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.s;
import lh0.g1;
import retrofit2.HttpException;
import rm1.m;
import tb0.k;
import tj0.z;
import u50.f0;
import u50.i0;
import u50.k0;
import ug0.i;
import uj2.b0;
import vb0.j;
import wl1.n;
import x40.b7;
import x40.c7;
import x40.f7;
import x40.g7;
import x40.h7;
import x40.i7;
import x40.j7;
import x40.k7;
import x40.l7;
import zy.d0;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64808i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f64809j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f64810k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13, Object obj, Object obj2) {
        super(1);
        this.f64808i = i13;
        this.f64809j = obj;
        this.f64810k = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, rm1.m] */
    public final om1.c b(om1.c it) {
        m mVar;
        m mVar2;
        int i13 = this.f64808i;
        Object obj = this.f64810k;
        Object obj2 = this.f64809j;
        switch (i13) {
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                mVar = ((OneTapSaveCarouselPinView) obj2).oneTapSaveIcon;
                return om1.c.e(it, mVar, (om1.e) obj, null, null, bs1.c.j2(new String[0], f70.c.one_tap_save_more_ideas_pin), false, 0, 1004);
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                ?? r53 = ((z) obj2).f117918j;
                om1.e eVar = (om1.e) obj;
                int i14 = f70.c.one_tap_save_more_ideas_pin;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return om1.c.e(it, r53, eVar, null, null, new k0(i14, new ArrayList(0)), false, 0, 1004);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                mVar2 = ((OneTapSavePinVideoGridCell) obj2).oneTapSaveIcon;
                return om1.c.e(it, mVar2, (om1.e) obj, null, null, bs1.c.j2(new String[0], f70.c.one_tap_save_more_ideas_pin), false, 0, 1004);
        }
    }

    public final rn1.a e(rn1.a it) {
        vn1.c cVar;
        Integer num;
        String n13;
        String n14;
        int i13 = this.f64808i;
        Object obj = this.f64809j;
        Object obj2 = this.f64810k;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                fd0.h hVar = (fd0.h) obj;
                f0 h23 = bs1.c.h2(hVar.f61853c.f61844a);
                fm1.c cVar2 = fm1.c.VISIBLE;
                fd0.d dVar = hVar.f61853c.f61845b;
                int i14 = CreatorHubStatsRow.f44814h;
                ((CreatorHubStatsRow) obj2).getClass();
                int i15 = jd0.d.f75486a[dVar.ordinal()];
                if (i15 == 1) {
                    cVar = vn1.c.SUCCESS;
                } else if (i15 == 2) {
                    cVar = vn1.c.ERROR;
                } else {
                    if (i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = vn1.c.DEFAULT;
                }
                return rn1.a.y(it, h23, cVar, null, null, null, 0, cVar2, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2((String) obj2), null, null, null, null, 0, d7.b.Z(((fd0.g) obj).f61849b), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(it, "displayState");
                i0 i0Var = it.f108849g;
                EducationPromptView educationPromptView = (EducationPromptView) obj;
                String str = (String) obj2;
                int i16 = EducationPromptView.f45011f;
                educationPromptView.getClass();
                Matcher matcher = Pattern.compile("\\{\\d+\\}").matcher(str);
                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(str);
                while (matcher.find()) {
                    try {
                        String group = matcher.group(0);
                        Integer valueOf = (group == null || (n13 = kotlin.text.z.n(group, "}", "")) == null || (n14 = kotlin.text.z.n(n13, "{", "")) == null) ? null : Integer.valueOf(Integer.parseInt(n14));
                        if (valueOf != null) {
                            num = Integer.valueOf(valueOf.intValue() == 0 ? jg0.b.responsive_hf_icon : -1);
                        } else {
                            num = null;
                        }
                    } catch (NumberFormatException unused) {
                        j.f125466a.N(null, a.a.j("Failed to parse int from education display_data for ", matcher.group(0)), new Object[0]);
                    }
                    if (num != null && num.intValue() == -1) {
                    }
                    newSpannable.setSpan(num != null ? new ImageSpan(educationPromptView.getContext(), num.intValue()) : null, matcher.start(), matcher.end(), 33);
                }
                Intrinsics.f(newSpannable);
                f0 text = bs1.c.h2(newSpannable);
                Intrinsics.checkNotNullParameter(text, "text");
                return new rn1.a(text, it.f108850h, it.f108851i, it.f108852j, it.f108853k, it.f108854l, it.f108855m, it.f108856n, it.f108857o, it.f108858p, it.f108859q, it.f108860r, it.f108861s, it.f108862t, it.f108863u, it.f108864v, it.f108865w, it.f108866x, it.f108867y, it.f108868z, it.A);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, kotlin.collections.f0.j((vn1.e) obj, (vn1.e) obj2), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097143);
            default:
                Intrinsics.checkNotNullParameter(it, "state");
                CharSequence a03 = j1.a0((String) obj2);
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(a03), null, e0.b((vn1.b) obj), null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097146);
        }
    }

    public final void f(Throwable it) {
        int i13 = this.f64808i;
        Object obj = this.f64810k;
        Object obj2 = this.f64809j;
        switch (i13) {
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                g1 g1Var = (g1) obj2;
                String str = (String) obj;
                synchronized (g1Var.f83363o) {
                    g1Var.f83362n.remove(str);
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                BoardActionService boardActionService = (BoardActionService) obj2;
                com.pinterest.pushnotification.f fVar = (com.pinterest.pushnotification.f) obj;
                int i14 = BoardActionService.f45114b;
                boardActionService.getClass();
                HttpException httpException = it instanceof HttpException ? (HttpException) it : null;
                HashSet hashSet = tb0.h.f117076w;
                tb0.h hVar = tb0.g.f117075a;
                hVar.o("BoardInviteService:InviteAcceptFail - " + (httpException != null ? httpException.getMessage() : null), it);
                com.pinterest.pushnotification.h.a("InviteAccept", it);
                Intrinsics.checkNotNullParameter("InviteAccept", "failureValue");
                k kVar = new k();
                kVar.c("Failure", "InviteAccept");
                hVar.k("BoardNotificationAccept", kVar.f117102a);
                String str2 = httpException != null ? httpException.f107722b : null;
                if (str2 == null) {
                    str2 = boardActionService.getString(pz1.e.board_notification_toast_failure_message);
                    Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
                }
                new Handler(Looper.getMainLooper()).post(new dp.a(13, boardActionService, str2));
                if (d5.a.a(boardActionService, "android.permission.POST_NOTIFICATIONS") != 0) {
                    new Thread(new y(fVar, boardActionService, boardActionService, 14)).start();
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        eh0.a aVar;
        String str;
        ym1.d dVar;
        b7 b7Var;
        c7 c7Var;
        i7 i7Var;
        List list;
        String str2;
        int i13 = this.f64808i;
        int i14 = 18;
        int i15 = 19;
        int i16 = 0;
        Object obj2 = this.f64810k;
        Object obj3 = this.f64809j;
        switch (i13) {
            case 0:
                int intValue = ((Number) obj).intValue();
                d dVar2 = (d) obj3;
                l lVar = dVar2.H;
                Object valueOf = Integer.valueOf(intValue);
                Object obj4 = (String) obj2;
                List d2 = dVar2.d();
                ArrayList arrayList = new ArrayList(g0.q(d2, 10));
                Iterator it = d2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((dl1.s) it.next()).getUid());
                }
                lVar.invoke(valueOf, obj4, arrayList);
                return Unit.f80348a;
            case 1:
                Map<String, String> it2 = (Map) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                CreatorHubRecentPinsRemoteRequest creatorHubRecentPinsRemoteRequest = (CreatorHubRecentPinsRemoteRequest) obj3;
                x12.a pagedListService = creatorHubRecentPinsRemoteRequest.getPagedListService();
                Object obj5 = ((j90.b) obj2).getParams()[0];
                Intrinsics.g(obj5, "null cannot be cast to non-null type kotlin.String");
                return pagedListService.b((String) obj5, creatorHubRecentPinsRemoteRequest.maybeFreezeParameters(it2));
            case 2:
                return e((rn1.a) obj);
            case 3:
                return e((rn1.a) obj);
            case 4:
                Integer it3 = (Integer) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                ((h0) obj3).f80426a = it3.intValue();
                xd0.f fVar = ((de0.d) obj2).f54556a;
                long time = vb0.g.a(vb0.g.b(new Date()), -30).getTime();
                fVar.getClass();
                return de0.d.e(new fk2.h(new xd0.b(fVar, time, i16), 2));
            case 5:
                Boolean success = (Boolean) obj;
                Intrinsics.checkNotNullParameter(success, "success");
                if (!success.booleanValue()) {
                    return b0.j(Boolean.FALSE);
                }
                x xVar = (x) obj3;
                cw0.e eVar = (cw0.e) obj2;
                String uid = com.bumptech.glide.d.Q((b60.b) xVar.f31695c).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                ae0.e eVar2 = (ae0.e) ((ae0.a) xVar.f31694b);
                eVar2.getClass();
                ja.f0 d13 = ja.f0.d(2, "SELECT count(*) FROM idea_pin_recently_used_content WHERE user_id = ? AND content_type =?");
                d13.c1(1, uid);
                eVar2.f15046c.getClass();
                d13.c1(2, xa0.j.e(eVar));
                kk2.m mVar = new kk2.m(j0.b(new ae0.d(eVar2, d13, r6 ? 1 : 0)), new lb0.c(i15, new sv.y(xVar, uid, eVar, i14)), 0);
                Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
                return mVar;
            case 6:
                Intrinsics.checkNotNullParameter((n) obj, "it");
                ((rg0.n) obj3).c(null, null);
                HashSet hashSet = EducationNewContainerView.A;
                ((EducationNewContainerView) obj2).m();
                return Unit.f80348a;
            case 7:
                Integer num = (Integer) obj;
                GestaltBannerOverlay gestaltBannerOverlay = (GestaltBannerOverlay) obj3;
                EducationNewContainerView educationNewContainerView = (EducationNewContainerView) obj2;
                ViewGroup.LayoutParams layoutParams = gestaltBannerOverlay.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                educationNewContainerView.setGravity(80);
                int i17 = educationNewContainerView.f45007w;
                int i18 = i17 * 2;
                marginLayoutParams.setMargins(i18, 0, i18, num.intValue() + i17);
                gestaltBannerOverlay.setLayoutParams(marginLayoutParams);
                return Unit.f80348a;
            case 8:
                return e((rn1.a) obj);
            case 9:
                ((Function1) obj3).invoke((y0) obj2);
                return Unit.f80348a;
            case 10:
                vd0.c response = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return ((i) obj3).b((nl.b) obj2, response);
            case 11:
                return e((rn1.a) obj);
            case 12:
                cm1.d state = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                eh0.b bVar = (eh0.b) obj2;
                return cm1.d.e(state, yl1.b.f(state.f28012a, bs1.c.h2(((eh0.b) obj3).f58915a.f58913a), false, null, null, yl1.d.PRIMARY.getColorPalette(), null, null, null, 0, null, 1006), yl1.b.f(state.f28013b, (bVar == null || (aVar = bVar.f58915a) == null || (str = aVar.f58913a) == null) ? u50.h0.f120562a : bs1.c.h2(str), false, (bVar != null ? bVar.f58915a : null) == null ? fm1.c.GONE : fm1.c.VISIBLE, null, yl1.d.SECONDARY.getColorPalette(), null, null, null, 0, null, 1002), yl1.c.LARGE, null, null, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW);
            case 13:
                ym1.c it4 = (ym1.c) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                eg0.e eVar3 = (eg0.e) obj3;
                String string = eVar3.f58897c;
                Intrinsics.checkNotNullParameter(string, "string");
                List b13 = e0.b(new f0(string));
                ((jh0.e) obj2).getClass();
                eg0.d dVar3 = eVar3.f58898d;
                if (dVar3 != null) {
                    dVar = new ym1.d(new f0(String.valueOf(dVar3.getText())), dVar3.getHideCompleteButton() ? fm1.c.GONE : fm1.c.VISIBLE);
                } else {
                    dVar = null;
                }
                return ym1.c.e(it4, b13, dVar, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL);
            case 14:
                f((Throwable) obj);
                return Unit.f80348a;
            case 15:
                em1.d it5 = (em1.d) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return em1.d.e(it5, ((xh0.g) obj2).f134961u ? em1.b.CHECKED : em1.b.UNCHECKED, null, null, bs1.c.h2(((sh0.b) obj3).f112919b), null, null, 4, rn1.b.END, false, 0, 822);
            case 16:
                return e((rn1.a) obj);
            case 17:
                cj0.g it6 = (cj0.g) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return cj0.g.e(it6, ((c0) obj3).f27788c.a(((zo.c) obj2).toGridRepStyle()), null, null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 18:
                l82.n start = (l82.n) obj;
                Intrinsics.checkNotNullParameter(start, "$this$start");
                cj0.e0 e0Var = (cj0.e0) obj3;
                mb0.a aVar2 = (mb0.a) e0Var.f27811i.f63225b;
                start.a(aVar2, new k6(16), aVar2.a());
                w60.d dVar4 = e0Var.f27808f;
                start.a(dVar4, new k6(i15), dVar4.a());
                d0 d0Var = e0Var.f27809g;
                start.a(d0Var, new k6(20), d0Var.a());
                fj0.c cVar = e0Var.f27807e;
                start.a(cVar, new k6(17), cVar.a());
                fj0.a aVar3 = new fj0.a((il1.a) obj2, (e02.a) e0Var.f27810h.f114061a.f114076a.f113757jd.get());
                start.a(aVar3, new k6(i14), aVar3.a());
                return Unit.f80348a;
            case 19:
                rn1.i it7 = (rn1.i) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                if (it7 instanceof rn1.f) {
                    ((Function1) obj3).invoke((dl0.e) obj2);
                }
                return Unit.f80348a;
            case 20:
                f((Throwable) obj);
                return Unit.f80348a;
            case 21:
                v7 v7Var = (v7) obj;
                pj0.m mVar2 = (pj0.m) obj3;
                mVar2.f100256j0 = true;
                f30 f30Var = (f30) obj2;
                i92.k.d(mVar2.Z, new lr.l(v7Var.getUid(), v7Var.j1(), bs1.c.B0(f30Var), f30Var.getUid(), mVar2.f100254h0));
                return Unit.f80348a;
            case 22:
                return b((om1.c) obj);
            case 23:
                return b((om1.c) obj);
            case 24:
                return b((om1.c) obj);
            case 25:
                en1.d it8 = (en1.d) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                return en1.d.e(it8, bs1.c.p2((String) obj2), null, null, false, null, ((BoardCreateBoardNameSuggestionCell) obj3).f45158b, false, 0, 446);
            case 26:
                Intrinsics.checkNotNullParameter((w) obj, "it");
                return w.b((w) obj3, ((fk0.b) ((fk0.g) obj2)).f62275a, false, 2);
            case 27:
                Intrinsics.checkNotNullParameter((fk0.a) obj, "it");
                fk0.a aVar4 = (fk0.a) obj3;
                r6 = ((fk0.b) ((fk0.g) obj2)).f62275a.length() > 0;
                aVar4.getClass();
                return new fk0.a(r6);
            case 28:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                l7 l7Var = (l7) ((pc.h) obj).f99563c;
                if (l7Var != null && (b7Var = l7Var.f132705a) != null) {
                    Intrinsics.checkNotNullParameter(b7Var, "<this>");
                    k7 k7Var = b7Var instanceof k7 ? (k7) b7Var : null;
                    if (k7Var != null && (c7Var = k7Var.f132668e) != null) {
                        Intrinsics.checkNotNullParameter(c7Var, "<this>");
                        j7 j7Var = c7Var instanceof j7 ? (j7) c7Var : null;
                        if (j7Var != null && (i7Var = j7Var.f132594b) != null && (list = i7Var.f132543a) != null) {
                            String str3 = (String) obj2;
                            Iterator it9 = CollectionsKt.Q(list).iterator();
                            while (it9.hasNext()) {
                                g7 g7Var = ((h7) it9.next()).f132491a;
                                if (g7Var != null) {
                                    f7 f7Var = g7Var.f132436e;
                                    if (f7Var != null) {
                                        Intrinsics.checkNotNullParameter(f7Var, "<this>");
                                        arrayList2.add(f7Var);
                                    }
                                    Intrinsics.checkNotNullParameter(g7Var, "<this>");
                                    if (str3 != null) {
                                        if (!Intrinsics.d(f7Var != null ? f7Var.f132378c : null, str3)) {
                                        }
                                    }
                                    Intrinsics.checkNotNullParameter(g7Var, "<this>");
                                    Intrinsics.checkNotNullParameter(g7Var, "<this>");
                                    if (str3 != null) {
                                        if (!Intrinsics.d(f7Var != null ? f7Var.f132378c : null, str3)) {
                                        }
                                    }
                                    if (!Intrinsics.d(g7Var.f132435d, "accepted") && f7Var != null && (str2 = f7Var.f132378c) != null) {
                                        arrayList3.add(str2);
                                    }
                                }
                            }
                        }
                    }
                }
                mk0.e eVar4 = (mk0.e) obj3;
                eVar4.f87344r = arrayList3.size() > 0;
                eVar4.p3(arrayList2, arrayList3);
                return Unit.f80348a;
            default:
                sl1.i it10 = (sl1.i) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                lk0.b bVar2 = (lk0.b) obj2;
                return sl1.i.e(it10, (List) obj3, bVar2.f83643c + 1, null, bVar2.f83641a, null, null, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i13, Object obj) {
        super(1);
        this.f64808i = i13;
        this.f64810k = str;
        this.f64809j = obj;
    }
}
