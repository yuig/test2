package pm1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import dl2.b;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import om1.c;
import om1.e;
import om1.f;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f100709a = f0.j(f.WASH_WHITE, f.WASH_DARK_GRAY);

    /* renamed from: b, reason: collision with root package name */
    public static final List f100710b = f0.j(f.TRANSPARENT_DARK_GRAY, f.TRANSPARENT_RED, f.TRANSPARENT_ALWAYS_LIGHT, f.TRANSPARENT_GRAY, f.TRANSPARENT_WHITE, f.TRANSPARENT_ALWAYS_DARK);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.graphics.drawable.GradientDrawable a(android.content.Context r2, om1.c r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            boolean r1 = dl2.b.T1(r2)
            if (r1 != 0) goto L26
            om1.f r1 = r3.f96641c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r0 = pm1.a.f100709a
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L26
            int r0 = om1.u.gestalt_icon_button_wash_round
            android.graphics.drawable.Drawable r0 = bs1.c.c0(r2, r0)
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            goto L2b
        L26:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
        L2b:
            boolean r1 = r3.f96644f
            if (r1 == 0) goto L36
            om1.f r1 = r3.f96641c
            int r1 = r1.getBackgroundColor$iconbutton_release()
            goto L3a
        L36:
            int r1 = c(r3)
        L3a:
            int r1 = dl2.b.x0(r2, r1)
            d7.b.A0(r0, r1)
            om1.e r3 = r3.f96640b
            int r3 = r3.getBorderRadius()
            float r2 = dl2.b.D0(r2, r3)
            r0.setCornerRadius(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pm1.a.a(android.content.Context, om1.c):android.graphics.drawable.GradientDrawable");
    }

    public static final BitmapDrawable b(Context context, c cVar) {
        int height;
        int width;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        e eVar = cVar.f96640b;
        int F0 = b.F0(context, eVar.getIconSize$iconbutton_release());
        Drawable e13 = e(context, cVar);
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        BitmapDrawable p03 = d7.b.p0(e13, resources, F0, F0);
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int F02 = b.F0(context, eVar.getBackgroundSize());
        GradientDrawable a13 = a(context, cVar);
        Resources resources2 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        BitmapDrawable drawable = d7.b.p0(a13, resources2, F02, F02);
        int i13 = (F02 - F0) / 2;
        Intrinsics.checkNotNullParameter(p03, "<this>");
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{p03});
        layerDrawable.setLayerInset(0, i13, i13, i13, i13);
        Resources resources3 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        Intrinsics.checkNotNullParameter(layerDrawable, "<this>");
        Intrinsics.checkNotNullParameter(resources3, "resources");
        Intrinsics.checkNotNullParameter(drawable, "background");
        layerDrawable.setBounds(0, 0, layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight());
        drawable.setBounds(0, 0, layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight());
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
        Intrinsics.checkNotNullParameter(layerDrawable, "<this>");
        Intrinsics.checkNotNullParameter(resources3, "resources");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (layerDrawable.getIntrinsicHeight() > 0) {
            height = layerDrawable.getIntrinsicHeight();
        } else {
            if (layerDrawable.getBounds().height() <= 0) {
                throw new IllegalArgumentException("Drawable must have intrinsic height or bounds greater than zero.");
            }
            height = layerDrawable.getBounds().height();
        }
        if (layerDrawable.getIntrinsicWidth() > 0) {
            width = layerDrawable.getIntrinsicWidth();
        } else {
            if (layerDrawable.getBounds().width() <= 0) {
                throw new IllegalArgumentException("Drawable must have intrinsic width or bounds greater than zero.");
            }
            width = layerDrawable.getBounds().width();
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        layerDrawable.draw(new Canvas(createBitmap));
        Bitmap createBitmap2 = Bitmap.createBitmap(width, height, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap2, "createBitmap(...)");
        drawable.draw(new Canvas(createBitmap2));
        Bitmap createBitmap3 = Bitmap.createBitmap(width, height, config);
        Intrinsics.checkNotNullExpressionValue(createBitmap3, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap3);
        Paint paint = new Paint();
        canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(mode));
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        return new BitmapDrawable(resources3, createBitmap3);
    }

    public static final int c(c cVar) {
        f fVar = cVar.f96641c;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (f100710b.contains(fVar)) {
            return eo1.a.comp_iconbutton_transparent_background_color;
        }
        f fVar2 = f.WASH_DARK_GRAY;
        f fVar3 = cVar.f96641c;
        return fVar3 == fVar2 ? eo1.a.comp_iconbutton_graywash_disabled_background_color : fVar3 == f.WASH_WHITE ? eo1.a.comp_iconbutton_whitewash_disabled_background_color : eo1.a.comp_iconbutton_disabled_background_color;
    }

    public static final int d(c cVar) {
        f fVar = cVar.f96641c;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (f100710b.contains(fVar)) {
            return eo1.a.comp_iconbutton_disabled_icon_color;
        }
        f fVar2 = f.WASH_DARK_GRAY;
        f fVar3 = cVar.f96641c;
        return fVar3 == fVar2 ? eo1.a.comp_iconbutton_graywash_disabled_icon_color : fVar3 == f.WASH_WHITE ? eo1.a.comp_iconbutton_whitewash_disabled_icon_color : eo1.a.comp_iconbutton_disabled_icon_color;
    }

    public static final Drawable e(Context context, c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable c03 = bs1.c.c0(context, cVar.f96639a.drawableRes(context));
        d7.b.A0(c03, b.x0(context, cVar.f96644f ? cVar.f96641c.getIconColor$iconbutton_release() : d(cVar)));
        return c03;
    }
}
