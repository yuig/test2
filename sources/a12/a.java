package a12;

import com.pinterest.api.model.z2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final ke0.a f370a;

    public a(ke0.a aggregatedCommentDeserializer) {
        Intrinsics.checkNotNullParameter(aggregatedCommentDeserializer, "aggregatedCommentDeserializer");
        this.f370a = aggregatedCommentDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        z2 z2Var;
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        ke0.a aVar = this.f370a;
        return (m13 == null || (z2Var = (z2) aVar.d(m13)) == null) ? (z2) aVar.d(pinterestJsonObject) : z2Var;
    }
}
