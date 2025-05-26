package vm2;

import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import tm2.k0;
import tm2.l0;
import tm2.m0;
import tm2.n0;
import xk2.w;

/* loaded from: classes2.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f126246a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f126247b;

    public h(n0 strings, m0 qualifiedNames) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(qualifiedNames, "qualifiedNames");
        this.f126246a = strings;
        this.f126247b = qualifiedNames;
    }

    @Override // vm2.f
    public final boolean a(int i13) {
        return ((Boolean) d(i13).f135236c).booleanValue();
    }

    @Override // vm2.f
    public final String b(int i13) {
        w d2 = d(i13);
        List list = (List) d2.f135234a;
        String Z = CollectionsKt.Z((List) d2.f135235b, ".", null, null, 0, null, null, 62);
        if (list.isEmpty()) {
            return Z;
        }
        return CollectionsKt.Z(list, "/", null, null, 0, null, null, 62) + '/' + Z;
    }

    @Override // vm2.f
    public final String c(int i13) {
        String str = (String) this.f126246a.f118407b.get(i13);
        Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        return str;
    }

    public final w d(int i13) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z13 = false;
        while (i13 != -1) {
            l0 l0Var = (l0) this.f126247b.f118398b.get(i13);
            String str = (String) this.f126246a.f118407b.get(l0Var.f118382d);
            k0 k0Var = l0Var.f118383e;
            Intrinsics.f(k0Var);
            int i14 = g.f126245a[k0Var.ordinal()];
            if (i14 == 1) {
                linkedList2.addFirst(str);
            } else if (i14 == 2) {
                linkedList.addFirst(str);
            } else if (i14 == 3) {
                linkedList2.addFirst(str);
                z13 = true;
            }
            i13 = l0Var.f118381c;
        }
        return new w(linkedList, linkedList2, Boolean.valueOf(z13));
    }
}
