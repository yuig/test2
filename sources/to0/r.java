package to0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.gw;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.report.library.model.ReportData;
import com.pinterest.screens.l2;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.u0;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.x0;

/* loaded from: classes5.dex */
public final class r extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f118682a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118683b;

    /* renamed from: c, reason: collision with root package name */
    public final po0.b f118684c;

    /* renamed from: d, reason: collision with root package name */
    public final so.v f118685d;

    public r(String pinUid, String str, po0.b listener, so.v inviteCodeHandlerFactory) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(inviteCodeHandlerFactory, "inviteCodeHandlerFactory");
        this.f118682a = pinUid;
        this.f118683b = str;
        this.f118684c = listener;
        this.f118685d = inviteCodeHandlerFactory;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        LinearLayout linearLayout = new LinearLayout(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(r0.margin);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(r0.margin_half);
        final int i13 = 1;
        linearLayout.setOrientation(1);
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(new q0.d(context, 10));
        gestaltText.setId(ds1.b.ui_test_open_browser_id);
        final int i14 = 0;
        gestaltText.k(new View.OnClickListener(this) { // from class: to0.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f118681b;

            {
                this.f118681b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                r this$0 = this.f118681b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ro0.e eVar = (ro0.e) this$0.f118684c;
                        if (eVar.isBound()) {
                            eVar.getPinalytics().F(g0.NAVIGATION, u0.LINK_OUT_BUTTON);
                            if (!pk.a0.x0(eVar.f108943d)) {
                                po0.d dVar = (po0.d) eVar.getView();
                                String str = eVar.f108943d;
                                g gVar = (g) dVar;
                                gVar.getClass();
                                try {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.setData(Uri.parse(str));
                                    intent.putExtra("android.intent.extra.REFERRER", gVar.getResources().getString(x0.pinterest_url));
                                    gVar.startActivity(intent);
                                    break;
                                } catch (Exception e13) {
                                    HashSet hashSet = tb0.h.f117076w;
                                    tb0.g.f117075a.p(e13);
                                    return;
                                }
                            }
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        NavigationImpl w13 = Navigation.w1((ScreenLocation) l2.f51066b.getValue());
                        w13.w0(new ReportData.LinkReportData(this$0.f118682a, d4.BROWSER.toString(), a4.BROWSER.toString(), this$0.f118683b), "com.pinterest.EXTRA_REPORT_DATA");
                        os0.b bVar = os0.b.f97497a;
                        os0.b.d().d(w13);
                        break;
                }
            }
        });
        gestaltText.setPaddingRelative(dimensionPixelSize, gestaltText.getPaddingTop(), gestaltText.getPaddingEnd(), dimensionPixelSize2);
        linearLayout.addView(gestaltText);
        fw.f37821a.getClass();
        if (gw.d(this.f118682a) != null) {
            GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
            gestaltText2.i(new q0.d(context, 8));
            gestaltText2.k(new xa0.m(16, context, this));
            gestaltText2.setPaddingRelative(dimensionPixelSize, gestaltText2.getPaddingTop(), gestaltText2.getPaddingEnd(), dimensionPixelSize2);
            linearLayout.addView(gestaltText2);
            GestaltText gestaltText3 = new GestaltText(6, context, (AttributeSet) null);
            gestaltText3.i(new q0.d(context, 9));
            gestaltText3.k(new View.OnClickListener(this) { // from class: to0.q

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f118681b;

                {
                    this.f118681b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15 = i13;
                    r this$0 = this.f118681b;
                    switch (i15) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            ro0.e eVar = (ro0.e) this$0.f118684c;
                            if (eVar.isBound()) {
                                eVar.getPinalytics().F(g0.NAVIGATION, u0.LINK_OUT_BUTTON);
                                if (!pk.a0.x0(eVar.f108943d)) {
                                    po0.d dVar = (po0.d) eVar.getView();
                                    String str = eVar.f108943d;
                                    g gVar = (g) dVar;
                                    gVar.getClass();
                                    try {
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        intent.setData(Uri.parse(str));
                                        intent.putExtra("android.intent.extra.REFERRER", gVar.getResources().getString(x0.pinterest_url));
                                        gVar.startActivity(intent);
                                        break;
                                    } catch (Exception e13) {
                                        HashSet hashSet = tb0.h.f117076w;
                                        tb0.g.f117075a.p(e13);
                                        return;
                                    }
                                }
                            }
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            NavigationImpl w13 = Navigation.w1((ScreenLocation) l2.f51066b.getValue());
                            w13.w0(new ReportData.LinkReportData(this$0.f118682a, d4.BROWSER.toString(), a4.BROWSER.toString(), this$0.f118683b), "com.pinterest.EXTRA_REPORT_DATA");
                            os0.b bVar = os0.b.f97497a;
                            os0.b.d().d(w13);
                            break;
                    }
                }
            });
            gestaltText3.setPaddingRelative(dimensionPixelSize, gestaltText3.getPaddingTop(), gestaltText3.getPaddingEnd(), gestaltText3.getPaddingBottom());
            linearLayout.addView(gestaltText3);
        }
        modalViewWrapper.x(linearLayout);
        return modalViewWrapper;
    }
}
