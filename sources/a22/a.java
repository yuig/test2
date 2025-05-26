package a22;

import com.pinterest.api.model.h20;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final ke0.a f473a;

    public a(ke0.a pearInsightDeserializer) {
        Intrinsics.checkNotNullParameter(pearInsightDeserializer, "pearInsightDeserializer");
        this.f473a = pearInsightDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        return (h20) this.f473a.d(pinterestJsonObject);
    }
}
