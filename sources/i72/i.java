package i72;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final k72.e f71700a;

    /* renamed from: b, reason: collision with root package name */
    public final n72.a f71701b;

    public i(Context context, k72.e shuffleAssetService, n72.a dispatcherProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(shuffleAssetService, "shuffleAssetService");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.f71700a = shuffleAssetService;
        this.f71701b = dispatcherProvider;
    }
}
