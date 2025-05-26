package a22;

import com.pinterest.api.model.ia0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final ke0.a f474a;

    public b(ke0.a quizDeserializer) {
        Intrinsics.checkNotNullParameter(quizDeserializer, "quizDeserializer");
        this.f474a = quizDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        return (ia0) this.f474a.d(pinterestJsonObject);
    }
}
