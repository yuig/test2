package gi;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class f0 extends b0 implements NavigableSet, q0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient Comparator f65065d;

    /* renamed from: e, reason: collision with root package name */
    public transient f0 f65066e;

    public f0(Comparator comparator) {
        this.f65065d = comparator;
    }

    public static m0 t(Comparator comparator) {
        if (i0.f65074a.equals(comparator)) {
            return m0.f65096g;
        }
        v vVar = z.f65142b;
        return new m0(k0.f65079e, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f65065d;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        m0 m0Var = (m0) this;
        return m0Var.w(0, m0Var.u(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final f0 descendingSet() {
        f0 f0Var = this.f65066e;
        if (f0Var == null) {
            m0 m0Var = (m0) this;
            Comparator reverseOrder = Collections.reverseOrder(m0Var.f65065d);
            f0Var = m0Var.isEmpty() ? t(reverseOrder) : new m0(m0Var.f65097f.i(), reverseOrder);
            this.f65066e = f0Var;
            f0Var.f65066e = this;
        }
        return f0Var;
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final m0 subSet(Object obj, boolean z13, Object obj2, boolean z14) {
        obj.getClass();
        obj2.getClass();
        if (this.f65065d.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        m0 m0Var = (m0) this;
        m0 w13 = m0Var.w(m0Var.v(obj, z13), m0Var.f65097f.size());
        return w13.w(0, w13.u(obj2, z14));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        m0 m0Var = (m0) this;
        return m0Var.w(m0Var.v(obj, true), m0Var.f65097f.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z13) {
        obj.getClass();
        m0 m0Var = (m0) this;
        return m0Var.w(0, m0Var.u(obj, z13));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z13) {
        obj.getClass();
        m0 m0Var = (m0) this;
        return m0Var.w(m0Var.v(obj, z13), m0Var.f65097f.size());
    }
}
