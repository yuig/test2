package ba;

import a.cb;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import ao2.p0;
import com.pinterest.activity.board.model.CollaboratorInviteFeed;
import com.pinterest.activity.newshub.view.content.NewsHubLibrofileView;
import com.pinterest.activity.pin.view.modules.PinCloseupFavoriteModule;
import com.pinterest.activity.pin.view.modules.util.AvatarWithTitleAndSubtitleView;
import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.activity.pin.view.unifiedcomments.CommentPreviewView;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.my0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z7;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.g1;
import h32.f1;
import h32.u0;
import i2.s0;
import i2.v3;
import j1.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kh2.g3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.j0;
import m60.x0;
import nx.c1;
import nx.d0;
import rq.a2;
import rq.k0;
import rr.a1;
import so.oa;
import z9.e0;
import zp.d1;

/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22291i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f22292j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f22293k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i13, Object obj, Object obj2) {
        super(1);
        this.f22291i = i13;
        this.f22292j = obj;
        this.f22293k = obj2;
    }

    public final s0 b() {
        int i13 = this.f22291i;
        Object obj = this.f22293k;
        Object obj2 = this.f22292j;
        switch (i13) {
            case 0:
                ((e0) obj2).D((androidx.lifecycle.z) obj);
                return new r();
            default:
                return new w0(6, (v3) obj2, (i) obj);
        }
    }

    public final rn1.a e(rn1.a it) {
        String str;
        int i13 = this.f22291i;
        str = "";
        Object obj = this.f22293k;
        Object obj2 = this.f22292j;
        switch (i13) {
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                wy0 wy0Var = ((NewsHubLibrofileView) obj2).f34960e;
                Intrinsics.f(wy0Var);
                String Z2 = wy0Var.Z2();
                return rn1.a.y(it, bs1.c.h2(Z2 != null ? Z2 : ""), null, null, null, null, 0, null, null, cb.y((wy0) obj, "getIsVerifiedMerchant(...)") ? new rm1.d(new rm1.f(rm1.q.CHECK_CIRCLE, rm1.i.LG), rm1.c.INFO, null, 0, null, 28) : null, null, false, 0, null, null, null, null, null, false, null, null, 2096894);
            case 17:
                Intrinsics.checkNotNullParameter(it, "state");
                k0 k0Var = (k0) obj2;
                mv it2 = (mv) obj;
                Intrinsics.checkNotNullExpressionValue(it2, "$it");
                int i14 = k0.f109323r;
                k0Var.getClass();
                String M = it2.M();
                if (M != null && M.length() != 0) {
                    str = it2.M();
                    Intrinsics.f(str);
                } else if (it2.I() != null) {
                    str = k0Var.getContext().getString(n80.f.board_conversation_thread_pin_shared);
                } else if (it2.D() != null) {
                    str = k0Var.getContext().getString(n80.f.board_conversation_thread_board_shared);
                } else if (it2.O() != null) {
                    str = k0Var.getContext().getString(n80.f.board_conversation_thread_profile_shared);
                }
                Intrinsics.f(str);
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 18:
                Intrinsics.checkNotNullParameter(it, "state");
                Context context = ((LinearLayout) obj2).getContext();
                int i15 = n80.f.board_conversation_thread_collaborator_messages_count;
                Object[] objArr = new Object[1];
                z7 z7Var = ((k0) obj).f109337p;
                objArr[0] = z7Var != null ? z7Var.u() : null;
                String string = context.getString(i15, objArr);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                a2 a2Var = (a2) obj2;
                return rn1.a.y(it, bs1.c.h2((String) obj), a2Var.f109098o, null, null, null, 0, a2Var.f109096m ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
        }
    }

    public final wn1.d f(wn1.d it) {
        CharSequence r13;
        int i13 = this.f22291i;
        Object obj = this.f22293k;
        Object obj2 = this.f22292j;
        switch (i13) {
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                String m03 = g3.m0((GestaltTextComposer) obj2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m03);
                sb3.append(obj);
                return wn1.d.e(it, bs1.c.h2(sb3.toString()), null, null, null, false, null, null, null, null, 8388606);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                rp0.d dVar = (rp0.d) obj2;
                String g13 = dVar.g();
                u50.k0 j23 = bs1.c.j2(new String[0], ob2.f.comment_composer_edit_placeholder);
                if (!dVar.q().isEmpty()) {
                    CommentComposerView commentComposerView = (CommentComposerView) obj;
                    up0.l lVar = commentComposerView.f35080m;
                    if (lVar == null) {
                        Intrinsics.r("typeaheadTextUtility");
                        throw null;
                    }
                    Context context = commentComposerView.f35086s.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    r13 = up0.l.c(lVar, context, dVar.r().concat(" "), dVar.q());
                } else {
                    r13 = dVar.r();
                }
                return wn1.d.e(it, bs1.c.h2(r13), j23, null, g13, false, null, null, null, null, 8387068);
        }
    }

    public final void h(v7 board) {
        int i13 = this.f22291i;
        Object obj = this.f22293k;
        Object obj2 = this.f22292j;
        switch (i13) {
            case 10:
                Intrinsics.checkNotNullParameter(board, "board");
                zp.w0 w0Var = (zp.w0) obj2;
                int i14 = zp.w0.f142526y0;
                w0Var.getClass();
                if (Intrinsics.d(((v7) obj).getUid(), w0Var.f142552n0)) {
                    w0Var.f142554o0 = board;
                    w0Var.f142552n0 = board != null ? board.getUid() : null;
                } else {
                    w0Var.f142546k0 = board;
                    w0Var.f142544j0 = board != null ? board.getUid() : null;
                }
                w0Var.K0(board);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(board, "board");
                d1 d1Var = (d1) obj2;
                int i15 = d1.f142360e0;
                d1Var.getClass();
                if (Intrinsics.d(((v7) obj).getUid(), d1Var.Q)) {
                    d1Var.R = board;
                    d1Var.Q = board != null ? board.getUid() : null;
                } else {
                    d1Var.N = board;
                    d1Var.M = board != null ? board.getUid() : null;
                }
                d1Var.G0(board);
                break;
            default:
                PinCloseupFavoriteModule pinCloseupFavoriteModule = (PinCloseupFavoriteModule) obj2;
                v7 v7Var = (v7) obj;
                int i16 = PinCloseupFavoriteModule.f34993s;
                pinCloseupFavoriteModule.getClass();
                if (board == null) {
                    board = v7Var;
                }
                if (!kh2.w.i0(board)) {
                    bs1.c.X0(pinCloseupFavoriteModule);
                    break;
                } else {
                    pinCloseupFavoriteModule.createViewIfNecessary();
                    bs1.c.U1(pinCloseupFavoriteModule);
                    break;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        if (d5.a.a(r10.f109723a.f104940a.getContext(), "android.permission.READ_MEDIA_VIDEO") == (-1)) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Boolean r34) {
        /*
            Method dump skipped, instructions count: 1186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.s.i(java.lang.Boolean):void");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cp.u uVar;
        View view;
        int i13 = this.f22291i;
        int i14 = 0;
        Object obj2 = this.f22293k;
        Object obj3 = this.f22292j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                j((Throwable) obj);
                return Unit.f80348a;
            case 3:
            case 4:
            default:
                f30 f30Var = (f30) obj;
                if (f30Var == null) {
                    ((a1) obj3).f109723a.q();
                } else {
                    a1 a1Var = (a1) obj3;
                    a1Var.f109702h.a(kotlin.collections.e0.b(a1Var.f109702h.b(f30Var)));
                    NavigationImpl z03 = Navigation.z0((ScreenLocation) g1.A.getValue(), f30Var.getUid());
                    String str = (String) obj2;
                    if (str != null && !kotlin.text.z.j(str)) {
                        z03.m0("com.pinterest.EXTRA_COMMENT_TYPE", "userdiditdata");
                        z03.m0("com.pinterest.EXTRA_COMMENT_ID", str);
                        f1 f1Var = f1.COMMUNITY_VIEW_INTENT;
                        String uid = f30Var.getUid();
                        HashMap hashMap = new HashMap();
                        hashMap.put("pin_id", f30Var.getUid());
                        Unit unit = Unit.f80348a;
                        d0.B(a1Var.f109703i, f1Var, null, uid, hashMap, 18);
                    }
                    a1Var.f109723a.m(z03);
                }
                return Unit.f80348a;
            case 5:
                ActivityResult result = (ActivityResult) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.f15931a == -1) {
                    ((com.facebook.login.q) obj3).M6().j(df.i.Login.toRequestCode(), result.f15931a, result.f15932b);
                } else {
                    ((FragmentActivity) obj2).finish();
                }
                return Unit.f80348a;
            case 6:
                CollaboratorInviteFeed boardInviteResponse = (CollaboratorInviteFeed) obj;
                Intrinsics.checkNotNullParameter(boardInviteResponse, "boardInviteResponse");
                ArrayList arrayList = new ArrayList();
                boardInviteResponse.q().forEach(new dg.c(arrayList, r3 ? 1 : 0));
                ArrayList arrayList2 = new ArrayList();
                for (TypeAheadItem typeAheadItem : (List) obj3) {
                    xo.d0 d0Var = (xo.d0) obj2;
                    v7 v7Var = d0Var.f135489s;
                    if (v7Var == null) {
                        Intrinsics.r("board");
                        throw null;
                    }
                    if (v7Var.k1() != null) {
                        v7 v7Var2 = d0Var.f135489s;
                        if (v7Var2 == null) {
                            Intrinsics.r("board");
                            throw null;
                        }
                        wy0 k13 = v7Var2.k1();
                        if (!Intrinsics.d(k13 != null ? k13.getUid() : null, typeAheadItem.A()) && !arrayList.contains(typeAheadItem.A())) {
                            arrayList2.add(typeAheadItem);
                        }
                    }
                }
                int size = arrayList2.size();
                Collection collection = arrayList2;
                if (size > 5) {
                    collection = arrayList2.subList(0, 5);
                }
                List F0 = CollectionsKt.F0(collection);
                xo.d0 d0Var2 = (xo.d0) obj2;
                ap.o oVar = d0Var2.f135488r;
                if (oVar != null) {
                    d0Var2.f135476f.j(new xo.v(F0, oVar, d0Var2));
                    return Unit.f80348a;
                }
                Intrinsics.r("uploadContactsUtil");
                throw null;
            case 7:
                int j13 = ((vd0.c) obj).j(0, "data");
                kp.o oVar2 = (kp.o) obj3;
                int i15 = cp.x.f52982a[oVar2.ordinal()];
                if (i15 == 1) {
                    Context context = kb0.a.f79058b;
                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().k(xc0.i.conversation_notifications_always_on_toast);
                    m60.u.f85943a.d(new mp.o(null, xc0.i.conversation_notifications_on));
                } else if (i15 != 2) {
                    Context context2 = kb0.a.f79058b;
                    i92.k E2 = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
                    Context context3 = ((cp.z) obj2).getContext();
                    int i16 = xc0.i.conversation_notifications_muted_toast;
                    oo1.j jVar = oo1.j.f96854a;
                    E2.m(context3.getString(i16, oo1.j.f(j13)));
                    m60.u.f85943a.d(new mp.o(Integer.valueOf(j13), xc0.i.conversation_notifications_muted_until));
                } else {
                    Context context4 = kb0.a.f79058b;
                    ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().k(xc0.i.conversation_notifications_mute_until_turned_on_toast);
                    m60.u.f85943a.d(new mp.o(null, xc0.i.conversation_notifications_off));
                }
                cp.z zVar = (cp.z) obj2;
                int i17 = cp.z.f52984d;
                zVar.getClass();
                int i18 = cp.w.f52981a[oVar2.ordinal()];
                if (i18 == 1) {
                    c1.a().h0((r18 & 1) != 0 ? f1.TAP : f1.CONVERSATION_NOTIFICATIONS_SET_ALWAYS_ON, (r18 & 2) != 0 ? null : u0.CONVERSATION_NOTIFICATIONS_ALWAYS_ON_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : zVar.f52985a, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                } else if (i18 == 2) {
                    c1.a().h0((r18 & 1) != 0 ? f1.TAP : f1.CONVERSATION_NOTIFICATIONS_SET_MUTE_ONE_HOUR, (r18 & 2) != 0 ? null : u0.CONVERSATION_NOTIFICATIONS_MUTE_ONE_HOUR_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : zVar.f52985a, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                } else if (i18 == 3) {
                    c1.a().h0((r18 & 1) != 0 ? f1.TAP : f1.CONVERSATION_NOTIFICATIONS_SET_MUTE_EIGHT_HOURS, (r18 & 2) != 0 ? null : u0.CONVERSATION_NOTIFICATIONS_MUTE_EIGHT_HOURS_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : zVar.f52985a, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                } else if (i18 == 4) {
                    c1.a().h0((r18 & 1) != 0 ? f1.TAP : f1.CONVERSATION_NOTIFICATIONS_SET_MUTE_ONE_WEEK, (r18 & 2) != 0 ? null : u0.CONVERSATION_NOTIFICATIONS_MUTE_ONE_WEEK_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : zVar.f52985a, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                } else if (i18 == 5) {
                    c1.a().h0((r18 & 1) != 0 ? f1.TAP : f1.CONVERSATION_NOTIFICATIONS_SET_MUTE_INDEFINITELY, (r18 & 2) != 0 ? null : u0.CONVERSATION_NOTIFICATIONS_MUTE_INDEFINITELY_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : zVar.f52985a, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                a.c.y(m60.u.f85943a);
                return Unit.f80348a;
            case 8:
                jp.h hVar = (jp.h) obj3;
                wk1.e eVar = (wk1.e) obj2;
                hVar.getClass();
                int a13 = eVar.a();
                if (hVar.isBound() && a13 > 0 && (view = (uVar = (cp.u) ((rb2.p) hVar.getView())).getView()) != null) {
                    GestaltStaticSearchBar gestaltStaticSearchBar = (GestaltStaticSearchBar) view.findViewById(xc0.e.top_search_contacts_text);
                    Intrinsics.f(gestaltStaticSearchBar);
                    wy0 f13 = ((b60.d) uVar.getActiveUserManager()).f();
                    Integer k23 = f13 != null ? f13.k2() : null;
                    Intrinsics.f(k23);
                    oe.f.n(gestaltStaticSearchBar, new cp.t(!(k23.intValue() < 16), i14));
                    gestaltStaticSearchBar.k0(new xo.k(uVar, r3 ? 1 : 0));
                    int dimensionPixelSize = gestaltStaticSearchBar.getResources().getDimensionPixelSize(eo1.c.space_400);
                    ViewGroup.LayoutParams layoutParams = gestaltStaticSearchBar.getLayoutParams();
                    Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                }
                ep.f fVar = hVar.f77264e;
                Boolean bool = fVar.f59877q;
                Boolean bool2 = Boolean.TRUE;
                if (!Intrinsics.d(bool, bool2) || !Intrinsics.d(fVar.f59876p, bool2)) {
                    if (eVar instanceof ep.i) {
                        fVar.f59877q = Boolean.valueOf(a13 > 0);
                    } else if (eVar instanceof com.pinterest.framework.multisection.datasource.pagedlist.g) {
                        fVar.f59876p = Boolean.valueOf(a13 > 0);
                    }
                    fVar.n();
                }
                return Unit.f80348a;
            case 9:
                j((Throwable) obj);
                return Unit.f80348a;
            case 10:
                h((v7) obj);
                return Unit.f80348a;
            case 11:
                h((v7) obj);
                return Unit.f80348a;
            case 12:
                Intrinsics.checkNotNullParameter((rn1.f) obj, "it");
                d1 d1Var = (d1) obj3;
                d1Var.getEventManager().d(new jc0.v(new zp.b0(d1Var.L, (wy0) obj2), false, 0L, 30));
                return Unit.f80348a;
            case 13:
                return e((rn1.a) obj);
            case 14:
                return ((kq.c) obj3).J((f30) ((List) obj2).get(((Number) obj).intValue()));
            case 15:
                ((mq.u) obj3).f7().d(new a11.x(new c82.a((my0) obj), ((f30) obj2).getUid()));
                return Unit.f80348a;
            case 16:
                PinFeed feed = (PinFeed) obj;
                Intrinsics.checkNotNullParameter(feed, "feed");
                mq.u uVar2 = (mq.u) obj3;
                PinFeed pinFeed = uVar2.f88019g0;
                if (pinFeed != null) {
                    pinFeed.j(feed);
                }
                kq.c cVar = (kq.c) obj2;
                cVar.f80634s = false;
                cVar.I(a11.w.e(feed, null, uVar2.g8().I()));
                cVar.g();
                return Unit.f80348a;
            case 17:
                return e((rn1.a) obj);
            case 18:
                return e((rn1.a) obj);
            case 19:
                h((v7) obj);
                return Unit.f80348a;
            case 20:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                j0 j0Var = (j0) obj3;
                CharSequence charSequence = (CharSequence) j0Var.f80434a;
                return yl1.b.f(it, (charSequence == null || charSequence.length() == 0) ? bs1.c.j2(new String[0], ((h0) obj2).f80426a) : bs1.c.h2((CharSequence) j0Var.f80434a), false, null, null, null, null, null, null, 0, null, 1022);
            case 21:
                return e((rn1.a) obj);
            case 22:
                rl1.c0 bind = (rl1.c0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                String string = ((AvatarWithTitleAndSubtitleView) obj3).getResources().getString(le0.h.content_description_user_avatar, dl2.b.i1((wy0) obj2));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                bind.a(string);
                return Unit.f80348a;
            case 23:
                return f((wn1.d) obj);
            case 24:
                return f((wn1.d) obj);
            case 25:
                Intrinsics.checkNotNullParameter((View) obj, "it");
                CommentPreviewView commentPreviewView = (CommentPreviewView) obj3;
                rp0.d dVar = (rp0.d) obj2;
                int i19 = CommentPreviewView.f35094u;
                qh1.e eVar2 = commentPreviewView.f35096e;
                if (eVar2 != null) {
                    eVar2.l(new zp.j0(8, dVar, commentPreviewView));
                    return Unit.f80348a;
                }
                Intrinsics.r("commentUtils");
                throw null;
            case 26:
                j((Throwable) obj);
                return Unit.f80348a;
            case 27:
                i((Boolean) obj);
                return Unit.f80348a;
            case 28:
                i((Boolean) obj);
                return Unit.f80348a;
        }
    }

    public final void j(Throwable th3) {
        int i13 = this.f22291i;
        Object obj = this.f22293k;
        Object obj2 = this.f22292j;
        switch (i13) {
            case 2:
                if (th3 == null) {
                    ((r4.i) obj2).b(((p0) obj).getCompleted());
                    break;
                } else if (!(th3 instanceof CancellationException)) {
                    ((r4.i) obj2).d(th3);
                    break;
                } else {
                    ((r4.i) obj2).c();
                    break;
                }
            case 9:
                zp.f fVar = (zp.f) obj2;
                fVar.f142400c.i(((Context) obj).getString(x0.oops_something_went_wrong));
                fVar.f142404g.q(th3, "Error when getting work info list", tb0.p.IDEA_PINS_CREATION);
                break;
            default:
                ((i92.k) ((jf2.c) obj2).f75878g).b(((Context) obj).getString(x0.account_switcher_switch_failure_message));
                break;
        }
    }
}
