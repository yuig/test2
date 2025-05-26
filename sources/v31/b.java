package v31;

import a.cb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f123951a;

    /* renamed from: b, reason: collision with root package name */
    public final int f123952b;

    /* renamed from: c, reason: collision with root package name */
    public final String f123953c;

    /* renamed from: d, reason: collision with root package name */
    public final String f123954d;

    /* renamed from: e, reason: collision with root package name */
    public final String f123955e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f123956f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f123957g;

    public /* synthetic */ b(int i13, int i14, String str, String str2, String str3, Function0 function0, hl0.c cVar, int i15) {
        this(i13, (i15 & 2) != 0 ? 0 : i14, str, str2, str3, (i15 & 32) != 0 ? a.f123948j : function0, (i15 & 64) != 0 ? a.f123949k : cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f123951a == bVar.f123951a && this.f123952b == bVar.f123952b && Intrinsics.d(this.f123953c, bVar.f123953c) && Intrinsics.d(this.f123954d, bVar.f123954d) && Intrinsics.d(this.f123955e, bVar.f123955e) && Intrinsics.d(this.f123956f, bVar.f123956f) && Intrinsics.d(this.f123957g, bVar.f123957g);
    }

    public final int hashCode() {
        return this.f123957g.hashCode() + d7.g.b(this.f123956f, cb.d(this.f123955e, cb.d(this.f123954d, cb.d(this.f123953c, ep.b.b(this.f123952b, Integer.hashCode(this.f123951a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EmptyStateBannerDisplayState(iconResId=");
        sb3.append(this.f123951a);
        sb3.append(", iconBottomMarginResId=");
        sb3.append(this.f123952b);
        sb3.append(", title=");
        sb3.append(this.f123953c);
        sb3.append(", message=");
        sb3.append(this.f123954d);
        sb3.append(", ctaLabel=");
        sb3.append(this.f123955e);
        sb3.append(", ctaTapped=");
        sb3.append(this.f123956f);
        sb3.append(", onBind=");
        return pk2.f.i(sb3, this.f123957g, ")");
    }

    public b(int i13, int i14, String title, String message, String ctaLabel, Function0 ctaTapped, Function0 onBind) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(ctaLabel, "ctaLabel");
        Intrinsics.checkNotNullParameter(ctaTapped, "ctaTapped");
        Intrinsics.checkNotNullParameter(onBind, "onBind");
        this.f123951a = i13;
        this.f123952b = i14;
        this.f123953c = title;
        this.f123954d = message;
        this.f123955e = ctaLabel;
        this.f123956f = ctaTapped;
        this.f123957g = onBind;
    }
}
