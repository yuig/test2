package xs;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final View f135709a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f135710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f135711c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f135712d;

    public e(View content, boolean z13, f update) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(update, "update");
        this.f135709a = content;
        this.f135710b = z13;
        this.f135711c = 0;
        this.f135712d = update;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f135709a, eVar.f135709a) && this.f135710b == eVar.f135710b && this.f135711c == eVar.f135711c && Intrinsics.d(this.f135712d, eVar.f135712d);
    }

    public final int hashCode() {
        return this.f135712d.hashCode() + ep.b.b(this.f135711c, ep.b.e(true, ep.b.e(this.f135710b, ep.b.e(false, ep.b.e(false, this.f135709a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BottomSheetContent(content=");
        sb3.append(this.f135709a);
        sb3.append(", isDraggable=false, isAllowInterceptTouchEvent=false, isPlayVideo=");
        sb3.append(this.f135710b);
        sb3.append(", hasUpdateShow=true, adjustedViewHeight=");
        sb3.append(this.f135711c);
        sb3.append(", update=");
        return pk2.f.i(sb3, this.f135712d, ")");
    }
}
