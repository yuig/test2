package u50;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public final List f120567a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f120568b;

    public k(List dimensions, Function2 operation) {
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f120567a = dimensions;
        this.f120568b = operation;
    }

    @Override // u50.a0
    public final Integer a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List list = this.f120567a;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer a13 = ((n) it.next()).a(context);
            a13.getClass();
            arrayList.add(a13);
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = this.f120568b.invoke(next, it2.next());
        }
        return (Integer) next;
    }
}
