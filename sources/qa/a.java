package qa;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f103193e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f103194a;

    /* renamed from: b, reason: collision with root package name */
    public final File f103195b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f103196c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f103197d;

    public a(File file, String name, boolean z13) {
        Lock lock;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f103194a = z13;
        this.f103195b = file != null ? new File(file, a.a.C(name, ".lck")) : null;
        HashMap hashMap = f103193e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(name);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(name, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f103196c = lock;
    }

    public final void a(boolean z13) {
        this.f103196c.lock();
        if (z13) {
            File file = this.f103195b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f103197d = channel;
            } catch (IOException e13) {
                this.f103197d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e13);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f103197d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f103196c.unlock();
    }
}
