package b4;

/* loaded from: classes3.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f21592a = kh2.w.Q(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f21593b = kh2.w.Q(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f21594c = b3.w.f21389m;

    /* renamed from: d, reason: collision with root package name */
    public static final m4.o f21595d;

    static {
        long j13 = b3.w.f21378b;
        f21595d = j13 != 16 ? new m4.c(j13) : m4.m.f85803a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0060, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r26, r19.f21577c) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0066, code lost:
    
        if (r29 != r19.f21580f) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0078, code lost:
    
        if (n4.m.a(r31, r19.f21582h) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (n4.m.a(r24, r19.f21576b) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x004c, code lost:
    
        if (b3.w.c(r20, r19.f21575a.b()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0056, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r27, r19.f21578d) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final b4.g0 a(b4.g0 r19, long r20, b3.s r22, float r23, long r24, g4.l r26, g4.j r27, g4.k r28, g4.e r29, java.lang.String r30, long r31, m4.a r33, m4.p r34, i4.c r35, long r36, m4.k r38, b3.w0 r39, b4.y r40, d3.i r41) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.h0.a(b4.g0, long, b3.s, float, long, g4.l, g4.j, g4.k, g4.e, java.lang.String, long, m4.a, m4.p, i4.c, long, m4.k, b3.w0, b4.y, d3.i):b4.g0");
    }

    public static final Object b(float f13, Object obj, Object obj2) {
        return ((double) f13) < 0.5d ? obj : obj2;
    }

    public static final long c(long j13, long j14, float f13) {
        if (kh2.w.k0(j13) || kh2.w.k0(j14)) {
            return ((n4.m) b(f13, new n4.m(j13), new n4.m(j14))).f89190a;
        }
        if (kh2.w.k0(j13) || kh2.w.k0(j14)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (n4.n.a(n4.m.b(j13), n4.m.b(j14))) {
            return kh2.w.r0(1095216660480L & j13, tb.f.U(n4.m.c(j13), n4.m.c(j14), f13));
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) n4.n.b(n4.m.b(j13))) + " and " + ((Object) n4.n.b(n4.m.b(j14)))).toString());
    }
}
