package sf1;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f112658a = 0;

    static {
        c componentTypeProvider = c.B;
        Intrinsics.checkNotNullParameter(componentTypeProvider, "componentTypeProvider");
        c componentTypeProvider2 = c.D;
        Intrinsics.checkNotNullParameter(componentTypeProvider2, "componentTypeProvider");
        c componentTypeProvider3 = c.C;
        Intrinsics.checkNotNullParameter(componentTypeProvider3, "componentTypeProvider");
    }

    public static s0 a(Context context, int i13, int i14, xe0.a aVar, x1 x1Var, c cVar, ImageView.ScaleType scaleType, boolean z13, int i15, boolean z14, boolean z15, int i16) {
        xe0.a cornerRadii;
        int c13 = (i16 & 2) != 0 ? ml2.c.c(hf0.b.f69002b) : i13;
        int c14 = (i16 & 4) != 0 ? ml2.c.c(c13 / 0.5625f) : i14;
        if ((i16 & 8) != 0) {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Resources.Theme theme = context.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            int a13 = df.j1.c1(df.j1.x0(theme)) ? dl2.b.a1(context, eo1.a.comp_iconbutton_xl_rounding) : eo1.c.space_400;
            Intrinsics.checkNotNullParameter(resources, "resources");
            cornerRadii = kh2.s0.K(kh2.s0.A(a13, resources), true, true, true, true);
        } else {
            cornerRadii = aVar;
        }
        x1 videoViewModel = (i16 & 16) != 0 ? y.f112798a : x1Var;
        c backgroundProvider = (i16 & 32) != 0 ? c.f112533z : cVar;
        ImageView.ScaleType imageScaleType = (i16 & 64) != 0 ? ImageView.ScaleType.CENTER_CROP : scaleType;
        boolean z16 = (i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? false : z13;
        int i17 = (i16 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? 0 : i15;
        boolean z17 = (i16 & 1024) != 0 ? false : z14;
        boolean z18 = (i16 & 2048) == 0 ? z15 : false;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cornerRadii, "cornerRadii");
        Intrinsics.checkNotNullParameter(videoViewModel, "videoViewModel");
        Intrinsics.checkNotNullParameter(backgroundProvider, "backgroundProvider");
        Intrinsics.checkNotNullParameter(imageScaleType, "imageScaleType");
        return new s0(c13, c14, cornerRadii, videoViewModel, backgroundProvider, imageScaleType, z16, true, i17, z17, z18);
    }
}
