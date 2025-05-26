package uv1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RowLayoutParams;
import androidx.recyclerview.widget.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f123222a;

    public p(q qVar) {
        this.f123222a = qVar;
    }

    @Override // androidx.recyclerview.widget.m2
    public final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // androidx.recyclerview.widget.m2
    public final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RowLayoutParams rowLayoutParams = layoutParams instanceof RowLayoutParams ? (RowLayoutParams) layoutParams : null;
        if (rowLayoutParams != null) {
            int measuredHeight = view.getMeasuredHeight() * (rowLayoutParams.f19273e + 1);
            q qVar = this.f123222a;
            int i13 = measuredHeight + qVar.E0;
            if (i13 > qVar.U8().f27245d) {
                qVar.U8().f27245d = i13;
                ca2.e.w(qVar.U8(), 0, null, null, null, 15);
            }
        }
    }
}
