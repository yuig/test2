package com.pinterest.feature.home.model;

import com.pinterest.api.model.DynamicFeed;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.u;
import sq2.y;
import uj2.b0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JA\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\b\u0010\tJ5\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\u0003H'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/pinterest/feature/home/model/k;", "", "", "", "requestHeaders", "requestParams", "Luj2/b0;", "Lcom/pinterest/api/model/DynamicFeed;", "a", "(Ljava/util/Map;Ljava/util/Map;)Luj2/b0;", "url", "b", "(Ljava/util/Map;Ljava/lang/String;)Luj2/b0;", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface k {
    @sq2.f("feeds/home/")
    @NotNull
    b0<DynamicFeed> a(@sq2.j @NotNull Map<String, String> requestHeaders, @NotNull @u Map<String, String> requestParams);

    @sq2.f
    @NotNull
    b0<DynamicFeed> b(@sq2.j @NotNull Map<String, String> requestHeaders, @NotNull @y String url);
}
