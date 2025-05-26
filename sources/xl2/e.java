package xl2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f135265a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f135266b;

    static {
        Set<o> set = o.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(g0.q(set, 10));
        for (o primitiveType : set) {
            Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
            ym2.c c13 = r.f135332l.c(primitiveType.getTypeName());
            Intrinsics.checkNotNullExpressionValue(c13, "child(...)");
            arrayList.add(c13);
        }
        ym2.c g13 = q.f135300f.g();
        Intrinsics.checkNotNullExpressionValue(g13, "toSafe(...)");
        ArrayList m03 = CollectionsKt.m0(g13, arrayList);
        ym2.c g14 = q.f135302h.g();
        Intrinsics.checkNotNullExpressionValue(g14, "toSafe(...)");
        ArrayList m04 = CollectionsKt.m0(g14, m03);
        ym2.c g15 = q.f135304j.g();
        Intrinsics.checkNotNullExpressionValue(g15, "toSafe(...)");
        ArrayList m05 = CollectionsKt.m0(g15, m04);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = m05.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(ym2.b.j((ym2.c) it.next()));
        }
        f135266b = linkedHashSet;
    }
}
