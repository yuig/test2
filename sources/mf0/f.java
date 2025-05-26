package mf0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.p1;
import com.pinterest.design.progress.SmallLoadingView;
import com.pinterest.dialog.view.DialogTitleView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import h32.a4;
import h32.d4;
import h32.i0;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import nx.j0;
import pk.a0;
import so.x8;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lmf0/f;", "Landroidx/fragment/app/q;", "Lnx/a;", "Luk1/c;", "<init>", "()V", "e82/g0", "mf0/b", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class f extends androidx.fragment.app.q implements nx.a, uk1.c, af2.c {

    /* renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f87095b0 = 0;
    public View A;
    public DialogTitleView B;
    public FrameLayout C;
    public GestaltDivider D;
    public GestaltButton E;
    public GestaltButton F;
    public View G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f87096J;
    public int K;
    public final int L;
    public CharSequence M;
    public CharSequence N;
    public Spanned O;
    public View P;
    public int Q;
    public String R;
    public View.OnClickListener S;
    public String T;
    public View.OnClickListener U;
    public ListAdapter V;
    public AdapterView.OnItemClickListener W;
    public final boolean X;
    public j0 Y;
    public f0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final d4 f87097a0;

    /* renamed from: q, reason: collision with root package name */
    public ye2.m f87098q;

    /* renamed from: r, reason: collision with root package name */
    public volatile ye2.h f87099r;

    /* renamed from: w, reason: collision with root package name */
    public int f87104w;

    /* renamed from: s, reason: collision with root package name */
    public final Object f87100s = new Object();

    /* renamed from: t, reason: collision with root package name */
    public boolean f87101t = false;

    /* renamed from: u, reason: collision with root package name */
    public String f87102u = "task_dialog";

    /* renamed from: v, reason: collision with root package name */
    public final int f87103v = o.dialog_pinterest;

    /* renamed from: x, reason: collision with root package name */
    public HashSet f87105x = new HashSet();

    /* renamed from: y, reason: collision with root package name */
    public HashSet f87106y = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public HashSet f87107z = new HashSet();

    public f() {
        hashCode();
        this.H = -1;
        this.I = -1;
        this.f87096J = -1;
        this.K = -1;
        this.L = -1;
        this.X = true;
        this.f87097a0 = d4.ERROR;
        this.f18411g = true;
        Dialog dialog = this.f18416l;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.q
    public Dialog O6(Bundle bundle) {
        return new c(this, requireContext(), this.f18410f);
    }

    public final void T6(b onDismissListener) {
        Intrinsics.checkNotNullParameter(onDismissListener, "onDismissListener");
        HashSet hashSet = this.f87106y;
        if (hashSet != null) {
            hashSet.add(onDismissListener);
        }
    }

    @Override // af2.c
    /* renamed from: U6, reason: merged with bridge method [inline-methods] */
    public final ye2.h componentManager() {
        if (this.f87099r == null) {
            synchronized (this.f87100s) {
                try {
                    if (this.f87099r == null) {
                        this.f87099r = new ye2.h(this);
                    }
                } finally {
                }
            }
        }
        return this.f87099r;
    }

    public final int V6() {
        return getResources().getDimensionPixelSize(m.dialog_width);
    }

    /* renamed from: W6, reason: from getter */
    public final boolean getX() {
        return this.X;
    }

    public final void X6() {
        int i13 = this.H;
        if (i13 != -1) {
            String string = getString(i13);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            h7(string);
        }
        int i14 = this.I;
        if (i14 != -1) {
            d7(getString(i14));
        }
        int i15 = this.L;
        if (i15 != -1) {
            g7(getString(i15));
        }
        int i16 = this.K;
        if (i16 != -1) {
            String string2 = getString(i16);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            f7(string2);
        }
        int i17 = this.f87096J;
        if (i17 != -1) {
            String string3 = getString(i17);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            e7(string3);
        }
    }

    public void Y6() {
        if (this.f87101t) {
            return;
        }
        this.f87101t = true;
        x8 x8Var = (x8) ((g) generatedComponent());
        this.Z = (f0) x8Var.f114707a.f113747j2.get();
    }

    public void Z6(LayoutInflater inflater) {
        GestaltText gestaltText;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(this.f87103v, (ViewGroup) null);
        this.A = inflate;
        this.B = inflate != null ? (DialogTitleView) inflate.findViewById(n.dialog_header) : null;
        View view = this.A;
        this.C = view != null ? (FrameLayout) view.findViewById(n.dialog_content_container) : null;
        View view2 = this.A;
        this.D = view2 != null ? (GestaltDivider) view2.findViewById(n.button_bar_divider) : null;
        View view3 = this.A;
        this.G = view3 != null ? view3.findViewById(n.button_divider) : null;
        View view4 = this.A;
        this.E = view4 != null ? (GestaltButton) view4.findViewById(n.positive_bt) : null;
        View view5 = this.A;
        this.F = view5 != null ? (GestaltButton) view5.findViewById(n.negative_bt) : null;
        X6();
        o7();
        n7();
        DialogTitleView dialogTitleView = this.B;
        if (dialogTitleView != null && (gestaltText = dialogTitleView.f44948c) != null) {
            gestaltText.i(e.f87094i);
        }
        if (this.O != null) {
            k7();
        } else if (this.P != null) {
            i7();
        } else if (this.V != null) {
            j7();
        }
        m7();
        l7();
    }

    public final void a7(int i13) {
        GestaltDivider gestaltDivider = this.D;
        if (gestaltDivider == null) {
            return;
        }
        if (i13 == 0) {
            j1.W1(gestaltDivider);
            return;
        }
        if (i13 == 4) {
            Intrinsics.checkNotNullParameter(gestaltDivider, "<this>");
            gestaltDivider.a(jm1.d.f77028k);
        } else {
            if (i13 != 8) {
                return;
            }
            j1.A0(gestaltDivider);
        }
    }

    public void b7() {
    }

    public final void c7(View view, int i13) {
        View view2;
        this.P = view;
        if (view != null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        }
        Context context = getContext();
        if (context != null && (view2 = this.P) != null) {
            view2.setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        }
        this.Q = i13;
        i7();
    }

    public void d7(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.O = Html.fromHtml(str);
        k7();
    }

    public final void e7(String str) {
        this.T = str;
        l7();
    }

    public final void f7(String str) {
        this.R = str;
        m7();
    }

    public final void g7(CharSequence charSequence) {
        this.N = charSequence;
        n7();
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(getF139918x0(), null, null, null, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            return E4;
        }
        FrameLayout frameLayout = this.C;
        if (frameLayout != null) {
            return frameLayout.getContext();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.k
    public final p1 getDefaultViewModelProviderFactory() {
        return kh2.j1.g0(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getH0() {
        return null;
    }

    @Override // uk1.c
    /* renamed from: getViewType, reason: from getter */
    public d4 getF139918x0() {
        return this.f87097a0;
    }

    public void h7(CharSequence title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.M = title;
        o7();
    }

    public final void i7() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.C;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
        }
        FrameLayout frameLayout3 = this.C;
        if (frameLayout3 != null) {
            int i13 = this.Q;
            frameLayout3.setPaddingRelative(i13, i13, i13, i13);
        }
        View view = this.P;
        if ((view != null ? view.getParent() : null) != null || (frameLayout = this.C) == null) {
            return;
        }
        frameLayout.addView(this.P);
    }

    public final void j7() {
        FrameLayout frameLayout = this.C;
        if (frameLayout != null) {
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.thumbnail_small_size);
            FrameLayout frameLayout2 = this.C;
            View smallLoadingView = new SmallLoadingView(frameLayout2 != null ? frameLayout2.getContext() : null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.gravity = 17;
            com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            smallLoadingView.setLayoutParams(layoutParams);
            FrameLayout frameLayout3 = this.C;
            View inflate = LayoutInflater.from(frameLayout3 != null ? frameLayout3.getContext() : null).inflate(o.view_listview, (ViewGroup) this.C, false);
            Intrinsics.g(inflate, "null cannot be cast to non-null type android.widget.ListView");
            ListView listView = (ListView) inflate;
            listView.setDividerHeight(0);
            listView.setEmptyView(smallLoadingView);
            listView.setAdapter(this.V);
            listView.setOnItemClickListener(this.W);
            c7(listView, 0);
            FrameLayout frameLayout4 = this.C;
            if (frameLayout4 != null) {
                frameLayout4.addView(smallLoadingView);
            }
        }
    }

    public final void k7() {
        View view = this.A;
        if (view != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
            gestaltText.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            gestaltText.i(new d(this, 0));
            c7(gestaltText, this.f87104w);
            a0.h1(gestaltText, eo1.a.space_100);
        }
    }

    public final void l7() {
        yl1.b h10;
        yl1.b h13;
        View view;
        yl1.b h14;
        fm1.c cVar = null;
        int i13 = 0;
        if (j1.d1(this.T)) {
            GestaltButton gestaltButton = this.F;
            if (gestaltButton != null) {
                gestaltButton.d(new d(this, 1));
            }
            GestaltButton gestaltButton2 = this.F;
            if (gestaltButton2 != null) {
                gestaltButton2.e(new a(this, i13));
            }
            GestaltButton gestaltButton3 = this.E;
            if (((gestaltButton3 == null || (h14 = gestaltButton3.h()) == null) ? null : h14.f139302c) == fm1.c.VISIBLE && (view = this.G) != null) {
                view.setVisibility(0);
            }
        } else {
            GestaltButton gestaltButton4 = this.F;
            if (gestaltButton4 != null) {
                a0.l0(gestaltButton4);
            }
            View view2 = this.G;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        GestaltButton gestaltButton5 = this.E;
        fm1.c cVar2 = (gestaltButton5 == null || (h13 = gestaltButton5.h()) == null) ? null : h13.f139302c;
        fm1.c cVar3 = fm1.c.VISIBLE;
        if (cVar2 != cVar3) {
            GestaltButton gestaltButton6 = this.F;
            if (gestaltButton6 != null && (h10 = gestaltButton6.h()) != null) {
                cVar = h10.f139302c;
            }
            if (cVar != cVar3) {
                a7(8);
                return;
            }
        }
        a7(0);
    }

    public final void m7() {
        yl1.b h10;
        yl1.b h13;
        View view;
        yl1.b h14;
        fm1.c cVar = null;
        if (j1.d1(this.R)) {
            GestaltButton gestaltButton = this.E;
            if (gestaltButton != null) {
                gestaltButton.d(new d(this, 2));
            }
            GestaltButton gestaltButton2 = this.E;
            if (gestaltButton2 != null) {
                gestaltButton2.e(new a(this, 1));
            }
            GestaltButton gestaltButton3 = this.F;
            if (((gestaltButton3 == null || (h14 = gestaltButton3.h()) == null) ? null : h14.f139302c) == fm1.c.VISIBLE && (view = this.G) != null) {
                view.setVisibility(0);
            }
        } else {
            GestaltButton gestaltButton4 = this.E;
            if (gestaltButton4 != null) {
                a0.l0(gestaltButton4);
            }
            View view2 = this.G;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        GestaltButton gestaltButton5 = this.E;
        fm1.c cVar2 = (gestaltButton5 == null || (h13 = gestaltButton5.h()) == null) ? null : h13.f139302c;
        fm1.c cVar3 = fm1.c.VISIBLE;
        if (cVar2 != cVar3) {
            GestaltButton gestaltButton6 = this.F;
            if (gestaltButton6 != null && (h10 = gestaltButton6.h()) != null) {
                cVar = h10.f139302c;
            }
            if (cVar != cVar3) {
                a7(8);
                return;
            }
        }
        a7(0);
    }

    public final void n7() {
        GestaltText gestaltText;
        GestaltText gestaltText2;
        CharSequence charSequence = this.N;
        if (charSequence == null || charSequence.length() == 0) {
            DialogTitleView dialogTitleView = this.B;
            if (dialogTitleView == null || (gestaltText = dialogTitleView.f44947b) == null) {
                return;
            }
            a0.k0(gestaltText);
            return;
        }
        DialogTitleView dialogTitleView2 = this.B;
        if (dialogTitleView2 == null || (gestaltText2 = dialogTitleView2.f44947b) == null) {
            return;
        }
        gestaltText2.i(new d(this, 3));
    }

    public final void o7() {
        GestaltText gestaltText;
        CharSequence charSequence = this.M;
        if (charSequence == null || charSequence.length() == 0) {
            DialogTitleView dialogTitleView = this.B;
            if (dialogTitleView == null) {
                return;
            }
            dialogTitleView.setVisibility(8);
            return;
        }
        DialogTitleView dialogTitleView2 = this.B;
        if (dialogTitleView2 != null && (gestaltText = dialogTitleView2.f44946a) != null) {
            a0.p(gestaltText, String.valueOf(this.M));
        }
        DialogTitleView dialogTitleView3 = this.B;
        if (dialogTitleView3 == null) {
            return;
        }
        dialogTitleView3.setVisibility(0);
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (this.f87098q == null) {
            this.f87098q = new ye2.m(super.getContext(), this);
            ue.c.x(super.getContext());
        }
        Y6();
        X6();
    }

    @Override // androidx.fragment.app.q, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        HashSet hashSet = this.f87107z;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            if (it.hasNext()) {
                ep.b.A(it.next());
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q6(2, q.Theme_Pinterest_Dialog);
        f0 f0Var = this.Z;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        this.Y = ((nx.m) f0Var).a(this);
        this.f87104w = getResources().getDimensionPixelSize(m.dialog_padding_default);
        if (this.Y != null) {
            return;
        }
        Intrinsics.r("pinalytics");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(this.f87103v, (ViewGroup) null);
        Z6(inflater);
        View view = this.A;
        if (view != null) {
            return view;
        }
        Intrinsics.f(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.W = null;
        this.U = null;
        this.f87106y = null;
        this.f87107z = null;
        this.f87105x = null;
        this.S = null;
        j0 j0Var = this.Y;
        if (j0Var == null) {
            Intrinsics.r("pinalytics");
            throw null;
        }
        j0Var.onDestroy();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.G = null;
        this.E = null;
        this.F = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.q, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        HashSet hashSet = this.f87106y;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onDismiss();
            }
        }
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new ye2.m(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (hf0.b.q()) {
            Dialog dialog = this.f18416l;
            Window window = dialog != null ? dialog.getWindow() : null;
            WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
            if (attributes != null) {
                attributes.width = V6();
            }
            if (window != null) {
                window.setAttributes(attributes);
            }
        }
        HashSet hashSet = this.f87105x;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            if (it.hasNext()) {
                ep.b.A(it.next());
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ye2.m mVar = this.f87098q;
        d7.b.q(mVar == null || ye2.h.b(mVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if (this.f87098q == null) {
            this.f87098q = new ye2.m(super.getContext(), this);
            ue.c.x(super.getContext());
        }
        Y6();
    }
}
