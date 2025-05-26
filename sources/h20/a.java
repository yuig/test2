package h20;

import kotlin.Metadata;
import nm.u;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.p;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJE\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lh20/a;", "", "", "user", "Luj2/b0;", "Ltt1/a;", "Lnm/u;", "b", "(Ljava/lang/String;)Luj2/b0;", "featureMap", "passcode", "", "skipPasscodeConfirmed", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Luj2/b0;", "permissions_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @p("aggregated_comments/features/")
    @NotNull
    b0<tt1.a<u>> a(@t("user") @NotNull String user, @t("feature_map") @NotNull String featureMap, @t("passcode") String passcode, @t("user_confirm_skip_passcode") boolean skipPasscodeConfirmed);

    @f("aggregated_comments/features/")
    @NotNull
    b0<tt1.a<u>> b(@t("user") @NotNull String user);
}
