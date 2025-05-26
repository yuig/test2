package a8;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.appcompat.app.v0;
import gi.u1;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class h0 implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ int f1350a;

    /* renamed from: b */
    public final Closeable f1351b;

    /* renamed from: c */
    public Object f1352c;

    /* renamed from: d */
    public final Object f1353d;

    /* renamed from: e */
    public final Object f1354e;

    public h0(ByteArrayInputStream byteArrayInputStream) {
        this.f1350a = 1;
        this.f1353d = new byte[8];
        this.f1354e = new v0();
        this.f1351b = byteArrayInputStream;
    }

    public final long a() {
        k(Byte.MIN_VALUE);
        h();
        long g13 = g();
        if (g13 < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (g13 > 0) {
            v0 v0Var = (v0) this.f1354e;
            v0Var.f16142a.push(Long.valueOf(g13));
        }
        return g13;
    }

    public final long c() {
        boolean z13;
        e();
        byte b13 = ((u1) this.f1352c).f65120a;
        if (b13 == 0) {
            z13 = true;
        } else {
            if (b13 != 32) {
                throw new IllegalStateException(a.a.d("expected major type 0 or 1 but found ", (((u1) this.f1352c).f65120a >> 5) & 7));
            }
            z13 = false;
        }
        long g13 = g();
        if (g13 >= 0) {
            return z13 ? g13 : ~g13;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1350a) {
            case 0:
                Handler handler = (Handler) this.f1353d;
                HandlerThread handlerThread = (HandlerThread) this.f1352c;
                Objects.requireNonNull(handlerThread);
                handler.post(new u0.n(handlerThread, 18));
                try {
                    ((HandlerThread) this.f1352c).join();
                    break;
                } catch (InterruptedException unused) {
                    ((HandlerThread) this.f1352c).interrupt();
                    return;
                }
            default:
                ((InputStream) this.f1351b).close();
                ((v0) this.f1354e).a();
                break;
        }
    }

    public final long d() {
        k((byte) -96);
        h();
        long g13 = g();
        if (g13 < 0 || g13 > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (g13 > 0) {
            v0 v0Var = (v0) this.f1354e;
            v0Var.f16142a.push(Long.valueOf(g13 + g13));
        }
        return g13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a9, code lost:
    
        if (r0 != (-2)) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final gi.u1 e() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h0.e():gi.u1");
    }

    public final boolean f() {
        k((byte) -32);
        if (((u1) this.f1352c).f65121b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int g13 = (int) g();
        if (g13 == 20) {
            return false;
        }
        if (g13 == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final long g() {
        byte b13 = ((u1) this.f1352c).f65121b;
        if (b13 < 24) {
            long j13 = b13;
            this.f1352c = null;
            return j13;
        }
        if (b13 == 24) {
            int read = ((InputStream) this.f1351b).read();
            if (read == -1) {
                throw new EOFException();
            }
            this.f1352c = null;
            return read & 255;
        }
        Object obj = this.f1353d;
        if (b13 == 25) {
            m(2, (byte[]) obj);
            return ((r10[0] & 255) << 8) | (r10[1] & 255);
        }
        if (b13 == 26) {
            m(4, (byte[]) obj);
            return ((r10[0] & 255) << 24) | ((r10[1] & 255) << 16) | ((r10[2] & 255) << 8) | (r10[3] & 255);
        }
        if (b13 != 27) {
            Object obj2 = this.f1352c;
            throw new IOException(a.a.f("invalid additional information ", ((u1) obj2).f65121b, " for major type ", (((u1) obj2).f65120a >> 5) & 7));
        }
        byte[] bArr = (byte[]) obj;
        m(8, bArr);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (255 & bArr[7]);
    }

    public final void h() {
        e();
        if (((u1) this.f1352c).f65121b == 31) {
            throw new IllegalStateException(a.a.d("expected definite length but found ", ((u1) this.f1352c).f65121b));
        }
    }

    public final void k(byte b13) {
        e();
        if (((u1) this.f1352c).f65120a != b13) {
            throw new IllegalStateException(a.a.f("expected major type ", (b13 >> 5) & 7, " but found ", (((u1) this.f1352c).f65120a >> 5) & 7));
        }
    }

    public final void m(int i13, byte[] bArr) {
        int i14 = 0;
        while (i14 != i13) {
            int read = ((InputStream) this.f1351b).read(bArr, i14, i13 - i14);
            if (read == -1) {
                throw new EOFException();
            }
            i14 += read;
        }
        this.f1352c = null;
    }

    public final byte[] o() {
        h();
        long g13 = g();
        if (g13 < 0 || g13 > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (((InputStream) this.f1351b).available() < g13) {
            throw new EOFException();
        }
        int i13 = (int) g13;
        byte[] bArr = new byte[i13];
        m(i13, bArr);
        return bArr;
    }

    public h0(i0 i0Var, OutputStream outputStream) {
        this.f1350a = 0;
        this.f1354e = i0Var;
        this.f1351b = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f1352c = handlerThread;
        handlerThread.start();
        this.f1353d = new Handler(((HandlerThread) this.f1352c).getLooper());
    }
}
