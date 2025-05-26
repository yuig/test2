package v21;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.m1;
import com.pinterest.navigation.Navigation;
import h32.d4;
import java.util.List;
import kh2.a1;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv21/j;", "Lnl1/d;", "<init>", "()V", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class j extends a {

    /* renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ int f123883e0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f123884c0;

    /* renamed from: d0, reason: collision with root package name */
    public final d4 f123885d0;

    public j() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(16, new kl0.w(this, 16)));
        this.f123884c0 = a1.s(this, k0.f80436a.b(c0.class), new ml0.v(a13, 16), new kl0.x(null, a13, 17), new kl0.y(this, a13, 17));
        this.f123885d0 = d4.PIN_OR_SPIN_REVEAL_REWARD;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        ((l82.c) ((c0) this.f123884c0.getValue()).c()).a(d.f123872a);
        return true;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.f123885d0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        u50.r c13 = ((c0) this.f123884c0.getValue()).c();
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_PIN_OR_SPIN") : null;
        String str = v03 == null ? "" : v03;
        Navigation navigation2 = this.I;
        String v04 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_PIN_OR_SPIN_REWARD_PREVIEW_TITLE") : null;
        String str2 = v04 == null ? "" : v04;
        Navigation navigation3 = this.I;
        String v05 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_PIN_OR_SPIN_REWARD_PREVIEW_SUBTITLE") : null;
        String str3 = v05 == null ? "" : v05;
        Navigation navigation4 = this.I;
        List M = navigation4 != null ? navigation4.M("com.pinterest.EXTRA_PIN_OR_SPIN_IMAGE_URL_LIST") : null;
        if (M == null) {
            M = q0.f80391a;
        }
        List list = M;
        Navigation navigation5 = this.I;
        List M2 = navigation5 != null ? navigation5.M("com.pinterest.EXTRA_PIN_OR_SPIN_ID_LIST") : null;
        if (M2 == null) {
            M2 = q0.f80391a;
        }
        ((l82.c) c13).a(new e(str, str2, str3, list, M2));
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(6, requireContext, (AttributeSet) null);
        i iVar = new i(this, 2);
        Object obj = q2.i.f102113a;
        composeView.o(new q2.h(iVar, true, -558402842));
        return composeView;
    }
}
