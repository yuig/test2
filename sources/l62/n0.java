package l62;

import android.content.Context;
import ao2.k2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final h62.k f81667a;

    /* renamed from: b, reason: collision with root package name */
    public final t72.h f81668b;

    /* renamed from: c, reason: collision with root package name */
    public final t72.j f81669c;

    /* renamed from: d, reason: collision with root package name */
    public final n72.m f81670d;

    /* renamed from: e, reason: collision with root package name */
    public final n72.a f81671e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f81672f;

    /* renamed from: g, reason: collision with root package name */
    public final n72.b f81673g;

    /* renamed from: h, reason: collision with root package name */
    public k2 f81674h;

    /* renamed from: i, reason: collision with root package name */
    public ao2.j0 f81675i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f81676j;

    /* renamed from: k, reason: collision with root package name */
    public com.pinterest.shuffles.scene.composer.q f81677k;

    /* renamed from: l, reason: collision with root package name */
    public Function1 f81678l;

    /* renamed from: m, reason: collision with root package name */
    public Function1 f81679m;

    /* renamed from: n, reason: collision with root package name */
    public Function1 f81680n;

    public n0(h62.k project, t72.h createOrUpdateShuffleUseCase, t72.j shuffleItemImageUploadUseCase, h72.m shuffleThumbnailInteractor, m72.a coreLogger, n72.a dispatcherProvider, Context context, n72.b fontProvider) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(createOrUpdateShuffleUseCase, "createOrUpdateShuffleUseCase");
        Intrinsics.checkNotNullParameter(shuffleItemImageUploadUseCase, "shuffleItemImageUploadUseCase");
        Intrinsics.checkNotNullParameter(shuffleThumbnailInteractor, "shuffleThumbnailInteractor");
        Intrinsics.checkNotNullParameter(coreLogger, "coreLogger");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fontProvider, "fontProvider");
        this.f81667a = project;
        this.f81668b = createOrUpdateShuffleUseCase;
        this.f81669c = shuffleItemImageUploadUseCase;
        this.f81670d = coreLogger;
        this.f81671e = dispatcherProvider;
        this.f81672f = context;
        this.f81673g = fontProvider;
        this.f81676j = true;
    }
}
