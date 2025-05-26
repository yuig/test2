package a10;

import com.pinterest.api.model.sr;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x40.cj;

/* loaded from: classes.dex */
public abstract class a implements uf0.b {

    /* renamed from: a, reason: collision with root package name */
    public final uf0.a f243a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f244b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f245c;

    /* renamed from: d, reason: collision with root package name */
    public final String f246d;

    public a(e converter, c plankList, c apolloMap) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(plankList, "plankList");
        Intrinsics.checkNotNullParameter(apolloMap, "apolloMap");
        Intrinsics.checkNotNullParameter("345x", "sizeSpec");
        this.f243a = converter;
        this.f244b = plankList;
        this.f245c = apolloMap;
        this.f246d = "345x";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // uf0.b
    public final Object O(Object obj) {
        Object obj2;
        cj input = (cj) obj;
        Intrinsics.checkNotNullParameter(input, "input");
        List list = (List) this.f244b.invoke(input);
        if (list != null) {
            ArrayList Q = CollectionsKt.Q(list);
            obj2 = new ArrayList(g0.q(Q, 10));
            Iterator it = Q.iterator();
            while (it.hasNext()) {
                Object B = this.f243a.B(it.next());
                Intrinsics.f(B);
                obj2.add((sr) B);
            }
        } else {
            obj2 = q0.f80391a;
        }
        return z0.h(new Pair(this.f246d, obj2));
    }

    @Override // uf0.b
    public final Object k(Object obj) {
        List list;
        wy0 input = (wy0) obj;
        Intrinsics.checkNotNullParameter(input, "input");
        Map map = (Map) this.f245c.invoke(input);
        if (map == null || (list = (List) map.get(this.f246d)) == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f243a.i((sr) it.next()));
        }
        return CollectionsKt.F0(arrayList);
    }
}
