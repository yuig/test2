package rb;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f107072a;

    /* renamed from: b, reason: collision with root package name */
    public final f f107073b;

    /* renamed from: c, reason: collision with root package name */
    public final a f107074c;

    /* renamed from: d, reason: collision with root package name */
    public final f f107075d;

    /* renamed from: e, reason: collision with root package name */
    public final f f107076e;

    public l(Context context, vb.b taskExecutor) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        a batteryChargingTracker = new a(applicationContext, taskExecutor, 0);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
        a batteryNotLowTracker = new a(applicationContext2, taskExecutor, 1);
        Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context.applicationContext");
        String str = j.f107070a;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        i networkStateTracker = new i(context2, taskExecutor);
        Context applicationContext3 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "context.applicationContext");
        a storageNotLowTracker = new a(applicationContext3, taskExecutor, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.f107072a = context;
        this.f107073b = batteryChargingTracker;
        this.f107074c = batteryNotLowTracker;
        this.f107075d = networkStateTracker;
        this.f107076e = storageNotLowTracker;
    }
}
