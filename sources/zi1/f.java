package zi1;

import android.graphics.RectF;
import android.view.View;
import hs1.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View parent, q imageCache) {
        super(parent, imageCache, 1);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
    }

    @Override // zi1.d, wa2.l
    public final int b() {
        return this.B;
    }

    @Override // zi1.d
    public final void k() {
        String str;
        List list = this.C;
        if (list != null) {
            this.E = new ArrayList(list.size());
            int i13 = this.f128840c;
            List list2 = this.C;
            if (list2 != null && (str = (String) CollectionsKt.firstOrNull(list2)) != null) {
                RectF rectF = new RectF(0, i13, this.f142022z, i13 + this.A);
                List list3 = this.E;
                if (list3 != null) {
                    list3.add(rectF);
                }
                j(0, str);
            }
            e(this.B);
        }
    }

    @Override // zi1.d
    public final void m(int i13, float f13, int i14) {
        this.f142022z = i14;
        int i15 = (int) (i14 / f13);
        this.A = i15;
        int i16 = this.F;
        this.B = i15 + i16;
        g(i13 + i16);
        e(this.B);
        f(i14);
    }

    @Override // zi1.d
    public final void n(int i13, int i14) {
        this.f142010n = 0;
    }
}
