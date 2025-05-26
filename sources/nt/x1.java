package nt;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final View f92231a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f92232b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f92233c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f92234d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f92235e;

    /* renamed from: f, reason: collision with root package name */
    public int f92236f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f92237g;

    public x1(View content, boolean z13, boolean z14, boolean z15, boolean z16, y1 update) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(update, "update");
        this.f92231a = content;
        this.f92232b = z13;
        this.f92233c = z14;
        this.f92234d = z15;
        this.f92235e = z16;
        this.f92236f = 0;
        this.f92237g = update;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Intrinsics.d(this.f92231a, x1Var.f92231a) && this.f92232b == x1Var.f92232b && this.f92233c == x1Var.f92233c && this.f92234d == x1Var.f92234d && this.f92235e == x1Var.f92235e && this.f92236f == x1Var.f92236f && Intrinsics.d(this.f92237g, x1Var.f92237g);
    }

    public final int hashCode() {
        return this.f92237g.hashCode() + ep.b.b(this.f92236f, ep.b.e(this.f92235e, ep.b.e(this.f92234d, ep.b.e(this.f92233c, ep.b.e(this.f92232b, this.f92231a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        int i13 = this.f92236f;
        StringBuilder sb3 = new StringBuilder("BottomSheetContent(content=");
        sb3.append(this.f92231a);
        sb3.append(", isDraggable=");
        sb3.append(this.f92232b);
        sb3.append(", isAllowInterceptTouchEvent=");
        sb3.append(this.f92233c);
        sb3.append(", isPlayVideo=");
        sb3.append(this.f92234d);
        sb3.append(", hasUpdateShow=");
        sb3.append(this.f92235e);
        sb3.append(", adjustedViewHeight=");
        sb3.append(i13);
        sb3.append(", update=");
        return pk2.f.i(sb3, this.f92237g, ")");
    }
}
