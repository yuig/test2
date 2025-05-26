package jk;

import a.cb;
import android.content.Context;
import android.os.Process;
import java.io.File;

/* loaded from: classes3.dex */
public abstract class a {
    static {
        cb.j("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("SplitInstallHelper");
    }

    public static void a(Context context, String str) {
        synchronized (r.class) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e13) {
                String str2 = context.getApplicationInfo().nativeLibraryDir + "/" + System.mapLibraryName(str);
                if (!new File(str2).exists()) {
                    throw e13;
                }
                System.load(str2);
            }
        }
    }
}
