package gd2;

import java.util.ArrayList;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends o {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f64830a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f64831b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f64832c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f64833d;

    public c(ee2.b bVar, Function0 onAnyChange, int i13) {
        a onItemAdded = a.f64826j;
        Function1 onItemRemoved = bVar;
        onItemRemoved = (i13 & 2) != 0 ? a.f64827k : onItemRemoved;
        onAnyChange = (i13 & 4) != 0 ? b.f64829i : onAnyChange;
        Intrinsics.checkNotNullParameter(onItemAdded, "onItemAdded");
        Intrinsics.checkNotNullParameter(onItemRemoved, "onItemRemoved");
        Intrinsics.checkNotNullParameter(onAnyChange, "onAnyChange");
        this.f64830a = onItemAdded;
        this.f64831b = onItemRemoved;
        this.f64832c = onAnyChange;
        this.f64833d = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        this.f64833d.add(i13, obj);
        this.f64830a.invoke(obj);
        this.f64832c.invoke();
    }

    @Override // kotlin.collections.o
    public final int b() {
        return this.f64833d.size();
    }

    @Override // kotlin.collections.o
    public final Object c(int i13) {
        Object remove = this.f64833d.remove(i13);
        this.f64831b.invoke(remove);
        this.f64832c.invoke();
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return this.f64833d.get(i13);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        Object obj2 = this.f64833d.set(i13, obj);
        this.f64831b.invoke(obj2);
        this.f64830a.invoke(obj);
        this.f64832c.invoke();
        return obj2;
    }
}
