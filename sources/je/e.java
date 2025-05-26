package je;

/* loaded from: classes3.dex */
public final class e extends g.i {
    public e(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int M(int i13) {
        if (i13 >= 48 && i13 <= 57) {
            return i13 - 48;
        }
        if (i13 >= 65 && i13 <= 70) {
            return i13 - 55;
        }
        if (i13 < 97 || i13 > 102) {
            return -1;
        }
        return i13 - 87;
    }

    public final String N() {
        int M;
        if (s()) {
            return null;
        }
        char charAt = ((String) this.f63180c).charAt(this.f63178a);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        this.f63178a++;
        int intValue = y().intValue();
        while (intValue != -1 && intValue != charAt) {
            if (intValue == 92) {
                intValue = y().intValue();
                if (intValue != -1) {
                    if (intValue == 10 || intValue == 13 || intValue == 12) {
                        intValue = y().intValue();
                    } else {
                        int M2 = M(intValue);
                        if (M2 != -1) {
                            for (int i13 = 1; i13 <= 5 && (M = M((intValue = y().intValue()))) != -1; i13++) {
                                M2 = (M2 * 16) + M;
                            }
                            sb3.append((char) M2);
                        }
                    }
                }
            }
            sb3.append((char) intValue);
            intValue = y().intValue();
        }
        return sb3.toString();
    }

    public final String O() {
        int i13;
        int i14;
        if (s()) {
            i14 = this.f63178a;
        } else {
            int i15 = this.f63178a;
            int charAt = ((String) this.f63180c).charAt(i15);
            if (charAt == 45) {
                charAt = j();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i13 = i15;
            } else {
                int j13 = j();
                while (true) {
                    if ((j13 < 65 || j13 > 90) && ((j13 < 97 || j13 > 122) && !((j13 >= 48 && j13 <= 57) || j13 == 45 || j13 == 95))) {
                        break;
                    }
                    j13 = j();
                }
                i13 = this.f63178a;
            }
            this.f63178a = i15;
            i14 = i13;
        }
        int i16 = this.f63178a;
        if (i14 == i16) {
            return null;
        }
        String substring = ((String) this.f63180c).substring(i16, i14);
        this.f63178a = i14;
        return substring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x046f, code lost:
    
        r2 = r4.f75728a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0471, code lost:
    
        if (r2 == null) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0477, code lost:
    
        if (r2.isEmpty() == false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x047a, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x047d, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x038c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x046d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v12, types: [je.d] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [je.f] */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v10, types: [je.q] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [je.q] */
    /* JADX WARN: Type inference failed for: r9v13, types: [je.q] */
    /* JADX WARN: Type inference failed for: r9v14, types: [je.q] */
    /* JADX WARN: Type inference failed for: r9v15, types: [je.q] */
    /* JADX WARN: Type inference failed for: r9v19, types: [je.q] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [je.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList P() {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: je.e.P():java.util.ArrayList");
    }
}
