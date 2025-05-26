package b2;

import android.content.res.Resources;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21146i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f21147j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f21148k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f21149l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j13, Function0 function0, boolean z13) {
        super(1);
        this.f21148k = j13;
        this.f21149l = function0;
        this.f21147j = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j13 = this.f21148k;
        int i13 = this.f21146i;
        Object obj2 = this.f21149l;
        boolean z13 = this.f21147j;
        switch (i13) {
            case 0:
                y2.d dVar = (y2.d) obj;
                return dVar.a(new k1.b0((Function0) obj2, z13, c0.d.D(dVar, a3.f.d(dVar.f136664a.g()) / 2.0f), new b3.p(j13, 5, Build.VERSION.SDK_INT >= 29 ? b3.q.f21347a.a(j13, 5) : new PorterDuffColorFilter(androidx.compose.ui.graphics.a.u(j13), androidx.compose.ui.graphics.a.w(5)))));
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!z13) {
                    return rn1.a.y(it, ep.b.x("", "string", ""), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
                }
                zv0.d dVar2 = (zv0.d) obj2;
                Resources resources = dVar2.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String z14 = f0.h.z(resources, j13, false, 12);
                Resources resources2 = dVar2.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                String string = f0.h.z(resources2, j13, true, 4);
                String string2 = dVar2.getResources().getString(aq1.h.idea_pin_video_clip_duration, z14);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Intrinsics.checkNotNullParameter(string2, "string");
                u50.f0 f0Var = new u50.f0(string2);
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, f0Var, null, null, null, null, 0, null, null, null, null, false, 0, new u50.f0(string), null, null, null, null, false, null, null, 2093054);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z13, zv0.d dVar, long j13) {
        super(1);
        this.f21147j = z13;
        this.f21149l = dVar;
        this.f21148k = j13;
    }
}
