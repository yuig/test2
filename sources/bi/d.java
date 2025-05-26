package bi;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.e0;

/* loaded from: classes3.dex */
public abstract class d extends d5.a {
    public static void e(Context context, e0 e0Var, IntentFilter intentFilter) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            context.registerReceiver(e0Var, intentFilter, i13 >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(e0Var, intentFilter);
        }
    }
}
