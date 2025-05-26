package d7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class a extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f53780a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f53781b = false;

    public a(File file) {
        this.f53780a = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.f53780a;
        if (this.f53781b) {
            return;
        }
        this.f53781b = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e13) {
            u.h("AtomicFile", "Failed to sync file descriptor:", e13);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f53780a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i13) {
        this.f53780a.write(i13);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f53780a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) {
        this.f53780a.write(bArr, i13, i14);
    }
}
