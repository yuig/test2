package kh2;

import android.app.ActivityManager;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import android.view.WindowManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class i3 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79541i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j3 f79542j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(j3 j3Var, int i13) {
        super(0);
        this.f79541i = i13;
        this.f79542j = j3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79541i;
        j3 j3Var = this.f79542j;
        switch (i13) {
            case 0:
                return (ActivityManager) j3.a(j3Var, "activity");
            case 1:
                return (ConnectivityManager) j3.a(j3Var, "connectivity");
            case 2:
                return (PowerManager) j3.a(j3Var, "power");
            default:
                return (WindowManager) j3.a(j3Var, "window");
        }
    }
}
