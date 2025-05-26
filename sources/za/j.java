package za;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.j0;
import androidx.fragment.app.w0;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import androidx.viewpager2.widget.ViewPager2;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.navigation.Navigation;
import g1.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class j extends b2 implements l {

    /* renamed from: d, reason: collision with root package name */
    public final s f141466d;

    /* renamed from: e, reason: collision with root package name */
    public final w0 f141467e;

    /* renamed from: i, reason: collision with root package name */
    public f f141471i;

    /* renamed from: f, reason: collision with root package name */
    public final p f141468f = new p();

    /* renamed from: g, reason: collision with root package name */
    public final p f141469g = new p();

    /* renamed from: h, reason: collision with root package name */
    public final p f141470h = new p();

    /* renamed from: j, reason: collision with root package name */
    public final c f141472j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public boolean f141473k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f141474l = false;

    public j(w0 w0Var, s sVar) {
        this.f141467e = w0Var;
        this.f141466d = sVar;
        A(true);
    }

    public static void C(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean D(long j13) {
        return j13 >= 0 && j13 < ((long) e());
    }

    public abstract Fragment E(int i13);

    public final void F() {
        p pVar;
        p pVar2;
        Fragment fragment;
        View view;
        if (!this.f141474l || this.f141467e.Q()) {
            return;
        }
        g1.h hVar = new g1.h(0);
        int i13 = 0;
        while (true) {
            pVar = this.f141468f;
            int m13 = pVar.m();
            pVar2 = this.f141470h;
            if (i13 >= m13) {
                break;
            }
            long i14 = pVar.i(i13);
            if (!D(i14)) {
                hVar.add(Long.valueOf(i14));
                pVar2.k(i14);
            }
            i13++;
        }
        if (!this.f141473k) {
            this.f141474l = false;
            for (int i15 = 0; i15 < pVar.m(); i15++) {
                long i16 = pVar.i(i15);
                if (pVar2.g(i16) < 0 && ((fragment = (Fragment) pVar.c(i16)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                    hVar.add(Long.valueOf(i16));
                }
            }
        }
        g1.f fVar = new g1.f(hVar);
        while (fVar.hasNext()) {
            I(((Long) fVar.next()).longValue());
        }
    }

    public final Long G(int i13) {
        Long l13 = null;
        int i14 = 0;
        while (true) {
            p pVar = this.f141470h;
            if (i14 >= pVar.m()) {
                return l13;
            }
            if (((Integer) pVar.n(i14)).intValue() == i13) {
                if (l13 != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l13 = Long.valueOf(pVar.i(i14));
            }
            i14++;
        }
    }

    public final void H(k kVar) {
        Fragment fragment = (Fragment) this.f141468f.c(kVar.f19721e);
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) kVar.f19717a;
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean isAdded = fragment.isAdded();
        w0 w0Var = this.f141467e;
        if (isAdded && view == null) {
            ((CopyOnWriteArrayList) w0Var.f18462n.f116986b).add(new j0(new a(this, fragment, frameLayout), false));
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                C(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            C(view, frameLayout);
            return;
        }
        if (w0Var.Q()) {
            if (w0Var.f18448J) {
                return;
            }
            this.f141466d.a(new m(this, kVar));
            return;
        }
        ((CopyOnWriteArrayList) w0Var.f18462n.f116986b).add(new j0(new a(this, fragment, frameLayout), false));
        c cVar = this.f141472j;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = cVar.f141454b.iterator();
        while (it.hasNext()) {
            h42.i iVar = (h42.i) ((i) it.next());
            iVar.getClass();
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            nl1.d dVar = (nl1.d) fragment;
            dVar.f76943g = false;
            h42.j jVar = iVar.f67651b;
            for (Map.Entry entry : jVar.f67655p.entrySet()) {
                Navigation navigation = (Navigation) entry.getKey();
                if (Intrinsics.d((Fragment) entry.getValue(), fragment)) {
                    FragmentActivity requireActivity = jVar.f67652m.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    Object obj = jVar.f67656q.get(navigation);
                    Intrinsics.f(obj);
                    dVar.x3(requireActivity, (ScreenDescription) obj, null);
                }
            }
            g gVar = i.f141465a;
            Intrinsics.checkNotNullExpressionValue(gVar, "onFragmentPreAdded(...)");
            arrayList.add(gVar);
        }
        try {
            fragment.setMenuVisibility(false);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(w0Var);
            aVar.g(0, fragment, "f" + kVar.f19721e, 1);
            aVar.n(fragment, r.STARTED);
            aVar.f();
            this.f141471i.b(false);
        } finally {
            c.e(arrayList);
        }
    }

    public final void I(long j13) {
        ViewParent parent;
        p pVar = this.f141468f;
        final Fragment fragment = (Fragment) pVar.c(j13);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean D = D(j13);
        p pVar2 = this.f141469g;
        if (!D) {
            pVar2.k(j13);
        }
        if (!fragment.isAdded()) {
            pVar.k(j13);
            return;
        }
        w0 w0Var = this.f141467e;
        if (w0Var.Q()) {
            this.f141474l = true;
            return;
        }
        boolean isAdded = fragment.isAdded();
        c cVar = this.f141472j;
        if (isAdded && D(j13)) {
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = cVar.f141454b.iterator();
            while (it.hasNext()) {
                ((i) it.next()).getClass();
                arrayList.add(i.f141465a);
            }
            Fragment.SavedState d03 = w0Var.d0(fragment);
            c.e(arrayList);
            pVar2.j(j13, d03);
        }
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = cVar.f141454b.iterator();
        while (it2.hasNext()) {
            h42.i iVar = (h42.i) ((i) it2.next());
            iVar.getClass();
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            final h42.j jVar = iVar.f67651b;
            arrayList2.add(new h() { // from class: h42.h
                @Override // za.h
                public final void a() {
                    j this$0 = j.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Fragment fragment2 = fragment;
                    Intrinsics.checkNotNullParameter(fragment2, "$fragment");
                    Iterator it3 = this$0.f67655p.entrySet().iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.d(fragment2, (Fragment) ((Map.Entry) it3.next()).getValue())) {
                            it3.remove();
                        }
                    }
                }
            });
        }
        try {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(w0Var);
            aVar.k(fragment);
            aVar.f();
            pVar.k(j13);
        } finally {
            c.e(arrayList2);
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public long f(int i13) {
        return i13;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void q(RecyclerView recyclerView) {
        com.bumptech.glide.d.h(this.f141471i == null);
        f fVar = new f(this);
        this.f141471i = fVar;
        ViewPager2 a13 = f.a(recyclerView);
        fVar.f141462d = a13;
        d dVar = new d(fVar, 0);
        fVar.f141459a = dVar;
        a13.f(dVar);
        e eVar = new e(fVar);
        fVar.f141460b = eVar;
        z(eVar);
        androidx.lifecycle.e eVar2 = new androidx.lifecycle.e(fVar, 3);
        fVar.f141461c = eVar2;
        this.f141466d.a(eVar2);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        k kVar = (k) y2Var;
        long j13 = kVar.f19721e;
        FrameLayout frameLayout = (FrameLayout) kVar.f19717a;
        int id3 = frameLayout.getId();
        Long G = G(id3);
        p pVar = this.f141470h;
        if (G != null && G.longValue() != j13) {
            I(G.longValue());
            pVar.k(G.longValue());
        }
        pVar.j(j13, Integer.valueOf(id3));
        long f13 = f(i13);
        p pVar2 = this.f141468f;
        if (pVar2.g(f13) < 0) {
            Fragment E = E(i13);
            E.setInitialSavedState((Fragment.SavedState) this.f141469g.c(f13));
            pVar2.j(f13, E);
        }
        if (frameLayout.isAttachedToWindow()) {
            H(kVar);
        }
        F();
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView recyclerView, int i13) {
        int i14 = k.f141475u;
        FrameLayout frameLayout = new FrameLayout(recyclerView.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new k(frameLayout);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void u(RecyclerView recyclerView) {
        f fVar = this.f141471i;
        fVar.getClass();
        ViewPager2 a13 = f.a(recyclerView);
        ((List) a13.f19923c.f141456b).remove(fVar.f141459a);
        e eVar = fVar.f141460b;
        j jVar = fVar.f141464f;
        jVar.B(eVar);
        jVar.f141466d.b(fVar.f141461c);
        fVar.f141462d = null;
        this.f141471i = null;
    }

    @Override // androidx.recyclerview.widget.b2
    public final /* bridge */ /* synthetic */ boolean v(y2 y2Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void w(y2 y2Var) {
        H((k) y2Var);
        F();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void y(y2 y2Var) {
        Long G = G(((FrameLayout) ((k) y2Var).f19717a).getId());
        if (G != null) {
            I(G.longValue());
            this.f141470h.k(G.longValue());
        }
    }
}
