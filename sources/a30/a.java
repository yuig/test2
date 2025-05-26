package a30;

import com.pinterest.api.model.my0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007JK\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"La30/a;", "", "", "url", "Luj2/b0;", "Lcom/pinterest/api/model/my0;", "a", "(Ljava/lang/String;)Luj2/b0;", "pinUid", "thirdPartyAd", "checkOnly", "clickThroughSource", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface a {
    @f("offsite/check/")
    @NotNull
    b0<my0> a(@t("url") @NotNull String url);

    @f("offsite/")
    @NotNull
    b0<my0> b(@t("url") @NotNull String url, @t("pin_id") String pinUid, @t("third_party_ad") String thirdPartyAd, @t("check_only") @NotNull String checkOnly, @t("clickthrough_source") @NotNull String clickThroughSource);
}
