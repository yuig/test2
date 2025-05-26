package k7;

import a.cb;
import a7.j0;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class e extends e7.e {

    /* renamed from: c, reason: collision with root package name */
    public androidx.media3.common.b f78452c;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f78454e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f78455f;

    /* renamed from: g, reason: collision with root package name */
    public long f78456g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f78457h;

    /* renamed from: i, reason: collision with root package name */
    public final int f78458i;

    /* renamed from: d, reason: collision with root package name */
    public final c f78453d = new c();

    /* renamed from: j, reason: collision with root package name */
    public final int f78459j = 0;

    static {
        j0.a("media3.decoder");
    }

    public e(int i13) {
        this.f78458i = i13;
    }

    public void n() {
        this.f57530b = 0;
        ByteBuffer byteBuffer = this.f78454e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f78457h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f78455f = false;
    }

    public final ByteBuffer o(final int i13) {
        int i14 = this.f78458i;
        if (i14 == 1) {
            return ByteBuffer.allocate(i13);
        }
        if (i14 == 2) {
            return ByteBuffer.allocateDirect(i13);
        }
        ByteBuffer byteBuffer = this.f78454e;
        final int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException(capacity, i13) { // from class: androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException
            {
                super(cb.j("Buffer too small (", capacity, " < ", i13, ")"));
            }
        };
    }

    public final void p(int i13) {
        int i14 = i13 + this.f78459j;
        ByteBuffer byteBuffer = this.f78454e;
        if (byteBuffer == null) {
            this.f78454e = o(i14);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i15 = i14 + position;
        if (capacity >= i15) {
            this.f78454e = byteBuffer;
            return;
        }
        ByteBuffer o13 = o(i15);
        o13.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            o13.put(byteBuffer);
        }
        this.f78454e = o13;
    }

    public final void q() {
        ByteBuffer byteBuffer = this.f78454e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f78457h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
