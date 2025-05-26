package in0;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.util.Size;
import ao2.i1;
import kotlin.jvm.internal.r;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public fn0.e f72809a;

    /* renamed from: b, reason: collision with root package name */
    public MediaCodec f72810b;

    /* renamed from: c, reason: collision with root package name */
    public bn0.c f72811c;

    /* renamed from: d, reason: collision with root package name */
    public h f72812d;

    /* renamed from: e, reason: collision with root package name */
    public SurfaceTexture f72813e;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f72814f = r.c0("Watermark-decoder-worker");

    /* renamed from: g, reason: collision with root package name */
    public Size f72815g = new Size(0, 0);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(fn0.e r8, bl2.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof in0.a
            if (r0 == 0) goto L13
            r0 = r9
            in0.a r0 = (in0.a) r0
            int r1 = r0.f72799u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72799u = r1
            goto L18
        L13:
            in0.a r0 = new in0.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f72797s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f72799u
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            in0.f r8 = r0.f72796r
            ue.c.H(r9)
            goto Lab
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            ue.c.H(r9)
            r7.f72809a = r8
            android.media.MediaFormat r8 = r8.a()
            java.lang.String r9 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.String r2 = "mime"
            boolean r4 = r8.containsKey(r2)
            r5 = 0
            if (r4 == 0) goto L4e
            java.lang.String r2 = r8.getString(r2)
            goto L4f
        L4e:
            r2 = r5
        L4f:
            if (r2 == 0) goto Lb2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.String r9 = "durationUs"
            boolean r4 = r8.containsKey(r9)
            if (r4 == 0) goto L5f
            r8.getLong(r9)
        L5f:
            java.lang.String r9 = "width"
            int r9 = r8.getInteger(r9)
            java.lang.String r4 = "height"
            int r4 = r8.getInteger(r4)
            android.util.Size r6 = new android.util.Size
            r6.<init>(r9, r4)
            r7.f72815g = r6
            java.util.Objects.toString(r6)
            android.media.MediaCodec r9 = android.media.MediaCodec.createDecoderByType(r2)
            java.lang.String r2 = "createDecoderByType(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r7.f72810b = r9
            android.graphics.SurfaceTexture r9 = new android.graphics.SurfaceTexture
            r2 = 10001(0x2711, float:1.4014E-41)
            r9.<init>(r2)
            android.util.Size r2 = r7.f72815g
            int r2 = r2.getWidth()
            android.util.Size r4 = r7.f72815g
            int r4 = r4.getHeight()
            r9.setDefaultBufferSize(r2, r4)
            r7.f72813e = r9
            in0.b r2 = new in0.b
            r2.<init>(r8, r9, r5)
            r0.f72796r = r7
            r0.f72799u = r3
            ao2.i1 r8 = r7.f72814f
            java.lang.Object r9 = kotlin.jvm.internal.j.M(r0, r8, r2)
            if (r9 != r1) goto Laa
            return r1
        Laa:
            r8 = r7
        Lab:
            in0.h r9 = (in0.h) r9
            r8.f72812d = r9
            kotlin.Unit r8 = kotlin.Unit.f80348a
            return r8
        Lb2:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Required value was null."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: in0.f.a(fn0.e, bl2.c):java.lang.Object");
    }
}
