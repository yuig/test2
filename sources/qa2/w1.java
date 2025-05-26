package qa2;

import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class w1 {
    public static final m a(m mVar, PinterestStaggeredGridLayoutManager.LayoutParams layoutParams, int i13) {
        int i14;
        int i15;
        float f13;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (layoutParams == null || layoutParams.getF19194h() <= 0) {
            return mVar;
        }
        float c13 = mVar.c();
        if (layoutParams.getF19199m() > 0) {
            int f19194h = layoutParams.getF19194h() - ml2.c.c((layoutParams.getF19193g() / mVar.e()) * mVar.d());
            if (f19194h < 0) {
                return m.b(mVar, i13, 0, c1.CROPPED, 0.65f, 11);
            }
            i14 = layoutParams.getF19199m() - f19194h;
            i15 = i13;
            f13 = 0.65f;
        } else {
            i14 = mVar.f103315d;
            i15 = mVar.f103314c;
            f13 = c13;
        }
        float d2 = (mVar.d() / mVar.e()) / (i14 / i15);
        return m.b(mVar, i15, i14, d2 > 1.0f ? c1.CROPPED : d2 < 1.0f ? c1.SCALE_TO_FILL : c1.NONE, f13, 3);
    }
}
