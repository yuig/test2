package gp1;

import kotlin.jvm.internal.Intrinsics;
import lb0.r;

/* loaded from: classes5.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final r f65930a;

    public d(r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f65930a = prefsManagerUser;
    }

    public final void a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        r rVar = this.f65930a;
        rVar.b("PREF_COOKIE_SESSION", value);
        rVar.c("PREF_COOKIE_SESSION_EXPIRED", System.currentTimeMillis() + 3600000);
    }
}
