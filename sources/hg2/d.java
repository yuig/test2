package hg2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import kh2.y0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xk2.q;
import xk2.s;

/* loaded from: classes4.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f69088c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f69089a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f69090b;

    public d(y0 powerManagerProvider, b callback) {
        Intrinsics.checkNotNullParameter(powerManagerProvider, "powerManagerProvider");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f69089a = powerManagerProvider;
        this.f69090b = callback;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PowerManager powerManager;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            q qVar = s.f135225b;
            if (Intrinsics.d(intent.getAction(), "android.os.action.POWER_SAVE_MODE_CHANGED") && (powerManager = (PowerManager) this.f69089a.invoke()) != null) {
                this.f69090b.invoke(Boolean.valueOf(powerManager.isPowerSaveMode()));
            }
            Unit unit = Unit.f80348a;
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            ue.c.m(th3);
        }
    }
}
