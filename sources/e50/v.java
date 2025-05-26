package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements q {

    /* renamed from: b, reason: collision with root package name */
    public final String f57431b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f57432c;

    /* renamed from: d, reason: collision with root package name */
    public final t f57433d;

    /* renamed from: e, reason: collision with root package name */
    public final u f57434e;

    public v(String __typename, Object obj, t tVar, u uVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f57431b = __typename;
        this.f57432c = obj;
        this.f57433d = tVar;
        this.f57434e = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f57431b, vVar.f57431b) && Intrinsics.d(this.f57432c, vVar.f57432c) && Intrinsics.d(this.f57433d, vVar.f57433d) && Intrinsics.d(this.f57434e, vVar.f57434e);
    }

    public final int hashCode() {
        int hashCode = this.f57431b.hashCode() * 31;
        Object obj = this.f57432c;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        t tVar = this.f57433d;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        u uVar = this.f57434e;
        return hashCode3 + (uVar != null ? uVar.hashCode() : 0);
    }

    public final String toString() {
        return "StoryNode(__typename=" + this.f57431b + ", containerType=" + this.f57432c + ", displayOptions=" + this.f57433d + ", title=" + this.f57434e + ")";
    }
}
