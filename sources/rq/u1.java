package rq;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.text.GestaltText;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u1 extends h {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f109569l = 0;

    /* renamed from: c, reason: collision with root package name */
    public final oq.j0 f109570c;

    /* renamed from: d, reason: collision with root package name */
    public final e11.a f109571d;

    /* renamed from: e, reason: collision with root package name */
    public ek2.j f109572e;

    /* renamed from: f, reason: collision with root package name */
    public is1.i0 f109573f;

    /* renamed from: g, reason: collision with root package name */
    public hs.d f109574g;

    /* renamed from: h, reason: collision with root package name */
    public String f109575h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltText f109576i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f109577j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f109578k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(Context context, oq.j0 pinCloseupMetadataViewListener, e11.a pinCloseupMetadataModuleListener) {
        super(context, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinCloseupMetadataViewListener, "pinCloseupMetadataViewListener");
        Intrinsics.checkNotNullParameter(pinCloseupMetadataModuleListener, "pinCloseupMetadataModuleListener");
        int i13 = 1;
        this.f109570c = pinCloseupMetadataViewListener;
        this.f109571d = pinCloseupMetadataModuleListener;
        this.f109577j = true;
        hs.d dVar = this.f109574g;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        this.f109578k = dVar.b();
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new t1(this, i13));
        } else {
            pinCloseupMetadataModuleListener.w6(getHeight());
        }
    }

    @Override // rq.v3
    public final void b() {
        if (this.f109577j) {
            GestaltText gestaltText = this.f109576i;
            if (gestaltText != null) {
                gestaltText.i(o.I);
            }
        } else {
            GestaltText gestaltText2 = this.f109576i;
            if (gestaltText2 != null) {
                gestaltText2.i(o.H);
            }
        }
        this.f109577j = !this.f109577j;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        setOrientation(1);
        int W = bs1.c.W(this, eo1.c.space_400);
        getPaddingRect().left = W;
        getPaddingRect().right = W;
        getPaddingRect().top = this.f109578k ? bs1.c.W(this, eo1.c.space_200) : bs1.c.W(this, eo1.c.space_100);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        boolean z13 = false;
        byte b13 = 0;
        gestaltText.setBreakStrategy(0);
        gestaltText.i(new s1(this, 0));
        gestaltText.j(new xo.k(this, 11));
        addView(gestaltText);
        if (!gestaltText.isLaidOut() || gestaltText.isLayoutRequested()) {
            gestaltText.addOnLayoutChangeListener(new t1(this, b13 == true ? 1 : 0));
        } else {
            GestaltText gestaltText2 = this.f109576i;
            xk2.v vVar = sq.i.f114975a;
            if (gestaltText2 != null) {
                z13 = gestaltText2.getLayout().getEllipsisCount(gestaltText2.getLineCount() - 1) > 0;
            }
            ((oq.x0) this.f109570c).f97192u0 = z13;
        }
        this.f109576i = gestaltText;
    }

    public final void e() {
        Pair pair;
        String str;
        f30 pin = getPin();
        if (pin == null) {
            return;
        }
        is1.i0 i0Var = this.f109573f;
        if (i0Var == null) {
            Intrinsics.r("translationsTracker");
            throw null;
        }
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        is1.h0 b13 = i0Var.b(uid);
        if (b13 == null || !b13.f73597b || (str = b13.f73599d) == null || !(!kotlin.text.z.j(str))) {
            if (df.j1.d1(this.f109575h)) {
                String str2 = this.f109575h;
                pair = new Pair(str2 != null ? str2 : "", fm1.c.VISIBLE);
            } else {
                pair = new Pair("", fm1.c.GONE);
            }
        } else {
            pair = new Pair(str, fm1.c.VISIBLE);
        }
        String str3 = (String) pair.f80346a;
        fm1.c cVar = (fm1.c) pair.f80347b;
        GestaltText gestaltText = this.f109576i;
        if (gestaltText != null) {
            gestaltText.i(new p(str3, cVar, 1));
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final HashMap getCardViewAuxData() {
        GestaltText gestaltText = this.f109576i;
        String u13 = gestaltText != null ? kh2.g0.u(gestaltText, 0) : null;
        if (u13 != null) {
            return bs1.c.o(new Pair("pin_closeup_title_preview", u13));
        }
        return null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_TITLE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0[197(0xc5, float:2.76E-43)] != false) goto L15;
     */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasContent() {
        /*
            r3 = this;
            com.pinterest.api.model.f30 r0 = r3.getPin()
            if (r0 == 0) goto L12
            boolean[] r0 = r0.f37485h3
            int r1 = r0.length
            r2 = 197(0xc5, float:2.76E-43)
            if (r1 <= r2) goto L12
            boolean r0 = r0[r2]
            if (r0 == 0) goto L12
            goto L23
        L12:
            com.pinterest.api.model.f30 r0 = r3.getPin()
            if (r0 == 0) goto L25
            boolean[] r0 = r0.f37485h3
            int r1 = r0.length
            r2 = 60
            if (r1 <= r2) goto L25
            boolean r0 = r0[r2]
            if (r0 == 0) goto L25
        L23:
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.u1.hasContent():boolean");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ek2.j jVar = this.f109572e;
        if (jVar != null) {
            bk2.c.dispose(jVar);
        }
        this.f109572e = null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        kh2.r.u(null, "PinCloseupTitleModule.titleContainer");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldSendPinCardView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        f30 pin = getPin();
        String b13 = pin != null ? sq.i.b(pin) : null;
        this.f109575h = b13;
        return df.j1.d1(b13);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.updatePin(pin);
        f30 pin2 = getPin();
        if (pin2 != null && Intrinsics.d(pin2.j5(), Boolean.TRUE) && this.f109572e == null) {
            is1.i0 i0Var = this.f109573f;
            if (i0Var == null) {
                Intrinsics.r("translationsTracker");
                throw null;
            }
            f30 pin3 = getPin();
            String uid = pin3 != null ? pin3.getUid() : null;
            if (uid == null) {
                uid = "";
            }
            this.f109572e = (ek2.j) i0Var.c(uid).F(new d1(6, new s1(this, 1)), new d1(7, o.f109402J), ck2.i.f27923c, ck2.i.f27924d);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        super.updateView();
        e();
    }
}
