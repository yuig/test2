package g7;

import d7.n0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f63748a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f63749b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f63750c;

    /* renamed from: d, reason: collision with root package name */
    public i f63751d;

    public b(boolean z13) {
        this.f63748a = z13;
    }

    @Override // g7.f
    public final void f(a0 a0Var) {
        a0Var.getClass();
        ArrayList arrayList = this.f63749b;
        if (arrayList.contains(a0Var)) {
            return;
        }
        arrayList.add(a0Var);
        this.f63750c++;
    }

    public final void t(int i13) {
        i iVar = this.f63751d;
        int i14 = n0.f53866a;
        for (int i15 = 0; i15 < this.f63750c; i15++) {
            ((a0) this.f63749b.get(i15)).g(this, iVar, this.f63748a, i13);
        }
    }

    public final void u() {
        i iVar = this.f63751d;
        int i13 = n0.f53866a;
        for (int i14 = 0; i14 < this.f63750c; i14++) {
            ((a0) this.f63749b.get(i14)).d(this, iVar, this.f63748a);
        }
        this.f63751d = null;
    }

    public final void v(i iVar) {
        for (int i13 = 0; i13 < this.f63750c; i13++) {
            ((a0) this.f63749b.get(i13)).f(this, iVar);
        }
    }

    public final void w(i iVar) {
        this.f63751d = iVar;
        for (int i13 = 0; i13 < this.f63750c; i13++) {
            ((a0) this.f63749b.get(i13)).a(this, iVar, this.f63748a);
        }
    }
}
