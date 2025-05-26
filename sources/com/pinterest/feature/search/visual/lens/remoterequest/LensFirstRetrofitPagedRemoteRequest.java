package com.pinterest.feature.search.visual.lens.remoterequest;

import com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.i0;
import com.pinterest.hairball.network.d;
import j90.b;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd0.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/search/visual/lens/remoterequest/LensFirstRetrofitPagedRemoteRequest;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/RetrofitPagedRemoteRequest;", "j90/b", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LensFirstRetrofitPagedRemoteRequest extends RetrofitPagedRemoteRequest {
    @Override // com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest, com.pinterest.hairball.network.e
    public final d getBuilder(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new b(this, Arrays.copyOf(params, params.length));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest
    public final i0 parseResponse(c response) {
        Intrinsics.checkNotNullParameter(response, "response");
        i0 parseResponse = super.parseResponse(response);
        String bookmark = parseResponse.f49140a;
        List models = parseResponse.f49141b;
        parseResponse.getClass();
        Intrinsics.checkNotNullParameter(bookmark, "bookmark");
        Intrinsics.checkNotNullParameter(models, "models");
        return new i0(bookmark, null, models);
    }
}
