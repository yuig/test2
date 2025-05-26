package tf;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;

/* loaded from: classes3.dex */
public final class k extends c {
    @Override // tf.c
    public final xf.b b(int i13) {
        if (i13 == 0) {
            return f();
        }
        return null;
    }

    @Override // tf.c
    public final Entry e(vf.c cVar) {
        return f().e((int) cVar.f125765a);
    }

    public final m f() {
        return (m) this.f117511i.get(0);
    }

    public final float g() {
        float f13 = 0.0f;
        for (int i13 = 0; i13 < f().f117526o.size(); i13++) {
            f13 += ((PieEntry) f().e(i13)).f117501a;
        }
        return f13;
    }
}
