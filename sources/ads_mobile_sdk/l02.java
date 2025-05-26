package ads_mobile_sdk;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class l02 {

    /* renamed from: a, reason: collision with root package name */
    public final q02 f7598a;

    public l02(q02 q02Var) {
        this.f7598a = q02Var;
    }

    public final void a(jy1 jy1Var) {
        q02 q02Var = this.f7598a;
        u71 u71Var = q02.f9891c;
        u71Var.a("prewarm(%s)", q02Var.f9894b);
        if (q02Var.f9893a == null) {
            Object[] objArr = {"Play Store not found."};
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", u71.a(u71Var.f11872a, "error: %s", objArr));
                return;
            }
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        jf2 jf2Var = q02Var.f9893a;
        o02 o02Var = new o02(q02Var, taskCompletionSource, jy1Var, taskCompletionSource);
        jf2Var.getClass();
        jf2Var.b(new df2(jf2Var, taskCompletionSource, taskCompletionSource, o02Var));
    }
}
