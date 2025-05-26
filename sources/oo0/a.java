package oo0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.pinterest.api.model.eb;
import com.pinterest.api.model.fb;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.ui.brio.view.BasicListCell;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import rq.c1;

/* loaded from: classes5.dex */
public final class a extends BaseAdapter implements AdapterView.OnItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f96801c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final lo0.a f96802a;

    /* renamed from: b, reason: collision with root package name */
    public c f96803b;

    public a(mo0.a aVar) {
        this.f96802a = aVar;
        fb fbVar = aVar.f87800c;
        fbVar.getClass();
        fbVar.f37646f = new HashMap();
        fbVar.f37651k.clear();
        notifyDataSetChanged();
    }

    public static View a(boolean z13, View view, ViewGroup viewGroup) {
        return z13 ? !(view instanceof BasicListCell) ? new BasicListCell(viewGroup.getContext(), null) : view : !(view instanceof GestaltCheckBox) ? new GestaltCheckBox(viewGroup.getContext()) : view;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        fb fbVar = ((mo0.a) this.f96802a).f87800c;
        List list = ((eb) fbVar.f37642b.get(fbVar.f37650j)).f37223b;
        if (list == null) {
            list = new ArrayList();
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        return ((mo0.a) this.f96802a).f87800c.a(i13);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13;
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        fb fbVar = ((mo0.a) this.f96802a).f87800c;
        if (((eb) fbVar.f37642b.get(fbVar.f37650j)).f37226e) {
            BasicListCell basicListCell = (BasicListCell) a(true, view, viewGroup);
            this.f96803b.f96813h.put(Integer.valueOf(i13), basicListCell);
            this.f96803b.f96812g.s3(i13, true);
            return basicListCell;
        }
        GestaltCheckBox gestaltCheckBox = (GestaltCheckBox) a(false, view, viewGroup);
        this.f96803b.f96814i.put(Integer.valueOf(i13), gestaltCheckBox);
        this.f96803b.f96812g.s3(i13, false);
        c0.d.l(gestaltCheckBox, new gr.a(new c1(this, i13), 1));
        return gestaltCheckBox;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        this.f96803b.f96812g.r3(i13);
    }
}
