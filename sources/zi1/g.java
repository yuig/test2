package zi1;

import android.graphics.RectF;
import android.view.View;
import hs1.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View parent, q imageCache) {
        super(parent, imageCache, 5);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
    }

    @Override // zi1.d, wa2.l
    public final int b() {
        return (this.F * 2) + (this.A * 2);
    }

    @Override // zi1.d
    public final void k() {
        List list = this.C;
        if (list != null) {
            this.E = new ArrayList(list.size());
            int i13 = this.f128840c;
            List list2 = this.C;
            if (list2 != null) {
                int i14 = 0;
                for (Object obj : list2) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    String str = (String) obj;
                    RectF rectF = new RectF(i14 % 2 == 0 ? this.f142022z + this.F : 0, i14 == 0 ? i13 : (1 > i14 || i14 >= 3) ? ((this.A + this.F) * 2) + i13 : this.A + i13 + this.F, r6 + this.f142022z, r7 + this.A);
                    List list3 = this.E;
                    if (list3 != null) {
                        list3.add(rectF);
                    }
                    j(i14, str);
                    i14 = i15;
                }
            }
            e(this.B);
        }
    }

    @Override // zi1.d
    public final void m(int i13, float f13, int i14) {
        int i15 = this.F;
        int i16 = (i14 - i15) / 2;
        this.f142022z = i16;
        int i17 = (int) (i16 / f13);
        this.A = i17;
        this.B = (i15 * 2) + (i17 * 3);
        g(0);
        e(this.B);
        f(i14);
    }

    @Override // zi1.d
    public final void n(int i13, int i14) {
        int i15 = this.f142022z;
        int i16 = this.F;
        this.f142010n = (((i14 / (this.A + i16)) * 2) + (i13 <= (i16 / 2) + i15 ? 0 : 1)) - 1;
    }

    @Override // zi1.d
    public final boolean o(int i13, int i14) {
        int i15 = this.f142022z;
        int i16 = this.F;
        if (i13 <= (i16 / 2) + i15) {
            if (i14 <= (i16 / 2) + this.A) {
                return false;
            }
        }
        return getBounds().contains(i13, i14);
    }
}
