package ee1;

import a.z0;
import ac2.a1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.ui.h0;
import bc2.m;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.todaytab.tab.view.TodayTabSingleCreatorModule;
import com.pinterest.feature.unifiedcomments.view.CommunityInsightHeaderView;
import com.pinterest.feature.video.worker.StatusMediaWorker;
import com.pinterest.feature.video.worker.VideoPinCreateMediaWorker;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.ui.components.banners.LegoBannerView;
import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.video.view.SimplePlayerControlView;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.f4;
import lh0.g1;
import lh0.m0;
import lh0.w1;
import lh0.z3;
import m60.t0;
import mq.w;
import ni1.d0;
import ni1.x2;
import re1.a0;
import re1.c0;
import rf1.p;
import rh1.e2;
import rh1.k0;
import rl1.q;
import s7.z;
import so.ba;
import u50.i0;
import u60.l;
import we1.p2;
import we1.t2;
import we1.u2;
import zd1.r;
import zy.q0;

/* loaded from: classes5.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58789i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f58790j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i13) {
        super(0);
        this.f58789i = i13;
        this.f58790j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f58789i;
        boolean z13 = true;
        Object obj = this.f58790j;
        switch (i13) {
            case 4:
                f4 f4Var = ((se1.d) obj).f112441b;
                f4Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) f4Var.f83347a;
                if (!g1Var.o("android_sba_structured_feed", "enabled", z3Var) && !g1Var.l("android_sba_structured_feed")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 16:
                m0 m0Var = ((qh1.e) obj).f103904e;
                m0Var.getClass();
                z3 z3Var2 = a4.f83297a;
                g1 g1Var2 = (g1) m0Var.f83421a;
                if (!g1Var2.o("ce_android_comment_composer_redesign", "enabled", z3Var2) && !g1Var2.l("ce_android_comment_composer_redesign")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 19:
                m0 m0Var2 = ((CommunityInsightHeaderView) obj).f48933d;
                if (m0Var2 == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var3 = a4.f83297a;
                g1 g1Var3 = (g1) m0Var2.f83421a;
                if (!g1Var3.o("ce_android_style_decoder", "enabled", z3Var3) && !g1Var3.l("ce_android_style_decoder")) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            default:
                return Boolean.valueOf(((x2) obj).f90850e);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        dl0 v63;
        int i13 = this.f58789i;
        int i14 = 6;
        boolean z13 = true;
        z13 = true;
        final int i15 = 0;
        List list = null;
        Drawable drawable = null;
        list = null;
        Object obj = this.f58790j;
        switch (i13) {
            case 0:
                e eVar = (e) obj;
                LinkedHashMap filterMap = eVar.f58791a.f141708c;
                ArrayList arrayList = new ArrayList();
                Iterator it = filterMap.values().iterator();
                while (it.hasNext()) {
                    zd1.h hVar = (zd1.h) CollectionsKt.firstOrNull((ArrayList) it.next());
                    t32.f c13 = hVar != null ? hVar.c() : null;
                    eVar.f58793c.getClass();
                    Intrinsics.checkNotNullParameter(filterMap, "filterMap");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = filterMap.values().iterator();
                    while (it2.hasNext()) {
                        for (zd1.h hVar2 : (ArrayList) it2.next()) {
                            if (hVar2 instanceof zd1.g) {
                                if (((zd1.g) hVar2).f141719j && (hVar2.c() == c13 || c13 == null)) {
                                    String str2 = ((zd1.g) hVar2).f141713d;
                                    if (str2 != null) {
                                        arrayList2.add(str2);
                                    }
                                }
                            } else if (hVar2 instanceof r) {
                                r rVar = (r) hVar2;
                                if (rVar.f141748c == rVar.f141751f) {
                                    if (rVar.f141749d != rVar.f141752g) {
                                    }
                                }
                                if (hVar2.c() == c13 || c13 == null) {
                                    r rVar2 = (r) hVar2;
                                    String str3 = rVar2.f141755j;
                                    if (str3 != null) {
                                        arrayList2.add(str3);
                                    }
                                    String str4 = rVar2.f141756k;
                                    if (str4 != null) {
                                        arrayList2.add(str4);
                                    }
                                }
                            }
                        }
                    }
                    if (hVar instanceof zd1.g) {
                        str = ((zd1.g) hVar).f141727r;
                    } else {
                        str = hVar instanceof r ? ((r) hVar).f141759n : null;
                    }
                    if (str != null) {
                        arrayList.add(new h(c13, str, arrayList2));
                    }
                }
                return CollectionsKt.x0(arrayList, new s4.g(eVar, i14));
            case 1:
                return new l((pe1.g) obj, i14);
            case 2:
                m133invoke();
                return Unit.f80348a;
            case 3:
                c0 c0Var = (c0) obj;
                if (c0Var.isBound()) {
                    return (a0) c0Var.getView();
                }
                return null;
            case 4:
                return invoke();
            case 5:
                m133invoke();
                return Unit.f80348a;
            case 6:
                m133invoke();
                return Unit.f80348a;
            case 7:
                return new l((t2) obj, 7);
            case 8:
                m133invoke();
                return Unit.f80348a;
            case 9:
                m133invoke();
                return Unit.f80348a;
            case 10:
                m133invoke();
                return Unit.f80348a;
            case 11:
                p pVar = (p) obj;
                f30 f30Var = pVar.f107820r.f43312c;
                if (f30Var != null && (v63 = f30Var.v6()) != null) {
                    list = v63.s();
                }
                w1 w1Var = pVar.f107815m;
                w1Var.getClass();
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) w1Var.f83496a;
                if (!g1Var.o("ios_android_idea_ads_playtime_metric", "enabled", z3Var) && !g1Var.l("ios_android_idea_ads_playtime_metric")) {
                    z13 = false;
                }
                return new qg1.l(list, z13);
            case 12:
                m133invoke();
                return Unit.f80348a;
            case 13:
                m133invoke();
                return Unit.f80348a;
            case 14:
                m133invoke();
                return Unit.f80348a;
            case 15:
                gh1.f fVar = (gh1.f) obj;
                return ((GestaltButton) fVar.findViewById(n92.b.today_tab_upsell_cta)).e(new gh1.e(fVar, i15));
            case 16:
                return invoke();
            case 17:
                m133invoke();
                return Unit.f80348a;
            case 18:
                k0 k0Var = (k0) obj;
                d0 d0Var = k0Var.f108233v;
                if (d0Var != null) {
                    return ((ba) d0Var).a(k0Var.f108219i0, new w(k0Var, 16), new z0(k0Var, 22));
                }
                Intrinsics.r("vmStateConverterFactory");
                throw null;
            case 19:
                return invoke();
            case 20:
                return ((e2) obj).generateLoggingContext();
            case 21:
                uk1.e eVar2 = (uk1.e) ((tu.d0) obj).f119284f;
                if (eVar2 != null) {
                    return ((uk1.a) eVar2).g().f122379a;
                }
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            case 22:
                final di1.g gVar = (di1.g) obj;
                FragmentActivity requireActivity = gVar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                boolean f03 = gh0.b.f0(requireActivity);
                Integer[] numArr = PinterestVideoView.f52749c1;
                FragmentActivity requireActivity2 = gVar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                PinterestVideoView z14 = bk.f.z(requireActivity2, gVar.s7(), f03 ? rc2.b.video_view_fullscreen_a11y : rc2.b.video_view_fullscreen, 8);
                z14.e0(m.PIN_FULL_SCREEN);
                z14.C0.b("is_closeup_video", "true");
                z14.D0 = g0.FULL_SCREEN_VIDEO;
                z14.j0();
                SimplePlayerControlView simplePlayerControlView = z14.F;
                if (simplePlayerControlView != null) {
                    GestaltIcon gestaltIcon = (GestaltIcon) simplePlayerControlView.findViewById(h0.exo_play);
                    if (gestaltIcon != null) {
                        gestaltIcon.g2(di1.e.f55055j);
                    }
                    GestaltIcon gestaltIcon2 = (GestaltIcon) simplePlayerControlView.findViewById(h0.exo_pause);
                    if (gestaltIcon2 != null) {
                        gestaltIcon2.g2(di1.e.f55056k);
                    }
                    GestaltIcon gestaltIcon3 = (GestaltIcon) simplePlayerControlView.findViewById(a1.player_expand);
                    if (gestaltIcon3 != null) {
                        gestaltIcon3.g2(di1.e.f55057l);
                    }
                    GestaltButton gestaltButton = (GestaltButton) simplePlayerControlView.findViewById(t0.button_save);
                    if (gestaltButton != null) {
                        gestaltButton.e(new gm1.a() { // from class: di1.c
                            @Override // gm1.a
                            public final void h3(gm1.c it3) {
                                f30 f30Var2;
                                f30 f30Var3;
                                int i16 = i15;
                                g this$0 = gVar;
                                switch (i16) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(it3, "it");
                                        ai1.a aVar = this$0.f55061j0;
                                        if (aVar != null && (f30Var2 = aVar.f15245j) != null) {
                                            HashMap m13 = aVar.f15244i.m(f30Var2);
                                            aVar.getPinalytics().f0(u0.PIN_REPIN_BUTTON, g0.MODAL_PIN, f30Var2.getUid(), m13, false);
                                            k11.p.a(aVar.f15243h, f30Var2, true, false, false, null, false, null, aVar.getPinalytics(), null, null, new px0.g(aVar, f30Var2, m13, 21), 3580);
                                            aVar.f15241f.d(new lq.a(f30Var2.getUid()));
                                            break;
                                        }
                                        break;
                                    default:
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(it3, "it");
                                        ai1.a aVar2 = this$0.f55061j0;
                                        if (aVar2 != null && (f30Var3 = aVar2.f15245j) != null) {
                                            aVar2.getPinalytics().f0(u0.WEBSITE_BUTTON, g0.MODAL_PIN, f30Var3.getUid(), aVar2.f15244i.m(f30Var3), false);
                                            a11.e.d(aVar2.f15238c, f30Var3, 0, 0, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    GestaltButton gestaltButton2 = (GestaltButton) simplePlayerControlView.findViewById(t0.button_visit);
                    if (gestaltButton2 != null) {
                        final int i16 = z13 ? 1 : 0;
                        gestaltButton2.e(new gm1.a() { // from class: di1.c
                            @Override // gm1.a
                            public final void h3(gm1.c it3) {
                                f30 f30Var2;
                                f30 f30Var3;
                                int i162 = i16;
                                g this$0 = gVar;
                                switch (i162) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(it3, "it");
                                        ai1.a aVar = this$0.f55061j0;
                                        if (aVar != null && (f30Var2 = aVar.f15245j) != null) {
                                            HashMap m13 = aVar.f15244i.m(f30Var2);
                                            aVar.getPinalytics().f0(u0.PIN_REPIN_BUTTON, g0.MODAL_PIN, f30Var2.getUid(), m13, false);
                                            k11.p.a(aVar.f15243h, f30Var2, true, false, false, null, false, null, aVar.getPinalytics(), null, null, new px0.g(aVar, f30Var2, m13, 21), 3580);
                                            aVar.f15241f.d(new lq.a(f30Var2.getUid()));
                                            break;
                                        }
                                        break;
                                    default:
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(it3, "it");
                                        ai1.a aVar2 = this$0.f55061j0;
                                        if (aVar2 != null && (f30Var3 = aVar2.f15245j) != null) {
                                            aVar2.getPinalytics().f0(u0.WEBSITE_BUTTON, g0.MODAL_PIN, f30Var3.getUid(), aVar2.f15244i.m(f30Var3), false);
                                            a11.e.d(aVar2.f15238c, f30Var3, 0, 0, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    GestaltIconButton gestaltIconButton = (GestaltIconButton) simplePlayerControlView.findViewById(a1.cc_toggle_button);
                    if (gestaltIconButton != null) {
                        gestaltIconButton.u(new di1.d(simplePlayerControlView, i15));
                    }
                    FrameLayout frameLayout = simplePlayerControlView.f52780c0;
                    if (frameLayout != null) {
                        frameLayout.setContentDescription(z14.getContext().getString(androidx.media3.ui.k0.exo_controls_fullscreen_exit_description));
                    }
                }
                di1.f value = new di1.f(z14, gVar);
                Intrinsics.checkNotNullParameter(value, "value");
                z14.f52751a1 = value;
                z14.S();
                z14.u0(new pg1.a(3, z14, gVar));
                Context requireContext = gVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                int dimension = (int) gVar.getResources().getDimension(eo1.c.space_300);
                Drawable I = com.bumptech.glide.c.I(requireContext, ga2.c.ic_music);
                if (I != null) {
                    I.setBounds(0, 0, dimension, dimension);
                } else {
                    I = null;
                }
                gVar.f55063l0 = I;
                Drawable I2 = com.bumptech.glide.c.I(requireContext, ga2.c.ic_no_music);
                if (I2 != null) {
                    I2.setBounds(0, 0, dimension, dimension);
                    drawable = I2;
                }
                gVar.f55064m0 = drawable;
                return z14;
            case 23:
                String[] i17 = ((StatusMediaWorker) obj).f78963b.f19998b.i("MEDIA_IDS");
                return i17 == null ? new String[0] : i17;
            case 24:
                return Long.valueOf(((VideoPinCreateMediaWorker) obj).f78963b.f19998b.g("CREATE_TIMESTAMP", 0L));
            case 25:
                return ((q0) obj).a();
            case 26:
                return invoke();
            case 27:
                return new GestaltAvatar(((bj1.c) obj).f22966l, new q((String) null, (String) null, false, rl1.r.XS, (i0) null, false, fm1.c.VISIBLE, 0, (rl1.c) null, (fm1.a) null, 1907));
            case 28:
                m133invoke();
                return Unit.f80348a;
            default:
                m133invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m133invoke() {
        g0 g0Var;
        int i13 = this.f58789i;
        Object obj = this.f58790j;
        switch (i13) {
            case 2:
                z zVar = (z) obj;
                nx.d0 d0Var = (nx.d0) zVar.f111347c;
                f1 f1Var = f1.TAP;
                if (zVar.f111345a) {
                    g0Var = g0.STRUCTURED_FEED_END_OF_FEED_EMPTY_STATE;
                } else {
                    g0Var = g0.STRUCTURED_FEED_FULL_FEED_EMPTY_STATE;
                }
                d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0.STRUCTURED_FEED_EMPTY_STATE_BUTTON, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                break;
            case 5:
                ((ue1.h) obj).f122006b.c();
                break;
            case 6:
                ((p2) obj).f129553c.d(new dc0.h(false));
                break;
            case 8:
                ((u2) obj).f129637d.d(new dc0.h(false));
                break;
            case 9:
                oe1.c.d((oe1.b) obj, new LinkedHashMap());
                break;
            case 10:
                ((qf1.i0) obj).d();
                break;
            case 12:
                ((jg1.c) obj).f75926g.e(null);
                break;
            case 13:
                try {
                    et1.m0 m0Var = (et1.m0) obj;
                    boolean z13 = m0Var.f60050e;
                    kt1.b bVar = m0Var.f60046a;
                    if (z13) {
                        bVar.stop();
                    }
                    bVar.a();
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
            case 14:
                dh1.e eVar = ((TodayTabSingleCreatorModule) obj).f48668i;
                if (eVar != null) {
                    eVar.getPresenterPinalytics().f122379a.h(g0.TODAY_ARTICLE, u0.USER_FOLLOW, eVar.r3());
                    break;
                }
                break;
            case 17:
                bs1.c.X0((LegoBannerView) obj);
                break;
            case 28:
                ((lj1.a) obj).C().f128846i = !r3.f83613f;
                break;
            default:
                sj1.a aVar = (sj1.a) obj;
                aVar.f100282f.L = false;
                aVar.f113017p = true;
                break;
        }
    }
}
