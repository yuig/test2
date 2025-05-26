package io2;

import co2.m;
import co2.s;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes4.dex */
public final class l implements xp2.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f73350a;

    /* renamed from: b, reason: collision with root package name */
    public xp2.c f73351b;

    /* renamed from: c, reason: collision with root package name */
    public final m f73352c;

    public l(int i13, co2.a aVar, long j13) {
        this.f73350a = j13;
        this.f73352c = l0.b(i13 == 0 ? 1 : i13, aVar, 4);
    }

    @Override // xp2.b
    public final void a() {
        this.f73352c.r(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io2.k
            if (r0 == 0) goto L13
            r0 = r5
            io2.k r0 = (io2.k) r0
            int r1 = r0.f73349t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73349t = r1
            goto L18
        L13:
            io2.k r0 = new io2.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f73347r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f73349t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ue.c.H(r5)
            co2.t r5 = (co2.t) r5
            java.lang.Object r5 = r5.f28348a
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            ue.c.H(r5)
            r0.f73349t = r3
            co2.m r5 = r4.f73352c
            r5.getClass()
            java.lang.Object r5 = co2.m.N(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.Throwable r0 = co2.t.a(r5)
            if (r0 != 0) goto L53
            boolean r0 = r5 instanceof co2.s
            if (r0 == 0) goto L52
            co2.t.a(r5)
            r5 = 0
        L52:
            return r5
        L53:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io2.l.b(bl2.c):java.lang.Object");
    }

    @Override // xp2.b
    public final void c(Object obj) {
        m mVar = this.f73352c;
        if (!(mVar.g(obj) instanceof s)) {
            return;
        }
        throw new IllegalArgumentException(("Element " + obj + " was not added to channel because it was full, " + mVar).toString());
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        this.f73351b = cVar;
        if (cVar != null) {
            cVar.request(this.f73350a);
        } else {
            Intrinsics.r("subscription");
            throw null;
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        this.f73352c.u(false, th3);
    }
}
