package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;

/* loaded from: classes4.dex */
public abstract class n extends AbstractCollection implements Collection, ll2.b {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }
}
