package w;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.internal.measurement.q4;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final q4 f126943a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayMap f126944b = new ArrayMap(4);

    public t(q4 q4Var) {
        this.f126943a = q4Var;
    }

    public static t a(Context context, Handler handler) {
        int i13 = Build.VERSION.SDK_INT;
        return new t(i13 >= 30 ? new w(context, null) : i13 >= 29 ? new v(context, null) : i13 >= 28 ? new u(context, null) : new q4(context, new x(handler)));
    }

    public final l b(String str) {
        l lVar;
        synchronized (this.f126944b) {
            lVar = (l) this.f126944b.get(str);
            if (lVar == null) {
                try {
                    l lVar2 = new l(this.f126943a.r(str), str);
                    this.f126944b.put(str, lVar2);
                    lVar = lVar2;
                } catch (AssertionError e13) {
                    throw new CameraAccessExceptionCompat(e13.getMessage(), e13);
                }
            }
        }
        return lVar;
    }
}
