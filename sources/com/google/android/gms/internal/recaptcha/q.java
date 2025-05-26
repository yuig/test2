package com.google.android.gms.internal.recaptcha;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class q implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        p pVar = (p) this;
        int i13 = pVar.f31776a;
        if (i13 >= pVar.f31777b) {
            throw new NoSuchElementException();
        }
        pVar.f31776a = i13 + 1;
        return Byte.valueOf(pVar.f31778c.f(i13));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
