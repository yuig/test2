package zb;

/* loaded from: classes.dex */
public final class f extends l {
    @Override // zb.e
    public final Object h(kc.a aVar, float f13) {
        return Integer.valueOf(m(aVar, f13));
    }

    public final int m(kc.a aVar, float f13) {
        Float f14;
        if (aVar.f79104b == null || aVar.f79105c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        androidx.appcompat.app.d dVar = this.f141498e;
        Object obj = aVar.f79104b;
        if (dVar != null && (f14 = aVar.f79110h) != null) {
            Integer num = (Integer) dVar.B(aVar.f79109g, f14.floatValue(), (Integer) obj, (Integer) aVar.f79105c, f13, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return b7.c.p(((Integer) obj).intValue(), jc.f.b(f13, 0.0f, 1.0f), ((Integer) aVar.f79105c).intValue());
    }
}
