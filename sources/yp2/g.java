package yp2;

import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.r;
import org.spongycastle.util.encoders.EncoderException;

/* loaded from: classes4.dex */
public final class g extends e {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f139624a;

    public g(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.f139624a = bArr;
    }

    @Override // yp2.e
    public final boolean c(e eVar) {
        if (eVar instanceof g) {
            return r.i(this.f139624a, ((g) eVar).f139624a);
        }
        return false;
    }

    @Override // yp2.e
    public final void d(d dVar) {
        byte[] bArr = this.f139624a;
        dVar.c(4);
        dVar.d(bArr.length);
        ((OutputStream) dVar.f139620a).write(bArr);
    }

    @Override // yp2.e
    public final int e() {
        return j.a(this.f139624a.length) + 1 + this.f139624a.length;
    }

    @Override // yp2.e
    public final e f() {
        return new g(this.f139624a);
    }

    @Override // yp2.e, yp2.b
    public final int hashCode() {
        return r.w(this.f139624a);
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("#");
        byte[] bArr = this.f139624a;
        g01.a aVar = oq2.a.f97244a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            g01.a aVar2 = oq2.a.f97244a;
            aVar2.getClass();
            for (byte b13 : bArr) {
                Object obj = aVar2.f63224a;
                byteArrayOutputStream.write(((byte[]) obj)[(b13 & 255) >>> 4]);
                byteArrayOutputStream.write(((byte[]) obj)[b13 & 15]);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i13 = nq2.c.f91832a;
            int length = byteArray.length;
            char[] cArr = new char[length];
            for (int i14 = 0; i14 != length; i14++) {
                cArr[i14] = (char) (byteArray[i14] & 255);
            }
            sb3.append(new String(cArr));
            return sb3.toString();
        } catch (Exception e13) {
            EncoderException encoderException = new EncoderException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("exception encoding Hex string: ")));
            encoderException.f97476a = e13;
            throw encoderException;
        }
    }
}
