package ml0;

import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87507i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xk2.k f87508j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(xk2.k kVar, int i13) {
        super(0);
        this.f87507i = i13;
        this.f87508j = kVar;
    }

    public final t1 b() {
        int i13 = this.f87507i;
        xk2.k kVar = this.f87508j;
        switch (i13) {
        }
        return ((u1) kVar.getValue()).getViewModelStore();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f87507i) {
        }
        return b();
    }
}
