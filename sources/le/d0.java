package le;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 extends AbstractList {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f83031e = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public Handler f83032a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83033b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f83034c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f83035d;

    public d0(Collection requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f83033b = String.valueOf(f83031e.incrementAndGet());
        this.f83035d = new ArrayList();
        this.f83034c = new ArrayList(requests);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        a0 element = (a0) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        this.f83034c.add(i13, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f83034c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof a0)) {
            return super.contains((a0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        return (a0) this.f83034c.get(i13);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null || (obj instanceof a0)) {
            return super.indexOf((a0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null || (obj instanceof a0)) {
            return super.lastIndexOf((a0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof a0)) {
            return super.remove((a0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        a0 element = (a0) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return (a0) this.f83034c.set(i13, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83034c.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a0 element = (a0) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f83034c.add(element);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        return (a0) this.f83034c.remove(i13);
    }

    public d0(a0... requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f83033b = String.valueOf(f83031e.incrementAndGet());
        this.f83035d = new ArrayList();
        this.f83034c = new ArrayList(kotlin.collections.z.d(requests));
    }
}
