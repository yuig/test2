package we1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.util.Base64;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.r7;
import com.pinterest.api.model.xf;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebImageView f129342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f129343c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f129344d;

    public f(WebImageView webImageView, ViewGroup viewGroup, int i13, int i14) {
        this.f129341a = i14;
        this.f129342b = webImageView;
        this.f129344d = viewGroup;
        this.f129343c = i13;
    }

    @Override // hs1.c
    public final void a(boolean z13) {
        String maskImage;
        Bitmap maskBitmap;
        ye1.l lVar;
        ye1.p pVar;
        int i13 = this.f129341a;
        int i14 = this.f129343c;
        ViewGroup viewGroup = this.f129344d;
        WebImageView webImageView = this.f129342b;
        switch (i13) {
            case 0:
                Bitmap originalBitmap = webImageView.C;
                if (originalBitmap != null) {
                    webImageView.setVisibility(0);
                    r rVar = ((g) viewGroup).f129351b;
                    if (rVar != null) {
                        e eVar = (e) rVar;
                        Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
                        if (i14 < eVar.f129339b.size()) {
                            r7 bitmapMask = ((xf) eVar.f129339b.get(i14)).getBitmapMask();
                            r7 bitmapMask2 = ((xf) eVar.f129339b.get(i14)).getBitmapMask();
                            if (bitmapMask2 != null && (maskImage = bitmapMask2.getMaskImage()) != null) {
                                byte[] decode = Base64.decode(maskImage, 0);
                                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                                Float f13 = bitmapMask != null ? bitmapMask.f41492e : null;
                                Float f14 = bitmapMask != null ? bitmapMask.f41493f : null;
                                if (f13 != null && f14 != null) {
                                    float floatValue = f14.floatValue();
                                    float floatValue2 = f13.floatValue();
                                    Float f15 = bitmapMask != null ? bitmapMask.f41495h : null;
                                    Float f16 = bitmapMask != null ? bitmapMask.f41494g : null;
                                    if (f15 != null && f16 != null) {
                                        float floatValue3 = f16.floatValue();
                                        float floatValue4 = f15.floatValue();
                                        int height = originalBitmap.getHeight();
                                        float width = originalBitmap.getWidth();
                                        float f17 = height;
                                        Bitmap createBitmap = Bitmap.createBitmap(originalBitmap, (int) (floatValue2 * width), (int) (floatValue * f17), (int) (floatValue3 * width), (int) (floatValue4 * f17));
                                        Bitmap c03 = ((createBitmap != null ? Integer.valueOf(createBitmap.getHeight()) : null) == null || (createBitmap != null ? Integer.valueOf(createBitmap.getWidth()) : null) == null) ? null : c0.d.c0(decodeByteArray, r7.intValue(), r9.intValue());
                                        if (c03 != null) {
                                            Intrinsics.checkNotNullParameter(c03, "<this>");
                                            int width2 = c03.getWidth();
                                            int height2 = c03.getHeight();
                                            int i15 = width2 * height2;
                                            int[] iArr = new int[i15];
                                            c03.getPixels(iArr, 0, width2, 0, 0, width2, height2);
                                            for (int i16 = 0; i16 < i15; i16++) {
                                                int i17 = iArr[i16];
                                                if (i17 == -16777216) {
                                                    i17 = 0;
                                                }
                                                iArr[i16] = i17;
                                            }
                                            maskBitmap = Bitmap.createBitmap(iArr, width2, height2, Bitmap.Config.ARGB_8888);
                                            Intrinsics.checkNotNullExpressionValue(maskBitmap, "createBitmap(...)");
                                        } else {
                                            maskBitmap = null;
                                        }
                                        if (createBitmap != null && maskBitmap != null) {
                                            PorterDuff.Mode porterDuffMode = PorterDuff.Mode.DST_IN;
                                            Intrinsics.checkNotNullParameter(createBitmap, "<this>");
                                            Intrinsics.checkNotNullParameter(maskBitmap, "maskBitmap");
                                            Intrinsics.checkNotNullParameter(porterDuffMode, "porterDuffMode");
                                            int width3 = maskBitmap.getWidth();
                                            int height3 = maskBitmap.getHeight();
                                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                            Bitmap createBitmap2 = Bitmap.createBitmap(width3, height3, config);
                                            Intrinsics.checkNotNullExpressionValue(createBitmap2, "createBitmap(...)");
                                            Paint paint = new Paint();
                                            paint.setAntiAlias(true);
                                            paint.setXfermode(new PorterDuffXfermode(porterDuffMode));
                                            Canvas canvas = new Canvas(createBitmap2);
                                            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                                            canvas.drawBitmap(maskBitmap, 0.0f, 0.0f, paint);
                                            paint.setXfermode(null);
                                            s sVar = (s) eVar.getViewIfBound();
                                            if (sVar != null) {
                                                Intrinsics.checkNotNullParameter(createBitmap2, "<this>");
                                                Bitmap result = Bitmap.createBitmap(createBitmap2.getWidth() + 10, createBitmap2.getHeight() + 10, config);
                                                Intrinsics.checkNotNullExpressionValue(result, "createBitmap(...)");
                                                Canvas canvas2 = new Canvas(result);
                                                Paint paint2 = new Paint(1);
                                                paint2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
                                                canvas2.drawBitmap(createBitmap2, -5.0f, 0.0f, paint2);
                                                canvas2.drawBitmap(createBitmap2, 0.0f, -5.0f, paint2);
                                                canvas2.drawBitmap(createBitmap2, 5.0f, 0.0f, paint2);
                                                canvas2.drawBitmap(createBitmap2, 0.0f, 5.0f, paint2);
                                                paint2.setColorFilter(null);
                                                canvas2.drawBitmap(createBitmap2, 0.0f, 0.0f, (Paint) null);
                                                g gVar = (g) sVar;
                                                Intrinsics.checkNotNullParameter(result, "result");
                                                WebImageView webImageView2 = new WebImageView(gVar.getContext());
                                                ConstraintLayout constraintLayout = gVar.f129352c;
                                                if (constraintLayout != null) {
                                                    webImageView2.setImageBitmap(result);
                                                    ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                                                    layoutParams.f17671i = constraintLayout.getId();
                                                    layoutParams.f17691t = constraintLayout.getId();
                                                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
                                                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
                                                    webImageView2.setLayoutParams(layoutParams);
                                                    gVar.f129353d.add(webImageView2);
                                                    constraintLayout.addView(webImageView2);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            default:
                Bitmap bitmap = webImageView.C;
                if (bitmap != null && (pVar = (lVar = (ye1.l) viewGroup).f138874f) != null) {
                    ye1.u uVar = (ye1.u) pVar;
                    Context context = lVar.f138871c;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    Intrinsics.checkNotNullParameter(bitmap, "<this>");
                    if (qb0.b.d(bitmap)) {
                        yk1.n viewIfBound = uVar.getViewIfBound();
                        ye1.n nVar = viewIfBound instanceof ye1.n ? (ye1.n) viewIfBound : null;
                        if (nVar != null) {
                            ye1.l lVar2 = (ye1.l) nVar;
                            WebImageView webImageView3 = i14 != 0 ? i14 != 1 ? i14 != 2 ? i14 != 3 ? null : lVar2.f138878j : lVar2.f138877i : lVar2.f138876h : lVar2.f138875g;
                            if (webImageView3 != null) {
                                webImageView3.setColorFilter(new PorterDuffColorFilter(dl2.b.x0(lVar2.f138871c, eo1.a.color_background_dark_opacity_100), PorterDuff.Mode.SRC_ATOP));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
