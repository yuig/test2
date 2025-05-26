package ss1;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115142i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Activity f115143j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Activity activity, int i13) {
        super(1);
        this.f115142i = i13;
        this.f115143j = activity;
    }

    public final void b(n82.b withProvider) {
        int i13 = this.f115142i;
        Activity activity = this.f115143j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(withProvider, "$this$withProvider");
                if (withProvider.f89936a == activity) {
                    withProvider.f89936a = null;
                    break;
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(withProvider, "$this$withProvider");
                if (withProvider.f89936a == null) {
                    withProvider.f89936a = activity;
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(withProvider, "$this$withProvider");
                withProvider.f89936a = activity;
                break;
        }
    }

    public final void e(f withProvider) {
        int i13 = this.f115142i;
        Activity activity = this.f115143j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(withProvider, "$this$withProvider");
                Intrinsics.g(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                withProvider.getClass();
                withProvider.f115146a = new ts1.b(fragmentActivity);
                withProvider.f115147b = fragmentActivity;
                break;
            default:
                Intrinsics.checkNotNullParameter(withProvider, "$this$withProvider");
                if (withProvider.f115147b == activity) {
                    withProvider.f115146a = null;
                    withProvider.f115147b = null;
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f115142i) {
            case 0:
                e((f) obj);
                break;
            case 1:
                e((f) obj);
                break;
            case 2:
                b((n82.b) obj);
                break;
            case 3:
                b((n82.b) obj);
                break;
            default:
                b((n82.b) obj);
                break;
        }
        return Unit.f80348a;
    }
}
