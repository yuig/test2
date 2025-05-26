package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public class t extends u {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f31788c;

    public t(byte[] bArr) {
        this.f31800a = 0;
        bArr.getClass();
        this.f31788c = bArr;
    }

    @Override // com.google.android.gms.internal.recaptcha.u
    public byte d(int i13) {
        return this.f31788c[i13];
    }

    @Override // com.google.android.gms.internal.recaptcha.u
    public int e() {
        return this.f31788c.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u) || e() != ((u) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof t)) {
            return obj.equals(this);
        }
        t tVar = (t) obj;
        int i13 = this.f31800a;
        int i14 = tVar.f31800a;
        if (i13 != 0 && i14 != 0 && i13 != i14) {
            return false;
        }
        int e13 = e();
        if (e13 > tVar.e()) {
            int e14 = e();
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Length too large: ");
            sb3.append(e13);
            sb3.append(e14);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (e13 > tVar.e()) {
            int e15 = tVar.e();
            StringBuilder sb4 = new StringBuilder(59);
            sb4.append("Ran off end of other: 0, ");
            sb4.append(e13);
            sb4.append(", ");
            sb4.append(e15);
            throw new IllegalArgumentException(sb4.toString());
        }
        int j13 = j() + e13;
        int j14 = j();
        int j15 = tVar.j();
        while (j14 < j13) {
            if (this.f31788c[j14] != tVar.f31788c[j15]) {
                return false;
            }
            j14++;
            j15++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.recaptcha.u
    public byte f(int i13) {
        return this.f31788c[i13];
    }

    public int j() {
        return 0;
    }
}
