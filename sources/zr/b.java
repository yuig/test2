package zr;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f142746a;

    /* renamed from: b, reason: collision with root package name */
    public final a f142747b;

    public b(Context context, a adsHardware) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adsHardware, "adsHardware");
        this.f142746a = context;
        this.f142747b = adsHardware;
    }

    public final double a() {
        a aVar = this.f142747b;
        aVar.getClass();
        double T = (bf.b.T() - 6.617d) / 1.905d;
        aVar.getClass();
        return Math.sqrt(1.45d - ((((bf.b.U(aVar.f142745a) - 2820529182L) / 1.535433518E9d) * (-0.195d)) + ((((bf.b.P() - 1799707) / 432184.0d) * (-0.205d)) + (T * (-0.117d))))) * 50;
    }
}
