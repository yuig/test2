package tp2;

import android.util.Log;
import ep.b;
import java.util.logging.Level;
import sp2.h;

/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f118794a;

    static {
        boolean z13;
        try {
            Class.forName("android.util.Log");
            z13 = true;
        } catch (ClassNotFoundException unused) {
            z13 = false;
        }
        f118794a = z13;
    }

    public static int a(Level level) {
        int intValue = level.intValue();
        if (intValue < 800) {
            return intValue < 500 ? 2 : 3;
        }
        if (intValue < 900) {
            return 4;
        }
        return intValue < 1000 ? 5 : 6;
    }

    @Override // sp2.h
    public final void s(Level level, String str, Throwable th3) {
        if (level != Level.OFF) {
            int a13 = a(level);
            StringBuilder D = b.D(str, "\n");
            D.append(Log.getStackTraceString(th3));
            Log.println(a13, "EventBus", D.toString());
        }
    }

    @Override // sp2.h
    public final void u(String str, Level level) {
        if (level != Level.OFF) {
            Log.println(a(level), "EventBus", str);
        }
    }
}
