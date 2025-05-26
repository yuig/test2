package p90;

import android.view.View;
import androidx.recyclerview.widget.q2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o82.v2;

/* loaded from: classes5.dex */
public final class r extends androidx.recyclerview.widget.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f99215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f99216c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v2 f99217d;

    public r(int i13, v2 v2Var, List list) {
        this.f99215b = i13;
        this.f99216c = list;
        this.f99217d = v2Var;
    }

    @Override // androidx.recyclerview.widget.a0
    public final View j(q2 recycler, int i13) {
        int i14 = this.f99215b;
        v2 v2Var = this.f99217d;
        List list = this.f99216c;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(recycler, "recycler");
                if (list.contains(Integer.valueOf(i13))) {
                    return (View) ((w) v2Var).Q0.get(Integer.valueOf(i13));
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(recycler, "recycler");
                if (list.contains(Integer.valueOf(i13))) {
                    return (View) ((fa0.t) v2Var).S0.get(Integer.valueOf(i13));
                }
                return null;
        }
    }
}
