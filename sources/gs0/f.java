package gs0;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.feature.gridactions.modal.view.PinFeedbackModalContentView;
import df.j1;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import nx.d0;
import nx.d1;
import x02.i2;

/* loaded from: classes5.dex */
public final class f extends yk1.l {

    /* renamed from: a, reason: collision with root package name */
    public final String f66030a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f66031b;

    /* renamed from: c, reason: collision with root package name */
    public final wy0 f66032c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f66033d;

    /* renamed from: e, reason: collision with root package name */
    public final uj2.q f66034e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f66035f;

    /* renamed from: g, reason: collision with root package name */
    public final x10.b f66036g;

    /* renamed from: h, reason: collision with root package name */
    public final js0.a f66037h;

    /* renamed from: i, reason: collision with root package name */
    public final d1 f66038i;

    /* renamed from: j, reason: collision with root package name */
    public final f0 f66039j;

    /* renamed from: k, reason: collision with root package name */
    public PinFeedbackModalContentView f66040k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f66041l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f66042m;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(java.lang.String r3, uk1.d r4, com.pinterest.api.model.wy0 r5, as0.a r6, java.util.HashMap r7, uj2.q r8, x02.i2 r9, x10.b r10, lh0.n1 r11, js0.a r12, nx.d1 r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gs0.f.<init>(java.lang.String, uk1.d, com.pinterest.api.model.wy0, as0.a, java.util.HashMap, uj2.q, x02.i2, x10.b, lh0.n1, js0.a, nx.d1):void");
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Unit unit;
        String displayName;
        Intrinsics.checkNotNullParameter(context, "context");
        PinFeedbackModalContentView pinFeedbackModalContentView = new PinFeedbackModalContentView(6, context, (AttributeSet) null);
        ArrayList options = this.f66042m;
        Intrinsics.checkNotNullParameter(options, "options");
        Iterator it = options.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ViewGroup viewGroup = pinFeedbackModalContentView.f45717g;
            if (!hasNext) {
                boolean z13 = this.f66041l;
                if (z13) {
                    wy0 wy0Var = this.f66032c;
                    if (wy0Var == null || (displayName = wy0Var.Z2()) == null) {
                        unit = null;
                    } else {
                        Intrinsics.checkNotNullParameter(displayName, "displayName");
                        c cVar = pinFeedbackModalContentView.f45715e;
                        if (cVar == null) {
                            Intrinsics.r("viewCreator");
                            throw null;
                        }
                        String string = pinFeedbackModalContentView.getResources().getString(vy1.c.hide_pin_option_from_creator);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        RelativeLayout b13 = c.b(cVar, j1.Y(string, new Object[]{displayName}, null, 6), null, null, 4);
                        b13.setOnClickListener(new lj0.a(pinFeedbackModalContentView, 25));
                        viewGroup.addView(b13);
                        unit = Unit.f80348a;
                    }
                    if (unit == null) {
                        this.f66039j.G("should have a creator's full name here", new Object[0]);
                    }
                }
                this.f66040k = pinFeedbackModalContentView;
                d0 d0Var = this.f66031b.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                i0 i0Var = new i0(d4.MODAL, a4.PIN_FEEDBACK_MODAL, null, null, null, null);
                f1 f1Var = f1.VIEW;
                HashMap hashMap = new HashMap();
                hashMap.put("is_hide_by_creator_present", String.valueOf(z13));
                Unit unit2 = Unit.f80348a;
                d0Var.U(i0Var, f1Var, this.f66030a, null, hashMap, false);
                ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
                modalViewWrapper.l(vy1.c.pin_hide_title_tell_us_more);
                PinFeedbackModalContentView pinFeedbackModalContentView2 = this.f66040k;
                if (pinFeedbackModalContentView2 != null) {
                    modalViewWrapper.t(pinFeedbackModalContentView2);
                    return modalViewWrapper;
                }
                Intrinsics.r("modalView");
                throw null;
            }
            cs0.e eVar = (cs0.e) it.next();
            c cVar2 = pinFeedbackModalContentView.f45715e;
            if (cVar2 == null) {
                Intrinsics.r("viewCreator");
                throw null;
            }
            String string2 = pinFeedbackModalContentView.getResources().getString(eVar.f53126a);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            RelativeLayout b14 = c.b(cVar2, string2, null, null, 6);
            b14.setOnClickListener(new xa0.m(19, pinFeedbackModalContentView, eVar));
            viewGroup.addView(b14);
        }
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        return new fs0.k(this.f66030a, this.f66035f, this.f66036g, this.f66031b, this.f66034e, this.f66032c, this.f66037h, this.f66038i, this.f66033d);
    }

    @Override // yk1.l
    public final yk1.n getView() {
        PinFeedbackModalContentView pinFeedbackModalContentView = this.f66040k;
        if (pinFeedbackModalContentView != null) {
            return pinFeedbackModalContentView;
        }
        Intrinsics.r("modalView");
        throw null;
    }
}
