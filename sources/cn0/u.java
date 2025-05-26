package cn0;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Size;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final i f28108a;

    /* renamed from: b, reason: collision with root package name */
    public n9.d f28109b;

    /* renamed from: c, reason: collision with root package name */
    public long f28110c;

    public u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28108a = new i(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(cn0.u r4, co2.z r5, bl2.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof cn0.p
            if (r0 == 0) goto L16
            r0 = r6
            cn0.p r0 = (cn0.p) r0
            int r1 = r0.f28093u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f28093u = r1
            goto L1b
        L16:
            cn0.p r0 = new cn0.p
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.f28091s
            cl2.a r6 = cl2.a.COROUTINE_SUSPENDED
            int r1 = r0.f28093u
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            co2.z r5 = r0.f28090r
            ue.c.H(r4)
            goto L49
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            ue.c.H(r4)
            cn0.l r4 = cn0.l.f28082a
            r0.f28090r = r5
            r0.f28093u = r2
            r1 = r5
            co2.y r1 = (co2.y) r1
            co2.q r1 = r1.f28359d
            java.lang.Object r4 = r1.o(r4, r0)
            if (r4 != r6) goto L49
            goto L51
        L49:
            r4 = 0
            co2.y r5 = (co2.y) r5
            r5.r(r4)
            kotlin.Unit r6 = kotlin.Unit.f80348a
        L51:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cn0.u.a(cn0.u, co2.z, bl2.c):java.lang.Object");
    }

    public final void b(ke2.c scene, com.pinterest.shuffles.scene.composer.t keyframeAnimator, com.pinterest.shuffles.scene.composer.t tVar, int i13, int i14, Size outputSize, int i15, String outputFilePath) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(keyframeAnimator, "keyframeAnimator");
        Intrinsics.checkNotNullParameter(outputSize, "outputSize");
        Intrinsics.checkNotNullParameter(outputFilePath, "outputFilePath");
        Objects.toString(outputSize);
        this.f28110c = (long) ((TimeUnit.SECONDS.toMicros(1L) * i13) / i14);
        i iVar = this.f28108a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(keyframeAnimator, "keyframeAnimator");
        Intrinsics.checkNotNullParameter(outputSize, "outputSize");
        Intrinsics.checkNotNullParameter(outputFilePath, "outputFilePath");
        Objects.toString(outputSize);
        iVar.f28069b = scene;
        iVar.f28070c = keyframeAnimator;
        iVar.f28071d = tVar;
        iVar.f28073f = outputFilePath;
        iVar.f28074g = outputSize;
        iVar.f28075h = i14;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", outputSize.getWidth(), outputSize.getHeight());
        Intrinsics.checkNotNullExpressionValue(createVideoFormat, "createVideoFormat(...)");
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("frame-rate", i14);
        createVideoFormat.setInteger("i-frame-interval", 5);
        createVideoFormat.setInteger("bitrate", i15);
        iVar.f28072e = createVideoFormat;
        Objects.toString(createVideoFormat);
        zn2.h.f142318a.getClass();
        zn2.f.f142316a.getClass();
        zn2.i iVar2 = new zn2.i(MediaCodec.createEncoderByType("video/avc"), zn2.g.a(zn2.f.a()), null);
        zn2.b.o(iVar2.f142320b);
        Object obj = iVar2.f142319a;
        Intrinsics.checkNotNullExpressionValue(obj, "<get-value>(...)");
        iVar.f28076i = (MediaCodec) obj;
        n9.d dVar = new n9.d();
        dVar.f89951a = i13 - 1;
        dVar.f89954d = new ReentrantLock();
        dVar.f89953c = dVar.f89951a;
        this.f28109b = dVar;
    }
}
