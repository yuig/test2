package gi;

import com.google.android.gms.internal.fido.zzho;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class t1 implements Comparable {
    public static int c(byte b13) {
        return (b13 >> 5) & 7;
    }

    public static t1 d(byte... bArr) {
        bArr.getClass();
        a8.h0 h0Var = new a8.h0(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return l3.c.f1(h0Var);
        } finally {
            try {
                h0Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final t1 b(Class cls) {
        if (cls.isInstance(this)) {
            return (t1) cls.cast(this);
        }
        throw new zzho(t3.s1.c("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public abstract int zza();
}
