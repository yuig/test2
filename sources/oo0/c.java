package oo0;

import android.content.Context;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.brio.view.BasicListCell;
import h32.a4;
import h32.d4;
import h32.g0;
import java.util.HashMap;
import nx.d0;

/* loaded from: classes5.dex */
public final class c extends LinearLayout implements lo0.d {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f96805j = 0;

    /* renamed from: a, reason: collision with root package name */
    public FrameLayout f96806a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltButton f96807b;

    /* renamed from: c, reason: collision with root package name */
    public ListAdapter f96808c;

    /* renamed from: d, reason: collision with root package name */
    public AdapterView.OnItemClickListener f96809d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltText f96810e;

    /* renamed from: f, reason: collision with root package name */
    public ListView f96811f;

    /* renamed from: g, reason: collision with root package name */
    public mo0.a f96812g;

    /* renamed from: h, reason: collision with root package name */
    public HashMap f96813h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f96814i;

    public final GestaltCheckBox a(int i13) {
        return (GestaltCheckBox) this.f96814i.get(Integer.valueOf(i13));
    }

    public final BasicListCell b(int i13) {
        return (BasicListCell) this.f96813h.get(Integer.valueOf(i13));
    }

    public final void e(BasicListCell basicListCell, boolean z13) {
        int i13 = z13 ? eo1.b.color_themed_text_default : eo1.b.color_gray_500;
        if (basicListCell != null) {
            Context context = getContext();
            Object obj = d5.a.f53679a;
            basicListCell.f52226a.setTextColor(context.getColor(i13));
        }
    }

    public final void g(boolean z13) {
        if (z13) {
            this.f96807b.d(new b(1));
        } else {
            this.f96807b.d(new b(2));
        }
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final g0 getF123811z0() {
        return null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getT1() {
        return null;
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getS1() {
        return null;
    }

    @Override // yk1.r
    public final void setPinalytics(d0 d0Var) {
    }
}
