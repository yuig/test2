package d7;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i0 implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f53828b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f53829a;

    public i0(Handler handler) {
        this.f53829a = handler;
    }

    public static h0 c() {
        h0 h0Var;
        ArrayList arrayList = f53828b;
        synchronized (arrayList) {
            try {
                h0Var = arrayList.isEmpty() ? new h0() : (h0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return h0Var;
    }

    public final h0 a(int i13, int i14, int i15) {
        h0 c13 = c();
        c13.f53827a = this.f53829a.obtainMessage(i13, i14, i15);
        return c13;
    }

    public final h0 b(int i13, Object obj) {
        h0 c13 = c();
        c13.f53827a = this.f53829a.obtainMessage(i13, obj);
        return c13;
    }

    public final boolean d(Runnable runnable) {
        return this.f53829a.post(runnable);
    }

    public final void e(int i13) {
        bf.b.i(i13 != 0);
        this.f53829a.removeMessages(i13);
    }

    public final boolean f(int i13) {
        return this.f53829a.sendEmptyMessage(i13);
    }
}
