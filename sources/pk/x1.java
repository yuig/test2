package pk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public enum x1 implements Iterator {
    INSTANCE;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        bf.b.u("no calls to next() since the last call to remove()", false);
    }
}
