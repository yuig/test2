package k22;

import com.pinterest.api.model.UserFeed;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final ke0.b f78216a;

    public h(ke0.b userDeserializer) {
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        this.f78216a = userDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.a k13 = pinterestJsonObject.k("data");
        Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
        return k13.d() > 0 ? new UserFeed(pinterestJsonObject, (String) null, this.f78216a) : new UserFeed(pinterestJsonObject, new ArrayList(), "");
    }
}
