package lg1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import et1.q;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import jg1.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import ot1.i;
import ot1.j;
import ot1.k;

/* loaded from: classes5.dex */
public final class f implements jg1.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f83234a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83235b;

    /* renamed from: c, reason: collision with root package name */
    public final v f83236c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaFormat f83237d;

    /* renamed from: e, reason: collision with root package name */
    public final long f83238e;

    /* renamed from: f, reason: collision with root package name */
    public final q f83239f;

    /* renamed from: g, reason: collision with root package name */
    public final t.a f83240g;

    /* renamed from: h, reason: collision with root package name */
    public final tb0.h f83241h;

    /* renamed from: i, reason: collision with root package name */
    public final Size f83242i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f83243j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f83244k;

    /* renamed from: l, reason: collision with root package name */
    public MediaCodec f83245l;

    /* renamed from: m, reason: collision with root package name */
    public jg1.f f83246m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f83247n;

    /* renamed from: o, reason: collision with root package name */
    public final MediaCodec.BufferInfo f83248o;

    /* renamed from: p, reason: collision with root package name */
    public final int f83249p;

    /* renamed from: q, reason: collision with root package name */
    public final kg1.b f83250q;

    /* renamed from: r, reason: collision with root package name */
    public MediaFormat f83251r;

    /* renamed from: s, reason: collision with root package name */
    public nt1.a f83252s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f83253t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f83254u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedList f83255v;

    /* renamed from: w, reason: collision with root package name */
    public final float[] f83256w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f83257x;

    /* renamed from: y, reason: collision with root package name */
    public ot1.v f83258y;

    public f(String imagePath, v muxRender, MediaFormat outputFormat, Size size, String encoderName, long j13, EGLContext shareContext, q zeroDeltaVideoEncoderFactory, t.a codecInitDataParserFactory, tb0.h crashReporting) {
        k kVar;
        MediaCodec mediaCodec;
        Size dimensions = size;
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        Intrinsics.checkNotNullParameter(muxRender, "muxRender");
        Intrinsics.checkNotNullParameter(outputFormat, "outputFormat");
        Intrinsics.checkNotNullParameter(dimensions, "requestedOutputResolution");
        Intrinsics.checkNotNullParameter(encoderName, "encoderName");
        Intrinsics.checkNotNullParameter(shareContext, "shareContext");
        Intrinsics.checkNotNullParameter(zeroDeltaVideoEncoderFactory, "zeroDeltaVideoEncoderFactory");
        Intrinsics.checkNotNullParameter(codecInitDataParserFactory, "codecInitDataParserFactory");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f83234a = imagePath;
        this.f83235b = 30;
        this.f83236c = muxRender;
        this.f83237d = outputFormat;
        this.f83238e = j13;
        this.f83239f = zeroDeltaVideoEncoderFactory;
        this.f83240g = codecInitDataParserFactory;
        this.f83241h = crashReporting;
        i level = i.LEVEL_3_2;
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(level, "level");
        switch (j.f97583a[level.ordinal()]) {
            case 1:
                kVar = new k(99);
                break;
            case 2:
                kVar = new k(99);
                break;
            case 3:
                kVar = new k(396);
                break;
            case 4:
                kVar = new k(396);
                break;
            case 5:
                kVar = new k(396);
                break;
            case 6:
                kVar = new k(396);
                break;
            case 7:
                kVar = new k(792);
                break;
            case 8:
                kVar = new k(1620);
                break;
            case 9:
                kVar = new k(1620);
                break;
            case 10:
                kVar = new k(3600);
                break;
            case 11:
                kVar = new k(5120);
                break;
            case 12:
                kVar = new k(8192);
                break;
            case 13:
                kVar = new k(8192);
                break;
            case 14:
                kVar = new k(8704);
                break;
            case 15:
                kVar = new k(22080);
                break;
            case 16:
                kVar = new k(36864);
                break;
            case 17:
                kVar = new k(36864);
                break;
            case 18:
                kVar = new k(139264);
                break;
            case 19:
                kVar = new k(139264);
                break;
            case 20:
                kVar = new k(139264);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Size size2 = new Size((size.getWidth() + 15) / 16, (size.getHeight() + 15) / 16);
        int height = size2.getHeight() * size2.getWidth();
        int i13 = kVar.f97585a;
        if (height > i13) {
            float width = size.getWidth() / size.getHeight();
            int sqrt = (int) Math.sqrt(i13 * width);
            int i14 = i13 / sqrt;
            if (width <= sqrt / i14) {
                int i15 = i14 * 16;
                dimensions = new Size(((int) ((i15 * width) + 1)) & (-2), i15);
            } else {
                int i16 = sqrt * 16;
                dimensions = new Size(i16, ((int) ((i16 / width) + 1)) & (-2));
            }
        }
        this.f83242i = dimensions;
        this.f83248o = new MediaCodec.BufferInfo();
        this.f83255v = new LinkedList();
        this.f83256w = new float[16];
        this.f83257x = new float[16];
        String[] strArr = {"c2.android.avc.encoder", "OMX.google.h264.encoder"};
        int i17 = 0;
        while (true) {
            if (i17 < 2) {
                String str = strArr[i17];
                try {
                    mediaCodec = mg1.b.d(str);
                    if (mediaCodec == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } catch (Throwable th3) {
                    this.f83241h.h(a.a.m("Could not allocate AVC software encoder [", str, "]. Error [", th3.getMessage(), "]"));
                    i17++;
                }
            } else {
                mediaCodec = null;
            }
        }
        if (mediaCodec == null) {
            try {
                mediaCodec = mg1.b.d(encoderName);
            } catch (IOException e13) {
                throw new IllegalStateException(e13);
            }
        }
        this.f83245l = mediaCodec;
        Intrinsics.f(mediaCodec);
        MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
        Intrinsics.checkNotNullExpressionValue(codecInfo, "getCodecInfo(...)");
        String c13 = nt1.d.c(this.f83237d);
        Intrinsics.f(c13);
        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfo.getCapabilitiesForType(c13);
        int length = capabilitiesForType.colorFormats.length;
        for (int i18 = 0; i18 < length; i18++) {
            int i19 = capabilitiesForType.colorFormats[i18];
            if (i19 == 2130708361) {
                this.f83237d.setInteger("profile", 1);
                this.f83237d.setInteger("level", 1024);
                this.f83237d.setInteger("width", this.f83242i.getWidth());
                this.f83237d.setInteger("height", this.f83242i.getHeight());
                this.f83237d.setInteger("color-format", i19);
                MediaCodec mediaCodec2 = this.f83245l;
                Intrinsics.f(mediaCodec2);
                mediaCodec2.configure(this.f83237d, (Surface) null, (MediaCrypto) null, 1);
                MediaCodec mediaCodec3 = this.f83245l;
                Intrinsics.f(mediaCodec3);
                Surface createInputSurface = mediaCodec3.createInputSurface();
                Intrinsics.checkNotNullExpressionValue(createInputSurface, "createInputSurface(...)");
                jg1.f fVar = new jg1.f(createInputSurface, shareContext);
                this.f83246m = fVar;
                EGLDisplay eGLDisplay = fVar.f75994b;
                EGLSurface eGLSurface = fVar.f75996d;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, fVar.f75995c)) {
                    throw new RuntimeException("eglMakeCurrent failed");
                }
                MediaCodec mediaCodec4 = this.f83245l;
                Intrinsics.f(mediaCodec4);
                mediaCodec4.start();
                this.f83247n = true;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                String str2 = this.f83234a;
                BitmapFactory.decodeFile(str2, options);
                int i23 = options.outWidth;
                int i24 = options.outHeight;
                Size size3 = this.f83242i;
                int width2 = size3.getWidth();
                int height2 = size3.getHeight();
                int c14 = (i24 > height2 || i23 > width2) ? i23 > i24 ? ml2.c.c(i24 / height2) : ml2.c.c(i23 / width2) : 1;
                options.inSampleSize = c14 <= 0 ? 1 : c14;
                options.inScaled = false;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options.inJustDecodeBounds = false;
                options.inDither = false;
                File file = new File(str2);
                Matrix matrix = new Matrix();
                try {
                    switch (new ExifInterface(file.getPath()).getAttributeInt("Orientation", 0)) {
                        case 2:
                            matrix.setScale(-1.0f, 1.0f);
                            break;
                        case 3:
                            matrix.setRotate(180.0f);
                            break;
                        case 4:
                            matrix.setRotate(180.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 5:
                            matrix.setRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 6:
                            matrix.setRotate(90.0f);
                            break;
                        case 7:
                            matrix.setRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 8:
                            matrix.setRotate(-90.0f);
                            break;
                    }
                } catch (IOException unused) {
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str2, options);
                matrix.mapPoints(new float[2], new float[]{decodeFile.getWidth(), decodeFile.getHeight()});
                float width3 = size3.getWidth() / Math.abs(ml2.c.c(r2[0]));
                matrix.postScale(width3, width3);
                Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                if (createBitmap == null) {
                    throw new IllegalArgumentException(a.a.j("Could not generate bitmap from imagePath ", this.f83234a));
                }
                kg1.b bVar = new kg1.b(3553, e0.b(new dw0.a(0, createBitmap)), 0.0f, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                this.f83250q = bVar;
                bVar.f();
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                this.f83249p = iArr[0];
                GLES20.glViewport(0, 0, this.f83242i.getWidth(), this.f83242i.getHeight());
                android.opengl.Matrix.setIdentityM(this.f83257x, 0);
                android.opengl.Matrix.setIdentityM(this.f83256w, 0);
                android.opengl.Matrix.scaleM(this.f83256w, 0, 1.0f, -1.0f, 1.0f);
                return;
            }
        }
        throw new RuntimeException(a.a.k("Codec [", codecInfo.getName(), "] does not support surfaces"));
    }

    @Override // jg1.g
    public final void a() {
        MediaCodec mediaCodec;
        this.f83243j = true;
        this.f83250q.e();
        jg1.f fVar = this.f83246m;
        if (fVar != null) {
            fVar.a();
        }
        this.f83246m = null;
        if (this.f83247n && (mediaCodec = this.f83245l) != null) {
            mediaCodec.stop();
        }
        MediaCodec mediaCodec2 = this.f83245l;
        if (mediaCodec2 != null) {
            mediaCodec2.release();
        }
        this.f83245l = null;
    }

    @Override // jg1.g
    public final boolean b() {
        return this.f83243j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0199  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Collection, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    @Override // jg1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            Method dump skipped, instructions count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lg1.f.c():boolean");
    }

    @Override // jg1.g
    public final void cancel() {
    }

    @Override // jg1.g
    public final void f() {
    }
}
