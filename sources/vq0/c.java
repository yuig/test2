package vq0;

import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;

/* loaded from: classes.dex */
public abstract class c extends g implements e {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f126435b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uk1.d pinalytics, q networkStateStream) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f126435b = new ArrayList();
    }

    public final void B3(w diff, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(diff, "diff");
        ArrayList arrayList = this.f126435b;
        arrayList.clear();
        arrayList.addAll(0, items);
        diff.a(new androidx.appcompat.widget.q(this, 1));
    }

    @Override // sq0.e0
    public final int a() {
        return this.f126435b.size();
    }

    public List d() {
        List unmodifiableList = Collections.unmodifiableList(this.f126435b);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    @Override // vq0.e, nr0.a
    public final Object getItem(int i13) {
        if (i13 >= 0) {
            ArrayList arrayList = this.f126435b;
            if (i13 < arrayList.size()) {
                return arrayList.get(i13);
            }
        }
        return null;
    }

    @Override // vq0.e
    public final void j2(Object obj) {
        this.f126435b.add(obj);
        Object adapter = getAdapter();
        if (adapter != null) {
            ((b2) adapter).j(r0.size() - 1);
        }
    }

    @Override // vq0.e
    public final void n3(int i13, int i14) {
        if (i13 == i14) {
            return;
        }
        ArrayList arrayList = this.f126435b;
        arrayList.add(i14, arrayList.remove(i13));
        Object adapter = getAdapter();
        if (adapter != null) {
            ((b2) adapter).k(i13, i14);
        }
    }

    @Override // vq0.e
    public final void removeItem(int i13) {
        this.f126435b.remove(i13);
        Object adapter = getAdapter();
        if (adapter != null) {
            ((b2) adapter).p(i13);
        }
    }

    @Override // vq0.g
    public boolean t3() {
        return !(this instanceof xp0.d);
    }

    @Override // vq0.e
    public final void u1(int i13, Object obj) {
        Object adapter;
        this.f126435b.set(i13, obj);
        if (isBound() && (adapter = getAdapter()) != null) {
            ((b2) adapter).i(i13);
        }
    }

    public final void u3(List list) {
        if (list != null) {
            ArrayList arrayList = this.f126435b;
            int size = arrayList.size();
            arrayList.addAll(list);
            Object adapter = getAdapter();
            if (adapter != null) {
                ((b2) adapter).n(size, list.size());
            }
        }
    }

    public final void v3() {
        this.f126435b.clear();
        Object adapter = getAdapter();
        if (adapter != null) {
            ((b2) adapter).h();
        }
    }

    public final void w3(List itemsToAdd) {
        Intrinsics.checkNotNullParameter(itemsToAdd, "itemsToAdd");
        this.f126435b.addAll(0, itemsToAdd);
        Object adapter = getAdapter();
        if (adapter != null) {
            ((b2) adapter).n(0, itemsToAdd.size());
        }
    }

    public void x3(List itemsToSet) {
        Object adapter;
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        ArrayList arrayList = this.f126435b;
        arrayList.clear();
        arrayList.addAll(itemsToSet);
        if (!isBound() || (adapter = getAdapter()) == null) {
            return;
        }
        ((b2) adapter).h();
    }

    public final void z3(Object obj) {
        int indexOf;
        ArrayList arrayList = this.f126435b;
        if (arrayList.size() == 0 || (indexOf = arrayList.indexOf(obj)) == -1) {
            return;
        }
        u1(indexOf, obj);
    }
}
