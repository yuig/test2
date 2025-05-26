package eb2;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.w2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58263a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58264b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58265c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58266d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58267e;

    public /* synthetic */ k(int i13, int i14) {
        this(0, 0, 0, i13);
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect outRect, View view, RecyclerView parent, w2 state) {
        int b13;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (!this.f58267e && (b13 = state.b()) > 0) {
            parent.getClass();
            if (RecyclerView.r1(view) == b13 - 1) {
                return;
            }
        }
        super.f(outRect, view, parent, state);
        outRect.set(this.f58263a, this.f58264b, this.f58265c, this.f58266d);
    }

    public k(int i13, int i14, int i15, int i16) {
        this.f58263a = i13;
        this.f58264b = i14;
        this.f58265c = i15;
        this.f58266d = i16;
        this.f58267e = true;
    }

    public k(int i13) {
        this(i13, i13, i13, i13);
    }

    public k(boolean z13, int i13, int i14, int i15, int i16) {
        this(i13, i14, i15, i16);
        this.f58267e = z13;
    }
}
