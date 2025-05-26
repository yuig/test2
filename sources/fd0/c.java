package fd0;

import a.cb;
import dl1.s;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final int f61839a;

    /* renamed from: b, reason: collision with root package name */
    public final oa2.a f61840b;

    /* renamed from: c, reason: collision with root package name */
    public final List f61841c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f61842d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f61843e;

    public c(int i13, @NotNull oa2.a avatarState, @NotNull List<h> stats, @NotNull Function0<Unit> seeMoreAction, @NotNull Function1<? super md0.a, Unit> logAction) {
        Intrinsics.checkNotNullParameter(avatarState, "avatarState");
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(seeMoreAction, "seeMoreAction");
        Intrinsics.checkNotNullParameter(logAction, "logAction");
        this.f61839a = i13;
        this.f61840b = avatarState;
        this.f61841c = stats;
        this.f61842d = seeMoreAction;
        this.f61843e = logAction;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return cb.g("toString(...)");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f61839a == cVar.f61839a && Intrinsics.d(this.f61840b, cVar.f61840b) && Intrinsics.d(this.f61841c, cVar.f61841c) && Intrinsics.d(this.f61842d, cVar.f61842d) && Intrinsics.d(this.f61843e, cVar.f61843e);
    }

    public final int hashCode() {
        return this.f61843e.hashCode() + d7.g.b(this.f61842d, ep.b.c(this.f61841c, (this.f61840b.hashCode() + (Integer.hashCode(this.f61839a) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "CreatorHubStatsModuleState(title=" + this.f61839a + ", avatarState=" + this.f61840b + ", stats=" + this.f61841c + ", seeMoreAction=" + this.f61842d + ", logAction=" + this.f61843e + ")";
    }
}
