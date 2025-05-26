package qm;

import com.google.gson.JsonSyntaxException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class p extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f104210a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f104211b;

    /* renamed from: c, reason: collision with root package name */
    public final pm.p f104212c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f104213d;

    public p(q qVar, nm.o oVar, Type type, nm.i0 i0Var, Type type2, nm.i0 i0Var2, pm.p pVar) {
        this.f104213d = qVar;
        this.f104210a = new f0(oVar, i0Var, type);
        this.f104211b = new f0(oVar, i0Var2, type2);
        this.f104212c = pVar;
    }

    public static String f(nm.s sVar) {
        sVar.getClass();
        if (!(sVar instanceof nm.v)) {
            if (sVar instanceof nm.t) {
                return "null";
            }
            throw new AssertionError();
        }
        nm.v j13 = sVar.j();
        Serializable serializable = j13.f91367a;
        if (serializable instanceof Number) {
            return String.valueOf(j13.n());
        }
        if (serializable instanceof Boolean) {
            return Boolean.toString(j13.b());
        }
        if (serializable instanceof String) {
            return j13.p();
        }
        throw new AssertionError();
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        um.b K = aVar.K();
        if (K == um.b.NULL) {
            aVar.B1();
            return null;
        }
        Map map = (Map) this.f104212c.u();
        if (K == um.b.BEGIN_ARRAY) {
            aVar.a();
            while (aVar.hasNext()) {
                aVar.a();
                Object c13 = this.f104210a.c(aVar);
                if (map.put(c13, this.f104211b.c(aVar)) != null) {
                    throw new JsonSyntaxException(a.a.i("duplicate key: ", c13));
                }
                aVar.f();
            }
            aVar.f();
        } else {
            aVar.c();
            while (aVar.hasNext()) {
                com.facebook.login.z.f30091b.getClass();
                if (aVar instanceof m) {
                    m mVar = (m) aVar;
                    mVar.b0(um.b.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) mVar.m0()).next();
                    mVar.q0(entry.getValue());
                    mVar.q0(new nm.v((String) entry.getKey()));
                } else {
                    int i13 = aVar.f122658h;
                    if (i13 == 0) {
                        i13 = aVar.e();
                    }
                    if (i13 == 13) {
                        aVar.f122658h = 9;
                    } else if (i13 == 12) {
                        aVar.f122658h = 8;
                    } else {
                        if (i13 != 14) {
                            throw aVar.a0("a name");
                        }
                        aVar.f122658h = 10;
                    }
                }
                Object c14 = this.f104210a.c(aVar);
                if (map.put(c14, this.f104211b.c(aVar)) != null) {
                    throw new JsonSyntaxException(a.a.i("duplicate key: ", c14));
                }
            }
            aVar.g();
        }
        return map;
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            cVar.m();
            return;
        }
        boolean z13 = this.f104213d.f104215b;
        f0 f0Var = this.f104211b;
        if (!z13) {
            cVar.d();
            for (Map.Entry entry : map.entrySet()) {
                cVar.h(String.valueOf(entry.getKey()));
                f0Var.e(cVar, entry.getValue());
            }
            cVar.g();
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        int i13 = 0;
        boolean z14 = false;
        for (Map.Entry entry2 : map.entrySet()) {
            nm.s d2 = this.f104210a.d(entry2.getKey());
            arrayList.add(d2);
            arrayList2.add(entry2.getValue());
            d2.getClass();
            z14 |= (d2 instanceof nm.q) || (d2 instanceof nm.u);
        }
        if (!z14) {
            cVar.d();
            int size = arrayList.size();
            while (i13 < size) {
                cVar.h(f((nm.s) arrayList.get(i13)));
                f0Var.e(cVar, arrayList2.get(i13));
                i13++;
            }
            cVar.g();
            return;
        }
        cVar.c();
        int size2 = arrayList.size();
        while (i13 < size2) {
            cVar.c();
            nm.s sVar = (nm.s) arrayList.get(i13);
            z0 z0Var = n1.B;
            z0Var.getClass();
            z0Var.e(sVar, cVar);
            f0Var.e(cVar, arrayList2.get(i13));
            cVar.f();
            i13++;
        }
        cVar.f();
    }
}
