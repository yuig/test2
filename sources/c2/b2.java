package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class b2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24559i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f24560j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(int i13, Function0 function0) {
        super(1);
        this.f24559i = i13;
        this.f24560j = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f24559i;
        Function0 function0 = this.f24560j;
        switch (i13) {
            case 0:
                long j13 = ((a3.c) obj).f482a;
                function0.invoke();
                return Unit.f80348a;
            default:
                return new n4.h(d7.b.a(ml2.c.c(((Number) function0.invoke()).floatValue()), 0));
        }
    }
}
