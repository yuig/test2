package z9;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import bk1.a2;
import bk1.g2;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.r4;
import h32.c1;
import h32.f1;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import x02.i2;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141233i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f141234j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f141235k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f141236l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f141237m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f141238n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13, Object obj, Object obj2, Object obj3, Object obj4, boolean z13) {
        super(1);
        this.f141233i = i13;
        this.f141235k = obj;
        this.f141236l = obj2;
        this.f141234j = z13;
        this.f141237m = obj3;
        this.f141238n = obj4;
    }

    public final bk1.o b(bk1.o it) {
        int i13 = this.f141233i;
        Object obj = this.f141238n;
        Object obj2 = this.f141237m;
        Object obj3 = this.f141236l;
        Object obj4 = this.f141235k;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                a2 a2Var = (a2) ((l82.e) obj).f82219b;
                bk1.c cVar = new bk1.c((f30) obj4, this.f141234j, ((f30) obj3).getUid(), (c1) obj2, a2Var.f23173s, null, a2Var.W, a2Var.X);
                it.getClass();
                return bk1.o.e(cVar);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                f30 f30Var = (f30) obj4;
                if (f30Var == null) {
                    f30Var = ((a2) ((l82.e) obj3).f82219b).f23155a;
                }
                bk1.j jVar = new bk1.j(f30Var, this.f141234j, (Integer) obj2, (g2) obj);
                it.getClass();
                return bk1.o.e(jVar);
        }
    }

    public final void e(String typedPasscode) {
        int i13 = this.f141233i;
        Object obj = this.f141237m;
        Object obj2 = this.f141238n;
        Object obj3 = this.f141236l;
        Object obj4 = this.f141235k;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(typedPasscode, "typedPasscode");
                ((xb1.j) obj4).B3((bd1.b) obj3, this.f141237m, typedPasscode, this.f141234j, (Function1) obj2);
                break;
            case 5:
            default:
                Intrinsics.checkNotNullParameter(typedPasscode, "imageSignature");
                oh1.w wVar = (oh1.w) obj4;
                if (!wVar.isBound()) {
                    wVar.f94587i.d(new of0.a(null));
                    break;
                } else {
                    oh1.k kVar = new oh1.k(wVar, 7);
                    oh1.v vVar = new oh1.v(wVar, 2);
                    wVar.addDisposable(qh1.e.d(wVar.f94592n, wVar.getPinalytics(), wVar.getPresenterPinalytics(), (f30) obj3, (Editable) obj, typedPasscode, (String) obj2, this.f141234j, kVar, vVar, null, BitmapUtils.BITMAP_TO_JPEG_SIZE));
                    break;
                }
            case 6:
                Intrinsics.checkNotNullParameter(typedPasscode, "imageSignature");
                oh1.m mVar = (oh1.m) obj4;
                if (!mVar.isBound()) {
                    mVar.f94520b.d(new of0.a(null));
                    break;
                } else {
                    oh1.k kVar2 = new oh1.k(mVar, 2);
                    com.pinterest.feature.unifiedcomments.d dVar = (com.pinterest.feature.unifiedcomments.d) mVar.getView();
                    Intrinsics.checkNotNullExpressionValue(dVar, "access$getView(...)");
                    oh1.h hVar = new oh1.h(dVar, 2);
                    mVar.addDisposable(qh1.e.d(mVar.f94529k, mVar.getPinalytics(), mVar.getPresenterPinalytics(), (f30) obj3, (Editable) obj, typedPasscode, (String) obj2, this.f141234j, kVar2, null, hVar, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER));
                    break;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String d2;
        int i13 = this.f141233i;
        boolean z13 = this.f141234j;
        Object obj2 = this.f141238n;
        Object obj3 = this.f141237m;
        Object obj4 = this.f141236l;
        Object obj5 = this.f141235k;
        switch (i13) {
            case 0:
                k entry = (k) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                ((kotlin.jvm.internal.f0) obj5).f80424a = true;
                ((kotlin.jvm.internal.f0) obj4).f80424a = true;
                ((p) obj3).t(entry, z13, (kotlin.collections.v) obj2);
                break;
            case 1:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                if (!z13) {
                    s60.d dVar = (s60.d) obj5;
                    dVar.getClass();
                    s60.d.b(user, f1.USER_UNBLOCK, (s60.c) obj4);
                    break;
                } else {
                    s60.d dVar2 = (s60.d) obj5;
                    dVar2.getClass();
                    s60.d.b(user, f1.USER_BLOCK, (s60.c) obj4);
                    break;
                }
            case 2:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                rm1.q qVar = (rm1.q) obj5;
                CharSequence charSequence = (CharSequence) obj4;
                break;
            case 3:
                Intrinsics.checkNotNullParameter((nm.u) obj, "it");
                ((xb1.j) obj5).x3((Class) obj4, z13, (va1.t) obj3);
                ((Function1) obj2).invoke(Boolean.FALSE);
                break;
            case 4:
                e((String) obj);
                break;
            case 5:
                qf1.k0 option = (qf1.k0) obj;
                Intrinsics.checkNotNullParameter(option, "option");
                qf1.i0 i0Var = (qf1.i0) obj5;
                f30 f30Var = (f30) obj4;
                qf1.j0 j0Var = (qf1.j0) obj3;
                wy0 wy0Var = j0Var.f103720b;
                Context context = (Context) obj2;
                List list = z13 ? j0Var.f103727i : null;
                i0Var.getClass();
                int i14 = qf1.a0.f103641a[option.ordinal()];
                x02.a2 a2Var = ck2.i.f27924d;
                ck2.c cVar = ck2.i.f27923c;
                nx.d0 d0Var = i0Var.f103690a;
                HashMap hashMap = j0Var.f103725g;
                h22.f fVar = i0Var.f103701l;
                i2 i2Var = i0Var.f103696g;
                b60.b bVar = i0Var.f103706q;
                m60.w wVar = i0Var.f103693d;
                xj2.b bVar2 = i0Var.f103691b;
                switch (i14) {
                    case 1:
                    case 2:
                        String uid = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        Resources resources = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        d0Var.b0(h32.u0.PIN_STORY_PIN_SHARE_BUTTON, h32.g0.OVERFLOW_MENU, uid, false);
                        i2Var.P(uid).H(tk2.e.f118017c).A(wj2.c.a()).F(new vd1.a(26, new qf1.g0(i0Var, 4)), new vd1.a(27, new qf1.d0(i0Var, resources, 6)), cVar, a2Var);
                        break;
                    case 3:
                        String uid2 = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                        i0Var.d();
                        ig1.b.w(context, new SendableObject(uid2, 0), p32.c.MESSAGE, i0Var.f103692c);
                        break;
                    case 4:
                        String uid3 = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                        Resources resources2 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        i0Var.f103690a.f0(h32.u0.PIN_REPORT_BUTTON, h32.g0.OVERFLOW_MENU, uid3, hashMap, false);
                        new jk2.g2(i2Var.L(uid3).H(tk2.e.f118017c).A(wj2.c.a()), new d51.a(20, qf1.c0.f103648k), 0).s().o(new vd1.a(24, new qf1.g0(i0Var, 3)), new vd1.a(25, new qf1.d0(i0Var, resources2, 5)));
                        break;
                    case 5:
                        d0Var.b0(h32.u0.PIN_EDIT_BUTTON, h32.g0.OVERFLOW_MENU, f30Var.getUid(), false);
                        i0Var.d();
                        i0Var.f103707r.a(f30Var, false);
                        break;
                    case 6:
                        i0Var.f103690a.f0(h32.u0.PIN_STORY_PIN_SAVE_BUTTON, h32.g0.OVERFLOW_MENU, f30Var.getUid(), hashMap, false);
                        i0Var.d();
                        k11.p.a(i0Var.f103708s, f30Var, true, false, false, null, false, null, i0Var.f103690a, null, null, new p91.v(17, i0Var, f30Var), 3580);
                        wVar.d(new lq.a(f30Var.getUid()));
                        break;
                    case 7:
                        Resources resources3 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                        i0Var.f103690a.f0(h32.u0.PIN_STORY_PIN_HIDE_BUTTON, h32.g0.OVERFLOW_MENU, f30Var.getUid(), hashMap, false);
                        boolean z14 = j0Var.f103729k != mf1.a.PIN_CLOSEUP;
                        if (z14) {
                            i0Var.d();
                        }
                        l32.c cVar2 = l32.c.BLOCK_SINGLE_PFY_PIN;
                        String uid4 = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                        ik2.i iVar = new ik2.i(i2Var.L(uid4).n(), new ic1.a(11, new ic1.c(16, i0Var, cVar2)));
                        Intrinsics.checkNotNullExpressionValue(iVar, "switchMapSingle(...)");
                        bVar2.a(iVar.I(1L).F(new vd1.a(18, new qf1.f0(z14, i0Var, 0)), new vd1.a(19, new qf1.d0(i0Var, resources3, 2)), cVar, a2Var));
                        break;
                    case 8:
                        i0Var.f103690a.f0(h32.u0.WEBSITE_BUTTON, h32.g0.MODAL_PIN, f30Var.getUid(), i0Var.f103713x.m(f30Var), false);
                        i0Var.f103695f.a(context, f30Var, com.bumptech.glide.c.D(f30Var), "unknown", i0Var.f103690a, j0Var.f103726h, i0Var.f103691b, (r25 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : null, (r25 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? Boolean.FALSE : null, (r25 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? new HashMap() : null, false);
                        break;
                    case 9:
                        Resources resources4 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                        String uid5 = com.bumptech.glide.d.Q(bVar).getUid();
                        Intrinsics.checkNotNullExpressionValue(uid5, "getUid(...)");
                        String uid6 = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid6, "getUid(...)");
                        bVar2.a(fVar.a(uid6).r(tk2.e.f118017c).l(wj2.c.a()).k(new ic1.a(9, new ed1.m(i0Var, f30Var, uid5, 7))).o(new vd1.a(20, new qf1.g0(i0Var, 1)), new vd1.a(21, new qf1.d0(i0Var, resources4, 3))));
                        break;
                    case 10:
                        Resources resources5 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
                        String uid7 = com.bumptech.glide.d.Q(bVar).getUid();
                        Intrinsics.checkNotNullExpressionValue(uid7, "getUid(...)");
                        String uid8 = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid8, "getUid(...)");
                        bVar2.a(fVar.f(uid8).r(tk2.e.f118017c).l(wj2.c.a()).k(new ic1.a(10, new aw0.j(f30Var, i0Var, list, uid7))).o(new vd1.a(22, new qf1.g0(i0Var, 2)), new vd1.a(23, new qf1.d0(i0Var, resources5, 4))));
                        break;
                    case 11:
                        d0Var.X(h32.u0.PIN_FEEDBACK_DIALOG_BUTTON_LEARN_MORE_PROMOTED);
                        i0Var.d();
                        wVar.d(Navigation.L((ScreenLocation) r4.f51309a.getValue(), f30Var.getUid(), ml1.b.MODAL_TRANSITION.getValue()));
                        break;
                    case 12:
                    case 13:
                        String uid9 = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid9, "getUid(...)");
                        i0Var.d();
                        if (wy0Var != null) {
                            Boolean R2 = wy0Var.R2();
                            Intrinsics.checkNotNullExpressionValue(R2, "getExplicitlyFollowedByMe(...)");
                            boolean booleanValue = R2.booleanValue();
                            String uid10 = wy0Var.getUid();
                            Intrinsics.checkNotNullExpressionValue(uid10, "getUid(...)");
                            h32.u0 u0Var = booleanValue ? h32.u0.UNFOLLOW_USER_OPTION : h32.u0.FOLLOW_USER_OPTION;
                            h32.g0 g0Var = h32.g0.OVERFLOW_MENU;
                            HashMap hashMap2 = new HashMap(y0.b(new Pair("pin_id", uid9)));
                            i0Var.f103690a.f0(u0Var, g0Var, uid10, hashMap2, false);
                            bVar2.a(oe.f.f1(new ok1.f(new nk1.g(i0Var.f103690a, new h32.i0(null, null, null, g0Var, null, u0Var), uid10, hashMap2, null, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER), i0Var.f103697h, null, false, null, 60), wy0Var, null, i0Var.f103709t.a(false), 10));
                            break;
                        }
                        break;
                    case 14:
                        i0Var.d();
                        android.support.v4.media.a a13 = i0Var.f103705p.a(d0Var);
                        rj0 u63 = f30Var.u6();
                        Intrinsics.f(u63);
                        wy0 Q = com.bumptech.glide.d.Q(bVar);
                        Boolean C4 = f30Var.C4();
                        Intrinsics.checkNotNullExpressionValue(C4, "getIsActiveAd(...)");
                        if (C4.booleanValue() && dl2.b.S1(Q, u63.d().getUid())) {
                            d2 = bs1.c.d2(context, q82.a.sponsored_pins_remove_partnership_alert_description_ad_creator);
                        } else {
                            Boolean C42 = f30Var.C4();
                            Intrinsics.checkNotNullExpressionValue(C42, "getIsActiveAd(...)");
                            if (C42.booleanValue()) {
                                wy0 e13 = u63.e();
                                String uid11 = e13 != null ? e13.getUid() : null;
                                if (uid11 == null) {
                                    uid11 = "";
                                }
                                if (dl2.b.S1(Q, uid11)) {
                                    d2 = bs1.c.d2(context, q82.a.sponsored_pins_remove_partnership_alert_description_ad_sponsor);
                                }
                            }
                            d2 = bs1.c.d2(context, q82.a.sponsored_pins_remove_partnership_alert_description);
                        }
                        a13.i(f30Var, d2, bVar2, false);
                        break;
                    case 15:
                        i0Var.d();
                        String uid12 = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid12, "getUid(...)");
                        wVar.d(new qf1.n0(uid12));
                        break;
                    case 16:
                        d0Var.b0(h32.u0.PIN_REACTION_BUTTON, h32.g0.OVERFLOW_MENU, f30Var.getUid(), false);
                        String uid13 = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid13, "getUid(...)");
                        wVar.d(new cb2.r(uid13));
                        i0Var.d();
                        break;
                    case 17:
                        com.pinterest.framework.screens.s sVar = i0Var.f103714y.f80914l;
                        com.pinterest.framework.screens.m j13 = sVar != null ? sVar.j() : null;
                        nl1.d dVar3 = j13 instanceof nl1.d ? (nl1.d) j13 : null;
                        i0Var.f103715z.getClass();
                        jo1.a a14 = jo1.c.a(dVar3);
                        String uid14 = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid14, "getUid(...)");
                        i0Var.f103711v.a(uid14, null, d0Var, a14).a(context, bs1.c.k0(context), new qf1.g0(i0Var, 0), new ee1.d(i0Var, 10));
                        break;
                    default:
                        vb0.j.f125466a.G("Unhandled option " + option, new Object[0]);
                        break;
                }
                break;
            case 6:
                e((String) obj);
                break;
            case 7:
                e((String) obj);
                break;
        }
        return b((bk1.o) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f30 f30Var, boolean z13, f30 f30Var2, c1 c1Var, l82.e eVar) {
        super(1);
        this.f141233i = 8;
        this.f141235k = f30Var;
        this.f141234j = z13;
        this.f141236l = f30Var2;
        this.f141237m = c1Var;
        this.f141238n = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, f30 f30Var, Object obj2, Object obj3, boolean z13, int i13) {
        super(1);
        this.f141233i = i13;
        this.f141235k = obj;
        this.f141236l = f30Var;
        this.f141237m = obj2;
        this.f141238n = obj3;
        this.f141234j = z13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Serializable serializable, Object obj2, boolean z13, Object obj3, int i13) {
        super(1);
        this.f141233i = i13;
        this.f141235k = obj;
        this.f141236l = serializable;
        this.f141237m = obj2;
        this.f141234j = z13;
        this.f141238n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z13, s60.d dVar, s60.c cVar, String str, String str2) {
        super(1);
        this.f141233i = 1;
        this.f141234j = z13;
        this.f141235k = dVar;
        this.f141236l = cVar;
        this.f141237m = str;
        this.f141238n = str2;
    }
}
