package com.bugsnag.android;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final File f29393a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f29394b;

    /* renamed from: c, reason: collision with root package name */
    public final u1 f29395c;

    /* renamed from: d, reason: collision with root package name */
    public final sp2.i f29396d;

    public o0(File file, Function0 function0, u1 u1Var) {
        this.f29393a = file;
        this.f29394b = function0;
        this.f29395c = u1Var;
        try {
            file.createNewFile();
        } catch (Throwable th3) {
            this.f29395c.a("Failed to created device ID file", th3);
        }
        this.f29396d = new sp2.i(this.f29393a);
    }

    public final String a(boolean z13) {
        try {
            m0 b13 = b();
            if ((b13 == null ? null : b13.f29339a) != null) {
                return b13.f29339a;
            }
            if (z13) {
                return c((UUID) this.f29394b.invoke());
            }
            return null;
        } catch (Throwable th3) {
            this.f29395c.a("Failed to load device ID", th3);
            return null;
        }
    }

    public final m0 b() {
        if (this.f29393a.length() <= 0) {
            return null;
        }
        try {
            return (m0) this.f29396d.V(new n0(m0.f29338b, 0));
        } catch (Throwable th3) {
            this.f29395c.a("Failed to load device ID", th3);
            return null;
        }
    }

    public final String c(UUID uuid) {
        FileLock fileLock;
        String uuid2;
        try {
            FileChannel channel = new FileOutputStream(this.f29393a).getChannel();
            int i13 = 0;
            while (true) {
                if (i13 >= 20) {
                    fileLock = null;
                    break;
                }
                i13++;
                try {
                    try {
                        fileLock = channel.tryLock();
                        break;
                    } catch (OverlappingFileLockException unused) {
                        Thread.sleep(25L);
                    }
                } finally {
                }
            }
            if (fileLock == null) {
                uuid2 = null;
            } else {
                try {
                    m0 b13 = b();
                    if ((b13 == null ? null : b13.f29339a) != null) {
                        uuid2 = b13.f29339a;
                    } else {
                        uuid2 = uuid.toString();
                        this.f29396d.X(new m0(uuid2));
                    }
                } finally {
                    fileLock.release();
                }
            }
            dl2.b.J(channel, null);
            return uuid2;
        } catch (IOException e13) {
            this.f29395c.a("Failed to persist device ID", e13);
            return null;
        }
    }
}
