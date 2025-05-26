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
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReportData.UserReportData f77796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f77797b;

    public e(ReportData.UserReportData userReportData, x2 x2Var) {
        this.f77796a = userReportData;
        this.f77797b = x2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [yk1.m] */
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        ReportReasonRowView view = (ReportReasonRowView) nVar;
        cd0 reportReason = (cd0) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(reportReason, "reportReason");
        ReportReasonRowView reportReasonRowView = view instanceof View ? view : null;
        if (reportReasonRowView != null) {
            j.a().getClass();
            ?? b13 = j.b(reportReasonRowView);
            r0 = b13 instanceof n02.b ? b13 : null;
        }
        if (r0 != null) {
            r0.q3(view, reportReason, this.f77796a);
        }
    }

    @Override // vq0.h
    public final m f() {
        return this.f77797b.a();
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        cd0 reportReason = (cd0) obj;
        Intrinsics.checkNotNullParameter(reportReason, "reportReason");
        return null;
    }
}
