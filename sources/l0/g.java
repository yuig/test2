package l0;

import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import c0.p1;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oi.b4;
import r0.d1;
import r0.g1;
import r0.i1;
import r0.l0;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements p5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81215c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f81216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f81217e;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f81213a = i13;
        this.f81214b = obj;
        this.f81215c = obj2;
        this.f81216d = obj3;
        this.f81217e = obj4;
    }

    @Override // p5.a
    public final void accept(Object obj) {
        switch (this.f81213a) {
            case 0:
                i iVar = (i) this.f81214b;
                p1 p1Var = (p1) this.f81215c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f81216d;
                Surface surface = (Surface) this.f81217e;
                iVar.getClass();
                synchronized (p1Var.f24299a) {
                    p1Var.f24312n = null;
                    p1Var.f24313o = null;
                }
                surfaceTexture.setOnFrameAvailableListener(null);
                surfaceTexture.release();
                surface.release();
                iVar.f81229i--;
                iVar.e();
                return;
            default:
                Function1 onStarted = (Function1) this.f81214b;
                fp0.c this$0 = (fp0.c) this.f81215c;
                Function1 onUpdate = (Function1) this.f81216d;
                File file = (File) this.f81217e;
                i1 i1Var = (i1) obj;
                r0.h hVar = fp0.c.f62759q;
                Intrinsics.checkNotNullParameter(onStarted, "$onStarted");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(onUpdate, "$onUpdate");
                if (i1Var instanceof g1) {
                    onStarted.invoke(Boolean.valueOf(this$0.k()));
                    this$0.f62770k = new b4(onUpdate);
                    return;
                }
                if (i1Var instanceof d1) {
                    b4 b4Var = this$0.f62770k;
                    if (b4Var != null) {
                        ((Handler) ((xk2.k) b4Var.f94693e).getValue()).removeCallbacksAndMessages(null);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        Long l13 = (Long) b4Var.f94692d;
                        r6 = uptimeMillis - (l13 != null ? l13.longValue() : 0L);
                        b4Var.f94692d = null;
                    }
                    this$0.f62770k = null;
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever.setDataSource(((d1) i1Var).f105506b.f105514a.getPath());
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                        Intrinsics.f(extractMetadata);
                        r6 = Long.parseLong(extractMetadata);
                    } catch (Exception unused) {
                    } catch (Throwable th3) {
                        mediaMetadataRetriever.release();
                        throw th3;
                    }
                    mediaMetadataRetriever.release();
                    kl2.m mVar = this$0.f62768i;
                    if (mVar != null) {
                        mVar.c(Boolean.valueOf(((d1) i1Var).f105507c != 0), file, Long.valueOf(r6), Boolean.valueOf(this$0.k()));
                    }
                    d1 d1Var = (d1) i1Var;
                    if (d1Var.f105507c != 0) {
                        l0 l0Var = this$0.f62769j;
                        if (l0Var != null) {
                            l0Var.close();
                        }
                        this$0.f62769j = null;
                        r0.h hVar2 = fp0.c.f62759q;
                        Throwable th4 = d1Var.f105508d;
                        if (th4 == null) {
                            th4 = new IllegalStateException("No exception provided");
                        }
                        lp2.b.k(this$0.f62762c, "Error Recording Video: " + d1Var.f105507c, th4);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
