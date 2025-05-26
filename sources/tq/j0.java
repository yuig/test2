package tq;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TableRow;
import com.pinterest.activity.pin.view.PinCloseupRatingView;
import com.pinterest.gestalt.text.GestaltText;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import oq.c1;
import rq.t4;

/* loaded from: classes3.dex */
public final class j0 extends e0 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public final nx.d0 f118861d;

    /* renamed from: e, reason: collision with root package name */
    public final e11.a f118862e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f118863f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f118864g;

    /* renamed from: h, reason: collision with root package name */
    public final vn1.g f118865h;

    /* renamed from: i, reason: collision with root package name */
    public final List f118866i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f118867j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f118868k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltText f118869l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltText f118870m;

    /* renamed from: n, reason: collision with root package name */
    public final PinCloseupRatingView f118871n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltText f118872o;

    /* renamed from: p, reason: collision with root package name */
    public final GestaltText f118873p;

    /* renamed from: q, reason: collision with root package name */
    public final b11.d f118874q;

    /* renamed from: r, reason: collision with root package name */
    public final LinearLayout f118875r;

    /* renamed from: s, reason: collision with root package name */
    public final LinearLayout f118876s;

    /* renamed from: t, reason: collision with root package name */
    public final LinearLayout f118877t;

    /* renamed from: u, reason: collision with root package name */
    public String f118878u;

    /* renamed from: v, reason: collision with root package name */
    public String f118879v;

    /* renamed from: w, reason: collision with root package name */
    public c1 f118880w;

    /* renamed from: x, reason: collision with root package name */
    public String f118881x;

    /* renamed from: y, reason: collision with root package name */
    public String f118882y;

    /* renamed from: z, reason: collision with root package name */
    public final g4.u f118883z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, nx.d0 pinalytics, e11.a pinCloseupMetadataModuleListener, hs.d moduleViewabilityHelper) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinCloseupMetadataModuleListener, "pinCloseupMetadataModuleListener");
        Intrinsics.checkNotNullParameter(moduleViewabilityHelper, "moduleViewabilityHelper");
        this.f118861d = pinalytics;
        this.f118862e = pinCloseupMetadataModuleListener;
        boolean b13 = moduleViewabilityHelper.b();
        this.f118863f = b13;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        gestaltText.i(new i0(this, 0));
        this.f118864g = gestaltText;
        this.f118865h = b13 ? vn1.g.BODY_300 : vn1.g.UI_200;
        this.f118866i = b13 ? kotlin.collections.e0.b(vn1.e.REGULAR) : kotlin.collections.e0.b(vn1.e.BOLD);
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(new i0(this, 1));
        this.f118867j = gestaltText2;
        GestaltText gestaltText3 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText3.i(new i0(this, 4));
        gestaltText3.setPaddingRelative(bs1.c.W(gestaltText3, eo1.c.space_100), gestaltText3.getPaddingTop(), gestaltText3.getPaddingEnd(), gestaltText3.getPaddingBottom());
        this.f118868k = gestaltText3;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText gestaltText4 = new GestaltText(6, context3, (AttributeSet) null);
        g gVar = g.f118845s;
        gestaltText4.i(gVar);
        this.f118869l = gestaltText4;
        GestaltText gestaltText5 = new GestaltText(6, context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        gestaltText5.setLayoutParams(layoutParams);
        gestaltText5.i(new i0(this, 3));
        this.f118870m = gestaltText5;
        PinCloseupRatingView pinCloseupRatingView = new PinCloseupRatingView(context);
        pinCloseupRatingView.setVisibility(8);
        this.f118871n = pinCloseupRatingView;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltText gestaltText6 = new GestaltText(6, context4, (AttributeSet) null);
        gestaltText6.i(gVar);
        this.f118872o = gestaltText6;
        GestaltText gestaltText7 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText7.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        gestaltText7.i(new i0(this, 2));
        this.f118873p = gestaltText7;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        b11.d dVar = new b11.d(0, context5);
        dVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f118874q = dVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(n80.c.pdp_metadata_container);
        linearLayout.setOrientation(1);
        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), bs1.c.W(linearLayout, eo1.c.space_100), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
        this.f118875r = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(n80.c.pdp_price_and_shipping_container);
        linearLayout2.setOrientation(0);
        linearLayout2.setPaddingRelative(linearLayout2.getPaddingStart(), bs1.c.W(linearLayout2, eo1.c.space_100), linearLayout2.getPaddingEnd(), linearLayout2.getPaddingBottom());
        this.f118876s = linearLayout2;
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(n80.c.pdp_rating_container);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        linearLayout3.setPaddingRelative(linearLayout3.getPaddingStart(), bs1.c.W(linearLayout3, eo1.c.space_100), linearLayout3.getPaddingEnd(), linearLayout3.getPaddingBottom());
        this.f118877t = linearLayout3;
        this.f118878u = "";
        this.f118879v = "";
        this.f118880w = c1.UNKNOWN;
        this.f118881x = "";
        this.f118882y = "";
        this.f118883z = new g4.u();
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 9));
        } else {
            pinCloseupMetadataModuleListener.w6(getHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, android.widget.LinearLayout, android.widget.TableLayout] */
    @Override // tq.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tq.j0.b():void");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        int W = bs1.c.W(this, eo1.c.space_400);
        getPaddingRect().top = bs1.c.W(this, this.f118863f ? eo1.c.space_200 : eo1.c.space_100);
        getPaddingRect().right = W;
        getPaddingRect().left = W;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.f118876s;
        linearLayout2.addView(this.f118867j);
        linearLayout2.addView(this.f118868k);
        linearLayout2.addView(this.f118869l);
        linearLayout2.addView(this.f118870m);
        LinearLayout linearLayout3 = this.f118877t;
        linearLayout3.addView(this.f118871n);
        linearLayout3.addView(this.f118872o);
        LinearLayout linearLayout4 = this.f118875r;
        b11.d dVar = this.f118874q;
        dVar.addView(linearLayout4);
        linearLayout.addView(this.f118864g);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(dVar);
        addView(linearLayout, -1, -2);
        setOnClickListener(new j(this, 1));
    }

    public final GestaltText e(String str, boolean z13) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(new t4(z13, str, 2));
        gestaltText.setPaddingRelative(gestaltText.getPaddingStart(), bs1.c.W(gestaltText, eo1.c.space_100), gestaltText.getPaddingEnd(), gestaltText.getPaddingBottom());
        return gestaltText;
    }

    public final GestaltText g(String str, boolean z13) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-1, -2);
        layoutParams.setMargins(0, bs1.c.W(gestaltText, eo1.c.space_200), 0, bs1.c.W(gestaltText, eo1.c.space_200));
        gestaltText.setLayoutParams(layoutParams);
        gestaltText.i(new t4(str, z13, 3));
        return gestaltText;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final HashMap getCardViewAuxData() {
        String u13 = kh2.g0.u(this.f118864g, 0);
        if (u13 != null) {
            return bs1.c.o(new Pair("pin_closeup_title_preview", u13));
        }
        return null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_COMMERCE_HEADER;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldSendPinCardView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean useAutoVisibility() {
        return false;
    }
}
