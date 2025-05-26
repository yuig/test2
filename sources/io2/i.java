package io2;

import co2.p;
import co2.q;
import co2.y;
import co2.z;
import eo2.o0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends eo2.f {

    /* renamed from: d, reason: collision with root package name */
    public final xp2.a f73345d;

    public /* synthetic */ i(uj2.h hVar) {
        this(hVar, kotlin.coroutines.j.f80412a, -2, co2.a.SUSPEND);
    }

    @Override // eo2.f, do2.i
    public final Object collect(do2.j jVar, bl2.c cVar) {
        CoroutineContext context = cVar.getContext();
        bl2.d dVar = kotlin.coroutines.f.Ho;
        CoroutineContext coroutineContext = this.f59758a;
        kotlin.coroutines.f fVar = (kotlin.coroutines.f) coroutineContext.get(dVar);
        if (fVar == null || Intrinsics.d(fVar, context.get(dVar))) {
            context.plus(coroutineContext);
            Object h10 = h(cVar, jVar);
            return h10 == cl2.a.COROUTINE_SUSPENDED ? h10 : Unit.f80348a;
        }
        Object O = dl2.b.O(new h(jVar, this, null), cVar);
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (O != aVar) {
            O = Unit.f80348a;
        }
        return O == aVar ? O : Unit.f80348a;
    }

    @Override // eo2.f
    public final Object d(z zVar, bl2.c cVar) {
        zVar.getCoroutineContext();
        Object h10 = h(cVar, new o0((y) zVar));
        return h10 == cl2.a.COROUTINE_SUSPENDED ? h10 : Unit.f80348a;
    }

    @Override // eo2.f
    public final eo2.f e(CoroutineContext coroutineContext, int i13, co2.a aVar) {
        return new i(this.f73345d, coroutineContext, i13, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:12:0x0037, B:14:0x00b3, B:16:0x00bf, B:18:0x00c3, B:19:0x00cb, B:20:0x00ce, B:24:0x0073, B:35:0x009b, B:41:0x0050), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #0 {all -> 0x003d, blocks: (B:12:0x0037, B:14:0x00b3, B:16:0x00bf, B:18:0x00c3, B:19:0x00cb, B:20:0x00ce, B:24:0x0073, B:35:0x009b, B:41:0x0050), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v8, types: [io2.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b0 -> B:13:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(bl2.c r20, do2.j r21) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io2.i.h(bl2.c, do2.j):java.lang.Object");
    }

    public final long i() {
        if (this.f59760c != co2.a.SUSPEND) {
            return Long.MAX_VALUE;
        }
        int i13 = this.f59759b;
        if (i13 == -2) {
            q.Dn.getClass();
            return p.f28345b;
        }
        if (i13 == 0) {
            return 1L;
        }
        if (i13 == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j13 = i13;
        if (j13 >= 1) {
            return j13;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public i(xp2.a aVar, CoroutineContext coroutineContext, int i13, co2.a aVar2) {
        super(coroutineContext, i13, aVar2);
        this.f73345d = aVar;
    }
}
