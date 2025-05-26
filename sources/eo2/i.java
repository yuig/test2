package eo2;

import ao2.o1;

/* loaded from: classes4.dex */
public final class i implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f59776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mo2.e f59777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ co2.z f59778c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f59779d;

    public i(o1 o1Var, mo2.i iVar, co2.z zVar, o0 o0Var) {
        this.f59776a = o1Var;
        this.f59777b = iVar;
        this.f59778c = zVar;
        this.f59779d = o0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x007b, code lost:
    
        r2.n(kotlin.Unit.f80348a, r7.f87821b);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // do2.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(do2.i r6, bl2.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof eo2.h
            if (r0 == 0) goto L13
            r0 = r7
            eo2.h r0 = (eo2.h) r0
            int r1 = r0.f59773v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59773v = r1
            goto L18
        L13:
            eo2.h r0 = new eo2.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f59771t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f59773v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            do2.i r6 = r0.f59770s
            eo2.i r0 = r0.f59769r
            ue.c.H(r7)
            goto La5
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            ue.c.H(r7)
            ao2.o1 r7 = r5.f59776a
            if (r7 == 0) goto L47
            boolean r2 = r7.isActive()
            if (r2 == 0) goto L42
            goto L47
        L42:
            java.util.concurrent.CancellationException r6 = r7.getCancellationException()
            throw r6
        L47:
            r0.f59769r = r5
            r0.f59770s = r6
            r0.f59773v = r3
            mo2.e r7 = r5.f59777b
            mo2.h r7 = (mo2.h) r7
            r7.getClass()
        L54:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = mo2.h.f87819g
            int r2 = r2.getAndDecrement(r7)
            int r3 = r7.f87820a
            if (r2 > r3) goto L54
            if (r2 <= 0) goto L63
            kotlin.Unit r7 = kotlin.Unit.f80348a
            goto La1
        L63:
            bl2.c r2 = cl2.h.b(r0)
            ao2.o r2 = lb.l0.x0(r2)
            boolean r4 = r7.a(r2)     // Catch: java.lang.Throwable -> L8a
            if (r4 != 0) goto L8c
        L71:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = mo2.h.f87819g     // Catch: java.lang.Throwable -> L8a
            int r4 = r4.getAndDecrement(r7)     // Catch: java.lang.Throwable -> L8a
            if (r4 > r3) goto L71
            if (r4 <= 0) goto L83
            kotlin.Unit r3 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L8a
            co2.b r7 = r7.f87821b     // Catch: java.lang.Throwable -> L8a
            r2.n(r3, r7)     // Catch: java.lang.Throwable -> L8a
            goto L8c
        L83:
            boolean r4 = r7.a(r2)     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L71
            goto L8c
        L8a:
            r6 = move-exception
            goto Lb8
        L8c:
            java.lang.Object r7 = r2.u()
            if (r7 != r1) goto L97
            java.lang.String r2 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
        L97:
            if (r7 != r1) goto L9a
            goto L9c
        L9a:
            kotlin.Unit r7 = kotlin.Unit.f80348a
        L9c:
            if (r7 != r1) goto L9f
            goto La1
        L9f:
            kotlin.Unit r7 = kotlin.Unit.f80348a
        La1:
            if (r7 != r1) goto La4
            return r1
        La4:
            r0 = r5
        La5:
            co2.z r7 = r0.f59778c
            eo2.g r1 = new eo2.g
            mo2.e r2 = r0.f59777b
            eo2.o0 r0 = r0.f59779d
            r3 = 0
            r1.<init>(r6, r0, r2, r3)
            r6 = 3
            kotlin.jvm.internal.j.z(r7, r3, r3, r1, r6)
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        Lb8:
            r2.C()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eo2.i.emit(do2.i, bl2.c):java.lang.Object");
    }
}
