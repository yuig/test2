package yv1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.x;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.partnerAnalytics.PartnerAnalyticsLocation;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.PinMetadataCard;
import com.pinterest.partnerAnalytics.feature.pinstats.customviews.SaveToBoardCard;
import com.pinterest.reportFlow.feature.ReportFlowScreenLocation;
import com.pinterest.reportFlow.feature.rvc.view.RVCSectionItemView;
import com.pinterest.reportFlow.feature.view.ReportReasonRowView;
import com.pinterest.reportFlow.feature.view.ReportSecondaryReasonRow;
import com.pinterest.screens.u2;
import com.pinterest.shuffles.cutout.editor.ui.select.CropRectContainer;
import com.pinterest.shuffles.cutout.editor.ui.select.MaskedImageView;
import com.pinterest.shuffles.scene.composer.z;
import f72.r;
import g72.i0;
import g72.o;
import g72.u4;
import g72.v1;
import h32.f1;
import h32.g0;
import h32.u0;
import i32.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.u;
import m62.g1;
import r02.e0;
import r02.s0;
import r72.a2;
import r72.u1;
import r72.x0;
import so.ba;
import so.v0;
import tu.d0;
import v02.q;
import v02.t;

/* loaded from: classes4.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140233i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f140234j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i13) {
        super(0);
        this.f140233i = i13;
        this.f140234j = obj;
    }

    public final String b() {
        int i13 = this.f140233i;
        Object obj = this.f140234j;
        switch (i13) {
            case 20:
                return a.a.i("Failed to load image: ", obj);
            case 21:
            case 23:
            case 24:
            default:
                return "mapMotionEffect(): failed to map " + ((u4) obj);
            case 22:
                return a.c.g("Error getting image size for imageUri=", (Uri) obj);
            case 25:
                return a.a.j("mapShuffleAsset(): failed to map item.id=", ((r) obj).f61349a);
            case 26:
                return "mapAlphaEffect(): failed to map " + ((o) obj);
            case 27:
                return "mapBorderEffect(): failed to map " + ((v1) obj);
            case 28:
                return "mapFilterEffect(): failed to map " + ((i0) obj);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f140233i;
        byte b13 = 0;
        Object obj = this.f140234j;
        switch (i13) {
            case 0:
                m296invoke();
                return Unit.f80348a;
            case 1:
                d0 d0Var = (d0) obj;
                return new yw1.c((px.a) d0Var.f119280b, (b60.b) d0Var.f119281c, ((xw1.a) d0Var.f119284f).f136124b);
            case 2:
                m296invoke();
                return Unit.f80348a;
            case 3:
                return ((v0) ((xw1.b) obj)).a();
            case 4:
                Navigation navigation = ((qx1.c) obj).I;
                Integer valueOf = navigation != null ? Integer.valueOf(navigation.q1(0, "com.pinterest.EXTRA_ANALYTICS_SCREEN_TAB_POSITION")) : null;
                return valueOf != null ? (qx1.d) qx1.d.getEntries().get(valueOf.intValue()) : qx1.d.HOME_ANALYTICS;
            case 5:
                rx1.d dVar = (rx1.d) obj;
                uk1.e eVar = dVar.f110204w0;
                if (eVar != null) {
                    return uk1.e.c(eVar, dVar);
                }
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            case 6:
                PinMetadataCard pinMetadataCard = (PinMetadataCard) obj;
                ni1.d0 d0Var2 = pinMetadataCard.f50214q;
                if (d0Var2 != null) {
                    return ((ba) d0Var2).a(pinMetadataCard.f50216s, new ss0.b(4), new a.e(2));
                }
                Intrinsics.r("vmStateConverterFactory");
                throw null;
            case 7:
                m296invoke();
                return Unit.f80348a;
            case 8:
                m296invoke();
                return Unit.f80348a;
            case 9:
                wy0 f13 = ((b60.d) ((by1.i) obj).f24155c).f();
                return Boolean.valueOf(f13 != null ? Intrinsics.d(f13.G3(), Boolean.TRUE) : false);
            case 10:
                m296invoke();
                return Unit.f80348a;
            case 11:
                m296invoke();
                return Unit.f80348a;
            case 12:
                m296invoke();
                return Unit.f80348a;
            case 13:
                Context requireContext = ((e0) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new RVCSectionItemView(6, requireContext, (AttributeSet) (b13 == true ? 1 : 0));
            case 14:
                return Float.valueOf(((s0) obj).getResources().getDimension(h02.a.board_action_toolbar_elevation));
            case 15:
                Context requireContext2 = ((q) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new ReportReasonRowView(requireContext2);
            case 16:
                Context requireContext3 = ((t) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new ReportSecondaryReasonRow(requireContext3);
            case 17:
                rg0.s sVar = ((com.pinterest.schoolTeenPrompt.g) obj).f50467h0;
                if (sVar != null) {
                    return ((dh0.d) sVar).j(y0.ANDROID_APP_TAKEOVER);
                }
                Intrinsics.r("experiences");
                throw null;
            case 18:
                m296invoke();
                return Unit.f80348a;
            case 19:
                x0 x0Var = x0.f106703e;
                q62.a aVar = ((g1) obj).f85986f;
                int i14 = h62.m.effect_preview_rect;
                Resources resources = aVar.f102593a.getResources();
                Uri build = new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(i14)).appendPath(resources.getResourceTypeName(i14)).appendPath(resources.getResourceEntryName(i14)).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                String uri = build.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                int i15 = z.f52181a;
                x0 a13 = x0.a(x0Var, new r72.y0(uri, i15, i15, i15), null, 14);
                u1 u1Var = u1.f106668t;
                int i16 = a2.f106437b;
                Intrinsics.checkNotNullParameter("motion_preview", "value");
                return u1.f(u1Var, "motion_preview", null, 0.0d, 0.0d, null, a13, null, null, null, null, null, null, null, 262110);
            case 20:
                return b();
            case 21:
                m296invoke();
                return Unit.f80348a;
            case 22:
                return b();
            case 23:
                int i17 = CropRectContainer.f51963o;
                ImageView imageView = ((CropRectContainer) obj).f51964a;
                if (imageView == null) {
                    Intrinsics.r("imageView");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(imageView, "imageView");
                if (imageView.getDrawable() == null) {
                    return new Rect();
                }
                RectF rectF = new RectF(0.0f, 0.0f, r2.getIntrinsicWidth(), r2.getIntrinsicHeight());
                imageView.getImageMatrix().mapRect(rectF);
                Rect rect = new Rect();
                rectF.roundOut(rect);
                return rect;
            case 24:
                m296invoke();
                return Unit.f80348a;
            case 25:
                return b();
            case 26:
                return b();
            case 27:
                return b();
            case 28:
                return b();
            default:
                return b();
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m296invoke() {
        int i13 = this.f140233i;
        Object obj = this.f140234j;
        switch (i13) {
            case 0:
                xv1.l lVar = ((j) obj).f140241i;
                if (lVar != null) {
                    lVar.r3(false);
                    break;
                }
                break;
            case 2:
                dx1.f fragment = (dx1.f) obj;
                ex1.l lVar2 = fragment.f56506y0;
                if (lVar2 != null) {
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    lVar2.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.ANALYTICS_FILTER_MENU_BUTTON, (r18 & 4) != 0 ? null : g0.ANALYTICS_MOBILE_HEADER, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    lVar2.f60411e.d(Navigation.w1(PartnerAnalyticsLocation.ANALYTICS_FILTER));
                    break;
                }
                break;
            case 7:
                SaveToBoardCard saveToBoardCard = (SaveToBoardCard) obj;
                nx.d0 d0Var = saveToBoardCard.f50224a;
                if (d0Var != null) {
                    d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.PIN_ANALYTICS_SEE_ALL_SAVED_BOARDS_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                String str = saveToBoardCard.f50228e;
                if (str != null) {
                    u.f85943a.d(Navigation.z0((ScreenLocation) u2.f51425b.getValue(), str));
                    break;
                }
                break;
            case 8:
                int i14 = zx1.k.f143044x0;
                a11.e.e((a11.e) ((zx1.k) obj).f126842n0.getValue(), "https://help.pinterest.com/en/business/article/pin-stats", null, 6);
                break;
            case 10:
                int i15 = com.pinterest.qrCodeLogin.z.f50362q0;
                kh2.j.x2(((com.pinterest.qrCodeLogin.z) obj).d8(), com.pinterest.qrCodeLogin.k.f50326a);
                break;
            case 11:
                int i16 = r02.g.f105747h0;
                d7.g.s(Navigation.w1(ReportFlowScreenLocation.SETTINGS_RVC_LINKED_BAS_SHEET), ((r02.g) obj).f7());
                break;
            case 12:
                int i17 = r02.j.f105759l0;
                ((r02.j) obj).e8();
                break;
            case 18:
                v42.k kVar = (v42.k) obj;
                kVar.getHandler().postDelayed(kVar.M, 200L);
                break;
            case 21:
                ((Function1) ((bn0.a) obj).f23561d).invoke(u62.j.f120844a);
                break;
            default:
                x xVar = (x) obj;
                ((MaskedImageView) xVar.f31695c).post(new s81.g(xVar, 17));
                break;
        }
    }
}
