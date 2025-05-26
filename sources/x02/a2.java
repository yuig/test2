package x02;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a2 implements ak2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131292a;

    public /* synthetic */ a2(int i13) {
        this.f131292a = i13;
    }

    @Override // ak2.e
    public final void accept(Object v13) {
        switch (this.f131292a) {
            case 0:
                Intrinsics.checkNotNullParameter(v13, "v");
                break;
            case 1:
                break;
            default:
                lb.l0.R0(new OnErrorNotImplementedException((Throwable) v13));
                break;
        }
    }

    public final String toString() {
        switch (this.f131292a) {
            case 0:
            case 1:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }
}
