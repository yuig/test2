package bn2;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f23587b = new n(m.OVERRIDABLE, "SUCCESS");

    /* renamed from: a, reason: collision with root package name */
    public final m f23588a;

    public n(m mVar, String str) {
        if (mVar != null) {
            this.f23588a = mVar;
        } else {
            a(3);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r10) {
        /*
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            if (r10 == r3) goto Lf
            if (r10 == r2) goto Lf
            if (r10 == r1) goto Lf
            if (r10 == r0) goto Lf
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
            goto L11
        Lf:
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
        L11:
            if (r10 == r3) goto L1b
            if (r10 == r2) goto L1b
            if (r10 == r1) goto L1b
            if (r10 == r0) goto L1b
            r5 = r2
            goto L1c
        L1b:
            r5 = r1
        L1c:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "success"
            java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
            r8 = 0
            if (r10 == r3) goto L32
            if (r10 == r2) goto L32
            if (r10 == r1) goto L2f
            if (r10 == r0) goto L32
            r5[r8] = r7
            goto L36
        L2f:
            r5[r8] = r6
            goto L36
        L32:
            java.lang.String r9 = "debugMessage"
            r5[r8] = r9
        L36:
            switch(r10) {
                case 1: goto L46;
                case 2: goto L46;
                case 3: goto L46;
                case 4: goto L46;
                case 5: goto L41;
                case 6: goto L3c;
                default: goto L39;
            }
        L39:
            r5[r3] = r6
            goto L48
        L3c:
            java.lang.String r6 = "getDebugMessage"
            r5[r3] = r6
            goto L48
        L41:
            java.lang.String r6 = "getResult"
            r5[r3] = r6
            goto L48
        L46:
            r5[r3] = r7
        L48:
            if (r10 == r3) goto L5b
            if (r10 == r2) goto L56
            if (r10 == r1) goto L51
            if (r10 == r0) goto L51
            goto L5f
        L51:
            java.lang.String r6 = "<init>"
            r5[r2] = r6
            goto L5f
        L56:
            java.lang.String r6 = "conflict"
            r5[r2] = r6
            goto L5f
        L5b:
            java.lang.String r6 = "incompatible"
            r5[r2] = r6
        L5f:
            java.lang.String r4 = java.lang.String.format(r4, r5)
            if (r10 == r3) goto L71
            if (r10 == r2) goto L71
            if (r10 == r1) goto L71
            if (r10 == r0) goto L71
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r4)
            goto L76
        L71:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r4)
        L76:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.n.a(int):void");
    }

    public static n b(String str) {
        return new n(m.CONFLICT, str);
    }

    public static n d(String str) {
        return new n(m.INCOMPATIBLE, str);
    }

    public final m c() {
        m mVar = this.f23588a;
        if (mVar != null) {
            return mVar;
        }
        a(5);
        throw null;
    }
}
