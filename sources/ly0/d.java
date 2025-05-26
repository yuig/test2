package ly0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.pinterest.activity.nux.NUXActivity;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.r0;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lly0/d;", "Ljy0/b;", "Lyk1/k;", "<init>", "()V", "vo/i", "nux_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends b implements jy0.b {

    /* renamed from: j0, reason: collision with root package name */
    public FrameLayout f85117j0;

    /* renamed from: k0, reason: collision with root package name */
    public ProgressBar f85118k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltText f85119l0;

    /* renamed from: m0, reason: collision with root package name */
    public iy0.a f85120m0;

    /* renamed from: n0, reason: collision with root package name */
    public jy0.a f85121n0;

    /* renamed from: o0, reason: collision with root package name */
    public oc.c f85122o0;

    /* renamed from: p0, reason: collision with root package name */
    public r0 f85123p0;

    /* renamed from: q0, reason: collision with root package name */
    public final v f85124q0;

    /* renamed from: r0, reason: collision with root package name */
    public final a4 f85125r0;

    public d() {
        this.E = jv1.f.fragment_mod_nux_loading_step;
        this.f85124q0 = m.b(new au0.a(this, 17));
        this.f85125r0 = a4.ORIENTATION_LOADING_HOME_FEED;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Bundle arguments = getArguments();
        String[] stringArray = arguments != null ? arguments.getStringArray(NUXActivity.FOLLOWED_INTERESTS) : null;
        if (stringArray == null) {
            stringArray = new String[0];
        }
        r0 r0Var = this.f85123p0;
        if (r0Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        oc.c cVar = this.f85122o0;
        if (cVar != null) {
            return r0Var.a(stringArray, cVar);
        }
        Intrinsics.r("apolloClient");
        throw null;
    }

    public final void b8(String interestImageUrl, int i13, int i14) {
        int i15 = 1;
        int i16 = 0;
        Intrinsics.checkNotNullParameter(interestImageUrl, "interestImageUrl");
        ProgressBar progressBar = this.f85118k0;
        if (progressBar == null) {
            return;
        }
        progressBar.setMax(4500);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", progressBar.getProgress(), 4500);
        ofInt.addListener(new c(this, i16));
        ofInt.setDuration(4500);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
        FrameLayout frameLayout = this.f85117j0;
        if (frameLayout != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            h hVar = new h(i13, i14, requireContext, interestImageUrl);
            hVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            hVar.setClipChildren(false);
            hVar.setClipToPadding(false);
            frameLayout.addView(hVar);
        }
        GestaltText gestaltText = this.f85119l0;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gestaltText, (Property<GestaltText, Float>) property, 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new LinearInterpolator());
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f85119l0, (Property<GestaltText, Float>) property, 0.0f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(new LinearInterpolator());
        Intrinsics.checkNotNullExpressionValue(ofFloat2, "apply(...)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(2600L);
        animatorSet.addListener(new c(this, i15));
        animatorSet.play(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.start();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF85125r0() {
        return this.f85125r0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF22560r0() {
        d4 viewType;
        iy0.a aVar = this.f85120m0;
        return (aVar == null || (viewType = aVar.getViewType()) == null) ? d4.UNKNOWN_VIEW : viewType;
    }

    @Override // ly0.b, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ComponentCallbacks2 k03 = bs1.c.k0(context);
        if (k03 instanceof iy0.a) {
            this.f85120m0 = (iy0.a) k03;
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        this.f85118k0 = (ProgressBar) onCreateView.findViewById(jv1.d.mod_nux_loading_step_progress_bar);
        this.f85117j0 = (FrameLayout) onCreateView.findViewById(jv1.d.mod_nux_loading_step_animated_grid_container);
        this.f85119l0 = (GestaltText) onCreateView.findViewById(jv1.d.mod_nux_loading_step_title);
        return onCreateView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f85118k0 = null;
        this.f85117j0 = null;
        this.f85119l0 = null;
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f85120m0 = null;
        this.f85121n0 = null;
        super.onDetach();
    }
}
