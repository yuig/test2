package i2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f71355a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f71356b = new e1();

    public x1(i1 i1Var) {
        this.f71355a = i1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009d A[PHI: r8
      0x009d: PHI (r8v9 java.lang.Object) = (r8v8 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x009a, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // i2.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.jvm.functions.Function1 r7, bl2.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof i2.w1
            if (r0 == 0) goto L13
            r0 = r8
            i2.w1 r0 = (i2.w1) r0
            int r1 = r0.f71339v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71339v = r1
            goto L18
        L13:
            i2.w1 r0 = new i2.w1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f71337t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f71339v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            ue.c.H(r8)
            goto L9d
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.jvm.functions.Function1 r7 = r0.f71336s
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            i2.x1 r2 = r0.f71335r
            ue.c.H(r8)
            goto L8d
        L3d:
            ue.c.H(r8)
            i2.e1 r8 = r6.f71356b
            r0.f71335r = r6
            r2 = r7
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r0.f71336s = r2
            r0.f71339v = r4
            java.lang.Object r2 = r8.f71101a
            monitor-enter(r2)
            boolean r5 = r8.f71104d     // Catch: java.lang.Throwable -> La1
            monitor-exit(r2)
            if (r5 == 0) goto L56
            kotlin.Unit r8 = kotlin.Unit.f80348a
            goto L89
        L56:
            ao2.o r2 = new ao2.o
            bl2.c r5 = cl2.h.b(r0)
            r2.<init>(r4, r5)
            r2.v()
            java.lang.Object r4 = i2.e1.b(r8)
            monitor-enter(r4)
            java.util.List r5 = i2.e1.a(r8)     // Catch: java.lang.Throwable -> L9e
            r5.add(r2)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r4)
            j1.x0 r4 = new j1.x0
            r5 = 18
            r4.<init>(r5, r8, r2)
            r2.e(r4)
            java.lang.Object r8 = r2.u()
            if (r8 != r1) goto L84
            java.lang.String r2 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
        L84:
            if (r8 != r1) goto L87
            goto L89
        L87:
            kotlin.Unit r8 = kotlin.Unit.f80348a
        L89:
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r2 = r6
        L8d:
            i2.i1 r8 = r2.f71355a
            r2 = 0
            r0.f71335r = r2
            r0.f71336s = r2
            r0.f71339v = r3
            java.lang.Object r8 = r8.d(r7, r0)
            if (r8 != r1) goto L9d
            return r1
        L9d:
            return r8
        L9e:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        La1:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.x1.d(kotlin.jvm.functions.Function1, bl2.c):java.lang.Object");
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return kotlin.coroutines.g.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.h hVar) {
        return kotlin.coroutines.g.b(this, hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.h hVar) {
        return kotlin.coroutines.g.c(this, hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.g.d(coroutineContext, this);
    }
}
