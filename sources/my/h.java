package my;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: e, reason: collision with root package name */
    public final String f88485e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f88486f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s92.i pwtAction) {
        super(pwtAction, 1);
        Boolean annotationValue = Boolean.TRUE;
        Intrinsics.checkNotNullParameter(pwtAction, "pwtAction");
        Intrinsics.checkNotNullParameter("load_from_cache", "annotationName");
        Intrinsics.checkNotNullParameter(annotationValue, "annotationValue");
        this.f88485e = "load_from_cache";
        this.f88486f = annotationValue;
    }

    public final String l() {
        return this.f88485e;
    }

    public final Object m() {
        return this.f88486f;
    }
}
