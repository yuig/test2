package br1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23815i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f23816j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i13, int i14) {
        super(1);
        this.f23815i = i14;
        this.f23816j = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f23816j;
        int i14 = this.f23815i;
        switch (i14) {
            case 0:
                int intValue = ((Number) obj).intValue();
                switch (i14) {
                    case 0:
                        return Integer.valueOf((intValue * 2) + i13);
                    default:
                        return Integer.valueOf(intValue + i13);
                }
            default:
                int intValue2 = ((Number) obj).intValue();
                switch (i14) {
                    case 0:
                        return Integer.valueOf((intValue2 * 2) + i13);
                    default:
                        return Integer.valueOf(intValue2 + i13);
                }
        }
    }
}
