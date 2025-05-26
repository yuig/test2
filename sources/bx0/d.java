package bx0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24027i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f24028j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f24029k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i13, RecyclerView recyclerView) {
        super(2);
        this.f24029k = i13;
        this.f24028j = recyclerView;
    }

    public final Integer b(View view, int i13) {
        int i14 = this.f24027i;
        int i15 = this.f24029k;
        RecyclerView recyclerView = this.f24028j;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                if (i13 > 0) {
                    i15 = bs1.c.H1(recyclerView, eo1.a.sema_space_100);
                }
                return Integer.valueOf(i15);
            default:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                b2 b2Var = recyclerView.f19240m;
                int e13 = (b2Var != null ? b2Var.e() : 0) - 1;
                if (e13 < 0 || i13 != e13) {
                    i15 = bs1.c.H1(recyclerView, eo1.a.sema_space_100);
                }
                return Integer.valueOf(i15);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24027i) {
        }
        return b((View) obj, ((Number) obj2).intValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RecyclerView recyclerView, int i13) {
        super(2);
        this.f24028j = recyclerView;
        this.f24029k = i13;
    }
}
