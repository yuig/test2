package com.google.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class j extends i {

    /* renamed from: d */
    public final byte[] f33910d;

    public j(byte[] bArr) {
        bArr.getClass();
        this.f33910d = bArr;
    }

    @Override // com.google.protobuf.l
    public byte b(int i13) {
        return this.f33910d[i13];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l) || size() != ((l) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof j)) {
            return obj.equals(this);
        }
        j jVar = (j) obj;
        int i13 = this.f33924a;
        int i14 = jVar.f33924a;
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
        int t13 = t() + size;
        int t14 = t();
        int t15 = jVar.t();
        while (t14 < t13) {
            if (this.f33910d[t14] != jVar.f33910d[t15]) {
                return false;
            }
            t14++;
            t15++;
        }
        return true;
    }

    @Override // com.google.protobuf.l
    public byte f(int i13) {
        return this.f33910d[i13];
    }

    @Override // com.google.protobuf.l
    public final boolean i() {
        int t13 = t();
        return t2.f33999a.L0(t13, size() + t13, this.f33910d) == 0;
    }

    @Override // com.google.protobuf.l
    public final p j() {
        return p.f(this.f33910d, t(), size(), true);
    }

    @Override // com.google.protobuf.l
    public final int l(int i13, int i14) {
        int t13 = t();
        Charset charset = w0.f34008a;
        for (int i15 = t13; i15 < t13 + i14; i15++) {
            i13 = (i13 * 31) + this.f33910d[i15];
        }
        return i13;
    }

    @Override // com.google.protobuf.l
    public final l n(int i13) {
        int c13 = l.c(0, i13, size());
        if (c13 == 0) {
            return l.f33922b;
        }
        return new h(this.f33910d, t(), c13);
    }

    @Override // com.google.protobuf.l
    public final String p(Charset charset) {
        return new String(this.f33910d, t(), size(), charset);
    }

    @Override // com.google.protobuf.l
    public final void s(me.o oVar) {
        oVar.i(this.f33910d, t(), size());
    }

    @Override // com.google.protobuf.l
    public int size() {
        return this.f33910d.length;
    }

    public int t() {
        return 0;
    }
}
