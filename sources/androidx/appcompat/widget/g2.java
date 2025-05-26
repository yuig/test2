package androidx.appcompat.widget;

/* loaded from: classes2.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16569a;

    /* renamed from: b, reason: collision with root package name */
    public int f16570b;

    /* renamed from: c, reason: collision with root package name */
    public int f16571c;

    /* renamed from: d, reason: collision with root package name */
    public int f16572d;

    /* renamed from: e, reason: collision with root package name */
    public int f16573e;

    /* renamed from: f, reason: collision with root package name */
    public int f16574f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16575g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16576h;

    public final void a(int i13, int i14) {
        this.f16571c = i13;
        this.f16572d = i14;
        this.f16576h = true;
        if (this.f16575g) {
            if (i14 != Integer.MIN_VALUE) {
                this.f16569a = i14;
            }
            if (i13 != Integer.MIN_VALUE) {
                this.f16570b = i13;
                return;
            }
            return;
        }
        if (i13 != Integer.MIN_VALUE) {
            this.f16569a = i13;
        }
        if (i14 != Integer.MIN_VALUE) {
            this.f16570b = i14;
        }
    }
}
