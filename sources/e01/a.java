package e01;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import bs1.c;
import c0.d;
import com.pinterest.feature.pear.util.ApplicationSelectionReceiver;
import i92.k;
import java.io.File;
import kg.p;
import kotlin.jvm.internal.Intrinsics;
import m60.e;
import m60.x0;
import qb0.b;
import rw0.f;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final k f56759a;

    /* renamed from: b, reason: collision with root package name */
    public final f f56760b;

    /* renamed from: c, reason: collision with root package name */
    public final e f56761c;

    public a(k toastUtils, f mediaUtils, e applicationInfoProvider) {
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(mediaUtils, "mediaUtils");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        this.f56759a = toastUtils;
        this.f56760b = mediaUtils;
        this.f56761c = applicationInfoProvider;
    }

    public static String a(Context context, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        String c13 = b.c(context, null, bitmap, a.a.g("insight_", System.currentTimeMillis()), context.getExternalCacheDir(), true);
        Intrinsics.checkNotNullExpressionValue(c13, "decodeImageUri(...)");
        return c13;
    }

    public final void b(Context context, Bitmap bitmap) {
        Uri uri;
        Intrinsics.checkNotNullParameter(context, "context");
        if (bitmap != null) {
            String str = "insight_" + System.currentTimeMillis();
            this.f56760b.getClass();
            uri = f.a(context, bitmap, str);
        } else {
            uri = null;
        }
        k kVar = this.f56759a;
        if (uri == null) {
            kVar.i(c.d2(context, x0.generic_error));
        } else {
            kVar.m(c.d2(context, iy1.f.pear_image_saved));
            c(context, d.R2(uri));
        }
    }

    public final void c(Context context, File file) {
        Uri B = p.B(context, file, this.f56761c);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("image/jpeg");
        intent.setClipData(ClipData.newRawUri(null, B));
        intent.setFlags(1);
        intent.putExtra("android.intent.extra.STREAM", B);
        context.startActivity(Intent.createChooser(intent, null, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) ApplicationSelectionReceiver.class), 167772160).getIntentSender()));
    }

    public final void d(Context context, String imagePath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        c(context, new File(imagePath));
    }
}
