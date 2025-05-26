package tv1;

import a.m2;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.widget.ImageView;
import c71.b0;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.o00;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import h32.f1;
import h32.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import nx.d0;
import q5.v0;
import yk1.n;

/* loaded from: classes4.dex */
public final class a extends yk1.b implements vv1.h {

    /* renamed from: a, reason: collision with root package name */
    public final b f119538a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f119539b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f119540c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f119541d;

    /* renamed from: e, reason: collision with root package name */
    public g00 f119542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b listener, uk1.d presenterPinalytics, HashMap bodyTypeAuxData) {
        super(0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(bodyTypeAuxData, "bodyTypeAuxData");
        this.f119538a = listener;
        this.f119539b = presenterPinalytics;
        this.f119540c = bodyTypeAuxData;
        this.f119541d = new HashMap();
    }

    @Override // vv1.h
    public final void R1(boolean z13) {
        String str;
        boolean z14;
        String str2;
        HashMap hashMap = this.f119540c;
        String str3 = "";
        if (!j1.U0((CharSequence) hashMap.get("entered_query")) ? (str = (String) hashMap.get("pinner_displayed_query")) != null : (str = (String) hashMap.get("entered_query")) != null) {
            str3 = str;
        }
        g00 model = this.f119542e;
        if (model != null) {
            HashMap hashMap2 = this.f119541d;
            hashMap2.put("entered_query", str3);
            hashMap2.put("pinner_displayed_query", String.valueOf(hashMap.get("pinner_displayed_query")));
            d0 d0Var = this.f119539b.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0.B(d0Var, z13 ? f1.SELECT : f1.UNSELECT, g0.ONEBAR_DRAWER, null, hashMap2, 20);
            NavigationImpl navigationImpl = null;
            b bVar = this.f119538a;
            if (!z13) {
                bVar.v(null);
                return;
            }
            bVar.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            k00 q13 = model.q();
            String pattern = q13 != null ? q13.z() : null;
            vv1.a aVar = bVar.f119543h;
            Uri parse = Uri.parse(aVar.f126762n);
            Intrinsics.f(parse);
            h61.h E = pe.i.E(parse);
            b0 b0Var = (b0) aVar.f126760l.invoke();
            String str4 = aVar.f126761m;
            if (str4 != null) {
                bVar.u(str4);
            }
            if (b0Var == null || (str2 = b0Var.f26730b) == null) {
                z14 = false;
            } else {
                HashMap hashMap3 = aVar.f126763o;
                String str5 = (String) hashMap3.get("pinner_displayed_query");
                String str6 = str5 == null ? str2 : str5;
                String str7 = (String) hashMap3.get("entered_query");
                if (str7 == null) {
                    str7 = str2;
                }
                z14 = false;
                navigationImpl = b0.c(new b0(E, str6, str7, null, null, null, null, null, null, null, null, null, null, null, null, pattern, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (String) hashMap3.get("pinner_displayed_query"), aVar.f126764p, null, null, null, null, null, null, -1048584, 2084863), false, 3);
            }
            bVar.f119545j.e(300L, navigationImpl);
            q qVar = bVar.f119546k;
            String v13 = pe.i.v(qVar);
            if (v13 == null || v13.length() == 0) {
                z14 = true;
            }
            boolean z15 = !z14;
            boolean z16 = !Intrinsics.d(pe.i.v(qVar), pattern);
            if (z15 && z16 && pattern != null) {
                Intrinsics.checkNotNullParameter(qVar, "<this>");
                Intrinsics.checkNotNullParameter(pattern, "pattern");
                qVar.b("PREF_BODY_TYPE_SELECTION", pattern);
                bVar.f119548m.k(m42.e.search_body_type_updated);
            }
            bVar.f119547l.t3();
        }
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        Boolean bool;
        List u13;
        String imageUrl;
        vv1.b view = (vv1.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        uv1.c cVar = (uv1.c) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        cVar.f123188c = this;
        b parentListener = this.f119538a;
        Intrinsics.checkNotNullParameter(parentListener, "parentListener");
        cVar.f123189d = parentListener;
        g00 g00Var = this.f119542e;
        if (g00Var != null) {
            o00 v13 = g00Var.v();
            if (v13 == null || (bool = v13.v()) == null) {
                bool = Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            o00 v14 = g00Var.v();
            String description = v14 != null ? v14.n() : null;
            if (description == null) {
                description = "";
            }
            o00 v15 = g00Var.v();
            if (v15 == null || (u13 = v15.u()) == null || (imageUrl = (String) u13.get(0)) == null) {
                return;
            }
            o00 v16 = g00Var.v();
            List x13 = v16 != null ? v16.x() : null;
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(description, "description");
            if (x13 != null) {
                cVar.f123190e = x13;
            }
            WebImageView webImageView = new WebImageView(cVar.getContext());
            webImageView.loadUrl(imageUrl);
            webImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            float dimensionPixelOffset = webImageView.getResources().getDimensionPixelOffset(eo1.c.lego_corner_radius_medium);
            webImageView.g2(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            cVar.f123187b = booleanValue;
            List list = cVar.f123190e;
            if (list == null) {
                Intrinsics.r("selectedBackgroundColors");
                throw null;
            }
            int[] iArr = new int[list.size()];
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                iArr[i13] = Color.parseColor((String) list.get(i13));
            }
            uv1.i iVar = new uv1.i(iArr, cVar.getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium_border), cVar.getResources().getDimensionPixelSize(eo1.c.space_100));
            Drawable drawable = cVar.getResources().getDrawable(eo1.d.drawable_themed_transparent, cVar.getContext().getTheme());
            Intrinsics.f(drawable);
            ArrayList l13 = f0.l(drawable, iVar);
            if (booleanValue) {
                Intrinsics.checkNotNullParameter(l13, "<this>");
                Collections.reverse(l13);
            }
            TransitionDrawable transitionDrawable = new TransitionDrawable((Drawable[]) l13.toArray(new Drawable[0]));
            cVar.f123191f = transitionDrawable;
            transitionDrawable.setCrossFadeEnabled(true);
            TransitionDrawable transitionDrawable2 = cVar.f123191f;
            if (transitionDrawable2 == null) {
                Intrinsics.r("backgroundAnimator");
                throw null;
            }
            cVar.setBackground(transitionDrawable2);
            webImageView.setOnTouchListener(new m2(cVar, 18));
            cVar.f123186a = webImageView;
            int dimensionPixelOffset2 = hf0.b.f69002b - cVar.getResources().getDimensionPixelOffset(eo1.c.space_600);
            WebImageView webImageView2 = cVar.f123186a;
            if (webImageView2 == null) {
                Intrinsics.r("bodyTypeImageView");
                throw null;
            }
            cVar.addView(webImageView2, dimensionPixelOffset2, (int) (dimensionPixelOffset2 * 0.37d));
            int dimensionPixelSize = cVar.getResources().getDimensionPixelSize(eo1.c.space_100);
            cVar.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            cVar.setClickable(true);
            cVar.setContentDescription(description);
            v0.o(cVar, new kj.d(cVar, 6));
        }
    }
}
