package hd0;

import dl1.s;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final List f68845a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f68846b;

    public a(@NotNull List<g> newsCardStates, @NotNull Function1<? super md0.a, Unit> logAction) {
        Intrinsics.checkNotNullParameter(newsCardStates, "newsCardStates");
        Intrinsics.checkNotNullParameter(logAction, "logAction");
        this.f68845a = newsCardStates;
        this.f68846b = logAction;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getPath() {
        return "CREATOR_HUB_NEWS_MODULE";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f68845a, aVar.f68845a) && Intrinsics.d(this.f68846b, aVar.f68846b);
    }

    public final int hashCode() {
        return this.f68846b.hashCode() + (this.f68845a.hashCode() * 31);
    }

    public final String toString() {
        return "CreatorHubNewsModuleState(newsCardStates=" + this.f68845a + ", logAction=" + this.f68846b + ")";
    }
}
