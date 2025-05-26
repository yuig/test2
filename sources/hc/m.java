package hc;

import android.content.Context;
import android.graphics.Color;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class m implements l0, sh.b, mk.f, ok.d0, cl.d, cl.a {

    /* renamed from: a, reason: collision with root package name */
    public int f68664a;

    public /* synthetic */ m(int i13, int i14) {
        this.f68664a = i13;
    }

    @Override // sh.b
    public final int a(Context context, String str, boolean z13) {
        return 0;
    }

    @Override // cl.d
    public final int b() {
        return this.f68664a;
    }

    @Override // ok.d0
    public final Iterator c(ok.e0 e0Var, CharSequence charSequence) {
        return new ok.a0(this, e0Var, charSequence);
    }

    @Override // sh.b
    public final int d(Context context, String str) {
        return this.f68664a;
    }

    @Override // cl.a
    public final byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length != this.f68664a) {
            throw new GeneralSecurityException("invalid key size");
        }
        a.g gVar = wk.f.f130054a;
        ll.j0.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        byte[] s13 = jk.r.s(12);
        AlgorithmParameterSpec a13 = wk.f.a(s13, 0, s13.length);
        Cipher cipher = (Cipher) wk.f.f130054a.get();
        cipher.init(1, secretKeySpec, a13);
        int outputSize = cipher.getOutputSize(bArr4.length);
        int length = bArr2.length + bArr3.length;
        if (outputSize > 2147483635 - length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i13 = length + 12;
        byte[] copyOf = Arrays.copyOf(bArr2, i13 + outputSize);
        System.arraycopy(bArr3, 0, copyOf, bArr2.length, bArr3.length);
        System.arraycopy(s13, 0, copyOf, length, 12);
        if (cipher.doFinal(bArr4, 0, bArr4.length, copyOf, i13) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // hc.l0
    public final Object f(ic.d dVar, float f13) {
        int i13;
        int i14;
        int argb;
        int argb2;
        float e13;
        ArrayList arrayList = new ArrayList();
        int i15 = 1;
        boolean z13 = dVar.g() == ic.c.BEGIN_ARRAY;
        if (z13) {
            dVar.a();
        }
        while (dVar.hasNext()) {
            arrayList.add(Float.valueOf((float) dVar.s1()));
        }
        int i16 = 4;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f68664a = 2;
        }
        if (z13) {
            dVar.d();
        }
        if (this.f68664a == -1) {
            this.f68664a = arrayList.size() / 4;
        }
        int i17 = this.f68664a;
        float[] fArr = new float[i17];
        int[] iArr = new int[i17];
        int i18 = 0;
        int i19 = 0;
        int i23 = 0;
        while (true) {
            i13 = this.f68664a * i16;
            if (i18 >= i13) {
                break;
            }
            int i24 = i18 / 4;
            double floatValue = ((Float) arrayList.get(i18)).floatValue();
            int i25 = i18 % 4;
            if (i25 == 0) {
                if (i24 > 0) {
                    float f14 = (float) floatValue;
                    if (fArr[i24 - 1] >= f14) {
                        fArr[i24] = f14 + 0.01f;
                    }
                }
                fArr[i24] = (float) floatValue;
            } else if (i25 == i15) {
                i19 = (int) (floatValue * 255.0d);
            } else if (i25 == 2) {
                i23 = (int) (floatValue * 255.0d);
            } else if (i25 == 3) {
                iArr[i24] = Color.argb(255, i19, i23, (int) (floatValue * 255.0d));
            }
            i18++;
            i15 = 1;
            i16 = 4;
        }
        ec.c cVar = new ec.c(fArr, iArr);
        if (arrayList.size() <= i13) {
            return cVar;
        }
        int size = (arrayList.size() - i13) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i26 = 0;
        while (i13 < arrayList.size()) {
            if (i13 % 2 == 0) {
                fArr2[i26] = ((Float) arrayList.get(i13)).floatValue();
            } else {
                fArr3[i26] = ((Float) arrayList.get(i13)).floatValue();
                i26++;
            }
            i13++;
        }
        float[] fArr4 = cVar.f58286a;
        if (fArr4.length == 0) {
            fArr4 = fArr2;
        } else if (size != 0) {
            int length = fArr4.length + size;
            float[] fArr5 = new float[length];
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            for (int i33 = 0; i33 < length; i33++) {
                float f15 = i28 < fArr4.length ? fArr4[i28] : Float.NaN;
                float f16 = i29 < size ? fArr2[i29] : Float.NaN;
                if (Float.isNaN(f16) || f15 < f16) {
                    fArr5[i33] = f15;
                    i28++;
                } else if (Float.isNaN(f15) || f16 < f15) {
                    fArr5[i33] = f16;
                    i29++;
                } else {
                    fArr5[i33] = f15;
                    i28++;
                    i29++;
                    i27++;
                }
            }
            fArr4 = i27 == 0 ? fArr5 : Arrays.copyOf(fArr5, length - i27);
        }
        int length2 = fArr4.length;
        int[] iArr2 = new int[length2];
        for (int i34 = 0; i34 < length2; i34++) {
            float f17 = fArr4[i34];
            int binarySearch = Arrays.binarySearch(fArr, f17);
            int binarySearch2 = Arrays.binarySearch(fArr2, f17);
            int[] iArr3 = cVar.f58287b;
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f18 = fArr3[binarySearch2];
                if (iArr3.length >= 2 && f17 != fArr[0]) {
                    for (int i35 = 1; i35 < i17; i35++) {
                        float f19 = fArr[i35];
                        if (f19 >= f17 || i35 == i17 - 1) {
                            if (i35 != i17 - 1 || f17 < f19) {
                                int i36 = i35 - 1;
                                float f23 = fArr[i36];
                                int p13 = b7.c.p(iArr3[i36], (f17 - f23) / (f19 - f23), iArr3[i35]);
                                argb = Color.argb((int) (f18 * 255.0f), Color.red(p13), Color.green(p13), Color.blue(p13));
                            } else {
                                argb = Color.argb((int) (f18 * 255.0f), Color.red(iArr3[i35]), Color.green(iArr3[i35]), Color.blue(iArr3[i35]));
                            }
                            i14 = argb;
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                i14 = iArr3[0];
                iArr2[i34] = i14;
            } else {
                int i37 = iArr3[binarySearch];
                if (size >= 2 && f17 > fArr2[0]) {
                    for (int i38 = 1; i38 < size; i38++) {
                        float f24 = fArr2[i38];
                        if (f24 >= f17 || i38 == size - 1) {
                            if (f24 <= f17) {
                                e13 = fArr3[i38];
                            } else {
                                int i39 = i38 - 1;
                                float f25 = fArr2[i39];
                                e13 = jc.f.e(fArr3[i39], fArr3[i38], (f17 - f25) / (f24 - f25));
                            }
                            argb2 = Color.argb((int) (e13 * 255.0f), Color.red(i37), Color.green(i37), Color.blue(i37));
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                argb2 = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i37), Color.green(i37), Color.blue(i37));
                iArr2[i34] = argb2;
            }
        }
        return new ec.c(fArr4, iArr2);
    }

    @Override // cl.d
    public final byte[] g() {
        int i13 = this.f68664a;
        if (i13 == 16) {
            return cl.k.f27964i;
        }
        if (i13 == 32) {
            return cl.k.f27965j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // cl.a
    public final int h() {
        return this.f68664a;
    }

    @Override // cl.d
    public final byte[] i(byte[] bArr, byte[] bArr2, byte[] bArr3, int i13, byte[] bArr4) {
        if (bArr.length != this.f68664a) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
        }
        wk.o oVar = new wk.o(bArr);
        if (bArr2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec a13 = wk.f.a(bArr2, 0, bArr2.length);
        Cipher cipher = (Cipher) wk.f.f130054a.get();
        cipher.init(1, oVar.f130079a, a13);
        if (bArr4.length != 0) {
            cipher.updateAAD(bArr4);
        }
        int outputSize = cipher.getOutputSize(bArr3.length);
        if (outputSize > Integer.MAX_VALUE - i13) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr5 = new byte[i13 + outputSize];
        if (cipher.doFinal(bArr3, 0, bArr3.length, bArr5, i13) == outputSize) {
            return bArr5;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // mk.f
    public final jk.d j(jk.d dVar) {
        int i13 = this.f68664a;
        int i14 = mk.a.f87285p;
        if (dVar == null) {
            return null;
        }
        List list = dVar.f76325f;
        ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
        List list2 = dVar.f76326g;
        return jk.d.a(dVar.f76320a, 6, i13, dVar.f76323d, dVar.f76324e, arrayList, list2 != null ? new ArrayList(list2) : new ArrayList());
    }

    public m(int i13) {
        if (i13 != 16 && i13 != 32) {
            throw new InvalidAlgorithmParameterException(a.a.d("Unsupported key length: ", i13));
        }
        this.f68664a = i13;
    }
}
