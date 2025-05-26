package qm;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes3.dex */
public final class d0 implements nm.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final TypeToken f104140a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f104141b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f104142c;

    /* renamed from: d, reason: collision with root package name */
    public final nm.w f104143d;

    /* renamed from: e, reason: collision with root package name */
    public final nm.r f104144e;

    public d0(Object obj, TypeToken typeToken, boolean z13) {
        nm.w wVar = obj instanceof nm.w ? (nm.w) obj : null;
        this.f104143d = wVar;
        nm.r rVar = obj instanceof nm.r ? (nm.r) obj : null;
        this.f104144e = rVar;
        pk.a0.A((wVar == null && rVar == null) ? false : true);
        this.f104140a = typeToken;
        this.f104141b = z13;
        this.f104142c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r8.f104142c.isAssignableFrom(r10.f33846a) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r0.f33847b != r10.f33846a) goto L14;
     */
    @Override // nm.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final nm.i0 a(nm.o r9, com.google.gson.reflect.TypeToken r10) {
        /*
            r8 = this;
            com.google.gson.reflect.TypeToken r0 = r8.f104140a
            if (r0 == 0) goto L15
            boolean r1 = r0.equals(r10)
            if (r1 != 0) goto L1f
            boolean r1 = r8.f104141b
            if (r1 == 0) goto L2e
            java.lang.reflect.Type r0 = r0.f33847b
            java.lang.Class r1 = r10.f33846a
            if (r0 != r1) goto L2e
            goto L1f
        L15:
            java.lang.Class r0 = r10.f33846a
            java.lang.Class r1 = r8.f104142c
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L2e
        L1f:
            qm.e0 r0 = new qm.e0
            r7 = 1
            nm.w r2 = r8.f104143d
            nm.r r3 = r8.f104144e
            r1 = r0
            r4 = r9
            r5 = r10
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.d0.a(nm.o, com.google.gson.reflect.TypeToken):nm.i0");
    }
}
