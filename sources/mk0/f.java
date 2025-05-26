package mk0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import x40.f7;
import z40.d0;

/* loaded from: classes5.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f87346a = new f();

    public static boolean a(String str, List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((d0) it.next()).a(), str)) {
                return true;
            }
        }
        return false;
    }

    public final List b(f7 f7Var, f7 f7Var2, List collaborators) {
        Intrinsics.checkNotNullParameter(collaborators, "collaborators");
        if (f7Var != null) {
            String str = f7Var2 != null ? f7Var2.f132378c : null;
            if (Intrinsics.d(f7Var.f132378c, str)) {
                List b13 = e0.b(f7Var);
                ArrayList arrayList = new ArrayList();
                for (Object obj : collaborators) {
                    if (!Intrinsics.d(((d0) obj).a(), r2)) {
                        arrayList.add(obj);
                    }
                }
                return CollectionsKt.l0(CollectionsKt.x0(arrayList, new b4.f(13)), b13);
            }
        }
        if (f7Var == null) {
            if (f7Var2 != null) {
                if (a(f7Var2.f132378c, collaborators)) {
                    List b14 = e0.b(f7Var2);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : collaborators) {
                        if (!Intrinsics.d(((d0) obj2).a(), r6)) {
                            arrayList2.add(obj2);
                        }
                    }
                    return CollectionsKt.l0(CollectionsKt.x0(arrayList2, new b4.f(16)), b14);
                }
            }
            return CollectionsKt.x0(collaborators, new b4.f(17));
        }
        String str2 = f7Var.f132378c;
        if (f7Var2 != null) {
            String str3 = f7Var2.f132378c;
            if (a(str3, collaborators)) {
                List j13 = f0.j(f7Var, f7Var2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : collaborators) {
                    d0 d0Var = (d0) obj3;
                    if (!Intrinsics.d(d0Var.a(), str3) && !Intrinsics.d(d0Var.a(), str2)) {
                        arrayList3.add(obj3);
                    }
                }
                return CollectionsKt.l0(CollectionsKt.x0(arrayList3, new b4.f(14)), j13);
            }
        }
        List b15 = e0.b(f7Var);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : collaborators) {
            if (!Intrinsics.d(((d0) obj4).a(), str2)) {
                arrayList4.add(obj4);
            }
        }
        return CollectionsKt.l0(CollectionsKt.x0(arrayList4, new b4.f(15)), b15);
    }
}
