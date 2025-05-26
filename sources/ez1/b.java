package ez1;

import android.content.Context;
import android.view.View;
import cn1.o;
import cn1.q;
import cn1.r;
import com.pinterest.api.model.gz;
import com.pinterest.api.model.mj;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.selectList.GestaltSelectList;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.reportFlow.feature.ReportFlowScreenLocation;
import com.pinterest.reportFlow.feature.rvc.model.LinkedBA;
import com.pinterest.reportFlow.feature.rvc.view.RVCSectionItemView;
import com.pinterest.screens.m4;
import com.pinterest.ui.text.DescriptionEditView;
import com.pinterest.ui.view.NoticeView;
import cp.i;
import fn1.n;
import g70.h;
import h32.a4;
import h32.g0;
import h32.i0;
import h32.u0;
import ha2.l;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.t0;
import r02.j;
import r02.v;
import rg0.k0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f60700c;

    public /* synthetic */ b(int i13, Object obj, Object obj2) {
        this.f60698a = i13;
        this.f60700c = obj;
        this.f60699b = obj2;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        String f39332b;
        int i13 = this.f60698a;
        Object obj = this.f60699b;
        Object obj2 = this.f60700c;
        switch (i13) {
            case 0:
                GestaltSelectList selectList = (GestaltSelectList) obj2;
                d this$0 = (d) obj;
                int i14 = d.f60704l0;
                Intrinsics.checkNotNullParameter(selectList, "$selectList");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof n) {
                    String Z = selectList.Z();
                    if (!Intrinsics.d(Z, "All Events")) {
                        this$0.Y7(Z);
                        i92.a.a(this$0.Z7(), a.a.k("Displaying ", Z, " Events!"), false, 6);
                        return;
                    }
                    ArrayList arrayList = this$0.f60706d0;
                    if (arrayList == null) {
                        Intrinsics.r("dataList");
                        throw null;
                    }
                    this$0.a8(arrayList);
                    i92.a.a(this$0.Z7(), "Displaying All Events!", false, 6);
                    return;
                }
                return;
            case 1:
                d this$02 = (d) obj;
                GestaltSearchField filterToolBar = (GestaltSearchField) obj2;
                int i15 = d.f60704l0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(filterToolBar, "$filterToolBar");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof r) {
                    String str = ((r) it).f28234c;
                    this$02.Y7(str != null ? str : "");
                    return;
                } else if (it instanceof q) {
                    String str2 = ((q) it).f28232c;
                    this$02.Y7(str2 != null ? str2 : "");
                    return;
                } else {
                    if (it instanceof o) {
                        filterToolBar.clearFocus();
                        return;
                    }
                    return;
                }
            case 2:
                r02.g this$03 = (r02.g) obj2;
                LinkedBA account = (LinkedBA) obj;
                int i16 = r02.g.f105747h0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(account, "$account");
                Intrinsics.checkNotNullParameter(it, "it");
                this$03.f7().d(new v(account.f50427b));
                d7.g.s(Navigation.w1(ReportFlowScreenLocation.SETTINGS_RVC_LINKED_BAS_SHEET), this$03.f7());
                return;
            case 3:
                j this$04 = (j) obj2;
                String legalRequestId = (String) obj;
                int i17 = j.f105759l0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(legalRequestId, "$legalRequestId");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof rn1.f) {
                    this$04.e8();
                    t0 t73 = this$04.t7();
                    i0 i0Var = new i0(this$04.f105764k0, this$04.f105763j0 ? a4.RVC_YOUR_ACCOUNT_TAB : a4.RVC_YOUR_REPORTS_TAB, null, g0.RVC_ENFORCEMENT_ACTION_CONTEXT_MENU, null, u0.RVC_APPEAL_DECISION_OPTION);
                    String str3 = this$04.f105762i0;
                    if (str3 == null) {
                        Intrinsics.r("paramObjectId");
                        throw null;
                    }
                    HashMap hashMap = new HashMap();
                    String str4 = this$04.f105761h0;
                    if (str4 == null) {
                        Intrinsics.r("paramActionId");
                        throw null;
                    }
                    hashMap.put("enforcement_action_id", str4);
                    Unit unit = Unit.f80348a;
                    t0.a(t73, i0Var, str3, hashMap);
                    if (com.bumptech.glide.d.G(this$04, "EXTRA_SHOW_COUNTER_FORM", false)) {
                        mo1.d dVar = this$04.f105760g0;
                        if (dVar == null) {
                            Intrinsics.r("intentHelper");
                            throw null;
                        }
                        Context requireContext = this$04.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        int i18 = h02.e.url_counter_notice;
                        String str5 = this$04.f105762i0;
                        if (str5 == null) {
                            Intrinsics.r("paramObjectId");
                            throw null;
                        }
                        String string = this$04.getString(i18, str5, legalRequestId);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        dVar.b(requireContext, string);
                        return;
                    }
                    w f73 = this$04.f7();
                    NavigationImpl w13 = Navigation.w1(ReportFlowScreenLocation.SETTINGS_RVC_SUBMIT_APPEAL);
                    String str6 = this$04.f105761h0;
                    if (str6 == null) {
                        Intrinsics.r("paramActionId");
                        throw null;
                    }
                    w13.m0("EXTRA_PARAM_ACTION_ID", str6);
                    w13.m0("EXTRA_PARAM_USER_ID", com.bumptech.glide.d.Z(this$04, "EXTRA_PARAM_USER_ID", ""));
                    String str7 = this$04.f105762i0;
                    if (str7 == null) {
                        Intrinsics.r("paramObjectId");
                        throw null;
                    }
                    w13.m0("EXTRA_PARAM_OBJECT_ID", str7);
                    w13.Y1("EXTRA_PARAM_ATTACHMENT_ENABLED", com.bumptech.glide.d.G(this$04, "EXTRA_PARAM_ATTACHMENT_ENABLED", false));
                    w13.Y1("EXTRA_PARAM_IS_YOUR_ACCOUNT_TAB", this$04.f105763j0);
                    f73.d(w13);
                    return;
                }
                return;
            case 4:
                mj item = (mj) obj2;
                Function2 onViewPdfClick = (Function2) obj;
                int i19 = RVCSectionItemView.f50428l;
                Intrinsics.checkNotNullParameter(item, "$item");
                Intrinsics.checkNotNullParameter(onViewPdfClick, "$onViewPdfClick");
                Intrinsics.checkNotNullParameter(it, "event");
                if (it instanceof rn1.f) {
                    Boolean U = item.U();
                    Intrinsics.checkNotNullExpressionValue(U, "getSorAvailable(...)");
                    if (U.booleanValue()) {
                        onViewPdfClick.invoke(item.z(), item.L());
                        return;
                    }
                    return;
                }
                return;
            case 5:
                t52.d this$05 = (t52.d) obj2;
                k0 displayData = (k0) obj;
                int i23 = t52.d.f116443r0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(displayData, "$displayData");
                Intrinsics.checkNotNullParameter(it, "it");
                rg0.n e83 = this$05.e8();
                if (e83 != null) {
                    e83.a(null, (nx.d) this$05.f116450m0.getValue());
                }
                this$05.d8();
                String str8 = displayData.f108047g;
                if (str8 != null) {
                    h hVar = this$05.f116444g0;
                    if (hVar != null) {
                        h.g(hVar, str8, null, null, 6);
                        return;
                    } else {
                        Intrinsics.r("boardNavigator");
                        throw null;
                    }
                }
                wy0 f13 = ((b60.d) this$05.getActiveUserManager()).f();
                if (f13 == null || (f39332b = f13.getF39332b()) == null) {
                    return;
                }
                NavigationImpl z03 = Navigation.z0(m4.a(), f39332b);
                z03.m0("com.pinterest.EXTRA_PROFILE_TAB", "boards");
                this$05.f7().d(z03);
                return;
            case 6:
                l this$06 = (l) obj2;
                Navigation navigation = (Navigation) obj;
                int i24 = l.f68450n;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                w wVar = this$06.f68456f;
                if (wVar != null) {
                    wVar.d(navigation);
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 7:
                DescriptionEditView descriptionEditView = (DescriptionEditView) obj2;
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                int i25 = DescriptionEditView.f52649e;
                descriptionEditView.getClass();
                if (it instanceof xn1.c) {
                    onClickListener.onClick(descriptionEditView.f52650d);
                }
                if (it instanceof xn1.f) {
                    if (((xn1.f) it).f135448c) {
                        hf0.b.s(descriptionEditView.f52650d);
                        return;
                    } else {
                        descriptionEditView.f52650d.X(new i(descriptionEditView, 15));
                        hf0.b.k(descriptionEditView.f52650d);
                        return;
                    }
                }
                return;
            case 8:
                NoticeView this$07 = (NoticeView) obj2;
                gz noticeFooter = (gz) obj;
                int i26 = NoticeView.f52709r;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(noticeFooter, "$noticeFooter");
                Intrinsics.checkNotNullParameter(it, "it");
                this$07.j(noticeFooter.c());
                return;
            case 9:
                View.OnClickListener clickListener = (View.OnClickListener) obj2;
                GestaltButton.SmallShoppingButton this_apply = (GestaltButton.SmallShoppingButton) obj;
                int i27 = NoticeView.f52709r;
                Intrinsics.checkNotNullParameter(clickListener, "$clickListener");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                clickListener.onClick(this_apply);
                return;
            default:
                View.OnClickListener clickListener2 = (View.OnClickListener) obj2;
                GestaltButton.LargeSecondaryButton this_apply2 = (GestaltButton.LargeSecondaryButton) obj;
                int i28 = NoticeView.f52709r;
                Intrinsics.checkNotNullParameter(clickListener2, "$clickListener");
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                Intrinsics.checkNotNullParameter(it, "it");
                clickListener2.onClick(this_apply2);
                return;
        }
    }

    public /* synthetic */ b(d dVar, GestaltSearchField gestaltSearchField) {
        this.f60698a = 1;
        this.f60699b = dVar;
        this.f60700c = gestaltSearchField;
    }
}
