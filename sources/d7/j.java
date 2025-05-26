package d7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class j implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f53830a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f53831b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public Set f53832c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    public List f53833d = Collections.emptyList();

    public final int b(Object obj) {
        int intValue;
        synchronized (this.f53830a) {
            try {
                intValue = this.f53831b.containsKey(obj) ? ((Integer) this.f53831b.get(obj)).intValue() : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return intValue;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f53830a) {
            it = this.f53833d.iterator();
        }
        return it;
    }
}
