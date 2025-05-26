package xl2;

import dm2.c0;
import dm2.i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pn2.h0;

/* loaded from: classes2.dex */
public final class i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f135272b;

    public /* synthetic */ i(Object obj, int i13) {
        this.f135271a = i13;
        this.f135272b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (am2.s.c(am2.s.f15585m, r5, r2) == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean b(am2.d r5) {
        /*
            r4 = this;
            int r0 = r4.f135271a
            r1 = 1
            java.lang.Object r2 = r4.f135272b
            r3 = 0
            switch(r0) {
                case 3: goto L2c;
                default: goto L9;
            }
        L9:
            am2.q r0 = r5.getVisibility()
            boolean r0 = am2.s.e(r0)
            if (r0 != 0) goto L26
            am2.g r2 = (am2.g) r2
            if (r2 == 0) goto L20
            vb0.i r0 = am2.s.f15585m
            am2.p r5 = am2.s.c(r0, r5, r2)
            if (r5 != 0) goto L26
            goto L27
        L20:
            r5 = 3
            am2.s.a(r5)
            r5 = 0
            throw r5
        L26:
            r1 = r3
        L27:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L2c:
            am2.m r5 = r5.g()
            am2.m r2 = (am2.m) r2
            if (r5 != r2) goto L35
            goto L36
        L35:
            r1 = r3
        L36:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xl2.i.b(am2.d):java.lang.Boolean");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f135271a;
        Object obj2 = this.f135272b;
        switch (i13) {
            case 0:
                ym2.g gVar = (ym2.g) obj;
                i0 k13 = ((l) obj2).k();
                ym2.c cVar = r.f135332l;
                in2.j jVar = ((c0) k13.H(cVar)).f55405g;
                if (jVar == null) {
                    l.a(11);
                    throw null;
                }
                am2.j e13 = jVar.e(gVar, hm2.e.FROM_BUILTINS);
                if (e13 == null) {
                    throw new AssertionError("Built-in class " + cVar.c(gVar) + " is not found");
                }
                if (e13 instanceof am2.g) {
                    return (am2.g) e13;
                }
                throw new AssertionError("Must be a class descriptor " + gVar + ", but was " + e13);
            case 1:
                dm2.a aVar = (dm2.a) obj2;
                dm2.b descriptor = aVar.f55384b;
                ((qn2.h) ((qn2.i) obj)).getClass();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return (h0) aVar.f55384b.f55389b.invoke();
            case 2:
                am2.d dVar = (am2.d) obj;
                if (dVar == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                }
                ((jm2.a) obj2).f77042a.c(dVar);
                return Unit.f80348a;
            case 3:
                return b((am2.d) obj);
            case 4:
                return b((am2.d) obj);
            default:
                xk2.q qVar = xk2.s.f135225b;
                Unit unit = Unit.f80348a;
                ((ao2.m) obj2).resumeWith(unit);
                return unit;
        }
    }
}
