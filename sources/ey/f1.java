package ey;

/* loaded from: classes.dex */
public abstract class f1 extends u1 {

    /* renamed from: c, reason: collision with root package name */
    public final q1 f60482c;

    public f1(q1 q1Var) {
        this.f60482c = q1Var;
    }

    @Override // ey.u1
    public final String e() {
        return "load_search_from_net";
    }

    @Override // ey.u1
    public final String g() {
        q1 q1Var = this.f60482c;
        if (q1Var != null) {
            return q1Var.getSpanName();
        }
        return null;
    }
}
