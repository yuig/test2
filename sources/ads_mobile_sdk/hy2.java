package ads_mobile_sdk;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class hy2 {

    /* renamed from: a, reason: collision with root package name */
    public final py2 f6143a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6144b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6145c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f6146d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6147e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f6148f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f6149g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6150h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f6151i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6152j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f6153k;

    public hy2(py2 viewabilityUpdateEvent, boolean z13, int i13, Rect adPosition, boolean z14, Rect screenPosition, Rect globalVisibleBox, boolean z15, Rect localVisibleBox, boolean z16, Rect hitRect) {
        Intrinsics.checkNotNullParameter(viewabilityUpdateEvent, "viewabilityUpdateEvent");
        Intrinsics.checkNotNullParameter(adPosition, "adPosition");
        Intrinsics.checkNotNullParameter(screenPosition, "screenPosition");
        Intrinsics.checkNotNullParameter(globalVisibleBox, "globalVisibleBox");
        Intrinsics.checkNotNullParameter(localVisibleBox, "localVisibleBox");
        Intrinsics.checkNotNullParameter(hitRect, "hitRect");
        this.f6143a = viewabilityUpdateEvent;
        this.f6144b = z13;
        this.f6145c = i13;
        this.f6146d = adPosition;
        this.f6147e = z14;
        this.f6148f = screenPosition;
        this.f6149g = globalVisibleBox;
        this.f6150h = z15;
        this.f6151i = localVisibleBox;
        this.f6152j = z16;
        this.f6153k = hitRect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy2)) {
            return false;
        }
        hy2 hy2Var = (hy2) obj;
        return this.f6143a == hy2Var.f6143a && this.f6144b == hy2Var.f6144b && this.f6145c == hy2Var.f6145c && Intrinsics.d(this.f6146d, hy2Var.f6146d) && this.f6147e == hy2Var.f6147e && Intrinsics.d(this.f6148f, hy2Var.f6148f) && Intrinsics.d(this.f6149g, hy2Var.f6149g) && this.f6150h == hy2Var.f6150h && Intrinsics.d(this.f6151i, hy2Var.f6151i) && this.f6152j == hy2Var.f6152j && Intrinsics.d(this.f6153k, hy2Var.f6153k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f6143a.hashCode() * 31;
        boolean z13 = this.f6144b;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int hashCode2 = (this.f6146d.hashCode() + kh2.n3.f(this.f6145c, (hashCode + i13) * 31)) * 31;
        boolean z14 = this.f6147e;
        int i14 = z14;
        if (z14 != 0) {
            i14 = 1;
        }
        int hashCode3 = (this.f6149g.hashCode() + ((this.f6148f.hashCode() + ((hashCode2 + i14) * 31)) * 31)) * 31;
        boolean z15 = this.f6150h;
        int i15 = z15;
        if (z15 != 0) {
            i15 = 1;
        }
        int hashCode4 = (this.f6151i.hashCode() + ((hashCode3 + i15) * 31)) * 31;
        boolean z16 = this.f6152j;
        return this.f6153k.hashCode() + ((hashCode4 + (z16 ? 1 : z16 ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "ViewabilityEvent(viewabilityUpdateEvent=" + this.f6143a + ", isVisible=" + this.f6144b + ", windowVisibility=" + this.f6145c + ", adPosition=" + this.f6146d + ", isAttachedToWindow=" + this.f6147e + ", screenPosition=" + this.f6148f + ", globalVisibleBox=" + this.f6149g + ", globalVisibleBoxVisible=" + this.f6150h + ", localVisibleBox=" + this.f6151i + ", localVisibleBoxVisible=" + this.f6152j + ", hitRect=" + this.f6153k + ")";
    }
}
