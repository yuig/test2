package vo;

import android.os.Handler;
import com.pinterest.activity.PinterestActivity;
import ey.d0;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f126372b;

    public /* synthetic */ m(int i13, Runnable runnable) {
        this.f126371a = i13;
        this.f126372b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f126371a;
        Runnable verifySessionRunnable = this.f126372b;
        switch (i13) {
            case 0:
                int i14 = PinterestActivity.D;
                Intrinsics.checkNotNullParameter(verifySessionRunnable, "$verifySessionRunnable");
                new Handler().postDelayed(verifySessionRunnable, 10000L);
                break;
            default:
                LinkedHashSet linkedHashSet = d0.f60468a;
                Intrinsics.checkNotNullParameter(verifySessionRunnable, "$this_runOnThread");
                verifySessionRunnable.run();
                break;
        }
    }
}
