package c3;

import b3.w;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final d f25516a;

    /* renamed from: b, reason: collision with root package name */
    public final d f25517b;

    /* renamed from: c, reason: collision with root package name */
    public final d f25518c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f25519d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(c3.d r12, c3.d r13, int r14) {
        /*
            r11 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            long r4 = r12.f25489b
            long r6 = c3.c.f25483a
            boolean r4 = c3.c.a(r4, r6)
            if (r4 == 0) goto L13
            c3.d r4 = ao2.m0.f(r12)
            goto L14
        L13:
            r4 = r12
        L14:
            long r8 = r13.f25489b
            boolean r5 = c3.c.a(r8, r6)
            if (r5 == 0) goto L21
            c3.d r5 = ao2.m0.f(r13)
            goto L22
        L21:
            r5 = r13
        L22:
            r8 = 0
            if (r14 != r3) goto L69
            long r9 = r12.f25489b
            boolean r14 = c3.c.a(r9, r6)
            long r9 = r13.f25489b
            boolean r6 = c3.c.a(r9, r6)
            if (r14 == 0) goto L36
            if (r6 == 0) goto L36
            goto L69
        L36:
            if (r14 != 0) goto L3a
            if (r6 == 0) goto L69
        L3a:
            if (r14 == 0) goto L3d
            goto L3e
        L3d:
            r12 = r13
        L3e:
            c3.s r12 = (c3.s) r12
            float[] r7 = c3.l.f25525e
            c3.u r12 = r12.f25539d
            if (r14 == 0) goto L4b
            float[] r14 = r12.a()
            goto L4c
        L4b:
            r14 = r7
        L4c:
            if (r6 == 0) goto L52
            float[] r7 = r12.a()
        L52:
            r12 = r14[r2]
            r6 = r7[r2]
            float r12 = r12 / r6
            r6 = r14[r1]
            r8 = r7[r1]
            float r6 = r6 / r8
            r14 = r14[r0]
            r7 = r7[r0]
            float r14 = r14 / r7
            float[] r8 = new float[r3]
            r8[r2] = r12
            r8[r1] = r6
            r8[r0] = r14
        L69:
            r11.<init>(r13, r4, r5, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.i.<init>(c3.d, c3.d, int):void");
    }

    public long a(long j13) {
        float h10 = w.h(j13);
        float g13 = w.g(j13);
        float e13 = w.e(j13);
        float d2 = w.d(j13);
        d dVar = this.f25517b;
        long d13 = dVar.d(h10, g13, e13);
        float intBitsToFloat = Float.intBitsToFloat((int) (d13 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d13 & 4294967295L));
        float e14 = dVar.e(h10, g13, e13);
        float[] fArr = this.f25519d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e14 *= fArr[2];
        }
        float f13 = intBitsToFloat;
        float f14 = intBitsToFloat2;
        return this.f25518c.f(f13, f14, e14, d2, this.f25516a);
    }

    public i(d dVar, d dVar2, d dVar3, float[] fArr) {
        this.f25516a = dVar;
        this.f25517b = dVar2;
        this.f25518c = dVar3;
        this.f25519d = fArr;
    }
}
