package c0;

import androidx.media3.common.VideoFrameProcessingException;
import pk.v2;

/* loaded from: classes2.dex */
public final class x0 implements a7.l1 {

    /* renamed from: a */
    public long f24391a;

    /* renamed from: b */
    public final Object f24392b;

    public x0(oh.a aVar) {
        com.bumptech.glide.d.t(aVar);
        this.f24392b = aVar;
    }

    public final void a(VideoFrameProcessingException videoFrameProcessingException) {
        ((l7.s0) this.f24392b).f81861f.execute(new w2.c(12, this, videoFrameProcessingException));
    }

    public x0(String str, long j13) {
        this.f24392b = str;
        this.f24391a = j13;
    }

    public x0(long j13, v2 v2Var) {
        this.f24391a = j13;
        this.f24392b = v2Var;
    }

    public x0(l7.s0 s0Var) {
        this.f24392b = s0Var;
    }
}
