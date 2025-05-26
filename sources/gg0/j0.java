package gg0;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.u1;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64940i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f64941j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, int i13) {
        super(0);
        this.f64940i = i13;
        this.f64941j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f64940i;
        Object obj = this.f64941j;
        switch (i13) {
            case 0:
                return (Fragment) obj;
            case 1:
                return (u1) ((Function0) obj).invoke();
            default:
                return ((u1) ((xk2.k) obj).getValue()).getViewModelStore();
        }
    }
}
