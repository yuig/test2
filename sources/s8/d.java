package s8;

import d7.u;

/* loaded from: classes3.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f111435a;

    /* renamed from: b, reason: collision with root package name */
    public final int f111436b;

    /* renamed from: c, reason: collision with root package name */
    public final int f111437c;

    /* renamed from: d, reason: collision with root package name */
    public final int f111438d;

    /* renamed from: e, reason: collision with root package name */
    public final int f111439e;

    /* renamed from: f, reason: collision with root package name */
    public final int f111440f;

    public d(int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f111435a = i13;
        this.f111436b = i14;
        this.f111437c = i15;
        this.f111438d = i16;
        this.f111439e = i17;
        this.f111440f = i18;
    }

    public final int a() {
        int i13 = this.f111435a;
        if (i13 == 1935960438) {
            return 2;
        }
        if (i13 == 1935963489) {
            return 1;
        }
        if (i13 == 1937012852) {
            return 3;
        }
        u.g("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i13));
        return -1;
    }

    @Override // s8.a
    public final int getType() {
        return 1752331379;
    }
}
