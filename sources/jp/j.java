package jp;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.r0;
import dl1.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.p0;
import wk1.n;
import xk2.m;
import xk2.v;

/* loaded from: classes3.dex */
public final class j extends n {

    /* renamed from: a, reason: collision with root package name */
    public final oc.c f77274a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f77275b;

    /* renamed from: c, reason: collision with root package name */
    public final v f77276c;

    /* renamed from: d, reason: collision with root package name */
    public final ep.e f77277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wk1.c params, u20.d sendShareServiceWrapper, oc.c apolloClient, p0 conversationExperiments, qz.a cache) {
        super(params);
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(sendShareServiceWrapper, "sendShareServiceWrapper");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        Intrinsics.checkNotNullParameter(conversationExperiments, "conversationExperiments");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f77274a = apolloClient;
        this.f77275b = conversationExperiments;
        this.f77276c = m.b(new db.m(this, 5));
        this.f77277d = new ep.e(sendShareServiceWrapper);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        com.pinterest.framework.multisection.datasource.pagedlist.v vVar = new com.pinterest.framework.multisection.datasource.pagedlist.v((r0) u3(), false, 4);
        vVar.k(RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER);
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(vVar);
        boolean c13 = this.f77275b.c();
        ep.e eVar = this.f77277d;
        if (!c13) {
            com.pinterest.framework.multisection.datasource.pagedlist.v vVar2 = new com.pinterest.framework.multisection.datasource.pagedlist.v((r0) eVar, false, 4);
            vVar2.k(RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER);
            iVar.b(vVar2);
        } else {
            xk1.e eVar2 = new xk1.e(new b(1));
            eVar2.u(RecyclerViewTypes.VIEW_TYPE_CONTACTS_HEADER);
            iVar.b(eVar2);
            iVar.b(new qb2.a());
            iVar.b(eVar);
        }
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

    public final com.pinterest.framework.multisection.datasource.pagedlist.g u3() {
        return (com.pinterest.framework.multisection.datasource.pagedlist.g) this.f77276c.getValue();
    }
}
