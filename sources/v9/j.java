package v9;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f124636e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f124637a;

    /* renamed from: b, reason: collision with root package name */
    public int f124638b;

    /* renamed from: c, reason: collision with root package name */
    public int f124639c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f124640d;

    public final void a(byte[] bArr, int i13, int i14) {
        if (this.f124637a) {
            int i15 = i14 - i13;
            byte[] bArr2 = this.f124640d;
            int length = bArr2.length;
            int i16 = this.f124638b;
            if (length < i16 + i15) {
                this.f124640d = Arrays.copyOf(bArr2, (i16 + i15) * 2);
            }
            System.arraycopy(bArr, i13, this.f124640d, this.f124638b, i15);
            this.f124638b += i15;
        }
    }
}
