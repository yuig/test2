package q2;

import i2.b0;
import i2.z3;
import n2.r;

/* loaded from: classes.dex */
public final class k extends n2.f {

    /* renamed from: f, reason: collision with root package name */
    public l f102115f;

    public k(l lVar) {
        this.f88936a = new p2.b();
        this.f88937b = lVar.f88931d;
        this.f88940e = lVar.f88932e;
        this.f102115f = lVar;
    }

    @Override // n2.f, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof b0) {
            return super.containsKey((b0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof z3) {
            return super.containsValue((z3) obj);
        }
        return false;
    }

    @Override // n2.f, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof b0) {
            return (z3) super.get((b0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof b0) ? obj2 : (z3) super.getOrDefault((b0) obj, (z3) obj2);
    }

    public final l h() {
        r rVar = this.f88937b;
        l lVar = this.f102115f;
        if (rVar != lVar.f88931d) {
            this.f88936a = new p2.b();
            lVar = new l(this.f88937b, d());
        }
        this.f102115f = lVar;
        return lVar;
    }

    @Override // n2.f, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof b0) {
            return (z3) super.remove((b0) obj);
        }
        return null;
    }
}
