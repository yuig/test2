package lt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import com.google.android.libraries.ads.mobile.sdk.nativead.MediaView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import mq.e0;
import mq.f0;
import mq.g0;
import ps.p;
import ps.q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llt/d;", "Lnl1/d;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends n {

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ int f84734m0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f84735c0;

    /* renamed from: d0, reason: collision with root package name */
    public lh0.g f84736d0;

    /* renamed from: e0, reason: collision with root package name */
    public NativeAdView f84737e0;

    /* renamed from: f0, reason: collision with root package name */
    public MediaView f84738f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltIconButton f84739g0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltAvatar f84740h0;

    /* renamed from: i0, reason: collision with root package name */
    public GestaltText f84741i0;

    /* renamed from: j0, reason: collision with root package name */
    public GestaltText f84742j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltText f84743k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltText f84744l0;

    public d() {
        int i13 = 4;
        xk2.k q13 = jq.b.q(4, new q1(this, 5), xk2.n.NONE);
        this.f84735c0 = a1.s(this, k0.f80436a.b(m.class), new e0(q13, i13), new f0(null, q13, i13), new g0(this, q13, i13));
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF0() {
        return d4.ONE_TAP_V3_BROWSER;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Navigation navigation = this.I;
        if (navigation == null) {
            throw new IllegalArgumentException("Null navigation in PinCloseupFragment");
        }
        String f49940b = navigation.getF49940b();
        Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
        ((m) this.f84735c0.getValue()).h(f49940b);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = LayoutInflater.from(requireContext()).inflate(q.ads_gma_closeup_fragment, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(p.native_ad_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f84737e0 = (NativeAdView) findViewById;
        View findViewById2 = v13.findViewById(p.ad_media);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f84738f0 = (MediaView) findViewById2;
        View findViewById3 = v13.findViewById(p.closeup_back_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f84739g0 = (GestaltIconButton) findViewById3;
        View findViewById4 = v13.findViewById(p.avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f84740h0 = (GestaltAvatar) findViewById4;
        View findViewById5 = v13.findViewById(p.promoted_by_label);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f84741i0 = (GestaltText) findViewById5;
        View findViewById6 = v13.findViewById(p.advertiser_name);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f84742j0 = (GestaltText) findViewById6;
        View findViewById7 = v13.findViewById(p.title);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f84743k0 = (GestaltText) findViewById7;
        View findViewById8 = v13.findViewById(p.description);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f84744l0 = (GestaltText) findViewById8;
        View findViewById9 = v13.findViewById(p.cta_button);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        GestaltIconButton gestaltIconButton = this.f84739g0;
        if (gestaltIconButton == null) {
            Intrinsics.r("backButton");
            throw null;
        }
        gestaltIconButton.u(new xo.k(this, 18));
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new c(this, null), 3);
    }
}
