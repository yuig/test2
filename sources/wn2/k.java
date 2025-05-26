package wn2;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zl2.q;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final ln2.k f130609a = new ln2.k(5);

    public static /* synthetic */ void a(int i13) {
        Object[] objArr = new Object[3];
        switch (i13) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i13) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void b(Object obj, AbstractCollection abstractCollection) {
        Intrinsics.checkNotNullParameter(abstractCollection, "<this>");
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List e(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return q0.f80391a;
        }
        if (size == 1) {
            return e0.b(CollectionsKt.S(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static Object f(Collection collection, a aVar, k kVar) {
        if (collection == null) {
            a(4);
            throw null;
        }
        km.c cVar = new km.c(1);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g(it.next(), aVar, cVar, kVar);
        }
        return kVar.j();
    }

    public static void g(Object obj, a aVar, km.c cVar, k kVar) {
        if (obj == null) {
            a(22);
            throw null;
        }
        if (cVar.f80163a.add(obj) && kVar.d(obj)) {
            Iterator it = aVar.a(obj).iterator();
            while (it.hasNext()) {
                g(it.next(), aVar, cVar, kVar);
            }
            kVar.c(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean h(Collection collection, a aVar, Function1 function1) {
        if (collection != null) {
            return (Boolean) f(collection, aVar, new q((Serializable) function1, new boolean[1], 2));
        }
        a(7);
        throw null;
    }

    public static final xm2.g i(ln2.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.getClass();
        return xm2.g.f135403g;
    }

    public void c(Object obj) {
    }

    public abstract boolean d(Object obj);

    public abstract Object j();
}
