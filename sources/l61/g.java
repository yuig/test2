package l61;

import com.pinterest.api.model.af0;
import com.pinterest.api.model.hf0;
import com.pinterest.api.model.lf0;
import com.pinterest.api.model.sf0;
import com.pinterest.report.library.model.ReportData;
import dl1.s;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import so.z2;
import va1.i;
import va1.j;
import va1.k;
import va1.l;
import va1.m;
import va1.n;
import va1.o;
import va1.p;
import wt1.e0;

/* loaded from: classes5.dex */
public final class g extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f81608h;

    public g(int i13) {
        this.f81608h = i13;
        if (i13 == 1) {
            o(4, new s91.b(5));
            o(1, new s91.b(6));
            k(f0.j(o.f125218d, n.f125213d, new i(4, -1), m.f125207d, j.f125189d, k.f125198d, l.f125203d));
        } else {
            o(1, new sz0.a(16));
            o(2, new sz0.a(17));
            o(3, new sz0.a(18));
            o(4, new sz0.a(19));
        }
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.f81608h) {
            case 0:
                s sVar = (s) getItem(i13);
                if (sVar instanceof lf0) {
                    return 1;
                }
                if (sVar instanceof sf0) {
                    return 2;
                }
                if (sVar instanceof hf0) {
                    return 3;
                }
                return sVar instanceof af0 ? 4 : -2;
            case 1:
                return ((p) d().get(i13)).f125223a;
            default:
                return 1;
        }
    }

    public g(List secondaryReportReasons, ReportData reportData, z2 secondaryReasonRowPresenterFactory) {
        this.f81608h = 2;
        Intrinsics.checkNotNullParameter(secondaryReportReasons, "secondaryReportReasons");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        Intrinsics.checkNotNullParameter(secondaryReasonRowPresenterFactory, "secondaryReasonRowPresenterFactory");
        o(1, new yi0.a(17, reportData, secondaryReasonRowPresenterFactory));
        k(secondaryReportReasons);
    }
}
