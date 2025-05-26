package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class m5 implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        k5 k5Var = (k5) this;
        int i13 = k5Var.f31489a;
        if (i13 >= k5Var.f31490b) {
            throw new NoSuchElementException();
        }
        k5Var.f31489a = i13 + 1;
        return Byte.valueOf(k5Var.f31491c.i(i13));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
