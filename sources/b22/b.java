package b22;

import com.pinterest.api.model.PinFeed;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final c f21288a;

    public b(c pinDeserializer) {
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        this.f21288a = pinDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        return new PinFeed(pinterestJsonObject, "", this.f21288a);
    }
}
