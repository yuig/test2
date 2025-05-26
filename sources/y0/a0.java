package y0;

import a.a4;
import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import c0.m1;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import kh2.m0;

/* loaded from: classes2.dex */
public final class a0 extends MediaCodec.Callback {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f136247l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a1.d f136248a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f136249b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f136250c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f136251d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f136252e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f136253f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f136254g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f136255h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f136256i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f136257j = false;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c0 f136258k;

    public a0(c0 c0Var) {
        this.f136258k = c0Var;
        this.f136249b = true;
        if (c0Var.f136279c) {
            this.f136248a = new a1.d(c0Var.f136293q, c0Var.f136292p, (CameraUseInconsistentTimebaseQuirk) w0.a.f126951a.b(CameraUseInconsistentTimebaseQuirk.class));
        } else {
            this.f136248a = null;
        }
        if (((CodecStuckOnFlushQuirk) w0.a.f126951a.b(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(c0Var.f136280d.getString("mime"))) {
            return;
        }
        this.f136249b = false;
    }

    public final void a() {
        c0 c0Var;
        n nVar;
        Executor executor;
        if (this.f136252e) {
            return;
        }
        this.f136252e = true;
        Future future = this.f136258k.D;
        if (future != null) {
            future.cancel(false);
            this.f136258k.D = null;
        }
        synchronized (this.f136258k.f136278b) {
            c0Var = this.f136258k;
            nVar = c0Var.f136294r;
            executor = c0Var.f136295s;
        }
        c0Var.l(new a4(this, executor, nVar, 18));
    }

    public final void b(i iVar, n nVar, Executor executor) {
        c0 c0Var = this.f136258k;
        c0Var.f136290n.add(iVar);
        g0.m.a(g0.m.f(iVar.f136346e), new m1(11, this, iVar), c0Var.f136284h);
        try {
            executor.execute(new l0.e(25, nVar, iVar));
        } catch (RejectedExecutionException e13) {
            m0.t(c0Var.f136277a, "Unable to post to the supplied executor.", e13);
            iVar.close();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.f136258k.f136284h.execute(new l0.e(22, this, codecException));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i13) {
        this.f136258k.f136284h.execute(new v.k(this, i13, 4));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i13, MediaCodec.BufferInfo bufferInfo) {
        this.f136258k.f136284h.execute(new r(this, bufferInfo, mediaCodec, i13, 2));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f136258k.f136284h.execute(new l0.e(23, this, mediaFormat));
    }
}
