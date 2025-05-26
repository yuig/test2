package dg2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends uf2.b {

    /* renamed from: d, reason: collision with root package name */
    public final tg2.h f54969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(tg2.i breadcrumbBehavior, ei2.a writer, lh2.b logger) {
        super(writer, logger, new wf2.c(new b(breadcrumbBehavior, 3)));
        Intrinsics.checkNotNullParameter(breadcrumbBehavior, "breadcrumbBehavior");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f54969d = breadcrumbBehavior;
    }
}
