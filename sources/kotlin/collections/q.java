package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class q extends AbstractSet implements Set, ll2.f {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
