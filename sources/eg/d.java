package eg;

import dg.g;
import java.util.List;
import java.util.Map;
import ve.h;

/* loaded from: classes3.dex */
public final class d implements dg.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f58848a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58849b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58850c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58851d;

    /* renamed from: e, reason: collision with root package name */
    public final gg.d[] f58852e;

    public d(h hVar, int i13, String str, boolean z13, gg.d[] dVarArr) {
        this.f58848a = hVar;
        this.f58849b = i13;
        this.f58850c = str;
        this.f58851d = z13;
        this.f58852e = dVarArr;
    }

    @Override // dg.a
    public final boolean a(List list) {
        Object n03 = g.n0(this.f58848a, this.f58849b, this.f58852e, list);
        if (!(n03 instanceof Map)) {
            return false;
        }
        Map map = (Map) n03;
        return this.f58851d ? map.containsKey(this.f58850c) : !map.containsKey(r1);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[MapGuard: ");
        sb3.append(this.f58849b);
        sb3.append(" ");
        sb3.append(this.f58850c);
        sb3.append(" ");
        return a.a.r(sb3, this.f58851d, "]");
    }
}
