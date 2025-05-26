package ng2;

import java.util.HashMap;
import kh2.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements e, yh2.b {

    /* renamed from: a, reason: collision with root package name */
    public final sg2.a f90523a;

    /* renamed from: b, reason: collision with root package name */
    public final xh2.d f90524b;

    /* renamed from: c, reason: collision with root package name */
    public final lh2.b f90525c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f90526d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f90527e;

    public b(sg2.a configService, xh2.d serializer, lh2.b logger, y webViewDataSourceProvider) {
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(webViewDataSourceProvider, "webViewDataSourceProvider");
        this.f90523a = configService;
        this.f90524b = serializer;
        this.f90525c = logger;
        this.f90526d = webViewDataSourceProvider;
        this.f90527e = new HashMap();
    }

    @Override // yh2.b
    public final void c() {
        this.f90527e.clear();
    }
}
