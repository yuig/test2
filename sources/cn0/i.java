package cn0;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Size;
import ao2.i1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28068a;

    /* renamed from: b, reason: collision with root package name */
    public ke2.c f28069b;

    /* renamed from: c, reason: collision with root package name */
    public com.pinterest.shuffles.scene.composer.t f28070c;

    /* renamed from: d, reason: collision with root package name */
    public com.pinterest.shuffles.scene.composer.t f28071d;

    /* renamed from: e, reason: collision with root package name */
    public MediaFormat f28072e;

    /* renamed from: f, reason: collision with root package name */
    public String f28073f;

    /* renamed from: g, reason: collision with root package name */
    public Size f28074g;

    /* renamed from: h, reason: collision with root package name */
    public int f28075h;

    /* renamed from: i, reason: collision with root package name */
    public MediaCodec f28076i;

    /* renamed from: j, reason: collision with root package name */
    public final i1 f28077j;

    /* renamed from: k, reason: collision with root package name */
    public final i1 f28078k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f28079l;

    public i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28068a = context;
        this.f28075h = 24;
        this.f28077j = kotlin.jvm.internal.r.c0("Encoder-worker");
        this.f28078k = kotlin.jvm.internal.r.c0("Encoder-input");
        this.f28079l = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(bl2.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof cn0.g
            if (r0 == 0) goto L13
            r0 = r5
            cn0.g r0 = (cn0.g) r0
            int r1 = r0.f28066u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28066u = r1
            goto L18
        L13:
            cn0.g r0 = new cn0.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f28064s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f28066u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cn0.i r0 = r0.f28063r
            ue.c.H(r5)
            goto L56
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            ue.c.H(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f28079l
            boolean r2 = r5.get()
            if (r2 == 0) goto L3f
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        L3f:
            r5.set(r3)
            cn0.h r5 = new cn0.h
            r2 = 0
            r5.<init>(r4, r2)
            r0.f28063r = r4
            r0.f28066u = r3
            ao2.i1 r2 = r4.f28077j
            java.lang.Object r5 = kotlin.jvm.internal.j.M(r0, r2, r5)
            if (r5 != r1) goto L55
            return r1
        L55:
            r0 = r4
        L56:
            ao2.i1 r5 = r0.f28077j
            r5.close()
            kotlin.Unit r5 = kotlin.Unit.f80348a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cn0.i.a(bl2.c):java.lang.Object");
    }
}
