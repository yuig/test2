package ho;

import e2.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jo.m;
import jo.n;
import q7.v;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final int f69671b = Calendar.getInstance().get(1);

    /* renamed from: a, reason: collision with root package name */
    public final u f69672a;

    public g(u uVar) {
        this.f69672a = uVar;
    }

    public static void b(u uVar, CharSequence charSequence, n nVar, int i13, v vVar) {
        double a13 = new io.d(uVar, charSequence).a(nVar);
        if (i13 > 1) {
            a13 *= ((Double) ((Map) vVar.f102688b.get(nVar.f77174b - 1)).get(Integer.valueOf(i13 - 1))).doubleValue();
        }
        if (Double.isInfinite(a13)) {
            a13 = Double.MAX_VALUE;
        }
        long j13 = 1;
        if (i13 >= 2) {
            if (i13 > 19) {
                j13 = 9007199254740991L;
            } else {
                for (int i14 = 2; i14 <= i13; i14++) {
                    j13 *= i14;
                }
            }
        }
        double d2 = j13 * a13;
        if (Double.isInfinite(d2)) {
            d2 = Double.MAX_VALUE;
        }
        double pow = Math.pow(10000.0d, i13 - 1.0d) + d2;
        double d13 = Double.isInfinite(pow) ? Double.MAX_VALUE : pow;
        List list = vVar.f102689c;
        int i15 = nVar.f77175c;
        for (Map.Entry entry : ((Map) list.get(i15)).entrySet()) {
            if (((Integer) entry.getKey()).intValue() <= i13 && ((Double) entry.getValue()).doubleValue() <= d13) {
                return;
            }
        }
    }

    public final d a(CharSequence charSequence, List list) {
        u uVar;
        int length = charSequence.length();
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < length; i13++) {
            arrayList.add(new ArrayList());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            ((List) arrayList.get(nVar.f77175c)).add(nVar);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Collections.sort((List) it2.next(), new f());
        }
        int length2 = charSequence.length();
        v vVar = new v();
        vVar.f102687a = new ArrayList();
        vVar.f102688b = new ArrayList();
        vVar.f102689c = new ArrayList();
        for (int i14 = 0; i14 < length2; i14++) {
            vVar.f102687a.add(new HashMap());
            vVar.f102688b.add(new HashMap());
            vVar.f102689c.add(new HashMap());
        }
        int i15 = 0;
        while (i15 < length2) {
            Iterator it3 = ((List) arrayList.get(i15)).iterator();
            while (true) {
                boolean hasNext = it3.hasNext();
                uVar = this.f69672a;
                if (!hasNext) {
                    break;
                }
                n nVar2 = (n) it3.next();
                int i16 = nVar2.f77174b;
                if (i16 > 0) {
                    Iterator it4 = ((Map) vVar.f102687a.get(i16 - 1)).entrySet().iterator();
                    while (it4.hasNext()) {
                        b(uVar, charSequence, nVar2, ((Integer) ((Map.Entry) it4.next()).getKey()).intValue() + 1, vVar);
                    }
                } else {
                    b(uVar, charSequence, nVar2, 1, vVar);
                }
            }
            int i17 = i15 + 1;
            b(uVar, charSequence, new m(e.Bruteforce, 0, i15, charSequence.subSequence(0, i17)).a(), 1, vVar);
            for (int i18 = 1; i18 <= i15; i18++) {
                n a13 = new m(e.Bruteforce, i18, i15, charSequence.subSequence(i18, i17)).a();
                for (Map.Entry entry : ((Map) vVar.f102687a.get(i18 - 1)).entrySet()) {
                    int intValue = ((Integer) entry.getKey()).intValue();
                    if (((n) entry.getValue()).f77173a != e.Bruteforce) {
                        b(uVar, charSequence, a13, intValue + 1, vVar);
                    }
                }
            }
            i15 = i17;
        }
        int length3 = charSequence.length();
        ArrayList arrayList2 = new ArrayList();
        if (length3 > 0) {
            int i19 = length3 - 1;
            Map map = (Map) vVar.f102689c.get(i19);
            Double valueOf = Double.valueOf(Double.POSITIVE_INFINITY);
            int i23 = 0;
            for (Map.Entry entry2 : map.entrySet()) {
                Double d2 = (Double) entry2.getValue();
                if (d2.doubleValue() < valueOf.doubleValue()) {
                    i23 = ((Integer) entry2.getKey()).intValue();
                    valueOf = d2;
                }
            }
            while (i19 >= 0) {
                n nVar3 = (n) ((Map) vVar.f102687a.get(i19)).get(Integer.valueOf(i23));
                arrayList2.add(0, nVar3);
                i19 = nVar3.f77174b - 1;
                i23--;
            }
        }
        return new d(arrayList2, charSequence.length() == 0 ? 1.0d : ((Double) ((Map) vVar.f102689c.get(charSequence.length() - 1)).get(Integer.valueOf(arrayList2.size()))).doubleValue());
    }
}
