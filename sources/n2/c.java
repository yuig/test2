package n2;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class c extends b implements ll2.d {

    /* renamed from: c, reason: collision with root package name */
    public final i f88928c;

    /* renamed from: d, reason: collision with root package name */
    public Object f88929d;

    public c(i iVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f88928c = iVar;
        this.f88929d = obj2;
    }

    @Override // n2.b, java.util.Map.Entry
    public final Object getValue() {
        return this.f88929d;
    }

    @Override // n2.b, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f88929d;
        this.f88929d = obj;
        g gVar = this.f88928c.f88946a;
        f fVar = gVar.f88941d;
        Object obj3 = this.f88926a;
        if (fVar.containsKey(obj3)) {
            boolean z13 = gVar.f88935c;
            if (!z13) {
                fVar.put(obj3, obj);
            } else {
                if (!z13) {
                    throw new NoSuchElementException();
                }
                s sVar = gVar.f88933a[gVar.f88934b];
                Object obj4 = sVar.f88959a[sVar.f88961c];
                fVar.put(obj3, obj);
                gVar.d(obj4 != null ? obj4.hashCode() : 0, fVar.f88937b, obj4, 0);
            }
            gVar.f88944g = fVar.f88939d;
        }
        return obj2;
    }
}
