package ads_mobile_sdk;

import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class r80 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y80 f10546a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r80(y80 y80Var) {
        super(0);
        this.f10546a = y80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z13;
        if (Build.VERSION.SDK_INT >= 30) {
            if (this.f10546a.f14134d.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z13 = true;
                return Boolean.valueOf(z13);
            }
        }
        z13 = false;
        return Boolean.valueOf(z13);
    }
}
