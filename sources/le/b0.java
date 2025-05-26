package le;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b0 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f83020a;

    /* renamed from: b, reason: collision with root package name */
    public Exception f83021b;

    public b0(d0 requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f83020a = requests;
    }

    public final void a(List result) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (p001if.a.b(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(result, "result");
                super.onPostExecute(result);
                Exception exc = this.f83021b;
                if (exc != null) {
                    Intrinsics.checkNotNullExpressionValue(String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)), "java.lang.String.format(format, *args)");
                    v vVar = v.f83104a;
                }
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        ArrayList arrayList = null;
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            if (p001if.a.b(this)) {
                return null;
            }
            try {
                Void[] params = (Void[]) objArr;
                if (!p001if.a.b(this)) {
                    try {
                        if (!p001if.a.b(this)) {
                            try {
                                Intrinsics.checkNotNullParameter(params, "params");
                                try {
                                    d0 d0Var = this.f83020a;
                                    d0Var.getClass();
                                    String str = a0.f83002j;
                                    arrayList = wc.b.o(d0Var);
                                } catch (Exception e13) {
                                    this.f83021b = e13;
                                }
                            } catch (Throwable th3) {
                                p001if.a.a(this, th3);
                            }
                        }
                    } catch (Throwable th4) {
                        p001if.a.a(this, th4);
                    }
                }
                return arrayList;
            } catch (Throwable th5) {
                p001if.a.a(this, th5);
                return arrayList;
            }
        } catch (Throwable th6) {
            p001if.a.a(this, th6);
            return arrayList;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (p001if.a.b(this)) {
                return;
            }
            try {
                a((List) obj);
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        d0 d0Var = this.f83020a;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (p001if.a.b(this)) {
                return;
            }
            try {
                super.onPreExecute();
                v vVar = v.f83104a;
                if (d0Var.f83032a == null) {
                    d0Var.f83032a = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
                }
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    public final String toString() {
        String str = "{RequestAsyncTask:  connection: null, requests: " + this.f83020a + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
