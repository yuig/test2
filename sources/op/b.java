package op;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.u;
import ao2.j0;
import bs1.c;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.dn;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.pr;
import com.pinterest.api.model.sr;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.ui.grid.pin.ImagelessPinView;
import df.j1;
import dl1.s;
import ey.i2;
import hs1.m;
import hs1.t;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import ni1.c0;
import nx.d0;
import os.k;
import os.l;
import sp.g;
import sp.i;

/* loaded from: classes3.dex */
public final class b extends l {

    /* renamed from: d, reason: collision with root package name */
    public final d0 f96907d;

    /* renamed from: e, reason: collision with root package name */
    public final a f96908e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f96909f;

    public b(d0 pinalytics, a selectionManager, u scope) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(selectionManager, "selectionManager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f97492c = new HashMap();
        this.f96907d = pinalytics;
        this.f96908e = selectionManager;
        this.f96909f = scope;
    }

    @Override // os.l
    public final View c(int i13, View view, ViewGroup viewGroup, boolean z13) {
        g gVar;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        if (!z13) {
            int i14 = hf0.b.f69004d * 4;
            for (int i15 = 1; i15 <= i14; i15++) {
                int i16 = i13 + i15;
                if (i16 < getCount()) {
                    s item = getItem(i16);
                    if (item instanceof f30) {
                        f30 f30Var = (f30) item;
                        String B0 = c.B0(f30Var);
                        String str = B0 == null ? "" : B0;
                        f30Var.getClass();
                        new i2(str, i16).i();
                        k kVar = new k(B0);
                        if (B0 != null) {
                            ((m) t.a()).q(B0, null, kVar);
                        }
                    }
                }
            }
        }
        PinnableImage pinnableImage = (PinnableImage) getItem(i13);
        if (pinnableImage == null) {
            return view;
        }
        String str2 = pinnableImage.f35574k;
        a aVar = this.f96908e;
        if (str2 != null) {
            Context context = viewGroup.getContext();
            ImagelessPinView a13 = ImagelessPinView.a(context, pinnableImage.f35574k, pinnableImage.f35570g, j1.a0(pinnableImage.f35568e).toString(), pinnableImage.f35572i);
            Intrinsics.f(context);
            return new i(context, a13, CollectionsKt.L(((qp.k) aVar).f104711t0, pinnableImage));
        }
        e30 r33 = f30.r3();
        Intrinsics.checkNotNullExpressionValue(r33, "builder(...)");
        r33.x2(pinnableImage.f35564a);
        r33.M(pinnableImage.f35565b + " x " + pinnableImage.f35566c);
        pr f13 = sr.f();
        f13.e(pinnableImage.f35569f);
        f13.f(Double.valueOf((double) pinnableImage.f35565b));
        f13.c(Double.valueOf((double) pinnableImage.f35566c));
        sr a14 = f13.a();
        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
        HashMap hashMap = new HashMap();
        String c13 = as1.b.a().c();
        Intrinsics.checkNotNullExpressionValue(c13, "getDisplayMediumImageWidth(...)");
        hashMap.put(c13, a14);
        r33.j0(hashMap);
        String str3 = pinnableImage.f35569f;
        if (str3 != null && z.h(str3, "gif", false)) {
            dn dnVar = new dn(0);
            dnVar.e("gif");
            dnVar.d(pinnableImage.f35569f);
            r33.U(dnVar.a());
        }
        f30 pin = r33.a();
        Intrinsics.checkNotNullExpressionValue(pin, "build(...)");
        CharSequence charSequence = pinnableImage.f35572i;
        Set set = b40.f35967a;
        Intrinsics.checkNotNullParameter(pin, "<this>");
        LinkedHashMap linkedHashMap = b40.f35969c;
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        linkedHashMap.put(uid, charSequence);
        if (view instanceof g) {
            gVar = (g) view;
        } else {
            Context context2 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            gVar = new g(context2, this.f96907d, new wa2.m(-1, -1, 1023, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), this.f96909f);
        }
        g gVar2 = gVar;
        boolean L = CollectionsKt.L(((qp.k) aVar).f104711t0, pinnableImage);
        gVar2.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        gVar2.f114872o = L;
        ImageView imageView = gVar2.f114870m;
        SbaPinRep sbaPinRep = gVar2.f114864g;
        int i17 = gVar2.f114868k;
        if (L) {
            imageView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = sbaPinRep.asView().getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i18 = gVar2.f114869l;
            com.bumptech.glide.c.a1((ViewGroup.MarginLayoutParams) layoutParams, i18, i18, i18, i17);
        } else {
            imageView.setVisibility(4);
            ViewGroup.LayoutParams layoutParams2 = sbaPinRep.asView().getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int i19 = gVar2.f114867j;
            com.bumptech.glide.c.a1((ViewGroup.MarginLayoutParams) layoutParams2, i19, i19, i19, i17);
        }
        l3.c.X0(pin, i13, sbaPinRep, gVar2.f114865h, (c0) gVar2.f114866i.getValue());
        return gVar2;
    }
}
