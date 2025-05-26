package ku0;

import a.cb;
import d7.g;
import ep.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f80888a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f80889b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80890c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80891d;

    /* renamed from: e, reason: collision with root package name */
    public final long f80892e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80893f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f80894g;

    /* renamed from: h, reason: collision with root package name */
    public final Function1 f80895h;

    /* renamed from: i, reason: collision with root package name */
    public final Function1 f80896i;

    public a(boolean z13, boolean z14, String str, int i13, long j13, String draftDescription, Function0 onClickCallback, Function1 onDeleteCallback, Function1 onDraftCoverMissing) {
        Intrinsics.checkNotNullParameter(draftDescription, "draftDescription");
        Intrinsics.checkNotNullParameter(onClickCallback, "onClickCallback");
        Intrinsics.checkNotNullParameter(onDeleteCallback, "onDeleteCallback");
        Intrinsics.checkNotNullParameter(onDraftCoverMissing, "onDraftCoverMissing");
        this.f80888a = z13;
        this.f80889b = z14;
        this.f80890c = str;
        this.f80891d = i13;
        this.f80892e = j13;
        this.f80893f = draftDescription;
        this.f80894g = onClickCallback;
        this.f80895h = onDeleteCallback;
        this.f80896i = onDraftCoverMissing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f80888a == aVar.f80888a && this.f80889b == aVar.f80889b && Intrinsics.d(this.f80890c, aVar.f80890c) && this.f80891d == aVar.f80891d && this.f80892e == aVar.f80892e && Intrinsics.d(this.f80893f, aVar.f80893f) && Intrinsics.d(this.f80894g, aVar.f80894g) && Intrinsics.d(this.f80895h, aVar.f80895h) && Intrinsics.d(this.f80896i, aVar.f80896i);
    }

    public final int hashCode() {
        int e13 = b.e(this.f80889b, Boolean.hashCode(this.f80888a) * 31, 31);
        String str = this.f80890c;
        return this.f80896i.hashCode() + g.c(this.f80895h, g.b(this.f80894g, cb.d(this.f80893f, a.a.c(this.f80892e, b.b(this.f80891d, (e13 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "IdeaPinDraftPreviewItem(isBroken=" + this.f80888a + ", isExpiring=" + this.f80889b + ", coverImagePath=" + this.f80890c + ", pageCount=" + this.f80891d + ", totalDurationMs=" + this.f80892e + ", draftDescription=" + this.f80893f + ", onClickCallback=" + this.f80894g + ", onDeleteCallback=" + this.f80895h + ", onDraftCoverMissing=" + this.f80896i + ")";
    }
}
