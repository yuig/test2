package zb;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class k extends l {
    @Override // zb.e
    public final Object h(kc.a aVar, float f13) {
        return Integer.valueOf(m(aVar, f13));
    }

    public final int m(kc.a aVar, float f13) {
        if (aVar.f79104b == null || aVar.f79105c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        androidx.appcompat.app.d dVar = this.f141498e;
        Object obj = aVar.f79104b;
        if (dVar != null) {
            Integer num = (Integer) dVar.B(aVar.f79109g, aVar.f79110h.floatValue(), (Integer) obj, (Integer) aVar.f79105c, f13, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        if (aVar.f79113k == 784923401) {
            aVar.f79113k = ((Integer) obj).intValue();
        }
        int i13 = aVar.f79113k;
        if (aVar.f79114l == 784923401) {
            aVar.f79114l = ((Integer) aVar.f79105c).intValue();
        }
        int i14 = aVar.f79114l;
        PointF pointF = jc.f.f75393a;
        return (int) ((f13 * (i14 - i13)) + i13);
    }
}
