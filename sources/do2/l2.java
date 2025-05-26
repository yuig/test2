package do2;

/* loaded from: classes2.dex */
public final class l2 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55848a;

    public /* synthetic */ l2(int i13) {
        this.f55848a = i13;
    }

    @Override // do2.k2
    public final i a(eo2.q0 q0Var) {
        switch (this.f55848a) {
            case 0:
                return lb.l0.i0(i2.START);
            default:
                return new pb.k(new n2(q0Var, null));
        }
    }

    public final String toString() {
        switch (this.f55848a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
