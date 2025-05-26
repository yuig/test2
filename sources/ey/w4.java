package ey;

/* loaded from: classes.dex */
public abstract class w4 extends c0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f60611h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.v f60612i;

    public /* synthetic */ w4(long j13, b0 b0Var, Runnable runnable, boolean z13) {
        this(runnable, b0Var, z13, true, j13, false);
    }

    @Override // ey.c0
    public final m60.t a() {
        int i13 = this.f60611h;
        xk2.v vVar = this.f60612i;
        switch (i13) {
            case 0:
                return (u4) vVar.getValue();
            default:
                return (y4) vVar.getValue();
        }
    }

    public w4(long j13, b0 b0Var, Runnable runnable, boolean z13, boolean z14, boolean z15) {
        super(j13, b0Var, runnable, z13, z14, false, z15);
        this.f60612i = xk2.m.b(new nx.r0(this, 2));
    }

    public /* synthetic */ w4(long j13, b0 b0Var, Runnable runnable, boolean z13, boolean z14, boolean z15, int i13) {
        this(runnable, b0Var, z13, z14, j13, z15, false);
    }

    public w4(long j13, b0 b0Var, Runnable runnable, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(j13, b0Var, runnable, z13, z14, z15, false);
        this.f60612i = xk2.m.b(new v4(z16, this, 0));
    }

    public /* synthetic */ w4(Runnable runnable, b0 b0Var, boolean z13, boolean z14, long j13, boolean z15) {
        this(j13, b0Var, runnable, z13, z14, z15);
    }

    public /* synthetic */ w4(Runnable runnable, b0 b0Var, boolean z13, boolean z14, long j13, boolean z15, boolean z16) {
        this(j13, b0Var, runnable, z13, z14, z15, z16);
    }
}
