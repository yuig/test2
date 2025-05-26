package qm0;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e2 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f104265a;

    /* renamed from: b, reason: collision with root package name */
    public final String f104266b;

    /* renamed from: c, reason: collision with root package name */
    public final List f104267c;

    /* renamed from: d, reason: collision with root package name */
    public final String f104268d;

    /* renamed from: e, reason: collision with root package name */
    public final String f104269e;

    public e2(String uid, String title, String actionLabel, ArrayList previews) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(previews, "previews");
        Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
        this.f104265a = uid;
        this.f104266b = title;
        this.f104267c = previews;
        this.f104268d = actionLabel;
        this.f104269e = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return Intrinsics.d(this.f104265a, e2Var.f104265a) && Intrinsics.d(this.f104266b, e2Var.f104266b) && Intrinsics.d(this.f104267c, e2Var.f104267c) && Intrinsics.d(this.f104268d, e2Var.f104268d);
    }

    @Override // qm0.k2
    public final String getId() {
        return this.f104269e;
    }

    public final int hashCode() {
        return this.f104268d.hashCode() + ep.b.c(this.f104267c, cb.d(this.f104266b, this.f104265a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FullGrid(uid=");
        sb3.append(this.f104265a);
        sb3.append(", title=");
        sb3.append(this.f104266b);
        sb3.append(", previews=");
        sb3.append(this.f104267c);
        sb3.append(", actionLabel=");
        return a.a.p(sb3, this.f104268d, ")");
    }
}
