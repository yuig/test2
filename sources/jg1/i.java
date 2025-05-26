package jg1;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.util.Size;
import com.pinterest.api.model.fo;
import com.pinterest.api.model.sp;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final List f75999a;

    /* renamed from: b, reason: collision with root package name */
    public final sp f76000b;

    /* renamed from: c, reason: collision with root package name */
    public final String f76001c;

    /* renamed from: d, reason: collision with root package name */
    public final List f76002d;

    /* renamed from: e, reason: collision with root package name */
    public final fo f76003e;

    /* renamed from: f, reason: collision with root package name */
    public final String f76004f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f76005g;

    /* renamed from: h, reason: collision with root package name */
    public final Size f76006h;

    /* renamed from: i, reason: collision with root package name */
    public String f76007i;

    /* renamed from: j, reason: collision with root package name */
    public r f76008j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f76009k;

    /* renamed from: l, reason: collision with root package name */
    public final k f76010l;

    /* renamed from: m, reason: collision with root package name */
    public final EGLContext f76011m;

    /* renamed from: n, reason: collision with root package name */
    public q f76012n;

    public i(float f13, ArrayList srcMediaItems, sp srcAudioItems, String destPath, ArrayList bitmapConfigs, fo audioMix, String creationSessionId, LinkedHashSet featuresUsed) {
        Intrinsics.checkNotNullParameter(srcMediaItems, "srcMediaItems");
        Intrinsics.checkNotNullParameter(srcAudioItems, "srcAudioItems");
        Intrinsics.checkNotNullParameter(destPath, "destPath");
        Intrinsics.checkNotNullParameter(bitmapConfigs, "bitmapConfigs");
        Intrinsics.checkNotNullParameter(audioMix, "audioMix");
        Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
        Intrinsics.checkNotNullParameter(featuresUsed, "featuresUsed");
        this.f75999a = srcMediaItems;
        this.f76000b = srcAudioItems;
        this.f76001c = destPath;
        this.f76002d = bitmapConfigs;
        this.f76003e = audioMix;
        this.f76004f = creationSessionId;
        this.f76005g = featuresUsed;
        this.f76006h = gi2.b.k0(f13);
        this.f76009k = true;
        this.f76010l = k.AUTO;
        EGLContext EGL_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
        Intrinsics.checkNotNullExpressionValue(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
        this.f76011m = EGL_NO_CONTEXT;
    }

    public final void a() {
        q qVar = this.f76012n;
        if (qVar != null) {
            qVar.f76059s = true;
            ((tb0.h) qVar.f76053m.getValue()).h("Canceling Idea Pin Export");
            g gVar = qVar.f76041a;
            if (gVar != null) {
                gVar.cancel();
            }
            g gVar2 = qVar.f76042b;
            if (gVar2 != null) {
                gVar2.cancel();
            }
            CompletableFuture completableFuture = qVar.f76043c;
            if (completableFuture != null) {
            }
        }
    }

    public final void b() {
        q qVar = new q();
        this.f76012n = qVar;
        try {
            qVar.b(this.f75999a, this.f76000b, this.f76001c, this.f76006h, this.f76007i, this.f76002d, this.f76010l, this.f76011m, this.f76003e, this.f76004f, this.f76005g);
            if (qVar.f76059s) {
                r rVar = this.f76008j;
                if (rVar != null) {
                    rVar.onCanceled();
                }
            } else {
                r rVar2 = this.f76008j;
                if (rVar2 != null) {
                    rVar2.b();
                }
            }
        } catch (Exception e13) {
            r rVar3 = this.f76008j;
            if (rVar3 != null) {
                rVar3.a(e13);
            }
        }
        this.f76012n = null;
    }
}
