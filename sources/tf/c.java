package tf;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import sf.n;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a */
    public float f117503a;

    /* renamed from: b */
    public float f117504b;

    /* renamed from: c */
    public float f117505c;

    /* renamed from: d */
    public float f117506d;

    /* renamed from: e */
    public float f117507e;

    /* renamed from: f */
    public float f117508f;

    /* renamed from: g */
    public float f117509g;

    /* renamed from: h */
    public float f117510h;

    /* renamed from: i */
    public ArrayList f117511i;

    public final void a(xf.b bVar) {
        if (this.f117503a < ((e) bVar).f117527p) {
            this.f117503a = ((e) bVar).f117527p;
        }
        float f13 = this.f117504b;
        e eVar = (e) bVar;
        float f14 = eVar.f117528q;
        if (f13 > f14) {
            this.f117504b = f14;
        }
        float f15 = this.f117505c;
        float f16 = eVar.f117529r;
        if (f15 < f16) {
            this.f117505c = f16;
        }
        float f17 = this.f117506d;
        float f18 = eVar.f117530s;
        if (f17 > f18) {
            this.f117506d = f18;
        }
        if (eVar.f117515d == n.LEFT) {
            float f19 = this.f117507e;
            float f23 = eVar.f117527p;
            if (f19 < f23) {
                this.f117507e = f23;
            }
            if (this.f117508f > f14) {
                this.f117508f = f14;
                return;
            }
            return;
        }
        float f24 = this.f117509g;
        float f25 = eVar.f117527p;
        if (f24 < f25) {
            this.f117509g = f25;
        }
        if (this.f117510h > f14) {
            this.f117510h = f14;
        }
    }

    public xf.b b(int i13) {
        ArrayList arrayList = this.f117511i;
        if (arrayList == null || i13 < 0 || i13 >= arrayList.size()) {
            return null;
        }
        return (xf.b) arrayList.get(i13);
    }

    public final int c() {
        ArrayList arrayList = this.f117511i;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final int d() {
        Iterator it = this.f117511i.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            i13 += ((e) ((xf.b) it.next())).f117526o.size();
        }
        return i13;
    }

    public Entry e(vf.c cVar) {
        int i13 = cVar.f125770f;
        ArrayList arrayList = this.f117511i;
        if (i13 >= arrayList.size()) {
            return null;
        }
        e eVar = (e) ((xf.b) arrayList.get(cVar.f125770f));
        eVar.getClass();
        return eVar.f(cVar.f125765a, cVar.f125766b, d.CLOSEST);
    }
}
