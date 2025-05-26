package k02;

import android.view.View;
import com.pinterest.api.model.cd0;
import com.pinterest.report.library.model.ReportData;
import com.pinterest.reportFlow.feature.view.ReportReasonRowView;
import kotlin.jvm.internal.Intrinsics;
import so.x2;
import vq0.h;
import yk1.j;
import yk1.m;
import yk1.n;

/* loaded from: classes4.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReportData f77792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x2 f77793c;

    public a(ReportData reportData, x2 x2Var, int i13) {
        this.f77791a = i13;
        this.f77792b = reportData;
        this.f77793c = x2Var;
    }

    @Override // vq0.h
    public final /* bridge */ /* synthetic */ void c(n nVar, Object obj, int i13) {
        switch (this.f77791a) {
            case 0:
                h((ReportReasonRowView) nVar, (cd0) obj);
                break;
            case 1:
                h((ReportReasonRowView) nVar, (cd0) obj);
                break;
            default:
                h((ReportReasonRowView) nVar, (cd0) obj);
                break;
        }
    }

    @Override // vq0.h
    public final m f() {
        x2 x2Var = this.f77793c;
        int i13 = this.f77791a;
        switch (i13) {
            case 0:
                switch (i13) {
                }
            case 1:
                switch (i13) {
                }
            default:
                switch (i13) {
                }
        }
        return x2Var.a();
    }

    @Override // vq0.h
    public final /* bridge */ /* synthetic */ String g(int i13, Object obj) {
        switch (this.f77791a) {
            case 0:
                i((cd0) obj);
                break;
            case 1:
                i((cd0) obj);
                break;
            default:
                i((cd0) obj);
                break;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r0v4, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r0v9, types: [yk1.m] */
    public final void h(ReportReasonRowView view, cd0 reportReason) {
        int i13 = this.f77791a;
        ReportData reportData = this.f77792b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(reportReason, "reportReason");
                ReportReasonRowView reportReasonRowView = view instanceof View ? view : null;
                if (reportReasonRowView != null) {
                    j.a().getClass();
                    ?? b13 = j.b(reportReasonRowView);
                    r2 = b13 instanceof n02.b ? b13 : null;
                }
                if (r2 != null) {
                    r2.q3(view, reportReason, reportData);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(reportReason, "reportReason");
                ReportReasonRowView reportReasonRowView2 = view instanceof View ? view : null;
                if (reportReasonRowView2 != null) {
                    j.a().getClass();
                    ?? b14 = j.b(reportReasonRowView2);
                    r2 = b14 instanceof n02.b ? b14 : null;
                }
                if (r2 != null) {
                    r2.q3(view, reportReason, reportData);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(reportReason, "reportReason");
                ReportReasonRowView reportReasonRowView3 = view instanceof View ? view : null;
                if (reportReasonRowView3 != null) {
                    j.a().getClass();
                    ?? b15 = j.b(reportReasonRowView3);
                    r2 = b15 instanceof n02.b ? b15 : null;
                }
                if (r2 != null) {
                    r2.q3(view, reportReason, reportData);
                    break;
                }
                break;
        }
    }

    public final String i(cd0 reportReason) {
        switch (this.f77791a) {
            case 0:
                Intrinsics.checkNotNullParameter(reportReason, "reportReason");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(reportReason, "reportReason");
                break;
            default:
                Intrinsics.checkNotNullParameter(reportReason, "reportReason");
                break;
        }
        return null;
    }
}
