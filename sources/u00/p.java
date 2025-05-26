package u00;

import do2.b2;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import pc.n0;
import pc.o0;
import pc.v;
import yc.q;

/* loaded from: classes.dex */
public final class p implements vc.a {

    /* renamed from: a, reason: collision with root package name */
    public final vc.a f119869a;

    /* renamed from: b, reason: collision with root package name */
    public final wc.d f119870b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f119871c;

    public p(q delegate, f0 cacheKeyGenerator) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(cacheKeyGenerator, "cacheKeyGenerator");
        this.f119869a = delegate;
        this.f119870b = cacheKeyGenerator;
        this.f119871c = new LinkedHashSet();
    }

    @Override // vc.a
    public final Object a(UUID uuid, bl2.c cVar) {
        return this.f119869a.a(uuid, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // vc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(pc.v r14, pc.n0 r15, pc.o0 r16, wc.a r17, bl2.c r18) {
        /*
            r13 = this;
            r7 = r13
            r0 = r18
            boolean r1 = r0 instanceof u00.n
            if (r1 == 0) goto L17
            r1 = r0
            u00.n r1 = (u00.n) r1
            int r2 = r1.f119863v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f119863v = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            u00.n r1 = new u00.n
            r1.<init>(r13, r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.f119861t
            cl2.a r9 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r8.f119863v
            r10 = 2
            r11 = 1
            if (r1 == 0) goto L45
            if (r1 == r11) goto L3b
            if (r1 != r10) goto L33
            java.lang.Object r1 = r8.f119859r
            java.util.Set r1 = (java.util.Set) r1
            ue.c.H(r0)
            goto L79
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            boolean r1 = r8.f119860s
            java.lang.Object r2 = r8.f119859r
            u00.p r2 = (u00.p) r2
            ue.c.H(r0)
            goto L67
        L45:
            ue.c.H(r0)
            u00.o r12 = new u00.o
            r6 = 0
            r0 = r12
            r1 = r16
            r2 = r15
            r3 = r14
            r4 = r13
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f119859r = r7
            r1 = 0
            r8.f119860s = r1
            r8.f119863v = r11
            vc.a r0 = r7.f119869a
            java.lang.Object r0 = r0.f(r12, r8)
            if (r0 != r9) goto L66
            return r9
        L66:
            r2 = r7
        L67:
            java.util.Set r0 = (java.util.Set) r0
            if (r1 == 0) goto L7a
            r8.f119859r = r0
            r8.f119863v = r10
            vc.a r1 = r2.f119869a
            java.lang.Object r1 = r1.e(r0, r8)
            if (r1 != r9) goto L78
            return r9
        L78:
            r1 = r0
        L79:
            r0 = r1
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u00.p.b(pc.v, pc.n0, pc.o0, wc.a, bl2.c):java.lang.Object");
    }

    @Override // vc.a
    public final Map c(o0 operation, n0 data, v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        return this.f119869a.c(operation, data, customScalarAdapters);
    }

    @Override // vc.a
    public final Object d(o0 o0Var, v vVar, wc.a aVar, yc.g gVar) {
        return this.f119869a.d(o0Var, vVar, aVar, gVar);
    }

    @Override // vc.a
    public final Object e(Set set, bl2.c cVar) {
        return this.f119869a.e(set, cVar);
    }

    @Override // vc.a
    public final Object f(Function1 function1, bl2.c cVar) {
        return this.f119869a.f(function1, cVar);
    }

    @Override // vc.a
    public final b2 g() {
        return this.f119869a.g();
    }
}
