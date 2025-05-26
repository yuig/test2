package v02;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.report.library.model.ReportData;
import h32.a4;
import h32.d4;
import h32.g0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import so.y2;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv02/t;", "Lyq0/b0;", "", "Lj02/d;", "<init>", "()V", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class t extends c<Object> implements j02.d {
    public ReportData A0;
    public final s B0 = new s(this);
    public final g0 C0 = g0.MODAL_REPORT_MENU;

    /* renamed from: z0, reason: collision with root package name */
    public y2 f123819z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(1, new yv1.i(this, 16));
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        String string;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.P(qVar.drawableRes(requireContext, dl2.b.f1(requireContext2)), eo1.b.color_themed_text_default);
        ReportData reportData = this.A0;
        if (reportData == null) {
            Intrinsics.r("reportData");
            throw null;
        }
        if (reportData instanceof ReportData.PinReportData) {
            string = getResources().getString(h02.e.report_pin_toolbar_title);
        } else if (reportData instanceof ReportData.UserReportData) {
            string = getResources().getString(h02.e.report_account_toolbar_title);
        } else if (reportData instanceof ReportData.LinkReportData) {
            string = getResources().getString(h02.e.report_link_toolbar_title);
        } else if (reportData instanceof ReportData.BoardReportData) {
            string = getResources().getString(h02.e.report_pin_button_title);
        } else {
            if (!(reportData instanceof ReportData.ConversationReportData)) {
                throw new NoWhenBranchMatchedException();
            }
            string = getResources().getString(h02.e.report_pin_button_title);
        }
        gestaltToolbarImpl.b0(string);
        gestaltToolbarImpl.L(eo1.d.lego_card_rounded_top);
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Navigation navigation = this.I;
        Parcelable b23 = navigation != null ? navigation.b2("com.pinterest.EXTRA_REPORT_DATA") : null;
        Intrinsics.g(b23, "null cannot be cast to non-null type com.pinterest.report.library.model.ReportData");
        this.A0 = (ReportData) b23;
        Navigation navigation2 = this.I;
        ArrayList D0 = navigation2 != null ? navigation2.D0() : null;
        Intrinsics.g(D0, "null cannot be cast to non-null type java.util.ArrayList<com.pinterest.reportFlow.feature.model.ReportReasonData>{ kotlin.collections.TypeAliasesKt.ArrayList<com.pinterest.reportFlow.feature.model.ReportReasonData> }");
        y2 y2Var = this.f123819z0;
        if (y2Var == null) {
            Intrinsics.r("secondaryReasonsPresenterFactory");
            throw null;
        }
        ReportData reportData = this.A0;
        if (reportData != null) {
            return y2Var.a(D0, reportData);
        }
        Intrinsics.r("reportData");
        throw null;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        nl1.d.J7();
        return false;
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getA0() {
        return this.C0;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getR0() {
        ReportData reportData = this.A0;
        if (reportData == null) {
            Intrinsics.r("reportData");
            throw null;
        }
        String f50386c = reportData.getF50386c();
        if (f50386c == null) {
            return null;
        }
        if (f50386c.length() <= 0) {
            f50386c = null;
        }
        if (f50386c != null) {
            return a4.valueOf(f50386c);
        }
        return null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getQ0() {
        d4 valueOf;
        ReportData reportData = this.A0;
        if (reportData == null) {
            Intrinsics.r("reportData");
            throw null;
        }
        String f50385b = reportData.getF50385b();
        String str = f50385b.length() > 0 ? f50385b : null;
        return (str == null || (valueOf = d4.valueOf(str)) == null) ? d4.REPORT_FLOW : valueOf;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(h02.d.fragment_secondary_reasons, h02.c.p_recycler_view);
    }

    @Override // v02.c, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity E4 = E4();
        if (E4 != null) {
            a0.D(E4);
        }
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f7().h(this.B0);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f7().j(this.B0);
        super.onDestroy();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        FragmentActivity E4 = E4();
        if (E4 != null) {
            a0.d1(E4);
        }
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(h02.c.toolbar);
    }
}
