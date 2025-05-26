package oi;

import com.google.android.gms.internal.measurement.d9;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class j7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f94881a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f94882b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.u3 f94883c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f94884d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f94885e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f94886f;

    /* renamed from: g, reason: collision with root package name */
    public final g1.g f94887g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i7 f94888h;

    public j7(i7 i7Var, String str) {
        this.f94888h = i7Var;
        this.f94881a = str;
        this.f94882b = true;
        this.f94884d = new BitSet();
        this.f94885e = new BitSet();
        this.f94886f = new g1.g(0);
        this.f94887g = new g1.g(0);
    }

    public final void a(c cVar) {
        int r13;
        com.google.android.gms.internal.measurement.a6 a6Var = cVar.f94706i;
        int i13 = cVar.f94704g;
        switch (i13) {
            case 0:
                r13 = ((com.google.android.gms.internal.measurement.c2) a6Var).r();
                break;
            default:
                r13 = ((com.google.android.gms.internal.measurement.u1) a6Var).v();
                break;
        }
        Boolean bool = cVar.f94717c;
        if (bool != null) {
            this.f94885e.set(r13, bool.booleanValue());
        }
        Boolean bool2 = cVar.f94718d;
        if (bool2 != null) {
            this.f94884d.set(r13, bool2.booleanValue());
        }
        if (cVar.f94719e != null) {
            Integer valueOf = Integer.valueOf(r13);
            Map map = this.f94886f;
            Long l13 = (Long) map.get(valueOf);
            long longValue = cVar.f94719e.longValue() / 1000;
            if (l13 == null || longValue > l13.longValue()) {
                map.put(Integer.valueOf(r13), Long.valueOf(longValue));
            }
        }
        if (cVar.f94720f != null) {
            g1.g gVar = this.f94887g;
            List list = (List) gVar.get(Integer.valueOf(r13));
            if (list == null) {
                list = new ArrayList();
                gVar.put(Integer.valueOf(r13), list);
            }
            switch (i13) {
                case 0:
                    list.clear();
                    break;
            }
            d9.a();
            i7 i7Var = this.f94888h;
            e l14 = i7Var.l();
            s3 s3Var = s.f95098f0;
            String str = this.f94881a;
            if (l14.x(str, s3Var)) {
                switch (i13) {
                    case 0:
                        break;
                    default:
                        if (((com.google.android.gms.internal.measurement.u1) cVar.f94706i).D()) {
                            list.clear();
                            break;
                        }
                        break;
                }
            }
            d9.a();
            if (!i7Var.l().x(str, s3Var)) {
                list.add(Long.valueOf(cVar.f94720f.longValue() / 1000));
                return;
            }
            long longValue2 = cVar.f94720f.longValue() / 1000;
            if (list.contains(Long.valueOf(longValue2))) {
                return;
            }
            list.add(Long.valueOf(longValue2));
        }
    }

    public j7(i7 i7Var, String str, com.google.android.gms.internal.measurement.u3 u3Var, BitSet bitSet, BitSet bitSet2, g1.g gVar, g1.g gVar2) {
        this.f94888h = i7Var;
        this.f94881a = str;
        this.f94884d = bitSet;
        this.f94885e = bitSet2;
        this.f94886f = gVar;
        this.f94887g = new g1.g(0);
        Iterator it = ((g1.c) gVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) gVar2.get(num));
            this.f94887g.put(num, arrayList);
        }
        this.f94882b = false;
        this.f94883c = u3Var;
    }
}
