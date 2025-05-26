package h80;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.ui.imageview.WebImageView;
import h32.d4;
import java.util.HashMap;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import mq.e0;
import mq.f0;
import mq.g0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh80/l;", "Lnl1/d;", "<init>", "()V", "canvas_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class l extends a {

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ int f68097m0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public i92.k f68098c0;

    /* renamed from: d0, reason: collision with root package name */
    public final m1 f68099d0;

    /* renamed from: e0, reason: collision with root package name */
    public WebImageView f68100e0;

    /* renamed from: f0, reason: collision with root package name */
    public WebImageView f68101f0;

    /* renamed from: g0, reason: collision with root package name */
    public ImageView f68102g0;

    /* renamed from: h0, reason: collision with root package name */
    public View f68103h0;

    /* renamed from: i0, reason: collision with root package name */
    public String f68104i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f68105j0;

    /* renamed from: k0, reason: collision with root package name */
    public final HashMap f68106k0;

    /* renamed from: l0, reason: collision with root package name */
    public final d4 f68107l0;

    public l() {
        xk2.k q13 = jq.b.q(14, new q1(this, 14), xk2.n.NONE);
        int i13 = 13;
        this.f68099d0 = a1.s(this, k0.f80436a.b(s.class), new e0(q13, i13), new f0(null, q13, i13), new g0(this, q13, i13));
        this.f68104i0 = "";
        this.f68106k0 = new HashMap();
        this.f68107l0 = d4.IMAGE_VISUALIZATION;
    }

    @Override // uk1.c
    /* renamed from: getAuxData, reason: from getter */
    public final HashMap getO0() {
        return this.f68106k0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.f68107l0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = g80.c.fragment_image_visualization;
        s sVar = (s) this.f68099d0.getValue();
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_PIN_ID") : null;
        if (v03 == null) {
            v03 = "";
        }
        Navigation navigation2 = this.I;
        String v04 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_IMAGE") : null;
        if (v04 == null) {
            v04 = "";
        }
        sVar.h(generateLoggingContext(), v03, v04);
        HashMap hashMap = this.f68106k0;
        Navigation navigation3 = this.I;
        String v05 = navigation3 != null ? navigation3.v0("com.pinterest.EXTRA_IMAGE") : null;
        hashMap.put("object_id", v05 != null ? v05 : "");
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        FrameLayout frameLayout;
        super.onResume();
        if (this.f68105j0) {
            this.f68105j0 = false;
            i92.k kVar = this.f68098c0;
            if (kVar == null) {
                Intrinsics.r("toastUtils");
                throw null;
            }
            kVar.k(kk1.d.product_feedback_thank_you);
            View view = getView();
            if (view == null || (frameLayout = (FrameLayout) view.findViewById(g80.b.survey_container)) == null) {
                return;
            }
            frameLayout.removeAllViews();
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(g80.b.pin_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f68100e0 = (WebImageView) findViewById;
        View findViewById2 = v13.findViewById(g80.b.generated_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f68101f0 = (WebImageView) findViewById2;
        View findViewById3 = v13.findViewById(g80.b.loading_animation);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f68102g0 = (ImageView) findViewById3;
        View findViewById4 = v13.findViewById(g80.b.background_wash);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f68103h0 = findViewById4;
        ((GestaltIconButton) v13.findViewById(g80.b.back_button)).u(new xo.k(this, 25));
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new k(this, null), 3);
    }

    @Override // nl1.d
    public final String q7() {
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.v0("com.pinterest.EXTRA_IMAGE");
        }
        return null;
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        return this.f68106k0;
    }
}
