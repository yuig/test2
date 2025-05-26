package t3;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final q0 f116167j = new q0(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116168i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i13) {
        super(0);
        this.f116168i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i13 = this.f116168i;
        Float valueOf = Float.valueOf(0.0f);
        switch (i13) {
            case 0:
                return Boolean.FALSE;
            case 1:
            case 2:
                return valueOf;
            default:
                return null;
        }
    }
}
