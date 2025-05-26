package com.google.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class h extends j {

    /* renamed from: e, reason: collision with root package name */
    public final int f33899e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33900f;

    public h(byte[] bArr, int i13, int i14) {
        super(bArr);
        l.c(i13, i13 + i14, bArr.length);
        this.f33899e = i13;
        this.f33900f = i14;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.j, com.google.protobuf.l
    public final byte b(int i13) {
        int i14 = this.f33900f;
        if (((i14 - (i13 + 1)) | i13) >= 0) {
            return this.f33910d[this.f33899e + i13];
        }
        if (i13 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.a.d("Index < 0: ", i13));
        }
        throw new ArrayIndexOutOfBoundsException(a.a.f("Index > length: ", i13, ", ", i14));
    }

    @Override // com.google.protobuf.j, com.google.protobuf.l
    public final byte f(int i13) {
        return this.f33910d[this.f33899e + i13];
    }

    @Override // com.google.protobuf.j, com.google.protobuf.l
    public final int size() {
        return this.f33900f;
    }

    @Override // com.google.protobuf.j
    public final int t() {
        return this.f33899e;
    }

    public final void u(int i13, byte[] bArr) {
        System.arraycopy(this.f33910d, this.f33899e, bArr, 0, i13);
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = w0.f34009b;
        } else {
            byte[] bArr2 = new byte[size];
            u(size, bArr2);
            bArr = bArr2;
        }
        return new j(bArr);
    }
}
