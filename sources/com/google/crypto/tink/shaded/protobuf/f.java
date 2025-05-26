package com.google.crypto.tink.shaded.protobuf;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public int f33609a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f33610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f33611c;

    public f(k kVar) {
        this.f33611c = kVar;
        this.f33610b = kVar.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g
    public final byte b() {
        int i13 = this.f33609a;
        if (i13 >= this.f33610b) {
            throw new NoSuchElementException();
        }
        this.f33609a = i13 + 1;
        return this.f33611c.f(i13);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33609a < this.f33610b;
    }
}
