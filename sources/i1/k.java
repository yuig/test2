package i1;

import java.util.Map;

/* loaded from: classes2.dex */
public final class k implements i2.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70803a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f70804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f70805c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f70806d;

    public k(ba.n nVar, z9.k kVar, s2.t tVar) {
        this.f70804b = nVar;
        this.f70806d = kVar;
        this.f70805c = tVar;
    }

    @Override // i2.s0
    public final void dispose() {
        int i13 = this.f70803a;
        Object obj = this.f70805c;
        Object obj2 = this.f70806d;
        Object obj3 = this.f70804b;
        switch (i13) {
            case 0:
                ((s2.t) obj).remove(obj3);
                ((x) obj2).f70929d.j(obj3);
                break;
            case 1:
                r2.h hVar = (r2.h) obj;
                r2.i iVar = (r2.i) obj2;
                Map map = iVar.f106049a;
                if (hVar.f106046b) {
                    Map c13 = hVar.f106047c.c();
                    boolean isEmpty = c13.isEmpty();
                    Object obj4 = hVar.f106045a;
                    if (isEmpty) {
                        map.remove(obj4);
                    } else {
                        map.put(obj4, c13);
                    }
                }
                iVar.f106050b.remove(obj3);
                break;
            default:
                z9.k kVar = (z9.k) obj2;
                ((ba.n) obj3).b().b(kVar);
                ((s2.t) obj).remove(kVar);
                break;
        }
    }

    public k(r2.h hVar, r2.i iVar, Object obj) {
        this.f70805c = hVar;
        this.f70806d = iVar;
        this.f70804b = obj;
    }

    public k(s2.t tVar, Object obj, x xVar) {
        this.f70805c = tVar;
        this.f70804b = obj;
        this.f70806d = xVar;
    }
}
