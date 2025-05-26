package q5;

import android.os.Build;
import android.view.View;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public int f102464a;

    /* renamed from: b, reason: collision with root package name */
    public int f102465b;

    /* renamed from: c, reason: collision with root package name */
    public int f102466c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f102467d;

    public j0(yk2.g map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f102467d = map;
        this.f102465b = -1;
        this.f102466c = map.f139255h;
        f();
    }

    public final void b() {
        if (((yk2.g) this.f102467d).f139255h != this.f102466c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public final Object e(View view) {
        if (Build.VERSION.SDK_INT >= this.f102465b) {
            return c(view);
        }
        Object tag = view.getTag(this.f102464a);
        if (((Class) this.f102467d).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public final void f() {
        while (true) {
            int i13 = this.f102464a;
            Serializable serializable = this.f102467d;
            if (i13 >= ((yk2.g) serializable).f139253f || ((yk2.g) serializable).f139250c[i13] >= 0) {
                return;
            } else {
                this.f102464a = i13 + 1;
            }
        }
    }

    public final void g(View view, Object obj) {
        View.AccessibilityDelegate d2;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= this.f102465b) {
            d(view, obj);
            return;
        }
        if (h(e(view), obj)) {
            if (i13 >= 29) {
                WeakHashMap weakHashMap = v0.f102521a;
                d2 = r0.a(view);
            } else {
                d2 = v0.d(view);
            }
            b bVar = d2 == null ? null : d2 instanceof a ? ((a) d2).f102396a : new b(d2);
            if (bVar == null) {
                bVar = new b();
            }
            v0.o(view, bVar);
            view.setTag(this.f102464a, obj);
            v0.i(view, this.f102466c);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public final boolean hasNext() {
        return this.f102464a < ((yk2.g) this.f102467d).f139253f;
    }

    public final void remove() {
        b();
        if (this.f102465b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
        Serializable serializable = this.f102467d;
        ((yk2.g) serializable).d();
        ((yk2.g) serializable).m(this.f102465b);
        this.f102465b = -1;
        this.f102466c = ((yk2.g) serializable).f139255h;
    }

    public j0(int i13, Class cls, int i14, int i15) {
        this.f102464a = i13;
        this.f102467d = cls;
        this.f102466c = i14;
        this.f102465b = i15;
    }
}
