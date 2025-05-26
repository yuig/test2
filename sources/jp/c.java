package jp;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.r0;
import dl1.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wk1.n;
import wt1.c0;
import wt1.d0;
import xk2.m;
import xk2.v;

/* loaded from: classes3.dex */
public final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    public final oc.c f77242a;

    /* renamed from: b, reason: collision with root package name */
    public final v f77243b;

    /* renamed from: c, reason: collision with root package name */
    public final v f77244c;

    /* renamed from: d, reason: collision with root package name */
    public final xk1.e f77245d;

    /* renamed from: e, reason: collision with root package name */
    public final ep.e f77246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wk1.c params, h12.a boardInviteApi, oc.c apolloClient) {
        super(params);
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(boardInviteApi, "boardInviteApi");
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        this.f77242a = apolloClient;
        this.f77243b = m.b(new a(this, 1));
        this.f77244c = m.b(new a(this, 0));
        xk1.e eVar = new xk1.e(new b(0));
        eVar.u(RecyclerViewTypes.VIEW_TYPE_BOARD_INVITE_HEADER);
        eVar.n();
        eVar.y();
        this.f77245d = eVar;
        this.f77246e = new ep.e(boardInviteApi);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        com.pinterest.framework.multisection.datasource.pagedlist.v vVar = new com.pinterest.framework.multisection.datasource.pagedlist.v((r0) this.f77243b.getValue(), false, 4);
        vVar.k(RecyclerViewTypes.VIEW_TYPE_INBOX_HEADER);
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(vVar);
        iVar.b(this.f77245d);
        iVar.b((com.pinterest.framework.multisection.datasource.pagedlist.g) this.f77244c.getValue());
        iVar.b(this.f77246e);
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

    @Override // wk1.q
    public final void onStateUpdated(c0 state, d0 remoteList) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remoteList, "remoteList");
        super.onStateUpdated(state, remoteList);
        v vVar = this.f77244c;
        boolean d2 = Intrinsics.d(remoteList, (com.pinterest.framework.multisection.datasource.pagedlist.g) vVar.getValue());
        ep.e eVar = this.f77246e;
        if (d2 || Intrinsics.d(remoteList, eVar)) {
            int a13 = ((com.pinterest.framework.multisection.datasource.pagedlist.g) vVar.getValue()).a();
            xk1.e eVar2 = this.f77245d;
            if (a13 > 0 || eVar.a() > 0) {
                eVar2.t();
            } else {
                eVar2.y();
            }
        }
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(cp.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        cp.f fVar = (cp.f) view;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        fVar.Z0 = this;
    }
}
