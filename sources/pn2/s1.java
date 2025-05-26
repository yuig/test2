package pn2;

/* loaded from: classes2.dex */
public final class s1 extends s {

    /* renamed from: b, reason: collision with root package name */
    public final String f100838b;

    public s1(String str) {
        this.f100838b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void I0(int r9) {
        /*
            r0 = 4
            r1 = 1
            if (r9 == r1) goto L9
            if (r9 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            r3 = 3
            r4 = 2
            if (r9 == r1) goto L13
            if (r9 == r0) goto L13
            r5 = r3
            goto L14
        L13:
            r5 = r4
        L14:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
            r7 = 0
            if (r9 == r1) goto L30
            if (r9 == r4) goto L2b
            if (r9 == r3) goto L26
            if (r9 == r0) goto L30
            java.lang.String r8 = "newAttributes"
            r5[r7] = r8
            goto L32
        L26:
            java.lang.String r8 = "kotlinTypeRefiner"
            r5[r7] = r8
            goto L32
        L2b:
            java.lang.String r8 = "delegate"
            r5[r7] = r8
            goto L32
        L30:
            r5[r7] = r6
        L32:
            java.lang.String r7 = "refine"
            if (r9 == r1) goto L3e
            if (r9 == r0) goto L3b
            r5[r1] = r6
            goto L43
        L3b:
            r5[r1] = r7
            goto L43
        L3e:
            java.lang.String r6 = "toString"
            r5[r1] = r6
        L43:
            if (r9 == r1) goto L57
            if (r9 == r4) goto L53
            if (r9 == r3) goto L50
            if (r9 == r0) goto L57
            java.lang.String r3 = "replaceAttributes"
            r5[r4] = r3
            goto L57
        L50:
            r5[r4] = r7
            goto L57
        L53:
            java.lang.String r3 = "replaceDelegate"
            r5[r4] = r3
        L57:
            java.lang.String r2 = java.lang.String.format(r2, r5)
            if (r9 == r1) goto L65
            if (r9 == r0) goto L65
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L6a
        L65:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L6a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pn2.s1.I0(int):void");
    }

    @Override // pn2.h0, pn2.v1
    public final /* bridge */ /* synthetic */ v1 A0(boolean z13) {
        A0(z13);
        throw null;
    }

    @Override // pn2.s, pn2.v1
    /* renamed from: B0 */
    public final v1 y0(qn2.i iVar) {
        if (iVar != null) {
            return this;
        }
        I0(3);
        throw null;
    }

    @Override // pn2.h0, pn2.v1
    public final /* bridge */ /* synthetic */ v1 C0(u0 u0Var) {
        C0(u0Var);
        throw null;
    }

    @Override // pn2.h0
    /* renamed from: D0 */
    public final h0 A0(boolean z13) {
        throw new IllegalStateException(this.f100838b);
    }

    @Override // pn2.h0
    /* renamed from: E0 */
    public final h0 C0(u0 u0Var) {
        if (u0Var != null) {
            throw new IllegalStateException(this.f100838b);
        }
        I0(0);
        throw null;
    }

    @Override // pn2.s
    public final h0 F0() {
        throw new IllegalStateException(this.f100838b);
    }

    @Override // pn2.s
    /* renamed from: G0 */
    public final h0 y0(qn2.i iVar) {
        if (iVar != null) {
            return this;
        }
        I0(3);
        throw null;
    }

    @Override // pn2.s
    public final s H0(h0 h0Var) {
        throw new IllegalStateException(this.f100838b);
    }

    @Override // pn2.h0
    public final String toString() {
        String str = this.f100838b;
        if (str != null) {
            return str;
        }
        I0(1);
        throw null;
    }

    @Override // pn2.s, pn2.b0
    public final b0 y0(qn2.i iVar) {
        if (iVar != null) {
            return this;
        }
        I0(3);
        throw null;
    }
}
