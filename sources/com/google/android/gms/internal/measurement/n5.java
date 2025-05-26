package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public class n5 extends o5 {

    /* renamed from: d */
    public final byte[] f31553d;

    public n5(byte[] bArr) {
        this.f31568a = 0;
        bArr.getClass();
        this.f31553d = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public byte d(int i13) {
        return this.f31553d[i13];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o5) || j() != ((o5) obj).j()) {
            return false;
        }
        if (j() == 0) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return obj.equals(this);
        }
        n5 n5Var = (n5) obj;
        int i13 = this.f31568a;
        int i14 = n5Var.f31568a;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        int j13 = j();
        if (j13 > n5Var.j()) {
            throw new IllegalArgumentException("Length too large: " + j13 + j());
        }
        if (j13 > n5Var.j()) {
            throw new IllegalArgumentException(a.a.f("Ran off end of other: 0, ", j13, ", ", n5Var.j()));
        }
        int l13 = l() + j13;
        int l14 = l();
        int l15 = n5Var.l();
        while (l14 < l13) {
            if (this.f31553d[l14] != n5Var.f31553d[l15]) {
                return false;
            }
            l14++;
            l15++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public byte i(int i13) {
        return this.f31553d[i13];
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public int j() {
        return this.f31553d.length;
    }

    public int l() {
        return 0;
    }
}
