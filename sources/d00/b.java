package d00;

import com.pinterest.api.model.deserializer.NewsHubItemDeserializer;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final NewsHubItemDeserializer f53588a;

    public b(NewsHubItemDeserializer newsHubItemDeserializer) {
        Intrinsics.checkNotNullParameter(newsHubItemDeserializer, "newsHubItemDeserializer");
        this.f53588a = newsHubItemDeserializer;
    }

    @Override // rz.d
    public final Object b(c json) {
        Intrinsics.checkNotNullParameter(json, "pinterestJsonObject");
        c m13 = json.m("data");
        if (m13 != null) {
            json = m13;
        }
        NewsHubItemDeserializer newsHubItemDeserializer = this.f53588a;
        newsHubItemDeserializer.getClass();
        Intrinsics.checkNotNullParameter(json, "json");
        return newsHubItemDeserializer.e(json, false);
    }
}
