package j1;

/* loaded from: classes.dex */
public final class y implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f74316a;

    /* renamed from: b, reason: collision with root package name */
    public final float f74317b;

    /* renamed from: c, reason: collision with root package name */
    public final float f74318c;

    /* renamed from: d, reason: collision with root package name */
    public final float f74319d;

    /* renamed from: e, reason: collision with root package name */
    public final float f74320e;

    /* renamed from: f, reason: collision with root package name */
    public final float f74321f;

    public y(float f13, float f14, float f15, float f16) {
        int x13;
        this.f74316a = f13;
        this.f74317b = f14;
        this.f74318c = f15;
        this.f74319d = f16;
        if (Float.isNaN(f13) || Float.isNaN(f14) || Float.isNaN(f15) || Float.isNaN(f16)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f13 + ", " + f14 + ", " + f15 + ", " + f16 + '.');
        }
        float[] fArr = new float[5];
        float f17 = (f14 - 0.0f) * 3.0f;
        float f18 = (f16 - f14) * 3.0f;
        float f19 = (1.0f - f16) * 3.0f;
        double d2 = f17;
        double d13 = f18;
        double d14 = f19;
        double d15 = d13 * 2.0d;
        double d16 = (d2 - d15) + d14;
        if (d16 == 0.0d) {
            x13 = d13 == d14 ? 0 : androidx.compose.ui.graphics.a.x((float) ((d15 - d14) / (d15 - (d14 * 2.0d))), fArr, 0);
        } else {
            double d17 = -Math.sqrt((d13 * d13) - (d14 * d2));
            double d18 = (-d2) + d13;
            int x14 = androidx.compose.ui.graphics.a.x((float) ((-(d17 + d18)) / d16), fArr, 0);
            x13 = androidx.compose.ui.graphics.a.x((float) ((d17 - d18) / d16), fArr, x14) + x14;
            if (x13 > 1) {
                float f23 = fArr[0];
                float f24 = fArr[1];
                if (f23 > f24) {
                    fArr[0] = f24;
                    fArr[1] = f23;
                } else if (f23 == f24) {
                    x13--;
                }
            }
        }
        float f25 = (f18 - f17) * 2.0f;
        int x15 = androidx.compose.ui.graphics.a.x((-f25) / (((f19 - f18) * 2.0f) - f25), fArr, x13) + x13;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i13 = 0; i13 < x15; i13++) {
            float f26 = fArr[i13];
            float f27 = (((((((((f14 - f16) * 3.0f) + 1.0f) - 0.0f) * f26) + (((f16 - (f14 * 2.0f)) + 0.0f) * 3.0f)) * f26) + f17) * f26) + 0.0f;
            min = Math.min(min, f27);
            max = Math.max(max, f27);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f74320e = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f74321f = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d3, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01df, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01fe, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x020a, code lost:
    
        if (r2 <= 1.0000008f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        r1 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cc, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018d, code lost:
    
        if (r2 >= (-8.34465E-7f)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0199, code lost:
    
        if (r2 <= 1.0000008f) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    @Override // j1.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r25) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.y.a(float):float");
    }

    public final void b(float f13) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f74316a + ", " + this.f74317b + ", " + this.f74318c + ", " + this.f74319d + ") has no solution at " + f13);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f74316a == yVar.f74316a && this.f74317b == yVar.f74317b && this.f74318c == yVar.f74318c && this.f74319d == yVar.f74319d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f74319d) + a.a.a(this.f74318c, a.a.a(this.f74317b, Float.hashCode(this.f74316a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CubicBezierEasing(a=");
        sb3.append(this.f74316a);
        sb3.append(", b=");
        sb3.append(this.f74317b);
        sb3.append(", c=");
        sb3.append(this.f74318c);
        sb3.append(", d=");
        return d7.g.h(sb3, this.f74319d, ')');
    }
}
