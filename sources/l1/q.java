package l1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81360i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f81361j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f81362k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(boolean z13, Function0 function0, int i13) {
        super(0);
        this.f81360i = i13;
        this.f81361j = z13;
        this.f81362k = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f81360i;
        Function0 function0 = this.f81362k;
        boolean z13 = this.f81361j;
        switch (i13) {
            case 0:
                if (z13) {
                    function0.invoke();
                }
                return Unit.f80348a;
            default:
                Boolean valueOf = Boolean.valueOf(z13);
                function0.invoke();
                return valueOf;
        }
    }
}
