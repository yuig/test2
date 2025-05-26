package oe2;

import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class m0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f94363a;

    /* renamed from: b, reason: collision with root package name */
    public final r f94364b;

    /* renamed from: c, reason: collision with root package name */
    public final r f94365c;

    /* renamed from: d, reason: collision with root package name */
    public final r f94366d;

    /* renamed from: e, reason: collision with root package name */
    public final r f94367e;

    /* renamed from: f, reason: collision with root package name */
    public final r f94368f;

    public m0(h0 h0Var) {
        this.f94363a = h0Var;
        this.f94364b = h0Var.a(List.class);
        this.f94365c = h0Var.a(Map.class);
        this.f94366d = h0Var.a(String.class);
        this.f94367e = h0Var.a(Double.class);
        this.f94368f = h0Var.a(Boolean.class);
    }

    @Override // oe2.r
    public final Object a(v vVar) {
        switch (k0.f94353a[vVar.g().ordinal()]) {
            case 1:
                return this.f94364b.a(vVar);
            case 2:
                return this.f94365c.a(vVar);
            case 3:
                return this.f94366d.a(vVar);
            case 4:
                return this.f94367e.a(vVar);
            case 5:
                return this.f94368f.a(vVar);
            case 6:
                vVar.B1();
                return null;
            default:
                throw new IllegalStateException("Expected a value but was " + vVar.g() + " at path " + vVar.f());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r1.isAssignableFrom(r0) != false) goto L7;
     */
    @Override // oe2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(oe2.y r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Lf
            r5.c()
            r5.d()
            goto L2e
        Lf:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L19
        L17:
            r0 = r1
            goto L22
        L19:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L22
            goto L17
        L22:
            java.util.Set r1 = pe2.b.f99998a
            r2 = 0
            oe2.h0 r3 = r4.f94363a
            oe2.r r0 = r3.c(r0, r1, r2)
            r0.d(r5, r6)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oe2.m0.d(oe2.y, java.lang.Object):void");
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
