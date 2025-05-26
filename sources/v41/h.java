package v41;

import ao2.j0;
import f31.w;
import kotlin.jvm.internal.Intrinsics;
import u50.r;
import w41.b1;
import w41.c1;
import w41.u;

/* loaded from: classes5.dex */
public final class h implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final m f124124a;

    public h(m preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f124124a = preferences;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        b22.l[] lVarArr;
        c1 request = (c1) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof b1) {
            m mVar = this.f124124a;
            mVar.getClass();
            int g13 = mVar.f124136a.g("PREF_PROFILE_PIN_VIEW_TYPE", k51.b.f78314a.ordinal());
            b22.l.Companion.getClass();
            lVarArr = b22.l.staticValues;
            eventIntake.a(new u(new w(lVarArr[g13])));
        }
    }
}
