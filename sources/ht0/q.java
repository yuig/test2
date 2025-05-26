package ht0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends eb2.h {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f70135f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i13, int i14, int i15, mj.m mVar) {
        super(i15, 0, i13, i14, mVar);
        this.f70135f = i13;
    }

    @Override // eb2.h, androidx.recyclerview.widget.h2
    public final void f(Rect outRect, View view, RecyclerView parent, w2 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        parent.getClass();
        if (RecyclerView.r1(view) == 0) {
            outRect.bottom = this.f70135f;
        } else {
            super.f(outRect, view, parent, state);
        }
    }
}
