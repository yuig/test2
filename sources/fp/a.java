package fp;

import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.q;
import aq.c;
import aq.f;
import aq.g;
import aq.m;
import b01.l;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hb;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.l4;
import dq0.j;
import dq0.p;
import f2.o;
import h32.f1;
import i32.y0;
import i92.k;
import is1.x;
import iz0.n;
import j1.v0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jc0.s;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.text.z;
import lr.b0;
import m60.w;
import mn0.e;
import mq.u;
import nl1.d;
import nx.d0;
import pe.i;
import rl2.g0;
import uq0.h;
import v.q1;
import x02.t1;
import x02.x0;
import zp.d1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f62751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f62752c;

    public /* synthetic */ a(int i13, Object obj, Object obj2) {
        this.f62750a = i13;
        this.f62751b = obj;
        this.f62752c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ak2.a
    public final void run() {
        int i13 = this.f62750a;
        int i14 = 0;
        int i15 = 1;
        Object obj = this.f62752c;
        Object obj2 = this.f62751b;
        switch (i13) {
            case 0:
                b this$0 = (b) obj2;
                Function0 function0 = (Function0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f62754a.clear();
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 1:
                g deleteActionListener = (g) obj2;
                c this$02 = (c) obj;
                Intrinsics.checkNotNullParameter(deleteActionListener, "$deleteActionListener");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ((q) deleteActionListener).B();
                v7 localBoard = (v7) this$02.f20344g.O(b40.i(this$02.f20340c));
                if (localBoard != null) {
                    x0 x0Var = this$02.f20344g;
                    x0Var.getClass();
                    Intrinsics.checkNotNullParameter(localBoard, "localBoard");
                    x0Var.c0(1, localBoard);
                    return;
                }
                return;
            case 2:
                f createActionListener = (f) obj2;
                m this$03 = (m) obj;
                Intrinsics.checkNotNullParameter(createActionListener, "$createActionListener");
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                String id3 = this$03.B();
                q1 q1Var = (q1) createActionListener;
                int i16 = q1Var.f123607a;
                Object obj3 = q1Var.f123608b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(id3, "id");
                        d1 d1Var = (d1) obj3;
                        d1Var.getEventManager().d(new of0.b());
                        d1Var.getEventManager().d(new hv0.a(hv0.b.CREATED, id3));
                        d1Var.getEventManager().d(new s(true));
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(id3, "id");
                        t11.f fVar = (t11.f) obj3;
                        fVar.f115802b.d(new of0.b());
                        fVar.f115802b.d(new hv0.a(hv0.b.CREATED, id3));
                        if (fVar.isBound()) {
                            ((d) ((q11.d) fVar.getView())).D5();
                            return;
                        }
                        return;
                }
            case 3:
                StringBuilder screenshotDirectory = (StringBuilder) obj2;
                u this$04 = (u) obj;
                int i17 = u.P0;
                Intrinsics.checkNotNullParameter(screenshotDirectory, "$screenshotDirectory");
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                String sb3 = screenshotDirectory.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                if (!z.j(sb3)) {
                    this$04.n8(sb3);
                    return;
                }
                return;
            case 4:
                w this_actionEvents = (w) obj2;
                sg0.g subscriber = (sg0.g) obj;
                Intrinsics.checkNotNullParameter(this_actionEvents, "$this_actionEvents");
                Intrinsics.checkNotNullParameter(subscriber, "$subscriber");
                this_actionEvents.j(subscriber);
                return;
            case 5:
                j0 screenshotDirectory2 = (j0) obj2;
                kl0.z this$05 = (kl0.z) obj;
                int i18 = kl0.z.f80128e2;
                Intrinsics.checkNotNullParameter(screenshotDirectory2, "$screenshotDirectory");
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                String str = (String) screenshotDirectory2.f80434a;
                if (str == null || this$05.getContext() == null || str.length() == 0) {
                    return;
                }
                x xVar = new x(str);
                xVar.a(this$05.getContext());
                this$05.Z1 = xVar;
                return;
            case 6:
                ll0.f this$06 = (ll0.f) obj2;
                v7 it = (v7) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(it, "$it");
                d0 d0Var = this$06.f83803b.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                d0.v(d0Var, f1.BOARD_DELETE, this$06.f83802a, false, 12);
                com.pinterest.feature.board.edit.a aVar = (com.pinterest.feature.board.edit.a) this$06.getViewIfBound();
                if (aVar != null) {
                    ((ol0.f) aVar).c8("com.pinterest.EXTRA_BOARD_EDIT_ACTION_DELETE");
                }
                String id4 = it.getId();
                Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                String j13 = it.j1();
                Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                String b13 = it.b1();
                lr.g gVar = new lr.g(j13, String.valueOf(b13), b0.Delete);
                v0 action = new v0(this$06, id4, j13, b13, 9);
                Intrinsics.checkNotNullParameter(action, "action");
                gVar.f84515h = action;
                this$06.f83809h.c(gVar);
                this$06.f83808g.f(new pg0.b());
                return;
            case 7:
                kn0.b this$07 = (kn0.b) obj2;
                kn0.d params = (kn0.d) obj;
                int i19 = kn0.b.f80216g;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(params, "$params");
                this$07.f80217a.remove(params);
                return;
            case 8:
                e this$08 = (e) obj2;
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                i.r1(this$08.f87773l, pin);
                return;
            case 9:
                pn0.b this$09 = (pn0.b) obj2;
                ym0.a reorderResult = (ym0.a) obj;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(reorderResult, "$reorderResult");
                if (this$09.isBound()) {
                    this$09.getPinalytics().a(f1.PIN_REORDER, reorderResult.f139397a, false, true);
                    this$09.M = true;
                    nn0.c cVar = (nn0.c) this$09.getViewIfBound();
                    if (cVar != null) {
                        boolean z13 = this$09.M;
                        GestaltButton gestaltButton = ((qn0.d) cVar).O0;
                        if (gestaltButton != null) {
                            gestaltButton.d(new bp.d(z13, 3));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                co0.d this$010 = (co0.d) obj2;
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(pair, "$pair");
                ba baVar = (ba) pair.f80346a;
                ba baVar2 = (ba) pair.f80347b;
                this$010.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("target_section_id", baVar2.getId());
                this$010.getPinalytics().g(f1.BOARD_SECTION_MERGE, baVar.getId(), hashMap, false);
                String A = baVar2.A();
                Intrinsics.checkNotNullExpressionValue(A, "getTitle(...)");
                this$010.f28279d.c(new lr.i(this$010.f28280e, A));
                v7 u13 = baVar2.u();
                String id5 = u13 != null ? u13.getId() : null;
                if (id5 != null && !z.j(id5)) {
                    int i23 = k70.e.board_section_moved_to_section_toast_message;
                    String A2 = baVar2.A();
                    Intrinsics.checkNotNullExpressionValue(A2, "getTitle(...)");
                    this$010.f28281f.a(new kn0.d(id5, hb.BOARD_SECTION_MERGE, bs1.c.j2(new String[]{A2}, i23), null, null));
                }
                if (this$010.isBound()) {
                    ao0.a aVar2 = (ao0.a) this$010.getView();
                    String sourceSectionId = baVar.getId();
                    Intrinsics.checkNotNullExpressionValue(sourceSectionId, "getUid(...)");
                    String destinationSectionId = baVar2.getId();
                    Intrinsics.checkNotNullExpressionValue(destinationSectionId, "getUid(...)");
                    do0.b bVar = (do0.b) aVar2;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(sourceSectionId, "sourceSectionId");
                    Intrinsics.checkNotNullParameter(destinationSectionId, "destinationSectionId");
                    Bundle bundle = new Bundle();
                    bundle.putString("com.pinterest.EXTRA_BOARD_SECTION_MERGE_SOURCE_ID", sourceSectionId);
                    bundle.putString("com.pinterest.EXTRA_BOARD_SECTION_MERGE_DESTINATION_ID", destinationSectionId);
                    Unit unit = Unit.f80348a;
                    bVar.P6("com.pinterest.EXTRA_BOARD_SECTION_MERGE_RESULT_CODE", bundle);
                    bVar.P7();
                    return;
                }
                return;
            case 11:
                p this$011 = (p) obj2;
                j event = (j) obj;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(event, "$event");
                this$011.W3(event);
                return;
            case 12:
                h this$012 = (h) obj2;
                t1 params2 = (t1) obj;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(params2, "$params");
                this$012.f123056f.remove(params2);
                return;
            case 13:
                bs0.c this$013 = (bs0.c) obj2;
                f30 pin2 = (f30) obj;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(pin2, "$pin");
                w wVar = this$013.f23854e;
                String id6 = pin2.getId();
                Intrinsics.checkNotNullExpressionValue(id6, "getUid(...)");
                wVar.d(new zr0.a(id6));
                return;
            case 14:
                gw0.e eVar = (gw0.e) obj2;
                File file = (File) obj;
                if (eVar != null) {
                    eVar.a(Uri.fromFile(file));
                    return;
                }
                return;
            case 15:
                px0.j this$014 = (px0.j) obj2;
                String itemId = (String) obj;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(itemId, "$itemId");
                this$014.f101622g.c(new jq0.a(zu1.e.undo_delete_news_hub_item_option_text, new px0.e(this$014, itemId, i14), new px0.e(this$014, itemId, i15), 1));
                return;
            case 16:
                j0 screenshotDirectory3 = (j0) obj2;
                n this$015 = (n) obj;
                int i24 = n.Y0;
                Intrinsics.checkNotNullParameter(screenshotDirectory3, "$screenshotDirectory");
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                String str2 = (String) screenshotDirectory3.f80434a;
                if (str2 != null) {
                    this$015.getClass();
                    if (str2.length() == 0) {
                        return;
                    }
                    x xVar2 = new x(str2);
                    xVar2.a(this$015.requireContext());
                    this$015.P0 = xVar2;
                    return;
                }
                return;
            case 17:
                j0 screenshotDirectory4 = (j0) obj2;
                l this$016 = (l) obj;
                int i25 = l.f20744r1;
                Intrinsics.checkNotNullParameter(screenshotDirectory4, "$screenshotDirectory");
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                String str3 = (String) screenshotDirectory4.f80434a;
                if (str3 != null) {
                    this$016.getClass();
                    if (str3.length() == 0) {
                        return;
                    }
                    x xVar3 = new x(str3);
                    xVar3.a(this$016.requireContext());
                    this$016.f20759o1 = xVar3;
                    return;
                }
                return;
            case 18:
                ak2.e onRepinSuccess = (ak2.e) obj2;
                Intrinsics.checkNotNullParameter(onRepinSuccess, "$onRepinSuccess");
                onRepinSuccess.accept((f30) obj);
                return;
            case 19:
                PinCloseupPresenter.onPinCloseupOneBarStoryLoaded$lambda$68$lambda$65((PinCloseupPresenter) obj2, (List) obj);
                return;
            case 20:
                g51.n this$017 = (g51.n) obj2;
                y0 placement = (y0) obj;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Intrinsics.checkNotNullParameter(placement, "$placement");
                ((dh0.d) this$017.f63637q).j(placement);
                return;
            case 21:
                j51.d0 this$018 = (j51.d0) obj2;
                j51.w recyclerEventListener = (j51.w) obj;
                int i26 = j51.d0.f74720s1;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                Intrinsics.checkNotNullParameter(recyclerEventListener, "$recyclerEventListener");
                this$018.B8(recyclerEventListener);
                return;
            case 22:
                s51.e this$019 = (s51.e) obj2;
                v7 board = (v7) obj;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                Intrinsics.checkNotNullParameter(board, "$board");
                u51.z zVar = (u51.z) ((q51.b) this$019.getView());
                zVar.getClass();
                Intrinsics.checkNotNullParameter(board, "board");
                k toastUtils = zVar.f120653s;
                if (toastUtils == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
                new o(toastUtils).invoke(board, Boolean.FALSE);
                ((u51.z) ((q51.b) this$019.getView())).dismiss();
                return;
            case 23:
                u51.e this$020 = (u51.e) obj2;
                rp0.d comment = (rp0.d) obj;
                int i27 = u51.e.f120601z0;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(comment, "$comment");
                this$020.z(u51.d.f120600i);
                wy0 w13 = comment.w();
                if (w13 != null) {
                    this$020.f7().d(new pg0.i(w13, comment));
                }
                this$020.Z7().m(this$020.getString(w02.b.report_confirmation_toast_message));
                return;
            case 24:
                o71.i this$021 = (o71.i) obj2;
                String query = (String) obj;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                Intrinsics.checkNotNullParameter(query, "$query");
                g0.e0((l71.n) this$021.f93302m.getValue(), query);
                return;
            case 25:
                o71.j0 this$022 = (o71.j0) obj2;
                String query2 = (String) obj;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                Intrinsics.checkNotNullParameter(query2, "$query");
                l71.b bVar2 = this$022.f93320x;
                if (bVar2 != null) {
                    Object item = bVar2.getItem(0);
                    n71.b bVar3 = item instanceof n71.b ? (n71.b) item : null;
                    if (bVar3 == null) {
                        return;
                    }
                    List list = bVar3.f89704a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (!Intrinsics.d(((br.d) obj4).f23704b, query2)) {
                            arrayList.add(obj4);
                        }
                    }
                    bVar2.u(e0.b(new n71.b(arrayList)));
                    return;
                }
                return;
            case 26:
                q91.d1 this$023 = (q91.d1) obj2;
                String languageCode = (String) obj;
                int i28 = q91.d1.f103082m0;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                Intrinsics.checkNotNullParameter(languageCode, "$languageCode");
                w f73 = this$023.f7();
                f73.d(new p91.k(bd1.b.LANGUAGE_FIELD, languageCode));
                f73.d(new p91.k(bd1.b.ADDITIONAL_LOCALES, CollectionsKt.Z(this$023.f103087g0, ",", null, null, 0, null, null, 62)));
                this$023.D5();
                k kVar = this$023.f103092l0;
                if (kVar != null) {
                    kVar.m(this$023.getString(h52.c.primaray_language_updated));
                    return;
                } else {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
            case 27:
                ab1.n this$024 = (ab1.n) obj2;
                String unformattedPhoneNumber = (String) obj;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                Intrinsics.checkNotNullParameter(unformattedPhoneNumber, "$unformattedNumber");
                bb1.w wVar2 = (bb1.w) ((ya1.e) this$024.getView());
                wVar2.getClass();
                String verifiedPassword = this$024.f1733c;
                Intrinsics.checkNotNullParameter(verifiedPassword, "verifiedPassword");
                Intrinsics.checkNotNullParameter(unformattedPhoneNumber, "unformattedPhoneNumber");
                NavigationImpl w14 = Navigation.w1(l4.c());
                w14.y0(verifiedPassword, "arg_verified_password");
                w14.y0(unformattedPhoneNumber, "arg_phone_number");
                String str4 = this$024.f1734d;
                if (str4 != null) {
                    w14.y0(str4, "arg_verified_email");
                }
                Intrinsics.checkNotNullExpressionValue(w14, "apply(...)");
                wVar2.M1(w14);
                return;
            case 28:
                ab1.q this$025 = (ab1.q) obj2;
                ya1.f view = (ya1.f) obj;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                Intrinsics.checkNotNullParameter(view, "$view");
                if (this$025.isBound()) {
                    ((bb1.z) view).b8(false);
                    return;
                }
                return;
            default:
                ob1.b this$026 = (ob1.b) obj2;
                com.pinterest.feature.settings.passcode.c mode = (com.pinterest.feature.settings.passcode.c) obj;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                Intrinsics.checkNotNullParameter(mode, "$mode");
                this$026.p3(mode, true, null);
                return;
        }
    }
}
