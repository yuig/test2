package com.pinterest.feature.pin.closeup.datasource;

import androidx.annotation.Keep;
import com.pinterest.api.model.ow;
import com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.i0;
import com.pinterest.framework.multisection.datasource.pagedlist.o0;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uj2.a0;
import uj2.b0;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019BW\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\b\u001a\f0\u0005R\b\u0012\u0004\u0012\u00020\u00070\u00062\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0002\"\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/pinterest/feature/pin/closeup/datasource/RelatedModulesPagedRemoteRequest;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/RetrofitPagedRemoteRequest;", "", "", "params", "Lcom/pinterest/hairball/network/d;", "Lcom/pinterest/hairball/network/e;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/i0;", "getBuilder", "([Ljava/lang/Object;)Lcom/pinterest/hairball/network/d;", "", "", "Lke0/a;", "Ldl1/s;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/DeserializerMap;", "registeredDeserializers", "Lcom/pinterest/api/model/ow;", "modelStorage", "Lx12/a;", "pagedListService", "Llk1/a;", "modelFilter", "headers", "<init>", "(Ljava/util/Map;Lcom/pinterest/api/model/ow;Lx12/a;Llk1/a;Ljava/util/Map;)V", "RelatedModulesRequestBuilder", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RelatedModulesPagedRemoteRequest extends RetrofitPagedRemoteRequest {

    @Keep
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u000b\"\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/pinterest/feature/pin/closeup/datasource/RelatedModulesPagedRemoteRequest$RelatedModulesRequestBuilder;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/o0;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/RetrofitPagedRemoteRequest;", "Lak2/e;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/i0;", "onSuccess", "", "onError", "Lxj2/c;", "execute", "(Lak2/e;Lak2/e;)Lxj2/c;", "", "", "params", "<init>", "(Lcom/pinterest/feature/pin/closeup/datasource/RelatedModulesPagedRemoteRequest;[Ljava/lang/Object;)V", "closeup_release"}, k = 1, mv = {1, 9, 0})
    public final class RelatedModulesRequestBuilder extends o0 {
        final /* synthetic */ RelatedModulesPagedRemoteRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RelatedModulesRequestBuilder(@NotNull RelatedModulesPagedRemoteRequest relatedModulesPagedRemoteRequest, Object... params) {
            super(relatedModulesPagedRemoteRequest, Arrays.copyOf(params, params.length));
            Intrinsics.checkNotNullParameter(params, "params");
            this.this$0 = relatedModulesPagedRemoteRequest;
        }

        @Override // com.pinterest.hairball.network.d, com.pinterest.hairball.network.b
        @NotNull
        public xj2.c execute(@NotNull ak2.e onSuccess, @NotNull ak2.e onError) {
            long j13;
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            Intrinsics.checkNotNullParameter(onError, "onError");
            if (getParams().length < 5 || !(getParams()[4] instanceof Long)) {
                j13 = 0;
            } else {
                Object obj = getParams()[4];
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Long");
                j13 = ((Long) obj).longValue();
            }
            long j14 = j13;
            b0<i0> buildRequest = buildRequest();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            buildRequest.getClass();
            a0 a0Var = tk2.e.f118016b;
            ck2.i.b(timeUnit, "unit is null");
            ck2.i.b(a0Var, "scheduler is null");
            xj2.c o13 = new kk2.e(buildRequest, j14, timeUnit, a0Var).r(tk2.e.f118017c).l(wj2.c.a()).o(onSuccess, onError);
            Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
            return o13;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelatedModulesPagedRemoteRequest(@NotNull Map<String, ? extends ke0.a> registeredDeserializers, @NotNull ow modelStorage, @NotNull x12.a pagedListService, lk1.a aVar, @NotNull Map<String, String> headers) {
        super(registeredDeserializers, modelStorage, null, aVar, pagedListService, null, null, headers, null, 324, null);
        Intrinsics.checkNotNullParameter(registeredDeserializers, "registeredDeserializers");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(headers, "headers");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest, com.pinterest.hairball.network.e
    @NotNull
    public com.pinterest.hairball.network.d getBuilder(@NotNull Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new RelatedModulesRequestBuilder(this, Arrays.copyOf(params, params.length));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest
    public /* bridge */ /* synthetic */ boolean hasNextPage() {
        return super.hasNextPage();
    }

    public /* synthetic */ RelatedModulesPagedRemoteRequest(Map map, ow owVar, x12.a aVar, lk1.a aVar2, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, owVar, aVar, (i13 & 8) != 0 ? null : aVar2, (i13 & 16) != 0 ? z0.d() : map2);
    }
}
