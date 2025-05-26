package u00;

import c50.y0;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ue;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import dl1.t;
import ey.k3;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import lb0.q;
import lh0.d3;
import m60.f0;
import okhttp3.OkHttpClient;
import pc.u;
import pc.v;
import pc.w;
import vc.c0;
import vc.r;
import vu1.a0;
import yc.x;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f119804a;

    /* renamed from: b, reason: collision with root package name */
    public final OkHttpClient f119805b;

    /* renamed from: c, reason: collision with root package name */
    public final String f119806c;

    /* renamed from: d, reason: collision with root package name */
    public final int f119807d;

    /* renamed from: e, reason: collision with root package name */
    public final d10.g f119808e;

    /* renamed from: f, reason: collision with root package name */
    public final t f119809f;

    /* renamed from: g, reason: collision with root package name */
    public final t f119810g;

    /* renamed from: h, reason: collision with root package name */
    public final t f119811h;

    /* renamed from: i, reason: collision with root package name */
    public final t f119812i;

    /* renamed from: j, reason: collision with root package name */
    public final t f119813j;

    /* renamed from: k, reason: collision with root package name */
    public final v f119814k;

    /* renamed from: l, reason: collision with root package name */
    public final o00.a f119815l;

    /* renamed from: m, reason: collision with root package name */
    public final m60.e f119816m;

    /* renamed from: n, reason: collision with root package name */
    public final f0 f119817n;

    /* renamed from: o, reason: collision with root package name */
    public final f0 f119818o;

    /* renamed from: p, reason: collision with root package name */
    public final k3 f119819p;

    /* renamed from: q, reason: collision with root package name */
    public final y00.a f119820q;

    /* renamed from: r, reason: collision with root package name */
    public k f119821r;

    /* renamed from: s, reason: collision with root package name */
    public p f119822s;

    public a(OkHttpClient client, a0 cronetClient, OkHttpClient unauthClient, String url, int i13, d10.g errorInterceptor, t userRepository, t pinRepository, t boardRepository, t conversationRepository, t boardSectionRepository, v customScalarAdapters, o00.a coroutineDispatcherProvider, m60.e applicationInfoProvider, f0 cacheKeyGenerator, f0 cacheKeyResolver, k3 perfLogger, q prefsManagerPersisted, d3 experiments, y00.a conversationUsersNotNullableFieldCacheResolver) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(cronetClient, "cronetClient");
        Intrinsics.checkNotNullParameter(unauthClient, "unauthClient");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(errorInterceptor, "errorInterceptor");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(boardSectionRepository, "boardSectionRepository");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(cacheKeyGenerator, "cacheKeyGenerator");
        Intrinsics.checkNotNullParameter(cacheKeyResolver, "cacheKeyResolver");
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(conversationUsersNotNullableFieldCacheResolver, "conversationUsersNotNullableFieldCacheResolver");
        this.f119804a = client;
        this.f119805b = unauthClient;
        this.f119806c = url;
        this.f119807d = i13;
        this.f119808e = errorInterceptor;
        this.f119809f = userRepository;
        this.f119810g = pinRepository;
        this.f119811h = boardRepository;
        this.f119812i = conversationRepository;
        this.f119813j = boardSectionRepository;
        this.f119814k = customScalarAdapters;
        this.f119815l = coroutineDispatcherProvider;
        this.f119816m = applicationInfoProvider;
        this.f119817n = cacheKeyGenerator;
        this.f119818o = cacheKeyResolver;
        this.f119819p = perfLogger;
        this.f119820q = conversationUsersNotNullableFieldCacheResolver;
    }

    public final oc.c a(OkHttpClient okHttpClient) {
        oc.b bVar = new oc.b();
        x00.a httpRequestComposer = new x00.a(new qc.d(this.f119806c));
        f10.c httpEngine = new f10.c(new f10.b(okHttpClient));
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter(httpRequestComposer, "httpRequestComposer");
        Intrinsics.checkNotNullParameter(httpEngine, "httpEngine");
        m60.e eVar = this.f119816m;
        ((m60.d) eVar).g();
        f10.d networkTransport = new f10.d(new ed.m(httpRequestComposer, httpEngine, arrayList, true), this.f119819p);
        Intrinsics.checkNotNullParameter(networkTransport, "networkTransport");
        bVar.f93993a = networkTransport;
        m60.d dVar = (m60.d) eVar;
        if (!dVar.f()) {
            dVar.g();
        }
        bVar.b(new d10.h());
        bVar.b(this.f119808e);
        p store = this.f119822s;
        if (store == null) {
            vb0.i normalizedCacheFactory = new vb0.i(this.f119807d);
            Intrinsics.checkNotNullParameter(normalizedCacheFactory, "normalizedCacheFactory");
            f0 cacheKeyGenerator = this.f119817n;
            Intrinsics.checkNotNullParameter(cacheKeyGenerator, "cacheKeyGenerator");
            f0 cacheResolver = this.f119818o;
            Intrinsics.checkNotNullParameter(cacheResolver, "cacheResolver");
            p pVar = new p(new yc.q(normalizedCacheFactory, cacheKeyGenerator, cacheResolver), cacheKeyGenerator);
            Intrinsics.checkNotNullParameter(pVar, "<set-?>");
            this.f119822s = pVar;
            if (this.f119821r == null) {
                ao2.f0 f0Var = this.f119815l.f92751b;
                ho2.c b13 = dl2.b.b(f0Var);
                p pVar2 = this.f119822s;
                if (pVar2 == null) {
                    Intrinsics.r("apolloStore");
                    throw null;
                }
                k kVar = new k(pVar2, this.f119817n, this.f119820q, this.f119814k, f0Var, b13);
                z00.b bVar2 = z00.g.f140525a;
                t repository = this.f119809f;
                Intrinsics.checkNotNullParameter(repository, "repository");
                d dVar2 = new d(repository, "User", z00.g.f140525a, z00.a.f140517n);
                l0 l0Var = k0.f80436a;
                kVar.a(dVar2, l0Var.b(wy0.class));
                z00.b bVar3 = z00.f.f140524a;
                t repository2 = this.f119810g;
                Intrinsics.checkNotNullParameter(repository2, "repository");
                kVar.a(new d(repository2, "Pin", z00.f.f140524a, z00.a.f140516m), l0Var.b(f30.class));
                z00.b bVar4 = z00.c.f140521a;
                t repository3 = this.f119811h;
                Intrinsics.checkNotNullParameter(repository3, "repository");
                kVar.a(new d(repository3, "Board", z00.c.f140521a, z00.a.f140513j), l0Var.b(v7.class));
                z00.b bVar5 = z00.d.f140522a;
                t repository4 = this.f119813j;
                Intrinsics.checkNotNullParameter(repository4, "repository");
                kVar.a(new d(repository4, "BoardSection", z00.d.f140522a, z00.a.f140514k), l0Var.b(ba.class));
                z00.b bVar6 = z00.e.f140523a;
                t repository5 = this.f119812i;
                Intrinsics.checkNotNullParameter(repository5, "repository");
                kVar.a(new d(repository5, "Conversation", z00.e.f140523a, z00.a.f140515l), l0Var.b(ue.class));
                this.f119821r = kVar;
            }
            p pVar3 = this.f119822s;
            if (pVar3 == null) {
                Intrinsics.r("apolloStore");
                throw null;
            }
            k listener = this.f119821r;
            Intrinsics.f(listener);
            Intrinsics.checkNotNullParameter(listener, "listener");
            pVar3.f119871c.add(listener);
            store = this.f119822s;
            if (store == null) {
                Intrinsics.r("apolloStore");
                throw null;
            }
        } else if (store == null) {
            Intrinsics.r("apolloStore");
            throw null;
        }
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(store, "store");
        bVar.b(new x(store));
        bVar.b(r.f125570f);
        bVar.b(new yc.l(store));
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        bVar.a(new c0(false));
        w customScalarType = y0.f26457a.i();
        a10.e customScalarAdapter = v00.a.f123766a;
        Intrinsics.checkNotNullParameter(customScalarType, "customScalarType");
        Intrinsics.checkNotNullParameter(customScalarAdapter, "customScalarAdapter");
        u uVar = bVar.f93995c;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(customScalarType, "customScalarType");
        Intrinsics.checkNotNullParameter(customScalarAdapter, "customScalarAdapter");
        uVar.f99604a.put(customScalarType.f99598g, customScalarAdapter);
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        bVar.a(new c0(true));
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        bVar.a(new vc.a0());
        m60.d dVar3 = (m60.d) eVar;
        if (!dVar3.f()) {
            dVar3.g();
        }
        bVar.f94013u = Boolean.FALSE;
        return bVar.c();
    }
}
