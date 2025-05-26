package ads_mobile_sdk;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public class gl extends a.g3 {

    /* renamed from: d */
    public final byte[] f5606d;

    public gl(byte[] bArr) {
        bArr.getClass();
        this.f5606d = bArr;
    }

    @Override // ads_mobile_sdk.il
    public final ByteBuffer a() {
        return ByteBuffer.wrap(this.f5606d, g(), size()).asReadOnlyBuffer();
    }

    @Override // ads_mobile_sdk.il
    public byte b(int i13) {
        return this.f5606d[i13];
    }

    @Override // ads_mobile_sdk.il
    public byte c(int i13) {
        return this.f5606d[i13];
    }

    @Override // ads_mobile_sdk.il
    public final io d() {
        byte[] bArr = this.f5606d;
        int g13 = g();
        int size = size();
        fo foVar = new fo(bArr, g13, size, true);
        try {
            foVar.d(size);
            return foVar;
        } catch (e21 e13) {
            throw new IllegalArgumentException(e13);
        }
    }

    @Override // ads_mobile_sdk.il
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof il) || size() != ((il) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof gl)) {
            return obj.equals(this);
        }
        gl glVar = (gl) obj;
        int i13 = this.f6433a;
        int i14 = glVar.f6433a;
        if (i13 == 0 || i14 == 0 || i13 == i14) {
            return a(glVar, 0, size());
        }
        return false;
    }

    public int g() {
        return 0;
    }

    @Override // ads_mobile_sdk.il
    public int size() {
        return this.f5606d.length;
    }

    @Override // ads_mobile_sdk.il
    public void a(int i13, int i14, int i15, byte[] bArr) {
        System.arraycopy(this.f5606d, i13, bArr, i14, i15);
    }

    @Override // ads_mobile_sdk.il
    public final int b(int i13, int i14, int i15) {
        byte[] bArr = this.f5606d;
        int g13 = g() + i14;
        Charset charset = hw0.f6126a;
        for (int i16 = g13; i16 < g13 + i15; i16++) {
            i13 = (i13 * 31) + bArr[i16];
        }
        return i13;
    }

    @Override // a.g3
    public final boolean a(il ilVar, int i13, int i14) {
        if (i14 <= ilVar.size()) {
            int i15 = i13 + i14;
            if (i15 <= ilVar.size()) {
                if (ilVar instanceof gl) {
                    gl glVar = (gl) ilVar;
                    byte[] bArr = this.f5606d;
                    byte[] bArr2 = glVar.f5606d;
                    int g13 = g() + i14;
                    int g14 = g();
                    int g15 = glVar.g() + i13;
                    while (g14 < g13) {
                        if (bArr[g14] != bArr2[g15]) {
                            return false;
                        }
                        g14++;
                        g15++;
                    }
                    return true;
                }
                return ilVar.b(i13, i15).equals(b(0, i14));
            }
            int size = ilVar.size();
            StringBuilder t13 = a.a.t("Ran off end of other: ", i13, ", ", i14, ", ");
            t13.append(size);
            throw new IllegalArgumentException(t13.toString());
        }
        throw new IllegalArgumentException("Length too large: " + i14 + size());
    }

    @Override // ads_mobile_sdk.il
    public final il b(int i13, int i14) {
        int a13 = il.a(i13, i14, size());
        if (a13 == 0) {
            return il.f6431b;
        }
        return new cl(this.f5606d, g() + i13, a13);
    }

    @Override // ads_mobile_sdk.il
    public final void a(a.lg lgVar) {
        lgVar.a(this.f5606d, g(), size());
    }
}
