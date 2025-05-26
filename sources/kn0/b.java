package kn0;

import android.content.Context;
import i92.k;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import jk2.g2;
import jk2.u0;
import jk2.x;
import jk2.z1;
import k1.p;
import kk2.m;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import tk2.e;
import uj2.b0;
import uj2.q;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final long f80215f = TimeUnit.MILLISECONDS.convert(5, TimeUnit.MINUTES);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f80216g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f80217a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public e12.c f80218b;

    /* renamed from: c, reason: collision with root package name */
    public Context f80219c;

    /* renamed from: d, reason: collision with root package name */
    public w f80220d;

    /* renamed from: e, reason: collision with root package name */
    public k f80221e;

    public final void a(d params) {
        q qVar;
        Intrinsics.checkNotNullParameter(params, "params");
        HashMap hashMap = this.f80217a;
        int i13 = 1;
        if (!hashMap.containsKey(params) || hashMap.get(params) == null) {
            long convert = TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
            e12.c cVar = this.f80218b;
            if (cVar == null) {
                Intrinsics.r("boardOrganizationService");
                throw null;
            }
            int i14 = 2;
            m k13 = ((b0) new hj0.a(cVar).prepare(params.f80226a).buildRequest()).r(e.f118017c).l(wj2.c.a()).k(new qk0.b(i14, a.f80213k));
            Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
            g2 g2Var = new g2(new z1(new u0(k13.u(), new qk0.b(3, a.f80212j), i14)), new bv0.k(i14, new p(this, convert, 5)), i13);
            Intrinsics.checkNotNullExpressionValue(g2Var, "takeUntil(...)");
            x xVar = new x(g2Var, new fp.a(7, this, params), i13);
            hashMap.put(params, new Pair(Long.valueOf(convert), xVar));
            qVar = xVar;
        } else {
            Object obj = hashMap.get(params);
            Intrinsics.f(obj);
            qVar = (q) ((Pair) obj).f80347b;
        }
        qVar.d(new ek0.c(i13, params, this));
    }
}
