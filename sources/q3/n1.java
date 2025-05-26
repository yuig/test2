package q3;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f102255a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f102256b;

    /* renamed from: c, reason: collision with root package name */
    public final m1 f102257c = new m1(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final m1 f102258d = new m1(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final m1 f102259e = new m1(this, 1);

    public n1(q1 q1Var) {
        this.f102255a = q1Var;
    }

    public final l0 a() {
        l0 l0Var = this.f102256b;
        if (l0Var != null) {
            return l0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }
}
