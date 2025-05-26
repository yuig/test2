package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class en2 extends hn2 {

    /* renamed from: e, reason: collision with root package name */
    public final Context f4908e;

    /* renamed from: f, reason: collision with root package name */
    public final y80 f4909f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en2(Context context, y80 deviceProperties) {
        super(il0.CUI_NAME_SDKINIT_INIT_DEVICE_SIGNAL);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        this.f4908e = context;
        this.f4909f = deviceProperties;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.STATIC_DEVICE;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        String str = Build.FINGERPRINT;
        PackageManager packageManager = this.f4909f.f14134d.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        boolean z13 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536) != null;
        PackageManager packageManager2 = this.f4909f.f14134d.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager2, "getPackageManager(...)");
        boolean z14 = packageManager2.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 65536) != null;
        String country = Locale.getDefault().getCountry();
        boolean booleanValue = ((Boolean) this.f4909f.f14137g.getValue()).booleanValue();
        boolean booleanValue2 = ((Boolean) this.f4909f.f14142l.getValue()).booleanValue();
        boolean booleanValue3 = ((Boolean) this.f4909f.f14139i.getValue()).booleanValue();
        boolean booleanValue4 = ((Boolean) this.f4909f.f14138h.getValue()).booleanValue();
        String language = Locale.getDefault().getLanguage();
        yk2.b bVar = new yk2.b();
        LocaleList localeList = LocaleList.getDefault();
        Intrinsics.checkNotNullExpressionValue(localeList, "getDefault(...)");
        int size = localeList.size();
        for (int i13 = 0; i13 < size; i13++) {
            String language2 = localeList.get(i13).getLanguage();
            Intrinsics.checkNotNullExpressionValue(language2, "getLanguage(...)");
            bVar.add(language2);
        }
        yk2.b a13 = kotlin.collections.e0.a(bVar);
        String str2 = (String) this.f4909f.f14141k.getValue();
        String str3 = (String) this.f4909f.f14140j.getValue();
        this.f4909f.getClass();
        long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        boolean booleanValue5 = ((Boolean) this.f4909f.f14144n.getValue()).booleanValue();
        String str4 = Build.MODEL;
        int i14 = Build.VERSION.SDK_INT;
        boolean c13 = c();
        Intrinsics.f(country);
        Intrinsics.f(language);
        Intrinsics.f(str4);
        Intrinsics.f(str);
        return new pk0(new dn2(z13, z14, country, booleanValue3, booleanValue4, language, a13, str2, str4, str, availableBytes, booleanValue2, str3, booleanValue, i14, c13, booleanValue5));
    }

    public final boolean c() {
        int identifier = this.f4908e.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            gk0.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable\n      transparent background interstitial ads.", null);
            return false;
        }
        try {
            if (this.f4908e.getPackageManager().getActivityInfo(new ComponentName(this.f4908e.getPackageName(), "com.google.android.libraries.ads.mobile.sdk.common.AdActivity"), 0).theme == identifier) {
                return true;
            }
            gk0.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable\n      transparent background interstitial ads.", null);
            return false;
        } catch (PackageManager.NameNotFoundException e13) {
            ok.e0 e0Var = gk0.f5596a;
            gk0.d(" Failed to fetch AdActivity theme: " + e13, null);
            gk0.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable\n      transparent background interstitial ads.", null);
            return false;
        }
    }
}
