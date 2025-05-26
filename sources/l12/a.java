package l12;

import com.pinterest.deserializers.ModelDeserializerWithSave;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes4.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ModelDeserializerWithSave f81470a;

    public a(ModelDeserializerWithSave exploreArticleDeserializer) {
        Intrinsics.checkNotNullParameter(exploreArticleDeserializer, "exploreArticleDeserializer");
        this.f81470a = exploreArticleDeserializer;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        return this.f81470a.e(pinterestJsonObject, true);
    }
}
