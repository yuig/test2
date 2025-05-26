package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import wo2.g;
import wo2.j;
import wo2.l;
import wo2.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "FrameCallback", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class WebSocketReader implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f96312a;

    /* renamed from: b, reason: collision with root package name */
    public final l f96313b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameCallback f96314c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f96315d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f96316e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96317f;

    /* renamed from: g, reason: collision with root package name */
    public int f96318g;

    /* renamed from: h, reason: collision with root package name */
    public long f96319h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f96320i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f96321j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f96322k;

    /* renamed from: l, reason: collision with root package name */
    public final j f96323l;

    /* renamed from: m, reason: collision with root package name */
    public final j f96324m;

    /* renamed from: n, reason: collision with root package name */
    public MessageInflater f96325n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f96326o;

    /* renamed from: p, reason: collision with root package name */
    public final g f96327p;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public interface FrameCallback {
        void b(String str);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);

        void h(int i13, String str);
    }

    public WebSocketReader(boolean z13, l source, RealWebSocket frameCallback, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f96312a = z13;
        this.f96313b = source;
        this.f96314c = frameCallback;
        this.f96315d = z14;
        this.f96316e = z15;
        this.f96323l = new j();
        this.f96324m = new j();
        this.f96326o = z13 ? null : new byte[4];
        this.f96327p = z13 ? null : new g();
    }

    public final void a() {
        short s13;
        String str;
        long j13 = this.f96319h;
        j jVar = this.f96323l;
        if (j13 > 0) {
            this.f96313b.R(jVar, j13);
            if (!this.f96312a) {
                g gVar = this.f96327p;
                Intrinsics.f(gVar);
                jVar.z(gVar);
                gVar.c(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.f96311a;
                byte[] bArr = this.f96326o;
                Intrinsics.f(bArr);
                webSocketProtocol.getClass();
                WebSocketProtocol.b(gVar, bArr);
                gVar.close();
            }
        }
        int i13 = this.f96318g;
        FrameCallback frameCallback = this.f96314c;
        switch (i13) {
            case 8:
                long j14 = jVar.f130711b;
                if (j14 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j14 != 0) {
                    s13 = jVar.readShort();
                    str = jVar.M();
                    WebSocketProtocol.f96311a.getClass();
                    String a13 = WebSocketProtocol.a(s13);
                    if (a13 != null) {
                        throw new ProtocolException(a13);
                    }
                } else {
                    s13 = 1005;
                    str = "";
                }
                frameCallback.h(s13, str);
                this.f96317f = true;
                return;
            case 9:
                frameCallback.e(jVar.a1(jVar.f130711b));
                return;
            case 10:
                frameCallback.c(jVar.a1(jVar.f130711b));
                return;
            default:
                StringBuilder sb3 = new StringBuilder("Unknown control opcode: ");
                int i14 = this.f96318g;
                byte[] bArr2 = Util.f95757a;
                String hexString = Integer.toHexString(i14);
                Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                sb3.append(hexString);
                throw new ProtocolException(sb3.toString());
        }
    }

    public final void c() {
        boolean z13;
        if (this.f96317f) {
            throw new IOException("closed");
        }
        l lVar = this.f96313b;
        long h10 = lVar.timeout().h();
        lVar.timeout().b();
        try {
            byte readByte = lVar.readByte();
            byte[] bArr = Util.f95757a;
            lVar.timeout().g(h10, TimeUnit.NANOSECONDS);
            int i13 = readByte & 15;
            this.f96318g = i13;
            boolean z14 = (readByte & 128) != 0;
            this.f96320i = z14;
            boolean z15 = (readByte & 8) != 0;
            this.f96321j = z15;
            if (z15 && !z14) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z16 = (readByte & 64) != 0;
            if (i13 == 1 || i13 == 2) {
                if (!z16) {
                    z13 = false;
                } else {
                    if (!this.f96315d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z13 = true;
                }
                this.f96322k = z13;
            } else if (z16) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((readByte & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((readByte & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte readByte2 = lVar.readByte();
            boolean z17 = (readByte2 & 128) != 0;
            boolean z18 = this.f96312a;
            if (z17 == z18) {
                throw new ProtocolException(z18 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j13 = readByte2 & Byte.MAX_VALUE;
            this.f96319h = j13;
            if (j13 == 126) {
                this.f96319h = lVar.readShort() & 65535;
            } else if (j13 == 127) {
                long readLong = lVar.readLong();
                this.f96319h = readLong;
                if (readLong < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.y(this.f96319h) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f96321j && this.f96319h > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z17) {
                byte[] bArr2 = this.f96326o;
                Intrinsics.f(bArr2);
                lVar.readFully(bArr2);
            }
        } catch (Throwable th3) {
            lVar.timeout().g(h10, TimeUnit.NANOSECONDS);
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MessageInflater messageInflater = this.f96325n;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }
}
