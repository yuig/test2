package rr;

import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.report.library.model.ReportData;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m1 extends d0 {
    @Override // rr.d0
    public final String a() {
        return "article";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("pin_id");
        Intrinsics.f(queryParameter);
        String queryParameter2 = uri.getQueryParameter("tracking_param");
        NavigationImpl w13 = Navigation.w1(com.pinterest.screens.g1.B());
        w13.w0(new ReportData.LinkReportData(queryParameter, d4.BROWSER.toString(), a4.BROWSER.toString(), queryParameter2), "com.pinterest.EXTRA_REPORT_DATA");
        this.f109723a.m(w13);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("pin_id");
        return Intrinsics.d(uri.getScheme(), "pinterest") && Intrinsics.d(uri.getHost(), "report_link") && queryParameter != null && queryParameter.length() != 0;
    }
}
