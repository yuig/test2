package androidx.appcompat.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class g extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f16015a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i13 = message.what;
        if (i13 == -3 || i13 == -2 || i13 == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f16015a.get(), message.what);
        } else {
            if (i13 != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
