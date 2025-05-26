package rh1;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.unifiedcomments.view.CommentsBottomSheetBehavior;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrh1/q0;", "Lrh1/h2;", "<init>", "()V", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class q0 extends z0 {
    public static final /* synthetic */ int B1 = 0;
    public View A1;

    /* renamed from: t1, reason: collision with root package name */
    public ConstraintLayout f108270t1;

    /* renamed from: u1, reason: collision with root package name */
    public boolean f108271u1;

    /* renamed from: v1, reason: collision with root package name */
    public final o0 f108272v1 = new o0(this);

    /* renamed from: w1, reason: collision with root package name */
    public final xk2.k f108273w1 = xk2.m.a(xk2.n.NONE, new n0(this, 1));

    /* renamed from: x1, reason: collision with root package name */
    public boolean f108274x1 = true;

    /* renamed from: y1, reason: collision with root package name */
    public int f108275y1 = -1;

    /* renamed from: z1, reason: collision with root package name */
    public final xk2.v f108276z1 = xk2.m.b(new n0(this, 2));

    public q0() {
        this.E = ob2.d.fragment_unified_comment_feed;
    }

    public static boolean m9() {
        return !hf0.b.q();
    }

    @Override // rh1.k, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        final int i13 = 0;
        onCreateView.setOnClickListener(new View.OnClickListener(this) { // from class: rh1.m0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f108252b;

            {
                this.f108252b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                q0 this$0 = this.f108252b;
                switch (i14) {
                    case 0:
                        int i15 = q0.B1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.V8();
                        this$0.d9();
                        ca2.e eVar = (ca2.e) this$0.f108273w1.getValue();
                        if (eVar != null) {
                            ca2.e.i(eVar, "background_tapped", 0.0f, null, 6);
                            break;
                        }
                        break;
                    default:
                        int i16 = q0.B1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.V8();
                        break;
                }
            }
        });
        View findViewById = onCreateView.findViewById(ob2.c.comments_feed);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        if (m9()) {
            constraintLayout.setBackgroundResource(fb0.b.full_height_comment_thread_modal_background);
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = -1;
        } else {
            ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CommentsBottomSheetBehavior commentsBottomSheetBehavior = new CommentsBottomSheetBehavior();
            commentsBottomSheetBehavior.S(0.55f);
            commentsBottomSheetBehavior.U(-1);
            ((androidx.coordinatorlayout.widget.c) layoutParams2).d(commentsBottomSheetBehavior);
        }
        constraintLayout.requestLayout();
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f108270t1 = constraintLayout;
        final int i14 = 1;
        ((LinearLayout) onCreateView.findViewById(ob2.c.comments_feed_linear_layout)).setOnClickListener(new View.OnClickListener(this) { // from class: rh1.m0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q0 f108252b;

            {
                this.f108252b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                q0 this$0 = this.f108252b;
                switch (i142) {
                    case 0:
                        int i15 = q0.B1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.V8();
                        this$0.d9();
                        ca2.e eVar = (ca2.e) this$0.f108273w1.getValue();
                        if (eVar != null) {
                            ca2.e.i(eVar, "background_tapped", 0.0f, null, 6);
                            break;
                        }
                        break;
                    default:
                        int i16 = q0.B1;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.V8();
                        break;
                }
            }
        });
        View findViewById2 = onCreateView.findViewById(ob2.c.pin_title_header_close_button);
        ((GestaltIconButton) findViewById2).u(new gh1.e(this, i14));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        View findViewById3 = onCreateView.findViewById(ob2.c.header_grabber);
        bs1.c.R1(findViewById3, !m9());
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        return onCreateView;
    }

    @Override // rh1.k, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ca2.e eVar = (ca2.e) this.f108273w1.getValue();
        if (eVar != null) {
            eVar.l();
        }
        f7().j(this.f108272v1);
        super.onDestroyView();
    }

    @Override // rh1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        View view = getView();
        if (view != null && (rootView = view.getRootView()) != null && (viewTreeObserver = rootView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.f108276z1.getValue());
        }
        super.onPause();
    }

    @Override // rh1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        super.onResume();
        View view = getView();
        if (view == null || (rootView = view.getRootView()) == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.f108276z1.getValue());
    }

    @Override // rh1.k, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        f7().h(this.f108272v1);
        FragmentActivity E4 = E4();
        if (E4 != null) {
            pk.a0.D(E4);
        }
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.f44857i = new a.z0(this, 23);
        }
        ca2.e eVar = (ca2.e) this.f108273w1.getValue();
        if (eVar != null) {
            ConstraintLayout constraintLayout = this.f108270t1;
            if (constraintLayout == null) {
                Intrinsics.r("commentFeedConstraintLayout");
                throw null;
            }
            eVar.m(constraintLayout);
            eVar.q(new p0(this, eVar));
            new Handler(Looper.getMainLooper()).postDelayed(new a11.p(19, this, eVar), 300L);
        }
        fo1.a i73 = i7();
        GestaltToolbarImpl gestaltToolbarImpl = i73 != null ? (GestaltToolbarImpl) i73 : null;
        if (gestaltToolbarImpl == null) {
            return;
        }
        gestaltToolbarImpl.setBackground(null);
    }
}
