package tt0;

import android.content.Context;
import android.graphics.Paint;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class z0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119258i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a1 f119259j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(a1 a1Var, int i13) {
        super(0);
        this.f119258i = i13;
        this.f119259j = a1Var;
    }

    public final Paint b() {
        int i13 = this.f119258i;
        a1 a1Var = this.f119259j;
        switch (i13) {
            case 0:
                Paint paint = new Paint(1);
                Context context = a1Var.f119070a;
                int i14 = eo1.b.color_white_mochimalist_0_opacity_40;
                Object obj = d5.a.f53679a;
                paint.setColor(context.getColor(i14));
                return paint;
            case 1:
                Paint paint2 = new Paint(1);
                paint2.setColor(dl2.b.x0(a1Var.f119070a, eo1.a.sema_color_background_wash_dark));
                return paint2;
            case 2:
                Paint paint3 = new Paint(1);
                paint3.setColor(dl2.b.x0(a1Var.f119070a, eo1.a.color_yellow_caramellow_300));
                return paint3;
            default:
                Paint paint4 = new Paint(1);
                paint4.setColor(dl2.b.x0(a1Var.f119070a, eo1.a.base_color_grayscale_0));
                return paint4;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f119258i) {
        }
        return b();
    }
}
