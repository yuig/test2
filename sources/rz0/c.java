package rz0;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.imageview.WebImageView;
import h32.a4;
import h32.d4;
import kh2.b0;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import om1.l;
import so.m1;
import yk1.m;
import yq0.a0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrz0/c;", "Lyq0/b0;", "Lyq0/a0;", "Lrz0/e;", "<init>", "()V", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends a<a0> implements e {
    public static final /* synthetic */ int G0 = 0;
    public m1 A0;
    public e01.a B0;
    public WebImageView C0;
    public g01.a D0;
    public final d4 E0 = d4.PEAR_INSIGHT;
    public final a4 F0;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f110238z0;

    public c() {
        this.F0 = com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_IS_INSIGHT_ON_OWN_BOARD", false) ? a4.PEAR_INSIGHT_SELF : a4.PEAR_INSIGHT_OTHERS;
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new au0.a(this, 21));
    }

    @Override // yk1.k
    public final m V7() {
        m1 m1Var = this.A0;
        if (m1Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_INSIGHT_ID", "");
        uk1.e eVar = this.f110238z0;
        if (eVar != null) {
            return m1Var.a(((uk1.a) eVar).f(s7(), ""), Z);
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getH0() {
        return this.F0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getG0() {
        return this.E0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(iy1.e.fragment_pear_related_styles, iy1.d.p_recycler_view);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.D0 = new g01.a(requireActivity);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        g01.a aVar = this.D0;
        if (aVar == null) {
            Intrinsics.r("fullBleedHelper");
            throw null;
        }
        aVar.f();
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        g01.a aVar = this.D0;
        if (aVar != null) {
            aVar.g();
        } else {
            Intrinsics.r("fullBleedHelper");
            throw null;
        }
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        View findViewById = v13.findViewById(iy1.d.cover_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.C0 = (WebImageView) findViewById;
        super.onViewCreated(v13, bundle);
        int f13 = hf0.b.f();
        GestaltIconButton gestaltIconButton = (GestaltIconButton) v13.findViewById(iy1.d.back_button);
        Intrinsics.f(gestaltIconButton);
        ViewGroup.LayoutParams layoutParams = gestaltIconButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin += f13;
        gestaltIconButton.setLayoutParams(marginLayoutParams);
        final int i13 = 0;
        gestaltIconButton.u(new gm1.a(this) { // from class: rz0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f110237b;

            {
                this.f110237b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                View D;
                Bitmap R1;
                int i14 = i13;
                c this$0 = this.f110237b;
                switch (i14) {
                    case 0:
                        int i15 = c.G0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.P7();
                            return;
                        }
                        return;
                    default:
                        int i16 = c.G0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.f7().d(new of0.a(new mf0.l()));
                            e01.a aVar = this$0.B0;
                            if (aVar == null) {
                                Intrinsics.r("shareUtil");
                                throw null;
                            }
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            RecyclerView g83 = this$0.g8();
                            l2 l2Var = g83 != null ? g83.f19242n : null;
                            LinearLayoutManager linearLayoutManager = l2Var instanceof LinearLayoutManager ? (LinearLayoutManager) l2Var : null;
                            if (linearLayoutManager == null || (D = linearLayoutManager.D(0)) == null) {
                                R1 = null;
                            } else {
                                View[] viewArr = new View[2];
                                WebImageView webImageView = this$0.C0;
                                if (webImageView == null) {
                                    Intrinsics.r("coverImageView");
                                    throw null;
                                }
                                viewArr[0] = webImageView;
                                viewArr[1] = D;
                                R1 = b0.R1(f0.j(viewArr));
                            }
                            aVar.b(requireContext, R1);
                            ep.b.C(null, this$0.f7());
                            return;
                        }
                        return;
                }
            }
        });
        GestaltIconButton gestaltIconButton2 = (GestaltIconButton) v13.findViewById(iy1.d.share_button);
        Intrinsics.f(gestaltIconButton2);
        ViewGroup.LayoutParams layoutParams2 = gestaltIconButton2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin += f13;
        gestaltIconButton2.setLayoutParams(marginLayoutParams2);
        final int i14 = 1;
        gestaltIconButton2.u(new gm1.a(this) { // from class: rz0.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f110237b;

            {
                this.f110237b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                View D;
                Bitmap R1;
                int i142 = i14;
                c this$0 = this.f110237b;
                switch (i142) {
                    case 0:
                        int i15 = c.G0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.P7();
                            return;
                        }
                        return;
                    default:
                        int i16 = c.G0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof l) {
                            this$0.f7().d(new of0.a(new mf0.l()));
                            e01.a aVar = this$0.B0;
                            if (aVar == null) {
                                Intrinsics.r("shareUtil");
                                throw null;
                            }
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            RecyclerView g83 = this$0.g8();
                            l2 l2Var = g83 != null ? g83.f19242n : null;
                            LinearLayoutManager linearLayoutManager = l2Var instanceof LinearLayoutManager ? (LinearLayoutManager) l2Var : null;
                            if (linearLayoutManager == null || (D = linearLayoutManager.D(0)) == null) {
                                R1 = null;
                            } else {
                                View[] viewArr = new View[2];
                                WebImageView webImageView = this$0.C0;
                                if (webImageView == null) {
                                    Intrinsics.r("coverImageView");
                                    throw null;
                                }
                                viewArr[0] = webImageView;
                                viewArr[1] = D;
                                R1 = b0.R1(f0.j(viewArr));
                            }
                            aVar.b(requireContext, R1);
                            ep.b.C(null, this$0.f7());
                            return;
                        }
                        return;
                }
            }
        });
    }
}
