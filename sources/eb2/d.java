package eb2;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.w2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f58252a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f58253b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f58254c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f58255d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [eb2.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ d(ex.d r3, kotlin.jvm.functions.Function2 r4, ex.d r5, ex.d r6, int r7) {
        /*
            r2 = this;
            r0 = r7 & 1
            eb2.e r1 = eb2.e.f58256i
            if (r0 == 0) goto L7
            r3 = r1
        L7:
            r0 = r7 & 2
            if (r0 == 0) goto Lc
            r4 = r1
        Lc:
            r0 = r7 & 4
            if (r0 == 0) goto L11
            r5 = r1
        L11:
            r7 = r7 & 8
            if (r7 == 0) goto L16
            r6 = r1
        L16:
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eb2.d.<init>(ex.d, kotlin.jvm.functions.Function2, ex.d, ex.d, int):void");
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
        if (r13 < 0) {
            return;
        }
        outRect.left = ((Number) this.f58252a.invoke(view, Integer.valueOf(r13))).intValue();
        outRect.top = ((Number) this.f58253b.invoke(view, Integer.valueOf(r13))).intValue();
        outRect.right = ((Number) this.f58254c.invoke(view, Integer.valueOf(r13))).intValue();
        outRect.bottom = ((Number) this.f58255d.invoke(view, Integer.valueOf(r13))).intValue();
    }

    public d(Function2 leftSpacingProvider, Function2 topSpacingProvider, Function2 rightSpacingProvider, Function2 bottomSpacingProvider) {
        Intrinsics.checkNotNullParameter(leftSpacingProvider, "leftSpacingProvider");
        Intrinsics.checkNotNullParameter(topSpacingProvider, "topSpacingProvider");
        Intrinsics.checkNotNullParameter(rightSpacingProvider, "rightSpacingProvider");
        Intrinsics.checkNotNullParameter(bottomSpacingProvider, "bottomSpacingProvider");
        this.f58252a = leftSpacingProvider;
        this.f58253b = topSpacingProvider;
        this.f58254c = rightSpacingProvider;
        this.f58255d = bottomSpacingProvider;
    }
}
