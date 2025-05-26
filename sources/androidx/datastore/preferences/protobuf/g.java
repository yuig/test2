package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class g implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        f fVar = (f) this;
        int i13 = fVar.f18061a;
        if (i13 >= fVar.f18062b) {
            throw new NoSuchElementException();
        }
        fVar.f18061a = i13 + 1;
        return Byte.valueOf(fVar.f18063c.f(i13));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
