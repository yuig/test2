package sp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import pk.a0;
import ps0.y;
import wa2.l;

/* loaded from: classes3.dex */
public final class c extends l {

    /* renamed from: l, reason: collision with root package name */
    public final int f114844l;

    /* renamed from: m, reason: collision with root package name */
    public final int f114845m;

    /* renamed from: n, reason: collision with root package name */
    public final int f114846n;

    /* renamed from: o, reason: collision with root package name */
    public final tn1.c f114847o;

    /* renamed from: p, reason: collision with root package name */
    public StaticLayout f114848p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f114849q;

    public c(Context context) {
        super(context);
        List list;
        this.f114849q = "";
        int i13 = eo1.b.color_themed_light_gray;
        Object obj = d5.a.f53679a;
        this.f114845m = context.getColor(i13);
        this.f114846n = context.getResources().getDimensionPixelSize(r0.corner_radius_large);
        y yVar = tn1.c.f118612d;
        vn1.c b13 = yVar.b();
        vn1.b bVar = tn1.c.f118615g;
        switch (yVar.f101325a) {
            case 10:
                list = ej1.d.f59105n;
                break;
            default:
                list = tn1.c.f118616h;
                break;
        }
        this.f114847o = new tn1.c(context, new tn1.b(b13, bVar, list, vn1.g.BODY_300));
        this.f114844l = a0.K(12, context.getResources());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f128843f.setColor(this.f114845m);
        this.f128843f.setAlpha(RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO);
        RectF rectF = new RectF(this.f128839b, this.f128840c, r1 + this.f128841d, r3 + this.f128842e);
        int i13 = this.f114846n;
        canvas.drawRoundRect(rectF, i13, i13, this.f128843f);
        d();
        this.f128843f.setAlpha(255);
        canvas.save();
        int i14 = this.f114844l;
        canvas.translate(i14, i14);
        StaticLayout staticLayout = this.f114848p;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    public final void h(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        CharSequence source = charSequence;
        int i13 = this.f128841d - (this.f114844l * 2);
        int length = source.length();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        Intrinsics.checkNotNullParameter(source, "source");
        tn1.c paint = this.f114847o;
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f114848p = com.bumptech.glide.d.z(source, length, paint, i13, alignment, truncateAt, i13, 6);
    }
}
