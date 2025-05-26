package ih;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import jh.o0;
import jh.x;

/* loaded from: classes.dex */
public abstract class m extends o0 {

    /* renamed from: c */
    public final int f72277c;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        com.bumptech.glide.d.j(bArr.length == 25);
        this.f72277c = Arrays.hashCode(bArr);
    }

    public static byte[] D(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e13) {
            throw new AssertionError(e13);
        }
    }

    public abstract byte[] E();

    public final boolean equals(Object obj) {
        rh.a zzd;
        if (obj != null && (obj instanceof x)) {
            try {
                x xVar = (x) obj;
                if (xVar.zzc() == this.f72277c && (zzd = xVar.zzd()) != null) {
                    return Arrays.equals(E(), (byte[]) rh.b.E(zzd));
                }
                return false;
            } catch (RemoteException e13) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e13);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f72277c;
    }

    @Override // jh.x
    public final int zzc() {
        return this.f72277c;
    }

    @Override // jh.x
    public final rh.a zzd() {
        return new rh.b(E());
    }
}
