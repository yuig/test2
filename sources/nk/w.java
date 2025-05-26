package nk;

import a.cb;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f91085a;

    public w(String str) {
        this.f91085a = cb.j("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e13) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e13);
                str2 = a.a.l(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return a.a.D(str, " : ", str2);
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f91085a, str, objArr));
        }
    }

    public final void b(String str, RemoteException remoteException, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", e(this.f91085a, str, objArr), remoteException);
        }
    }

    public final void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.f91085a, str, objArr));
        }
    }

    public final void d(Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", e(this.f91085a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
    }
}
