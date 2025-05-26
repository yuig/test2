package com.pinterest.reportFlow.feature.view;

import a11.e;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.api.model.cd0;
import com.pinterest.api.model.kd0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.report.library.model.ReportData;
import com.pinterest.reportFlow.feature.model.ReportReasonData;
import com.pinterest.reportFlow.feature.view.ReportReasonRowView;
import com.pinterest.screens.p3;
import com.pinterest.ui.grid.PinterestAdapterView;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import n02.b;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import uk1.c;
import v02.m;
import yk1.d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\rB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pinterest/reportFlow/feature/view/ReportReasonRowView;", "Landroid/widget/LinearLayout;", "Lyk1/d;", "Luk1/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "v02/m", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReportReasonRowView extends LinearLayout implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public m f50440a;

    /* renamed from: b, reason: collision with root package name */
    public cd0 f50441b;

    /* renamed from: c, reason: collision with root package name */
    public ReportData f50442c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f50443d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f50444e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f50445f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportReasonRowView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new PinterestAdapterView.LayoutParams(-1));
        final int i13 = 1;
        setOrientation(1);
        View.inflate(getContext(), h02.d.row_reason, this);
        View findViewById = findViewById(h02.c.primary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50443d = (GestaltText) findViewById;
        View findViewById2 = findViewById(h02.c.secondary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50444e = (GestaltText) findViewById2;
        setOnClickListener(new View.OnClickListener(this) { // from class: v02.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReportReasonRowView f123813b;

            {
                this.f123813b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                ReportReasonRowView.a(this.f123813b);
            }
        });
        this.f50445f = g0.MODAL_REPORT_MENU;
    }

    public static void a(ReportReasonRowView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m mVar = this$0.f50440a;
        if (mVar != null) {
            cd0 reason = this$0.f50441b;
            if (reason == null) {
                Intrinsics.r("reason");
                throw null;
            }
            ReportData reportData = this$0.f50442c;
            if (reportData == null) {
                Intrinsics.r("reportData");
                throw null;
            }
            b bVar = (b) mVar;
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(reportData, "reportData");
            String G = reason.G();
            if (G != null && G.length() > 0) {
                e.e(bVar.f88808b, String.valueOf(reason.G()), null, 6);
                return;
            }
            List I = reason.I();
            Intrinsics.checkNotNullExpressionValue(I, "getSecondaryReasons(...)");
            boolean z13 = !I.isEmpty();
            w wVar = bVar.f88807a;
            if (!z13) {
                NavigationImpl w13 = Navigation.w1((ScreenLocation) p3.f51205c.getValue());
                w13.w0(reportData, "com.pinterest.EXTRA_REPORT_DATA");
                String F = reason.F();
                String H = reason.H();
                String A = reason.A();
                String z14 = reason.z();
                String D = reason.D();
                List E = reason.E();
                Intrinsics.checkNotNullExpressionValue(E, "getDetailPageRemovalExamples(...)");
                String B = reason.B();
                List C = reason.C();
                Intrinsics.checkNotNullExpressionValue(C, "getDetailPageNonRemovalExamples(...)");
                w13.w0(new ReportReasonData(F, H, A, z14, D, E, B, C, reason.G(), reason.K()), "com.pinterest.EXTRA_REPORT_REASON_DATA");
                wVar.d(w13);
                d0 pinalytics = bVar.getPinalytics();
                f1 f1Var = f1.TAP;
                g0 g0Var = g0.MODAL_REPORT_MENU;
                boolean z15 = reportData instanceof ReportData.PinReportData;
                u0 u0Var = z15 ? u0.PIN_FEEDBACK_REASON_OTHER : null;
                HashMap hashMap = new HashMap();
                hashMap.put("reason", reason.F());
                if (z15) {
                    String str = ((ReportData.PinReportData) reportData).f50392g;
                    hashMap.put("image_signature", str != null ? str : "");
                }
                pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                return;
            }
            NavigationImpl w14 = Navigation.w1((ScreenLocation) p3.f51206d.getValue());
            w14.w0(reportData, "com.pinterest.EXTRA_REPORT_DATA");
            List I2 = reason.I();
            Intrinsics.checkNotNullExpressionValue(I2, "getSecondaryReasons(...)");
            List<kd0> list = I2;
            ArrayList<? extends Parcelable> value = new ArrayList<>(kotlin.collections.g0.q(list, 10));
            for (kd0 kd0Var : list) {
                String v13 = kd0Var.v();
                String x13 = kd0Var.x();
                String p13 = kd0Var.p();
                String o13 = kd0Var.o();
                String s13 = kd0Var.s();
                List t13 = kd0Var.t();
                Intrinsics.checkNotNullExpressionValue(t13, "getDetailPageRemovalExamples(...)");
                String q13 = kd0Var.q();
                List r13 = kd0Var.r();
                Intrinsics.checkNotNullExpressionValue(r13, "getDetailPageNonRemovalExamples(...)");
                value.add(new ReportReasonData(v13, x13, p13, o13, s13, t13, q13, r13, kd0Var.w(), kd0Var.z()));
            }
            Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_REPORT_FLOW_SECONDARY_REASONS", "key");
            Intrinsics.checkNotNullParameter(value, "value");
            w14.f49942d.putParcelableArrayList("com.pinterest.EXTRA_REPORT_FLOW_SECONDARY_REASONS", value);
            wVar.d(w14);
            d0 pinalytics2 = bVar.getPinalytics();
            f1 f1Var2 = f1.TAP;
            g0 g0Var2 = g0.MODAL_REPORT_MENU;
            HashMap hashMap2 = new HashMap();
            if (reportData instanceof ReportData.PinReportData) {
                String str2 = ((ReportData.PinReportData) reportData).f50392g;
                hashMap2.put("image_signature", str2 != null ? str2 : "");
            }
            Unit unit = Unit.f80348a;
            d0.B(pinalytics2, f1Var2, g0Var2, null, hashMap2, 20);
        }
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getF50445f() {
        return this.f50445f;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF87513d1() {
        ReportData reportData = this.f50442c;
        if (reportData == null) {
            Intrinsics.r("reportData");
            throw null;
        }
        String str = reportData.f50386c;
        if (str == null) {
            return null;
        }
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return a4.valueOf(str);
        }
        return null;
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getB0() {
        d4 valueOf;
        ReportData reportData = this.f50442c;
        if (reportData == null) {
            Intrinsics.r("reportData");
            throw null;
        }
        String str = reportData.f50385b;
        String str2 = str.length() > 0 ? str : null;
        return (str2 == null || (valueOf = d4.valueOf(str2)) == null) ? d4.REPORT_FLOW : valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportReasonRowView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setLayoutParams(new PinterestAdapterView.LayoutParams(-1));
        setOrientation(1);
        View.inflate(getContext(), h02.d.row_reason, this);
        View findViewById = findViewById(h02.c.primary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50443d = (GestaltText) findViewById;
        View findViewById2 = findViewById(h02.c.secondary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50444e = (GestaltText) findViewById2;
        final int i13 = 2;
        setOnClickListener(new View.OnClickListener(this) { // from class: v02.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReportReasonRowView f123813b;

            {
                this.f123813b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                ReportReasonRowView.a(this.f123813b);
            }
        });
        this.f50445f = g0.MODAL_REPORT_MENU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportReasonRowView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setLayoutParams(new PinterestAdapterView.LayoutParams(-1));
        setOrientation(1);
        View.inflate(getContext(), h02.d.row_reason, this);
        View findViewById = findViewById(h02.c.primary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50443d = (GestaltText) findViewById;
        View findViewById2 = findViewById(h02.c.secondary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50444e = (GestaltText) findViewById2;
        final int i14 = 0;
        setOnClickListener(new View.OnClickListener(this) { // from class: v02.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReportReasonRowView f123813b;

            {
                this.f123813b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                ReportReasonRowView.a(this.f123813b);
            }
        });
        this.f50445f = g0.MODAL_REPORT_MENU;
    }
}
