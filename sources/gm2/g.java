package gm2;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends f implements pm2.c {

    /* renamed from: b, reason: collision with root package name */
    public final Annotation f65772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ym2.g gVar, Annotation annotation) {
        super(gVar);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f65772b = annotation;
    }

    public final e a() {
        return new e(this.f65772b);
    }
}
