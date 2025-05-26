package d20;

import com.pinterest.api.model.o4;
import com.pinterest.api.model.xb;
import com.pinterest.api.model.xr;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.e;
import sq2.f;
import sq2.o;
import sq2.s;
import sq2.t;
import uj2.b0;
import vd0.c;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jã\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0004\b\u0019\u0010\u001aJå\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00172\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u00152\b\b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\"\u0010#J\u0099\u0001\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010'\u001a\u00020\u000b2\b\b\u0001\u0010(\u001a\u00020\u000b2\b\b\u0001\u0010)\u001a\u00020\u000bH'¢\u0006\u0004\b*\u0010+J_\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00172\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010(\u001a\u00020\u000b2\b\b\u0001\u0010)\u001a\u00020\u000bH'¢\u0006\u0004\b-\u0010.J)\u00100\u001a\b\u0012\u0004\u0012\u00020,0\u00172\b\b\u0001\u0010/\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u0002H'¢\u0006\u0004\b0\u00101J)\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00172\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00102\u001a\u00020\u0002H'¢\u0006\u0004\b4\u00101J\u0019\u00108\u001a\u0002072\b\b\u0001\u00106\u001a\u000205H'¢\u0006\u0004\b8\u00109ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, d2 = {"Ld20/a;", "", "", "userId", "startDate", "endDate", "metricTypes", "pinFormat", "includeCurated", "startTimestamp", "endTimestamp", "", "useDailyBuckets", "useHourlyBuckets", "includeRealtime", "includeOffline", "splitField", "paid", "appTypes", "inProfile", "ownedContentList", "", "fromOwnedContent", "Luj2/b0;", "Lcom/pinterest/api/model/o4;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Luj2/b0;", "numOfPins", "sortBy", "fields", "createdInLastNDays", "owned_content_list", "from_owned_content", "Lcom/pinterest/api/model/xb;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "pinId", "splitType", "videoMetricTypes", "includeHourly", "includeDaily", "includeRealtimeData", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Luj2/b0;", "Lvd0/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Luj2/b0;", "pinUid", "b", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "audienceType", "Lcom/pinterest/api/model/xr;", "g", "Ld20/b;", "feedbackRequestParameters", "Luj2/b;", "d", "(Ld20/b;)Luj2/b;", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @f("analytics/pins/{pin_id}/mobile/metrics/")
    @NotNull
    b0<c> a(@s("pin_id") @NotNull String pinId, @t("start_date") @NotNull String startDate, @t("end_date") @NotNull String endDate, @t("metric_types") String metricTypes, @t("split_field") String splitType, @t("include_daily") boolean includeDaily, @t("include_realtime_data") boolean includeRealtimeData);

    @f("visual_search/stela/pins/{pin_id}/module/")
    @NotNull
    b0<c> b(@s("pin_id") @NotNull String pinUid, @t("fields") @NotNull String fields);

    @f("analytics/pins/{pin_id}/mobile/metrics/")
    @NotNull
    b0<o4> c(@s("pin_id") @NotNull String pinId, @t("start_date") @NotNull String startDate, @t("end_date") @NotNull String endDate, @t("metric_types") String metricTypes, @t("split_field") String splitType, @t("video_metric_types") String videoMetricTypes, @t("app_types") String appTypes, @t("in_profile") String inProfile, @t("paid") String paid, @t("include_hourly") boolean includeHourly, @t("include_daily") boolean includeDaily, @t("include_realtime_data") boolean includeRealtimeData);

    @o("analytics/feedback/")
    @NotNull
    @e
    uj2.b d(@sq2.c("feedback_data") @NotNull b feedbackRequestParameters);

    @f("analytics/users/{user_id}/mobile/metrics/")
    @NotNull
    b0<o4> e(@s("user_id") @NotNull String userId, @t("start_date") @NotNull String startDate, @t("end_date") @NotNull String endDate, @t("metric_types") @NotNull String metricTypes, @t("pin_format") String pinFormat, @t("include_curated") @NotNull String includeCurated, @t("start_timestamp") String startTimestamp, @t("end_timestamp") String endTimestamp, @t("use_daily_buckets") Boolean useDailyBuckets, @t("use_hourly_buckets") Boolean useHourlyBuckets, @t("include_realtime_data") Boolean includeRealtime, @t("include_offline_data") Boolean includeOffline, @t("split_field") String splitField, @t("paid") String paid, @t("app_types") String appTypes, @t("in_profile") String inProfile, @t("owned_content_list") String ownedContentList, @t("from_owned_content") Integer fromOwnedContent);

    @f("analytics/users/{user_id}/mobile/pins/")
    @NotNull
    b0<xb> f(@s("user_id") @NotNull String userId, @t("start_date") @NotNull String startDate, @t("end_date") @NotNull String endDate, @t("num_of_pins") int numOfPins, @t("sort_by_metrics") @NotNull String sortBy, @t("metric_types") @NotNull String metricTypes, @t("pin_format") @NotNull String pinFormat, @t("include_offline_data") boolean includeOffline, @t("include_curated") @NotNull String includeCurated, @t("start_timestamp") String startTimestamp, @t("end_timestamp") String endTimestamp, @t("include_realtime_data") Boolean includeRealtime, @t("in_profile") String inProfile, @t("fields") @NotNull String fields, @t("created_in_last_n_days") Integer createdInLastNDays, @t("owned_content_list") String owned_content_list, @t("from_owned_content") Integer from_owned_content, @t("paid") String paid, @t("app_types") String appTypes);

    @f("insights/users/{user_id}/mobile/audiences/{audience_type}/")
    @NotNull
    b0<xr> g(@s("user_id") @NotNull String userId, @s("audience_type") @NotNull String audienceType);
}
