package bd2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.widget.configuration.h;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xc2.e;
import xc2.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbd2/c;", "Lcom/pinterest/widget/configuration/a;", "<init>", "()V", "widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f22729f0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public h f22730d0;

    /* renamed from: e0, reason: collision with root package name */
    public final d4 f22731e0 = d4.ANDROID_WIDGET;

    @Override // com.pinterest.widget.configuration.a, nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getX() {
        return this.f22731e0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final int i13 = 0;
        View inflate = inflater.inflate(f.sheet_widget_refresh_configuration, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(e.bottom_sheet_view);
        Intrinsics.f(constraintLayout);
        BottomSheetBehavior J2 = BottomSheetBehavior.J(constraintLayout);
        Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] androidx.constraintlayout.widget.ConstraintLayout?>");
        LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
        lockableBottomSheetBehavior.f44543h0 = false;
        lockableBottomSheetBehavior.W(getResources().getDimensionPixelOffset(xc2.d.refresh_pins_sheet_height));
        constraintLayout.requestLayout();
        ((GestaltText) constraintLayout.findViewById(e.refresh_hourly)).j(new gm1.a(this) { // from class: bd2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f22728b;

            {
                this.f22728b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                c this$0 = this.f22728b;
                switch (i14) {
                    case 0:
                        int i15 = c.f22729f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            h hVar = this$0.f22730d0;
                            if (hVar == null) {
                                Intrinsics.r("widgetConfigurationDataSource");
                                throw null;
                            }
                            hVar.a(this$0.V7(), 3600000L);
                            FragmentActivity E4 = this$0.E4();
                            if (E4 != null) {
                                E4.onBackPressed();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i16 = c.f22729f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            h hVar2 = this$0.f22730d0;
                            if (hVar2 == null) {
                                Intrinsics.r("widgetConfigurationDataSource");
                                throw null;
                            }
                            hVar2.a(this$0.V7(), 86400000L);
                            FragmentActivity E42 = this$0.E4();
                            if (E42 != null) {
                                E42.onBackPressed();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        final int i14 = 1;
        ((GestaltText) constraintLayout.findViewById(e.refresh_daily)).j(new gm1.a(this) { // from class: bd2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f22728b;

            {
                this.f22728b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                c this$0 = this.f22728b;
                switch (i142) {
                    case 0:
                        int i15 = c.f22729f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            h hVar = this$0.f22730d0;
                            if (hVar == null) {
                                Intrinsics.r("widgetConfigurationDataSource");
                                throw null;
                            }
                            hVar.a(this$0.V7(), 3600000L);
                            FragmentActivity E4 = this$0.E4();
                            if (E4 != null) {
                                E4.onBackPressed();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i16 = c.f22729f0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof rn1.f) {
                            h hVar2 = this$0.f22730d0;
                            if (hVar2 == null) {
                                Intrinsics.r("widgetConfigurationDataSource");
                                throw null;
                            }
                            hVar2.a(this$0.V7(), 86400000L);
                            FragmentActivity E42 = this$0.E4();
                            if (E42 != null) {
                                E42.onBackPressed();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
        return inflate;
    }
}
