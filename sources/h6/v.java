package h6;

/* loaded from: classes3.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    public final int f67750a;

    /* renamed from: b, reason: collision with root package name */
    public int f67751b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f67752c = -1;

    public v(int i13) {
        this.f67750a = i13;
    }

    @Override // h6.u
    public final boolean a(CharSequence charSequence, int i13, int i14, g0 g0Var) {
        int i15 = this.f67750a;
        if (i13 > i15 || i15 >= i14) {
            return i14 <= i15;
        }
        this.f67751b = i13;
        this.f67752c = i14;
        return false;
    }

    @Override // h6.u
    public final Object b() {
        return this;
    }
}
