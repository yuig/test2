package co0;

import com.pinterest.api.model.ba;
import ep.g;
import hk2.o;
import j12.k;
import kl0.t;
import kotlin.jvm.internal.Intrinsics;
import sq0.c0;
import uj2.b0;
import wk1.i;
import wk1.q;
import x02.z0;
import yk1.v;

/* loaded from: classes5.dex */
public final class d extends q {

    /* renamed from: a, reason: collision with root package name */
    public final String f28276a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f28277b;

    /* renamed from: c, reason: collision with root package name */
    public final k f28278c;

    /* renamed from: d, reason: collision with root package name */
    public final i92.k f28279d;

    /* renamed from: e, reason: collision with root package name */
    public final v f28280e;

    /* renamed from: f, reason: collision with root package name */
    public final kn0.b f28281f;

    /* renamed from: g, reason: collision with root package name */
    public ba f28282g;

    /* renamed from: h, reason: collision with root package name */
    public final bo0.a f28283h;

    /* renamed from: i, reason: collision with root package name */
    public final c f28284i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String boardId, String sourceSectionId, uk1.d presenterPinalytics, z0 sectionRepository, k boardSectionService, uj2.q networkStateStream, i92.k toastUtils, v viewResources, kn0.b bulkActionStatusLongPollingManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(sourceSectionId, "sourceSectionId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(sectionRepository, "sectionRepository");
        Intrinsics.checkNotNullParameter(boardSectionService, "boardSectionService");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(bulkActionStatusLongPollingManager, "bulkActionStatusLongPollingManager");
        this.f28276a = sourceSectionId;
        this.f28277b = sectionRepository;
        this.f28278c = boardSectionService;
        this.f28279d = toastUtils;
        this.f28280e = viewResources;
        this.f28281f = bulkActionStatusLongPollingManager;
        this.f28283h = new bo0.a(boardSectionService, boardId, sourceSectionId, this);
        this.f28284i = new c(this, 0);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f28283h);
    }

    public final void t3(String sourceId, String destinationId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        z0 z0Var = this.f28277b;
        o v13 = b0.v(z0Var.Q(sourceId).s(), z0Var.Q(destinationId).s(), new g(7, b.f28273i));
        Intrinsics.checkNotNullExpressionValue(v13, "zip(...)");
        v13.p(this.f28284i);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(ao0.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((do0.b) view).F0 = this;
        xj2.c F = this.f28277b.Q(this.f28276a).F(new tn0.a(22, new t(this, 23)), new tn0.a(23, a.f28272i), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }
}
