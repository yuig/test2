package s1;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.mj;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.qj0;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.ym;
import com.pinterest.feature.account.view.AccountSwitcherRowView;
import com.pinterest.feature.gridactions.pingridhide.view.PinGridHideView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.reportFlow.feature.rvc.view.RVCSectionItemView;
import com.pinterest.screens.y1;
import df.j1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import om0.m1;
import x02.i2;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110565i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f110566j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f110567k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f110568l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, Object obj2, boolean z13, int i13) {
        super(1);
        this.f110565i = i13;
        this.f110567k = obj;
        this.f110568l = obj2;
        this.f110566j = z13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [o5.c] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final rn1.a b(rn1.a it) {
        wy0 wy0Var;
        SpannableStringBuilder d2;
        String str;
        String str2;
        String d13;
        CharSequence string;
        int i13;
        int i14 = this.f110565i;
        ?? string2 = "";
        boolean z13 = this.f110566j;
        Object obj = this.f110568l;
        Object obj2 = this.f110567k;
        switch (i14) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                xa0.p pVar = (xa0.p) obj2;
                int i15 = xa0.p.f134422k;
                pVar.getClass();
                Date R = ((fi0) obj).R();
                String format = R != null ? new SimpleDateFormat("MMM dd", Locale.getDefault()).format(R) : null;
                if (format != null) {
                    if (z13) {
                        string2 = j1.a0(bs1.c.g2(pVar, qa0.f.collages_retrieval_last_edited_label, format));
                        Intrinsics.checkNotNullExpressionValue(string2, "fromHtml(...)");
                    } else {
                        string2 = format;
                    }
                }
                Intrinsics.checkNotNullParameter(string2, "string");
                return rn1.a.y(it, new u50.f0(string2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                ?? r33 = ((AccountSwitcherRowView) obj2).f45076i;
                mr1.h hVar = (mr1.h) obj;
                if (hVar.a()) {
                    mr1.h hVar2 = hVar.f88091d;
                    String N2 = (hVar2 == null || (wy0Var = hVar2.f88089b) == null) ? null : wy0Var.N2();
                    if (N2 != null) {
                        string2 = N2;
                    }
                } else {
                    String N22 = hVar.f88089b.N2();
                    if (N22 != null) {
                        string2 = N22;
                    }
                }
                String b13 = r33.b(string2);
                Intrinsics.checkNotNullExpressionValue(b13, "unicodeWrap(...)");
                return rn1.a.y(it, bs1.c.h2(b13), null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                String str3 = (String) obj;
                return rn1.a.y(it, bs1.c.p2(str3), null, null, null, null, 0, z13 ? fm1.c.VISIBLE : fm1.c.GONE, null, null, new rm1.d(new rm1.f((rm1.q) obj2, rm1.i.XS), rm1.c.SUBTLE, null, 0, null, 28), false, 0, bs1.c.p2(qb0.j.a(str3)), null, null, null, null, false, null, null, 2092478);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!z13) {
                    PinGridHideView pinGridHideView = (PinGridHideView) obj2;
                    ls0.f fVar = (ls0.f) obj;
                    int i16 = PinGridHideView.f45721x;
                    pinGridHideView.getClass();
                    String str4 = fVar.f84629d;
                    Context context = pinGridHideView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    int a13 = dl2.b.a1(context, vn1.c.LIGHT.getColorRes());
                    int i17 = ks0.d.f80784a[fVar.f84626a.ordinal()];
                    String str5 = fVar.f84630e;
                    switch (i17) {
                        case 1:
                            String j13 = a.a.j("\n", pinGridHideView.getResources().getString(pinGridHideView.f45744w ? x0.undo : vp1.c.show_homefeed_tuner));
                            Context context2 = pinGridHideView.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            String string3 = pinGridHideView.getResources().getString(vp1.c.got_it_pin_hide_reason_and_undo_placeholder);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            d2 = f0.h.B(context2, string3, "%1$s", j13, a13, new ks0.e(pinGridHideView, 0));
                            break;
                        case 2:
                            String[] strArr = {"%1$s", "%2$s"};
                            String[] strArr2 = new String[2];
                            String str6 = fVar.f84633h;
                            if (str6 == null) {
                                str6 = pinGridHideView.getResources().getString(vp1.c.partner);
                                Intrinsics.checkNotNullExpressionValue(str6, "getString(...)");
                            }
                            strArr2[0] = str6;
                            String string4 = pinGridHideView.getResources().getString(pinGridHideView.f45744w ? x0.undo : vp1.c.show_homefeed_tuner);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            strArr2[1] = string4;
                            cf0.b[] bVarArr = {ks0.a.f80776a, new ks0.e(pinGridHideView, 1)};
                            Context context3 = pinGridHideView.getContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                            String string5 = pinGridHideView.getResources().getString(vp1.c.grid_actions_promoted_with_clickable_spans);
                            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                            d2 = f0.h.C(context3, string5, strArr, strArr2, bVarArr, a13);
                            break;
                        case 3:
                            if (str4 != null && str5 != null) {
                                if (pinGridHideView.f45741t == null) {
                                    Intrinsics.r("gridActionUtils");
                                    throw null;
                                }
                                Context context4 = pinGridHideView.getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                                String string6 = pinGridHideView.getResources().getString(vp1.c.pin_hide_board_unfollow_pins_message);
                                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                                d2 = ls0.d.b(context4, a13, string6, str4, new m1(7, pinGridHideView, str4));
                                break;
                            }
                            d2 = null;
                            break;
                        case 4:
                            String str7 = fVar.f84631f;
                            if (str7 != null && (str = fVar.f84632g) != null) {
                                ls0.d dVar = pinGridHideView.f45741t;
                                if (dVar == null) {
                                    Intrinsics.r("gridActionUtils");
                                    throw null;
                                }
                                Context context5 = pinGridHideView.getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                                String string7 = pinGridHideView.getResources().getString(vp1.c.pin_hide_topic_pins_fewer_message);
                                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                                d2 = dVar.a(context5, a13, string7, str7, (ScreenLocation) y1.f51582c.getValue(), str);
                                break;
                            }
                            d2 = null;
                            break;
                        case 5:
                            String str8 = fVar.f84627b;
                            if (str8 != null && (str2 = fVar.f84628c) != null) {
                                ls0.d dVar2 = pinGridHideView.f45741t;
                                if (dVar2 == null) {
                                    Intrinsics.r("gridActionUtils");
                                    throw null;
                                }
                                Context context6 = pinGridHideView.getContext();
                                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                                String string8 = pinGridHideView.getResources().getString(vp1.c.pin_hide_user_unfollow_pins_message);
                                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                                d2 = dVar2.c(context6, a13, string8, str8, str2);
                                break;
                            }
                            d2 = null;
                            break;
                        case 6:
                            if (str4 != null && str5 != null) {
                                String string9 = pinGridHideView.getResources().getString(pinGridHideView.f45744w ? x0.undo : vp1.c.show_homefeed_tuner);
                                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                                cf0.b[] bVarArr2 = {ks0.a.f80776a, new ks0.e(pinGridHideView, 2)};
                                Context context7 = pinGridHideView.getContext();
                                String string10 = pinGridHideView.getResources().getString(vp1.c.pin_hide_board_pins_message);
                                Intrinsics.f(context7);
                                Intrinsics.f(string10);
                                d2 = f0.h.C(context7, string10, new String[]{"%1$s", "%2$s"}, new String[]{str4, string9}, bVarArr2, a13);
                                break;
                            }
                            d2 = null;
                            break;
                        case 7:
                            d2 = new SpannableStringBuilder(pinGridHideView.getResources().getString(nw.c.pin_hide_reason_weight_loss_ads_opted_out));
                            break;
                        case 8:
                            ym ymVar = fVar.H;
                            if (ymVar != null && (d13 = ymVar.d()) != null) {
                                d2 = new SpannableStringBuilder(pinGridHideView.getResources().getString(vp1.c.pin_hide_gen_ai_topic_opt_out, d13));
                                break;
                            }
                            d2 = null;
                            break;
                        default:
                            d2 = null;
                            break;
                    }
                } else {
                    PinGridHideView pinGridHideView2 = (PinGridHideView) obj2;
                    ls0.d dVar3 = pinGridHideView2.f45741t;
                    if (dVar3 == null) {
                        Intrinsics.r("gridActionUtils");
                        throw null;
                    }
                    yk1.a aVar = new yk1.a(pinGridHideView2.getContext().getResources(), pinGridHideView2.getContext().getTheme());
                    Context context8 = pinGridHideView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                    Context context9 = pinGridHideView2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                    d2 = dVar3.d((ls0.f) obj, aVar, context8, dl2.b.a1(context9, vn1.c.LIGHT.getColorRes()));
                }
                return rn1.a.y(it, d2 != null ? bs1.c.p2(d2) : bs1.c.h2(""), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                if (z13) {
                    String string11 = ((a41.r) obj2).getResources().getString(nz1.f.private_profile_description, (String) obj);
                    Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                    string = Html.fromHtml(string11, 63);
                    Intrinsics.f(string);
                } else {
                    string = ((a41.r) obj2).getResources().getString(nz1.f.private_profile_popup_body);
                    Intrinsics.f(string);
                }
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                RVCSectionItemView rVCSectionItemView = (RVCSectionItemView) obj2;
                mj mjVar = (mj) obj;
                Intrinsics.checkNotNullParameter(mjVar, "<this>");
                mj.c M = mjVar.M();
                switch (M == null ? -1 : q02.a.f101859a[M.ordinal()]) {
                    case 1:
                        i13 = h02.e.rvc_merchant;
                        break;
                    case 2:
                        i13 = h02.e.rvc_advertiser;
                        break;
                    case 3:
                        i13 = h02.e.rvc_profile_text;
                        break;
                    case 4:
                    case 10:
                        i13 = x0.f85948ad;
                        break;
                    case 5:
                        if (z13) {
                            f30 N = mjVar.N();
                            if (N == null || !Intrinsics.d(N.e5(), Boolean.TRUE)) {
                                i13 = h02.e.rvc_created_pin_text;
                                break;
                            } else {
                                i13 = h02.e.rvc_saved_pin_text;
                                break;
                            }
                        } else {
                            i13 = x0.pin;
                            break;
                        }
                        break;
                    case 6:
                        i13 = x0.board;
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                        i13 = x0.contextmenu_comment;
                        break;
                    default:
                        i13 = h02.e.rvc_unknown_type;
                        break;
                }
                String f23 = bs1.c.f2(rVCSectionItemView, i13);
                if (!pk.a0.x0(f23)) {
                    char[] charArray = f23.toCharArray();
                    boolean z14 = true;
                    for (int i18 = 0; i18 < charArray.length; i18++) {
                        char c13 = charArray[i18];
                        if (Character.isWhitespace(c13)) {
                            z14 = true;
                        } else if (z14) {
                            charArray[i18] = Character.toTitleCase(c13);
                            z14 = false;
                        }
                    }
                    f23 = new String(charArray);
                }
                Intrinsics.checkNotNullExpressionValue(f23, "capitalize(...)");
                return rn1.a.y(it, bs1.c.h2(f23), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    public final void e(f30 f30Var) {
        ArrayList didIts;
        f30 a13;
        ArrayList aggregatedComments;
        wy0 e13;
        int i13 = this.f110565i;
        boolean z13 = this.f110566j;
        Object obj = this.f110568l;
        Object obj2 = this.f110567k;
        switch (i13) {
            case 8:
                rp0.d dVar = (rp0.d) obj2;
                if (dVar instanceof rp0.b) {
                    Intrinsics.f(f30Var);
                    if (z13) {
                        List v43 = f30Var.v4();
                        if (v43 == null) {
                            v43 = kotlin.collections.q0.f80391a;
                        }
                        aggregatedComments = CollectionsKt.m0(dVar.v(), v43);
                    } else {
                        List v44 = f30Var.v4();
                        if (v44 == null) {
                            v44 = kotlin.collections.q0.f80391a;
                        }
                        aggregatedComments = CollectionsKt.h0(v44, dVar.v());
                    }
                    Set set = b40.f35967a;
                    Intrinsics.checkNotNullParameter(f30Var, "<this>");
                    Intrinsics.checkNotNullParameter(aggregatedComments, "aggregatedComments");
                    e30 R6 = f30Var.R6();
                    R6.e0(aggregatedComments);
                    a13 = R6.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                } else {
                    if (!(dVar instanceof rp0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intrinsics.f(f30Var);
                    if (z13) {
                        List w43 = f30Var.w4();
                        if (w43 == null) {
                            w43 = kotlin.collections.q0.f80391a;
                        }
                        didIts = CollectionsKt.m0(dVar.v(), w43);
                    } else {
                        List w44 = f30Var.w4();
                        if (w44 == null) {
                            w44 = kotlin.collections.q0.f80391a;
                        }
                        didIts = CollectionsKt.h0(w44, dVar.v());
                    }
                    Set set2 = b40.f35967a;
                    Intrinsics.checkNotNullParameter(f30Var, "<this>");
                    Intrinsics.checkNotNullParameter(didIts, "didIts");
                    e30 R62 = f30Var.R6();
                    R62.f0(didIts);
                    a13 = R62.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                }
                wr0.r rVar = (wr0.r) obj;
                rVar.onRecyclerRefresh();
                rVar.K.W(a13);
                return;
            case 9:
                fs0.w wVar = (fs0.w) obj2;
                wVar.f62914m.c(new up.b(z13 ? x0.comments_enabled : x0.comments_disabled, new w1.l0(wVar, (f30) obj, z13, 3)));
                return;
            default:
                android.support.v4.media.a aVar = (android.support.v4.media.a) obj2;
                f30 f30Var2 = (f30) obj;
                rj0 u63 = f30Var2.u6();
                wy0 Q = com.bumptech.glide.d.Q((b60.b) aVar.f15843g);
                rj0 rj0Var = null;
                String uid = (u63 == null || (e13 = u63.e()) == null) ? null : e13.getUid();
                if (uid == null) {
                    uid = "";
                }
                if (dl2.b.S1(Q, uid) && u63 != null) {
                    qj0 qj0Var = new qj0(u63, 0);
                    qj0Var.c(null);
                    rj0Var = qj0Var.a();
                }
                i2 i2Var = (i2) aVar.f15842f;
                e30 R63 = f30Var2.R6();
                R63.l2(rj0Var);
                f30 a14 = R63.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                i2Var.W(a14);
                ((i92.k) aVar.f15841e).k(q82.a.sponsored_pins_remove_partnership_success);
                ((m60.w) aVar.f15837a).d(new yb0.c(yb0.d.EXPLICIT_DIRECTIVE));
                m60.w wVar2 = (m60.w) aVar.f15837a;
                String uid2 = f30Var2.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                wVar2.d(new pg0.b0(uid2));
                if (z13) {
                    ((ku1.j) aVar.f15844h).f();
                    return;
                }
                return;
        }
    }

    public final void f(ln0 ln0Var) {
        int i13 = this.f110565i;
        Object obj = this.f110568l;
        boolean z13 = this.f110566j;
        Object obj2 = this.f110567k;
        switch (i13) {
            case 11:
                Intrinsics.f(ln0Var);
                ln0 ln0Var2 = (ln0) ((Function1) obj2).invoke(ln0Var);
                if (!z13) {
                    ((dl1.l) ((dv0.o) obj).f56372b).Z(ln0Var2);
                    break;
                } else {
                    ((dl1.l) ((dv0.o) obj).f56372b).W(ln0Var2);
                    break;
                }
            default:
                lv0.c cVar = (lv0.c) obj2;
                boolean z14 = cVar.f84991f;
                dl1.t tVar = cVar.f84994i;
                if (!z14) {
                    Intrinsics.f(ln0Var);
                    f30 f30Var = (f30) obj;
                    tp pageData = ln0Var.getPageData();
                    if (pageData != null) {
                        String uid = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        Pair l03 = tp.l0(pageData, uid, Boolean.valueOf(z13), false, 8);
                        tp tpVar = (tp) l03.f80346a;
                        mq mqVar = (mq) l03.f80347b;
                        ((dl1.l) tVar).W(ln0Var.J(tpVar, true));
                        cVar.f84995j.f(new hv0.f(mqVar.getConfig().getId()));
                        break;
                    }
                } else {
                    Intrinsics.f(ln0Var);
                    f30 f30Var2 = (f30) obj;
                    tp pageData2 = ln0Var.getPageData();
                    if (pageData2 != null) {
                        String uid2 = f30Var2.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                        tp tpVar2 = (tp) pageData2.j0(Boolean.valueOf(z13), uid2, true).f80346a;
                        List D = ln0Var.D();
                        if (!(D instanceof Collection) || !D.isEmpty()) {
                            Iterator it = D.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.d(((mq) it.next()).getPinId(), f30Var2.getUid())) {
                                    break;
                                }
                            }
                        }
                        ((dl1.l) tVar).W(ln0Var.J(tpVar2, false));
                        break;
                    }
                }
                break;
        }
    }

    public final void h(wm1.k0 bind) {
        int i13 = 4;
        int i14 = this.f110565i;
        Object obj = this.f110568l;
        boolean z13 = this.f110566j;
        boolean z14 = false;
        Object obj2 = this.f110567k;
        switch (i14) {
            case 19:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                ic1.p pVar = (ic1.p) obj2;
                int i15 = pVar.f72092b;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                u50.k0 k0Var = new u50.k0(i15, new ArrayList(0));
                String string = z13 ? ((lc1.c) obj).getContext().getString(pVar.f72083d) : pVar.f72085f;
                Intrinsics.f(string);
                Intrinsics.checkNotNullParameter(string, "string");
                wm1.q middleItem = new wm1.q(k0Var, new u50.f0(string), z14, i13);
                bind.getClass();
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind.f130312c = middleItem;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                ic1.p pVar2 = (ic1.p) obj2;
                int i16 = pVar2.f72092b;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                u50.k0 k0Var2 = new u50.k0(i16, new ArrayList(0));
                String string2 = z13 ? ((lc1.m) obj).getContext().getString(pVar2.f72083d) : pVar2.f72085f;
                Intrinsics.f(string2);
                Intrinsics.checkNotNullParameter(string2, "string");
                wm1.q middleItem2 = new wm1.q(k0Var2, new u50.f0(string2), z14, i13);
                bind.getClass();
                Intrinsics.checkNotNullParameter(middleItem2, "middleItem");
                bind.f130312c = middleItem2;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x02a8, code lost:
    
        if (r1[6] != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02bd, code lost:
    
        if ((r1 != null ? r1.r() : 0).intValue() > 1) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x028f  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 2174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.w.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, boolean z13, Object obj2, int i13) {
        super(1);
        this.f110565i = i13;
        this.f110567k = obj;
        this.f110566j = z13;
        this.f110568l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(boolean z13, Object obj, Object obj2, int i13) {
        super(1);
        this.f110565i = i13;
        this.f110566j = z13;
        this.f110567k = obj;
        this.f110568l = obj2;
    }
}
