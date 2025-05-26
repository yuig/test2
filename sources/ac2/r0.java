package ac2;

import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r0 implements a7.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f2041a;

    public r0(s0 s0Var) {
        this.f2041a = s0Var;
    }

    @Override // a7.t0
    public final void C4(ExoPlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Objects.toString(error);
        s0 s0Var = this.f2041a;
        s0Var.getClass();
        if (s0Var.f2058f || error.f18745a != 4001) {
            return;
        }
        s0Var.f2058f = true;
    }

    @Override // a7.t0
    public final void L5() {
        this.f2041a.getClass();
    }

    @Override // a7.t0
    public final void z0(Throwable th3) {
        Objects.toString(th3);
        s0 s0Var = this.f2041a;
        s0Var.getClass();
        if (s0Var.f2057e == null) {
            s0Var.f2057e = th3;
        }
    }
}
