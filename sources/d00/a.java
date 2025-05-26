package d00;

import com.pinterest.feature.newshub.model.NewsHubItemFeed;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ke0.b f53587a;

    public a(ke0.b newsHubItemFeedDeserializer) {
        Intrinsics.checkNotNullParameter(newsHubItemFeedDeserializer, "newsHubItemFeedDeserializer");
        this.f53587a = newsHubItemFeedDeserializer;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        return new NewsHubItemFeed(pinterestJsonObject, "", false, this.f53587a);
    }
}
