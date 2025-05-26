package k20;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.c;
import sq2.e;
import sq2.o;
import sq2.s;
import uj2.b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lk20/a;", "", "", "username", "ids", "", "seen", "Luj2/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Z)Luj2/b;", "engagementTabLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @o("/v3/interactions/users/{username}/seen/")
    @NotNull
    @e
    b a(@s("username") @NotNull String username, @c("source_ids") @NotNull String ids, @c("seen") boolean seen);
}
