package d7;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public Message f53827a;

    public final void a() {
        this.f53827a = null;
        ArrayList arrayList = i0.f53828b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f53827a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
