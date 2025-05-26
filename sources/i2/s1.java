package i2;

/* loaded from: classes2.dex */
public final class s1 implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f71291a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71292b;

    /* renamed from: c, reason: collision with root package name */
    public int f71293c;

    public s1(f fVar, int i13) {
        this.f71291a = fVar;
        this.f71292b = i13;
    }

    @Override // i2.f
    public final void a(int i13, int i14, int i15) {
        int i16 = this.f71293c == 0 ? this.f71292b : 0;
        this.f71291a.a(i13 + i16, i14 + i16, i15);
    }

    @Override // i2.f
    public final void b(int i13, int i14) {
        this.f71291a.b(i13 + (this.f71293c == 0 ? this.f71292b : 0), i14);
    }

    @Override // i2.f
    public final void c(int i13, Object obj) {
        this.f71291a.c(i13 + (this.f71293c == 0 ? this.f71292b : 0), obj);
    }

    @Override // i2.f
    public final void clear() {
        u.i("Clear is not valid on OffsetApplier");
        throw null;
    }

    @Override // i2.f
    public final Object e() {
        return this.f71291a.e();
    }

    @Override // i2.f
    public final void f(int i13, Object obj) {
        this.f71291a.f(i13 + (this.f71293c == 0 ? this.f71292b : 0), obj);
    }

    @Override // i2.f
    public final void g(Object obj) {
        this.f71293c++;
        this.f71291a.g(obj);
    }

    @Override // i2.f
    public final void h() {
        int i13 = this.f71293c;
        if (!(i13 > 0)) {
            u.i("OffsetApplier up called with no corresponding down");
            throw null;
        }
        this.f71293c = i13 - 1;
        this.f71291a.h();
    }
}
