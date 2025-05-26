package i3;

import android.R;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import ao2.m0;
import b3.s;
import b3.t;
import b3.z0;
import e5.d;
import h3.e;
import h3.h0;
import java.util.List;
import kotlin.collections.q0;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f71448a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f71449b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f71450c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f71451d = {R.attr.name, R.attr.pathData};

    public static final s a(d dVar) {
        Object obj = dVar.f57216c;
        if (!((((Shader) obj) == null && dVar.f57215b == 0) ? false : true)) {
            return null;
        }
        Shader shader = (Shader) obj;
        return shader != null ? new t(shader) : new z0(androidx.compose.ui.graphics.a.c(dVar.f57215b));
    }

    public static final void b(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, e eVar) {
        TypedArray d03 = m0.d0(resources, theme, attributeSet, f71451d);
        aVar.c(d03.getChangingConfigurations());
        String string = d03.getString(0);
        aVar.c(d03.getChangingConfigurations());
        if (string == null) {
            string = "";
        }
        String str = string;
        String string2 = d03.getString(1);
        aVar.c(d03.getChangingConfigurations());
        List f13 = string2 == null ? h0.f66696a : h1.b.f(aVar.f71447c, string2);
        d03.recycle();
        eVar.c();
        eVar.f66635i.add(new h3.d(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, f13, BitmapUtils.BITMAP_TO_JPEG_SIZE));
    }

    public static final void c(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, e eVar) {
        TypedArray d03 = m0.d0(resources, theme, attributeSet, f71449b);
        aVar.c(d03.getChangingConfigurations());
        float b13 = aVar.b(d03, "rotation", 5, 0.0f);
        float f13 = d03.getFloat(1, 0.0f);
        aVar.c(d03.getChangingConfigurations());
        float f14 = d03.getFloat(2, 0.0f);
        aVar.c(d03.getChangingConfigurations());
        float b14 = aVar.b(d03, "scaleX", 3, 1.0f);
        float b15 = aVar.b(d03, "scaleY", 4, 1.0f);
        float b16 = aVar.b(d03, "translateX", 6, 0.0f);
        float b17 = aVar.b(d03, "translateY", 7, 0.0f);
        String string = d03.getString(0);
        aVar.c(d03.getChangingConfigurations());
        String str = string == null ? "" : string;
        d03.recycle();
        q0 q0Var = h0.f66696a;
        eVar.c();
        eVar.f66635i.add(new h3.d(str, b13, f13, f14, b14, b15, b16, b17, q0Var, BitmapUtils.BITMAP_TO_JPEG_SIZE));
    }
}
