package qo2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final oo2.g[] f104646a = new oo2.g[0];

    /* renamed from: b, reason: collision with root package name */
    public static final no2.b[] f104647b = new no2.b[0];

    public static final Set a(oo2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof k) {
            return ((k) gVar).a();
        }
        HashSet hashSet = new HashSet(gVar.e());
        int e13 = gVar.e();
        for (int i13 = 0; i13 < e13; i13++) {
            hashSet.add(gVar.f(i13));
        }
        return hashSet;
    }

    public static final oo2.g[] b(List list) {
        oo2.g[] gVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (gVarArr = (oo2.g[]) list.toArray(new oo2.g[0])) == null) ? f104646a : gVarArr;
    }
}
