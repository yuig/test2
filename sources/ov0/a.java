package ov0;

import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import com.pinterest.report.library.model.ReportData;
import kotlin.jvm.internal.Intrinsics;
import qz.f0;
import so.x2;

/* loaded from: classes5.dex */
public final class a extends h0 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReportData reportData, x2 reasonRowPresenterFactory, int i13) {
        super(a.a.k("board/", reportData.f50384a, "/report_reasons/"), new ke0.a[]{gh0.b.T()}, null, null, null, null, null, null, 0L, 2044);
        this.E = i13;
        if (i13 != 2) {
            Intrinsics.checkNotNullParameter(reportData, "reportData");
            Intrinsics.checkNotNullParameter(reasonRowPresenterFactory, "reasonRowPresenterFactory");
            f0 f0Var = new f0();
            f0Var.e("fields", n00.b.a(n00.c.REPORT_FLOW_FIELDS));
            this.f49121k = f0Var;
            o(0, new k02.a(reportData, reasonRowPresenterFactory, 0));
            return;
        }
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        Intrinsics.checkNotNullParameter(reasonRowPresenterFactory, "reasonRowPresenterFactory");
        super(a.a.k("conversations/", reportData.f50384a, "/report_reasons/"), new ke0.a[]{gh0.b.T()}, null, null, null, null, null, null, 0L, 2044);
        f0 f0Var2 = new f0();
        f0Var2.e("fields", n00.b.a(n00.c.REPORT_FLOW_FIELDS));
        this.f49121k = f0Var2;
        o(0, new k02.a(reportData, reasonRowPresenterFactory, 1));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.E) {
            case 0:
                return 4;
            default:
                return 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String categoryId, nv0.b actionListener) {
        super(a.a.p(new StringBuilder("storypins/stickers/categories/"), categoryId, "/stickers"), new ke0.a[]{gh0.b.U()}, null, null, null, null, null, null, 0L, 2044);
        this.E = 0;
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(actionListener, "actionListener");
        o(4, new nv0.a(actionListener, 2));
    }
}
