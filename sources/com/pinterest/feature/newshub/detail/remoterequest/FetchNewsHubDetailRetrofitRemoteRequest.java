package com.pinterest.feature.newshub.detail.remoterequest;

import com.pinterest.api.model.ow;
import com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest;
import com.pinterest.hairball.network.d;
import ix0.a;
import j90.b;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.d1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/newshub/detail/remoterequest/FetchNewsHubDetailRetrofitRemoteRequest;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/RetrofitPagedRemoteRequest;", "j90/b", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FetchNewsHubDetailRetrofitRemoteRequest extends RetrofitPagedRemoteRequest {

    /* renamed from: a, reason: collision with root package name */
    public final a f46785a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f46786b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f46787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchNewsHubDetailRetrofitRemoteRequest(a newsHubDetailItemsLoadingListener, Map registeredDeserializers, ow modelStorage, x12.a pagedListService, d0 pinalytics, d1 trackingParamAttacher) {
        super(registeredDeserializers, modelStorage, null, null, pagedListService, null, null, null, null, 460, null);
        Intrinsics.checkNotNullParameter(newsHubDetailItemsLoadingListener, "newsHubDetailItemsLoadingListener");
        Intrinsics.checkNotNullParameter(registeredDeserializers, "registeredDeserializers");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        this.f46785a = newsHubDetailItemsLoadingListener;
        this.f46786b = pinalytics;
        this.f46787c = trackingParamAttacher;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest, com.pinterest.hairball.network.e
    public final d getBuilder(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new b(this, Arrays.copyOf(params, params.length));
    }
}
