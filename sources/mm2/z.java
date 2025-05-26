package mm2;

import dm2.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87745i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f87746j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(c0 c0Var, int i13) {
        super(1);
        this.f87745i = i13;
        this.f87746j = c0Var;
    }

    public final Collection b(ym2.g name) {
        int i13 = this.f87745i;
        c0 c0Var = this.f87746j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(name, "name");
                c0 c0Var2 = c0Var.f87644c;
                if (c0Var2 != null) {
                    return (Collection) c0Var2.f87647f.invoke(name);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((c) c0Var.f87646e.invoke()).f(name).iterator();
                while (it.hasNext()) {
                    km2.g t13 = c0Var.t((gm2.z) it.next());
                    if (c0Var.r(t13)) {
                        ((re2.f) ((lm2.a) c0Var.f87643b.f107929a).f83937g).getClass();
                        arrayList.add(t13);
                    }
                }
                c0Var.j(arrayList, name);
                return arrayList;
            default:
                Intrinsics.checkNotNullParameter(name, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) c0Var.f87647f.invoke(name));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : linkedHashSet) {
                    String s13 = com.bumptech.glide.c.s((u0) obj, 2);
                    Object obj2 = linkedHashMap.get(s13);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(s13, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        List list2 = list;
                        Collection X = kg.p.X(list2, b0.f87641i);
                        linkedHashSet.removeAll(list2);
                        linkedHashSet.addAll(X);
                    }
                }
                c0Var.m(linkedHashSet, name);
                rg.a aVar = c0Var.f87643b;
                return CollectionsKt.F0(((lm2.a) aVar.f107929a).f83948r.h(aVar, linkedHashSet));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c0, code lost:
    
        if (xl2.v.c(r4) == false) goto L61;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.z.invoke(java.lang.Object):java.lang.Object");
    }
}
