package nr;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import rr.f1;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f91835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f91836c;

    public /* synthetic */ b(int i13, Object obj, Object obj2) {
        this.f91834a = i13;
        this.f91835b = obj;
        this.f91836c = obj2;
    }

    @Override // ak2.e
    public final void accept(Object obj) {
        int i13 = this.f91834a;
        Object obj2 = this.f91836c;
        Object obj3 = this.f91835b;
        switch (i13) {
            case 0:
                int i14 = d.f91838m0;
                ((d) obj3).p7((String) obj2);
                break;
            case 1:
                f1 this$0 = (f1) obj3;
                qr.h this_with = (qr.h) obj2;
                String expandedUrl = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                Intrinsics.checkNotNullParameter(expandedUrl, "expandedUrl");
                this$0.f109746h.d(new of0.a(null));
                Uri uri = Uri.parse(expandedUrl);
                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                this_with.getClass();
                Intrinsics.checkNotNullParameter(uri, "uri");
                this_with.f104941b.s(uri, null);
                break;
            case 2:
                Uri uri2 = (Uri) obj3;
                f1 this$02 = (f1) obj2;
                Intrinsics.checkNotNullParameter(uri2, "$uri");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Objects.toString(uri2);
                ep.b.C(null, this$02.f109746h);
                break;
            default:
                String str = (String) obj2;
                String str2 = (String) obj;
                po0.d dVar = (po0.d) ((ro0.e) obj3).getView();
                if (!a0.x0(str2)) {
                    to0.g gVar = (to0.g) dVar;
                    ((gp1.d) gVar.D0).a(str2);
                    gVar.b8(str2, str);
                }
                WebView webView = ((to0.g) dVar).f118652f0;
                if (webView != null) {
                    webView.loadUrl(str, null);
                    break;
                }
                break;
        }
    }
}
