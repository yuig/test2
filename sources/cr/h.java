package cr;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.q;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.qe;
import com.pinterest.api.model.vh;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import dl1.s;
import eb2.k;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import nx.d0;
import pk.a0;
import qa2.x1;
import rg0.n;
import xo.j;
import z32.m0;

/* loaded from: classes3.dex */
public final class h extends FrameLayout implements x1, ky.h {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f53079m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f53080a;

    /* renamed from: b, reason: collision with root package name */
    public vh f53081b;

    /* renamed from: c, reason: collision with root package name */
    public n f53082c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f53083d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f53084e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f53085f;

    /* renamed from: g, reason: collision with root package name */
    public f f53086g;

    /* renamed from: h, reason: collision with root package name */
    public m0 f53087h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f53088i;

    /* renamed from: j, reason: collision with root package name */
    public final Resources f53089j;

    /* renamed from: k, reason: collision with root package name */
    public final q f53090k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f53091l;

    public h(Context context, d0 d0Var) {
        super(context);
        this.f53083d = null;
        this.f53080a = d0Var;
        setOnClickListener(new androidx.appcompat.app.c(this, 8));
        this.f53091l = false;
        LayoutInflater.from(context).inflate(k42.e.view_related_searches_story_cell, (ViewGroup) this, true);
        this.f53084e = (RecyclerView) findViewById(k42.d.related_searches_rv);
        this.f53085f = (GestaltText) findViewById(k42.d.title_related_search);
        Resources resources = getResources();
        this.f53089j = resources;
        this.f53090k = new q(resources.getIntArray(c80.a.pds_pastel_colors), true);
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        vh vhVar = this.f53081b;
        if (vhVar != null) {
            m0 m0Var = vhVar.f42868z;
            hashMap.put("container_type", m0Var != null ? String.valueOf(m0Var.value()) : null);
            hashMap.put("story_type", this.f53081b.q());
        }
        f fVar = this.f53086g;
        if (fVar != null) {
            hashMap.put("content_ids", fVar.f53074e.toString());
        }
        return hashMap;
    }

    public final void b(vh vhVar) {
        String b13;
        n nVar;
        this.f53081b = vhVar;
        if (vhVar != null) {
            String str = vhVar.f42853k;
            if (j1.d1(str)) {
                this.f53082c = n.f(new vd0.c(str));
            }
        }
        vh vhVar2 = this.f53081b;
        if (vhVar2 != null && (nVar = this.f53082c) != null && !vhVar2.f42866x) {
            vhVar2.f42866x = true;
            nVar.g();
        }
        this.f53087h = this.f53081b.f42868z;
        this.f53088i = new ArrayList();
        for (s sVar : this.f53081b.f42865w) {
            if (sVar instanceof qe) {
                this.f53088i.add((qe) sVar);
            }
        }
        if (this.f53088i.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        f fVar = new f(this, getContext(), this.f53088i, this.f53081b);
        this.f53086g = fVar;
        RecyclerView recyclerView = this.f53084e;
        recyclerView.H2(fVar);
        kj kjVar = this.f53081b.f42855m;
        String b14 = kjVar != null ? kjVar.b() : null;
        boolean x03 = a0.x0(b14);
        GestaltText gestaltText = this.f53085f;
        if (x03) {
            gestaltText.i(new j(16));
        } else {
            a0.p(gestaltText, b14);
        }
        d dVar = new d(0);
        getContext();
        recyclerView.R2(new PinterestLinearLayoutManager(dVar, 0, false));
        int i13 = e.f53072a[this.f53087h.ordinal()];
        Resources resources = this.f53089j;
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            d dVar2 = new d(2);
            getContext();
            recyclerView.R2(new PinterestLinearLayoutManager(dVar2, 1, false));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f53084e.getLayoutParams();
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = 0;
            kj kjVar2 = this.f53081b.f42855m;
            b13 = kjVar2 != null ? kjVar2.b() : null;
            if (a0.x0(b13)) {
                b13 = resources.getString(k42.f.searches_to_try);
            }
            a0.p(gestaltText, b13);
            return;
        }
        d dVar3 = new d(1);
        getContext();
        recyclerView.R2(new PinterestLinearLayoutManager(dVar3, 1, false));
        for (int size = this.f53088i.size() - 1; size >= 5; size--) {
            this.f53088i.remove(size);
        }
        kj kjVar3 = this.f53081b.f42855m;
        b13 = kjVar3 != null ? kjVar3.b() : null;
        if (a0.x0(b13)) {
            b13 = resources.getString(k42.f.searches_to_try);
        }
        a0.p(gestaltText, b13);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f53084e.getLayoutParams();
        marginLayoutParams2.leftMargin = 0;
        marginLayoutParams2.rightMargin = 0;
        if (this.f53091l) {
            return;
        }
        this.f53091l = true;
        recyclerView.m(new k(0, resources.getDimensionPixelSize(eo1.c.space_100), 0, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String uid = this.f53081b.getUid();
        d0 a13 = sh.f.a();
        f1 f1Var = f1.STORY_IMPRESSION_ONE_PIXEL;
        g0 g0Var = g0.DYNAMIC_GRID_STORY;
        HashMap hashMap = new HashMap();
        vh vhVar = this.f53081b;
        hashMap.put("story_type", vhVar.q());
        m0 m0Var = vhVar.f42868z;
        hashMap.put("container_type", m0Var != null ? String.valueOf(m0Var.value()) : null);
        a13.h0(f1Var, null, g0Var, uid, hashMap, null, null, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f53080a.h0(f1.SCROLL, null, g0.DYNAMIC_GRID_STORY, null, a(), null, null, false);
        super.onDetachedFromWindow();
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
