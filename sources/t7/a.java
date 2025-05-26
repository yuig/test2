package t7;

import android.net.Uri;
import g7.a0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class a implements g7.f {

    /* renamed from: a, reason: collision with root package name */
    public final g7.f f116457a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f116458b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f116459c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f116460d;

    public a(g7.f fVar, byte[] bArr, byte[] bArr2) {
        this.f116457a = fVar;
        this.f116458b = bArr;
        this.f116459c = bArr2;
    }

    @Override // g7.f
    public final void close() {
        if (this.f116460d != null) {
            this.f116460d = null;
            this.f116457a.close();
        }
    }

    @Override // g7.f
    public final long d(g7.i iVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f116458b, "AES"), new IvParameterSpec(this.f116459c));
                g7.g gVar = new g7.g(this.f116457a, iVar);
                this.f116460d = new CipherInputStream(gVar, cipher);
                gVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e13) {
                throw new RuntimeException(e13);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e14) {
            throw new RuntimeException(e14);
        }
    }

    @Override // g7.f
    public final Map e() {
        return this.f116457a.e();
    }

    @Override // g7.f
    public final void f(a0 a0Var) {
        a0Var.getClass();
        this.f116457a.f(a0Var);
    }

    @Override // g7.f
    public final Uri r() {
        return this.f116457a.r();
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        this.f116460d.getClass();
        int read = this.f116460d.read(bArr, i13, i14);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
