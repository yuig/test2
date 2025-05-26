package com.google.protobuf;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class g implements Iterator {
    public abstract byte b();

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
