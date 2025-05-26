package l7;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import pk.c1;
import pk.h1;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f81778a = 0;

    static {
        d7.b0 a13 = h1.a();
        a13.e("TransformerInternal", c1.v("Start"));
        a13.e("AssetLoader", c1.w("InputFormat", "OutputFormat"));
        Object[] objArr = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        bs1.c.v(6, objArr);
        a13.e("AudioDecoder", c1.l(6, objArr));
        a13.e("AudioGraph", c1.w("RegisterNewInputStream", "OutputEnded"));
        a13.e("AudioMixer", c1.x("RegisterNewInputStream", "OutputFormat", "ProducedOutput"));
        Object[] objArr2 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        bs1.c.v(6, objArr2);
        a13.e("AudioEncoder", c1.l(6, objArr2));
        Object[] objArr3 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        bs1.c.v(6, objArr3);
        a13.e("VideoDecoder", c1.l(6, objArr3));
        Object[] objArr4 = {"RegisterNewInputStream", "SurfaceTextureInput", "QueueFrame", "QueueBitmap", "QueueTexture", "RenderedToOutputSurface", "OutputTextureRendered", "ReceiveEndOfAllInput", "SignalEnded"};
        bs1.c.v(9, objArr4);
        a13.e("VideoFrameProcessor", c1.l(9, objArr4));
        a13.e("ExternalTextureManager", c1.w("SignalEOS", "SurfaceTextureTransformFix"));
        a13.e("BitmapTextureManager", c1.v("SignalEOS"));
        a13.e("TexIdTextureManager", c1.v("SignalEOS"));
        a13.e("Compositor", c1.v("OutputTextureRendered"));
        Object[] objArr5 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        bs1.c.v(6, objArr5);
        a13.e("VideoEncoder", c1.l(6, objArr5));
        a13.e("Muxer", c1.y("InputFormat", "CanWriteSample", "AcceptedInput", "InputEnded", "OutputEnded"));
        a13.a();
        new LinkedHashMap();
        SystemClock.elapsedRealtime();
    }

    public static synchronized void a() {
        synchronized (g.class) {
            synchronized (g.class) {
            }
        }
    }
}
