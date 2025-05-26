package ta;

import android.os.Trace;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(int i13, String str) {
        Trace.beginAsyncSection(str, i13);
    }

    public static void b(int i13, String str) {
        Trace.endAsyncSection(str, i13);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(int i13, String str) {
        Trace.setCounter(str, i13);
    }
}
