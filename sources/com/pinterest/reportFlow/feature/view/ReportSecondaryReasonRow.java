package com.pinterest.reportFlow.feature.view;

import a11.e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.report.library.model.ReportData;
import com.pinterest.reportFlow.feature.model.ReportReasonData;
import com.pinterest.reportFlow.feature.view.ReportSecondaryReasonRow;
import com.pinterest.screens.p3;
import com.pinterest.ui.grid.PinterestAdapterView;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n02.p;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import uk1.c;
import v02.o;
import yk1.d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\rB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pinterest/reportFlow/feature/view/ReportSecondaryReasonRow;", "Landroid/widget/LinearLayout;", "Lyk1/d;", "Luk1/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "v02/o", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ReportSecondaryReasonRow extends LinearLayout implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public o f50446a;

    /* renamed from: b, reason: collision with root package name */
    public ReportReasonData f50447b;

    /* renamed from: c, reason: collision with root package name */
    public ReportData f50448c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f50449d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f50450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportSecondaryReasonRow(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new PinterestAdapterView.LayoutParams(-1));
        setOrientation(1);
        View.inflate(getContext(), h02.d.row_secondary_reason, this);
        View findViewById = findViewById(h02.c.primary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50449d = (GestaltText) findViewById;
        final int i13 = 0;
        setOnClickListener(new View.OnClickListener(this) { // from class: v02.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReportSecondaryReasonRow f123815b;

            {
                this.f123815b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                ReportSecondaryReasonRow.a(this.f123815b);
            }
        });
        this.f50450e = g0.MODAL_REPORT_MENU;
    }

    public static void a(ReportSecondaryReasonRow this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o oVar = this$0.f50446a;
        if (oVar != null) {
            ReportReasonData reportReasonData = this$0.f50447b;
            if (reportReasonData == null) {
                Intrinsics.r("reportReasonData");
                throw null;
            }
            ReportData reportData = this$0.f50448c;
            if (reportData == null) {
                Intrinsics.r("reportData");
                throw null;
            }
            p pVar = (p) oVar;
            Intrinsics.checkNotNullParameter(reportReasonData, "reportReasonData");
            Intrinsics.checkNotNullParameter(reportData, "reportData");
            String str = reportReasonData.f50424i;
            if (str == null || str.length() <= 0) {
                NavigationImpl w13 = Navigation.w1((ScreenLocation) p3.f51205c.getValue());
                w13.w0(reportData, "com.pinterest.EXTRA_REPORT_DATA");
                w13.w0(reportReasonData, "com.pinterest.EXTRA_REPORT_REASON_DATA");
                pVar.f88865a.d(w13);
            } else {
                e.e(pVar.f88866b, str, null, 6);
            }
            d0 pinalytics = pVar.getPinalytics();
            f1 f1Var = f1.TAP;
            g0 g0Var = g0.MODAL_REPORT_MENU;
            boolean z13 = reportData instanceof ReportData.PinReportData;
            u0 u0Var = z13 ? u0.PIN_FEEDBACK_REASON_OTHER : null;
            HashMap hashMap = new HashMap();
            bs1.c.G1("reason", reportReasonData.f50416a, hashMap);
            if (z13) {
                String str2 = ((ReportData.PinReportData) reportData).f50392g;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put("image_signature", str2);
            }
            pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getX0() {
        return this.f50450e;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getQ0() {
        ReportData reportData = this.f50448c;
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
    public final d4 getP0() {
        d4 valueOf;
        ReportData reportData = this.f50448c;
        if (reportData == null) {
            Intrinsics.r("reportData");
            throw null;
        }
        String str = reportData.f50385b;
        String str2 = str.length() > 0 ? str : null;
        return (str2 == null || (valueOf = d4.valueOf(str2)) == null) ? d4.REPORT_FLOW : valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportSecondaryReasonRow(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setLayoutParams(new PinterestAdapterView.LayoutParams(-1));
        final int i13 = 1;
        setOrientation(1);
        View.inflate(getContext(), h02.d.row_secondary_reason, this);
        View findViewById = findViewById(h02.c.primary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50449d = (GestaltText) findViewById;
        setOnClickListener(new View.OnClickListener(this) { // from class: v02.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReportSecondaryReasonRow f123815b;

            {
                this.f123815b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                ReportSecondaryReasonRow.a(this.f123815b);
            }
        });
        this.f50450e = g0.MODAL_REPORT_MENU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportSecondaryReasonRow(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setLayoutParams(new PinterestAdapterView.LayoutParams(-1));
        setOrientation(1);
        View.inflate(getContext(), h02.d.row_secondary_reason, this);
        View findViewById = findViewById(h02.c.primary_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50449d = (GestaltText) findViewById;
        final int i14 = 2;
        setOnClickListener(new View.OnClickListener(this) { // from class: v02.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReportSecondaryReasonRow f123815b;

            {
                this.f123815b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                ReportSecondaryReasonRow.a(this.f123815b);
            }
        });
        this.f50450e = g0.MODAL_REPORT_MENU;
    }
}
