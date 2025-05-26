package n;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* loaded from: classes2.dex */
public final class k implements a0, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f88634a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f88635b;

    /* renamed from: c, reason: collision with root package name */
    public o f88636c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f88637d;

    /* renamed from: e, reason: collision with root package name */
    public final int f88638e;

    /* renamed from: f, reason: collision with root package name */
    public z f88639f;

    /* renamed from: g, reason: collision with root package name */
    public j f88640g;

    public k(Context context, int i13) {
        this.f88638e = i13;
        this.f88634a = context;
        this.f88635b = LayoutInflater.from(context);
    }

    public final j a() {
        if (this.f88640g == null) {
            this.f88640g = new j(this);
        }
        return this.f88640g;
    }

    @Override // n.a0
    public final void b(o oVar, boolean z13) {
        z zVar = this.f88639f;
        if (zVar != null) {
            zVar.b(oVar, z13);
        }
    }

    @Override // n.a0
    public final boolean c(g0 g0Var) {
        if (!g0Var.hasVisibleItems()) {
            return false;
        }
        p pVar = new p();
        pVar.f88672a = g0Var;
        androidx.appcompat.app.j jVar = new androidx.appcompat.app.j(g0Var.f88648a);
        k kVar = new k(jVar.getContext(), i.g.abc_list_menu_item_layout);
        pVar.f88674c = kVar;
        kVar.f88639f = pVar;
        g0Var.b(kVar);
        j a13 = pVar.f88674c.a();
        androidx.appcompat.app.f fVar = jVar.f16054a;
        fVar.f16010k = a13;
        fVar.f16011l = pVar;
        View view = g0Var.f88662o;
        if (view != null) {
            fVar.f16004e = view;
        } else {
            fVar.f16002c = g0Var.f88661n;
            jVar.setTitle(g0Var.f88660m);
        }
        fVar.f16009j = pVar;
        androidx.appcompat.app.k create = jVar.create();
        pVar.f88673b = create;
        create.setOnDismissListener(pVar);
        WindowManager.LayoutParams attributes = pVar.f88673b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pVar.f88673b.show();
        z zVar = this.f88639f;
        if (zVar == null) {
            return true;
        }
        zVar.c(g0Var);
        return true;
    }

    @Override // n.a0
    public final void d(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f88637d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // n.a0
    public final boolean e(q qVar) {
        return false;
    }

    @Override // n.a0
    public final Parcelable f() {
        if (this.f88637d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f88637d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // n.a0
    public final boolean g(q qVar) {
        return false;
    }

    @Override // n.a0
    public final int getId() {
        return 0;
    }

    @Override // n.a0
    public final void h(boolean z13) {
        j jVar = this.f88640g;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // n.a0
    public final void i(Context context, o oVar) {
        if (this.f88634a != null) {
            this.f88634a = context;
            if (this.f88635b == null) {
                this.f88635b = LayoutInflater.from(context);
            }
        }
        this.f88636c = oVar;
        j jVar = this.f88640g;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // n.a0
    public final boolean j() {
        return false;
    }

    public final c0 k(ViewGroup viewGroup) {
        if (this.f88637d == null) {
            this.f88637d = (ExpandedMenuView) this.f88635b.inflate(i.g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f88640g == null) {
                this.f88640g = new j(this);
            }
            this.f88637d.setAdapter((ListAdapter) this.f88640g);
            this.f88637d.setOnItemClickListener(this);
        }
        return this.f88637d;
    }

    @Override // n.a0
    public final void m(z zVar) {
        this.f88639f = zVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
        this.f88636c.r(this.f88640g.getItem(i13), this, 0);
    }
}
