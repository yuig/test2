package wd;

import a.cb;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract class d implements nd.p {
    @Override // nd.p
    public final pd.g0 b(com.bumptech.glide.f fVar, pd.g0 g0Var, int i13, int i14) {
        if (!he.n.j(i13, i14)) {
            throw new IllegalArgumentException(cb.j("Cannot apply transformation on width: ", i13, " or height: ", i14, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        qd.d dVar = com.bumptech.glide.b.a(fVar).f29741b;
        Bitmap bitmap = (Bitmap) g0Var.get();
        if (i13 == Integer.MIN_VALUE) {
            i13 = bitmap.getWidth();
        }
        if (i14 == Integer.MIN_VALUE) {
            i14 = bitmap.getHeight();
        }
        Bitmap c13 = c(dVar, bitmap, i13, i14);
        return bitmap.equals(c13) ? g0Var : c.e(c13, dVar);
    }

    public abstract Bitmap c(qd.d dVar, Bitmap bitmap, int i13, int i14);
}
