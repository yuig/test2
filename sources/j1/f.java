package j1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ co2.q f74055i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f74056j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(co2.q qVar, Object obj) {
        super(0);
        this.f74055i = qVar;
        this.f74056j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f74055i.g(this.f74056j);
        return Unit.f80348a;
    }
}
