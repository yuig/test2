package l7;

import android.view.ViewGroup;
import com.pinterest.feature.ideaPinCreation.canvas.view.IdeaPinCreationCanvasCropperContainer;
import kotlin.jvm.internal.Intrinsics;
import pk.v2;

/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f81851b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81852c;

    public /* synthetic */ r0(Object obj, float f13, int i13) {
        this.f81850a = i13;
        this.f81852c = obj;
        this.f81851b = f13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f81850a;
        float f13 = this.f81851b;
        Object obj = this.f81852c;
        switch (i13) {
            case 0:
                n8.s sVar = (n8.s) ((s0) ((c0.x0) obj).f24392b).f81859d;
                a7.q a13 = sVar.f89882k.a();
                a13.f1190w = f13;
                androidx.media3.common.b bVar = new androidx.media3.common.b(a13);
                sVar.f89882k = bVar;
                sVar.f89878g.c(bVar, v2.f100502e);
                return;
            default:
                IdeaPinCreationCanvasCropperContainer this$0 = (IdeaPinCreationCanvasCropperContainer) obj;
                int i14 = IdeaPinCreationCanvasCropperContainer.f45968l;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                xt0.f fVar = this$0.f45969a;
                ViewGroup.LayoutParams layoutParams = fVar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.height = ml2.c.c((2 * this$0.f45971c) + f13);
                marginLayoutParams.topMargin = ml2.c.c(this$0.f45975g.height() * this$0.f45979k);
                fVar.setLayoutParams(marginLayoutParams);
                return;
        }
    }
}
