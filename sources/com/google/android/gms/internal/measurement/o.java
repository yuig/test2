package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class o extends j {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f31559c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f31560d;

    /* renamed from: e, reason: collision with root package name */
    public final m.h f31561e;

    public o(o oVar) {
        super(oVar.f31470a);
        ArrayList arrayList = new ArrayList(oVar.f31559c.size());
        this.f31559c = arrayList;
        arrayList.addAll(oVar.f31559c);
        ArrayList arrayList2 = new ArrayList(oVar.f31560d.size());
        this.f31560d = arrayList2;
        arrayList2.addAll(oVar.f31560d);
        this.f31561e = oVar.f31561e;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n a(m.h hVar, List list) {
        t tVar;
        m.h S = this.f31561e.S();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f31559c;
            int size = arrayList.size();
            tVar = n.Fn;
            if (i13 >= size) {
                break;
            }
            if (i13 < list.size()) {
                S.U((String) arrayList.get(i13), hVar.P((n) list.get(i13)));
            } else {
                S.U((String) arrayList.get(i13), tVar);
            }
            i13++;
        }
        Iterator it = this.f31560d.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            n P = S.P(nVar);
            if (P instanceof q) {
                P = S.P(nVar);
            }
            if (P instanceof h) {
                return ((h) P).f31411a;
            }
        }
        return tVar;
    }

    @Override // com.google.android.gms.internal.measurement.j, com.google.android.gms.internal.measurement.n
    public final n zzc() {
        return new o(this);
    }

    public o(String str, ArrayList arrayList, List list, m.h hVar) {
        super(str);
        this.f31559c = new ArrayList();
        this.f31561e = hVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f31559c.add(((n) it.next()).zzf());
            }
        }
        this.f31560d = new ArrayList(list);
    }
}
