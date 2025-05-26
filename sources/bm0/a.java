package bm0;

import com.pinterest.api.model.v7;
import com.pinterest.feature.board.organize.f;
import com.pinterest.feature.board.organize.presenter.BoardOrganizePresenter$boardModelFilter$1;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import dl1.s;
import dm0.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qz.f0;
import uj2.q;
import uk1.d;
import x02.x;

/* loaded from: classes5.dex */
public final class a extends h0 implements ar0.a {
    public final Function1 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d pinalytics, q networkStateStream, String remoteUrl, bq.b sortOption, BoardOrganizePresenter$boardModelFilter$1 modelFiler, f organizeMode, c boardSelectedHandler) {
        super(remoteUrl, new ke0.a[]{gh0.b.K()}, null, null, null, modelFiler, null, null, 0L, 1980);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        Intrinsics.checkNotNullParameter(modelFiler, "modelFiler");
        Intrinsics.checkNotNullParameter(organizeMode, "organizeMode");
        Intrinsics.checkNotNullParameter(boardSelectedHandler, "boardSelectedHandler");
        this.E = boardSelectedHandler;
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.BOARD_ORGANIZE));
        String apiKey = sortOption.getApiKey();
        Intrinsics.checkNotNullExpressionValue(apiKey, "getApiKey(...)");
        f0Var.e("sort", apiKey);
        String value = x.ALL_BOARDS_FILTER.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        f0Var.e("privacy_filter", value);
        this.f49121k = f0Var;
        o(51, new ni0.f(pinalytics, networkStateStream, organizeMode));
    }

    @Override // ar0.a
    public final void S2(int i13, ar0.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        s item = getItem(i13);
        Intrinsics.g(item, "null cannot be cast to non-null type com.pinterest.api.model.Board");
        this.E.invoke((v7) item);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 51;
    }
}
