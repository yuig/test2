package ao2;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class t2 extends ho2.u {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f20212e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t2(bl2.c r3, kotlin.coroutines.CoroutineContext r4) {
        /*
            r2 = this;
            ao2.u2 r0 = ao2.u2.f20218a
            kotlin.coroutines.CoroutineContext$Element r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.CoroutineContext r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f20212e = r0
            kotlin.coroutines.CoroutineContext r3 = r3.getContext()
            bl2.d r0 = kotlin.coroutines.f.Ho
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r0)
            boolean r3 = r3 instanceof ao2.f0
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = ho2.y.c(r4, r3)
            ho2.y.a(r4, r3)
            r2.h0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ao2.t2.<init>(bl2.c, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean g0() {
        boolean z13 = this.threadLocalIsSet && this.f20212e.get() == null;
        this.f20212e.remove();
        return !z13;
    }

    public final void h0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f20212e.set(new Pair(coroutineContext, obj));
    }

    @Override // ho2.u, ao2.a2
    public final void u(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f20212e.get();
            if (pair != null) {
                ho2.y.a((CoroutineContext) pair.f80346a, pair.f80347b);
            }
            this.f20212e.remove();
        }
        Object J1 = bs1.c.J1(obj);
        bl2.c cVar = this.f69787d;
        CoroutineContext context = cVar.getContext();
        Object c13 = ho2.y.c(context, null);
        t2 d2 = c13 != ho2.y.f69792a ? d0.d(cVar, context, c13) : null;
        try {
            this.f69787d.resumeWith(J1);
            Unit unit = Unit.f80348a;
        } finally {
            if (d2 == null || d2.g0()) {
                ho2.y.a(context, c13);
            }
        }
    }
}
