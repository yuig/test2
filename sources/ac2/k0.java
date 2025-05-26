package ac2;

import androidx.media3.exoplayer.ExoPlaybackException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k0 implements a7.t0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1984a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uj2.i f1986c;

    public k0(a7.v0 v0Var, gk2.l lVar) {
        this.f1986c = lVar;
        this.f1984a = v0Var.L();
        this.f1985b = v0Var.z();
    }

    @Override // a7.t0
    public final void C4(ExoPlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f1986c.a(error);
    }

    @Override // a7.t0
    public final void T3(int i13, boolean z13) {
        this.f1985b = z13;
        this.f1986c.c(new Pair(Boolean.valueOf(z13), Integer.valueOf(this.f1984a)));
    }

    @Override // a7.t0
    public final void r0(int i13) {
        this.f1984a = i13;
        this.f1986c.c(new Pair(Boolean.valueOf(this.f1985b), Integer.valueOf(i13)));
    }
}
