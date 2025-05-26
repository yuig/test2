package yc;

import androidx.activity.a0;
import do2.b2;
import do2.f2;
import do2.g2;
import do2.z1;
import i2.j2;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m60.f0;
import pc.n0;
import pc.o0;

/* loaded from: classes.dex */
public final class q implements vc.a {

    /* renamed from: a, reason: collision with root package name */
    public final wc.d f138658a;

    /* renamed from: b, reason: collision with root package name */
    public final wc.e f138659b;

    /* renamed from: c, reason: collision with root package name */
    public final f2 f138660c;

    /* renamed from: d, reason: collision with root package name */
    public final z1 f138661d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f138662e;

    /* renamed from: f, reason: collision with root package name */
    public final h1.b f138663f;

    public q(vb0.i normalizedCacheFactory, f0 cacheKeyGenerator, f0 cacheResolver) {
        Intrinsics.checkNotNullParameter(normalizedCacheFactory, "normalizedCacheFactory");
        Intrinsics.checkNotNullParameter(cacheKeyGenerator, "cacheKeyGenerator");
        Intrinsics.checkNotNullParameter(cacheResolver, "cacheResolver");
        this.f138658a = cacheKeyGenerator;
        this.f138659b = cacheResolver;
        f2 b13 = g2.b(0, 10, co2.a.DROP_OLDEST, 1);
        this.f138660c = b13;
        this.f138661d = new z1(b13);
        this.f138662e = xk2.m.b(new a0(normalizedCacheFactory, 27));
        this.f138663f = new h1.b(26);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // vc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.UUID r5, bl2.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof yc.n
            if (r0 == 0) goto L13
            r0 = r6
            yc.n r0 = (yc.n) r0
            int r1 = r0.f138649t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138649t = r1
            goto L18
        L13:
            yc.n r0 = new yc.n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f138647r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r0.f138649t
            if (r1 == 0) goto L33
            r5 = 1
            if (r1 != r5) goto L2b
            r5 = 0
            r0.getClass()
            ue.c.H(r6)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ue.c.H(r6)
            h1.b r6 = r4.f138663f
            k1.v0 r0 = new k1.v0
            r1 = 23
            r0.<init>(r1, r4, r5)
            java.lang.Object r5 = r6.m(r0)
            java.util.Set r5 = (java.util.Set) r5
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.q.a(java.util.UUID, bl2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // vc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(pc.v r9, pc.n0 r10, pc.o0 r11, wc.a r12, bl2.c r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof yc.o
            if (r0 == 0) goto L14
            r0 = r13
            yc.o r0 = (yc.o) r0
            int r1 = r0.f138652t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f138652t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            yc.o r0 = new yc.o
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f138650r
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r6.f138652t
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            ue.c.H(r13)
            goto L43
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            ue.c.H(r13)
            r6.f138652t = r2
            r7 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.io.Serializable r13 = r1.h(r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L43
            return r0
        L43:
            kotlin.Pair r13 = (kotlin.Pair) r13
            java.lang.Object r9 = r13.f80347b
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.q.b(pc.v, pc.n0, pc.o0, wc.a, bl2.c):java.lang.Object");
    }

    @Override // vc.a
    public final Map c(o0 operation, n0 data, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        return l0.N0(operation, data, customScalarAdapters, this.f138658a);
    }

    @Override // vc.a
    public final Object d(o0 o0Var, pc.v vVar, wc.a aVar, g gVar) {
        h1.b bVar = this.f138663f;
        m block = new m(o0Var, vVar, this, aVar);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(block, "block");
        ReentrantReadWriteLock.ReadLock readLock = ((ReentrantReadWriteLock) bVar.f66449b).readLock();
        readLock.lock();
        try {
            return block.invoke();
        } finally {
            readLock.unlock();
        }
    }

    @Override // vc.a
    public final Object e(Set set, bl2.c cVar) {
        Object emit;
        return (!set.isEmpty() && (emit = this.f138660c.emit(set, cVar)) == cl2.a.COROUTINE_SUSPENDED) ? emit : Unit.f80348a;
    }

    @Override // vc.a
    public final Object f(Function1 function1, bl2.c cVar) {
        return this.f138663f.m(new j2(4, function1, this));
    }

    @Override // vc.a
    public final b2 g() {
        return this.f138661d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable h(pc.v r14, pc.n0 r15, pc.o0 r16, wc.a r17, bl2.c r18, boolean r19) {
        /*
            r13 = this;
            r7 = r13
            r0 = r18
            boolean r1 = r0 instanceof yc.p
            if (r1 == 0) goto L17
            r1 = r0
            yc.p r1 = (yc.p) r1
            int r2 = r1.f138657v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f138657v = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            yc.p r1 = new yc.p
            r1.<init>(r13, r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.f138655t
            cl2.a r9 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r8.f138657v
            r10 = 1
            if (r1 == 0) goto L3c
            if (r1 != r10) goto L34
            java.util.Set r1 = r8.f138654s
            java.util.Set r1 = (java.util.Set) r1
            java.util.Map r2 = r8.f138653r
            java.util.Map r2 = (java.util.Map) r2
            ue.c.H(r0)
            goto L74
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            ue.c.H(r0)
            h1.b r11 = r7.f138663f
            q4.h r12 = new q4.h
            r6 = 1
            r0 = r12
            r1 = r16
            r2 = r15
            r3 = r14
            r4 = r13
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r11.m(r12)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.f80346a
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r0 = r0.f80347b
            r1 = r0
            java.util.Set r1 = (java.util.Set) r1
            if (r19 == 0) goto L74
            r0 = r2
            java.util.Map r0 = (java.util.Map) r0
            r8.f138653r = r0
            r0 = r1
            java.util.Set r0 = (java.util.Set) r0
            r8.f138654s = r0
            r8.f138657v = r10
            java.lang.Object r0 = r13.e(r1, r8)
            if (r0 != r9) goto L74
            return r9
        L74:
            java.util.Collection r0 = r2.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = kotlin.collections.CollectionsKt.J0(r0)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.q.h(pc.v, pc.n0, pc.o0, wc.a, bl2.c, boolean):java.io.Serializable");
    }
}
