package cp;

import a.l2;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.lifecycle.p1;
import com.pinterest.activity.conversation.view.PeopleFacetSearchBar;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kh2.j1;
import nx.d1;
import nx.f0;
import so.oa;
import so.s8;
import so.x8;
import x02.x2;

/* loaded from: classes.dex */
public class n extends nl1.d implements af2.c {

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f52942w0 = 0;
    public ye2.m X;
    public boolean Y;
    public volatile ye2.h Z;

    /* renamed from: e0, reason: collision with root package name */
    public PeopleFacetSearchBar f52947e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltSearchField f52948f0;

    /* renamed from: g0, reason: collision with root package name */
    public ListView f52949g0;

    /* renamed from: h0, reason: collision with root package name */
    public u20.d f52950h0;

    /* renamed from: i0, reason: collision with root package name */
    public androidx.appcompat.widget.x f52951i0;

    /* renamed from: j0, reason: collision with root package name */
    public no1.e f52952j0;

    /* renamed from: k0, reason: collision with root package name */
    public ap.o f52953k0;

    /* renamed from: l0, reason: collision with root package name */
    public m60.w f52954l0;

    /* renamed from: m0, reason: collision with root package name */
    public i92.k f52955m0;

    /* renamed from: n0, reason: collision with root package name */
    public lb0.q f52956n0;

    /* renamed from: o0, reason: collision with root package name */
    public dp.c f52957o0;

    /* renamed from: q0, reason: collision with root package name */
    public String f52959q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f52960r0;

    /* renamed from: s0, reason: collision with root package name */
    public String f52961s0;

    /* renamed from: u0, reason: collision with root package name */
    public GestaltButton f52963u0;

    /* renamed from: a0, reason: collision with root package name */
    public final Object f52943a0 = new Object();

    /* renamed from: b0, reason: collision with root package name */
    public boolean f52944b0 = false;

    /* renamed from: c0, reason: collision with root package name */
    public final l f52945c0 = new l();

    /* renamed from: d0, reason: collision with root package name */
    public final m f52946d0 = new m(this);

    /* renamed from: p0, reason: collision with root package name */
    public HashSet f52958p0 = new HashSet();

    /* renamed from: t0, reason: collision with root package name */
    public final l2 f52962t0 = new l2(this, 15);

    /* renamed from: v0, reason: collision with root package name */
    public final com.google.android.material.textfield.r f52964v0 = new com.google.android.material.textfield.r(this, 1);

    @Override // nl1.d
    public final void L7() {
        super.L7();
        hf0.b.k(this.f52948f0);
        hf0.b.k(this.f52947e0);
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        if (navigation != null) {
            this.f52960r0 = navigation.g2("com.pinterest.EXTRA_PIN_ID", "");
            this.f52961s0 = navigation.g2("com.pinterest.EXTRA_BOARD_ID", "");
        }
    }

    @Override // nl1.d
    public final void S7(fo1.a aVar) {
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) aVar;
        gestaltToolbarImpl.Y(xc0.i.new_message);
        gestaltToolbarImpl.b(xc0.f.view_new_message_toolbar_buttons);
        GestaltButton gestaltButton = (GestaltButton) gestaltToolbarImpl.findViewById(xc0.e.next_gestalt_btn);
        this.f52963u0 = gestaltButton;
        gestaltButton.e(new h(this, 0));
        Y7();
        gestaltToolbarImpl.m();
        gestaltToolbarImpl.E();
    }

    @Override // af2.c
    /* renamed from: V7, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.Z == null) {
            synchronized (this.f52943a0) {
                try {
                    if (this.Z == null) {
                        this.Z = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.Z;
    }

    public final void W7() {
        if (this.X == null) {
            this.X = new ye2.m(super.getContext(), this);
            this.Y = ue.c.x(super.getContext());
        }
    }

    public final void X7() {
        if (this.f52944b0) {
            return;
        }
        this.f52944b0 = true;
        x8 x8Var = (x8) ((o) generatedComponent());
        oa oaVar = x8Var.f114707a;
        this.f91283h = oaVar.Ec;
        this.f91284i = (x2) oaVar.f113800m3.get();
        this.f91285j = (f0) oaVar.f113747j2.get();
        this.f91286k = r70.b.f106349i.k0();
        this.f91287l = (hs1.q) oaVar.f113875q7.get();
        this.f91288m = (bz.i) oaVar.C9.get();
        this.f91289n = (lu1.d) oaVar.f113782l2.get();
        this.f91290o = (ac2.m) oaVar.C7.get();
        this.f91291p = (m60.e) oaVar.f113920t0.get();
        s8 s8Var = x8Var.f114708b;
        this.f91292q = (ku1.a) s8Var.f114402n.get();
        this.f91293r = s8Var.u6();
        this.f91294s = (ff0.f) s8Var.f114417o.get();
        this.f91295t = oaVar.T2();
        this.f91296u = (d1) oaVar.f113730i2.get();
        this.f91297v = (b60.b) oaVar.f113850p0.get();
        this.f91298w = (m60.w) oaVar.f113885r0.get();
        this.f91299x = (tb0.h) oaVar.f113797m0.get();
        this.f91300y = (uj2.q) oaVar.f113947u9.get();
        this.f91301z = (a80.a) oaVar.Wc.get();
        this.A = (z70.f) oaVar.f113764k2.get();
        this.f52950h0 = (u20.d) oaVar.Y5.get();
        this.f52951i0 = oaVar.C2();
        this.f52952j0 = s8Var.C5();
        this.f52953k0 = (ap.o) s8Var.I0.get();
        this.f52954l0 = (m60.w) oaVar.f113885r0.get();
        this.f52955m0 = (i92.k) oaVar.f113921t1.get();
        s8Var.q5();
        this.f52956n0 = (lb0.q) oaVar.O0.get();
    }

    public final void Y7() {
        GestaltButton gestaltButton;
        if (this.f52958p0 == null || (gestaltButton = this.f52963u0) == null) {
            return;
        }
        gestaltButton.d(new i(this, 0));
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.Y) {
            return null;
        }
        W7();
        return this.X;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getU0() {
        return a4.CONVERSATION_CREATE;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getT0() {
        return d4.CONVERSATION;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        W7();
        X7();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f52954l0.h(this.f52946d0);
        this.E = xc0.f.fragment_conversation_create;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f52954l0.j(this.f52946d0);
        this.f52957o0.b();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelableArrayList("com.pinterest.EXTRA_SELECTED_CONTACTS", new ArrayList<>(this.f52958p0));
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList parcelableArrayList;
        super.onViewCreated(view, bundle);
        this.f52947e0 = (PeopleFacetSearchBar) view.findViewById(xc0.e.people_facet_search_bar);
        this.f52948f0 = (GestaltSearchField) view.findViewById(xc0.e.people_facet_search_et);
        this.f52949g0 = (ListView) view.findViewById(xc0.e.people_list);
        Context context = view.getContext();
        this.f52948f0.a0(new xo.j(8));
        this.f52948f0.g0(new h(this, 1));
        view.findViewById(xc0.e.search_bar_list_divider).setVisibility(8);
        dp.c cVar = new dp.c(context, this.f52950h0, this.f52953k0);
        this.f52957o0 = cVar;
        this.f52949g0.setAdapter((ListAdapter) cVar);
        this.f52949g0.setOnItemClickListener(this.f52964v0);
        this.f52949g0.setOnScrollListener(this.f52945c0);
        if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("com.pinterest.EXTRA_SELECTED_CONTACTS")) != null) {
            HashSet hashSet = new HashSet(parcelableArrayList);
            this.f52958p0 = hashSet;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                TypeAheadItem typeAheadItem = (TypeAheadItem) it.next();
                this.f52947e0.a(typeAheadItem);
                this.f52957o0.k(typeAheadItem);
            }
            Y7();
        }
        this.f52948f0.postDelayed(new com.airbnb.lottie.k(this, 22), 400L);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.X;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        W7();
        X7();
    }
}
