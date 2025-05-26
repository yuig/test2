package rh1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrh1/e2;", "Lnl1/d;", "<init>", "()V", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e2 extends e1 {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f108139f0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f108140c0 = d4.COMMENT_COMPOSER;

    /* renamed from: d0, reason: collision with root package name */
    public View f108141d0;

    /* renamed from: e0, reason: collision with root package name */
    public ca2.e f108142e0;

    public e2() {
        this.E = db0.d.fragment_push_notification_reminder;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getW0() {
        return this.f108140c0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(db0.c.background_overlay);
        bs1.c.U1(findViewById);
        final int i13 = 0;
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: rh1.d2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e2 f108134b;

            {
                this.f108134b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                e2 this$0 = this.f108134b;
                switch (i14) {
                    case 0:
                        int i15 = e2.f108139f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        nx.t0.b(this$0.t7(), this$0.generateLoggingContext(), h32.f1.COMMENT_PUSH_NOTIFICATION_NUDGE_DISMISSED, null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                        this$0.P7();
                        return;
                    case 1:
                        int i16 = e2.f108139f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        nx.t0.b(this$0.t7(), this$0.generateLoggingContext(), h32.f1.COMMENT_PUSH_NOTIFICATION_NUDGE_ACCEPTED, null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                        View view2 = this$0.f108141d0;
                        if (view2 == null) {
                            Intrinsics.r("backgroundOverlay");
                            throw null;
                        }
                        bs1.c.X0(view2);
                        Intent intent = new Intent();
                        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                        Context context = this$0.getContext();
                        if (context != null) {
                            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                        }
                        this$0.T.a(intent);
                        this$0.P7();
                        return;
                    default:
                        int i17 = e2.f108139f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        nx.t0.b(this$0.t7(), this$0.generateLoggingContext(), h32.f1.COMMENT_PUSH_NOTIFICATION_NUDGE_DISMISSED, null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                        this$0.P7();
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f108141d0 = findViewById;
        View findViewById2 = onCreateView.findViewById(db0.c.container);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById2;
        Context requireContext = requireContext();
        int i14 = db0.b.rounded_top_rect_radius_32;
        Object obj = d5.a.f53679a;
        constraintLayout.setBackground(requireContext.getDrawable(i14));
        ca2.e eVar = new ca2.e(true, null, 0, 0, null, 0, null, new bh.b(s7(), new ee1.d(this, 20)), false, false, 894);
        this.f108142e0 = eVar;
        eVar.m(constraintLayout);
        ca2.e eVar2 = this.f108142e0;
        if (eVar2 == null) {
            Intrinsics.r("bottomSheetController");
            throw null;
        }
        eVar2.r();
        ca2.e eVar3 = this.f108142e0;
        if (eVar3 == null) {
            Intrinsics.r("bottomSheetController");
            throw null;
        }
        eVar3.n(constraintLayout.getResources().getDimensionPixelOffset(db0.a.nudge_comment_notification_half_sheet_default_height));
        BottomSheetBehavior J2 = BottomSheetBehavior.J(constraintLayout);
        Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] androidx.constraintlayout.widget.ConstraintLayout?>");
        LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
        lockableBottomSheetBehavior.g0();
        lockableBottomSheetBehavior.V(getResources().getDimensionPixelOffset(db0.a.nudge_comment_notification_half_sheet_default_height));
        constraintLayout.requestLayout();
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        View findViewById3 = onCreateView.findViewById(db0.c.primary_button);
        final int i15 = 1;
        ((GestaltButton) findViewById3).setOnClickListener(new View.OnClickListener(this) { // from class: rh1.d2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e2 f108134b;

            {
                this.f108134b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i15;
                e2 this$0 = this.f108134b;
                switch (i142) {
                    case 0:
                        int i152 = e2.f108139f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        nx.t0.b(this$0.t7(), this$0.generateLoggingContext(), h32.f1.COMMENT_PUSH_NOTIFICATION_NUDGE_DISMISSED, null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                        this$0.P7();
                        return;
                    case 1:
                        int i16 = e2.f108139f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        nx.t0.b(this$0.t7(), this$0.generateLoggingContext(), h32.f1.COMMENT_PUSH_NOTIFICATION_NUDGE_ACCEPTED, null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                        View view2 = this$0.f108141d0;
                        if (view2 == null) {
                            Intrinsics.r("backgroundOverlay");
                            throw null;
                        }
                        bs1.c.X0(view2);
                        Intent intent = new Intent();
                        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                        Context context = this$0.getContext();
                        if (context != null) {
                            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                        }
                        this$0.T.a(intent);
                        this$0.P7();
                        return;
                    default:
                        int i17 = e2.f108139f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        nx.t0.b(this$0.t7(), this$0.generateLoggingContext(), h32.f1.COMMENT_PUSH_NOTIFICATION_NUDGE_DISMISSED, null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                        this$0.P7();
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        View findViewById4 = onCreateView.findViewById(db0.c.secondary_button);
        final int i16 = 2;
        ((GestaltButton) findViewById4).setOnClickListener(new View.OnClickListener(this) { // from class: rh1.d2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e2 f108134b;

            {
                this.f108134b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i16;
                e2 this$0 = this.f108134b;
                switch (i142) {
                    case 0:
                        int i152 = e2.f108139f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        nx.t0.b(this$0.t7(), this$0.generateLoggingContext(), h32.f1.COMMENT_PUSH_NOTIFICATION_NUDGE_DISMISSED, null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                        this$0.P7();
                        return;
                    case 1:
                        int i162 = e2.f108139f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        nx.t0.b(this$0.t7(), this$0.generateLoggingContext(), h32.f1.COMMENT_PUSH_NOTIFICATION_NUDGE_ACCEPTED, null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                        View view2 = this$0.f108141d0;
                        if (view2 == null) {
                            Intrinsics.r("backgroundOverlay");
                            throw null;
                        }
                        bs1.c.X0(view2);
                        Intent intent = new Intent();
                        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                        Context context = this$0.getContext();
                        if (context != null) {
                            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                        }
                        this$0.T.a(intent);
                        this$0.P7();
                        return;
                    default:
                        int i17 = e2.f108139f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        nx.t0.b(this$0.t7(), this$0.generateLoggingContext(), h32.f1.COMMENT_PUSH_NOTIFICATION_NUDGE_DISMISSED, null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                        this$0.P7();
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        nx.t0.b(t7(), generateLoggingContext(), h32.f1.COMMENT_PUSH_NOTIFICATION_NUDGE_VIEWED, null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ca2.e eVar = this.f108142e0;
        if (eVar == null) {
            Intrinsics.r("bottomSheetController");
            throw null;
        }
        eVar.l();
        super.onDestroyView();
    }
}
