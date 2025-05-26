package o5;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f92887e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f92888a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92889b;

    /* renamed from: c, reason: collision with root package name */
    public int f92890c;

    /* renamed from: d, reason: collision with root package name */
    public char f92891d;

    static {
        for (int i13 = 0; i13 < 1792; i13++) {
            f92887e[i13] = Character.getDirectionality(i13);
        }
    }

    public b(CharSequence charSequence) {
        this.f92888a = charSequence;
        this.f92889b = charSequence.length();
    }

    public final byte a() {
        int i13 = this.f92890c - 1;
        CharSequence charSequence = this.f92888a;
        char charAt = charSequence.charAt(i13);
        this.f92891d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f92890c);
            this.f92890c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f92890c--;
        char c13 = this.f92891d;
        return c13 < 1792 ? f92887e[c13] : Character.getDirectionality(c13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0069, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006b, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006c, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0071, code lost:
    
        if (r9.f92890c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0077, code lost:
    
        switch(a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007b, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007e, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0081, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0080, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0084, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0086, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0087, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b() {
        /*
            r9 = this;
            r0 = 0
            r9.f92890c = r0
            r1 = r0
            r2 = r1
            r3 = r2
        L6:
            int r4 = r9.f92890c
            int r5 = r9.f92889b
            r6 = 1
            r7 = -1
            if (r4 >= r5) goto L69
            if (r1 != 0) goto L69
            java.lang.CharSequence r5 = r9.f92888a
            char r4 = r5.charAt(r4)
            r9.f92891d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L32
            int r4 = r9.f92890c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r9.f92890c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r9.f92890c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L46
        L32:
            int r4 = r9.f92890c
            int r4 = r4 + r6
            r9.f92890c = r4
            char r4 = r9.f92891d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L42
            byte[] r5 = o5.b.f92887e
            r4 = r5[r4]
            goto L46
        L42:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L46:
            if (r4 == 0) goto L64
            if (r4 == r6) goto L61
            r5 = 2
            if (r4 == r5) goto L61
            r5 = 9
            if (r4 == r5) goto L6
            switch(r4) {
                case 14: goto L5d;
                case 15: goto L5d;
                case 16: goto L59;
                case 17: goto L59;
                case 18: goto L55;
                default: goto L54;
            }
        L54:
            goto L67
        L55:
            int r3 = r3 + (-1)
            r2 = r0
            goto L6
        L59:
            int r3 = r3 + 1
            r2 = r6
            goto L6
        L5d:
            int r3 = r3 + 1
            r2 = r7
            goto L6
        L61:
            if (r3 != 0) goto L67
            return r6
        L64:
            if (r3 != 0) goto L67
            return r7
        L67:
            r1 = r3
            goto L6
        L69:
            if (r1 != 0) goto L6c
            return r0
        L6c:
            if (r2 == 0) goto L6f
            return r2
        L6f:
            int r2 = r9.f92890c
            if (r2 <= 0) goto L87
            byte r2 = r9.a()
            switch(r2) {
                case 14: goto L84;
                case 15: goto L84;
                case 16: goto L7e;
                case 17: goto L7e;
                case 18: goto L7b;
                default: goto L7a;
            }
        L7a:
            goto L6f
        L7b:
            int r3 = r3 + 1
            goto L6f
        L7e:
            if (r1 != r3) goto L81
            return r6
        L81:
            int r3 = r3 + (-1)
            goto L6f
        L84:
            if (r1 != r3) goto L81
            return r7
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.b.b():int");
    }

    public final int c() {
        this.f92890c = this.f92889b;
        int i13 = 0;
        while (true) {
            int i14 = i13;
            while (this.f92890c > 0) {
                byte a13 = a();
                if (a13 != 0) {
                    if (a13 == 1 || a13 == 2) {
                        if (i13 == 0) {
                            return 1;
                        }
                        if (i14 == 0) {
                            break;
                        }
                    } else if (a13 != 9) {
                        switch (a13) {
                            case 14:
                            case 15:
                                if (i14 == i13) {
                                    return -1;
                                }
                                i13--;
                                break;
                            case 16:
                            case 17:
                                if (i14 == i13) {
                                    return 1;
                                }
                                i13--;
                                break;
                            case 18:
                                i13++;
                                break;
                            default:
                                if (i14 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i13 == 0) {
                        return -1;
                    }
                    if (i14 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }
}
