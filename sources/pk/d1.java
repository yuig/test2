package pk;

/* loaded from: classes3.dex */
public final class d1 extends q8.l {
    public d1() {
        this.f102946a = 4;
    }

    public static int d(int i13, byte[] bArr) {
        return (bArr[i13 + 3] & 255) | ((bArr[i13] & 255) << 24) | ((bArr[i13 + 1] & 255) << 16) | ((bArr[i13 + 2] & 255) << 8);
    }
}
