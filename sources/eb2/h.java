package eb2;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h2;
import androidx.recyclerview.widget.w2;

/* loaded from: classes4.dex */
public class h extends h2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58257a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58258b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58259c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58260d;

    /* renamed from: e, reason: collision with root package name */
    public final g f58261e;

    public h(int i13, int i14, int i15, int i16, g gVar) {
        this.f58257a = i13;
        this.f58258b = i14;
        this.f58259c = i15;
        this.f58260d = i16;
        this.f58261e = gVar;
    }

    @Override // androidx.recyclerview.widget.h2
    public void f(Rect rect, View view, RecyclerView recyclerView, w2 w2Var) {
        recyclerView.getClass();
        int r13 = RecyclerView.r1(view);
        int a13 = this.f58261e.a();
        if (r13 < a13) {
            return;
        }
        rect.bottom = this.f58259c;
        int i13 = r13 - a13;
        int i14 = this.f58257a;
        int i15 = i13 % i14;
        boolean z13 = view.getResources().getConfiguration().getLayoutDirection() == 1;
        int i16 = this.f58258b;
        int i17 = (i15 * i16) / i14;
        int i18 = this.f58260d;
        if (i17 == 0) {
            i17 = i18;
        }
        if (z13) {
            rect.right = i17;
        } else {
            rect.left = i17;
        }
        int i19 = (((i14 - i15) - 1) * i16) / i14;
        if (i19 != 0) {
            i18 = i19;
        }
        if (z13) {
            rect.left = i18;
        } else {
            rect.right = i18;
        }
    }

    public h(int i13, int i14, int i15) {
        this(i13, i14, i15, 0, new gi2.b());
    }
}
