package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class e0 implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15999b;

    public /* synthetic */ e0(Object obj, int i13) {
        this.f15998a = i13;
        this.f15999b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f15998a) {
            case 0:
                ((n0) this.f15999b).L();
                break;
            case 1:
                ((Runnable) this.f15999b).run();
                break;
            case 2:
                Function0 function0 = (Function0) this.f15999b;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                ((vj.b) this.f15999b).e();
                break;
        }
    }
}
