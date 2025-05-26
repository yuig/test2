package z91;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class e implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f141363a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f141364b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f141365c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f141366d;

    /* renamed from: e, reason: collision with root package name */
    public final d f141367e;

    public e(i0 title, i0 description, i0 actionButtonText, boolean z13, d action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f141363a = title;
        this.f141364b = description;
        this.f141365c = actionButtonText;
        this.f141366d = z13;
        this.f141367e = action;
    }

    public static e e(e eVar, boolean z13, d dVar, int i13) {
        i0 title = eVar.f141363a;
        i0 description = eVar.f141364b;
        i0 actionButtonText = eVar.f141365c;
        if ((i13 & 8) != 0) {
            z13 = eVar.f141366d;
        }
        boolean z14 = z13;
        if ((i13 & 16) != 0) {
            dVar = eVar.f141367e;
        }
        d action = dVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        Intrinsics.checkNotNullParameter(action, "action");
        return new e(title, description, actionButtonText, z14, action);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f141363a, eVar.f141363a) && Intrinsics.d(this.f141364b, eVar.f141364b) && Intrinsics.d(this.f141365c, eVar.f141365c) && this.f141366d == eVar.f141366d && Intrinsics.d(this.f141367e, eVar.f141367e);
    }

    public final int hashCode() {
        return this.f141367e.hashCode() + ep.b.e(this.f141366d, ep.b.d(this.f141365c, ep.b.d(this.f141364b, this.f141363a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ClaimedAmazonAccountDisplayState(title=" + this.f141363a + ", description=" + this.f141364b + ", actionButtonText=" + this.f141365c + ", isLoading=" + this.f141366d + ", action=" + this.f141367e + ")";
    }
}
