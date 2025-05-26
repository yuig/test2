package n2;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final g f88946a;

    public i(f fVar) {
        s[] sVarArr = new s[8];
        for (int i13 = 0; i13 < 8; i13++) {
            sVarArr[i13] = new v(this);
        }
        this.f88946a = new g(fVar, sVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f88946a.f88935c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (Map.Entry) this.f88946a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f88946a.remove();
    }
}
