package qx;

import com.pinterest.api.model.deserializer.DynamicStoryDeserializer;
import com.pinterest.hairball.network.g;
import java.util.ArrayList;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends g {

    /* renamed from: a, reason: collision with root package name */
    public final d20.a f105317a;

    /* renamed from: b, reason: collision with root package name */
    public final DynamicStoryDeserializer f105318b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f105319c;

    public e(d20.a analyticsService, DynamicStoryDeserializer dynamicStoryDeserializer) {
        Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
        Intrinsics.checkNotNullParameter(dynamicStoryDeserializer, "dynamicStoryDeserializer");
        this.f105317a = analyticsService;
        this.f105318b = dynamicStoryDeserializer;
        this.f105319c = f0.l("domain.official_user()", "pin.description", "pin.id", "pin.image_medium_url", "pin.link_domain()", "pin.domain", "pin.rich_summary()", "pin.type", "pin.grid_title", "userwebsite.official_user()", "pin.via_pinner", "pin.promoter()");
    }

    @Override // com.pinterest.hairball.network.g
    public final com.pinterest.hairball.network.f a(Object[] params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Object obj = params[0];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
        return new ar.a(this, (String) obj);
    }
}
