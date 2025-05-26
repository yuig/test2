package b7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    public int f22073b;

    /* renamed from: c, reason: collision with root package name */
    public float f22074c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f22075d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public e f22076e;

    /* renamed from: f, reason: collision with root package name */
    public e f22077f;

    /* renamed from: g, reason: collision with root package name */
    public e f22078g;

    /* renamed from: h, reason: collision with root package name */
    public e f22079h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22080i;

    /* renamed from: j, reason: collision with root package name */
    public h f22081j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f22082k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f22083l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f22084m;

    /* renamed from: n, reason: collision with root package name */
    public long f22085n;

    /* renamed from: o, reason: collision with root package name */
    public long f22086o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22087p;

    public i() {
        e eVar = e.f22037e;
        this.f22076e = eVar;
        this.f22077f = eVar;
        this.f22078g = eVar;
        this.f22079h = eVar;
        ByteBuffer byteBuffer = f.f22042a;
        this.f22082k = byteBuffer;
        this.f22083l = byteBuffer.asShortBuffer();
        this.f22084m = byteBuffer;
        this.f22073b = -1;
    }

    @Override // b7.f
    public final void d() {
        this.f22074c = 1.0f;
        this.f22075d = 1.0f;
        e eVar = e.f22037e;
        this.f22076e = eVar;
        this.f22077f = eVar;
        this.f22078g = eVar;
        this.f22079h = eVar;
        ByteBuffer byteBuffer = f.f22042a;
        this.f22082k = byteBuffer;
        this.f22083l = byteBuffer.asShortBuffer();
        this.f22084m = byteBuffer;
        this.f22073b = -1;
        this.f22080i = false;
        this.f22081j = null;
        this.f22085n = 0L;
        this.f22086o = 0L;
        this.f22087p = false;
    }

    @Override // b7.f
    public final ByteBuffer e() {
        int g13;
        h hVar = this.f22081j;
        if (hVar != null && (g13 = hVar.g()) > 0) {
            if (this.f22082k.capacity() < g13) {
                ByteBuffer order = ByteBuffer.allocateDirect(g13).order(ByteOrder.nativeOrder());
                this.f22082k = order;
                this.f22083l = order.asShortBuffer();
            } else {
                this.f22082k.clear();
                this.f22083l.clear();
            }
            hVar.f(this.f22083l);
            this.f22086o += g13;
            this.f22082k.limit(g13);
            this.f22084m = this.f22082k;
        }
        ByteBuffer byteBuffer = this.f22084m;
        this.f22084m = f.f22042a;
        return byteBuffer;
    }

    @Override // b7.f
    public final void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            h hVar = this.f22081j;
            hVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f22085n += remaining;
            hVar.l(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // b7.f
    public final void flush() {
        if (isActive()) {
            e eVar = this.f22076e;
            this.f22078g = eVar;
            e eVar2 = this.f22077f;
            this.f22079h = eVar2;
            if (this.f22080i) {
                int i13 = eVar.f22038a;
                this.f22081j = new h(this.f22074c, this.f22075d, i13, eVar.f22039b, eVar2.f22038a);
            } else {
                h hVar = this.f22081j;
                if (hVar != null) {
                    hVar.e();
                }
            }
        }
        this.f22084m = f.f22042a;
        this.f22085n = 0L;
        this.f22086o = 0L;
        this.f22087p = false;
    }

    @Override // b7.f
    public final e g(e eVar) {
        if (eVar.f22040c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(eVar);
        }
        int i13 = this.f22073b;
        if (i13 == -1) {
            i13 = eVar.f22038a;
        }
        this.f22076e = eVar;
        e eVar2 = new e(i13, eVar.f22039b, 2);
        this.f22077f = eVar2;
        this.f22080i = true;
        return eVar2;
    }

    @Override // b7.f
    public final void h() {
        h hVar = this.f22081j;
        if (hVar != null) {
            hVar.k();
        }
        this.f22087p = true;
    }

    @Override // b7.f
    public final boolean i() {
        h hVar;
        return this.f22087p && ((hVar = this.f22081j) == null || hVar.g() == 0);
    }

    @Override // b7.f
    public final boolean isActive() {
        return this.f22077f.f22038a != -1 && (Math.abs(this.f22074c - 1.0f) >= 1.0E-4f || Math.abs(this.f22075d - 1.0f) >= 1.0E-4f || this.f22077f.f22038a != this.f22076e.f22038a);
    }
}
