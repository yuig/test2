package n71;

import br.d;
import dl1.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final List f89704a;

    public b(@NotNull List<? extends d> recentSearches) {
        Intrinsics.checkNotNullParameter(recentSearches, "recentSearches");
        this.f89704a = recentSearches;
    }

    @Override // dl1.s
    public final String b() {
        return String.valueOf(this.f89704a.hashCode());
    }
}
