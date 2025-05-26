package m7;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f86369a;

    /* renamed from: b, reason: collision with root package name */
    public o1 f86370b;

    /* renamed from: c, reason: collision with root package name */
    public int f86371c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f86372d;

    /* renamed from: e, reason: collision with root package name */
    public int f86373e;

    public r0(o1 o1Var) {
        this.f86370b = o1Var;
    }

    public final void a(int i13) {
        this.f86369a |= i13 > 0;
        this.f86371c += i13;
    }

    public final void b(int i13) {
        if (this.f86372d && this.f86373e != 5) {
            bf.b.i(i13 == 5);
            return;
        }
        this.f86369a = true;
        this.f86372d = true;
        this.f86373e = i13;
    }
}
