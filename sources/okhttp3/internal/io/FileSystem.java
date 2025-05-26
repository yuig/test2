package okhttp3.internal.io;

import ao2.m0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wo2.c;
import wo2.d;
import wo2.i0;
import wo2.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/io/FileSystem;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface FileSystem {

    /* renamed from: a, reason: collision with root package name */
    public static final FileSystem f96182a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", "", "()V", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f96183a = 0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
        public static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public final void a(File directory) {
                Intrinsics.checkNotNullParameter(directory, "directory");
                File[] listFiles = directory.listFiles();
                if (listFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : listFiles) {
                    if (file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue(file, "file");
                        a(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public final boolean b(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public final c c(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    Logger logger = u.f130736a;
                    Intrinsics.checkNotNullParameter(file, "<this>");
                    return m0.i0(new FileOutputStream(file, true));
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    Logger logger2 = u.f130736a;
                    Intrinsics.checkNotNullParameter(file, "<this>");
                    return m0.i0(new FileOutputStream(file, true));
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public final long d(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public final d e(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                Logger logger = u.f130736a;
                Intrinsics.checkNotNullParameter(file, "<this>");
                return new d(new FileInputStream(file), i0.f130705e);
            }

            @Override // okhttp3.internal.io.FileSystem
            public final c f(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return m0.k0(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return m0.k0(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public final void g(File from, File to3) {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to3, "to");
                h(to3);
                if (from.renameTo(to3)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to3);
            }

            @Override // okhttp3.internal.io.FileSystem
            public final void h(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            public final String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i13 = Companion.f96183a;
        f96182a = new Companion.SystemFileSystem();
    }

    void a(File file);

    boolean b(File file);

    c c(File file);

    long d(File file);

    d e(File file);

    c f(File file);

    void g(File file, File file2);

    void h(File file);
}
