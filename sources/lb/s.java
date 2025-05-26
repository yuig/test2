package lb;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String f82667a = kb.b0.h("Schedulers");

    public static void a(tb.y yVar, bk.f fVar, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            fVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yVar.l(currentTimeMillis, ((tb.s) it.next()).f117016a);
            }
        }
    }

    public static void b(kb.d dVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        tb.y y13 = workDatabase.y();
        workDatabase.c();
        try {
            ArrayList f13 = y13.f();
            a(y13, dVar.f78973d, f13);
            ArrayList e13 = y13.e(dVar.f78980k);
            a(y13, dVar.f78973d, e13);
            e13.addAll(f13);
            ArrayList d2 = y13.d();
            workDatabase.r();
            workDatabase.m();
            if (e13.size() > 0) {
                tb.s[] sVarArr = (tb.s[]) e13.toArray(new tb.s[e13.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    if (qVar.d()) {
                        qVar.c(sVarArr);
                    }
                }
            }
            if (d2.size() > 0) {
                tb.s[] sVarArr2 = (tb.s[]) d2.toArray(new tb.s[d2.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    q qVar2 = (q) it2.next();
                    if (!qVar2.d()) {
                        qVar2.c(sVarArr2);
                    }
                }
            }
        } catch (Throwable th3) {
            workDatabase.m();
            throw th3;
        }
    }
}
