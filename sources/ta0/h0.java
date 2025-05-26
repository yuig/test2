package ta0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final tb0.h f116882a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f116883b;

    public h0(tb0.h crashReporting, f0 collageDuplicateHelper) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(collageDuplicateHelper, "collageDuplicateHelper");
        this.f116882a = crashReporting;
        this.f116883b = collageDuplicateHelper;
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        j0 request = (j0) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        kotlin.jvm.internal.j.z(scope, null, null, new g0(request, eventIntake, this, null), 3);
    }
}
