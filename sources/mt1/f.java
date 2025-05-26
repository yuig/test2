package mt1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final et1.c f88147a;

    /* renamed from: b, reason: collision with root package name */
    public final a f88148b;

    /* renamed from: c, reason: collision with root package name */
    public final d f88149c;

    public f(et1.c component, b pipelineHead, b pipelineTail) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(pipelineHead, "pipelineHead");
        Intrinsics.checkNotNullParameter(pipelineTail, "pipelineTail");
        this.f88147a = component;
        this.f88148b = pipelineHead;
        this.f88149c = pipelineTail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f88147a, fVar.f88147a) && Intrinsics.d(this.f88148b, fVar.f88148b) && Intrinsics.d(this.f88149c, fVar.f88149c);
    }

    public final int hashCode() {
        return this.f88149c.hashCode() + ((this.f88148b.hashCode() + (this.f88147a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LinearPipeline(component=" + this.f88147a + ", pipelineHead=" + this.f88148b + ", pipelineTail=" + this.f88149c + ")";
    }
}
