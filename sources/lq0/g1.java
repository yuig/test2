package lq0;

import android.content.Context;
import android.graphics.Matrix;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fw0;
import com.pinterest.api.model.k8;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.so;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.engagementtab.EngagementDetailsHeaderView;
import com.pinterest.feature.engagementtab.EngagementTabRetrofitRemoteRequest;
import com.pinterest.feature.gridactions.pingridhide.view.PinGridHideView;
import com.pinterest.feature.home.tuner.sba.SbaHfBoardToggleSettingCellView;
import com.pinterest.feature.home.tuner.sba.SbaHfTunerActivityPinCellView;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraTimerDurationsView;
import com.pinterest.feature.ideaPinCreation.canvas.view.AspectRatioButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x02.a2;

/* loaded from: classes5.dex */
public final class g1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84313i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f84314j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f84315k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i13, Object obj, Object obj2) {
        super(1);
        this.f84313i = i13;
        this.f84314j = obj;
        this.f84315k = obj2;
    }

    public final rn1.a b(rn1.a it) {
        String string;
        int i13 = this.f84313i;
        boolean z13 = true;
        Object obj = this.f84315k;
        Object obj2 = this.f84314j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2((CharSequence) obj2), null, null, kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.UI_400, 2, null, rn1.b.END, null, (rm1.d) obj, false, m60.t0.cell_title, null, null, null, new u50.b0(m60.r0.margin), null, false, null, null, 2061638);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!((kotlin.jvm.internal.f0) obj2).f80424a && !((PinGridHideView) obj).f45737p) {
                    z13 = false;
                }
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 18:
                Intrinsics.checkNotNullParameter(it, "state");
                u50.f0 f0Var = new u50.f0(((xs0.a) obj2).f135768c);
                Context context = ((SbaHfBoardToggleSettingCellView) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return rn1.a.y(it, f0Var, null, null, null, dl2.b.T1(context) ? vn1.g.UI_300 : it.f108853k, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 20:
                Intrinsics.checkNotNullParameter(it, "state");
                SbaHfTunerActivityPinCellView sbaHfTunerActivityPinCellView = (SbaHfTunerActivityPinCellView) obj2;
                pb0.d dVar = sbaHfTunerActivityPinCellView.f45827d;
                if (dVar == null) {
                    Intrinsics.r("fuzzyDateFormatter");
                    throw null;
                }
                Date date = ((xs0.q) obj).f135835b;
                Context context2 = sbaHfTunerActivityPinCellView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                u50.f0 p23 = bs1.c.p2(dVar.b(date, dl2.b.T1(context2) ? pb0.b.STYLE_NORMAL_NO_BOLDING : pb0.b.STYLE_COMPACT, true));
                Context context3 = sbaHfTunerActivityPinCellView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return rn1.a.y(it, p23, null, null, null, dl2.b.T1(context3) ? vn1.g.UI_100 : it.f108853k, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = tt0.p0.f119198a[((rt0.e) obj2).ordinal()];
                if (i14 == 1) {
                    string = ((IdeaPinCreationCameraTimerDurationsView) obj).getContext().getString(aq1.h.idea_pin_camera_timer_duration_off_content_description);
                } else if (i14 == 2) {
                    string = ((IdeaPinCreationCameraTimerDurationsView) obj).getContext().getString(aq1.h.idea_pin_camera_timer_duration_three_seconds_content_description);
                } else {
                    if (i14 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = ((IdeaPinCreationCameraTimerDurationsView) obj).getContext().getString(aq1.h.idea_pin_camera_timer_duration_ten_seconds_content_description);
                }
                Intrinsics.f(string);
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, null, false, 0, bs1.c.h2(string), null, null, null, null, false, null, null, 2093055);
            default:
                Intrinsics.checkNotNullParameter(it, "state");
                so soVar = (so) obj2;
                u50.f0 h23 = bs1.c.h2(soVar.getWidthRatio() + ":" + soVar.getHeightRatio());
                String string2 = ((AspectRatioButton) obj).getResources().getString(aq1.h.accessibility_idea_pin_aspect_ratio_preset, String.valueOf(soVar.getWidthRatio()), String.valueOf(soVar.getHeightRatio()));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return rn1.a.y(it, h23, null, null, null, null, 0, null, null, null, null, false, 0, bs1.c.h2(string2), null, null, null, null, false, null, null, 2093054);
        }
    }

    public final uj2.f0 e(f30 pin) {
        int i13 = this.f84313i;
        Object obj = this.f84315k;
        Object obj2 = this.f84314j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(pin, "pin");
                fs0.k kVar = (fs0.k) obj2;
                return ((uj2.b0) kVar.f62865i.prepare(pin, Integer.valueOf(l32.c.BLOCK_ORIGINAL_CREATOR.getValue()), kVar.f62866j.b(pin), ((wy0) obj).getF39332b()).buildRequest()).k(new wr0.l(5, new zp.u0(7, pin)));
            case 5:
                Intrinsics.checkNotNullParameter(pin, "pin");
                String z13 = dn.c.z(pin);
                return (uj2.f0) ((fs0.k) obj2).f62862f.prepare(pin, ((cs0.e) obj).f53127b, z13 != null ? z13 : "").buildRequest();
            case 6:
                Intrinsics.checkNotNullParameter(pin, "pin");
                fs0.w wVar = (fs0.w) obj2;
                return ((uj2.b0) wVar.f62910i.prepare(pin, Integer.valueOf(((l32.c) obj).getValue()), wVar.f62912k.b(pin)).buildRequest()).k(new wr0.l(12, new zp.u0(8, pin)));
            default:
                Intrinsics.checkNotNullParameter(pin, "pin");
                String z14 = dn.c.z(pin);
                return (uj2.f0) ((fs0.w) obj2).T.prepare(pin, (l32.f) obj, z14 != null ? z14 : "").buildRequest();
        }
    }

    public final void f(f30 f30Var) {
        String name;
        d4 d4Var;
        a4 a4Var;
        int i13 = this.f84313i;
        int i14 = 0;
        int i15 = 1;
        Object obj = this.f84315k;
        Object obj2 = this.f84314j;
        switch (i13) {
            case 2:
                wr0.r rVar = (wr0.r) obj2;
                Intrinsics.f(f30Var);
                rVar.U = b40.f0(f30Var);
                wy0 L3 = f30Var.L3();
                wy0 Q = com.bumptech.glide.d.Q(rVar.N);
                String f39332b = L3 != null ? L3.getF39332b() : null;
                if (f39332b == null) {
                    f39332b = "";
                }
                wr0.g gVar = (wr0.g) obj;
                wr0.u headerViewState = new wr0.u(f30Var, b40.f0(f30Var), dl2.b.S1(Q, f39332b), new wr0.q(gVar, f30Var, rVar, i14), new wr0.q(gVar, f30Var, rVar, i15));
                wr0.j jVar = (wr0.j) gVar;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(headerViewState, "headerViewState");
                EngagementDetailsHeaderView engagementDetailsHeaderView = jVar.S0;
                if (engagementDetailsHeaderView != null) {
                    engagementDetailsHeaderView.L(headerViewState);
                    return;
                } else {
                    Intrinsics.r("engagementDetailsHeaderView");
                    throw null;
                }
            case 8:
                fs0.w wVar = (fs0.w) obj2;
                wVar.u3();
                Intrinsics.f(f30Var);
                String D = com.bumptech.glide.c.D(f30Var);
                if (D != null) {
                    wVar.f62909h.b((Context) obj, D);
                    return;
                }
                return;
            case 9:
                fs0.w wVar2 = (fs0.w) obj;
                nx.d0 pinalytics = wVar2.getPinalytics();
                h32.f1 f1Var = h32.f1.MENTION_UNLINK;
                h32.u0 u0Var = h32.u0.PIN_DESCRIPTION;
                HashMap hashMap = new HashMap();
                hashMap.put("tag_type", String.valueOf(f32.c.USER.getValue()));
                Unit unit = Unit.f80348a;
                pinalytics.h0((r18 & 1) != 0 ? h32.f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                wVar2.f62914m.m((String) obj2);
                wVar2.u3();
                return;
            case 12:
                int i16 = is0.g.f73542a[((is0.b) obj2).ordinal()];
                a2 a2Var = ck2.i.f27924d;
                switch (i16) {
                    case 1:
                        is0.h hVar = (is0.h) obj;
                        is0.h.q3(hVar, h32.u0.PIN_FEEDBACK_REASON_NOT_MY_TASTE);
                        Intrinsics.f(f30Var);
                        is0.h.r3(hVar, f30Var, l32.c.BLOCK_SINGLE_PFY_PIN, l32.f.AD_NOT_MY_TASTE);
                        gb2.f fVar = gb2.f.f64747a;
                        String f39332b2 = f30Var.getF39332b();
                        Intrinsics.checkNotNullExpressionValue(f39332b2, "getUid(...)");
                        gb2.f.c(new gb2.i(f39332b2, wa2.p.STATE_TOPIC_NOT_FOR_ME_AD));
                        is0.h.t3(hVar, f30Var, true);
                        hVar.B3(f30Var);
                        return;
                    case 2:
                        is0.h hVar2 = (is0.h) obj;
                        is0.h.q3(hVar2, h32.u0.PIN_FEEDBACK_REASON_LOW_QUALITY);
                        Intrinsics.f(f30Var);
                        is0.h.r3(hVar2, f30Var, l32.c.BLOCK_SINGLE_PFY_PIN, l32.f.AD_LOW_QUALITY);
                        gb2.f fVar2 = gb2.f.f64747a;
                        String f39332b3 = f30Var.getF39332b();
                        Intrinsics.checkNotNullExpressionValue(f39332b3, "getUid(...)");
                        gb2.f.c(new gb2.i(f39332b3, wa2.p.STATE_LOW_QUALITY_AD));
                        is0.h.t3(hVar2, f30Var, true);
                        hVar2.B3(f30Var);
                        return;
                    case 3:
                        is0.h hVar3 = (is0.h) obj;
                        is0.h.q3(hVar3, h32.u0.PIN_FEEDBACK_REASON_REPETITIVE_AD);
                        Intrinsics.f(f30Var);
                        is0.h.r3(hVar3, f30Var, l32.c.BLOCK_SINGLE_PFY_PIN, l32.f.AD_SEE_TOO_MANY_TIMES);
                        gb2.f fVar3 = gb2.f.f64747a;
                        String f39332b4 = f30Var.getF39332b();
                        Intrinsics.checkNotNullExpressionValue(f39332b4, "getUid(...)");
                        gb2.f.c(new gb2.i(f39332b4, wa2.p.STATE_REPETITIVE_AD));
                        is0.h.t3(hVar3, f30Var, true);
                        hVar3.B3(f30Var);
                        return;
                    case 4:
                        is0.h hVar4 = (is0.h) obj;
                        is0.h.q3(hVar4, h32.u0.PIN_FEEDBACK_REASON_BUTTON_OFFENSIVE);
                        h32.i0 p13 = hVar4.getPinalytics().p();
                        if (p13 == null || (a4Var = p13.f67082b) == null || (name = a4Var.name()) == null) {
                            name = (p13 == null || (d4Var = p13.f67081a) == null) ? null : d4Var.name();
                        }
                        Intrinsics.f(f30Var);
                        g02.a.c(hVar4.f73543a, f30Var, name, d4.FEED, hVar4.getPresenterPinalytics().i(), hVar4.f73561s.b(f30Var), kh2.d.F(hVar4.getPresenterPinalytics()));
                        return;
                    case 5:
                        is0.h hVar5 = (is0.h) obj;
                        is0.h.q3(hVar5, h32.u0.PIN_FEEDBACK_REASON_LOW_QUALITY);
                        Intrinsics.f(f30Var);
                        com.pinterest.hairball.network.d prepare = hVar5.f73557o.prepare(f30Var);
                        Intrinsics.checkNotNullExpressionValue(a2Var, "emptyConsumer(...)");
                        hVar5.addDisposable(prepare.execute((ak2.e) a2Var, (ak2.e) hVar5.f73567y));
                        gb2.f fVar4 = gb2.f.f64747a;
                        String f39332b5 = f30Var.getF39332b();
                        Intrinsics.checkNotNullExpressionValue(f39332b5, "getUid(...)");
                        gb2.f.c(new gb2.i(f39332b5, wa2.p.STATE_LOW_QUALITY));
                        is0.h.t3(hVar5, f30Var, true);
                        hVar5.B3(f30Var);
                        return;
                    case 6:
                        is0.h hVar6 = (is0.h) obj;
                        is0.h.q3(hVar6, h32.u0.PIN_FEEDBACK_REASON_NOT_MY_TASTE);
                        Intrinsics.f(f30Var);
                        com.pinterest.hairball.network.d prepare2 = hVar6.f73556n.prepare(f30Var);
                        Intrinsics.checkNotNullExpressionValue(a2Var, "emptyConsumer(...)");
                        hVar6.addDisposable(prepare2.execute((ak2.e) a2Var, (ak2.e) hVar6.f73567y));
                        ls0.f fVar5 = hVar6.f73564v;
                        if ((fVar5 != null ? fVar5.f84626a : null) == ls0.g.FOLLOW_INTEREST) {
                            gb2.f fVar6 = gb2.f.f64747a;
                            String f39332b6 = f30Var.getF39332b();
                            Intrinsics.checkNotNullExpressionValue(f39332b6, "getUid(...)");
                            gb2.f.c(new gb2.i(f39332b6, wa2.p.STATE_TOPIC_NOT_FOR_ME));
                            is0.h.t3(hVar6, f30Var, true);
                            hVar6.B3(f30Var);
                            return;
                        }
                        gb2.f fVar7 = gb2.f.f64747a;
                        String f39332b7 = f30Var.getF39332b();
                        Intrinsics.checkNotNullExpressionValue(f39332b7, "getUid(...)");
                        gb2.f.c(new gb2.i(f39332b7, wa2.p.STATE_NOT_INTO));
                        is0.h.t3(hVar6, f30Var, true);
                        hVar6.B3(f30Var);
                        return;
                    default:
                        return;
                }
            default:
                ps0.r0 r0Var = (ps0.r0) obj2;
                rg0.s sVar = r0Var.I;
                i32.y0 y0Var = i32.y0.ANDROID_HOME_FEED_AFTER_SAVE;
                Map g13 = kotlin.collections.z0.g(new Pair(rg0.o.CONTEXT_PIN_ID, ((rg0.i0) obj).f108030a), new Pair(rg0.o.IS_PROMOTED, String.valueOf(f30Var.d5().booleanValue())));
                ps0.k0 k0Var = new ps0.k0(r0Var, 0);
                ps0.e eVar = (ps0.e) r0Var.getView();
                Intrinsics.checkNotNullExpressionValue(eVar, "access$getView(...)");
                kh2.d.X0(sVar, y0Var, k0Var, new ps0.k0(eVar, 1), g13, 16);
                return;
        }
    }

    public final void h(wy0 wy0Var) {
        GestaltText gestaltText;
        int i13 = this.f84313i;
        Object obj = this.f84315k;
        Object obj2 = this.f84314j;
        switch (i13) {
            case 7:
                ((fs0.w) obj2).N = wy0Var;
                boolean booleanValue = ((Boolean) nk1.a.f91101m.invoke(wy0Var, Boolean.valueOf(!wy0Var.R2().booleanValue()))).booleanValue();
                gs0.o oVar = (gs0.o) ((cs0.g) obj);
                RelativeLayout relativeLayout = oVar.f66073u;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(booleanValue ? 0 : 8);
                }
                boolean z13 = !wy0Var.R2().booleanValue();
                String Z2 = wy0Var.Z2();
                if (Z2 != null) {
                    String string = oVar.getContext().getString(z13 ? m60.x0.pin_overflow_follow_user : m60.x0.pin_overflow_unfollow_user);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String Y = df.j1.Y(string, new Object[]{Z2}, null, 6);
                    RelativeLayout relativeLayout2 = oVar.f66073u;
                    if (relativeLayout2 != null && (gestaltText = (GestaltText) relativeLayout2.findViewById(m60.t0.cell_title)) != null) {
                        pk.a0.p(gestaltText, Y);
                        break;
                    }
                }
                break;
            default:
                kt0.e0 e0Var = (kt0.e0) obj2;
                i92.k kVar = e0Var.f80812f;
                Intrinsics.f(wy0Var);
                kVar.c(new lr.d0(wy0Var, (z40.n) obj, e0Var.f80808b));
                break;
        }
    }

    public final void i(Throwable th3) {
        int i13 = this.f84313i;
        Object obj = this.f84315k;
        Object obj2 = this.f84314j;
        switch (i13) {
            case 14:
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(th3, "Failed to download image", tb0.p.CLOSEUP);
                ls0.n nVar = (ls0.n) obj2;
                nVar.f84674h.h(f80.b.pin_more_download_fail);
                ms0.c cVar = ms0.c.NETWORK_REQUEST_FAILURE;
                String str = (String) ((kotlin.jvm.internal.j0) obj).f80434a;
                if (str == null) {
                    str = "";
                }
                String message = th3.getMessage();
                ms0.d.a(nVar.f84683q, cVar, nVar.f84682p, nVar.f84667a, str, null, message, null, null, nVar.f84677k, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION);
                break;
            default:
                ((nt0.d) obj2).f92291c.q(th3, "Failed to download animated sticker", tb0.p.IDEA_PINS_CREATION);
                ((Function0) obj).invoke();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        int i13 = this.f84313i;
        int i14 = 0;
        Object obj2 = this.f84315k;
        Object obj3 = this.f84314j;
        switch (i13) {
            case 0:
                rl1.q it = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String str = (String) obj3;
                Integer n13 = ((z40.d0) obj2).n();
                return rl1.q.e(it, str, null, false, null, null, false, false, null, 0, n13 == null ? rl1.b.f108524a : new rl1.d(n13.intValue()), null, 1534);
            case 1:
                un1.m bind = (un1.m) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                wr0.c cVar = (wr0.c) obj3;
                wr0.a aVar = (wr0.a) obj2;
                int i15 = wr0.c.f130876d;
                cVar.getClass();
                boolean z13 = aVar.f130858d.length() > 0;
                String str2 = "@" + aVar.f130861g;
                fw0.a aVar2 = fw0.a.TRY;
                fw0.a aVar3 = aVar.f130864j;
                if (aVar3 != aVar2 || z13) {
                    String str3 = aVar.f130859e;
                    if (aVar3 == aVar2 && z13) {
                        string = cVar.getContext().getString(mg0.c.engagement_tab_tried_notification_with_comment, str2, str3);
                    } else if (aVar3 == fw0.a.PIN_COMMENT) {
                        string = cVar.getContext().getString(mg0.c.engagement_tab_comment_notification, str2, str3);
                    } else {
                        fw0.a aVar4 = fw0.a.PIN_MENTION;
                        string = (aVar3 != aVar4 || z13) ? (aVar3 == aVar4 && z13) ? cVar.getContext().getString(mg0.c.engagement_tab_pin_mention_notification_with_comment, str2, str3) : cVar.getContext().getString(mg0.c.engagement_tab_comment_mention_notification, str2, str3) : cVar.getContext().getString(mg0.c.engagement_tab_pin_mention_notification, str2);
                    }
                } else {
                    string = cVar.getContext().getString(mg0.c.engagement_tab_tried_notification, str2);
                }
                Intrinsics.f(string);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" ");
                String str4 = aVar.f130863i;
                sb3.append(str4);
                String sb4 = sb3.toString();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb4);
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, str2.length(), 33);
                spannableStringBuilder.setSpan(new TextAppearanceSpan(cVar.getContext(), eo1.f.LegoText_Size200), 0, sb4.length(), 33);
                spannableStringBuilder.setSpan(new TextAppearanceSpan(cVar.getContext(), av1.e.lego_news_hub_time_since_text), sb4.length() - str4.length(), sb4.length(), 33);
                bind.a(spannableStringBuilder);
                bind.f122910r = new u50.f0(str4);
                return Unit.f80348a;
            case 2:
                f((f30) obj);
                return Unit.f80348a;
            case 3:
                Map<String, String> it2 = (Map) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                EngagementTabRetrofitRemoteRequest engagementTabRetrofitRemoteRequest = (EngagementTabRetrofitRemoteRequest) obj3;
                x12.a pagedListService = engagementTabRetrofitRemoteRequest.getPagedListService();
                Object obj4 = ((j90.b) obj2).getParams()[0];
                Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.String");
                return pagedListService.b((String) obj4, engagementTabRetrofitRemoteRequest.maybeFreezeParameters(it2));
            case 4:
                return e((f30) obj);
            case 5:
                return e((f30) obj);
            case 6:
                return e((f30) obj);
            case 7:
                h((wy0) obj);
                return Unit.f80348a;
            case 8:
                f((f30) obj);
                return Unit.f80348a;
            case 9:
                f((f30) obj);
                return Unit.f80348a;
            case 10:
                return e((f30) obj);
            case 11:
                return b((rn1.a) obj);
            case 12:
                f((f30) obj);
                return Unit.f80348a;
            case 13:
                return b((rn1.a) obj);
            case 14:
                i((Throwable) obj);
                return Unit.f80348a;
            case 15:
                f((f30) obj);
                return Unit.f80348a;
            case 16:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                nx.d0 d0Var = ((uk1.d) ((yi0.a) obj3).f139068b).f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                nx.d0.B(d0Var, booleanValue ? h32.f1.TOGGLE_OFF : h32.f1.TOGGLE_ON, null, null, yi0.a.i((zs) obj2), 22);
                return Unit.f80348a;
            case 17:
                xs0.a displayState = (xs0.a) obj;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                v7 v7Var = (v7) obj3;
                String boardId = v7Var.getF39332b();
                Intrinsics.checkNotNullExpressionValue(boardId, "getUid(...)");
                String L = kh2.d.L(v7Var);
                String boardName = v7Var.j1();
                Intrinsics.checkNotNullExpressionValue(boardName, "getName(...)");
                Boolean valueOf = Boolean.valueOf(kh2.d.M0(v7Var));
                Boolean g13 = v7Var.g1();
                Boolean z03 = v7Var.z0();
                Intrinsics.checkNotNullExpressionValue(z03, "getAllowHomefeedRecommendations(...)");
                boolean booleanValue2 = z03.booleanValue();
                Integer l13 = v7Var.l1();
                Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
                int intValue = l13.intValue();
                List I0 = v7Var.I0();
                Integer q13 = v7Var.q1();
                Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
                int intValue2 = q13.intValue();
                Date D0 = v7Var.D0();
                xs0.h hVar = (xs0.h) obj2;
                boolean z14 = (hVar.f135815b && hVar.f135816c) ? false : true;
                Integer J0 = v7Var.J0();
                Intrinsics.checkNotNullExpressionValue(J0, "getCollaboratorCount(...)");
                int intValue3 = J0.intValue();
                displayState.getClass();
                Intrinsics.checkNotNullParameter(boardId, "boardId");
                Intrinsics.checkNotNullParameter(boardName, "boardName");
                return new xs0.a(boardId, L, boardName, valueOf, g13, booleanValue2, true, intValue, I0, intValue2, D0, z14, intValue3);
            case 18:
                return b((rn1.a) obj);
            case 19:
                on1.i event = (on1.i) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.j() == xp1.a.board_toggle_item) {
                    ((CompoundButton.OnCheckedChangeListener) obj3).onCheckedChanged(((SbaHfBoardToggleSettingCellView) obj2).f45820g, event instanceof on1.g);
                }
                return Unit.f80348a;
            case 20:
                return b((rn1.a) obj);
            case 21:
                lr.f fVar = (lr.f) obj;
                i92.k kVar = ((kt0.e0) obj3).f80812f;
                Intrinsics.f(fVar);
                kVar.c(fVar);
                boolean z15 = lr.f.f84504g;
                String inviteId = ((k8) obj2).f39332b;
                Intrinsics.checkNotNullParameter(inviteId, "inviteId");
                lb0.p pVar = lb0.n.f82725d;
                Set h10 = ((lb0.b) pVar.a()).h("PREF_BOARD_INVITE_ID_SEEN_LAST_24H_2024_V1", new LinkedHashSet());
                if (h10 != null) {
                    if (h10.size() >= 30) {
                        dl2.b.s(h10).remove(CollectionsKt.T(h10));
                    }
                    h10.add(Instant.now().toString() + "_" + inviteId);
                    lb0.m c13 = ((lb0.b) pVar.a()).c();
                    c13.putStringSet("PREF_BOARD_INVITE_ID_SEEN_LAST_24H_2024_V1", h10);
                    c13.apply();
                }
                return Unit.f80348a;
            case 22:
                h((wy0) obj);
                return Unit.f80348a;
            case 23:
                i((Throwable) obj);
                return Unit.f80348a;
            case 24:
                return b((rn1.a) obj);
            case 25:
                return b((rn1.a) obj);
            case 26:
                rq config = (rq) obj;
                Intrinsics.checkNotNullParameter(config, "config");
                return rq.a(config, (String) obj3, (Matrix) obj2, null, 19);
            case 27:
                bo0 mediaItem = (bo0) obj;
                Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
                Matrix matrix = (Matrix) obj3;
                return bo0.a(mediaItem, null, 0L, 0L, matrix != null ? new Matrix(matrix) : null, new Matrix((Matrix) obj2), 0.0f, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_FEED_FOOTER);
            case 28:
                sl1.i it3 = (sl1.i) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                dc0.o oVar = (dc0.o) obj3;
                dc0.k kVar2 = oVar.f54340d;
                Intrinsics.f(kVar2);
                Integer J02 = ((v7) obj2).J0();
                Intrinsics.checkNotNullExpressionValue(J02, "getCollaboratorCount(...)");
                int intValue4 = J02.intValue();
                dc0.k kVar3 = oVar.f54340d;
                Intrinsics.f(kVar3);
                return sl1.i.e(it3, kVar2.f54325a, intValue4, kVar3.f54326b, false, null, fm1.c.VISIBLE, RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER);
            default:
                Boolean[] boolArr = (Boolean[]) obj;
                Intrinsics.f(boolArr);
                int length = boolArr.length;
                while (true) {
                    if (i14 >= length) {
                        ((com.pinterest.feature.ideaPinCreation.closeup.view.m0) obj3).f46245m = true;
                        com.pinterest.feature.ideaPinCreation.closeup.view.t1 t1Var = (com.pinterest.feature.ideaPinCreation.closeup.view.t1) obj2;
                        if (t1Var != null) {
                            t1Var.a();
                        }
                    } else if (boolArr[i14].booleanValue()) {
                        i14++;
                    }
                }
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(fs0.w wVar, String str) {
        super(1);
        this.f84313i = 9;
        this.f84315k = wVar;
        this.f84314j = str;
    }
}
