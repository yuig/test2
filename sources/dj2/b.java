package dj2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f55153b = Logger.getLogger(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final a[] f55154a;

    public b(a[] aVarArr) {
        this.f55154a = aVarArr;
    }

    @Override // dj2.a
    public final zi2.c b(ArrayList arrayList) {
        a[] aVarArr = this.f55154a;
        ArrayList arrayList2 = new ArrayList(aVarArr.length);
        for (a aVar : aVarArr) {
            try {
                arrayList2.add(aVar.b(arrayList));
            } catch (RuntimeException e13) {
                f55153b.log(Level.WARNING, "Exception thrown by the export.", (Throwable) e13);
                arrayList2.add(zi2.c.f142037f);
            }
        }
        return zi2.c.c(arrayList2);
    }

    @Override // dj2.a
    public final zi2.c shutdown() {
        a[] aVarArr = this.f55154a;
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (a aVar : aVarArr) {
            try {
                arrayList.add(aVar.shutdown());
            } catch (RuntimeException e13) {
                f55153b.log(Level.WARNING, "Exception thrown by the shutdown.", (Throwable) e13);
                arrayList.add(zi2.c.f142037f);
            }
        }
        return zi2.c.c(arrayList);
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("MultiLogRecordExporter{logRecordExporters="), Arrays.toString(this.f55154a), '}');
    }
}
