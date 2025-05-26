package j22;

import com.appsflyer.AdRevenueScheme;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.feature.search.typeahead.model.SearchTypeaheadItemFeed;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.p;
import sq2.s;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J?\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ?\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000e\u0010\nJK\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000f2\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J£\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u00112\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010!J)\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u0011H'¢\u0006\u0004\b#\u0010$J5\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010%\u001a\u00020\u00022\b\b\u0001\u0010&\u001a\u00020\u00112\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b'\u0010(J5\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010)\u001a\u00020\u00022\b\b\u0001\u0010*\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b+\u0010,J-\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00072\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b0\u00101J3\u00104\u001a\b\u0012\u0004\u0012\u00020/0\u00072\b\b\u0001\u00102\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u000f2\b\b\u0001\u00103\u001a\u00020\u0011H'¢\u0006\u0004\b4\u00105J/\u00109\u001a\u0002082\b\b\u0001\u00106\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b9\u0010:J1\u0010;\u001a\u0002082\b\b\u0001\u00106\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b;\u0010:J%\u0010=\u001a\u0002082\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b=\u0010>ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006?À\u0006\u0001"}, d2 = {"Lj22/b;", "", "", "query", "referringSource", "fields", "pageSize", "Luj2/b0;", "Lcom/pinterest/api/model/BoardFeed;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "tags", "numPeople", "Lcom/pinterest/feature/search/typeahead/model/SearchTypeaheadItemFeed;", "l", "", "pin", "", "shouldFetchPartnerUsersOnly", "d", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Luj2/b0;", "shouldShowPinCount", "numItems", "numBoards", "numAutoCompletes", "numRecentQueries", "recentQueriesTag", "personalSearchOnly", "addFields", "contextualType", "g", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Luj2/b0;", "showPinCount", "b", "(Ljava/lang/String;Z)Luj2/b0;", "numTrendingQueries", "returnStoryFormat", "f", "(Ljava/lang/String;ZLjava/lang/String;)Luj2/b0;", "numRecommendedQueries", "locale", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", AdRevenueScheme.COUNTRY, "version", "Lvd0/c;", "i", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "imageSignature", "fetchPreviews", "j", "(Ljava/lang/String;IZ)Luj2/b0;", "pinId", "clientTrackingParams", "Luj2/b;", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "k", "vertical", "h", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface b {
    @sq2.f("search/recommended_queries/")
    @NotNull
    b0<SearchTypeaheadItemFeed> a(@t("num_recommended_queries") @NotNull String numRecommendedQueries, @t("locale") @NotNull String locale, @t("fields") String fields);

    @sq2.f("search/autocomplete/")
    @NotNull
    b0<SearchTypeaheadItemFeed> b(@t("q") @NotNull String query, @t("show_pin_count") boolean showPinCount);

    @sq2.f("search/me/boards/")
    @NotNull
    b0<BoardFeed> c(@t("query") @NotNull String query, @t("rs") String referringSource, @t("fields") @NotNull String fields, @t("page_size") @NotNull String pageSize);

    @sq2.f("search/typeahead_user_mentions/")
    @NotNull
    b0<SearchTypeaheadItemFeed> d(@t("q") @NotNull String query, @t("num_people") int numPeople, @t("fields") @NotNull String fields, @t("pin") String pin, @t("partner_user_only") Boolean shouldFetchPartnerUsersOnly);

    @sq2.f("search/autocomplete/")
    @NotNull
    b0<SearchTypeaheadItemFeed> e(@t("q") @NotNull String query, @t("num_boards") @NotNull String numBoards, @t("num_autocompletes") @NotNull String numAutoCompletes, @t("personal_search_only") boolean personalSearchOnly, @t("fields") @NotNull String fields);

    @sq2.f("search/trending_queries/")
    @NotNull
    b0<SearchTypeaheadItemFeed> f(@t("num_trending_queries") @NotNull String numTrendingQueries, @t("return_story_format") boolean returnStoryFormat, @t("fields") String fields);

    @sq2.f("search/autocomplete/")
    @NotNull
    b0<SearchTypeaheadItemFeed> g(@t("q") @NotNull String query, @t("show_pin_count") Boolean shouldShowPinCount, @t("num_items") String numItems, @t("num_boards") String numBoards, @t("num_people") String numPeople, @t("num_autocompletes") String numAutoCompletes, @t("num_recent_queries") String numRecentQueries, @t("recent_queries_tags") String recentQueriesTag, @t("personal_search_only") Boolean personalSearchOnly, @t("add_fields") String addFields, @t("fields") String fields, @t("contextual_type") String contextualType);

    @sq2.b("search/recent/")
    @NotNull
    uj2.b h(@t("vertical") String vertical, @t("query") @NotNull String query);

    @sq2.f("search/typeahead/cache/")
    @NotNull
    b0<vd0.c> i(@t("country") String country, @t("version") String version);

    @sq2.f("search/hybrid/recommendations/")
    @NotNull
    b0<vd0.c> j(@t("image_signature") @NotNull String imageSignature, @t("page_size") int pageSize, @t("fetch_previews") boolean fetchPreviews);

    @p("search/{pinId}/unhide/")
    @NotNull
    uj2.b k(@s("pinId") @NotNull String pinId, @t("query") String query, @t("client_tracking_params") String clientTrackingParams);

    @sq2.f("search/typeahead/")
    @NotNull
    b0<SearchTypeaheadItemFeed> l(@t("q") @NotNull String query, @t("tags") @NotNull String tags, @t("add_fields") @NotNull String fields, @t("num_people") String numPeople);

    @p("search/{pinId}/hide/")
    @NotNull
    uj2.b m(@s("pinId") @NotNull String pinId, @t("query") @NotNull String query, @t("client_tracking_params") String clientTrackingParams);
}
