package a8;

import a7.a1;
import a7.b1;
import a7.z0;
import g8.f1;

/* loaded from: classes3.dex */
public final class a0 extends g8.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1282c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b1 b1Var, a7.i0 i0Var) {
        super(b1Var);
        this.f1282c = 2;
        this.f1283d = i0Var;
    }

    @Override // g8.t, a7.b1
    public final z0 g(int i13, z0 z0Var, boolean z13) {
        switch (this.f1282c) {
            case 0:
                super.g(i13, z0Var, z13);
                z0Var.f1256f = true;
                return z0Var;
            case 1:
                super.g(i13, z0Var, z13);
                z0Var.f1256f = true;
                return z0Var;
            default:
                return this.f64402b.g(i13, z0Var, z13);
        }
    }

    @Override // g8.t, a7.b1
    public final a1 n(int i13, a1 a1Var, long j13) {
        switch (this.f1282c) {
            case 0:
                super.n(i13, a1Var, j13);
                a1Var.f939k = true;
                break;
            case 1:
                super.n(i13, a1Var, j13);
                a1Var.f939k = true;
                break;
            default:
                super.n(i13, a1Var, j13);
                a7.i0 i0Var = (a7.i0) this.f1283d;
                a1Var.f931c = i0Var;
                a7.d0 d0Var = i0Var.f1073b;
                a1Var.f930b = d0Var != null ? d0Var.f975g : null;
                break;
        }
        return a1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(g8.a aVar, f1 f1Var, int i13) {
        super(f1Var);
        this.f1282c = i13;
        this.f1283d = aVar;
    }
}
