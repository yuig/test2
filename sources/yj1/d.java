package yj1;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import bk1.a2;
import cn1.f0;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import com.pinterest.gestalt.attribution.GestaltAttribution;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.avatar.LegacyGestaltAvatar;
import com.pinterest.gestalt.bannerOverlay.GestaltBannerOverlay;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.modalAlert.GestaltModalAlert;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.sheet.container.GestaltSheetContainer;
import com.pinterest.gestalt.tag.GestaltTag;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.identity.authentication.view.RecoverUserItemView;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import com.pinterest.oneBarLibrary.modals.model.BodyTypeFilterBottomSheetModel;
import em1.p;
import ey.d0;
import ey.t4;
import fk1.w;
import h32.u0;
import h61.h;
import hr1.g;
import ht1.r;
import java.util.LinkedHashSet;
import jc0.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.z3;
import m60.u;
import pp1.f;
import ql1.l;
import u5.x;
import vu1.a0;
import vu1.b0;
import vu1.c0;
import wq1.n;
import yq1.c2;
import yq1.m1;

/* loaded from: classes5.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139210i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f139211j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i13) {
        super(0);
        this.f139210i = i13;
        this.f139211j = obj;
    }

    public final GestaltText b() {
        int i13 = this.f139210i;
        Object obj = this.f139211j;
        switch (i13) {
            case 6:
                return (GestaltText) ((GestaltAttribution) obj).findViewById(l.attribution_pinner_name);
            case 7:
            default:
                return (GestaltText) ((GestaltStaticSearchBar) obj).findViewById(f0.static_search_text);
            case 8:
                GestaltBannerOverlay gestaltBannerOverlay = (GestaltBannerOverlay) obj;
                Context context = gestaltBannerOverlay.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new GestaltText(context, gestaltBannerOverlay.L().f130180b);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        switch (this.f139210i) {
            case 1:
                return Boolean.valueOf(((a2) this.f139211j).f23158d.f90850e);
            case 2:
                return Boolean.valueOf(((w) this.f139211j).f62383d.f90850e);
            case 12:
                Context context = ((GestaltSheetContainer) this.f139211j).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return Boolean.valueOf(dl2.b.v0(eo1.a.comp_sheet_enable_media_header, context));
            case 13:
                Context context2 = ((GestaltTag) this.f139211j).getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return Boolean.valueOf(dl2.b.v0(eo1.a.comp_tag_enable_selected_start_icon, context2));
            case 21:
                kv.a aVar = (kv.a) this.f139211j;
                aVar.getClass();
                return Boolean.valueOf(aVar.h(z3.ACTIVATE_EXPERIMENT));
            default:
                tu1.l lVar = (tu1.l) this.f139211j;
                boolean z13 = true;
                if (lVar.f119414g.get() == null) {
                    synchronized (lVar) {
                        if (lVar.f119414g.get() == null) {
                            try {
                                if (lVar.f119413f) {
                                    lVar.f119414g.set(lVar.f119409b.a());
                                } else {
                                    lVar.f119414g.set(lVar.f119408a.a());
                                }
                            } catch (Throwable unused) {
                                z13 = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z13);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        yq1.a2 a2Var;
        c0 c0Var;
        int i13 = this.f139210i;
        Object obj = this.f139211j;
        switch (i13) {
            case 0:
                tn1.c cVar = new tn1.c(((e) obj).f139212l);
                bs1.c.u(cVar, null, 3);
                return cVar;
            case 1:
                return invoke();
            case 2:
                return invoke();
            case 3:
                com.pinterest.framework.multisection.datasource.pagedlist.c cVar2 = (com.pinterest.framework.multisection.datasource.pagedlist.c) obj;
                return new qr0.c(cVar2, cVar2);
            case 4:
                return new qo1.b(((h0) obj).O());
            case 5:
                m294invoke();
                return Unit.f80348a;
            case 6:
                return b();
            case 7:
                m294invoke();
                return Unit.f80348a;
            case 8:
                return b();
            case 9:
                return (CheckBox) ((GestaltCheckBox) obj).findViewById(p.checkBox);
            case 10:
                GestaltModalAlert gestaltModalAlert = (GestaltModalAlert) obj;
                if (gestaltModalAlert.T().f135370h != null) {
                    return gestaltModalAlert.f49448g.a0().f59598a;
                }
                return null;
            case 11:
                return b();
            case 12:
                return invoke();
            case 13:
                return invoke();
            case 14:
                return new xn1.e(((GestaltTextField) ((x) obj).f120537c).getId());
            case 15:
                m294invoke();
                return Unit.f80348a;
            case 16:
                m294invoke();
                return Unit.f80348a;
            case 17:
                m294invoke();
                return Unit.f80348a;
            case 18:
                Context context = ((m1) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                RecoverUserItemView recoverUserItemView = new RecoverUserItemView(context);
                View.inflate(recoverUserItemView.getContext(), vq1.c.recover_user_item_view, recoverUserItemView);
                recoverUserItemView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
                View findViewById = recoverUserItemView.findViewById(vq1.b.recover_user_avatar);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                recoverUserItemView.f49824a = (GestaltAvatar) findViewById;
                View findViewById2 = recoverUserItemView.findViewById(vq1.b.recover_user_name);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                recoverUserItemView.f49825b = (GestaltText) findViewById2;
                View findViewById3 = recoverUserItemView.findViewById(vq1.b.recover_user_button);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                recoverUserItemView.f49826c = (GestaltButton) findViewById3;
                return recoverUserItemView;
            case 19:
                yq1.a2[] a2VarArr = new yq1.a2[5];
                if (((c2) obj).C0 == qr1.f0.PERSONAL) {
                    a2Var = new yq1.a2(vq1.b.chk_terms_service, vq1.d.kr_terms_service, true, vq1.d.krconsent_url_terms_service);
                } else {
                    a2Var = new yq1.a2(vq1.b.chk_terms_service, vq1.d.kr_biz_terms_service, true, vq1.d.krconsent_url_terms_service_biz);
                }
                a2VarArr[0] = a2Var;
                a2VarArr[1] = new yq1.a2(vq1.b.chk_collection_usage, vq1.d.kr_collection_usage, true, vq1.d.krconsent_url_collection_personal_usage);
                a2VarArr[2] = new yq1.a2(vq1.b.chk_third_party_provision, vq1.d.kr_third_party_provision, true, vq1.d.krconsent_url_third_party_provision);
                a2VarArr[3] = new yq1.a2(vq1.b.chk_overseas_transfer, vq1.d.kr_overseas_transfer, true, vq1.d.krconsent_url_overseas_transfer);
                a2VarArr[4] = new yq1.a2(vq1.b.chk_consent, vq1.d.kr_checking_consent, false, vq1.d.krconsent_url_marketing_receipt);
                return kotlin.collections.f0.j(a2VarArr);
            case 20:
                g gVar = (g) obj;
                return gVar.f69991b.a(gVar.f69992c, gVar.f69993d);
            case 21:
                return invoke();
            case 22:
                m294invoke();
                return Unit.f80348a;
            case 23:
                m294invoke();
                return Unit.f80348a;
            case 24:
                m294invoke();
                return Unit.f80348a;
            case 25:
                m294invoke();
                return Unit.f80348a;
            case 26:
                return invoke();
            case 27:
                b0 b0Var = (b0) obj;
                a0 a0Var = b0Var.f126654a;
                try {
                } catch (Throwable th3) {
                    b0Var.f126655b.q(th3, "Failed to warm up Cronet network connections on API and image hosts", tb0.p.PERFORMANCE);
                    c0Var = new c0(a0Var.c());
                }
                if (a0Var.b()) {
                    return a0Var;
                }
                c0Var = new c0(a0Var.c());
                return c0Var;
            case 28:
                m294invoke();
                return Unit.f80348a;
            default:
                return new c71.b0(h.SEARCH_FOR_YOU, ((BodyTypeFilterBottomSheetModel) obj).f49994h, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, 2097151);
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m294invoke() {
        int i13 = this.f139210i;
        Object obj = this.f139211j;
        switch (i13) {
            case 5:
                View view = (View) obj;
                if (view == null) {
                    return;
                }
                view.setX(0.0f);
                return;
            case 7:
                int i14 = LegacyGestaltAvatar.K;
                ((LegacyGestaltAvatar) obj).p1(true);
                return;
            case 15:
                t4 t4Var = ((ip1.b) obj).f73373e;
                if (t4Var != null) {
                    LinkedHashSet linkedHashSet = d0.f60468a;
                    d0.d(t4Var.f60451b);
                    return;
                }
                return;
            case 16:
                f fVar = (f) obj;
                fVar.f100926h.W(0);
                fVar.setVisibility(4);
                return;
            case 17:
                mo1.d.a(((n) obj).f130844f, false, null, null, null, 15);
                return;
            case 22:
                ((r) obj).a();
                return;
            case 23:
                ed1.f fVar2 = ((zt1.d) obj).f142774e;
                if (fVar2 != null) {
                    fVar2.f58575b.X(u0.CLOSE_BUTTON);
                    ((zt1.g) ((yt1.a) fVar2.getView())).f142779a.getClass();
                    a.c.y(u.f85943a);
                    return;
                }
                Intrinsics.r("musicSheetModalPresenter");
                throw null;
            case 24:
                ((kotlin.jvm.internal.f0) obj).f80424a = false;
                return;
            case 25:
                LegoFloatingBottomNavBar legoFloatingBottomNavBar = (LegoFloatingBottomNavBar) obj;
                m60.w v13 = legoFloatingBottomNavBar.v();
                wk2.a aVar = legoFloatingBottomNavBar.f49976x;
                if (aVar != null) {
                    v13.d(new v((jc0.a0) aVar.get(), false, 0L, 30));
                    return;
                } else {
                    Intrinsics.r("accountSwitcherModalProvider");
                    throw null;
                }
            default:
                tv1.a aVar2 = ((uv1.c) obj).f123188c;
                if (aVar2 != null) {
                    aVar2.R1(!r4.f123187b);
                    return;
                }
                return;
        }
    }
}
