package zb;

/* loaded from: classes3.dex */
public final class s extends l {
    @Override // zb.e
    public final Object h(kc.a aVar, float f13) {
        Object obj;
        androidx.appcompat.app.d dVar = this.f141498e;
        Object obj2 = aVar.f79104b;
        if (dVar == null) {
            return (f13 != 1.0f || (obj = aVar.f79105c) == null) ? (cc.c) obj2 : (cc.c) obj;
        }
        Float f14 = aVar.f79110h;
        float floatValue = f14 == null ? Float.MAX_VALUE : f14.floatValue();
        cc.c cVar = (cc.c) obj2;
        Object obj3 = aVar.f79105c;
        return (cc.c) dVar.B(aVar.f79109g, floatValue, cVar, obj3 == null ? cVar : (cc.c) obj3, f13, d(), this.f141497d);
    }
}
