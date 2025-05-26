package sr;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.x;
import com.pinterest.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;
import so.m4;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115052a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final us1.a f115053b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f115054c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f115055d;

    public f(us1.a activity, x deepLinkLogging, lu1.b baseActivityHelper) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(deepLinkLogging, "deepLinkLogging");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        this.f115053b = activity;
        this.f115054c = deepLinkLogging;
        this.f115055d = baseActivityHelper;
    }

    public final void a(u70.a bottomNavTabType, Bundle bundle) {
        int i13 = this.f115052a;
        Object obj = this.f115055d;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bottomNavTabType, "bottomNavTabType");
                us1.a aVar = this.f115053b;
                aVar.startActivity(((lu1.c) ((lu1.b) obj)).g(aVar.getContext(), bottomNavTabType, bundle));
                break;
            default:
                Intrinsics.checkNotNullParameter(bottomNavTabType, "bottomNavTabType");
                ((f) obj).a(bottomNavTabType, bundle);
                break;
        }
    }

    public final void b(Bundle bundle) {
        int i13 = this.f115052a;
        Object obj = this.f115055d;
        switch (i13) {
            case 0:
                ((x) this.f115054c).v("home");
                us1.a aVar = this.f115053b;
                if (bundle != null) {
                    aVar.getContext().getIntent().putExtras(bundle);
                }
                ((lu1.c) ((lu1.b) obj)).k(aVar.getContext(), false);
                aVar.g();
                break;
            default:
                ((f) obj).b(bundle);
                break;
        }
    }

    public final void c(Navigation navigation) {
        String queryParameter;
        String queryParameter2;
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        lu1.b bVar = (lu1.b) this.f115055d;
        us1.a aVar = this.f115053b;
        Intent h10 = ((lu1.c) bVar).h(aVar.getContext(), navigation);
        h10.putExtra("com.pinterest.EXTRA_IS_DEEPLINK", true);
        Uri data = aVar.getContext().getIntent().getData();
        if (data != null && (queryParameter2 = data.getQueryParameter("utm_pai")) != null) {
            h10.putExtra("com.pinterest.utm_pai", queryParameter2);
        }
        Uri data2 = aVar.getContext().getIntent().getData();
        if (data2 != null && (queryParameter = data2.getQueryParameter("utm_source")) != null) {
            h10.putExtra("com.pinterest.utm_source", queryParameter);
        }
        aVar.startActivity(h10);
        aVar.g();
    }

    public final void d(Navigation navigation) {
        switch (this.f115052a) {
            case 0:
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                c(navigation);
                this.f115053b.g();
                break;
            default:
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                ((f) this.f115055d).d(navigation);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        r6 = kotlin.text.StringsKt__StringsKt.split$default(r12, new java.lang.String[]{","}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        r5 = kotlin.text.StringsKt__StringsKt.split$default(r5, new java.lang.String[]{","}, false, 0, 6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.net.Uri r27, java.lang.String r28, java.lang.String r29, java.util.HashMap r30) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sr.f.e(android.net.Uri, java.lang.String, java.lang.String, java.util.HashMap):void");
    }

    public final void f(u70.a tabType, Bundle extras) {
        switch (this.f115052a) {
            case 0:
                Intrinsics.checkNotNullParameter(tabType, "tabType");
                Intrinsics.checkNotNullParameter(extras, "extras");
                a(tabType, extras);
                break;
            default:
                Intrinsics.checkNotNullParameter(tabType, "tabType");
                Intrinsics.checkNotNullParameter(extras, "extras");
                ((f) this.f115055d).f(tabType, extras);
                break;
        }
    }

    public final boolean g(Bundle bundle) {
        switch (this.f115052a) {
            case 0:
                b(bundle);
                return true;
            default:
                return ((f) this.f115055d).g(bundle);
        }
    }

    public f(us1.a activity, tb.c defaultLoggingWebhookDeeplinkUtil, m4 navigationWebhookDeeplinkUtilFactory) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(defaultLoggingWebhookDeeplinkUtil, "defaultLoggingWebhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(navigationWebhookDeeplinkUtilFactory, "navigationWebhookDeeplinkUtilFactory");
        this.f115053b = activity;
        this.f115054c = defaultLoggingWebhookDeeplinkUtil;
        this.f115055d = navigationWebhookDeeplinkUtilFactory.a(activity);
    }
}
