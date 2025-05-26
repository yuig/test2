package l22;

import com.pinterest.api.model.UserDidItDataFeed;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final ke0.b f81478a;

    public c(ke0.b userDidItDeserializer) {
        Intrinsics.checkNotNullParameter(userDidItDeserializer, "userDidItDeserializer");
        this.f81478a = userDidItDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        return new UserDidItDataFeed(pinterestJsonObject, "", this.f81478a);
    }
}
