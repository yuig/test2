package u12;

import com.pinterest.api.model.InterestsFeed;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final ke0.b f120009a;

    public f(ke0.b interestListDeserializer) {
        Intrinsics.checkNotNullParameter(interestListDeserializer, "interestListDeserializer");
        this.f120009a = interestListDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        return new InterestsFeed(pinterestJsonObject, "", this.f120009a);
    }
}
