package aa1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class e implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f1646a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f1647b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f1648c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1649d;

    /* renamed from: e, reason: collision with root package name */
    public final d f1650e;

    public e(i0 title, i0 description, i0 actionButtonText, boolean z13, d action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actionButtonText, "actionButtonText");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f1646a = title;
        this.f1647b = description;
        this.f1648c = actionButtonText;
        this.f1649d = z13;
        this.f1650e = action;
    }

    public static e e(e eVar, boolean z13, d dVar, int i13) {
        i0 title = eVar.f1646a;
        i0 description = eVar.f1647b;
        i0 actionButtonText = eVar.f1648c;
        if ((i13 & 8) != 0) {
            z13 = eVar.f1649d;
        }
        boolean z14 = z13;
        if ((i13 & 16) != 0) {
            dVar = eVar.f1650e;
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
        return Intrinsics.d(this.f1646a, eVar.f1646a) && Intrinsics.d(this.f1647b, eVar.f1647b) && Intrinsics.d(this.f1648c, eVar.f1648c) && this.f1649d == eVar.f1649d && Intrinsics.d(this.f1650e, eVar.f1650e);
    }

    public final int hashCode() {
        return this.f1650e.hashCode() + ep.b.e(this.f1649d, ep.b.d(this.f1648c, ep.b.d(this.f1647b, this.f1646a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ClaimedTargetAccountDisplayState(title=" + this.f1646a + ", description=" + this.f1647b + ", actionButtonText=" + this.f1648c + ", isLoading=" + this.f1649d + ", action=" + this.f1650e + ")";
    }
}
