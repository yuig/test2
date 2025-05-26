package com.pinterest.feature.profile.savedtab.remoterequest;

import android.content.Context;
import com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.i0;
import com.pinterest.hairball.network.d;
import d12.i;
import dl1.s;
import j90.b;
import java.util.Arrays;
import kb0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o10.c;
import o10.e;
import so.oa;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/profile/savedtab/remoterequest/ProfileSavedTabBoardsRetrofitPagedRemoteRequest;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/RetrofitPagedRemoteRequest;", "j90/b", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProfileSavedTabBoardsRetrofitPagedRemoteRequest extends RetrofitPagedRemoteRequest {
    @Override // com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest, com.pinterest.hairball.network.e
    public final d getBuilder(Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new b(this, Arrays.copyOf(params, params.length));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest
    public final void postParseResponse(i0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        for (s sVar : response.f49141b) {
            e a13 = ((c) getModelExtractorProvider()).a(sVar);
            if (a13 != null) {
                a13.a(sVar, getModelStorage());
            }
        }
        Context context = a.f79058b;
        i.a((i) ((oa) ((so1.b) ep.b.g(so1.b.class))).N2.get(), getModelStorage());
    }
}
