package v02;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.report.library.model.ReportData;
import com.pinterest.reportFlow.feature.model.ReportReasonData;
import h32.a4;
import h32.d4;
import h32.g0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import so.u2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lv02/j;", "Lyk1/k;", "Lj02/a;", "<init>", "()V", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class j extends a implements j02.a {
    public static final /* synthetic */ int A0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public u2 f123795j0;

    /* renamed from: k0, reason: collision with root package name */
    public ReportData f123796k0;

    /* renamed from: l0, reason: collision with root package name */
    public ReportReasonData f123797l0;

    /* renamed from: m0, reason: collision with root package name */
    public j02.b f123798m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltText f123799n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltText f123800o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltText f123801p0;

    /* renamed from: q0, reason: collision with root package name */
    public ViewGroup f123802q0;

    /* renamed from: r0, reason: collision with root package name */
    public GestaltText f123803r0;

    /* renamed from: s0, reason: collision with root package name */
    public ViewGroup f123804s0;

    /* renamed from: t0, reason: collision with root package name */
    public GestaltButton f123805t0;

    /* renamed from: u0, reason: collision with root package name */
    public GestaltText f123806u0;

    /* renamed from: v0, reason: collision with root package name */
    public GestaltSwitchWithLabel f123807v0;

    /* renamed from: w0, reason: collision with root package name */
    public GestaltDivider f123808w0;

    /* renamed from: x0, reason: collision with root package name */
    public GestaltDivider f123809x0;

    /* renamed from: y0, reason: collision with root package name */
    public final e f123810y0 = new e(this);

    /* renamed from: z0, reason: collision with root package name */
    public final g0 f123811z0 = g0.MODAL_REPORT_MENU;

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
        ReportData reportData = this.f123796k0;
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
        this.f123796k0 = (ReportData) b23;
        Navigation navigation2 = this.I;
        Parcelable b24 = navigation2 != null ? navigation2.b2("com.pinterest.EXTRA_REPORT_REASON_DATA") : null;
        Intrinsics.g(b24, "null cannot be cast to non-null type com.pinterest.reportFlow.feature.model.ReportReasonData");
        ReportReasonData reportReasonData = (ReportReasonData) b24;
        this.f123797l0 = reportReasonData;
        u2 u2Var = this.f123795j0;
        if (u2Var == null) {
            Intrinsics.r("reportPinPresenterFactory");
            throw null;
        }
        ReportData reportData = this.f123796k0;
        if (reportData != null) {
            return u2Var.a(reportData, reportReasonData);
        }
        Intrinsics.r("reportData");
        throw null;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        j02.b bVar = this.f123798m0;
        if (bVar == null) {
            Intrinsics.r("viewListener");
            throw null;
        }
        ((n02.o) bVar).onBackPressed();
        nl1.d.J7();
        return false;
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getC0() {
        return this.f123811z0;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF22577t0() {
        ReportData reportData = this.f123796k0;
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
    public final d4 getF78833m0() {
        d4 valueOf;
        ReportData reportData = this.f123796k0;
        if (reportData == null) {
            Intrinsics.r("reportData");
            throw null;
        }
        String f50385b = reportData.getF50385b();
        String str = f50385b.length() > 0 ? f50385b : null;
        return (str == null || (valueOf = d4.valueOf(str)) == null) ? d4.REPORT_FLOW : valueOf;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = h02.d.fragment_report_pin;
        f7().h(this.f123810y0);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(h02.c.report_report_pin_header);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f123799n0 = (GestaltText) findViewById;
        View findViewById2 = onCreateView.findViewById(h02.c.report_pin_detail_additional_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f123800o0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(h02.c.report_report_pin_removal_header);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f123801p0 = (GestaltText) findViewById3;
        View findViewById4 = onCreateView.findViewById(h02.c.report_report_pin_removal_examples);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f123802q0 = (ViewGroup) findViewById4;
        View findViewById5 = onCreateView.findViewById(h02.c.report_report_pin_non_removal_header);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f123803r0 = (GestaltText) findViewById5;
        View findViewById6 = onCreateView.findViewById(h02.c.report_report_pin_non_removal_examples);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f123804s0 = (ViewGroup) findViewById6;
        View findViewById7 = onCreateView.findViewById(h02.c.report_button);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f123805t0 = (GestaltButton) findViewById7;
        View findViewById8 = onCreateView.findViewById(h02.c.report_report_pin_block_creator_header);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f123806u0 = (GestaltText) findViewById8;
        View findViewById9 = onCreateView.findViewById(h02.c.report_report_pin_block_creator_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f123807v0 = (GestaltSwitchWithLabel) findViewById9;
        View findViewById10 = onCreateView.findViewById(h02.c.report_divider_1);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f123808w0 = (GestaltDivider) findViewById10;
        View findViewById11 = onCreateView.findViewById(h02.c.report_divider_2);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f123809x0 = (GestaltDivider) findViewById11;
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f7().j(this.f123810y0);
        super.onDestroy();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Unit unit;
        Unit unit2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        GestaltText gestaltText = this.f123799n0;
        if (gestaltText == null) {
            Intrinsics.r("headerText");
            throw null;
        }
        ReportReasonData reportReasonData = this.f123797l0;
        if (reportReasonData == null) {
            Intrinsics.r("reportReasonData");
            throw null;
        }
        a0.p(gestaltText, String.valueOf(reportReasonData.getF50418c()));
        ReportReasonData reportReasonData2 = this.f123797l0;
        if (reportReasonData2 == null) {
            Intrinsics.r("reportReasonData");
            throw null;
        }
        String f50419d = reportReasonData2.getF50419d();
        if (f50419d != null) {
            GestaltText gestaltText2 = this.f123800o0;
            if (gestaltText2 == null) {
                Intrinsics.r("additionalText");
                throw null;
            }
            a0.p(gestaltText2, f50419d);
        } else {
            GestaltText gestaltText3 = this.f123800o0;
            if (gestaltText3 == null) {
                Intrinsics.r("additionalText");
                throw null;
            }
            a0.k0(gestaltText3);
        }
        ReportReasonData reportReasonData3 = this.f123797l0;
        if (reportReasonData3 == null) {
            Intrinsics.r("reportReasonData");
            throw null;
        }
        String f50420e = reportReasonData3.getF50420e();
        if (f50420e != null) {
            GestaltText gestaltText4 = this.f123801p0;
            if (gestaltText4 == null) {
                Intrinsics.r("removalHeaderText");
                throw null;
            }
            a0.p(gestaltText4, f50420e);
            ReportReasonData reportReasonData4 = this.f123797l0;
            if (reportReasonData4 == null) {
                Intrinsics.r("reportReasonData");
                throw null;
            }
            for (String str : reportReasonData4.getF50421f()) {
                ViewGroup viewGroup = this.f123802q0;
                if (viewGroup == null) {
                    Intrinsics.r("removalExamplesLayout");
                    throw null;
                }
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                GestaltText gestaltText5 = new GestaltText(6, requireContext, (AttributeSet) null);
                a0.q(gestaltText5, bs1.c.h2("- " + str));
                gestaltText5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                dl2.b.y2(gestaltText5);
                viewGroup.addView(gestaltText5);
            }
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            GestaltText gestaltText6 = this.f123801p0;
            if (gestaltText6 == null) {
                Intrinsics.r("removalHeaderText");
                throw null;
            }
            gestaltText6.i(f.f123787j);
            ViewGroup viewGroup2 = this.f123802q0;
            if (viewGroup2 == null) {
                Intrinsics.r("removalExamplesLayout");
                throw null;
            }
            viewGroup2.setVisibility(8);
        }
        ReportReasonData reportReasonData5 = this.f123797l0;
        if (reportReasonData5 == null) {
            Intrinsics.r("reportReasonData");
            throw null;
        }
        String f50422g = reportReasonData5.getF50422g();
        if (f50422g != null) {
            GestaltText gestaltText7 = this.f123803r0;
            if (gestaltText7 == null) {
                Intrinsics.r("nonRemovalHeaderText");
                throw null;
            }
            a0.p(gestaltText7, f50422g);
            ReportReasonData reportReasonData6 = this.f123797l0;
            if (reportReasonData6 == null) {
                Intrinsics.r("reportReasonData");
                throw null;
            }
            for (String str2 : reportReasonData6.getF50423h()) {
                ViewGroup viewGroup3 = this.f123804s0;
                if (viewGroup3 == null) {
                    Intrinsics.r("nonRemovalExamplesLayout");
                    throw null;
                }
                Context requireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                GestaltText gestaltText8 = new GestaltText(6, requireContext2, (AttributeSet) null);
                a0.q(gestaltText8, bs1.c.h2("- " + str2));
                gestaltText8.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                dl2.b.y2(gestaltText8);
                viewGroup3.addView(gestaltText8);
            }
            unit2 = Unit.f80348a;
        } else {
            unit2 = null;
        }
        if (unit2 == null) {
            GestaltText gestaltText9 = this.f123803r0;
            if (gestaltText9 == null) {
                Intrinsics.r("nonRemovalHeaderText");
                throw null;
            }
            gestaltText9.i(f.f123788k);
            ViewGroup viewGroup4 = this.f123804s0;
            if (viewGroup4 == null) {
                Intrinsics.r("nonRemovalExamplesLayout");
                throw null;
            }
            viewGroup4.setVisibility(8);
        }
        GestaltButton gestaltButton = this.f123805t0;
        if (gestaltButton == null) {
            Intrinsics.r("reportButton");
            throw null;
        }
        gestaltButton.e(new d(this, 0));
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(h02.c.toolbar);
    }
}
