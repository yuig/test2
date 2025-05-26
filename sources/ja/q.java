package ja;

import java.util.Set;
import kotlin.collections.g1;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final p f75254a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f75255b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f75256c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f75257d;

    public q(p observer, int[] tableIds, String[] tableNames) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f75254a = observer;
        this.f75255b = tableIds;
        this.f75256c = tableNames;
        this.f75257d = (tableNames.length == 0) ^ true ? g1.b(tableNames[0]) : s0.f80394a;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final void a(Set invalidatedTablesIds) {
        Set set;
        Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.f75255b;
        int length = iArr.length;
        if (length != 0) {
            int i13 = 0;
            if (length != 1) {
                yk2.o oVar = new yk2.o();
                int length2 = iArr.length;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = i14 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr[i13]))) {
                        oVar.add(this.f75256c[i14]);
                    }
                    i13++;
                    i14 = i15;
                }
                set = g1.a(oVar);
            } else {
                set = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f75257d : s0.f80394a;
            }
        } else {
            set = s0.f80394a;
        }
        if (!set.isEmpty()) {
            this.f75254a.b(set);
        }
    }

    public final void b(String[] tables) {
        Set set;
        Intrinsics.checkNotNullParameter(tables, "tables");
        String[] strArr = this.f75256c;
        int length = strArr.length;
        if (length == 0) {
            set = s0.f80394a;
        } else if (length == 1) {
            int length2 = tables.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    set = s0.f80394a;
                    break;
                } else {
                    if (kotlin.text.z.i(tables[i13], strArr[0], true)) {
                        set = this.f75257d;
                        break;
                    }
                    i13++;
                }
            }
        } else {
            yk2.o oVar = new yk2.o();
            for (String str : tables) {
                for (String str2 : strArr) {
                    if (kotlin.text.z.i(str2, str, true)) {
                        oVar.add(str2);
                    }
                }
            }
            set = g1.a(oVar);
        }
        if (!set.isEmpty()) {
            this.f75254a.b(set);
        }
    }
}
