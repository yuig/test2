package uq0;

import bv0.k;
import ck2.i;
import com.pinterest.api.model.Feed;
import dl1.p;
import dl1.r;
import dl1.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import jk2.a0;
import jk2.h0;
import jk2.i2;
import jk2.j1;
import jk2.x;
import kotlin.jvm.internal.Intrinsics;
import lb.u0;
import m60.g0;
import uj2.q;
import x02.a2;
import x02.t1;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final p f123051a;

    /* renamed from: b, reason: collision with root package name */
    public final b f123052b;

    /* renamed from: c, reason: collision with root package name */
    public final z f123053c;

    /* renamed from: d, reason: collision with root package name */
    public final gl1.d f123054d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f123055e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f123056f;

    /* renamed from: g, reason: collision with root package name */
    public final r f123057g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(p localDataSource, b remoteDataSource, z persistencePolicy, g0 pageSizeProvider) {
        this(localDataSource, remoteDataSource, persistencePolicy, pageSizeProvider, 0);
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
    }

    public static void d(String... keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        if (keys.length < 1) {
            throw new IllegalStateException("UserFeedRequestParams requires at least 1 String parameter(s)".toString());
        }
    }

    public final void a() {
        this.f123057g.f55284a.evictAll();
    }

    public abstract t1 b(String[] strArr, int i13);

    public abstract t1 c(int i13, String str);

    public final q e(t1 params) {
        q u13;
        Intrinsics.checkNotNullParameter(params, "params");
        int i13 = 1;
        int i14 = 0;
        if (params.f55251a) {
            ol1.d dVar = new ol1.d(new d(this, params, i13), 3);
            Intrinsics.checkNotNullExpressionValue(dVar, "defer(...)");
            u13 = new j1(dVar, new qk0.b(26, new f(this, params, i14)), i13);
            Intrinsics.checkNotNullExpressionValue(u13, "publish(...)");
        } else {
            jk2.g0 s13 = g(params, true).s();
            Intrinsics.checkNotNullExpressionValue(s13, "firstOrError(...)");
            u13 = s13.u();
        }
        q i15 = u13.i(new b22.f(i14, new e(this.f123054d, 0)));
        Intrinsics.checkNotNullExpressionValue(i15, "compose(...)");
        return i15;
    }

    public final q f(String[] keys, int i13) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        return e(b((String[]) Arrays.copyOf(keys, keys.length), i13));
    }

    public final q g(t1 t1Var, boolean z13) {
        ArrayList arrayList = new ArrayList();
        dl1.a aVar = dl1.a.READ;
        z zVar = this.f123053c;
        boolean b13 = zVar.b(t1Var, aVar);
        ck2.c cVar = i.f27923c;
        a2 a2Var = i.f27924d;
        int i13 = 1;
        boolean z14 = true;
        boolean z15 = true;
        boolean z16 = true;
        boolean z17 = true;
        if (b13) {
            r rVar = this.f123057g;
            rVar.getClass();
            int i14 = 0;
            i2 i2Var = new i2(new j1(new x(new a0(new ol1.d(new u0(6, rVar, t1Var), 3), new c(i14, new f(this, t1Var, i13)), a2Var, cVar), new k(12, g.f123048j), 2), new qk0.b(25, g.f123049k), i14), new ol1.d(new d(this, t1Var, i14), 3), i14);
            Intrinsics.checkNotNullExpressionValue(i2Var, "let(...)");
            arrayList.add(i2Var);
        }
        if (zVar.a(t1Var, aVar)) {
            a0 a0Var = new a0(this.f123051a.b(t1Var).i(new b22.f(z16 ? 1 : 0, new r1.f(z17 ? 1 : 0, this, 16))), new c(z15 ? 1 : 0, new go0.r(this, t1Var, t1Var, 8)), a2Var, cVar);
            Intrinsics.checkNotNullExpressionValue(a0Var, "let(...)");
            arrayList.add(a0Var);
        }
        if (z13) {
            ol1.d dVar = new ol1.d(new d(this, t1Var, z14 ? 1 : 0), 3);
            Intrinsics.checkNotNullExpressionValue(dVar, "defer(...)");
            arrayList.add(dVar);
        }
        q k13 = q.k(arrayList);
        Intrinsics.checkNotNullExpressionValue(k13, "concat(...)");
        return k13;
    }

    public final q h(int i13, Feed feed) {
        Intrinsics.checkNotNullParameter(feed, "feed");
        String str = feed.f35558j;
        if (str != null && !kotlin.text.z.j(str)) {
            qb0.e eVar = qb0.d.f103396a;
            String a13 = qb0.e.a(str);
            g0 g0Var = this.f123055e;
            if (Intrinsics.d(g0Var.d(), a13)) {
                str = qb0.e.f(str, "page_size", g0Var.e());
            } else if (Intrinsics.d(g0Var.e(), a13)) {
                str = qb0.e.f(str, "page_size", g0Var.c());
            }
            feed.f35558j = str;
        }
        String s13 = feed.s();
        if (s13 != null && !kotlin.text.z.j(s13)) {
            return e(c(i13, s13));
        }
        h0 h0Var = h0.f76488a;
        Intrinsics.checkNotNullExpressionValue(h0Var, "empty(...)");
        return h0Var;
    }

    public h(p localDataSource, b remoteDataSource, z persistencePolicy, g0 pageSizeProvider, int i13) {
        gl1.f schedulerPolicy = gl1.f.f65748a;
        HashMap requestObservableMap = new HashMap();
        r memoryCache = new r();
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(schedulerPolicy, "schedulerPolicy");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(requestObservableMap, "requestObservableMap");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f123051a = localDataSource;
        this.f123052b = remoteDataSource;
        this.f123053c = persistencePolicy;
        this.f123054d = schedulerPolicy;
        this.f123055e = pageSizeProvider;
        this.f123056f = requestObservableMap;
        this.f123057g = memoryCache;
    }
}
