package ea1;

import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58140i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xk2.k f58141j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(xk2.k kVar, int i13) {
        super(0);
        this.f58140i = i13;
        this.f58141j = kVar;
    }

    public final t1 b() {
        int i13 = this.f58140i;
        xk2.k kVar = this.f58141j;
        switch (i13) {
        }
        return ((u1) kVar.getValue()).getViewModelStore();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f58140i) {
        }
        return b();
    }
}
