package pk;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class s0 extends h1 {
    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // pk.h1
    public final v0 f() {
        throw new AssertionError("should never be called");
    }

    @Override // pk.h1
    /* renamed from: j */
    public final v0 values() {
        return ((u2) this).f100497h.keySet();
    }

    @Override // pk.h1, java.util.Map
    public final Collection values() {
        return ((u2) this).f100497h.keySet();
    }

    @Override // pk.h1
    public Object writeReplace() {
        return new r0(this);
    }
}
