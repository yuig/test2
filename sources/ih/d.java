package ih;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f72258a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f72259b;

    static {
        AtomicBoolean atomicBoolean = f.f72261a;
        f72258a = 12451000;
        f72259b = new d();
    }

    public static void d(Context context) {
        AtomicBoolean atomicBoolean = f.f72261a;
        d dVar = f72259b;
        int c13 = dVar.c(context, 11925000);
        if (c13 != 0) {
            Intent a13 = dVar.a(c13, context, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + c13);
            if (a13 != null) {
                throw new GooglePlayServicesRepairableException("Google Play Services not available");
            }
            throw new GooglePlayServicesNotAvailableException();
        }
    }

    public Intent a(int i13, Context context, String str) {
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && b7.c.E(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb3 = new StringBuilder("gcore_");
        sb3.append(f72258a);
        sb3.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb3.append(str);
        }
        sb3.append("-");
        if (context != null) {
            sb3.append(context.getPackageName());
        }
        sb3.append("-");
        if (context != null) {
            try {
                sb3.append(ph.b.a(context).d(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb4 = sb3.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb4)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb4);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public int b(Context context) {
        return c(context, f72258a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|2|3|4|(4:8|2b|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(3:43|(1:49)(1:47)|48)|50|(12:52|(1:54)(1:106)|55|(2:102|103)(1:57)|58|59|60|(1:62)(2:(2:72|(1:74))|(8:80|(1:82)(1:99)|(1:84)|(1:86)(6:88|(2:93|94)|90|(1:92)|64|(1:69)(1:70))|87|64|(1:69)|70)(1:79))|63|64|(0)|70))|107|(0)(0)|55|(0)(0)|58|59|60|(0)(0)|63|64|(0)|70|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018a, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ih.d.c(android.content.Context, int):int");
    }
}
