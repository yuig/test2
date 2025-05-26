package eg;

import dg.g;
import java.util.ArrayList;
import java.util.List;
import ve.h;

/* loaded from: classes3.dex */
public final class f implements dg.a {

    /* renamed from: e, reason: collision with root package name */
    public static final gg.d[] f58853e = new gg.d[0];

    /* renamed from: a, reason: collision with root package name */
    public final h f58854a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58855b;

    /* renamed from: c, reason: collision with root package name */
    public final gg.d[] f58856c;

    /* renamed from: d, reason: collision with root package name */
    public final List f58857d;

    public f(h hVar, int i13, ArrayList arrayList, List list) {
        this.f58854a = hVar;
        this.f58855b = i13;
        this.f58856c = (gg.d[]) arrayList.toArray(f58853e);
        this.f58857d = list;
    }

    @Override // dg.a
    public final boolean a(List list) {
        Object n03 = g.n0(this.f58854a, this.f58855b, this.f58856c, list);
        for (dg.a aVar : this.f58857d) {
            gg.b bVar = new gg.b();
            bVar.add(n03);
            if (!aVar.a(bVar)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[WrappedGuard: ");
        sb3.append(this.f58855b);
        sb3.append(" ");
        return a.c.j(sb3, this.f58857d, "]");
    }
}
