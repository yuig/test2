package k6;

import android.system.Os;
import java.io.FileDescriptor;

/* loaded from: classes3.dex */
public abstract class h {
    public static void a(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j13, int i13) {
        return Os.lseek(fileDescriptor, j13, i13);
    }
}
