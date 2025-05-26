package com.google.protobuf;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public int f33880a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f33881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f33882c;

    public f(l lVar) {
        this.f33882c = lVar;
        this.f33881b = lVar.size();
    }

    @Override // com.google.protobuf.g
    public final byte b() {
        int i13 = this.f33880a;
        if (i13 >= this.f33881b) {
            throw new NoSuchElementException();
        }
        this.f33880a = i13 + 1;
        return this.f33882c.f(i13);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33880a < this.f33881b;
    }
}
