package ads_mobile_sdk;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class u71 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11872a;

    public u71(String str) {
        this.f11872a = a.a.C("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ", str);
    }

    public static String a(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e13) {
                Log.e("PlayCore", "Unable to format " + str2, e13);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return a.a.D(str, " : ", str2);
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", a(this.f11872a, str, objArr));
        }
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", a(this.f11872a, str, objArr));
        }
    }
}
