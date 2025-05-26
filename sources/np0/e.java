package np0;

import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.f30;
import com.pinterest.screens.q2;
import df.j1;
import dl1.s;
import ey.g3;
import ey.l2;
import h32.a4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.g0;
import m60.u;
import pk.a0;
import x02.i2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f91748a;

    /* renamed from: b, reason: collision with root package name */
    public f f91749b;

    /* renamed from: c, reason: collision with root package name */
    public String f91750c;

    /* renamed from: d, reason: collision with root package name */
    public String f91751d;

    public e(i2 i2Var) {
        this.f91748a = i2Var;
    }

    public final void a(f30 f30Var, List list, String str, boolean z13) {
        int i13;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z14 = false;
        int i14 = -1;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar instanceof f30) {
                f30 f30Var2 = (f30) sVar;
                if (i14 == -1 && a0.N(f30Var.getUid(), f30Var2.getUid())) {
                    i15 = i16;
                    i14 = i17;
                }
                arrayList.add(f30Var2);
                i17++;
            }
            i16++;
        }
        PinFeed pinFeed = new PinFeed();
        pinFeed.f35558j = this.f91750c;
        pinFeed.f105383c = this.f91751d;
        pinFeed.f105387g = 0;
        if (i14 == -1 || z13) {
            pinFeed.I(f30Var);
            i13 = 0;
        } else {
            int r03 = j1.r0(hf0.b.q());
            int i18 = r03 * 6;
            String.valueOf(i18);
            String.valueOf(r03 * 12);
            String.valueOf(r03 * 25);
            int max = Math.max(0, i14 - i18);
            arrayList.subList(0, max).clear();
            pinFeed.H(arrayList);
            i13 = i14 - max;
        }
        if (this.f91749b != null) {
            g3 g3Var = g3.f60489a;
            g3.a(f30Var);
            u.f85943a.d(new l2(q2.a().toString()));
            String uid = f30Var.getUid();
            i01.e k03 = this.f91749b.k0();
            if (k03 != null && a0.O(k03.z(), a4.AD_PREVIEW_FEED.name())) {
                z14 = true;
            }
            g0.p(this.f91748a, uid, f30Var.E6(), z14);
            if (k03 != null) {
                this.f91749b.v4(uid, pinFeed, i13, i15, k03);
            } else {
                this.f91749b.I4(uid, pinFeed, i13, i15, str);
            }
        }
    }
}
