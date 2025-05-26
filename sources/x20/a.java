package x20;

import com.pinterest.api.model.VTOPinFeed;
import com.pinterest.api.model.p7;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.f;
import sq2.t;
import uj2.b0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0093\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00042\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H'¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lx20/a;", "", "", "queryPin", "", "category", "", "centerResults", "feedSoure", "sourceQuery", "enableProductFilters", "productFilterRequestType", "colorBucketFilters", "priceBucketFilters", "brandNameFilters", "fields", "Luj2/b0;", "Lcom/pinterest/api/model/VTOPinFeed;", "b", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Luj2/b0;", "Lcom/pinterest/api/model/p7;", "a", "()Luj2/b0;", "tryOnLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @f("visual_search/virtual_try_on/beauty_model_images/")
    @NotNull
    b0<p7> a();

    @f("visual_search/virtual_try_on/makeup_products/")
    @NotNull
    b0<VTOPinFeed> b(@t("query_pin") String queryPin, @t("product_category") Integer category, @t("center_results") Boolean centerResults, @t("feed_source") int feedSoure, @t("source_query") String sourceQuery, @t("enable_product_filters") Boolean enableProductFilters, @t("product_filter_request_type") int productFilterRequestType, @t("color_swatch_filters") String colorBucketFilters, @t("price_bucket_filters") String priceBucketFilters, @t("brand_name_filters") String brandNameFilters, @t("fields") @NotNull String fields);
}
