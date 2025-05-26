package hq2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.math.BigInteger;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
public final class g extends o6.d {

    /* renamed from: e, reason: collision with root package name */
    public int f69951e;

    /* renamed from: f, reason: collision with root package name */
    public int f69952f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f69953g;

    /* renamed from: h, reason: collision with root package name */
    public m f69954h;

    public g(int i13, m mVar, int[] iArr) {
        super(2);
        this.f69952f = i13;
        this.f69951e = iArr.length != 1 ? 3 : 2;
        this.f69953g = iArr;
        this.f69954h = mVar;
    }

    public static void x(o6.d dVar, o6.d dVar2) {
        if (!(dVar instanceof g) || !(dVar2 instanceof g)) {
            throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
        }
        g gVar = (g) dVar;
        g gVar2 = (g) dVar2;
        if (gVar.f69951e != gVar2.f69951e) {
            throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
        }
        if (gVar.f69952f != gVar2.f69952f || !r.j(gVar.f69953g, gVar2.f69953g)) {
            throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
        }
    }

    @Override // o6.d
    public final o6.d a(o6.d dVar) {
        m mVar = (m) this.f69954h.clone();
        mVar.c(((g) dVar).f69954h);
        return new g(this.f69952f, mVar, this.f69953g);
    }

    @Override // o6.d
    public final o6.d b() {
        m mVar;
        m mVar2 = this.f69954h;
        if (mVar2.f69969a.length == 0) {
            mVar = new m(new long[]{1});
        } else {
            int max = Math.max(1, mVar2.n());
            long[] jArr = new long[max];
            long[] jArr2 = mVar2.f69969a;
            System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, max));
            jArr[0] = 1 ^ jArr[0];
            mVar = new m(jArr);
        }
        return new g(this.f69952f, mVar, this.f69953g);
    }

    @Override // o6.d
    public final int c() {
        return this.f69954h.i();
    }

    @Override // o6.d
    public final o6.d d(o6.d dVar) {
        return n(dVar.k());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f69952f == gVar.f69952f && this.f69951e == gVar.f69951e && r.j(this.f69953g, gVar.f69953g) && this.f69954h.equals(gVar.f69954h);
    }

    @Override // o6.d
    public final int h() {
        return this.f69952f;
    }

    public final int hashCode() {
        int i13;
        int hashCode = this.f69954h.hashCode() ^ this.f69952f;
        int[] iArr = this.f69953g;
        if (iArr == null) {
            i13 = 0;
        } else {
            int length = iArr.length;
            int i14 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i14 = (i14 * RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER) ^ iArr[length];
            }
            i13 = i14;
        }
        return hashCode ^ i13;
    }

    @Override // o6.d
    public final o6.d k() {
        int i13;
        m mVar = this.f69954h;
        int i14 = mVar.i();
        if (i14 == 0) {
            throw new IllegalStateException();
        }
        int i15 = this.f69952f;
        int[] iArr = this.f69953g;
        int i16 = 1;
        if (i14 != 1) {
            m mVar2 = (m) mVar.clone();
            int i17 = (i15 + 63) >>> 6;
            m mVar3 = new m(i17);
            long[] jArr = mVar3.f69969a;
            m.k(jArr, i15);
            int i18 = i15 - i15;
            int length = iArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                m.k(jArr, iArr[length] + i18);
            }
            m.k(jArr, i18);
            m mVar4 = new m(i17);
            mVar4.f69969a[0] = 1;
            m mVar5 = new m(i17);
            int[] iArr2 = {i14, i15 + 1};
            m[] mVarArr = {mVar2, mVar3};
            int[] iArr3 = {1, 0};
            m[] mVarArr2 = {mVar4, mVar5};
            int i19 = iArr2[1];
            int i23 = iArr3[1];
            int i24 = i19 - iArr2[0];
            while (true) {
                if (i24 < 0) {
                    i24 = -i24;
                    iArr2[i16] = i19;
                    iArr3[i16] = i23;
                    i16 = 1 - i16;
                    i19 = iArr2[i16];
                    i23 = iArr3[i16];
                }
                i13 = 1 - i16;
                mVarArr[i16].b(mVarArr[i13], iArr2[i13], i24);
                int j13 = mVarArr[i16].j(i19);
                if (j13 == 0) {
                    break;
                }
                int i25 = iArr3[i13];
                mVarArr2[i16].b(mVarArr2[i13], i25, i24);
                int i26 = i25 + i24;
                if (i26 > i23) {
                    i23 = i26;
                } else if (i26 == i23) {
                    i23 = mVarArr2[i16].j(i23);
                }
                i24 += j13 - i19;
                i19 = j13;
            }
            mVar = mVarArr2[i13];
        }
        return new g(i15, mVar, iArr);
    }

    @Override // o6.d
    public final boolean l() {
        return this.f69954h.p();
    }

    @Override // o6.d
    public final boolean m() {
        for (long j13 : this.f69954h.f69969a) {
            if (j13 != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // o6.d
    public final o6.d n(o6.d dVar) {
        int i13;
        int i14;
        long[] jArr;
        int i15;
        int[] iArr;
        int i16;
        m mVar = ((g) dVar).f69954h;
        m mVar2 = this.f69954h;
        int i17 = mVar2.i();
        int i18 = this.f69952f;
        int[] iArr2 = this.f69953g;
        if (i17 != 0) {
            int i19 = mVar.i();
            if (i19 != 0) {
                if (i17 > i19) {
                    mVar2 = mVar;
                    mVar = mVar2;
                    i19 = i17;
                    i17 = i19;
                }
                int i23 = (i17 + 63) >>> 6;
                int i24 = (i19 + 63) >>> 6;
                int i25 = ((i17 + i19) + 62) >>> 6;
                if (i23 == 1) {
                    long j13 = mVar2.f69969a[0];
                    if (j13 != 1) {
                        long[] jArr2 = new long[i25];
                        m.r(j13, mVar.f69969a, i24, jArr2);
                        mVar = new m(jArr2, m.s(jArr2, i25, i18, iArr2));
                    }
                } else {
                    int i26 = (i19 + 70) >>> 6;
                    int i27 = 16;
                    int[] iArr3 = new int[16];
                    int i28 = i26 << 4;
                    long[] jArr3 = new long[i28];
                    iArr3[1] = i26;
                    System.arraycopy(mVar.f69969a, 0, jArr3, i26, i24);
                    int i29 = 2;
                    int i33 = i26;
                    while (i29 < i27) {
                        i33 += i26;
                        iArr3[i29] = i33;
                        if ((i29 & 1) == 0) {
                            jArr = jArr3;
                            i15 = i28;
                            iArr = iArr3;
                            i16 = i27;
                            m.t(jArr3, i33 >>> 1, jArr, i33, i26, 1);
                        } else {
                            jArr = jArr3;
                            i15 = i28;
                            iArr = iArr3;
                            i16 = i27;
                            int i34 = i33 - i26;
                            for (int i35 = 0; i35 < i26; i35++) {
                                jArr[i33 + i35] = jArr[i26 + i35] ^ jArr[i34 + i35];
                            }
                        }
                        i29++;
                        i28 = i15;
                        iArr3 = iArr;
                        i27 = i16;
                        jArr3 = jArr;
                    }
                    long[] jArr4 = jArr3;
                    int i36 = i28;
                    int[] iArr4 = iArr3;
                    long[] jArr5 = new long[i36];
                    m.t(jArr4, 0, jArr5, 0, i36, 4);
                    long[] jArr6 = mVar2.f69969a;
                    int i37 = i25 << 3;
                    long[] jArr7 = new long[i37];
                    int i38 = 0;
                    while (i38 < i23) {
                        long j14 = jArr6[i38];
                        int i39 = i38;
                        while (true) {
                            i13 = i23;
                            i14 = i37;
                            int i43 = iArr4[((int) j14) & 15];
                            int i44 = iArr4[((int) (j14 >>> 4)) & 15];
                            for (int i45 = 0; i45 < i26; i45++) {
                                int i46 = i39 + i45;
                                jArr7[i46] = jArr7[i46] ^ (jArr4[i43 + i45] ^ jArr5[i44 + i45]);
                            }
                            j14 >>>= 8;
                            if (j14 == 0) {
                                break;
                            }
                            i39 += i25;
                            i23 = i13;
                            i37 = i14;
                        }
                        i38++;
                        i23 = i13;
                        i37 = i14;
                    }
                    while (true) {
                        i37 -= i25;
                        if (i37 == 0) {
                            break;
                        }
                        m.g(jArr7, i37 - i25, jArr7, i37, i25, 8);
                        jArr7 = jArr7;
                    }
                    long[] jArr8 = jArr7;
                    mVar2 = new m(jArr8, m.s(jArr8, i25, i18, iArr2));
                }
            }
            return new g(i18, mVar, iArr2);
        }
        mVar = mVar2;
        return new g(i18, mVar, iArr2);
    }

    @Override // o6.d
    public final o6.d o(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        return p(dVar, dVar2, dVar3);
    }

    @Override // o6.d
    public final o6.d p(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        m mVar = ((g) dVar).f69954h;
        m mVar2 = ((g) dVar2).f69954h;
        m mVar3 = ((g) dVar3).f69954h;
        m mVar4 = this.f69954h;
        int i13 = this.f69952f;
        int[] iArr = this.f69953g;
        m q13 = mVar4.q(mVar);
        m q14 = mVar2.q(mVar3);
        if (q13 == mVar4 || q13 == mVar) {
            q13 = (m) q13.clone();
        }
        q13.c(q14);
        long[] jArr = q13.f69969a;
        int s13 = m.s(jArr, jArr.length, i13, iArr);
        if (s13 < jArr.length) {
            long[] jArr2 = new long[s13];
            q13.f69969a = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, s13);
        }
        return new g(i13, q13, iArr);
    }

    @Override // o6.d
    public final o6.d q() {
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 int, still in use, count: 3, list:
          (r1v2 int) from 0x002b: ARITH (r1v2 int) + (63 int) A[WRAPPED]
          (r1v2 int) from 0x005b: INVOKE (r6v5 int) = (r8v2 long[]), (r4v4 int), (r1v2 int), (r7v0 int[]) STATIC call: hq2.m.s(long[], int, int, int[]):int A[MD:(long[], int, int, int[]):int (m)]
          (r1v2 int) from 0x0065: CONSTRUCTOR (r1v2 int), (r0v1 hq2.m), (r7v0 int[]) A[MD:(int, hq2.m, int[]):void (m), WRAPPED] call: hq2.g.<init>(int, hq2.m, int[]):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    @Override // o6.d
    public final o6.d r() {
        /*
            r13 = this;
            hq2.m r0 = r13.f69954h
            long[] r1 = r0.f69969a
            r2 = 0
            r3 = r2
        L6:
            int r4 = r1.length
            if (r3 >= r4) goto L6c
            r4 = r1[r3]
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L69
            boolean r1 = r0.p()
            if (r1 == 0) goto L18
            goto L6c
        L18:
            int r1 = r13.f69952f
            int r3 = r1 + (-1)
            r4 = 1
            if (r3 >= r4) goto L20
            goto L6c
        L20:
            hq2.g r5 = new hq2.g
            int r6 = r0.n()
            int[] r7 = r13.f69953g
            if (r6 != 0) goto L2b
            goto L65
        L2b:
            int r8 = r1 + 63
            int r8 = r8 >>> 6
            int r4 = r8 << 1
            long[] r8 = new long[r4]
            long[] r0 = r0.f69969a
            java.lang.System.arraycopy(r0, r2, r8, r2, r6)
        L38:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L60
            int r0 = r6 << 1
        L3e:
            int r6 = r6 + (-1)
            if (r6 < 0) goto L5b
            r9 = r8[r6]
            int r2 = r0 + (-1)
            r11 = 32
            long r11 = r9 >>> r11
            int r11 = (int) r11
            long r11 = hq2.m.o(r11)
            r8[r2] = r11
            int r0 = r0 + (-2)
            int r2 = (int) r9
            long r9 = hq2.m.o(r2)
            r8[r0] = r9
            goto L3e
        L5b:
            int r6 = hq2.m.s(r8, r4, r1, r7)
            goto L38
        L60:
            hq2.m r0 = new hq2.m
            r0.<init>(r8, r6)
        L65:
            r5.<init>(r1, r0, r7)
            goto L6d
        L69:
            int r3 = r3 + 1
            goto L6
        L6c:
            r5 = r13
        L6d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hq2.g.r():o6.d");
    }

    @Override // o6.d
    public final o6.d s() {
        m mVar = this.f69954h;
        int n13 = mVar.n();
        int i13 = this.f69952f;
        int[] iArr = this.f69953g;
        if (n13 != 0) {
            int i14 = n13 << 1;
            long[] jArr = new long[i14];
            int i15 = 0;
            while (i15 < i14) {
                long j13 = mVar.f69969a[i15 >>> 1];
                int i16 = i15 + 1;
                jArr[i15] = m.o((int) j13);
                i15 += 2;
                jArr[i16] = m.o((int) (j13 >>> 32));
            }
            mVar = new m(jArr, m.s(jArr, i14, i13, iArr));
        }
        return new g(i13, mVar, iArr);
    }

    @Override // o6.d
    public final o6.d t(o6.d dVar, o6.d dVar2) {
        m mVar;
        m mVar2 = ((g) dVar).f69954h;
        m mVar3 = ((g) dVar2).f69954h;
        m mVar4 = this.f69954h;
        int n13 = mVar4.n();
        if (n13 == 0) {
            mVar = mVar4;
        } else {
            int i13 = n13 << 1;
            long[] jArr = new long[i13];
            int i14 = 0;
            while (i14 < i13) {
                long j13 = mVar4.f69969a[i14 >>> 1];
                int i15 = i14 + 1;
                jArr[i14] = m.o((int) j13);
                i14 += 2;
                jArr[i15] = m.o((int) (j13 >>> 32));
            }
            mVar = new m(jArr, i13);
        }
        int i16 = this.f69952f;
        int[] iArr = this.f69953g;
        m q13 = mVar2.q(mVar3);
        if (mVar == mVar4) {
            mVar = (m) mVar.clone();
        }
        mVar.c(q13);
        long[] jArr2 = mVar.f69969a;
        int s13 = m.s(jArr2, jArr2.length, i16, iArr);
        if (s13 < jArr2.length) {
            long[] jArr3 = new long[s13];
            mVar.f69969a = jArr3;
            System.arraycopy(jArr2, 0, jArr3, 0, s13);
        }
        return new g(i16, mVar, iArr);
    }

    @Override // o6.d
    public final o6.d u(o6.d dVar) {
        return a(dVar);
    }

    @Override // o6.d
    public final boolean v() {
        long[] jArr = this.f69954h.f69969a;
        return jArr.length > 0 && (1 & jArr[0]) != 0;
    }

    @Override // o6.d
    public final BigInteger w() {
        m mVar = this.f69954h;
        int n13 = mVar.n();
        if (n13 == 0) {
            return a.f69933a;
        }
        int i13 = n13 - 1;
        long j13 = mVar.f69969a[i13];
        byte[] bArr = new byte[8];
        int i14 = 0;
        boolean z13 = false;
        for (int i15 = 7; i15 >= 0; i15--) {
            byte b13 = (byte) (j13 >>> (i15 * 8));
            if (z13 || b13 != 0) {
                bArr[i14] = b13;
                i14++;
                z13 = true;
            }
        }
        byte[] bArr2 = new byte[(i13 * 8) + i14];
        for (int i16 = 0; i16 < i14; i16++) {
            bArr2[i16] = bArr[i16];
        }
        for (int i17 = n13 - 2; i17 >= 0; i17--) {
            long j14 = mVar.f69969a[i17];
            int i18 = 7;
            while (i18 >= 0) {
                bArr2[i14] = (byte) (j14 >>> (i18 * 8));
                i18--;
                i14++;
            }
        }
        return new BigInteger(1, bArr2);
    }
}
