package co2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes2.dex */
public final class w extends m {

    /* renamed from: m, reason: collision with root package name */
    public final a f28355m;

    public w(int i13, a aVar, Function1 function1) {
        super(i13, function1);
        this.f28355m = aVar;
        if (aVar != a.SUSPEND) {
            if (i13 < 1) {
                throw new IllegalArgumentException(a.a.e("Buffered channel capacity must be at least 1, but ", i13, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + k0.f80436a.b(m.class).f() + " instead").toString());
        }
    }

    @Override // co2.m
    public final boolean I() {
        return this.f28355m == a.DROP_OLDEST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        r3 = kg.t.s(r4, r3, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z(java.lang.Object r3, boolean r4) {
        /*
            r2 = this;
            java.lang.Object r0 = super.g(r3)
            boolean r1 = r0 instanceof co2.s
            r1 = r1 ^ 1
            if (r1 != 0) goto L20
            boolean r1 = r0 instanceof co2.r
            if (r1 == 0) goto Lf
            goto L20
        Lf:
            if (r4 == 0) goto L1d
            kotlin.jvm.functions.Function1 r4 = r2.f28322b
            if (r4 == 0) goto L1d
            kotlinx.coroutines.internal.UndeliveredElementException r3 = kg.t.t(r4, r3)
            if (r3 != 0) goto L1c
            goto L1d
        L1c:
            throw r3
        L1d:
            kotlin.Unit r3 = kotlin.Unit.f80348a
            return r3
        L20:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.w.Z(java.lang.Object, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return kotlin.Unit.f80348a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a0(java.lang.Object r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.w.a0(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // co2.m, co2.c0
    public final Object g(Object obj) {
        return a0(obj, false);
    }

    @Override // co2.m, co2.c0
    public final Object o(Object obj, bl2.c cVar) {
        UndeliveredElementException s13;
        Object a03 = a0(obj, true);
        if (!(a03 instanceof r)) {
            return Unit.f80348a;
        }
        t.a(a03);
        Function1 function1 = this.f28322b;
        if (function1 == null || (s13 = kg.t.s(function1, obj, null)) == null) {
            throw C();
        }
        xk2.f.a(s13, C());
        throw s13;
    }
}
