package zm2;

/* loaded from: classes2.dex */
public final class r implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final int f142247b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f142248c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f142249d;

    /* renamed from: a, reason: collision with root package name */
    public final v f142246a = null;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f142250e = false;

    public r(int i13, q0 q0Var, boolean z13) {
        this.f142247b = i13;
        this.f142248c = q0Var;
        this.f142249d = z13;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f142247b - ((r) obj).f142247b;
    }
}
