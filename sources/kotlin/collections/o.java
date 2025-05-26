package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class o extends AbstractList implements List, ll2.c {
    public abstract int b();

    public abstract Object c(int i13);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i13) {
        return c(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
