package rz;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import df.j1;
import f00.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import lh0.d3;
import m60.f0;
import m60.w;
import pq2.d1;
import pq2.i;
import pq2.j;
import pq2.k;
import pq2.k1;
import t00.m;
import t00.n;
import tb0.p;

/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: a, reason: collision with root package name */
    public final j f110222a;

    /* renamed from: b, reason: collision with root package name */
    public final n f110223b;

    /* renamed from: c, reason: collision with root package name */
    public final w f110224c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f110225d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f110226e;

    /* renamed from: f, reason: collision with root package name */
    public final d3 f110227f;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f110228g;

    public c(j jVar, n onFailureRouterFactory, w eventManager, AtomicBoolean allowRetries, boolean z13, d3 d3Var, int i13) {
        jVar = (i13 & 1) != 0 ? null : jVar;
        Intrinsics.checkNotNullParameter(onFailureRouterFactory, "onFailureRouterFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(allowRetries, "allowRetries");
        f0 devUtils = vb0.j.f125466a;
        Intrinsics.checkNotNullParameter(devUtils, "devUtils");
        this.f110222a = jVar;
        this.f110223b = onFailureRouterFactory;
        this.f110224c = eventManager;
        this.f110225d = allowRetries;
        this.f110226e = z13;
        this.f110227f = d3Var;
        this.f110228g = devUtils;
    }

    public static c b(c cVar, n nVar, AtomicBoolean atomicBoolean, boolean z13, int i13) {
        j jVar = cVar.f110222a;
        if ((i13 & 2) != 0) {
            nVar = cVar.f110223b;
        }
        n onFailureRouterFactory = nVar;
        w eventManager = cVar.f110224c;
        if ((i13 & 8) != 0) {
            atomicBoolean = cVar.f110225d;
        }
        AtomicBoolean allowRetries = atomicBoolean;
        if ((i13 & 16) != 0) {
            z13 = cVar.f110226e;
        }
        d3 d3Var = cVar.f110227f;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(onFailureRouterFactory, "onFailureRouterFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(allowRetries, "allowRetries");
        return new c(jVar, onFailureRouterFactory, eventManager, allowRetries, z13, d3Var, 64);
    }

    public static boolean c(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation instanceof a) {
                return true;
            }
        }
        return false;
    }

    @Override // pq2.j
    public final k a(Type returnType, Annotation[] annotations, d1 retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        j jVar = this.f110222a;
        if (jVar != null) {
            return jVar.a(returnType, annotations, retrofit);
        }
        m a13 = this.f110223b.a(this.f110226e);
        Class g13 = k1.g(returnType);
        boolean z13 = returnType instanceof ParameterizedType;
        xz.j jVar2 = null;
        Type f13 = z13 ? k1.f(0, (ParameterizedType) returnType) : null;
        w wVar = this.f110224c;
        AtomicBoolean atomicBoolean = this.f110225d;
        if (f13 != null && Intrinsics.d(k1.g(f13), NetworkResponse.class)) {
            Type f14 = k1.f(0, (ParameterizedType) f13);
            Intrinsics.checkNotNullExpressionValue(f14, "getParameterUpperBound(...)");
            return new xz.e(j1.w1(f14), a13, wVar, atomicBoolean.get());
        }
        if (!z13 || !Intrinsics.d(g13, i.class)) {
            k a14 = new qq2.e().a(returnType, annotations, retrofit);
            if (a14 == null) {
                return null;
            }
            return new g((qq2.d) a14, a13, wVar, atomicBoolean.get());
        }
        if (c(annotations)) {
            Intrinsics.f(f13);
            jVar2 = new xz.j(j1.w1(f13), a13, wVar, atomicBoolean.get());
        } else {
            this.f110228g.F("BaseApiCallAdapterFactory requires that we consume a parameterized type. Please us an Rx stream or NetworkResponse for your type. If you really need to make this call this way, please use: @AllowCall", p.PLATFORM, new Object[0]);
        }
        return jVar2;
    }

    public final void d() {
        this.f110225d.set(false);
    }
}
