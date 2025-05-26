package i62;

import android.content.ClipboardManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements j62.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f71630a;

    /* renamed from: b, reason: collision with root package name */
    public final n72.a f71631b;

    /* renamed from: c, reason: collision with root package name */
    public final ClipboardManager f71632c;

    public b(Context context, n72.a dispatcherProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.f71630a = context;
        this.f71631b = dispatcherProvider;
        Object obj = d5.a.f53679a;
        Object systemService = context.getSystemService((Class<Object>) ClipboardManager.class);
        Intrinsics.f(systemService);
        this.f71632c = (ClipboardManager) systemService;
    }
}
