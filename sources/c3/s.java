package c3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends d {

    /* renamed from: r, reason: collision with root package name */
    public static final e f25538r = new e(2);

    /* renamed from: d, reason: collision with root package name */
    public final u f25539d;

    /* renamed from: e, reason: collision with root package name */
    public final float f25540e;

    /* renamed from: f, reason: collision with root package name */
    public final float f25541f;

    /* renamed from: g, reason: collision with root package name */
    public final t f25542g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f25543h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f25544i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f25545j;

    /* renamed from: k, reason: collision with root package name */
    public final k f25546k;

    /* renamed from: l, reason: collision with root package name */
    public final r f25547l;

    /* renamed from: m, reason: collision with root package name */
    public final o f25548m;

    /* renamed from: n, reason: collision with root package name */
    public final k f25549n;

    /* renamed from: o, reason: collision with root package name */
    public final r f25550o;

    /* renamed from: p, reason: collision with root package name */
    public final o f25551p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f25552q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(java.lang.String r18, float[] r19, c3.u r20, final double r21, float r23, float r24, int r25) {
        /*
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            c3.e r3 = c3.s.f25538r
            if (r0 != 0) goto Lc
            r11 = r3
            goto L13
        Lc:
            c3.p r4 = new c3.p
            r5 = 0
            r4.<init>()
            r11 = r4
        L13:
            if (r0 != 0) goto L17
        L15:
            r12 = r3
            goto L1e
        L17:
            c3.p r3 = new c3.p
            r0 = 1
            r3.<init>()
            goto L15
        L1e:
            c3.t r15 = new c3.t
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r15
            r1 = r21
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.s.<init>(java.lang.String, float[], c3.u, double, float, float, int):void");
    }

    @Override // c3.d
    public final float a(int i13) {
        return this.f25541f;
    }

    @Override // c3.d
    public final float b(int i13) {
        return this.f25540e;
    }

    @Override // c3.d
    public final boolean c() {
        return this.f25552q;
    }

    @Override // c3.d
    public final long d(float f13, float f14, float f15) {
        double d2 = f13;
        o oVar = this.f25551p;
        float i13 = (float) oVar.i(d2);
        float i14 = (float) oVar.i(f14);
        float i15 = (float) oVar.i(f15);
        float[] fArr = this.f25544i;
        float f16 = (fArr[6] * i15) + (fArr[3] * i14) + (fArr[0] * i13);
        float f17 = (fArr[7] * i15) + (fArr[4] * i14) + (fArr[1] * i13);
        return (Float.floatToRawIntBits(f17) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32);
    }

    @Override // c3.d
    public final float e(float f13, float f14, float f15) {
        double d2 = f13;
        o oVar = this.f25551p;
        float i13 = (float) oVar.i(d2);
        float i14 = (float) oVar.i(f14);
        float i15 = (float) oVar.i(f15);
        float[] fArr = this.f25544i;
        return (fArr[8] * i15) + (fArr[5] * i14) + (fArr[2] * i13);
    }

    @Override // c3.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        s sVar = (s) obj;
        if (Float.compare(sVar.f25540e, this.f25540e) != 0 || Float.compare(sVar.f25541f, this.f25541f) != 0 || !Intrinsics.d(this.f25539d, sVar.f25539d) || !Arrays.equals(this.f25543h, sVar.f25543h)) {
            return false;
        }
        t tVar = sVar.f25542g;
        t tVar2 = this.f25542g;
        if (tVar2 != null) {
            return Intrinsics.d(tVar2, tVar);
        }
        if (tVar == null) {
            return true;
        }
        if (Intrinsics.d(this.f25546k, sVar.f25546k)) {
            return Intrinsics.d(this.f25549n, sVar.f25549n);
        }
        return false;
    }

    @Override // c3.d
    public final long f(float f13, float f14, float f15, float f16, d dVar) {
        float[] fArr = this.f25545j;
        float f17 = (fArr[6] * f15) + (fArr[3] * f14) + (fArr[0] * f13);
        float f18 = (fArr[7] * f15) + (fArr[4] * f14) + (fArr[1] * f13);
        float f19 = (fArr[8] * f15) + (fArr[5] * f14) + (fArr[2] * f13);
        o oVar = this.f25548m;
        return androidx.compose.ui.graphics.a.b((float) oVar.i(f17), (float) oVar.i(f18), (float) oVar.i(f19), f16, dVar);
    }

    public final float[] g() {
        return this.f25543h;
    }

    public final t h() {
        return this.f25542g;
    }

    @Override // c3.d
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f25543h) + ((this.f25539d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f13 = this.f25540e;
        int floatToIntBits = (hashCode + (f13 == 0.0f ? 0 : Float.floatToIntBits(f13))) * 31;
        float f14 = this.f25541f;
        int floatToIntBits2 = (floatToIntBits + (f14 == 0.0f ? 0 : Float.floatToIntBits(f14))) * 31;
        t tVar = this.f25542g;
        int hashCode2 = floatToIntBits2 + (tVar != null ? tVar.hashCode() : 0);
        if (tVar == null) {
            return this.f25549n.hashCode() + ((this.f25546k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(java.lang.String r12, float[] r13, c3.u r14, final c3.t r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            double r0 = r9.f25558f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            double r4 = r9.f25559g
            if (r0 != 0) goto L17
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L17
            c3.q r1 = new c3.q
            r6 = 0
            r1.<init>()
        L15:
            r6 = r1
            goto L1e
        L17:
            c3.q r1 = new c3.q
            r6 = 1
            r1.<init>()
            goto L15
        L1e:
            if (r0 != 0) goto L2c
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L2c
            c3.q r0 = new c3.q
            r1 = 2
            r0.<init>()
        L2a:
            r7 = r0
            goto L33
        L2c:
            c3.q r0 = new c3.q
            r1 = 3
            r0.<init>()
            goto L2a
        L33:
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r10 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r6
            r6 = r7
            r7 = r10
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.s.<init>(java.lang.String, float[], c3.u, c3.t, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0230, code lost:
    
        if (am.d.c(r3[4] - r3[0], r3[5] - r3[1], r9[4], r9[5]) >= 0.0f) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(java.lang.String r33, float[] r34, c3.u r35, float[] r36, c3.k r37, c3.k r38, float r39, float r40, c3.t r41, int r42) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.s.<init>(java.lang.String, float[], c3.u, float[], c3.k, c3.k, float, float, c3.t, int):void");
    }
}
