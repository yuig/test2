package ads_mobile_sdk;

import a.l0;
import android.os.Bundle;
import ao2.g0;
import ao2.j0;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class f80 implements a.q6, a.bg, a.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f5080a;

    /* renamed from: b, reason: collision with root package name */
    public final ss2 f5081b;

    /* renamed from: c, reason: collision with root package name */
    public final sb2 f5082c;

    /* renamed from: d, reason: collision with root package name */
    public wi.e f5083d;

    /* renamed from: k, reason: collision with root package name */
    public bj.g f5084k;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayBlockingQueue f5085p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f5086q;

    public f80(j0 backgroundScope, oh0 flags, ss2 traceMetaSet, sb2 rootTraceCreator) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.f5080a = backgroundScope;
        this.f5081b = traceMetaSet;
        this.f5082c = rootTraceCreator;
        this.f5085p = new ArrayBlockingQueue(flags.i());
        this.f5086q = new AtomicBoolean(true);
    }

    public final wi.e a() {
        wi.e eVar;
        synchronized (this) {
            eVar = this.f5083d;
        }
        return eVar;
    }

    public final bj.q b() {
        synchronized (this) {
        }
        return null;
    }

    @Override // a.q6
    public final Unit e(bl2.c cVar) {
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(cVar.getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new a80(this, null), 3);
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Unit g(bl2.c cVar) {
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(cVar.getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new t70(this, null), 3);
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Object l(bl2.c cVar) {
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(cVar.getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new s70(this, null), 3);
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Unit m(bl2.c cVar) {
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(cVar.getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new z70(this, null), 3);
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Object o(bl2.c cVar) {
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(cVar.getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new v70(this, null), 3);
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Object a(wi.o oVar, bl2.c cVar) {
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(cVar.getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new u70(null, this, oVar), 3);
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Unit a(wi.j jVar, bl2.c cVar) {
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(cVar.getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new y70(null, this, jVar), 3);
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Unit a(String str, String str2, bl2.c cVar) {
        if (this.f5086q.get()) {
            if (!this.f5085p.offer(new Pair(str, str2))) {
                gk0.c("The queue for app events is full, dropping the new event.", null);
                sb2 sb2Var = this.f5082c;
                il0 il0Var = il0.CUI_NAME_UNKNOWN;
                kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
                ss2 ss2Var = this.f5081b;
                if (qs2.c() == null) {
                    p12 a13 = sb2.a(sb2Var, il0Var, q0Var, ss2Var);
                    try {
                        ft2.b("App events queue overflow. name: " + str + ", data: " + str2);
                        Object obj = Unit.f80348a;
                        if (obj instanceof jk0) {
                            ft2.a((jk0) obj);
                        }
                        dl2.b.J(a13, null);
                    } catch (Throwable th3) {
                        try {
                            a13.b(th3);
                            if (!(th3 instanceof a.jf)) {
                                a13.a(th3);
                                if (!(th3 instanceof TimeoutCancellationException)) {
                                    if (!(th3 instanceof CancellationException)) {
                                        if (th3 instanceof uk0) {
                                            throw th3;
                                        }
                                        throw new dk0(th3);
                                    }
                                    throw new yj0(th3);
                                }
                                throw new xl0(th3);
                            }
                            throw th3;
                        } finally {
                        }
                    }
                } else {
                    cs2 a14 = qs2.a(il0Var, q0Var, true);
                    try {
                        ft2.b("App events queue overflow. name: " + str + ", data: " + str2);
                        Object obj2 = Unit.f80348a;
                        if (obj2 instanceof jk0) {
                            ft2.a((jk0) obj2);
                        }
                        dl2.b.J(a14, null);
                    } catch (Throwable th4) {
                        try {
                            a14.b(th4);
                            if (!(th4 instanceof a.jf)) {
                                a14.a(th4);
                                if (!(th4 instanceof TimeoutCancellationException)) {
                                    if (!(th4 instanceof CancellationException)) {
                                        if (th4 instanceof uk0) {
                                            throw th4;
                                        }
                                        throw new dk0(th4);
                                    }
                                    throw new yj0(th4);
                                }
                                throw new xl0(th4);
                            }
                            throw th4;
                        } finally {
                        }
                    }
                }
            }
            return Unit.f80348a;
        }
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(cVar.getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new b80(null, this, str, str2), 3);
        return Unit.f80348a;
    }

    @Override // a.q6
    public final Unit a(String str, bl2.c cVar) {
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(cVar.getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new d80(null, this, str), 3);
        return Unit.f80348a;
    }

    @Override // a.bg
    public final Unit a(cj.a aVar, bl2.c cVar) {
        l0 l0Var = cm0.f3958f;
        kotlin.jvm.internal.j.z(dl2.b.b(cVar.getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new e80(null, this, aVar), 3);
        return Unit.f80348a;
    }

    public final void a(wi.e eVar) {
        synchronized (this) {
            this.f5083d = eVar;
            Unit unit = Unit.f80348a;
        }
    }

    public final void a(vi.b bVar) {
        synchronized (this) {
            a((wi.e) bVar);
            a((wi.u) bVar);
            Unit unit = Unit.f80348a;
        }
    }

    public final void a(wi.u uVar) {
        synchronized (this) {
            Unit unit = Unit.f80348a;
        }
        j0 j0Var = this.f5080a;
        c80 block = new c80(this, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    @Override // a.a0
    public final Object a(Bundle bundle, bl2.c cVar) {
        Object O = dl2.b.O(new x70(this, null), cVar);
        return O == cl2.a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }
}
