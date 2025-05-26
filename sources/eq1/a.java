package eq1;

import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.util.Size;
import et1.q;
import jg1.v;
import kotlin.jvm.internal.Intrinsics;
import lg1.f;
import tb0.h;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f59925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.a f59926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f59927c;

    public a(q qVar, t.a aVar, h hVar) {
        this.f59925a = qVar;
        this.f59926b = aVar;
        this.f59927c = hVar;
    }

    public final f a(String imagePath, v muxRender, MediaFormat outputFormat, Size outputResolution, String encoderName, long j13, EGLContext shareContext) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        Intrinsics.checkNotNullParameter(muxRender, "muxRender");
        Intrinsics.checkNotNullParameter(outputFormat, "outputFormat");
        Intrinsics.checkNotNullParameter(outputResolution, "outputResolution");
        Intrinsics.checkNotNullParameter(encoderName, "encoderName");
        Intrinsics.checkNotNullParameter(shareContext, "shareContext");
        return new f(imagePath, muxRender, outputFormat, outputResolution, encoderName, j13, shareContext, this.f59925a, this.f59926b, this.f59927c);
    }
}
