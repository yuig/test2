package h81;

import ae1.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import ba1.y;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.settings.SettingsUnlinkBAFeatureLocation;
import com.pinterest.feature.settings.claimedaccount.handshake.listaccounts.ClaimedAccountItemView;
import com.pinterest.feature.sharesheet.view.ContactSearchListCell;
import com.pinterest.feature.sharesheet.view.InviteModalAppListView;
import com.pinterest.feature.sharesheet.view.InviteModalAppView;
import com.pinterest.feature.sharesheet.view.SharesheetModalVerticalContactView;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import com.pinterest.navigation.Navigation;
import de1.g0;
import de1.i;
import de1.o0;
import fd1.t0;
import fk2.x;
import h32.f1;
import h32.u0;
import i92.k;
import kc1.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lb0.r;
import lc1.p;
import lh0.f4;
import m60.r0;
import p91.w;
import pb1.m;
import q91.g;
import q91.g1;
import q91.i0;
import sb1.l;
import tb1.j;
import wb1.o;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68129i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f68130j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i13) {
        super(0);
        this.f68129i = i13;
        this.f68130j = obj;
    }

    public final Float b() {
        int i13 = this.f68129i;
        Object obj = this.f68130j;
        switch (i13) {
            case 1:
                return Float.valueOf((((r1.getWidth() / 2.0f) - ((x81.d) obj).f134179a) / 2.0f) - ((r1.f134180b - r3) / 2.0f));
            case 13:
                return Float.valueOf(((m) obj).getResources().getDimension(c52.a.settings_header_elevation));
            case 14:
                return Float.valueOf(((l) obj).getResources().getDimension(c52.a.settings_header_elevation));
            case 15:
                return Float.valueOf(((j) obj).getResources().getDimension(c52.a.settings_header_elevation));
            default:
                return Float.valueOf(((sc1.b) obj).getResources().getDimension(d70.b.lego_board_action_toolbar_elevation));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = 14;
        int i14 = this.f68129i;
        AttributeSet attributeSet = null;
        Object obj = this.f68130j;
        switch (i14) {
            case 0:
                return Integer.valueOf(((c) obj).getResources().getDimensionPixelSize(vc2.a.flashlight_dot_size));
            case 1:
                return b();
            case 2:
                d91.j jVar = (d91.j) obj;
                Context requireContext = jVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new q21.d(requireContext, jVar.s7(), jVar.p7(), null, 0, null, null, jVar.f54087k1, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
            case 3:
                m145invoke();
                return Unit.f80348a;
            case 4:
                m145invoke();
                return Unit.f80348a;
            case 5:
                switch (i14) {
                    case 5:
                        return (GestaltRadioGroup) ((g) obj).findViewById(b52.a.account_settings_radio_group);
                    default:
                        return (GestaltRadioGroup) ((o) obj).findViewById(c52.c.details_settings_radio_group);
                }
            case 6:
                m145invoke();
                return Unit.f80348a;
            case 7:
                m145invoke();
                return Unit.f80348a;
            case 8:
                Context requireContext2 = ((y) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new ClaimedAccountItemView(6, requireContext2, attributeSet);
            case 9:
                m145invoke();
                return Unit.f80348a;
            case 10:
                m145invoke();
                return Unit.f80348a;
            case 11:
                m145invoke();
                return Unit.f80348a;
            case 12:
                ib1.e eVar = (ib1.e) obj;
                Context requireContext3 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new ib1.b(requireContext3, new ib1.d(1, eVar, ib1.e.class, "onPageClick", "onPageClick(Lcom/pinterest/feature/settings/notificationslist/model/NotificationsItem$NotificationsPage;)V", 0));
            case 13:
                return b();
            case 14:
                return b();
            case 15:
                return b();
            case 16:
                switch (i14) {
                    case 5:
                        return (GestaltRadioGroup) ((g) obj).findViewById(b52.a.account_settings_radio_group);
                    default:
                        return (GestaltRadioGroup) ((o) obj).findViewById(c52.c.details_settings_radio_group);
                }
            case 17:
                FragmentActivity requireActivity = ((d0) obj).requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return new p(requireActivity);
            case 18:
                return b();
            case 19:
                m145invoke();
                return Unit.f80348a;
            case 20:
                m145invoke();
                return Unit.f80348a;
            case 21:
                m145invoke();
                return Unit.f80348a;
            case 22:
                Context context = ((InviteModalAppListView) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new InviteModalAppView(context);
            case 23:
                return (InviteModalAppListView) ((fd1.s) obj).findViewById(b62.b.invite_app_container);
            case 24:
                Context context2 = ((t0) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new SharesheetModalVerticalContactView(context2);
            case 25:
                sd1.a aVar = (sd1.a) obj;
                return new rd1.b(aVar.w3(), ((ze1.d) aVar.f112313m).f141814e, aVar.f112311k, (f4) aVar.f112314n, (r) aVar.f112315o);
            case 26:
                hd1.c listParams = ((vd1.d) obj).w3();
                Intrinsics.checkNotNullParameter(listParams, "listParams");
                return new hd1.d(listParams, null, 14);
            case 27:
                f fVar = (f) obj;
                Context context3 = fVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                ae1.b bVar = fVar.f15056d;
                int dimensionPixelSize = fVar.getResources().getDimensionPixelSize(r0.margin_extra_small);
                Context context4 = fVar.getContext();
                int i15 = eo1.b.color_themed_text_default;
                Object obj2 = d5.a.f53679a;
                int color = context4.getColor(i15);
                int dimensionPixelSize2 = fVar.getResources().getDimensionPixelSize(mz1.c.color_filter_diameter);
                int dimensionPixelSize3 = fVar.getResources().getDimensionPixelSize(mz1.c.color_filter_diameter);
                int dimensionPixelSize4 = fVar.getResources().getDimensionPixelSize(eo1.c.margin);
                Intrinsics.checkNotNullParameter(context3, "context");
                fe1.a aVar2 = new fe1.a(context3, dimensionPixelSize, color, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
                aVar2.f62041f = bVar;
                aVar2.setOnClickListener(new lc1.b(aVar2, i13));
                return aVar2;
            case 28:
                i iVar = (i) ((o0) obj).getViewIfBound();
                if (iVar instanceof g0) {
                    return (g0) iVar;
                }
                return null;
            default:
                de1.e eVar2 = (de1.e) obj;
                if (eVar2 instanceof de1.d0) {
                    return (de1.d0) eVar2;
                }
                return null;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m145invoke() {
        int i13 = this.f68129i;
        int i14 = 1;
        Object obj = this.f68130j;
        switch (i13) {
            case 3:
                ((k) ((android.support.v4.media.a) obj).f15842f).j(a62.e.export_failed);
                return;
            case 4:
                w.D3((w) obj, null, true, 1);
                return;
            case 6:
                int i15 = i0.f103134h0;
                ((i0) obj).z(q91.b.f103070q);
                return;
            case 7:
                g1.b8((g1) obj);
                return;
            case 9:
                pa1.b bVar = (pa1.b) obj;
                bVar.getClass();
                try {
                    nx.d0.v(bVar.getPinalytics(), f1.USER_DEACTIVATED, null, false, 12);
                    bVar.t3();
                    bVar.f99396e.invoke(new pa1.a(bVar, i14));
                    return;
                } catch (Exception e13) {
                    bVar.f99393b.e(e13.getMessage());
                    return;
                }
            case 10:
                ab1.c cVar = ((bb1.i) obj).f22512m0;
                if (cVar != null) {
                    cVar.r3(true);
                    return;
                }
                return;
            case 11:
                bb1.s sVar = (bb1.s) obj;
                sVar.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.RESEND_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                ab1.l lVar = sVar.f22556n0;
                if (lVar != null) {
                    wy0 wy0Var = lVar.f1728d;
                    if (wy0Var == null) {
                        Intrinsics.r("user");
                        throw null;
                    }
                    String N2 = wy0Var.N2();
                    if (N2 != null) {
                        int i16 = 2;
                        fk2.l lVar2 = new fk2.l(new x(lVar.f1726b.j(N2).l(tk2.e.f118017c).h(wj2.c.a()), new ta1.c(25, new ab1.k(lVar, i16)), ck2.i.f27924d, ck2.i.f27923c), new ab1.i(lVar, i16), 0);
                        int i17 = 3;
                        ek2.f i18 = lVar2.i(new ab1.i(lVar, i17), new ta1.c(26, new ab1.k(lVar, i17)));
                        Intrinsics.checkNotNullExpressionValue(i18, "subscribe(...)");
                        lVar.addDisposable(i18);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                zc1.f fVar = (zc1.f) obj;
                va1.r rVar = fVar.f141600c;
                if (rVar != null) {
                    fVar.f141598a.invoke(rVar);
                    return;
                }
                return;
            case 20:
                d7.g.s(Navigation.w1(SettingsUnlinkBAFeatureLocation.UNLINK_BA_EXPIRED_LINK_MODAL), ((ad1.d) obj).f7());
                return;
            default:
                ContactSearchListCell contactSearchListCell = (ContactSearchListCell) obj;
                View.OnClickListener onClickListener = contactSearchListCell.f48391h;
                if (onClickListener != null) {
                    onClickListener.onClick(contactSearchListCell);
                    return;
                }
                return;
        }
    }
}
