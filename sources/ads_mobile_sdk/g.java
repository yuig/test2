package ads_mobile_sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class g implements a.xe {

    /* renamed from: a, reason: collision with root package name */
    public int f5341a = 0;

    public abstract int a(a.tb tbVar);

    public final String a(String str) {
        return a.a.m("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public final gl b() {
        try {
            int a13 = ((sj0) this).a((a.tb) null);
            gl glVar = il.f6431b;
            byte[] bArr = new byte[a13];
            Logger logger = oo.f9379b;
            lo loVar = new lo(bArr, a13);
            ((sj0) this).a(loVar);
            if (loVar.a() == 0) {
                return new gl(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e13) {
            throw new RuntimeException(a("ByteString"), e13);
        }
    }

    public final byte[] a() {
        try {
            int a13 = ((sj0) this).a((a.tb) null);
            byte[] bArr = new byte[a13];
            Logger logger = oo.f9379b;
            lo loVar = new lo(bArr, a13);
            ((sj0) this).a(loVar);
            if (loVar.a() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e13) {
            throw new RuntimeException(a("byte array"), e13);
        }
    }

    public final void a(OutputStream outputStream) {
        sj0 sj0Var = (sj0) this;
        int a13 = sj0Var.a((a.tb) null);
        Logger logger = oo.f9379b;
        if (a13 > 4096) {
            a13 = 4096;
        }
        no noVar = new no(outputStream, a13);
        sj0Var.a(noVar);
        if (noVar.f7419f > 0) {
            noVar.a();
        }
    }
}
