package yq0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView f139719a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f139720b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f139721c;

    public o(RecyclerView _recyclerView) {
        Intrinsics.checkNotNullParameter(_recyclerView, "_recyclerView");
        this.f139719a = _recyclerView;
        this.f139720b = new LinkedHashSet();
        this.f139721c = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.m2
    public final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f139719a.getClass();
        int r13 = RecyclerView.r1(view);
        Iterator it = this.f139720b.iterator();
        while (it.hasNext()) {
            ((sq0.z) it.next()).j3(r13);
        }
    }

    @Override // androidx.recyclerview.widget.m2
    public final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f139719a.getClass();
        int r13 = RecyclerView.r1(view);
        sq0.y yVar = sq0.y.UNKNOWN;
        ArrayList arrayList = this.f139721c;
        if (arrayList.size() == 2) {
            if (r13 > ((Number) arrayList.get(0)).intValue() && r13 > ((Number) arrayList.get(1)).intValue()) {
                yVar = sq0.y.DOWN;
            } else if (r13 < ((Number) arrayList.get(0)).intValue() && r13 < ((Number) arrayList.get(1)).intValue()) {
                yVar = sq0.y.UP;
            }
        }
        if (arrayList.size() < 2) {
            arrayList.add(Integer.valueOf(r13));
        } else {
            arrayList.set(0, arrayList.get(1));
            arrayList.set(1, Integer.valueOf(r13));
        }
        Iterator it = this.f139720b.iterator();
        while (it.hasNext()) {
            ((sq0.z) it.next()).r1(r13, yVar);
        }
    }
}
