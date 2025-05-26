package a82;

import android.content.Context;
import c72.b0;
import com.pinterest.shuffles.scene.composer.a1;
import dv0.q;
import kotlin.jvm.internal.Intrinsics;
import n72.m;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1525a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f1526b;

    /* renamed from: c, reason: collision with root package name */
    public final q f1527c;

    /* renamed from: d, reason: collision with root package name */
    public final m f1528d;

    /* renamed from: e, reason: collision with root package name */
    public final com.pinterest.shuffles.scene.composer.q f1529e;

    public b(Context context, b0 shufflesEntityMapper, q shufflesEffectDataBridge, m72.a logger, n72.b fontManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(shufflesEntityMapper, "shufflesEntityMapper");
        Intrinsics.checkNotNullParameter(shufflesEffectDataBridge, "shufflesEffectDataBridge");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(fontManager, "fontManager");
        this.f1525a = context;
        this.f1526b = shufflesEntityMapper;
        this.f1527c = shufflesEffectDataBridge;
        this.f1528d = logger;
        this.f1529e = new com.pinterest.shuffles.scene.composer.q(context, new a1(true, true, false, false), fontManager, logger);
    }
}
