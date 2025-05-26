package ao2;

/* loaded from: classes2.dex */
public abstract class f1 extends f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f20146f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f20147c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20148d;

    /* renamed from: e, reason: collision with root package name */
    public kotlin.collections.v f20149e;

    public final void A(boolean z13) {
        this.f20147c = (z13 ? 4294967296L : 1L) + this.f20147c;
        if (z13) {
            return;
        }
        this.f20148d = true;
    }

    public final boolean J() {
        return this.f20147c >= 4294967296L;
    }

    public abstract long K();

    public final boolean L() {
        kotlin.collections.v vVar = this.f20149e;
        if (vVar == null) {
            return false;
        }
        t0 t0Var = (t0) (vVar.isEmpty() ? null : vVar.removeFirst());
        if (t0Var == null) {
            return false;
        }
        t0Var.run();
        return true;
    }

    public void M(long j13, c1 c1Var) {
        n0.f20177j.W(j13, c1Var);
    }

    @Override // ao2.f0
    public final f0 m(int i13, String str) {
        m0.m(i13);
        return str != null ? new ho2.r(this, str) : this;
    }

    public final void o(boolean z13) {
        long j13 = this.f20147c - (z13 ? 4294967296L : 1L);
        this.f20147c = j13;
        if (j13 <= 0 && this.f20148d) {
            shutdown();
        }
    }

    public abstract void shutdown();

    public final void w(t0 t0Var) {
        kotlin.collections.v vVar = this.f20149e;
        if (vVar == null) {
            vVar = new kotlin.collections.v();
            this.f20149e = vVar;
        }
        vVar.addLast(t0Var);
    }

    public abstract Thread z();
}
