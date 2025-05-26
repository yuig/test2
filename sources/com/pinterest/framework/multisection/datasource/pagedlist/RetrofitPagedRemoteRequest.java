package com.pinterest.framework.multisection.datasource.pagedlist;

import androidx.annotation.Keep;
import com.pinterest.api.model.ow;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.repository.TypedId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003KLMB\u0083\u0001\u0012\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u000fj\u0002`\u001c\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109\u0012\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010A\u001a\u00020@¢\u0006\u0004\bI\u0010JJ1\u0010\u0007\u001a\f0\u0006R\b\u0012\u0004\u0012\u00020\u00020\u00012\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\t\u001a\f0\u0006R\b\u0012\u0004\u0012\u00020\u00020\u00012\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fH\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0002H\u0015¢\u0006\u0004\b\u0018\u0010\u0019R0\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u000fj\u0002`\u001c8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010!\u001a\u00020 8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010+\u001a\u0004\u0018\u00010*8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\u00020/8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u00105\u001a\u0004\u0018\u0001048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010:\u001a\u0004\u0018\u0001098\u0004X\u0084\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b>\u0010\u001e\u001a\u0004\b?\u0010\u0012R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006N"}, d2 = {"Lcom/pinterest/framework/multisection/datasource/pagedlist/RetrofitPagedRemoteRequest;", "Lcom/pinterest/hairball/network/e;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/i0;", "", "", "params", "Lcom/pinterest/hairball/network/d;", "getBuilder", "([Ljava/lang/Object;)Lcom/pinterest/hairball/network/d;", "prepare", "Lvd0/c;", "response", "Lvd0/b;", "deserializePinterestJsonArrayWithBookmark", "(Lvd0/c;)Lvd0/b;", "", "", "maybeFreezeHeaders", "()Ljava/util/Map;", "maybeFreezeParameters", "(Ljava/util/Map;)Ljava/util/Map;", "parseResponse", "(Lvd0/c;)Lcom/pinterest/framework/multisection/datasource/pagedlist/i0;", "", "postParseResponse", "(Lcom/pinterest/framework/multisection/datasource/pagedlist/i0;)V", "Lke0/a;", "Ldl1/s;", "Lcom/pinterest/framework/multisection/datasource/pagedlist/DeserializerMap;", "registeredDeserializers", "Ljava/util/Map;", "getRegisteredDeserializers", "Lcom/pinterest/api/model/ow;", "modelStorage", "Lcom/pinterest/api/model/ow;", "getModelStorage", "()Lcom/pinterest/api/model/ow;", "Lo10/f;", "modelExtractorProvider", "Lo10/f;", "getModelExtractorProvider", "()Lo10/f;", "Llk1/a;", "modelFilter", "Llk1/a;", "getModelFilter", "()Llk1/a;", "Lx12/a;", "pagedListService", "Lx12/a;", "getPagedListService", "()Lx12/a;", "Lxt1/d;", "remoteRequestListener", "Lxt1/d;", "getRemoteRequestListener", "()Lxt1/d;", "Ls92/i;", "pwtAction", "Ls92/i;", "getPwtAction", "()Ls92/i;", "headers", "getHeaders", "Llh0/n1;", "experiments", "Llh0/n1;", "Ld12/i;", "repositoryBatcher$delegate", "Lxk2/k;", "getRepositoryBatcher", "()Ld12/i;", "repositoryBatcher", "<init>", "(Ljava/util/Map;Lcom/pinterest/api/model/ow;Lo10/f;Llk1/a;Lx12/a;Lxt1/d;Ls92/i;Ljava/util/Map;Llh0/n1;)V", "com/pinterest/framework/multisection/datasource/pagedlist/o0", "com/pinterest/framework/multisection/datasource/pagedlist/p0", "com/pinterest/framework/multisection/datasource/pagedlist/q0", "pagedListLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class RetrofitPagedRemoteRequest extends com.pinterest.hairball.network.e {

    @NotNull
    private final n1 experiments;

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final o10.f modelExtractorProvider;
    private final lk1.a modelFilter;

    @NotNull
    private final ow modelStorage;

    @NotNull
    private final x12.a pagedListService;
    private final s92.i pwtAction;

    @NotNull
    private final Map<String, ke0.a> registeredDeserializers;
    private final xt1.d remoteRequestListener;

    /* renamed from: repositoryBatcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final xk2.k repositoryBatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public RetrofitPagedRemoteRequest(@NotNull Map<String, ? extends ke0.a> registeredDeserializers, @NotNull ow modelStorage, @NotNull o10.f modelExtractorProvider, lk1.a aVar, @NotNull x12.a pagedListService, xt1.d dVar, s92.i iVar, @NotNull Map<String, String> headers, @NotNull n1 experiments) {
        Intrinsics.checkNotNullParameter(registeredDeserializers, "registeredDeserializers");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        Intrinsics.checkNotNullParameter(modelExtractorProvider, "modelExtractorProvider");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.registeredDeserializers = registeredDeserializers;
        this.modelStorage = modelStorage;
        this.modelExtractorProvider = modelExtractorProvider;
        this.modelFilter = aVar;
        this.pagedListService = pagedListService;
        this.remoteRequestListener = dVar;
        this.pwtAction = iVar;
        this.headers = headers;
        this.experiments = experiments;
        this.repositoryBatcher = xk2.m.b(i.f49138k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d12.i getRepositoryBatcher() {
        return (d12.i) this.repositoryBatcher.getValue();
    }

    @NotNull
    public final vd0.b deserializePinterestJsonArrayWithBookmark(@NotNull vd0.c response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(response, "pinterestJsonObject");
        String o13 = response.o("bookmark", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        Object a13 = vd0.c.a(response.f125623a.v("data"));
        vd0.a aVar = a13 instanceof vd0.a ? (vd0.a) a13 : null;
        if (aVar == null) {
            aVar = new vd0.a();
        }
        vd0.b bVar = new vd0.b(aVar, o13);
        if (response.e("url")) {
            bVar.f125621c = response.d("url");
        }
        return bVar;
    }

    @Override // com.pinterest.hairball.network.e
    @NotNull
    public com.pinterest.hairball.network.d getBuilder(@NotNull Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new o0(this, Arrays.copyOf(params, params.length));
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final o10.f getModelExtractorProvider() {
        return this.modelExtractorProvider;
    }

    public final lk1.a getModelFilter() {
        return this.modelFilter;
    }

    @NotNull
    public final ow getModelStorage() {
        return this.modelStorage;
    }

    @NotNull
    public final x12.a getPagedListService() {
        return this.pagedListService;
    }

    public final s92.i getPwtAction() {
        return this.pwtAction;
    }

    @NotNull
    public final Map<String, ke0.a> getRegisteredDeserializers() {
        return this.registeredDeserializers;
    }

    public final xt1.d getRemoteRequestListener() {
        return this.remoteRequestListener;
    }

    public /* bridge */ /* synthetic */ boolean hasNextPage() {
        return false;
    }

    @NotNull
    public final Map<String, String> maybeFreezeHeaders() {
        n1 n1Var = this.experiments;
        n1Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) n1Var.f83439a;
        return (g1Var.o("android_immutable_header_map", "enabled", z3Var) || g1Var.l("android_immutable_header_map")) ? Util.B(this.headers) : this.headers;
    }

    @NotNull
    public final Map<String, String> maybeFreezeParameters(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        n1 n1Var = this.experiments;
        n1Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) n1Var.f83439a;
        return (g1Var.o("android_immutable_header_map", "enabled", z3Var) || g1Var.l("android_immutable_header_map")) ? Util.B(params) : params;
    }

    @NotNull
    public i0 parseResponse(@NotNull vd0.c response) {
        dl1.s d2;
        Intrinsics.checkNotNullParameter(response, "response");
        xt1.d dVar = this.remoteRequestListener;
        if (dVar != null) {
            dVar.beforeParseResponse(response);
        }
        vd0.b deserializePinterestJsonArrayWithBookmark = deserializePinterestJsonArrayWithBookmark(response);
        vd0.a aVar = deserializePinterestJsonArrayWithBookmark.f125619a;
        ArrayList arrayList = new ArrayList();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            vd0.c cVar = (vd0.c) it.next();
            String o13 = cVar.o("type", "");
            Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
            lk1.a aVar2 = this.modelFilter;
            dl1.s sVar = null;
            if (aVar2 == null || !aVar2.a(o13)) {
                ke0.a aVar3 = this.registeredDeserializers.get(o13);
                if (aVar3 == null || (d2 = aVar3.d(cVar)) == null) {
                    throw new IllegalArgumentException(a.a.j("Cannot deserialize type ", o13));
                }
                lk1.a aVar4 = this.modelFilter;
                if (aVar4 == null || !aVar4.b(d2)) {
                    sVar = d2;
                }
            }
            if (sVar != null) {
                arrayList.add(sVar);
            }
        }
        String str = deserializePinterestJsonArrayWithBookmark.f125621c;
        i0 i0Var = new i0(deserializePinterestJsonArrayWithBookmark.f125620b, str, arrayList);
        xt1.d dVar2 = this.remoteRequestListener;
        if (dVar2 != null) {
            dVar2.afterParseResponse(new bl1.a(str, response));
        }
        return i0Var;
    }

    public void postParseResponse(@NotNull i0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        for (dl1.s sVar : response.f49141b) {
            o10.e a13 = ((o10.c) this.modelExtractorProvider).a(sVar);
            if (a13 != null) {
                a13.a(sVar, this.modelStorage);
            }
        }
        d12.i.a(getRepositoryBatcher(), this.modelStorage);
    }

    @Override // com.pinterest.hairball.network.e
    @NotNull
    public com.pinterest.hairball.network.d prepare(@NotNull Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Object obj = params[2];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<com.pinterest.repository.TypedId>");
        return (((TypedId[]) obj).length == 0) ^ true ? new q0(this, Arrays.copyOf(params, params.length)) : super.prepare(Arrays.copyOf(params, params.length));
    }

    public /* synthetic */ RetrofitPagedRemoteRequest(Map map, ow owVar, o10.f fVar, lk1.a aVar, x12.a aVar2, xt1.d dVar, s92.i iVar, Map map2, n1 n1Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, owVar, (i13 & 4) != 0 ? o10.c.f92770a : fVar, (i13 & 8) != 0 ? null : aVar, aVar2, (i13 & 32) != 0 ? null : dVar, (i13 & 64) != 0 ? null : iVar, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? z0.d() : map2, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? n1.f83436b.c() : n1Var);
    }
}
