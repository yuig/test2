package s0;

import androidx.camera.core.impl.c;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.j1;
import androidx.camera.core.impl.v0;
import androidx.camera.core.impl.v1;
import androidx.camera.core.impl.z2;
import com.bumptech.glide.d;
import r0.c1;

/* loaded from: classes2.dex */
public final class a implements z2, j1, d2 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f110289b = new c(c1.class, null, "camerax.video.VideoCapture.videoOutput");

    /* renamed from: c, reason: collision with root package name */
    public static final c f110290c = new c(q.a.class, null, "camerax.video.VideoCapture.videoEncoderInfoFinder");

    /* renamed from: d, reason: collision with root package name */
    public static final c f110291d = new c(Boolean.class, null, "camerax.video.VideoCapture.forceEnableSurfaceProcessing");

    /* renamed from: a, reason: collision with root package name */
    public final v1 f110292a;

    public a(v1 v1Var) {
        d.h(v1Var.f16980a.containsKey(f110289b));
        this.f110292a = v1Var;
    }

    @Override // androidx.camera.core.impl.d2
    public final v0 getConfig() {
        return this.f110292a;
    }

    @Override // androidx.camera.core.impl.i1
    public final int l() {
        return 34;
    }
}
