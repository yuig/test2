package t91;

import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.wy0;
import jk2.d0;
import kotlin.jvm.internal.Intrinsics;
import lh0.m3;
import ll.j;
import m60.w;
import n60.o;
import p91.y;
import sq0.c0;
import u91.h;
import wk1.i;
import wk1.q;
import x02.x2;

/* loaded from: classes5.dex */
public final class e extends q {

    /* renamed from: a, reason: collision with root package name */
    public final x2 f116834a;

    /* renamed from: b, reason: collision with root package name */
    public final w f116835b;

    /* renamed from: c, reason: collision with root package name */
    public final UserDeserializer f116836c;

    /* renamed from: d, reason: collision with root package name */
    public final yk1.a f116837d;

    /* renamed from: e, reason: collision with root package name */
    public final lb2.d f116838e;

    /* renamed from: f, reason: collision with root package name */
    public final m3 f116839f;

    /* renamed from: g, reason: collision with root package name */
    public final lb0.q f116840g;

    /* renamed from: h, reason: collision with root package name */
    public wy0 f116841h;

    /* renamed from: i, reason: collision with root package name */
    public final j f116842i;

    /* renamed from: j, reason: collision with root package name */
    public final s91.c f116843j;

    /* renamed from: k, reason: collision with root package name */
    public final b f116844k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(uk1.d pinalytics, uj2.q networkStateStream, x2 userRepository, w eventManager, x10.d settingsApi, UserDeserializer userDeserializer, yk1.a resources, lb2.d accountManager, b60.b activeUserManager, m3 experiments, lb0.q prefsManagerPersisted) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(accountManager, "accountManager");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f116834a = userRepository;
        this.f116835b = eventManager;
        this.f116836c = userDeserializer;
        this.f116837d = resources;
        this.f116838e = accountManager;
        this.f116839f = experiments;
        this.f116840g = prefsManagerPersisted;
        j jVar = new j(resources);
        this.f116842i = jVar;
        this.f116843j = new s91.c(userRepository, userDeserializer, settingsApi, resources, jVar, activeUserManager, experiments, prefsManagerPersisted);
        this.f116844k = new b(this);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f116843j);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.f116835b.j(this.f116844k);
        ((h) ((r91.c) getView())).f121221z0 = null;
        super.onUnbind();
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return false;
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(r91.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((h) view).f121221z0 = this;
        uj2.q Q = this.f116834a.d0().Q("me");
        hk2.b bVar = new hk2.b(new y(8, new c(this, 3)), new y(9, d.f116833i), ck2.i.f27923c);
        try {
            Q.d(new d0(bVar, 0L));
            Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
            addDisposable(bVar);
        } catch (NullPointerException e13) {
            throw e13;
        } catch (Throwable th3) {
            throw o.g(th3, "subscribeActual failed", th3);
        }
    }
}
