package com.pinterest.collage.cutoutcloseup.remoterequest;

import com.pinterest.api.model.ow;
import com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest;
import com.pinterest.hairball.network.d;
import j90.b;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x12.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/collage/cutoutcloseup/remoterequest/CollagesCarouselCutoutRelatedModulesPagedRemoteRequest;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/RetrofitPagedRemoteRequest;", "j90/b", "cutoutCloseup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CollagesCarouselCutoutRelatedModulesPagedRemoteRequest extends RetrofitPagedRemoteRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f44615a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollagesCarouselCutoutRelatedModulesPagedRemoteRequest(Map registeredDeserializers, ow modelStorage, a pagedListService, String assetId) {
        super(registeredDeserializers, modelStorage, null, null, pagedListService, null, null, null, null, 460, null);
        Intrinsics.checkNotNullParameter(registeredDeserializers, "registeredDeserializers");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        this.f44615a = assetId;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest, com.pinterest.hairball.network.e
    public final d getBuilder(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new b(this, Arrays.copyOf(params, params.length));
    }
}
