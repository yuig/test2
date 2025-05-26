package qa2;

import android.content.Context;
import androidx.recyclerview.widget.a3;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;
import lh0.r2;

/* loaded from: classes2.dex */
public final class d implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final r2 f103247a;

    public d(r2 experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f103247a = experiments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep] */
    public final h0 a(Context context, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        LegoPinGridCellImpl sbaPinRep = z13 ? new SbaPinRep(context) : new LegoPinGridCellImpl(context);
        q5.v0.o(sbaPinRep, new a3(sbaPinRep, this));
        return sbaPinRep;
    }
}
