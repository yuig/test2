package com.google.crypto.tink.shaded.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class h extends j {

    /* renamed from: e, reason: collision with root package name */
    public final int f33631e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33632f;

    public h(byte[] bArr, int i13, int i14) {
        super(bArr);
        k.c(i13, i13 + i14, bArr.length);
        this.f33631e = i13;
        this.f33632f = i14;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j, com.google.crypto.tink.shaded.protobuf.k
    public final byte b(int i13) {
        int i14 = this.f33632f;
        if (((i14 - (i13 + 1)) | i13) >= 0) {
            return this.f33635d[this.f33631e + i13];
        }
        if (i13 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.a.d("Index < 0: ", i13));
        }
        throw new ArrayIndexOutOfBoundsException(a.a.f("Index > length: ", i13, ", ", i14));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j, com.google.crypto.tink.shaded.protobuf.k
    public final void e(int i13, byte[] bArr) {
        System.arraycopy(this.f33635d, this.f33631e, bArr, 0, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j, com.google.crypto.tink.shaded.protobuf.k
    public final byte f(int i13) {
        return this.f33635d[this.f33631e + i13];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j
    public final int j() {
        return this.f33631e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j, com.google.crypto.tink.shaded.protobuf.k
    public final int size() {
        return this.f33632f;
    }

    public Object writeReplace() {
        return new j(i());
    }
}
