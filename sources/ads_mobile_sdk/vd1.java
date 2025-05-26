package ads_mobile_sdk;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.webkit.URLUtil;
import ao2.j0;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class vd1 {

    /* renamed from: i, reason: collision with root package name */
    public static final Regex f12454i = new Regex("[^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$");

    /* renamed from: a, reason: collision with root package name */
    public final y80 f12455a;

    /* renamed from: b, reason: collision with root package name */
    public final ub1 f12456b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f12457c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f12458d;

    /* renamed from: e, reason: collision with root package name */
    public final yp0 f12459e;

    /* renamed from: f, reason: collision with root package name */
    public final x f12460f;

    /* renamed from: g, reason: collision with root package name */
    public final sb2 f12461g;

    /* renamed from: h, reason: collision with root package name */
    public final ss2 f12462h;

    public vd1(y80 deviceProperties, ub1 mraidAfmaDispatcher, j0 uiScope, j0 backgroundScope, yp0 httpClient, x activityTracker, sb2 rootTraceCreator, ss2 traceMetaSet) {
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        Intrinsics.checkNotNullParameter(mraidAfmaDispatcher, "mraidAfmaDispatcher");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        this.f12455a = deviceProperties;
        this.f12456b = mraidAfmaDispatcher;
        this.f12457c = uiScope;
        this.f12458d = backgroundScope;
        this.f12459e = httpClient;
        this.f12460f = activityTracker;
        this.f12461g = rootTraceCreator;
        this.f12462h = traceMetaSet;
    }

    public final void a(String str, ym0 ym0Var, boolean z13) {
        ok.e0 e0Var = gk0.f5596a;
        gk0.d("Store picture error: " + str, null);
        if (z13) {
            ft2.b(str);
        }
        kotlin.jvm.internal.j.z(this.f12457c, null, null, new rd1(this, ym0Var, str, null), 3);
    }

    public final Unit a(ym0 ym0Var, Map map) {
        return a(this, map, ym0Var);
    }

    public static Unit a(vd1 vd1Var, Map map, ym0 ym0Var) {
        String str;
        String str2;
        String str3;
        String str4;
        if (!vd1Var.f12455a.d()) {
            vd1Var.a("This feature is not available on the device.", ym0Var, true);
            return Unit.f80348a;
        }
        Activity c13 = vd1Var.f12460f.c();
        if (c13 == null) {
            vd1Var.a("Activity context is required to show store picture event alert.", ym0Var, true);
            return Unit.f80348a;
        }
        String str5 = (String) map.get("iurl");
        if (str5 != null && str5.length() != 0) {
            if (!URLUtil.isValidUrl(str5)) {
                vd1Var.a(a.a.k("Invalid image url: ", str5, "."), ym0Var, true);
                return Unit.f80348a;
            }
            String lastPathSegment = Uri.parse(str5).getLastPathSegment();
            if (lastPathSegment == null) {
                vd1Var.a("No image file name in ".concat(str5), ym0Var, true);
                return Unit.f80348a;
            }
            kotlin.text.j d2 = f12454i.d(lastPathSegment);
            if (d2 != null && ((kotlin.collections.b) d2.b()).b() == 3) {
                String str6 = (String) ((kotlin.collections.d1) d2.b()).get(2);
                Resources resources = c13.getResources();
                if (resources == null || (str = resources.getString(ui.a.mraid_allow_store_picture)) == null) {
                    str = "Allow Ad to store image in Picture gallery?";
                }
                String str7 = str;
                if (resources == null || (str2 = resources.getString(ui.a.mraid_save_image)) == null) {
                    str2 = "Save image";
                }
                String str8 = str2;
                if (resources == null || (str3 = resources.getString(ui.a.mraid_alert_accept)) == null) {
                    str3 = "Accept";
                }
                String str9 = str3;
                if (resources == null || (str4 = resources.getString(ui.a.mraid_alert_decline)) == null) {
                    str4 = "Decline";
                }
                kotlin.jvm.internal.j.z(vd1Var.f12457c, null, null, new sd1(c13, str8, str7, str9, str4, vd1Var, str5, lastPathSegment, str6, ym0Var, null), 3);
                return Unit.f80348a;
            }
            vd1Var.a("Invalid image file name: ".concat(lastPathSegment), ym0Var, true);
            return Unit.f80348a;
        }
        vd1Var.a("Image url cannot be empty.", ym0Var, true);
        return Unit.f80348a;
    }

    public final void a(InputStream inputStream, String str, String str2, Context context, ym0 ym0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/" + str2);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            contentValues.put("is_pending", (Integer) 1);
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (insert == null) {
            a("Unable to store picture", ym0Var, true);
            return;
        }
        FileOutputStream a13 = id2.a(context, insert, hd2.f5928d);
        int i14 = qk.e.f104043a;
        inputStream.getClass();
        a13.getClass();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            } else {
                a13.write(bArr, 0, read);
            }
        }
        if (i13 >= 30) {
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            contentResolver.update(insert, contentValues, null, null);
        }
        ok.e0 e0Var = gk0.f5596a;
        gk0.a(new qd1(str, insert));
    }
}
