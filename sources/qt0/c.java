package qt0;

import a7.h;
import a7.p0;
import a7.v0;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.LegacyPlayerView;
import com.pinterest.api.model.bo0;
import kotlin.jvm.internal.Intrinsics;
import lq0.f1;
import rt0.d;
import tt0.l0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f105136a;

    /* renamed from: b, reason: collision with root package name */
    public final rt0.b f105137b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f105138c;

    /* renamed from: d, reason: collision with root package name */
    public ExoPlayer f105139d;

    /* renamed from: e, reason: collision with root package name */
    public final a f105140e;

    /* renamed from: f, reason: collision with root package name */
    public final b f105141f;

    public c(l0 fragment, rt0.b model) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f105136a = fragment;
        this.f105137b = model;
        this.f105138c = new Handler(Looper.getMainLooper());
        model.a(new d(null, null, null, new f1(this, 26), null, null, 55));
        this.f105140e = new a(this);
        this.f105141f = new b(this);
    }

    public static final void a(c cVar) {
        ExoPlayer exoPlayer = cVar.f105139d;
        if (exoPlayer == null) {
            return;
        }
        m7.l0 l0Var = (m7.l0) exoPlayer;
        int N = l0Var.N();
        rt0.b bVar = cVar.f105137b;
        l0Var.c(new p0(((bo0) bVar.f109957i.get(N)).getSpeedMultiplier()));
        float f13 = ((bo0) bVar.f109957i.get(N)).getIsFromFrontFacingCamera() ? -1.0f : 1.0f;
        LegacyPlayerView legacyPlayerView = cVar.f105136a.B0;
        if (legacyPlayerView != null) {
            legacyPlayerView.setScaleX(f13);
        } else {
            Intrinsics.r("cameraPlaybackView");
            throw null;
        }
    }

    public final b b() {
        return this.f105141f;
    }

    public final boolean c() {
        ExoPlayer exoPlayer = this.f105139d;
        if (exoPlayer == null) {
            return false;
        }
        m7.l0 l0Var = (m7.l0) exoPlayer;
        int N = l0Var.N();
        rt0.b bVar = this.f105137b;
        return N == bVar.r() && Math.abs(l0Var.X() - bVar.q()) <= 250;
    }

    public final void d() {
        ExoPlayer exoPlayer = this.f105139d;
        if (exoPlayer == null) {
            return;
        }
        ((m7.l0) exoPlayer).B0(false);
    }

    public final void e() {
        ExoPlayer exoPlayer = this.f105139d;
        if (exoPlayer != null) {
            d();
            ((m7.l0) exoPlayer).a();
            this.f105139d = null;
        }
    }

    public final void f() {
        ExoPlayer exoPlayer = this.f105139d;
        if (exoPlayer == null) {
            return;
        }
        ((m7.l0) exoPlayer).B0(true);
    }

    public final void g() {
        rt0.b bVar = this.f105137b;
        if (bVar.j()) {
            int r13 = bVar.r();
            long q13 = bVar.q();
            v0 v0Var = this.f105139d;
            if (v0Var != null) {
                ((h) v0Var).y(r13, q13);
            }
        }
    }
}
