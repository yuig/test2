package g31;

import ao2.j0;
import b22.k;
import b22.l;
import c31.c0;
import c31.i;
import c31.y;
import f31.w;
import kotlin.jvm.internal.Intrinsics;
import l82.h;
import lb0.r;

/* loaded from: classes5.dex */
public final class e implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final r f63445a;

    public e(r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f63445a = prefsManagerUser;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, u50.r eventIntake) {
        l lVar;
        l[] lVarArr;
        y request = (y) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof c0) {
            if (((c0) request).f25573a) {
                k kVar = l.Companion;
                int g13 = this.f63445a.g("PREF_PROFILE_PIN_VIEW_TYPE", l.COMPACT.ordinal());
                kVar.getClass();
                lVarArr = l.staticValues;
                lVar = lVarArr[g13];
            } else {
                lVar = l.COMPACT;
            }
            eventIntake.a(new i(new w(lVar)));
        }
    }
}
