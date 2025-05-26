package xo0;

import com.pinterest.api.model.xk;
import h32.f1;
import h32.g0;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f135611a;

    /* renamed from: b, reason: collision with root package name */
    public final pb0.a f135612b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f135613c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f135614d;

    /* renamed from: e, reason: collision with root package name */
    public final int f135615e;

    /* renamed from: f, reason: collision with root package name */
    public final String f135616f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f135617g;

    public o(d0 pinalytics, pb0.g clock, g0 g0Var, HashMap hashMap, int i13) {
        g0Var = (i13 & 4) != 0 ? null : g0Var;
        hashMap = (i13 & 8) != 0 ? null : hashMap;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f135611a = pinalytics;
        this.f135612b = clock;
        this.f135613c = g0Var;
        this.f135614d = hashMap;
        this.f135615e = 0;
        this.f135616f = null;
        this.f135617g = new HashMap();
    }

    public final void a(xk bubble) {
        h32.q qVar;
        Intrinsics.checkNotNullParameter(bubble, "bubble");
        HashMap hashMap = this.f135617g;
        if (hashMap.isEmpty() || (qVar = (h32.q) hashMap.get(bubble)) == null) {
            return;
        }
        Long valueOf = Long.valueOf(((pb0.g) this.f135612b).a());
        qVar.getClass();
        List b13 = e0.b(new h32.r(qVar.f67182a, null, null, qVar.f67183b, valueOf, null, qVar.f67184c, null, qVar.f67185d, qVar.f67186e, null, null, null, qVar.f67187f));
        this.f135611a.q(this.f135613c, f1.ARTICLE_IMPRESSION_ONE_PIXEL, this.f135614d, CollectionsKt.H0(b13));
    }

    public final void b(int i13, xk bubble) {
        Intrinsics.checkNotNullParameter(bubble, "bubble");
        HashMap hashMap = this.f135617g;
        h32.q qVar = (h32.q) hashMap.get(bubble);
        if (qVar == null) {
            qVar = new h32.q();
            qVar.f67182a = bubble.getId();
            String str = this.f135616f;
            if (str == null) {
                str = bubble.getId();
            }
            qVar.f67186e = str;
            qVar.f67187f = bubble.j();
            qVar.f67185d = Short.valueOf((short) this.f135615e);
            qVar.f67184c = Short.valueOf((short) i13);
            hashMap.put(bubble, qVar);
        }
        qVar.f67183b = Long.valueOf(((pb0.g) this.f135612b).a());
    }
}
