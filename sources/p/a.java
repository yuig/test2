package p;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f98280e = new HashMap();

    @Override // p.g
    public final c b(Object obj) {
        return (c) this.f98280e.get(obj);
    }

    @Override // p.g
    public final Object c(Object obj, Object obj2) {
        c b13 = b(obj);
        if (b13 != null) {
            return b13.f98283b;
        }
        HashMap hashMap = this.f98280e;
        c cVar = new c(obj, obj2);
        this.f98294d++;
        c cVar2 = this.f98292b;
        if (cVar2 == null) {
            this.f98291a = cVar;
            this.f98292b = cVar;
        } else {
            cVar2.f98284c = cVar;
            cVar.f98285d = cVar2;
            this.f98292b = cVar;
        }
        hashMap.put(obj, cVar);
        return null;
    }

    @Override // p.g
    public final Object d(Object obj) {
        Object d2 = super.d(obj);
        this.f98280e.remove(obj);
        return d2;
    }
}
