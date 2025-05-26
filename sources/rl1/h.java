package rl1;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108588i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f108589j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(k kVar, int i13) {
        super(0);
        this.f108588i = i13;
        this.f108589j = kVar;
    }

    public final Paint b() {
        int i13 = this.f108588i;
        k kVar = this.f108589j;
        switch (i13) {
            case 0:
                Paint paint = new Paint(1);
                int i14 = kVar.K;
                int i15 = l.f108624a;
                if (i14 == -1) {
                    i14 = i15;
                }
                paint.setColor(kVar.c(i14));
                return paint;
            case 1:
                Paint paint2 = new Paint(1);
                int i16 = kVar.f108617t;
                int i17 = l.f108625b;
                if (i16 == -1) {
                    i16 = i17;
                }
                paint2.setColor(kVar.c(i16));
                return paint2;
            case 7:
                Paint paint3 = new Paint(1);
                int i18 = kVar.E;
                int i19 = l.f108627d;
                if (i18 == -1) {
                    i18 = i19;
                }
                paint3.setColor(kVar.c(i18));
                return paint3;
            default:
                Paint paint4 = new Paint(1);
                int i23 = kVar.C;
                paint4.setColor(kVar.c(i23 != -1 ? i23 : -1));
                return paint4;
        }
    }

    public final Integer e() {
        int i13 = this.f108588i;
        k kVar = this.f108589j;
        switch (i13) {
            case 3:
                Context d2 = kVar.d();
                Intrinsics.checkNotNullExpressionValue(d2, "access$getContext(...)");
                return Integer.valueOf(dl2.b.F0(d2, eo1.a.comp_avatar_border_weight));
            default:
                Context d13 = kVar.d();
                Intrinsics.checkNotNullExpressionValue(d13, "access$getContext(...)");
                return Integer.valueOf(dl2.b.F0(d13, eo1.a.comp_avatar_lg_non_image_text_size));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f108588i;
        k kVar = this.f108589j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                WebImageView webImageView = kVar.f108598a;
                if (webImageView != null) {
                    return webImageView.getContext();
                }
                Intrinsics.r("avatarView");
                throw null;
            case 3:
                return e();
            case 4:
                return e();
            case 5:
                TextPaint textPaint = new TextPaint(1);
                Context d2 = kVar.d();
                Intrinsics.checkNotNullExpressionValue(d2, "access$getContext(...)");
                textPaint.setTypeface(bs1.c.u0(d2, kVar.f108600c.getFont()));
                textPaint.setTextAlign(Paint.Align.CENTER);
                int i14 = kVar.I;
                int i15 = l.f108628e;
                if (i14 == -1) {
                    i14 = i15;
                }
                textPaint.setColor(kVar.c(i14));
                return textPaint;
            case 6:
                WebImageView webImageView2 = kVar.f108598a;
                if (webImageView2 != null) {
                    return webImageView2.getResources();
                }
                Intrinsics.r("avatarView");
                throw null;
            case 7:
                return b();
            default:
                return b();
        }
    }
}
