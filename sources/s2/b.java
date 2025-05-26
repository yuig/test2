package s2;

import i1.g1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b extends c {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(int r5, s2.n r6) {
        /*
            r4 = this;
            java.lang.Object r0 = s2.p.f110667b
            monitor-enter(r0)
            java.util.List r1 = s2.p.f110673h     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = kotlin.collections.CollectionsKt.u0(r1)     // Catch: java.lang.Throwable -> L14
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L16
            i1.y r2 = new i1.y     // Catch: java.lang.Throwable -> L14
            r3 = 1
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r5 = move-exception
            goto L1c
        L16:
            monitor-exit(r0)
            r0 = 0
            r4.<init>(r5, r6, r0, r2)
            return
        L1c:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.b.<init>(int, s2.n):void");
    }

    @Override // s2.c
    public final c D(Function1 function1, Function1 function12) {
        return (c) ((i) p.f(new g1(3, new a(function1, function12, 0))));
    }

    @Override // s2.c, s2.i
    public final void c() {
        synchronized (p.f110667b) {
            int i13 = this.f110645d;
            if (i13 >= 0) {
                p.u(i13);
                this.f110645d = -1;
            }
            Unit unit = Unit.f80348a;
        }
    }

    @Override // s2.c, s2.i
    public final void k() {
        kg.p.f0();
        throw null;
    }

    @Override // s2.c, s2.i
    public final void l() {
        kg.p.f0();
        throw null;
    }

    @Override // s2.c, s2.i
    public final void m() {
        p.a();
    }

    @Override // s2.c, s2.i
    public final i t(Function1 function1) {
        return (i) p.f(new g1(3, new g1(2, function1)));
    }

    @Override // s2.c
    public final bs1.c w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }
}
