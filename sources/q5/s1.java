package q5;

import androidx.annotation.NonNull;
import kh2.k3;

/* loaded from: classes.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final a2 f102502a;

    /* renamed from: b, reason: collision with root package name */
    public f5.e[] f102503b;

    public s1() {
        this(new a2());
    }

    public final void a() {
        f5.e[] eVarArr = this.f102503b;
        if (eVarArr != null) {
            f5.e eVar = eVarArr[k3.p0(1)];
            f5.e eVar2 = this.f102503b[k3.p0(2)];
            a2 a2Var = this.f102502a;
            if (eVar2 == null) {
                eVar2 = a2Var.a(2);
            }
            if (eVar == null) {
                eVar = a2Var.a(1);
            }
            g(f5.e.a(eVar, eVar2));
            f5.e eVar3 = this.f102503b[k3.p0(16)];
            if (eVar3 != null) {
                f(eVar3);
            }
            f5.e eVar4 = this.f102503b[k3.p0(32)];
            if (eVar4 != null) {
                d(eVar4);
            }
            f5.e eVar5 = this.f102503b[k3.p0(64)];
            if (eVar5 != null) {
                h(eVar5);
            }
        }
    }

    @NonNull
    public abstract a2 b();

    public void c(int i13, @NonNull f5.e eVar) {
        if (this.f102503b == null) {
            this.f102503b = new f5.e[9];
        }
        for (int i14 = 1; i14 <= 256; i14 <<= 1) {
            if ((i13 & i14) != 0) {
                this.f102503b[k3.p0(i14)] = eVar;
            }
        }
    }

    public void d(@NonNull f5.e eVar) {
    }

    public abstract void e(@NonNull f5.e eVar);

    public void f(@NonNull f5.e eVar) {
    }

    public abstract void g(@NonNull f5.e eVar);

    public void h(@NonNull f5.e eVar) {
    }

    public s1(@NonNull a2 a2Var) {
        this.f102502a = a2Var;
    }
}
