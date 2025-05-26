package v9;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f124661f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f124662a;

    /* renamed from: b, reason: collision with root package name */
    public int f124663b;

    /* renamed from: c, reason: collision with root package name */
    public int f124664c;

    /* renamed from: d, reason: collision with root package name */
    public int f124665d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f124666e;

    public final void a(byte[] bArr, int i13, int i14) {
        if (this.f124662a) {
            int i15 = i14 - i13;
            byte[] bArr2 = this.f124666e;
            int length = bArr2.length;
            int i16 = this.f124664c;
            if (length < i16 + i15) {
                this.f124666e = Arrays.copyOf(bArr2, (i16 + i15) * 2);
            }
            System.arraycopy(bArr, i13, this.f124666e, this.f124664c, i15);
            this.f124664c += i15;
        }
    }
}
