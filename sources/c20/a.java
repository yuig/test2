package c20;

import com.pinterest.api.model.h0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.o;
import sq2.t;
import uj2.b0;
import vd0.c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J[\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lc20/a;", "", "", "advertiserId", "leadFormId", "pinPromotionId", "campaignId", "adGroupId", "Lcom/pinterest/api/model/h0;", "payload", "Luj2/b0;", "Lvd0/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/pinterest/api/model/h0;)Luj2/b0;", "adsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @o("/v3/lead_form/submit/")
    @NotNull
    b0<c> a(@t("advertiser_id") String advertiserId, @t("lead_form_id") String leadFormId, @t("pin_promotion_id") String pinPromotionId, @t("campaign_id") String campaignId, @t("ad_group_id") String adGroupId, @NotNull @sq2.a h0 payload);
}
