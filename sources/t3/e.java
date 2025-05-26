package t3;

/* loaded from: classes2.dex */
public final class e extends a {

    /* renamed from: c, reason: collision with root package name */
    public static e f115947c;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        return null;
     */
    @Override // t3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] a(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.d()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lc
            return r1
        Lc:
            if (r5 < r0) goto Lf
            return r1
        Lf:
            if (r5 >= 0) goto L12
            r5 = 0
        L12:
            if (r5 >= r0) goto L29
            java.lang.String r2 = r4.d()
            char r2 = r2.charAt(r5)
            r3 = 10
            if (r2 != r3) goto L29
            boolean r2 = r4.g(r5)
            if (r2 != 0) goto L29
            int r5 = r5 + 1
            goto L12
        L29:
            if (r5 < r0) goto L2c
            return r1
        L2c:
            int r1 = r5 + 1
        L2e:
            if (r1 >= r0) goto L39
            boolean r2 = r4.f(r1)
            if (r2 != 0) goto L39
            int r1 = r1 + 1
            goto L2e
        L39:
            int[] r5 = r4.c(r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.e.a(int):int[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        return null;
     */
    @Override // t3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] b(int r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.d()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lc
            return r1
        Lc:
            if (r4 > 0) goto Lf
            return r1
        Lf:
            if (r4 <= r0) goto L12
            r4 = r0
        L12:
            if (r4 <= 0) goto L2b
            java.lang.String r0 = r3.d()
            int r2 = r4 + (-1)
            char r0 = r0.charAt(r2)
            r2 = 10
            if (r0 != r2) goto L2b
            boolean r0 = r3.f(r4)
            if (r0 != 0) goto L2b
            int r4 = r4 + (-1)
            goto L12
        L2b:
            if (r4 > 0) goto L2e
            return r1
        L2e:
            int r0 = r4 + (-1)
        L30:
            if (r0 <= 0) goto L3b
            boolean r1 = r3.g(r0)
            if (r1 != 0) goto L3b
            int r0 = r0 + (-1)
            goto L30
        L3b:
            int[] r4 = r3.c(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.e.b(int):int[]");
    }

    public final boolean f(int i13) {
        return i13 > 0 && d().charAt(i13 + (-1)) != '\n' && (i13 == d().length() || d().charAt(i13) == '\n');
    }

    public final boolean g(int i13) {
        return d().charAt(i13) != '\n' && (i13 == 0 || d().charAt(i13 - 1) == '\n');
    }
}
