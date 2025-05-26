package je;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f75706a;

    /* renamed from: b, reason: collision with root package name */
    public final String f75707b;

    public n(String str, boolean z13) {
        this.f75706a = z13;
        this.f75707b = str;
    }

    @Override // je.h
    public final boolean a(bb.p pVar, p1 p1Var) {
        boolean z13 = this.f75706a;
        String str = this.f75707b;
        if (z13 && str == null) {
            str = p1Var.n();
        }
        n1 n1Var = p1Var.f75758b;
        if (n1Var == null) {
            return true;
        }
        Iterator it = n1Var.getChildren().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            p1 p1Var2 = (p1) ((r1) it.next());
            if (str == null || p1Var2.n().equals(str)) {
                i13++;
            }
        }
        return i13 == 1;
    }

    public final String toString() {
        return this.f75706a ? a.a.p(new StringBuilder("only-of-type <"), this.f75707b, ">") : "only-child";
    }
}
