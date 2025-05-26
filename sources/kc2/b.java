package kc2;

import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import lb0.r;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final q f79189a;

    /* renamed from: b, reason: collision with root package name */
    public final r f79190b;

    public b(q prefsManagerPersisted, r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f79189a = prefsManagerPersisted;
        this.f79190b = prefsManagerUser;
    }
}
