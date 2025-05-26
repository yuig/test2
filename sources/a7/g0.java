package a7;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class g0 implements mk.f {

    /* renamed from: a */
    public int f1020a;

    /* renamed from: b */
    public int f1021b;

    /* renamed from: c */
    public Comparable f1022c;

    /* renamed from: d */
    public Object f1023d;

    /* renamed from: e */
    public Object f1024e;

    /* renamed from: f */
    public Object f1025f;

    /* renamed from: g */
    public Object f1026g;

    public static f0 a(g0 g0Var) {
        return new f0(g0Var);
    }

    public final h0 b() {
        return new h0(this);
    }

    public final void c() {
        this.f1023d = o0.r("text/vtt");
    }

    @Override // mk.f
    public final jk.d j(jk.d dVar) {
        List list;
        List list2;
        Integer num = (Integer) this.f1022c;
        int i13 = this.f1020a;
        Long l13 = (Long) this.f1023d;
        Long l14 = (Long) this.f1024e;
        List list3 = (List) this.f1025f;
        List list4 = (List) this.f1026g;
        int i14 = mk.a.f87285p;
        jk.d a13 = dVar == null ? jk.d.a(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : dVar;
        int intValue = num == null ? a13.f76320a : num.intValue();
        long longValue = l13 == null ? a13.f76323d : l13.longValue();
        long longValue2 = l14 == null ? a13.f76324e : l14.longValue();
        if (list3 == null) {
            List list5 = a13.f76325f;
            list = list5 != null ? new ArrayList(list5) : new ArrayList();
        } else {
            list = list3;
        }
        if (list4 == null) {
            List list6 = a13.f76326g;
            list2 = list6 != null ? new ArrayList(list6) : new ArrayList();
        } else {
            list2 = list4;
        }
        return jk.d.a(intValue, i13, this.f1021b, longValue, longValue2, list, list2);
    }
}
