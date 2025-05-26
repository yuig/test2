package fi;

import a.cb;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import t3.s1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62177a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62178b;

    public b(String name, int i13) {
        this.f62177a = i13;
        if (i13 == 1) {
            this.f62178b = cb.j("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(name);
            return;
        }
        if (i13 == 2) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f62178b = name;
        } else if (i13 == 3) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f62178b = name;
        } else if (i13 != 4) {
            this.f62178b = cb.j("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(name);
        } else {
            this.f62178b = name;
        }
    }

    public static String f(String str, String str2, Object... objArr) {
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

    public static String i(String str, String str2, Object... objArr) {
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

    public final void a(String str, Exception exc, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f62178b, str, objArr), exc);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", i(this.f62178b, str, objArr));
        }
    }

    public final void c(String str, Object... objArr) {
        int i13 = this.f62177a;
        String str2 = this.f62178b;
        switch (i13) {
            case 0:
                if (Log.isLoggable("PlayCore", 4)) {
                    Log.i("PlayCore", f(str2, str, objArr));
                    break;
                }
                break;
            default:
                if (Log.isLoggable("PlayCore", 6)) {
                    Log.e("PlayCore", i(str2, str, objArr));
                    break;
                }
                break;
        }
    }

    public final void d(String str, RemoteException remoteException, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", i(this.f62178b, str, objArr), remoteException);
        }
    }

    public final void e(Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", f(this.f62178b, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
    }

    public final void g(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", i(this.f62178b, str, objArr));
        }
    }

    public final void h(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", i(this.f62178b, str, objArr));
        }
    }

    public final String toString() {
        int i13 = this.f62177a;
        String str = this.f62178b;
        switch (i13) {
            case 3:
                return str;
            case 4:
                return s1.b("<", str, '>');
            default:
                return super.toString();
        }
    }
}
