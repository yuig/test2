package wa2;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class k extends j {
    @Override // wa2.j, wa2.l
    public final int b() {
        return this.f128812q + this.f128814s;
    }

    @Override // wa2.j
    public final void i() {
        ArrayList arrayList = this.f128820y;
        if (arrayList != null) {
            this.A = new ArrayList(arrayList.size());
            int i13 = this.f128840c;
            ArrayList arrayList2 = this.f128820y;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    String str = (String) next;
                    RectF rectF = new RectF(i14 % 2 == 0 ? this.f128811p + this.f128814s : 0, i14 == 0 ? i13 : this.f128812q + i13 + this.f128814s, r6 + this.f128811p, r7 + this.f128812q);
                    List list = this.A;
                    if (list != null) {
                        list.add(rectF);
                    }
                    h(i14, str);
                    i14 = i15;
                }
            }
            e(this.f128813r);
        }
    }

    @Override // wa2.j
    public final void j(int i13, float f13, int i14) {
        int i15 = this.f128814s;
        int i16 = (i14 - i15) / 2;
        this.f128811p = i16;
        int i17 = (int) (i16 / f13);
        this.f128812q = i17;
        this.f128813r = (i17 * 2) + i15;
        g(0);
        e(this.f128813r);
        f(i14);
    }

    @Override // wa2.j
    public final void k(int i13, int i14) {
        int i15 = this.f128811p;
        int i16 = this.f128814s / 2;
        this.f128810o = ((i13 <= i15 + i16 ? 0 : 1) + (i14 <= i16 + this.f128812q ? 0 : 2)) - 1;
    }

    @Override // wa2.j
    public final boolean l(int i13, int i14) {
        int i15 = this.f128811p;
        int i16 = this.f128814s / 2;
        if (i13 > i15 + i16 || i14 > i16 + this.f128812q) {
            return getBounds().contains(i13, i14);
        }
        return false;
    }
}
