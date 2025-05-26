package n8;

/* loaded from: classes3.dex */
public final class f implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x7.l f89790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f89792c;

    public f(i iVar, x7.l lVar, int i13, long j13) {
        this.f89792c = iVar;
        this.f89790a = lVar;
        this.f89791b = i13;
    }

    @Override // n8.k0
    public final void a(long j13) {
        this.f89792c.Y0(this.f89790a, this.f89791b, j13);
    }

    @Override // n8.k0
    public final void b() {
        this.f89792c.f1(this.f89790a, this.f89791b);
    }
}
