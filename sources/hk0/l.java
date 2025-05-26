package hk0;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.f30;
import com.pinterest.feature.board.detail.actions.view.PinShareUpsellBannerView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.ui.imageview.WebImageView;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nx.d0;
import ql2.s;
import rg0.f0;
import rg0.n;

/* loaded from: classes5.dex */
public final class l extends j {

    /* renamed from: q, reason: collision with root package name */
    public final Context f69332q;

    /* renamed from: r, reason: collision with root package name */
    public final n f69333r;

    /* renamed from: s, reason: collision with root package name */
    public final f30 f69334s;

    /* renamed from: t, reason: collision with root package name */
    public final c2 f69335t;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f69336u;

    /* renamed from: v, reason: collision with root package name */
    public final g0 f69337v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, ViewGroup parentView, n experienceValue, f30 pin, d0 pinalytics, c2 sharesheetUtils) {
        super(context, parentView, experienceValue, null, pinalytics, k.f69329j, k.f69330k);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        this.f69332q = context;
        this.f69333r = experienceValue;
        this.f69334s = pin;
        this.f69335t = sharesheetUtils;
        HashMap hashMap = new HashMap();
        String uid = pin.getUid();
        Intrinsics.f(uid);
        hashMap.put("pin_id", uid);
        this.f69336u = hashMap;
        this.f69337v = g0.TOAST;
    }

    @Override // hk0.j
    public final void b() {
        String str;
        String text;
        String imageUrl;
        ag2.e eVar = this.f69333r.f108068j;
        f0 f0Var = eVar instanceof f0 ? (f0) eVar : null;
        PinShareUpsellBannerView pinShareUpsellBannerView = new PinShareUpsellBannerView(this.f69332q);
        jh0.d action = new jh0.d(this, 13);
        Intrinsics.checkNotNullParameter(action, "action");
        defpackage.a aVar = new defpackage.a(9, action);
        GestaltButton gestaltButton = pinShareUpsellBannerView.f45183j;
        gestaltButton.e(aVar);
        String text2 = f0Var != null ? f0Var.f108004d : null;
        if (text2 == null) {
            text2 = "";
        }
        Intrinsics.checkNotNullParameter(text2, "text");
        gestaltButton.d(new ip.d(12, text2));
        if (f0Var != null && (imageUrl = f0Var.f108005e) != null) {
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            WebImageView webImageView = pinShareUpsellBannerView.f45181h;
            webImageView.loadUrl(imageUrl);
            if (!z.j(imageUrl)) {
                webImageView.setVisibility(0);
            } else {
                webImageView.setVisibility(8);
            }
        }
        if (f0Var != null && (text = f0Var.f108003c) != null) {
            Intrinsics.checkNotNullParameter(text, "text");
            pinShareUpsellBannerView.f45182i.i(new ip.d(13, text));
        }
        if (f0Var != null && (str = f0Var.f108003c) != null && str.length() == 0) {
            pinShareUpsellBannerView.setVisibility(8);
        }
        this.f69321i = pinShareUpsellBannerView;
        m();
    }

    @Override // hk0.j
    public final void c(boolean z13) {
        this.f69335t.q(y32.f.SHARE_UPSELL.value(), this.f69334s);
    }

    @Override // hk0.j
    public final g0 d() {
        return this.f69337v;
    }

    @Override // hk0.j
    public final /* bridge */ /* synthetic */ u0 e() {
        return null;
    }

    @Override // hk0.j
    public final HashMap f() {
        return this.f69336u;
    }

    @Override // hk0.j
    public final long g() {
        ag2.e eVar = this.f69333r.f108068j;
        f0 f0Var = eVar instanceof f0 ? (f0) eVar : null;
        Long valueOf = f0Var != null ? Long.valueOf(f0Var.f108006f) : null;
        return s.d(valueOf != null ? valueOf.longValue() * 1000 : 7000L, 20000L);
    }

    @Override // hk0.j
    public final boolean j() {
        k();
        return true;
    }
}
