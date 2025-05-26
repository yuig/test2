package go0;

import com.pinterest.api.model.ba;
import com.pinterest.framework.multisection.datasource.pagedlist.r0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.z2;
import m60.g0;
import so.n6;
import x02.x0;
import x02.y;
import yk1.v;

/* loaded from: classes5.dex */
public abstract class a extends wk1.n implements fo0.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65817a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65818b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65819c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65820d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65821e;

    /* renamed from: f, reason: collision with root package name */
    public final h f65822f;

    /* renamed from: g, reason: collision with root package name */
    public final i f65823g;

    /* renamed from: h, reason: collision with root package name */
    public final d f65824h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String userId, wk1.c params, boolean z13, boolean z14, boolean z15, boolean z16, nr0.m dynamicGridViewBinderDelegateFactory, x12.a pagedListService, g0 pageSizeProvider, x0 boardRepository, boolean z17, y boardFeedRepository, b60.b activeUserManager, z2 repinExperiments, v viewResources) {
        super(params);
        v vVar;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(boardFeedRepository, "boardFeedRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(repinExperiments, "repinExperiments");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        this.f65817a = z13;
        this.f65818b = z14;
        this.f65819c = z15;
        this.f65820d = z16;
        this.f65821e = z17;
        i iVar = null;
        this.f65822f = (str == null || str.length() == 0) ? null : new h(this, str, boardRepository);
        v vVar2 = params.f130137h;
        if (str == null || str.length() == 0) {
            vVar = vVar2;
        } else {
            String str3 = str2 == null ? "" : str2;
            uk1.d presenterPinalytics = getPresenterPinalytics();
            qa2.n nVar = params.f130131b;
            vVar = vVar2;
            iVar = new i(str, this, pageSizeProvider, str3, pagedListService, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar.f103320a, nVar, vVar2));
        }
        this.f65823g = iVar;
        uk1.d presenterPinalytics2 = getPresenterPinalytics();
        qa2.n nVar2 = params.f130131b;
        this.f65824h = new d(userId, this, pageSizeProvider, str, pagedListService, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics2, nVar2.f103320a, nVar2, vVar), z17);
        new c(this, str, boardFeedRepository, activeUserManager, viewResources);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        h hVar;
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        boolean z13 = false;
        int i13 = 4;
        if (this.f65817a && (hVar = this.f65822f) != null) {
            com.pinterest.framework.multisection.datasource.pagedlist.v vVar = new com.pinterest.framework.multisection.datasource.pagedlist.v(hVar, z13, i13);
            vVar.k(465545);
            ((wk1.i) dataSources).b(vVar);
        }
        boolean z14 = this.f65819c;
        i iVar = this.f65823g;
        if (iVar != null) {
            com.pinterest.framework.multisection.datasource.pagedlist.v vVar2 = new com.pinterest.framework.multisection.datasource.pagedlist.v((r0) iVar, true, true);
            vVar2.k(465543);
            if (this.f65820d) {
                vVar2.g(465542);
            } else if (z14) {
                vVar2.g(67);
            }
            ((wk1.i) dataSources).b(vVar2);
        }
        if (!this.f65818b || this.f65821e) {
            return;
        }
        com.pinterest.framework.multisection.datasource.pagedlist.v vVar3 = new com.pinterest.framework.multisection.datasource.pagedlist.v(this.f65824h, z13, i13);
        vVar3.k(465544);
        if (z14) {
            vVar3.g(67);
        }
        ((wk1.i) dataSources).b(vVar3);
    }

    public final ba u3(String boardSectionId) {
        dl1.s sVar;
        List d2;
        Object obj;
        Intrinsics.checkNotNullParameter(boardSectionId, "boardSectionId");
        i iVar = this.f65823g;
        if (iVar == null || (d2 = iVar.d()) == null) {
            sVar = null;
        } else {
            Iterator it = d2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                dl1.s sVar2 = (dl1.s) obj;
                if ((sVar2 instanceof ba) && Intrinsics.d(((ba) sVar2).getUid(), boardSectionId)) {
                    break;
                }
            }
            sVar = (dl1.s) obj;
        }
        if (sVar instanceof ba) {
            return (ba) sVar;
        }
        return null;
    }
}
