package id0;

import androidx.camera.core.impl.j;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.multisection.datasource.pagedlist.t;
import gd0.f;
import gd0.g;
import gd0.h;
import k22.m;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import ug0.i;
import wk1.q;

/* loaded from: classes5.dex */
public final class e extends q {

    /* renamed from: a, reason: collision with root package name */
    public final hd0.b f72128a;

    /* renamed from: b, reason: collision with root package name */
    public final j f72129b;

    /* renamed from: c, reason: collision with root package name */
    public final i f72130c;

    /* renamed from: d, reason: collision with root package name */
    public final x12.a f72131d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f72132e;

    /* renamed from: f, reason: collision with root package name */
    public final m f72133f;

    /* renamed from: g, reason: collision with root package name */
    public final b60.b f72134g;

    /* renamed from: h, reason: collision with root package name */
    public final a71.c f72135h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f72136i;

    /* renamed from: j, reason: collision with root package name */
    public final f f72137j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(hd0.b creatorToolsModuleState, uj2.q networkStateStream, uk1.e presenterPinalyticsFactory, j environment, i experiencesApi, x12.a pagedListService, g0 pagedSizeProvider, m userService, b60.b activeUserManager) {
        super(((uk1.a) presenterPinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(creatorToolsModuleState, "creatorToolsModuleState");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(experiencesApi, "experiencesApi");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(pagedSizeProvider, "pagedSizeProvider");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f72128a = creatorToolsModuleState;
        this.f72129b = environment;
        this.f72130c = experiencesApi;
        this.f72131d = pagedListService;
        this.f72132e = pagedSizeProvider;
        this.f72133f = userService;
        this.f72134g = activeUserManager;
        this.f72135h = new a71.c(getPinalytics(), 0);
        wy0 f13 = ((b60.d) ((b60.b) environment.f16875b)).f();
        this.f72136i = f13 != null ? Intrinsics.d(f13.G3(), Boolean.TRUE) : false;
        this.f72137j = new f(experiencesApi, new b(this, 3), new b(this, 4));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        wk1.i iVar = (wk1.i) dataSources;
        iVar.b(new h(this.f72128a));
        j jVar = this.f72129b;
        iVar.b(new g((b60.b) jVar.f16875b, (d20.a) jVar.f16876c, new a(this, 0), new b(this, 0)));
        iVar.b(this.f72137j);
        String id3 = com.bumptech.glide.d.Q((b60.b) jVar.f16875b).getId();
        b bVar = new b(this, 1);
        c cVar = new c(3, this, e.class, "onRecentPinThumbnailTapped", "onRecentPinThumbnailTapped(ILjava/lang/String;Ljava/util/List;)V", 0);
        a aVar = new a(this, 1);
        b bVar2 = new b(this, 2);
        Intrinsics.f(id3);
        t tVar = new t(new gd0.d(this.f72136i, id3, this.f72131d, this.f72132e, bVar2, aVar, bVar, cVar), this.f72136i);
        tVar.g(6);
        iVar.b(tVar);
    }

    public final void t3(md0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f72135h.d(event);
    }
}
