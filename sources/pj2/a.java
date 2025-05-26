package pj2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f100342b = Logger.getLogger(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final c[] f100343a;

    public a(c[] cVarArr) {
        this.f100343a = cVarArr;
    }

    @Override // pj2.c
    public final zi2.c b(ArrayList arrayList) {
        c[] cVarArr = this.f100343a;
        ArrayList arrayList2 = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            try {
                arrayList2.add(cVar.b(arrayList));
            } catch (RuntimeException e13) {
                f100342b.log(Level.WARNING, "Exception thrown by the export.", (Throwable) e13);
                arrayList2.add(zi2.c.f142037f);
            }
        }
        return zi2.c.c(arrayList2);
    }

    @Override // pj2.c
    public final zi2.c shutdown() {
        c[] cVarArr = this.f100343a;
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            try {
                arrayList.add(cVar.shutdown());
            } catch (RuntimeException e13) {
                f100342b.log(Level.WARNING, "Exception thrown by the shutdown.", (Throwable) e13);
                arrayList.add(zi2.c.f142037f);
            }
        }
        return zi2.c.c(arrayList);
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("MultiSpanExporter{spanExporters="), Arrays.toString(this.f100343a), '}');
    }
}
