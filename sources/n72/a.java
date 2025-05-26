package n72;

import ao2.e2;
import ao2.f0;
import ao2.v0;
import ho2.q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f89705a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f89706b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f89707c;

    public a() {
        ko2.f fVar = v0.f20219a;
        e2 main = q.f69782a;
        ko2.f fVar2 = v0.f20219a;
        ko2.e io3 = ko2.e.f80326c;
        Intrinsics.checkNotNullParameter(main, "main");
        Intrinsics.checkNotNullParameter(fVar2, "default");
        Intrinsics.checkNotNullParameter(io3, "io");
        this.f89705a = main;
        this.f89706b = fVar2;
        this.f89707c = io3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f89705a, aVar.f89705a) && Intrinsics.d(this.f89706b, aVar.f89706b) && Intrinsics.d(this.f89707c, aVar.f89707c);
    }

    public final int hashCode() {
        return this.f89707c.hashCode() + ((this.f89706b.hashCode() + (this.f89705a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CoroutineDispatcherProvider(main=" + this.f89705a + ", default=" + this.f89706b + ", io=" + this.f89707c + ")";
    }
}
