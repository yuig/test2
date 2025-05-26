package ads_mobile_sdk;

import a.zb;
import android.content.Context;
import android.os.BatteryManager;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class lj extends tl {

    /* renamed from: j, reason: collision with root package name */
    public final BatteryManager f7857j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(Context context, oh0 flags, zb clock, j0 backgroundScope) {
        super(flags.o(), clock, backgroundScope, flags.m(), flags.n(), 0);
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f7857j = (BatteryManager) context.getSystemService(BatteryManager.class);
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.BATTERY;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        return new pk0(new kj(this.f7857j.getIntProperty(4) / 100.0d, this.f7857j.isCharging()));
    }
}
