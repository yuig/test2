package qd1;

import is1.s;
import is1.t;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import x02.i2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final w f103573a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f103574b;

    /* renamed from: c, reason: collision with root package name */
    public final s f103575c;

    public a(w eventManager, i2 pinRepository, t pinSwipePreferences) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter("user_pins", "closeupTrafficSource");
        Intrinsics.checkNotNullParameter(pinSwipePreferences, "pinSwipePreferences");
        this.f103573a = eventManager;
        this.f103574b = pinRepository;
        this.f103575c = pinSwipePreferences;
    }
}
