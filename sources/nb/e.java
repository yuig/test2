package nb;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f90122b;

    public /* synthetic */ e(f fVar, int i13) {
        this.f90121a = i13;
        this.f90122b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f90121a;
        f fVar = this.f90122b;
        switch (i13) {
            case 0:
                f.a(fVar);
                break;
            case 1:
                f.b(fVar);
                break;
            case 2:
                f.b(fVar);
                break;
            case 3:
                f.a(fVar);
                break;
            default:
                f.a(fVar);
                break;
        }
    }
}
