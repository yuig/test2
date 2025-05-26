package jc2;

import a7.t0;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import m7.l0;

/* loaded from: classes2.dex */
public final class b implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f75474a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f75475b;

    /* renamed from: c, reason: collision with root package name */
    public a f75476c;

    public b(ExoPlayer player, c callback) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f75474a = callback;
        player.getClass();
        this.f75475b = new WeakReference(player);
        this.f75476c = a.INITIAL_STATE;
        ((l0) player).f86277n.a(this);
    }

    @Override // a7.t0
    public final void C4(ExoPlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f75476c = a.DONE;
        c cVar = this.f75474a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(this, "item");
        cVar.d(this);
    }

    public final WeakReference a() {
        return this.f75475b;
    }

    public final void b() {
        a aVar = this.f75476c;
        a aVar2 = a.DONE;
        if (aVar == aVar2) {
            return;
        }
        ExoPlayer exoPlayer = (ExoPlayer) this.f75475b.get();
        if (exoPlayer == null) {
            Objects.toString(this.f75476c);
            this.f75476c = aVar2;
            return;
        }
        if (this.f75476c == a.PREPARING && ((l0) exoPlayer).L() == 3) {
            Objects.toString(this.f75476c);
            this.f75476c = aVar2;
            return;
        }
        l0 l0Var = (l0) exoPlayer;
        l0Var.L0();
        if (l0Var.f86276m0.f86335f != null) {
            Objects.toString(this.f75476c);
            this.f75476c = aVar2;
        }
    }

    @Override // a7.t0
    public final void r0(int i13) {
        b();
        if (this.f75476c == a.DONE) {
            c cVar = this.f75474a;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(this, "item");
            cVar.d(this);
        }
    }
}
