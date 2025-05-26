package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z2 implements x2 {

    /* renamed from: a, reason: collision with root package name */
    public final yq0.f f93767a;

    /* renamed from: b, reason: collision with root package name */
    public final vq0.h f93768b;

    /* renamed from: c, reason: collision with root package name */
    public final y2 f93769c;

    public z2(yq0.f viewCreator, vq0.h presenterCreator, y2 legacyMvpBinder) {
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(presenterCreator, "presenterCreator");
        Intrinsics.checkNotNullParameter(legacyMvpBinder, "legacyMvpBinder");
        this.f93767a = viewCreator;
        this.f93768b = presenterCreator;
        this.f93769c = legacyMvpBinder;
    }

    @Override // o82.x2
    public final yq0.f a() {
        return this.f93767a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return Intrinsics.d(this.f93767a, z2Var.f93767a) && Intrinsics.d(this.f93768b, z2Var.f93768b) && Intrinsics.d(this.f93769c, z2Var.f93769c);
    }

    public final int hashCode() {
        return this.f93769c.hashCode() + ((this.f93768b.hashCode() + (this.f93767a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MVPAdapterMethods(viewCreator=" + this.f93767a + ", presenterCreator=" + this.f93768b + ", legacyMvpBinder=" + this.f93769c + ")";
    }
}
