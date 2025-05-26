package androidx.core.widget;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f17979a;

    /* renamed from: b, reason: collision with root package name */
    public int f17980b;

    /* renamed from: c, reason: collision with root package name */
    public float f17981c;

    /* renamed from: d, reason: collision with root package name */
    public float f17982d;

    /* renamed from: e, reason: collision with root package name */
    public long f17983e;

    /* renamed from: f, reason: collision with root package name */
    public long f17984f;

    /* renamed from: g, reason: collision with root package name */
    public long f17985g;

    /* renamed from: h, reason: collision with root package name */
    public float f17986h;

    /* renamed from: i, reason: collision with root package name */
    public int f17987i;

    public final float a(long j13) {
        if (j13 < this.f17983e) {
            return 0.0f;
        }
        long j14 = this.f17985g;
        if (j14 < 0 || j13 < j14) {
            return f.b((j13 - r0) / this.f17979a, 0.0f, 1.0f) * 0.5f;
        }
        float f13 = this.f17986h;
        return (f.b((j13 - j14) / this.f17987i, 0.0f, 1.0f) * f13) + (1.0f - f13);
    }
}
