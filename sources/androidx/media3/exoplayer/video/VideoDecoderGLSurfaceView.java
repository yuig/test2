package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import n8.t;
import n8.u;

/* loaded from: classes3.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18855a = 0;

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t tVar = new t();
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(tVar);
        setRenderMode(0);
    }
}
