package ads_mobile_sdk;

import a.m0;
import a.o3;
import a.s;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class cn implements a.i5 {

    /* renamed from: a, reason: collision with root package name */
    public static final cn f3969a = new cn();

    @Override // a.i5
    public final Object a(a.za zaVar, kb1 kb1Var, a.n4 n4Var) {
        jl jlVar;
        List list;
        p51 p51Var = (p51) zaVar;
        o51 a13 = p51Var.a();
        HashMap hashMap = new HashMap();
        for (int i13 = 0; i13 < p51Var.f9560b.size(); i13++) {
            o51 a14 = p51Var.a(i13);
            if (a14.f9144b.equals(x41.f13478b)) {
                s sVar = (s) ((o3) n4Var).c(a14);
                a.i7 i7Var = a14.f9143a;
                if (i7Var instanceof a.r3) {
                    jlVar = ((a.r3) i7Var).b();
                } else {
                    if (!(i7Var instanceof w61)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + i7Var.getClass().getName() + " with parameters " + i7Var.a());
                    }
                    jlVar = ((w61) i7Var).f12880b;
                }
                byte[] bArr = jlVar.f6862a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (hashMap.containsKey(jlVar)) {
                    list = (List) hashMap.get(jlVar);
                } else {
                    ArrayList arrayList = new ArrayList();
                    hashMap.put(jlVar, arrayList);
                    list = arrayList;
                }
                list.add(sVar);
            }
        }
        return new m0(0);
    }

    @Override // a.i5
    public final Class b() {
        return s.class;
    }

    @Override // a.i5
    public final Class a() {
        return s.class;
    }
}
