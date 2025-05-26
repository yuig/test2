package a22;

import com.pinterest.api.model.cb0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final ke0.a f475a;

    public c(ke0.a quizOutputDeserializer) {
        Intrinsics.checkNotNullParameter(quizOutputDeserializer, "quizOutputDeserializer");
        this.f475a = quizOutputDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        return (cb0) this.f475a.d(pinterestJsonObject);
    }
}
