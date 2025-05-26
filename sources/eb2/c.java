package eb2;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.w2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final a f58250a;

    /* renamed from: b, reason: collision with root package name */
    public final b f58251b;

    public c(a itemSpacingLookup, b headerLookup) {
        Intrinsics.checkNotNullParameter(itemSpacingLookup, "itemSpacingLookup");
        Intrinsics.checkNotNullParameter(headerLookup, "headerLookup");
        this.f58250a = itemSpacingLookup;
        this.f58251b = headerLookup;
    }

    @Override // androidx.recyclerview.widget.h2
    public final void f(Rect outRect, View view, RecyclerView parent, w2 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.f(outRect, view, parent, state);
        parent.getClass();
        int r13 = RecyclerView.r1(view);
        if (r13 < this.f58251b.a()) {
            return;
        }
        a aVar = this.f58250a;
        outRect.left = aVar.b(view, r13);
        outRect.top = aVar.d(view, r13);
        outRect.right = aVar.c(view, r13);
        outRect.bottom = aVar.a(view, r13);
    }
}
