package jp;

import com.pinterest.framework.multisection.datasource.pagedlist.r0;
import dl1.s;
import java.util.ArrayList;
import java.util.List;
import k1.q;
import k1.v0;
import k22.m;
import kotlin.jvm.internal.Intrinsics;
import lh0.p0;
import wk1.n;
import x02.x2;
import xk2.v;

/* loaded from: classes3.dex */
public final class i extends n {

    /* renamed from: a, reason: collision with root package name */
    public final oc.c f77268a;

    /* renamed from: b, reason: collision with root package name */
    public final m f77269b;

    /* renamed from: c, reason: collision with root package name */
    public final x2 f77270c;

    /* renamed from: d, reason: collision with root package name */
    public final xj2.b f77271d;

    /* renamed from: e, reason: collision with root package name */
    public final v f77272e;

    /* renamed from: f, reason: collision with root package name */
    public final v f77273f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(wk1.c params, String conversationId, no1.e conversationDataSource, q12.b conversationService, oc.c apolloClient, p0 conversationExperiments, qz.a cache, m userService, x2 userRepository) {
        super(params);
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(conversationDataSource, "conversationDataSource");
        Intrinsics.checkNotNullParameter(conversationService, "conversationService");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(conversationExperiments, "conversationExperiments");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f77268a = apolloClient;
        this.f77269b = userService;
        this.f77270c = userRepository;
        this.f77271d = new xj2.b();
        this.f77272e = xk2.m.b(new v0(28, this, conversationId));
        this.f77273f = xk2.m.b(new q(conversationId, conversationDataSource, conversationService, 10));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        com.pinterest.framework.multisection.datasource.pagedlist.v vVar = new com.pinterest.framework.multisection.datasource.pagedlist.v((r0) this.f77272e.getValue(), false, 4);
        vVar.k(1);
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(vVar);
        iVar.b(new com.pinterest.framework.multisection.datasource.pagedlist.v((r0) this.f77273f.getValue(), false, 4));
    }

    @Override // wk1.n
    public final List convertToPlankModels(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof s) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // wk1.q, yk1.b
    public final void onDestroy() {
        super.onDestroy();
        this.f77271d.d();
    }
}
