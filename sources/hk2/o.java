package hk2;

import kb.q0;
import uj2.f0;

/* loaded from: classes2.dex */
public final class o extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69428a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f69429b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f69430c;

    public o(int i13, Object obj, Object obj2) {
        this.f69428a = i13;
        this.f69429b = obj;
        this.f69430c = obj2;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        int i13 = this.f69428a;
        int i14 = 1;
        Object obj = this.f69430c;
        Object obj2 = this.f69429b;
        switch (i13) {
            case 0:
                ((uj2.l) ((uj2.n) obj2)).f(new m(d0Var, (ak2.f) obj));
                break;
            case 1:
                ((uj2.t) obj2).d(new jk2.d(d0Var, obj));
                break;
            case 2:
                ((uj2.b) ((uj2.f) obj)).j(new fk2.b(i14, d0Var, (f0) obj2));
                break;
            case 3:
                ((uj2.b0) ((f0) obj2)).p(new q0(2, this, d0Var));
                break;
            default:
                f0[] f0VarArr = (f0[]) obj2;
                int length = f0VarArr.length;
                if (length == 1) {
                    ((uj2.b0) f0VarArr[0]).p(new q0(d0Var, new androidx.appcompat.widget.q(this, 3)));
                    break;
                } else {
                    kk2.d0 d0Var2 = new kk2.d0(d0Var, length, (ak2.f) obj);
                    d0Var.b(d0Var2);
                    for (int i15 = 0; i15 < length && !d0Var2.isDisposed(); i15++) {
                        f0 f0Var = f0VarArr[i15];
                        if (f0Var == null) {
                            d0Var2.a(i15, new NullPointerException("One of the sources is null"));
                            break;
                        } else {
                            ((uj2.b0) f0Var).p(d0Var2.f79930c[i15]);
                        }
                    }
                }
        }
    }
}
