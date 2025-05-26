package ads_mobile_sdk;

import a.h5;
import a.o3;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class k81 implements a.i5 {

    /* renamed from: a, reason: collision with root package name */
    public static final k81 f7161a = new k81();

    /* renamed from: b, reason: collision with root package name */
    public static final a12 f7162b = new a12(new h5(5), w61.class, a.a2.class);

    @Override // a.i5
    public final Object a(a.za zaVar, kb1 kb1Var, a.n4 n4Var) {
        jl jlVar;
        List arrayList;
        HashMap hashMap = new HashMap();
        int i13 = 0;
        while (true) {
            p51 p51Var = (p51) zaVar;
            if (i13 >= p51Var.f9560b.size()) {
                if (!kb1Var.f7208a.isEmpty()) {
                    a.eg egVar = (a.eg) ze1.f14724b.f14726a.get();
                    if (egVar == null) {
                        egVar = ze1.f14725c;
                    }
                    egVar.getClass();
                }
                p51Var.a();
                return new j81(new my1(hashMap));
            }
            o51 a13 = p51Var.a(i13);
            if (a13.f9144b.equals(x41.f13478b)) {
                a.a2 a2Var = (a.a2) ((o3) n4Var).c(a13);
                a.i7 i7Var = a13.f9143a;
                if (i7Var instanceof a.r3) {
                    jlVar = ((a.r3) i7Var).b();
                } else {
                    if (!(i7Var instanceof w61)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + i7Var.getClass().getName() + " with parameters " + i7Var.a());
                    }
                    jlVar = ((w61) i7Var).f12880b;
                }
                i81 i81Var = new i81(a2Var, a13.f9145c);
                byte[] bArr = jlVar.f6862a;
                if (bArr.length != 0 && bArr.length != 5) {
                    throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
                }
                if (hashMap.containsKey(jlVar)) {
                    arrayList = (List) hashMap.get(jlVar);
                } else {
                    arrayList = new ArrayList();
                    hashMap.put(jlVar, arrayList);
                }
                arrayList.add(i81Var);
            }
            i13++;
        }
    }

    @Override // a.i5
    public final Class b() {
        return a.a2.class;
    }

    @Override // a.i5
    public final Class a() {
        return a.a2.class;
    }
}
