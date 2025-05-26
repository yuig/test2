package oh;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import kh2.u2;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f94455a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f94456b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static String f94457c;

    /* renamed from: d, reason: collision with root package name */
    public static int f94458d;

    public static String a() {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        String processName;
        if (f94457c == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f94457c = processName;
            } else {
                int i13 = f94458d;
                if (i13 == 0) {
                    i13 = Process.myPid();
                    f94458d = i13;
                }
                String str2 = null;
                str2 = null;
                str2 = null;
                BufferedReader bufferedReader2 = null;
                if (i13 > 0) {
                    try {
                        str = "/proc/" + i13 + "/cmdline";
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String readLine = bufferedReader.readLine();
                            com.bumptech.glide.d.t(readLine);
                            str2 = readLine.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th4) {
                            th = th4;
                            bufferedReader2 = bufferedReader;
                            u2.M(bufferedReader2);
                            throw th;
                        }
                        u2.M(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                f94457c = str2;
            }
        }
        return f94457c;
    }
}
