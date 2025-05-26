package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements z {

    /* renamed from: a, reason: collision with root package name */
    public final String f104353a;

    public x(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f104353a = templateId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f104353a, ((x) obj).f104353a);
    }

    public final int hashCode() {
        return this.f104353a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PreviewTemplateLoaded(templateId="), this.f104353a, ")");
    }
}
