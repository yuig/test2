package v02;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import so.w2;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv02/q;", "Lyq0/b0;", "", "Lj02/c;", "<init>", "()V", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class q extends b<Object> implements j02.c {
    public ReportData A0;
    public final p B0 = new p(this);
    public final g0 C0 = g0.MODAL_REPORT_MENU;

    /* renamed from: z0, reason: collision with root package name */
    public w2 f123817z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new yv1.i(this, 15));
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Drawable drawable;
        BitmapDrawable bitmapDrawable;
        String string;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        int dimensionPixelSize = getResources().getDimensionPixelSize(h02.a.navigation_cancel_icon_reasons_size);
        Context context = getContext();
        int drawableRes = context != null ? rm1.q.CANCEL.drawableRes(context, dl2.b.f1(context)) : sm1.b.ic_cancel_gestalt;
        Context context2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
        int i13 = eo1.b.color_themed_icon_default;
        Intrinsics.checkNotNullParameter(context2, "context");
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context2.getDrawable(drawableRes);
        Intrinsics.checkNotNullParameter(context2, "context");
        if (drawable2 != null) {
            drawable = sh.f.d(i13 == 0 ? context2.getColor(df0.a.f54892a) : context2.getColor(i13), context2, drawable2);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            bitmapDrawable = d7.b.p0(drawable, resources, dimensionPixelSize, dimensionPixelSize);
        } else {
            bitmapDrawable = null;
        }
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.S(bitmapDrawable);
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
        ReportData reportData = (ReportData) b23;
        this.A0 = reportData;
        w2 w2Var = this.f123817z0;
        if (w2Var != null) {
            return w2Var.a(reportData, new yk1.a(getResources(), requireContext().getTheme()));
        }
        Intrinsics.r("reasonsPresenterFactory");
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
    public final g0 getC0() {
        return this.C0;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getN0() {
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
    public final d4 getM0() {
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
        return new a7.e(h02.d.fragment_primary_reasons, h02.c.p_recycler_view);
    }

    @Override // v02.b, nl1.d, androidx.fragment.app.Fragment
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
