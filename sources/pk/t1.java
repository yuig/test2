package pk;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class t1 extends o1 implements NavigableSet, k3 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f100484f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final transient Comparator f100485d;

    /* renamed from: e, reason: collision with root package name */
    public transient t1 f100486e;

    public t1(Comparator comparator) {
        this.f100485d = comparator;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static c3 v(Comparator comparator) {
        return s2.f100480a.equals(comparator) ? c3.f100373h : new c3(v2.f100502e, comparator);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f100485d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        t1 t1Var = this.f100486e;
        if (t1Var == null) {
            c3 c3Var = (c3) this;
            Comparator reverseOrder = Collections.reverseOrder(c3Var.f100485d);
            t1Var = c3Var.isEmpty() ? v(reverseOrder) : new c3(c3Var.f100374g.z(), reverseOrder);
            this.f100486e = t1Var;
            t1Var.f100486e = this;
        }
        return t1Var;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z13) {
        obj.getClass();
        c3 c3Var = (c3) this;
        return c3Var.x(0, c3Var.y(obj, z13));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z13) {
        obj.getClass();
        c3 c3Var = (c3) this;
        return c3Var.x(c3Var.z(obj, z13), c3Var.f100374g.size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final c3 subSet(Object obj, boolean z13, Object obj2, boolean z14) {
        obj.getClass();
        obj2.getClass();
        bf.b.k(this.f100485d.compare(obj, obj2) <= 0);
        c3 c3Var = (c3) this;
        c3 x13 = c3Var.x(c3Var.z(obj, z13), c3Var.f100374g.size());
        return x13.x(0, x13.y(obj2, z14));
    }

    @Override // pk.o1, pk.v0
    public Object writeReplace() {
        return new s1(this.f100485d, toArray(v0.f100499a));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        c3 c3Var = (c3) this;
        return c3Var.x(0, c3Var.y(obj, false));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        c3 c3Var = (c3) this;
        return c3Var.x(c3Var.z(obj, true), c3Var.f100374g.size());
    }
}
