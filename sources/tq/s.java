package tq;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.c1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends c1 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f118931q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Context context, int i13) {
        super(context);
        this.f118931q = i13;
    }

    @Override // androidx.recyclerview.widget.c1
    public final int k(int i13, int i14, int i15, int i16, int i17) {
        switch (this.f118931q) {
            case 3:
                return a.a.b(i16, i15, 2, i15) - (((i14 - i13) / 2) + i13);
            case 4:
            default:
                return super.k(i13, i14, i15, i16, i17);
            case 5:
                return a.a.b(i16, i15, 2, i15) - (((i14 - i13) / 2) + i13);
        }
    }

    @Override // androidx.recyclerview.widget.c1
    public final int l(View view, int i13) {
        switch (this.f118931q) {
            case 4:
                return super.l(view, -1) + (view != null ? view.getWidth() / 2 : 0);
            default:
                return super.l(view, i13);
        }
    }

    @Override // androidx.recyclerview.widget.c1
    public final float n(DisplayMetrics displayMetrics) {
        switch (this.f118931q) {
            case 0:
                Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                return 150.0f / displayMetrics.densityDpi;
            case 4:
                Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.n(displayMetrics);
        }
    }

    @Override // androidx.recyclerview.widget.c1
    public final int p(int i13) {
        switch (this.f118931q) {
            case 2:
                return super.p(i13) * 2;
            case 3:
                return 100;
            default:
                return super.p(i13);
        }
    }

    @Override // androidx.recyclerview.widget.c1
    public final int q() {
        switch (this.f118931q) {
            case 1:
            case 2:
                return -1;
            default:
                return super.q();
        }
    }
}
