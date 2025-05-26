package com.google.android.material.textfield;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.z1;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import kt0.e0;
import ps0.r0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33216b;

    public /* synthetic */ a(Object obj, int i13) {
        this.f33215a = i13;
        this.f33216b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f33215a;
        Object obj = this.f33216b;
        switch (i13) {
            case 0:
                e eVar = (e) obj;
                EditText editText = eVar.f33226i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    eVar.q();
                    break;
                }
                break;
            case 1:
                HomeFeedFragment this$0 = (HomeFeedFragment) obj;
                int i14 = HomeFeedFragment.U1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ps0.c cVar = this$0.f45768x1;
                if (cVar != null) {
                    r0 r0Var = (r0) cVar;
                    ps0.e W3 = r0Var.W3();
                    if (W3 != null) {
                        ((HomeFeedFragment) W3).E8(0, false);
                    }
                    ps0.e W32 = r0Var.W3();
                    if (W32 != null) {
                        ((HomeFeedFragment) W32).u9();
                        break;
                    }
                }
                break;
            default:
                kt0.q this$02 = (kt0.q) obj;
                int i15 = kt0.q.R0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                e0 e0Var = this$02.H0;
                if (e0Var != null) {
                    kt0.t.d(e0Var.t3(), f1.TAP, u0.HOMEFEED_TUNER_BUTTON, g0.TAB_CAROUSEL, null, 24);
                }
                NavigationImpl w13 = Navigation.w1((ScreenLocation) z1.f51666c.getValue());
                w13.Y1("EXTRAS_KEY_IS_HOMEFEED_TUNER_IN_LOCAL_NAVIGATION", true);
                if (((Boolean) this$02.M0.getValue()).booleanValue() && this$02.L0) {
                    w13.Y1("EXTRAS_KEY_HOME_FEED_TUNER_IS_BOARD_TAB_INITIALLY_SELECTED", true);
                }
                Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
                this$02.M1(w13);
                break;
        }
    }
}
