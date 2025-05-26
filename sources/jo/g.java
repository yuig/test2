package jo;

import e2.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class g extends c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77139b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f77140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u uVar, Map map, int i13) {
        super(uVar);
        this.f77139b = i13;
        if (i13 == 1) {
            super(uVar);
            if (map == null) {
                this.f77140c = new HashMap();
                return;
            } else {
                this.f77140c = map;
                return;
            }
        }
        if (i13 != 2) {
            if (map == null) {
                this.f77140c = new HashMap();
                return;
            } else {
                this.f77140c = map;
                return;
            }
        }
        super(uVar);
        ArrayList arrayList = new ArrayList();
        this.f77140c = arrayList;
        map = map == null ? new HashMap() : map;
        arrayList.add(new g(uVar, map, 0));
        arrayList.add(new g(uVar, map, 1));
        arrayList.add(new k(uVar, map));
        arrayList.add(new s(uVar));
        arrayList.add(new p(uVar));
        arrayList.add(new r(uVar));
        arrayList.add(new o(uVar));
        arrayList.add(new e(uVar));
    }

    @Override // jo.c
    public final ArrayList a(CharSequence charSequence) {
        int i13;
        int i14 = this.f77139b;
        int i15 = 0;
        Object obj = this.f77140c;
        switch (i14) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ho.j a13 = ho.j.a(charSequence);
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Map map = (Map) entry.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    int length = charSequence.length();
                    for (int i16 = i15; i16 < length; i16++) {
                        int i17 = i16;
                        while (i17 < length) {
                            int i18 = i17 + 1;
                            String jVar = a13.subSequence(i16, i18).toString();
                            Integer num = (Integer) map.get(jVar);
                            if (num != null) {
                                ho.j jVar2 = new ho.j(charSequence.subSequence(i16, i18));
                                int intValue = num.intValue();
                                m mVar = new m(ho.e.Dictionary, i16, i17, jVar2);
                                mVar.f77156e = jVar;
                                mVar.f77157f = intValue;
                                mVar.f77158g = str;
                                i13 = 0;
                                mVar.f77159h = false;
                                mVar.f77160i = false;
                                arrayList2.add(new n(mVar));
                            } else {
                                i13 = i15;
                            }
                            i15 = i13;
                            i17 = i18;
                        }
                    }
                    arrayList.addAll(arrayList2);
                }
                a13.f();
                c.b(arrayList);
                return arrayList;
            case 1:
                ho.j d2 = ho.j.d(charSequence);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = new g(this.f77131a, (Map) obj, 0).a(d2).iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    m mVar2 = new m(ho.e.Dictionary, (charSequence.length() - 1) - nVar.f77175c, (charSequence.length() - 1) - nVar.f77174b, ho.j.d(nVar.f77176d));
                    mVar2.f77156e = nVar.f77177e;
                    mVar2.f77157f = nVar.f77178f;
                    mVar2.f77158g = nVar.f77179g;
                    mVar2.f77159h = true;
                    mVar2.f77160i = false;
                    arrayList3.add(new n(mVar2));
                }
                c.b(arrayList3);
                return arrayList3;
            default:
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    arrayList4.addAll(((c) it2.next()).a(charSequence));
                }
                c.b(arrayList4);
                return arrayList4;
        }
    }
}
