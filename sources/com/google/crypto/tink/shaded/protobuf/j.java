package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

/* loaded from: classes.dex */
public class j extends k {

    /* renamed from: d */
    public final byte[] f33635d;

    public j(byte[] bArr) {
        this.f33638a = 0;
        bArr.getClass();
        this.f33635d = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k
    public byte b(int i13) {
        return this.f33635d[i13];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k
    public void e(int i13, byte[] bArr) {
        System.arraycopy(this.f33635d, 0, bArr, 0, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k) || size() != ((k) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof j)) {
            return obj.equals(this);
        }
        j jVar = (j) obj;
        int i13 = this.f33638a;
        int i14 = jVar.f33638a;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        int size = size();
        if (size > jVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > jVar.size()) {
            StringBuilder s13 = a.a.s("Ran off end of other: 0, ", size, ", ");
            s13.append(jVar.size());
            throw new IllegalArgumentException(s13.toString());
        }
        int j13 = j() + size;
        int j14 = j();
        int j15 = jVar.j();
        while (j14 < j13) {
            if (this.f33635d[j14] != jVar.f33635d[j15]) {
                return false;
            }
            j14++;
            j15++;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k
    public byte f(int i13) {
        return this.f33635d[i13];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this);
    }

    public int j() {
        return 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k
    public int size() {
        return this.f33635d.length;
    }
}
