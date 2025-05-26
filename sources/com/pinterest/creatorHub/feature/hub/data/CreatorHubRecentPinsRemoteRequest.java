package com.pinterest.creatorHub.feature.hub.data;

import com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest;
import com.pinterest.hairball.network.d;
import j90.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/creatorHub/feature/hub/data/CreatorHubRecentPinsRemoteRequest;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/RetrofitPagedRemoteRequest;", "j90/b", "hub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreatorHubRecentPinsRemoteRequest extends RetrofitPagedRemoteRequest {
    @Override // com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest, com.pinterest.hairball.network.e
    public final d getBuilder(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new b(this, Arrays.copyOf(params, params.length));
    }
}
