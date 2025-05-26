package s;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.q4;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f110279a;

    /* renamed from: b, reason: collision with root package name */
    public final a f110280b;

    /* renamed from: c, reason: collision with root package name */
    public ActivityOptions f110281c;

    /* renamed from: d, reason: collision with root package name */
    public int f110282d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f110283e;

    public o() {
        this.f110279a = new Intent("android.intent.action.VIEW");
        this.f110280b = new a();
        this.f110282d = 0;
        this.f110283e = true;
    }

    public final q4 a() {
        Intent intent = this.f110279a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f110283e);
        a aVar = this.f110280b;
        Integer num = aVar.f110242a;
        Integer num2 = aVar.f110243b;
        Integer num3 = aVar.f110244c;
        Integer num4 = aVar.f110245d;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        if (num2 != null) {
            bundle2.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        if (num3 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        if (num4 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f110282d);
        int i13 = Build.VERSION.SDK_INT;
        String a13 = m.a();
        if (!TextUtils.isEmpty(a13)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a13);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i13 >= 34) {
            if (this.f110281c == null) {
                this.f110281c = l.a();
            }
            n.a(this.f110281c, false);
        }
        ActivityOptions activityOptions = this.f110281c;
        return new q4(1, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public final void b() {
        this.f110282d = 2;
        this.f110279a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
    }

    public o(r rVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f110279a = intent;
        this.f110280b = new a();
        this.f110282d = 0;
        this.f110283e = true;
        if (rVar != null) {
            intent.setPackage(rVar.f110287d.getPackageName());
            IBinder asBinder = rVar.f110286c.asBinder();
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", asBinder);
            PendingIntent pendingIntent = rVar.f110288e;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
    }
}
