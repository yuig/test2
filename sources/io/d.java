package io;

import e2.u;
import java.util.EnumMap;
import jo.n;

/* loaded from: classes3.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f72912c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumMap f72913d;

    public d(u uVar, CharSequence charSequence) {
        super(uVar);
        EnumMap enumMap = new EnumMap(ho.e.class);
        this.f72913d = enumMap;
        this.f72912c = charSequence;
        enumMap.put((EnumMap) ho.e.Bruteforce, (ho.e) new b(uVar, 0));
        enumMap.put((EnumMap) ho.e.Dictionary, (ho.e) new c(uVar));
        enumMap.put((EnumMap) ho.e.Spatial, (ho.e) new b(uVar, 3));
        enumMap.put((EnumMap) ho.e.Repeat, (ho.e) new b(uVar, 2));
        enumMap.put((EnumMap) ho.e.Sequence, (ho.e) new g(uVar));
        enumMap.put((EnumMap) ho.e.Regex, (ho.e) new f(uVar));
        enumMap.put((EnumMap) ho.e.Date, (ho.e) new b(uVar, 1));
    }

    @Override // io.e
    public final double a(n nVar) {
        Double d2 = nVar.f77194v;
        if (d2 != null) {
            return d2.doubleValue();
        }
        int i13 = 1;
        if (nVar.a() < this.f72912c.length()) {
            i13 = nVar.a() == 1 ? 10 : 50;
        }
        e eVar = (e) this.f72913d.get(nVar.f77173a);
        double max = Math.max(eVar != null ? eVar.a(nVar) : 0.0d, i13);
        nVar.f77194v = Double.valueOf(max);
        nVar.f77195w = Double.valueOf(Math.log(max) / Math.log(10.0d));
        return nVar.f77194v.doubleValue();
    }
}
