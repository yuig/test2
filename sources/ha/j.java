package ha;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f68350a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68351b;

    /* renamed from: c, reason: collision with root package name */
    public final long f68352c;

    /* renamed from: d, reason: collision with root package name */
    public final long f68353d;

    public j(int i13, int i14, long j13, long j14) {
        this.f68350a = i13;
        this.f68351b = i14;
        this.f68352c = j13;
        this.f68353d = j14;
    }

    public static j a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
        } catch (Throwable th3) {
            try {
                dataInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f68350a);
            dataOutputStream.writeInt(this.f68351b);
            dataOutputStream.writeLong(this.f68352c);
            dataOutputStream.writeLong(this.f68353d);
            dataOutputStream.close();
        } catch (Throwable th3) {
            try {
                dataOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f68351b == jVar.f68351b && this.f68352c == jVar.f68352c && this.f68350a == jVar.f68350a && this.f68353d == jVar.f68353d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f68351b), Long.valueOf(this.f68352c), Integer.valueOf(this.f68350a), Long.valueOf(this.f68353d));
    }
}
