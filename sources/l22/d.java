package l22;

import com.pinterest.api.model.az0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final ke0.a f81479a;

    public d(ke0.a userDidItDeserializer) {
        Intrinsics.checkNotNullParameter(userDidItDeserializer, "userDidItDeserializer");
        this.f81479a = userDidItDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        return (az0) this.f81479a.d(pinterestJsonObject);
    }
}
