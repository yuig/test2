package lg1;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.util.Size;
import com.pinterest.api.model.d30;
import jg1.k;
import jg1.r;
import kotlin.jvm.internal.Intrinsics;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final tb0.h f83220a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83221b;

    /* renamed from: c, reason: collision with root package name */
    public final d30 f83222c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f83223d;

    /* renamed from: e, reason: collision with root package name */
    public final long f83224e;

    /* renamed from: f, reason: collision with root package name */
    public final r f83225f;

    /* renamed from: g, reason: collision with root package name */
    public final k f83226g;

    /* renamed from: h, reason: collision with root package name */
    public final EGLContext f83227h;

    /* renamed from: i, reason: collision with root package name */
    public c f83228i;

    /* renamed from: j, reason: collision with root package name */
    public final v f83229j;

    public b(tb0.h crashReporting, String outputPath, d30 photoItem, Size outputResolution, long j13, g gVar) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(outputPath, "outputPath");
        Intrinsics.checkNotNullParameter(photoItem, "photoItem");
        Intrinsics.checkNotNullParameter(outputResolution, "outputResolution");
        this.f83220a = crashReporting;
        this.f83221b = outputPath;
        this.f83222c = photoItem;
        this.f83223d = outputResolution;
        this.f83224e = j13;
        this.f83225f = gVar;
        this.f83226g = k.AVC;
        EGLContext EGL_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
        Intrinsics.checkNotNullExpressionValue(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
        this.f83227h = EGL_NO_CONTEXT;
        this.f83229j = m.b(a.f83219i);
    }

    public final void a() {
        c cVar = this.f83228i;
        if (cVar != null) {
            cVar.f83233d = true;
        }
    }

    public final void b() {
        if (this.f83228i != null) {
            return;
        }
        new dp.b(this, 2).b();
    }
}
