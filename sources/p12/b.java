package p12;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lp12/b;", "", "", "contactRequestId", "Luj2/b;", "a", "(Ljava/lang/String;)Luj2/b;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface b {
    @sq2.b("contact_requests/{contactRequestId}/decline/")
    @NotNull
    uj2.b a(@s("contactRequestId") @NotNull String contactRequestId);
}
