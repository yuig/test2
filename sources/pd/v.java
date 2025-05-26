package pd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class v implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final List f99765a;

    public v(ArrayList arrayList) {
        this.f99765a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f99765a.iterator();
    }
}
