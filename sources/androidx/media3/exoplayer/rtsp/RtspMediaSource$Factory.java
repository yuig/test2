package androidx.media3.exoplayer.rtsp;

import a10.e;
import a7.i0;
import a8.b0;
import a8.d;
import a8.r0;
import a8.t0;
import com.bumptech.glide.c;
import g8.a;
import g8.d0;
import javax.net.SocketFactory;
import s7.i;

/* loaded from: classes3.dex */
public final class RtspMediaSource$Factory implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f18839a = 8000;

    /* renamed from: b, reason: collision with root package name */
    public final String f18840b = "AndroidXMedia3/1.6.1";

    /* renamed from: c, reason: collision with root package name */
    public final SocketFactory f18841c = SocketFactory.getDefault();

    @Override // g8.d0
    public final a d(i0 i0Var) {
        d dVar;
        i0Var.f1073b.getClass();
        a7.d0 d0Var = i0Var.f1073b;
        d0Var.getClass();
        String scheme = d0Var.f969a.getScheme();
        long j13 = this.f18839a;
        if (scheme == null || !c.z("rtspt", scheme)) {
            t0 t0Var = new t0();
            t0Var.f1462a = j13;
            dVar = t0Var;
        } else {
            dVar = new r0(j13);
        }
        return new b0(i0Var, dVar, this.f18840b, this.f18841c);
    }

    @Override // g8.d0
    public final d0 e(i iVar) {
        return this;
    }

    @Override // g8.d0
    public final d0 g(e eVar) {
        return this;
    }
}
