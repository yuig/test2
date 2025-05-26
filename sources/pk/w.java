package pk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class w implements l2 {

    /* renamed from: a, reason: collision with root package name */
    public transient Set f100505a;

    /* renamed from: b, reason: collision with root package name */
    public transient Collection f100506b;

    /* renamed from: c, reason: collision with root package name */
    public transient Map f100507c;

    public final boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) a().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean c(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Iterator d();

    public final void e(ArrayList arrayList, String str) {
        if (arrayList.isEmpty()) {
            return;
        }
        get(str).addAll(arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            return a().equals(((l2) obj).a());
        }
        return false;
    }

    public abstract Iterator f();

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // pk.l2
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) a().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return a().toString();
    }
}
