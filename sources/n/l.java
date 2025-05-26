package n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class l extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final o f88641a;

    /* renamed from: b, reason: collision with root package name */
    public int f88642b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88643c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f88644d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f88645e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88646f;

    public l(o oVar, LayoutInflater layoutInflater, boolean z13, int i13) {
        this.f88644d = z13;
        this.f88645e = layoutInflater;
        this.f88641a = oVar;
        this.f88646f = i13;
        a();
    }

    public final void a() {
        o oVar = this.f88641a;
        q qVar = oVar.f88669v;
        if (qVar != null) {
            oVar.j();
            ArrayList arrayList = oVar.f88657j;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (((q) arrayList.get(i13)) == qVar) {
                    this.f88642b = i13;
                    return;
                }
            }
        }
        this.f88642b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q getItem(int i13) {
        ArrayList m13;
        boolean z13 = this.f88644d;
        o oVar = this.f88641a;
        if (z13) {
            oVar.j();
            m13 = oVar.f88657j;
        } else {
            m13 = oVar.m();
        }
        int i14 = this.f88642b;
        if (i14 >= 0 && i13 >= i14) {
            i13++;
        }
        return (q) m13.get(i13);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList m13;
        boolean z13 = this.f88644d;
        o oVar = this.f88641a;
        if (z13) {
            oVar.j();
            m13 = oVar.f88657j;
        } else {
            m13 = oVar.m();
        }
        return this.f88642b < 0 ? m13.size() : m13.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13;
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f88645e.inflate(this.f88646f, viewGroup, false);
        }
        int i14 = getItem(i13).f88676b;
        int i15 = i13 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        boolean z13 = this.f88641a.n() && i14 != (i15 >= 0 ? getItem(i15).f88676b : i14);
        ImageView imageView = listMenuItemView.f16184h;
        if (imageView != null) {
            imageView.setVisibility((listMenuItemView.f16191o || !z13) ? 8 : 0);
        }
        b0 b0Var = (b0) view;
        if (this.f88643c) {
            listMenuItemView.f16193q = true;
            listMenuItemView.f16189m = true;
        }
        b0Var.e(getItem(i13));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
