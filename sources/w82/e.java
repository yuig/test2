package w82;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.webkit.WebView;
import c92.k;
import c92.o;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.targethandshake.ui.webview.TargetHandshakeWebView;
import d92.l;
import d92.p;
import d92.w;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import pk.a0;
import rm1.q;
import to0.u;

/* loaded from: classes4.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f128467r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f128468s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f128468s = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e eVar = new e(this.f128468s, cVar);
        eVar.f128467r = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((d92.i) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        d92.i iVar = (d92.i) this.f128467r;
        ArrayList arrayList = iVar.f54150a;
        int i13 = i.f128474l0;
        i iVar2 = this.f128468s;
        iVar2.getClass();
        Iterator it = arrayList.iterator();
        while (true) {
            int i14 = 2;
            int i15 = 1;
            if (!it.hasNext()) {
                iVar2.a8().f54181d.e().a(l.f54159a);
                if (b.f128461a[iVar.f54151b.ordinal()] == 2) {
                    TargetHandshakeWebView targetHandshakeWebView = iVar2.f128480h0;
                    if (targetHandshakeWebView == null) {
                        Intrinsics.r("webview");
                        throw null;
                    }
                    if (targetHandshakeWebView.f52190c.canGoBack()) {
                        TargetHandshakeWebView targetHandshakeWebView2 = iVar2.f128480h0;
                        if (targetHandshakeWebView2 == null) {
                            Intrinsics.r("webview");
                            throw null;
                        }
                        targetHandshakeWebView2.c();
                    } else {
                        iVar2.D5();
                    }
                    iVar2.a8().f54181d.e().a(p.f54182a);
                }
                c92.f Y7 = iVar2.Y7();
                Y7.getClass();
                o displayState = iVar.f54152c;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                a0.q(Y7.f27003c, displayState.f27019a);
                a0.q(Y7.f27002b, displayState.f27020b);
                Y7.f27004d.d(new c92.e(displayState, 0));
                Y7.f27005e.d(new c92.e(displayState, i15));
                for (k kVar : displayState.f27024f) {
                    if (kVar instanceof c92.i) {
                        iVar2.b8(new d(iVar2, kVar, 0));
                    } else if (kVar instanceof c92.g) {
                        iVar2.b8(new d(iVar2, kVar, i15));
                    } else if (kVar instanceof c92.h) {
                        iVar2.b8(new d(iVar2, kVar, i14));
                    } else if (kVar instanceof c92.j) {
                        iVar2.b8(new c(iVar2, i15));
                    }
                }
                return Unit.f80348a;
            }
            d92.h hVar = (d92.h) it.next();
            if (hVar instanceof d92.c) {
                iVar2.Z7();
                m60.e eVar = iVar2.f128478f0;
                if (eVar == null) {
                    Intrinsics.r("applicationInfoProvider");
                    throw null;
                }
                ((m60.d) eVar).g();
                d92.c cVar = (d92.c) hVar;
                String url = cVar.f54124a;
                Intrinsics.checkNotNullParameter(url, "url");
                TargetHandshakeWebView targetHandshakeWebView3 = iVar2.f128480h0;
                if (targetHandshakeWebView3 == null) {
                    Intrinsics.r("webview");
                    throw null;
                }
                e92.b targetJSInterface = new e92.b(iVar2);
                l82.c eventIntake = iVar2.a8().f54181d.e();
                Intrinsics.checkNotNullParameter(targetJSInterface, "targetJSInterface");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                q qVar = q.ARROW_BACK;
                Context context = targetHandshakeWebView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Context context2 = targetHandshakeWebView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Drawable f03 = bs1.c.f0(targetHandshakeWebView3, qVar.drawableRes(context, dl2.b.f1(context2)), Integer.valueOf(eo1.b.color_themed_text_default), null, 4);
                String string = targetHandshakeWebView3.getContext().getResources().getString(x0.back);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) targetHandshakeWebView3.f52189b;
                gestaltToolbarImpl.T(f03, string);
                gestaltToolbarImpl.N(1);
                gestaltToolbarImpl.f49713m = new qp1.b(eventIntake, i15);
                u uVar = new u(i14, targetHandshakeWebView3, eventIntake);
                WebView webView = targetHandshakeWebView3.f52190c;
                webView.setWebViewClient(uVar);
                webView.setWebChromeClient(new qp1.c(targetHandshakeWebView3, i15));
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setAllowFileAccess(false);
                webView.getSettings().setAllowContentAccess(false);
                webView.getSettings().setAllowFileAccessFromFileURLs(false);
                webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
                webView.getSettings().setSafeBrowsingEnabled(true);
                webView.addJavascriptInterface(targetJSInterface, targetHandshakeWebView3.f52188a);
                iVar2.f128481i0 = true;
                z82.b Z7 = iVar2.Z7();
                TargetHandshakeWebView targetHandshakeWebView4 = iVar2.f128480h0;
                if (targetHandshakeWebView4 == null) {
                    Intrinsics.r("webview");
                    throw null;
                }
                ((z82.j) Z7).d(targetHandshakeWebView4, true);
                iVar2.a8().f54181d.e().a(new w(System.currentTimeMillis() * 1000000));
                TargetHandshakeWebView targetHandshakeWebView5 = iVar2.f128480h0;
                if (targetHandshakeWebView5 == null) {
                    Intrinsics.r("webview");
                    throw null;
                }
                targetHandshakeWebView5.b(cVar.f54124a, cVar.f54126c, cVar.f54125b);
            } else if (hVar instanceof d92.d) {
                String str = ((d92.d) hVar).f54132a;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                iVar2.startActivity(intent);
            } else if (hVar instanceof d92.b) {
                iVar2.D5();
            } else if (hVar instanceof d92.e) {
                TargetHandshakeWebView targetHandshakeWebView6 = iVar2.f128480h0;
                if (targetHandshakeWebView6 == null) {
                    Intrinsics.r("webview");
                    throw null;
                }
                d92.e eVar2 = (d92.e) hVar;
                String str2 = eVar2.f54136a;
                if (str2 == null) {
                    str2 = "";
                }
                targetHandshakeWebView6.b(str2, eVar2.f54137b, null);
            } else if (hVar instanceof d92.f) {
                TargetHandshakeWebView targetHandshakeWebView7 = iVar2.f128480h0;
                if (targetHandshakeWebView7 == null) {
                    Intrinsics.r("webview");
                    throw null;
                }
                targetHandshakeWebView7.f52190c.reload();
            } else if (hVar instanceof d92.g) {
                z82.b Z72 = iVar2.Z7();
                TargetHandshakeWebView targetHandshakeWebView8 = iVar2.f128480h0;
                if (targetHandshakeWebView8 == null) {
                    Intrinsics.r("webview");
                    throw null;
                }
                ((z82.j) Z72).d(targetHandshakeWebView8, false);
            } else {
                continue;
            }
        }
    }
}
