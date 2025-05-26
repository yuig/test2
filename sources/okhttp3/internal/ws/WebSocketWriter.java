package okhttp3.internal.ws;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wo2.b;
import wo2.g;
import wo2.j;
import wo2.k;
import wo2.m;
import wo2.n;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class WebSocketWriter implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f96328a;

    /* renamed from: b, reason: collision with root package name */
    public final k f96329b;

    /* renamed from: c, reason: collision with root package name */
    public final Random f96330c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f96331d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f96332e;

    /* renamed from: f, reason: collision with root package name */
    public final long f96333f;

    /* renamed from: g, reason: collision with root package name */
    public final j f96334g;

    /* renamed from: h, reason: collision with root package name */
    public final j f96335h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f96336i;

    /* renamed from: j, reason: collision with root package name */
    public MessageDeflater f96337j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f96338k;

    /* renamed from: l, reason: collision with root package name */
    public final g f96339l;

    public WebSocketWriter(boolean z13, k sink, Random random, boolean z14, boolean z15, long j13) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f96328a = z13;
        this.f96329b = sink;
        this.f96330c = random;
        this.f96331d = z14;
        this.f96332e = z15;
        this.f96333f = j13;
        this.f96334g = new j();
        this.f96335h = sink.l();
        this.f96338k = z13 ? new byte[4] : null;
        this.f96339l = z13 ? new g() : null;
    }

    public final void a(int i13, m mVar) {
        if (this.f96336i) {
            throw new IOException("closed");
        }
        int b13 = mVar.b();
        if (b13 > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        int i14 = i13 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        j jVar = this.f96335h;
        jVar.a0(i14);
        if (this.f96328a) {
            jVar.a0(b13 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            byte[] bArr = this.f96338k;
            Intrinsics.f(bArr);
            this.f96330c.nextBytes(bArr);
            jVar.U(bArr);
            if (b13 > 0) {
                long j13 = jVar.f130711b;
                jVar.S(mVar);
                g gVar = this.f96339l;
                Intrinsics.f(gVar);
                jVar.z(gVar);
                gVar.c(j13);
                WebSocketProtocol.f96311a.getClass();
                WebSocketProtocol.b(gVar, bArr);
                gVar.close();
            }
        } else {
            jVar.a0(b13);
            jVar.S(mVar);
        }
        this.f96329b.flush();
    }

    public final void c(int i13, m data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f96336i) {
            throw new IOException("closed");
        }
        j buffer = this.f96334g;
        buffer.S(data);
        int i14 = i13 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (this.f96331d && data.b() >= this.f96333f) {
            MessageDeflater messageDeflater = this.f96337j;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.f96332e);
                this.f96337j = messageDeflater;
            }
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            j jVar = messageDeflater.f96258b;
            if (jVar.f130711b != 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (messageDeflater.f96257a) {
                messageDeflater.f96259c.reset();
            }
            long j13 = buffer.f130711b;
            n nVar = messageDeflater.f96260d;
            nVar.write(buffer, j13);
            nVar.flush();
            if (jVar.P0(jVar.f130711b - r12.f130713a.length, MessageDeflaterKt.f96261a)) {
                long j14 = jVar.f130711b - 4;
                g z13 = jVar.z(b.f130670a);
                try {
                    z13.a(j14);
                    dl2.b.J(z13, null);
                } finally {
                }
            } else {
                jVar.a0(0);
            }
            buffer.write(jVar, jVar.f130711b);
            i14 = i13 | RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY;
        }
        long j15 = buffer.f130711b;
        j jVar2 = this.f96335h;
        jVar2.a0(i14);
        boolean z14 = this.f96328a;
        int i15 = z14 ? RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN : 0;
        if (j15 <= 125) {
            jVar2.a0(i15 | ((int) j15));
        } else if (j15 <= 65535) {
            jVar2.a0(i15 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            jVar2.m0((int) j15);
        } else {
            jVar2.a0(i15 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
            jVar2.i0(j15);
        }
        if (z14) {
            byte[] bArr = this.f96338k;
            Intrinsics.f(bArr);
            this.f96330c.nextBytes(bArr);
            jVar2.U(bArr);
            if (j15 > 0) {
                g gVar = this.f96339l;
                Intrinsics.f(gVar);
                buffer.z(gVar);
                gVar.c(0L);
                WebSocketProtocol.f96311a.getClass();
                WebSocketProtocol.b(gVar, bArr);
                gVar.close();
            }
        }
        jVar2.write(buffer, j15);
        this.f96329b.n();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MessageDeflater messageDeflater = this.f96337j;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }
}
