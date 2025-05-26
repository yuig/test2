package is1;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final lb0.q f73571a;

    /* renamed from: b, reason: collision with root package name */
    public final lh0.z f73572b;

    /* renamed from: c, reason: collision with root package name */
    public final f f73573c;

    public a0(lb0.q prefsManagerUser, lh0.z experiments, f closeupSessionTracker) {
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(closeupSessionTracker, "closeupSessionTracker");
        this.f73571a = prefsManagerUser;
        this.f73572b = experiments;
        this.f73573c = closeupSessionTracker;
    }

    public final int a() {
        long time = new Date().getTime();
        lb0.q qVar = this.f73571a;
        if (time - qVar.a("PREF_CLOSEUP_EXPANDING_SHARE_ANIMATION_LAST_SEEN_AT_MS", 0L) < pb0.i.DAYS.getMilliseconds()) {
            return qVar.g("PREF_CLOSEUP_EXPANDING_SHARE_ANIMATION_SEEN_LAST_24H_COUNT", 0);
        }
        return 0;
    }
}
