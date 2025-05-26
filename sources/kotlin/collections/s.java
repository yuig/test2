package kotlin.collections;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class s extends b implements Set {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f80393a = new r(null);

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set other = (Set) obj;
        f80393a.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Intrinsics.checkNotNullParameter(other, "other");
        if (size() != other.size()) {
            return false;
        }
        return containsAll(other);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        f80393a.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Iterator<E> it = iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i13 += next != null ? next.hashCode() : 0;
        }
        return i13;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
