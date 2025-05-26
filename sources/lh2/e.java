package lh2;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t3.s1;

/* loaded from: classes4.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f83529a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public Function0 f83530b = d.f83528i;

    public final void a(String msg, Throwable th3) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        a aVar = a.ERROR;
        if (aVar.compareTo(a.INFO) >= 0) {
            int i13 = c.f83527a[aVar.ordinal()];
            if (i13 == 1) {
                Log.d("[Embrace]", msg, th3);
                return;
            }
            if (i13 == 2) {
                Log.i("[Embrace]", msg, th3);
            } else if (i13 == 3) {
                Log.w("[Embrace]", msg, th3);
            } else {
                if (i13 != 4) {
                    return;
                }
                Log.e("[Embrace]", msg, th3);
            }
        }
    }

    @Override // lh2.f
    public final void b(g type, Throwable throwable) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            f fVar = (f) this.f83530b.invoke();
            if (fVar != null) {
                fVar.b(type, throwable);
            }
        } catch (Throwable th3) {
            Log.w("[Embrace]", "Failed to track internal error", th3);
        }
    }

    public final void c(String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.f83529a.getAndSet(true)) {
            return;
        }
        String b13 = s1.b("Embrace SDK is not initialized yet, cannot ", action, '.');
        a aVar = a.WARNING;
        Throwable th3 = new Throwable(b13);
        if (aVar.compareTo(a.INFO) >= 0) {
            int i13 = c.f83527a[aVar.ordinal()];
            if (i13 == 1) {
                Log.d("[Embrace]", b13, th3);
                return;
            }
            if (i13 == 2) {
                Log.i("[Embrace]", b13, th3);
            } else if (i13 == 3) {
                Log.w("[Embrace]", b13, th3);
            } else {
                if (i13 != 4) {
                    return;
                }
                Log.e("[Embrace]", b13, th3);
            }
        }
    }
}
