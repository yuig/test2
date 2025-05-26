package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d1 extends h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80359b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f80360c;

    public d1(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f80360c = delegate;
    }

    @Override // kotlin.collections.b
    public final int b() {
        int i13 = this.f80359b;
        Object obj = this.f80360c;
        switch (i13) {
            case 0:
                return ((List) obj).size();
            default:
                return ((kotlin.text.j) obj).f80493a.groupCount() + 1;
        }
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        switch (this.f80359b) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i13) {
        int i14 = this.f80359b;
        Object obj = this.f80360c;
        switch (i14) {
            case 0:
                return ((List) obj).get(l0.D(i13, this));
            default:
                String group = ((kotlin.text.j) obj).f80493a.group(i13);
                return group == null ? "" : group;
        }
    }

    @Override // kotlin.collections.h, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        switch (this.f80359b) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kotlin.collections.h, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.f80359b) {
            case 0:
                return listIterator(0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.collections.h, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f80359b) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kotlin.collections.h, java.util.List
    public final ListIterator listIterator() {
        switch (this.f80359b) {
            case 0:
                return listIterator(0);
            default:
                return super.listIterator();
        }
    }

    @Override // kotlin.collections.h, java.util.List
    public final ListIterator listIterator(int i13) {
        switch (this.f80359b) {
            case 0:
                return new s2.c0(this, i13);
            default:
                return new f(this, i13);
        }
    }

    public d1(kotlin.text.j jVar) {
        this.f80360c = jVar;
    }
}
