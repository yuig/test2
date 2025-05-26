package t7;

import android.util.SparseArray;
import androidx.recyclerview.widget.i1;
import androidx.recyclerview.widget.o3;
import androidx.recyclerview.widget.p3;
import com.google.android.gms.internal.measurement.q4;
import java.util.List;

/* loaded from: classes3.dex */
public final class w implements p3 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f116612a = new SparseArray();

    @Override // androidx.recyclerview.widget.p3
    public final i1 c(int i13) {
        List list = (List) this.f116612a.get(i13);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException(a.a.d("Cannot find the wrapper for global view type ", i13));
        }
        return (i1) list.get(0);
    }

    @Override // androidx.recyclerview.widget.p3
    public final o3 f(i1 i1Var) {
        return new q4(this, i1Var, 20);
    }
}
