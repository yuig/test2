package mj;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f87220a;

    /* renamed from: b, reason: collision with root package name */
    public final float f87221b;

    /* renamed from: c, reason: collision with root package name */
    public int f87222c;

    /* renamed from: d, reason: collision with root package name */
    public int f87223d;

    /* renamed from: e, reason: collision with root package name */
    public final float f87224e;

    /* renamed from: f, reason: collision with root package name */
    public final float f87225f;

    /* renamed from: g, reason: collision with root package name */
    public final int f87226g;

    /* renamed from: h, reason: collision with root package name */
    public final float f87227h;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r6 > r3.f87221b) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        if (r3.f87225f <= r3.f87221b) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int r4, float r5, float r6, float r7, int r8, float r9, int r10, float r11, int r12, float r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mj.a.<init>(int, float, float, float, int, float, int, float, int, float):void");
    }

    public static a a(float f13, float f14, float f15, float f16, int[] iArr, float f17, int[] iArr2, float f18, int[] iArr3) {
        a aVar = null;
        int i13 = 1;
        for (int i14 : iArr3) {
            int length = iArr2.length;
            int i15 = 0;
            while (i15 < length) {
                int i16 = iArr2[i15];
                int length2 = iArr.length;
                int i17 = 0;
                while (i17 < length2) {
                    int i18 = i17;
                    int i19 = length2;
                    int i23 = i15;
                    int i24 = length;
                    a aVar2 = new a(i13, f14, f15, f16, iArr[i17], f17, i16, f18, i14, f13);
                    float f19 = aVar2.f87227h;
                    if (aVar == null || f19 < aVar.f87227h) {
                        if (f19 == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i13++;
                    i17 = i18 + 1;
                    length2 = i19;
                    i15 = i23;
                    length = i24;
                }
                i15++;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Arrangement [priority=");
        sb3.append(this.f87220a);
        sb3.append(", smallCount=");
        sb3.append(this.f87222c);
        sb3.append(", smallSize=");
        sb3.append(this.f87221b);
        sb3.append(", mediumCount=");
        sb3.append(this.f87223d);
        sb3.append(", mediumSize=");
        sb3.append(this.f87224e);
        sb3.append(", largeCount=");
        sb3.append(this.f87226g);
        sb3.append(", largeSize=");
        sb3.append(this.f87225f);
        sb3.append(", cost=");
        return d7.g.i(sb3, this.f87227h, "]");
    }
}
