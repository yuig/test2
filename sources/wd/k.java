package wd;

/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f129182h;

    public k(int i13) {
        this.f129182h = i13;
    }

    @Override // wd.m
    public final l a(int i13, int i14, int i15, int i16) {
        switch (this.f129182h) {
            case 2:
                return b(i13, i14, i15, i16) == 1.0f ? l.QUALITY : m.f129183a.a(i13, i14, i15, i16);
            case 3:
                return l.QUALITY;
            case 4:
                return m.f129189g ? l.QUALITY : l.MEMORY;
            default:
                return l.QUALITY;
        }
    }

    @Override // wd.m
    public final float b(int i13, int i14, int i15, int i16) {
        switch (this.f129182h) {
            case 2:
                return Math.min(1.0f, m.f129183a.b(i13, i14, i15, i16));
            case 3:
                return Math.max(i15 / i13, i16 / i14);
            case 4:
                if (m.f129189g) {
                    return Math.min(i15 / i13, i16 / i14);
                }
                return Math.max(i14 / i16, i13 / i15) != 0 ? 1.0f / Integer.highestOneBit(r3) : 1.0f;
            default:
                return 1.0f;
        }
    }
}
