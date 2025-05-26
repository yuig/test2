package pi0;

import android.view.View;
import androidx.recyclerview.widget.m2;
import com.pinterest.feature.pin.create.view.HeaderCell;
import kotlin.jvm.internal.Intrinsics;
import q5.z;

/* loaded from: classes5.dex */
public final class b implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100177a;

    public /* synthetic */ b(int i13) {
        this.f100177a = i13;
    }

    @Override // androidx.recyclerview.widget.m2
    public final void c(View view) {
        switch (this.f100177a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                if (view instanceof HeaderCell) {
                    hf0.b.k(view);
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.m2
    public final void d(View view) {
        switch (this.f100177a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                view.post(new z(view, 4));
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                break;
        }
    }
}
