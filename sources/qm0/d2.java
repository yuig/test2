package qm0;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d2 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f104258a;

    /* renamed from: b, reason: collision with root package name */
    public final String f104259b;

    /* renamed from: c, reason: collision with root package name */
    public final List f104260c;

    /* renamed from: d, reason: collision with root package name */
    public final String f104261d;

    /* renamed from: e, reason: collision with root package name */
    public final String f104262e;

    public d2(String uid, String title, String actionLabel, ArrayList previews) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(previews, "previews");
        Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
        this.f104258a = uid;
        this.f104259b = title;
        this.f104260c = previews;
        this.f104261d = actionLabel;
        this.f104262e = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return Intrinsics.d(this.f104258a, d2Var.f104258a) && Intrinsics.d(this.f104259b, d2Var.f104259b) && Intrinsics.d(this.f104260c, d2Var.f104260c) && Intrinsics.d(this.f104261d, d2Var.f104261d);
    }

    @Override // qm0.k2
    public final String getId() {
        return this.f104262e;
    }

    public final int hashCode() {
        return this.f104261d.hashCode() + ep.b.c(this.f104260c, cb.d(this.f104259b, this.f104258a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FullCarousel(uid=");
        sb3.append(this.f104258a);
        sb3.append(", title=");
        sb3.append(this.f104259b);
        sb3.append(", previews=");
        sb3.append(this.f104260c);
        sb3.append(", actionLabel=");
        return a.a.p(sb3, this.f104261d, ")");
    }
}
