package dy0;

import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public static final b f56540i = new b(3);

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i1.m0 AnimatedVisibility = (i1.m0) obj;
        ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        i2.s sVar = (i2.s) ((i2.o) obj2);
        g3.b M0 = com.bumptech.glide.c.M0(rm1.q.PINTEREST.drawableRes((Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b)), sVar);
        long t23 = dl2.b.t2(new u50.e(eo1.a.sema_color_icon_primary), sVar);
        com.bumptech.glide.c.b(M0, null, androidx.compose.foundation.layout.e.j(u2.n.f120041b, com.bumptech.glide.d.A(eo1.c.space_1500, sVar)), null, null, 0.0f, new b3.p(t23, 5, Build.VERSION.SDK_INT >= 29 ? b3.q.f21347a.a(t23, 5) : new PorterDuffColorFilter(androidx.compose.ui.graphics.a.u(t23), androidx.compose.ui.graphics.a.w(5))), sVar, 56, 56);
        return Unit.f80348a;
    }
}
