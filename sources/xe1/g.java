package xe1;

import a.cb;
import c0.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final h f134721b;

    /* renamed from: c, reason: collision with root package name */
    public final String f134722c;

    /* renamed from: d, reason: collision with root package name */
    public final int f134723d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134724e;

    /* renamed from: f, reason: collision with root package name */
    public final lm1.b f134725f;

    /* renamed from: g, reason: collision with root package name */
    public final int f134726g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h viewType, String actionText, int i13, int i14, lm1.b actionTextFont, int i15) {
        super(viewType);
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        Intrinsics.checkNotNullParameter(actionTextFont, "actionTextFont");
        this.f134721b = viewType;
        this.f134722c = actionText;
        this.f134723d = i13;
        this.f134724e = i14;
        this.f134725f = actionTextFont;
        this.f134726g = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f134721b == gVar.f134721b && Intrinsics.d(this.f134722c, gVar.f134722c) && this.f134723d == gVar.f134723d && this.f134724e == gVar.f134724e && this.f134725f == gVar.f134725f && this.f134726g == gVar.f134726g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f134726g) + ((this.f134725f.hashCode() + ep.b.b(this.f134724e, ep.b.b(this.f134723d, cb.d(this.f134722c, this.f134721b.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActionTextViewModel(viewType=");
        sb3.append(this.f134721b);
        sb3.append(", actionText=");
        sb3.append(this.f134722c);
        sb3.append(", actionTextColor=");
        sb3.append(this.f134723d);
        sb3.append(", actionTextSize=");
        sb3.append(this.f134724e);
        sb3.append(", actionTextFont=");
        sb3.append(this.f134725f);
        sb3.append(", actionBackgroundColor=");
        return a.a.n(sb3, this.f134726g, ")");
    }
}
