package f20;

import com.appsflyer.AdRevenueScheme;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.c;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.t;
import uj2.b;
import uj2.b0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001Jk\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJs\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001b\u001a\u00020\u00182\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lf20/a;", "", "", "key", "email", "businessName", "", "isCreate", "locale", "accountType", "advertisingIntent", "website", "Luj2/b0;", "Ltt1/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "userId", "firstName", "lastName", "phone", "sourceDetail", "sourceType", AdRevenueScheme.COUNTRY, "company", "Luj2/b;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @f("business/lead/score/above_threshold/")
    @NotNull
    b0<tt1.a<Boolean>> a(@t("key") @NotNull String key, @t("email") @NotNull String email, @t("business_name") @NotNull String businessName, @t("is_create") boolean isCreate, @t("locale") @NotNull String locale, @t("account_type") @NotNull String accountType, @t("advertising_intent") @NotNull String advertisingIntent, @t("website") @NotNull String website);

    @o("partners/")
    @NotNull
    @e
    b b(@t("business_name") @NotNull String businessName, @c("website_url") @NotNull String website, @t("account_type") @NotNull String accountType, @t("advertising_intent") @NotNull String advertisingIntent);

    @o("business/lead/propel/")
    @NotNull
    @e
    b c(@c("user_id") @NotNull String userId, @c("email") @NotNull String email, @c("first_name") @NotNull String firstName, @c("last_name") @NotNull String lastName, @c("website") @NotNull String website, @c("phone") @NotNull String phone, @c("source_detail") @NotNull String sourceDetail, @c("source_type") @NotNull String sourceType, @c("country") @NotNull String country, @c("company") @NotNull String company);
}
