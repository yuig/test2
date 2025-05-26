package s7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d7.n0;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f111290a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Looper looper) {
        super(looper);
        this.f111290a = hVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        Iterator it = this.f111290a.f111306m.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.p();
            if (Arrays.equals(dVar.f111285v, bArr)) {
                if (message.what == 2 && dVar.f111268e == 0 && dVar.f111279p == 4) {
                    int i13 = n0.f53866a;
                    dVar.h(false);
                    return;
                }
                return;
            }
        }
    }
}
