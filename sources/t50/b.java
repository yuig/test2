package t50;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.io.ByteArrayOutputStream;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes.dex */
public final class b extends k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f116431a = {"com.android.launcher", "com.android.launcher2", "com.google.android.googlequicksearchbox"};

    @Override // kh2.k3
    public final void Y1(Context context, int i13) {
        byte[] byteArray;
        Intrinsics.checkNotNullParameter(context, "context");
        String valueOf = String.valueOf(i13);
        byte[] bArr = null;
        try {
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getPackageName());
            Intrinsics.checkNotNullExpressionValue(applicationIcon, "getApplicationIcon(...)");
            Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), applicationIcon.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(createBitmap);
            applicationIcon.setBounds(0, 0, applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight());
            applicationIcon.draw(canvas);
            if (createBitmap != null) {
                if (i13 == 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                } else {
                    float f13 = context.getResources().getDisplayMetrics().density;
                    Bitmap.Config config = createBitmap.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap copy = createBitmap.copy(config, true);
                    float width = copy.getWidth();
                    float height = copy.getHeight();
                    if (width <= height) {
                        width = height;
                    }
                    float f14 = width / 4;
                    float width2 = copy.getWidth() - f14;
                    Canvas canvas2 = new Canvas(copy);
                    Paint paint = new Paint(1);
                    paint.setColor(-1);
                    canvas2.drawCircle(width2, f14, f14, paint);
                    paint.setColor(-65536);
                    canvas2.drawCircle(width2, f14, (6 * f14) / 7, paint);
                    paint.setColor(-1);
                    double d2 = f14;
                    int i14 = (int) (d2 * 0.7d);
                    if (valueOf.length() > 1) {
                        i14 = (int) (d2 * 0.5d);
                    }
                    paint.setTextSize(i14 * f13);
                    paint.setFakeBoldText(true);
                    Rect rect = new Rect();
                    paint.getTextBounds(valueOf, 0, valueOf.length(), rect);
                    float width3 = rect.width() / 2;
                    if (z.h(valueOf, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, false)) {
                        width3 *= 1.25f;
                    }
                    canvas2.drawText(valueOf, width2 - width3, f14 + (rect.height() / 2), paint);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    copy.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                    byteArray = byteArrayOutputStream2.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                }
                bArr = byteArray;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Resources resources = context.getResources();
        String obj = resources.getText(resources.getIdentifier("app_name", "string", k3.g0(context))).toString();
        Uri parse = Uri.parse("content://com.android.launcher2.settings/favorites?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("iconType", (Integer) 1);
        contentValues.put("itemType", (Integer) 1);
        contentValues.put("", bArr);
        contentResolver.update(parse, contentValues, "title=?", new String[]{obj});
    }
}
