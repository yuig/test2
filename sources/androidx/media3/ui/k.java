package androidx.media3.ui;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.b2;
import com.pinterest.ads.feature.owc.view.showcase.subpage.AdsShowcaseSubpageItemView;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.pu;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.vn0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.yb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.mediagallery.view.MediaButtonView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.v3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kh2.g3;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.e2;
import lh0.z3;
import net.quikkly.android.utils.BitmapUtils;
import q91.c1;
import q91.d1;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19046c;

    public /* synthetic */ k(Object obj, int i13, int i14) {
        this.f19044a = i14;
        this.f19046c = obj;
        this.f19045b = i13;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List items;
        bo0 bo0Var;
        List items2;
        List list;
        List list2;
        int i13 = this.f19044a;
        int i14 = 0;
        int i15 = this.f19045b;
        Object obj = this.f19046c;
        switch (i13) {
            case 0:
                l lVar = (l) obj;
                lVar.getClass();
                PlayerControlView playerControlView = lVar.f19049f;
                if (i15 != 0) {
                    float f13 = lVar.f19048e[i15];
                    float[] fArr = PlayerControlView.U;
                    playerControlView.getClass();
                }
                playerControlView.f18965i.dismiss();
                return;
            case 1:
                AdsShowcaseSubpageItemView this$0 = (AdsShowcaseSubpageItemView) obj;
                int i16 = AdsShowcaseSubpageItemView.f35399i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                zt.a aVar = this$0.f35406g;
                if (aVar != null) {
                    aVar.f142755a.g(i15, false);
                    return;
                }
                return;
            case 2:
                vv0.d listener = (vv0.d) obj;
                int i17 = zv0.d.f142856l;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                yv0.c cVar = (yv0.c) listener;
                int i18 = cVar.f140215p;
                if (i18 == i15) {
                    cVar.f140215p = -1;
                    Object adapter = cVar.getAdapter();
                    if (adapter != null) {
                        ((b2) adapter).i(i15);
                    }
                    vn0 u33 = cVar.u3();
                    if (u33 != null) {
                        cVar.H3(u33);
                    }
                } else {
                    cVar.f140215p = i15;
                    Object adapter2 = cVar.getAdapter();
                    if (adapter2 != null) {
                        ((b2) adapter2).i(i18);
                    }
                    Object adapter3 = cVar.getAdapter();
                    if (adapter3 != null) {
                        ((b2) adapter3).i(i15);
                    }
                    vn0 u34 = cVar.u3();
                    if (u34 != null && (items = u34.getItems()) != null && (bo0Var = (bo0) CollectionsKt.U(i15, items)) != null) {
                        cVar.I3(bo0Var);
                    }
                }
                vn0 u35 = cVar.u3();
                if (u35 == null || (items2 = u35.getItems()) == null) {
                    return;
                }
                int size = items2.size();
                Object adapter4 = cVar.getAdapter();
                if (adapter4 != null) {
                    ((b2) adapter4).i(size);
                    return;
                }
                return;
            case 3:
                MediaButtonView this$02 = (MediaButtonView) obj;
                int i19 = MediaButtonView.f46728f;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                pw0.o oVar = this$02.f46733e;
                if (oVar != null) {
                    qw0.j jVar = (qw0.j) oVar;
                    if (((pu) jVar.f105302x.getItem(i15)) instanceof yb) {
                        z3 z3Var = a4.f83297a;
                        e2 e2Var = jVar.f105289k;
                        if (e2Var.a("disable_all", z3Var) || e2Var.a("disable_web_pins", z3Var)) {
                            sw0.j0 j0Var = (sw0.j0) ((pw0.e0) jVar.getView());
                            FragmentActivity requireActivity = j0Var.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                            Context requireContext = j0Var.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            g3.v2(requireActivity, requireContext);
                            return;
                        }
                        jVar.getPinalytics().X(h32.u0.CAMERA_BUTTON);
                        sw0.j0 j0Var2 = (sw0.j0) ((pw0.e0) jVar.getView());
                        ny1.w f93 = j0Var2.f9();
                        FragmentActivity requireActivity2 = j0Var2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                        f93.c(requireActivity2, hf0.b.q() ? ny1.d.f92664f : ny1.b.f92662f, (r23 & 4) != 0 ? "" : tb0.p.MEDIA_GALLERY.toString(), null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : null, (r23 & 1024) != 0 ? ny1.t.f92703n : new sw0.f0(j0Var2, i14));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                k71.j listener2 = (k71.j) obj;
                int i23 = q71.i0.f102719e;
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                o71.z zVar = (o71.z) listener2;
                vh vhVar = zVar.f93417d;
                if (vhVar != null) {
                    zVar.getPinalytics().F(o71.z.q3(vhVar), h32.u0.PIN_CELL);
                }
                vh vhVar2 = zVar.f93417d;
                if (vhVar2 != null && (list2 = vhVar2.f42865w) != null) {
                    i14 = list2.size();
                }
                if (i15 < 0 || i15 >= i14) {
                    return;
                }
                vh vhVar3 = zVar.f93417d;
                Object obj2 = (vhVar3 == null || (list = vhVar3.f42865w) == null) ? null : (dl1.s) list.get(i15);
                f30 f30Var = obj2 instanceof f30 ? (f30) obj2 : null;
                if (f30Var != null) {
                    zVar.f93415b.d(Navigation.z0((ScreenLocation) v3.f51465a.getValue(), f30Var.getUid()));
                    return;
                }
                return;
            case 5:
                p91.o this$03 = (p91.o) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.f99315f.s7().F(h32.g0.LANGUAGE_DEFAULT_MENU, h32.u0.DEFAULT_LANGUAGE);
                List list3 = this$03.f99314e;
                String value = ((m91.n) list3.get(i15)).f86742b;
                HashMap hashMap = bd1.e.f22722a;
                Intrinsics.checkNotNullParameter(value, "value");
                String languageCode = ((m91.n) list3.get(i15)).f86741a;
                d1 d1Var = this$03.f99315f;
                d1Var.getClass();
                Intrinsics.checkNotNullParameter(languageCode, "languageCode");
                Map g13 = z0.g(new Pair("source_site", "p"), new Pair("surface_tag", "settings"), new Pair("locale", languageCode));
                wy0 f14 = ((b60.d) d1Var.getActiveUserManager()).f();
                if (f14 != null) {
                    d1Var.A7().j0(f14, g13).i(new fp.a(26, d1Var, languageCode), new p91.y(5, new c1(d1Var, 1)));
                    return;
                }
                return;
            default:
                ee1.c this$04 = (ee1.c) obj;
                int i24 = ee1.c.f58785d;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                ee1.g gVar = this$04.f58787b;
                if (gVar == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                ee1.e eVar = (ee1.e) gVar;
                xk2.v vVar = eVar.f58796f;
                ee1.h hVar = (ee1.h) CollectionsKt.U(i15, (List) vVar.getValue());
                ee1.h hVar2 = (ee1.h) CollectionsKt.U(i15, (List) vVar.getValue());
                ge1.a aVar2 = eVar.f58795e ? ge1.a.FILTER_ERROR_STATE_EOF_BUTTON_TAPPED : ge1.a.FILTER_ERROR_STATE_BUTTON_TAPPED;
                if (hVar2 != null) {
                    eVar.f58793c.r(aVar2, hVar2);
                }
                int i25 = eVar.f58797g;
                ee1.f fVar = eVar.f58792b;
                if (i25 == 1) {
                    fVar.y0();
                } else {
                    fVar.H2(hVar != null ? hVar.f58799a : null, i25 - 1);
                }
                int i26 = eVar.f58797g;
                if (i26 > 0) {
                    eVar.f58797g = i26 - 1;
                    return;
                }
                return;
        }
    }
}
