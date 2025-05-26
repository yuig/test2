package je;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public List f75678a;

    @Override // je.h
    public final boolean a(bb.p pVar, p1 p1Var) {
        Iterator it = this.f75678a.iterator();
        while (it.hasNext()) {
            if (v.z1.t(pVar, (p) it.next(), p1Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return a.c.j(new StringBuilder("not("), this.f75678a, ")");
    }
}
