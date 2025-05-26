package xs;

import com.pinterest.api.model.b1;
import com.pinterest.api.model.ec;
import com.pinterest.api.model.f1;
import com.pinterest.api.model.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class z {
    public static b32.j a(b1 adsCartingData, int i13) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(adsCartingData, "adsCartingData");
        List i14 = adsCartingData.i();
        f1 f1Var = i14 != null ? (f1) i14.get(i13) : null;
        if (f1Var == null) {
            return null;
        }
        Short valueOf = Short.valueOf((short) i13);
        String f13 = adsCartingData.f();
        String g13 = adsCartingData.g();
        if (g13 == null) {
            g13 = "";
        }
        b32.e valueOf2 = b32.e.valueOf(g13);
        if (valueOf2 == null) {
            valueOf2 = b32.e.NONE;
        }
        b32.e eVar = valueOf2;
        String k13 = f1Var.k();
        String l13 = f1Var.l();
        String n13 = f1Var.n();
        String j13 = f1Var.j();
        Double m13 = f1Var.m();
        List i15 = f1Var.i();
        if (i15 != null) {
            List<ec> list = i15;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list, 10));
            for (ec ecVar : list) {
                b32.g gVar = b32.i.Companion;
                ec.a f14 = ecVar.f();
                int value = f14 != null ? f14.getValue() : b32.i.DELIVERY.getValue();
                gVar.getClass();
                arrayList2.add(new b32.f(value != 0 ? value != 1 ? null : b32.i.PICKUP : b32.i.DELIVERY, ecVar.e()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new b32.j(k13, n13, eVar, valueOf, arrayList, j13, m13, l13, f13, f1Var.h());
    }

    public static b32.b b(b1 b1Var, String str, Integer num) {
        ArrayList arrayList;
        b32.j jVar;
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        String g13 = b1Var.g();
        String f13 = b1Var.f();
        Short valueOf = Short.valueOf((short) k.a.CARTING.getValue());
        Long valueOf2 = Long.valueOf(b1Var.h().intValue());
        if (num != null) {
            b32.j a13 = a(b1Var, num.intValue());
            if (a13 != null) {
                jVar = a13;
                arrayList = null;
            } else {
                arrayList = null;
                jVar = null;
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            List i13 = b1Var.i();
            if (i13 != null) {
                int i14 = 0;
                for (Object obj : i13) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    b32.j a14 = a(b1Var, i14);
                    if (a14 != null) {
                        arrayList2.add(a14);
                    }
                    i14 = i15;
                }
            }
            arrayList = arrayList2;
            jVar = null;
        }
        return new b32.b(str, g13, f13, arrayList, jVar, valueOf, null, valueOf2);
    }
}
