package zb;

/* loaded from: classes.dex */
public final class i extends l {
    @Override // zb.e
    public final Object h(kc.a aVar, float f13) {
        return Float.valueOf(n(aVar, f13));
    }

    public final float m() {
        return n(b(), d());
    }

    public final float n(kc.a aVar, float f13) {
        if (aVar.f79104b == null || aVar.f79105c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        androidx.appcompat.app.d dVar = this.f141498e;
        Object obj = aVar.f79104b;
        if (dVar != null) {
            Float f14 = (Float) aVar.f79105c;
            float e13 = e();
            float f15 = f();
            Float f16 = (Float) dVar.B(aVar.f79109g, aVar.f79110h.floatValue(), (Float) obj, f14, f13, e13, f15);
            if (f16 != null) {
                return f16.floatValue();
            }
        }
        if (aVar.f79111i == -3987645.8f) {
            aVar.f79111i = ((Float) obj).floatValue();
        }
        float f17 = aVar.f79111i;
        if (aVar.f79112j == -3987645.8f) {
            aVar.f79112j = ((Float) aVar.f79105c).floatValue();
        }
        return jc.f.e(f17, aVar.f79112j, f13);
    }
}
