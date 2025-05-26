package yp2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.r;
import org.spongycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public final class f extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f139621c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f139622a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139623b;

    public f(byte[] bArr, int i13) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (bArr.length == 0 && i13 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i13 > 7 || i13 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f139622a = bArr2;
        this.f139623b = i13;
    }

    @Override // yp2.e
    public final boolean c(e eVar) {
        byte[] bArr;
        if (!(eVar instanceof f)) {
            return false;
        }
        f fVar = (f) eVar;
        int i13 = fVar.f139623b;
        int i14 = this.f139623b;
        if (i14 != i13) {
            return false;
        }
        byte[] bArr2 = null;
        byte[] bArr3 = this.f139622a;
        if (bArr3 == null) {
            bArr = null;
        } else {
            bArr = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
        }
        if (i14 > 0) {
            int length = bArr3.length - 1;
            bArr[length] = (byte) ((255 << i14) & bArr[length]);
        }
        byte[] bArr4 = fVar.f139622a;
        if (bArr4 != null) {
            bArr2 = new byte[bArr4.length];
            System.arraycopy(bArr4, 0, bArr2, 0, bArr4.length);
        }
        int i15 = fVar.f139623b;
        if (i15 > 0) {
            int length2 = bArr4.length - 1;
            bArr2[length2] = (byte) ((255 << i15) & bArr2[length2]);
        }
        return r.i(bArr, bArr2);
    }

    @Override // yp2.e
    public final void d(d dVar) {
        byte[] bArr;
        byte[] bArr2 = this.f139622a;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        }
        int i13 = this.f139623b;
        if (i13 > 0) {
            int length = bArr2.length - 1;
            bArr[length] = (byte) (bArr[length] & (255 << i13));
        }
        int length2 = bArr.length;
        int i14 = length2 + 1;
        byte[] bArr3 = new byte[i14];
        bArr3[0] = (byte) i13;
        System.arraycopy(bArr, 0, bArr3, 1, length2);
        dVar.c(3);
        dVar.d(i14);
        ((OutputStream) dVar.f139620a).write(bArr3);
    }

    @Override // yp2.e
    public final int e() {
        byte[] bArr = this.f139622a;
        return j.a(bArr.length + 1) + 1 + bArr.length + 1;
    }

    @Override // yp2.e
    public final e f() {
        return new f(this.f139622a, this.f139623b);
    }

    @Override // yp2.e, yp2.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        byte[] bArr;
        byte[] bArr2 = this.f139622a;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        }
        int i13 = this.f139623b;
        if (i13 > 0) {
            int length = bArr2.length - 1;
            bArr[length] = (byte) (bArr[length] & (255 << i13));
        }
        return r.w(bArr) ^ i13;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new d(byteArrayOutputStream).e(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i13 = 0; i13 != byteArray.length; i13++) {
                char[] cArr = f139621c;
                stringBuffer.append(cArr[(byteArray[i13] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i13] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e13) {
            ASN1ParsingException aSN1ParsingException = new ASN1ParsingException("Internal error encoding BitString: " + e13.getMessage());
            aSN1ParsingException.f97474a = e13;
            throw aSN1ParsingException;
        }
    }
}
