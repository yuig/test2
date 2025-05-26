package n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f88632a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f88633b;

    public j(k kVar) {
        this.f88633b = kVar;
        a();
    }

    public final void a() {
        o oVar = this.f88633b.f88636c;
        q qVar = oVar.f88669v;
        if (qVar != null) {
            oVar.j();
            ArrayList arrayList = oVar.f88657j;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (((q) arrayList.get(i13)) == qVar) {
                    this.f88632a = i13;
                    return;
                }
            }
        }
        this.f88632a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i13) {
        k kVar = this.f88633b;
        o oVar = kVar.f88636c;
        oVar.j();
        ArrayList arrayList = oVar.f88657j;
        kVar.getClass();
        int i14 = this.f88632a;
        if (i14 >= 0 && i13 >= i14) {
            i13++;
        }
        return (q) arrayList.get(i13);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        k kVar = this.f88633b;
        o oVar = kVar.f88636c;
        oVar.j();
        int size = oVar.f88657j.size();
        kVar.getClass();
        return this.f88632a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13;
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        if (view == null) {
            k kVar = this.f88633b;
            view = kVar.f88635b.inflate(kVar.f88638e, viewGroup, false);
        }
        ((b0) view).e(getItem(i13));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
