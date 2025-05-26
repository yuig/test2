package ng2;

import kotlin.jvm.internal.Intrinsics;
import tg2.s;
import tg2.t;

/* loaded from: classes4.dex */
public final class d extends uf2.b {

    /* renamed from: d, reason: collision with root package name */
    public final vf2.c f90528d;

    /* renamed from: e, reason: collision with root package name */
    public final xh2.d f90529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t webViewVitalsBehavior, ei2.a writer, lh2.b logger, xh2.d serializer) {
        super(writer, logger, new wf2.c(new c(0, webViewVitalsBehavior, s.class, "getMaxWebViewVitals", "getMaxWebViewVitals()I", 0)));
        Intrinsics.checkNotNullParameter(webViewVitalsBehavior, "webViewVitalsBehavior");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f90528d = writer;
        this.f90529e = serializer;
    }
}
