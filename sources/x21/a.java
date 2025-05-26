package x21;

import android.widget.GridLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131584a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f131585b;

    public a(LinearLayoutManager linearLayoutManager) {
        Intrinsics.checkNotNullParameter(linearLayoutManager, "linearLayoutManager");
        this.f131585b = linearLayoutManager;
    }

    public a(GridLayout gridView) {
        Intrinsics.checkNotNullParameter(gridView, "gridView");
        this.f131585b = gridView;
    }
}
