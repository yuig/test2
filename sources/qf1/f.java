package qf1;

import a.cb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends ve.h {

    /* renamed from: b, reason: collision with root package name */
    public final String f103663b;

    /* renamed from: c, reason: collision with root package name */
    public final String f103664c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f103665d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f103666e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f103667f;

    /* renamed from: g, reason: collision with root package name */
    public final long f103668g;

    public f(String title, String description, rf1.y onViewed, rf1.y onCompleted, rf1.y onDismissed) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(onViewed, "onViewed");
        Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        this.f103663b = title;
        this.f103664c = description;
        this.f103665d = onViewed;
        this.f103666e = onCompleted;
        this.f103667f = onDismissed;
        this.f103668g = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f103663b, fVar.f103663b) && Intrinsics.d(this.f103664c, fVar.f103664c) && Intrinsics.d(this.f103665d, fVar.f103665d) && Intrinsics.d(this.f103666e, fVar.f103666e) && Intrinsics.d(this.f103667f, fVar.f103667f) && this.f103668g == fVar.f103668g;
    }

    public final int hashCode() {
        return Long.hashCode(this.f103668g) + d7.g.b(this.f103667f, d7.g.b(this.f103666e, d7.g.b(this.f103665d, cb.d(this.f103664c, this.f103663b.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SwipeEducation(title=");
        sb3.append(this.f103663b);
        sb3.append(", description=");
        sb3.append(this.f103664c);
        sb3.append(", onViewed=");
        sb3.append(this.f103665d);
        sb3.append(", onCompleted=");
        sb3.append(this.f103666e);
        sb3.append(", onDismissed=");
        sb3.append(this.f103667f);
        sb3.append(", autoDismissMs=");
        return a.a.o(sb3, this.f103668g, ")");
    }
}
