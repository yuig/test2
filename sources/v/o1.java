package v;

/* loaded from: classes2.dex */
public final /* synthetic */ class o1 implements r4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1 f123590a;

    public /* synthetic */ o1(t1 t1Var) {
        this.f123590a = t1Var;
    }

    @Override // r4.j
    public final Object C(r4.i iVar) {
        String str;
        t1 t1Var = this.f123590a;
        synchronized (t1Var.f123661a) {
            com.bumptech.glide.d.v("Release completer expected to be null", t1Var.f123671k == null);
            t1Var.f123671k = iVar;
            str = "Release[session=" + t1Var + "]";
        }
        return str;
    }

    public final void a() {
        t1 t1Var = this.f123590a;
        synchronized (t1Var.f123661a) {
            try {
                if (t1Var.f123669i == r1.OPENED) {
                    t1Var.i(t1Var.f123666f);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
