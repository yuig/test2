package t3;

import android.graphics.Rect;
import android.graphics.Region;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class r3 {

    /* renamed from: a, reason: collision with root package name */
    public static final a3.d f116181a = new a3.d(0.0f, 0.0f, 10.0f, 10.0f);

    public static final g1.u a(z3.r rVar) {
        z3.q a13 = rVar.a();
        g1.u uVar = g1.m.f63284a;
        g1.u uVar2 = new g1.u();
        s3.k0 k0Var = a13.f140713c;
        if (k0Var.H() && k0Var.G()) {
            a3.d f13 = a13.f();
            b(new Region(Math.round(f13.f484a), Math.round(f13.f485b), Math.round(f13.f486c), Math.round(f13.f487d)), a13, uVar2, a13, new Region());
        }
        return uVar2;
    }

    public static final void b(Region region, z3.q qVar, g1.u uVar, z3.q qVar2, Region region2) {
        s3.k0 k0Var;
        s3.m F;
        boolean H = qVar2.f140713c.H();
        s3.k0 k0Var2 = qVar2.f140713c;
        boolean z13 = (H && k0Var2.G()) ? false : true;
        boolean isEmpty = region.isEmpty();
        int i13 = qVar.f140717g;
        int i14 = qVar2.f140717g;
        if (!isEmpty || i14 == i13) {
            if (!z13 || qVar2.f140715e) {
                z3.j jVar = qVar2.f140714d;
                boolean z14 = jVar.f140701b;
                s3.m mVar = qVar2.f140711a;
                if (z14 && (F = ao2.m0.F(k0Var2)) != null) {
                    mVar = F;
                }
                u2.p pVar = ((u2.p) mVar).f120042a;
                Object obj = jVar.f140700a.get(z3.i.f140675b);
                if (obj == null) {
                    obj = null;
                }
                boolean z15 = obj != null;
                boolean z16 = pVar.f120042a.f120054m;
                a3.d dVar = a3.d.f483e;
                if (z16) {
                    if (z15) {
                        s3.q1 S0 = com.bumptech.glide.c.S0(pVar, 8);
                        if (S0.X0().f120054m) {
                            q3.x e13 = androidx.compose.ui.layout.b.e(S0);
                            a3.b bVar = S0.f110912z;
                            if (bVar == null) {
                                bVar = new a3.b();
                                bVar.f478a = 0.0f;
                                bVar.f479b = 0.0f;
                                bVar.f480c = 0.0f;
                                bVar.f481d = 0.0f;
                                S0.f110912z = bVar;
                            }
                            long M0 = S0.M0(S0.W0());
                            bVar.f478a = -a3.f.d(M0);
                            bVar.f479b = -a3.f.b(M0);
                            bVar.f480c = a3.f.d(M0) + S0.i0();
                            bVar.f481d = a3.f.b(M0) + S0.e0();
                            while (true) {
                                if (S0 == e13) {
                                    dVar = new a3.d(bVar.f478a, bVar.f479b, bVar.f480c, bVar.f481d);
                                    break;
                                }
                                S0.m1(bVar, false, true);
                                if (bVar.b()) {
                                    break;
                                }
                                S0 = S0.f110901o;
                                Intrinsics.f(S0);
                            }
                        }
                    } else {
                        s3.q1 S02 = com.bumptech.glide.c.S0(pVar, 8);
                        dVar = androidx.compose.ui.layout.b.e(S02).J(S02, true);
                    }
                }
                int round = Math.round(dVar.f484a);
                int round2 = Math.round(dVar.f485b);
                int round3 = Math.round(dVar.f486c);
                int round4 = Math.round(dVar.f487d);
                region2.set(round, round2, round3, round4);
                if (i14 == i13) {
                    i14 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (qVar2.f140715e) {
                        z3.q k13 = qVar2.k();
                        a3.d f13 = (k13 == null || (k0Var = k13.f140713c) == null || !k0Var.H()) ? f116181a : k13.f();
                        uVar.l(i14, new q3(qVar2, new Rect(Math.round(f13.f484a), Math.round(f13.f485b), Math.round(f13.f486c), Math.round(f13.f487d))));
                        return;
                    } else {
                        if (i14 == -1) {
                            uVar.l(i14, new q3(qVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                uVar.l(i14, new q3(qVar2, region2.getBounds()));
                List i15 = z3.q.i(qVar2, true, 4);
                for (int size = i15.size() - 1; -1 < size; size--) {
                    b(region, qVar, uVar, (z3.q) i15.get(size), region2);
                }
                if (d(qVar2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final b4.m0 c(z3.j jVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        z3.x xVar = z3.i.f140674a;
        z3.a aVar = (z3.a) bs1.c.M0(jVar, z3.i.f140674a);
        if (aVar == null || (function1 = (Function1) aVar.f140659b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (b4.m0) arrayList.get(0);
    }

    public static final boolean d(z3.q qVar) {
        z3.j jVar = qVar.f140714d;
        if (!jVar.f140701b) {
            Set keySet = jVar.f140700a.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (((z3.x) it.next()).f140763c) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final p4.j e(w1 w1Var, int i13) {
        Object obj;
        Iterator it = w1Var.f116251b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((s3.k0) ((Map.Entry) obj).getKey()).f110814b == i13) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (p4.j) entry.getValue();
        }
        return null;
    }

    public static final String f(int i13) {
        if (z3.g.a(i13, 0)) {
            return "android.widget.Button";
        }
        if (z3.g.a(i13, 1)) {
            return "android.widget.CheckBox";
        }
        if (z3.g.a(i13, 3)) {
            return "android.widget.RadioButton";
        }
        if (z3.g.a(i13, 5)) {
            return "android.widget.ImageView";
        }
        if (z3.g.a(i13, 6)) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
