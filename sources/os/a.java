package os;

import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class a extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public List f97477a;

    public final void a(ArrayList arrayList) {
        this.f97477a = arrayList;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List list = this.f97477a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        return this.f97477a.get(i13);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13;
    }
}
