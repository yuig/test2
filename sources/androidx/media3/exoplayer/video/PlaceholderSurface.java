package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import bf.b;
import d7.k;
import d7.n;
import d7.n0;
import n8.j;

/* loaded from: classes3.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f18850d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f18851e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18852a;

    /* renamed from: b, reason: collision with root package name */
    public final j f18853b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18854c;

    public PlaceholderSurface(j jVar, SurfaceTexture surfaceTexture, boolean z13) {
        super(surfaceTexture);
        this.f18853b = jVar;
        this.f18852a = z13;
    }

    public static synchronized boolean a(Context context) {
        boolean z13;
        int i13;
        synchronized (PlaceholderSurface.class) {
            try {
                if (!f18851e) {
                    int i14 = n0.f53866a;
                    if (i14 >= 24 && ((i14 >= 26 || (!"samsung".equals(Build.MANUFACTURER) && !"XT1650".equals(Build.MODEL))) && ((i14 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && n.q("EGL_EXT_protected_content")))) {
                        i13 = n.q("EGL_KHR_surfaceless_context") ? 1 : 2;
                        f18850d = i13;
                        f18851e = true;
                    }
                    i13 = 0;
                    f18850d = i13;
                    f18851e = true;
                }
                z13 = f18850d != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z13;
    }

    public static PlaceholderSurface b(Context context, boolean z13) {
        boolean z14 = false;
        b.t(!z13 || a(context));
        j jVar = new j("ExoPlayer:PlaceholderSurface");
        int i13 = z13 ? f18850d : 0;
        jVar.start();
        Handler handler = new Handler(jVar.getLooper(), jVar);
        jVar.f89840b = handler;
        jVar.f89839a = new k(handler);
        synchronized (jVar) {
            jVar.f89840b.obtainMessage(1, i13, 0).sendToTarget();
            while (jVar.f89843e == null && jVar.f89842d == null && jVar.f89841c == null) {
                try {
                    jVar.wait();
                } catch (InterruptedException unused) {
                    z14 = true;
                }
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = jVar.f89842d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = jVar.f89841c;
        if (error != null) {
            throw error;
        }
        PlaceholderSurface placeholderSurface = jVar.f89843e;
        placeholderSurface.getClass();
        return placeholderSurface;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f18853b) {
            try {
                if (!this.f18854c) {
                    j jVar = this.f18853b;
                    jVar.f89840b.getClass();
                    jVar.f89840b.sendEmptyMessage(2);
                    this.f18854c = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
