package i1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70787i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f70788j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i13) {
        super(1);
        this.f70787i = i13;
        this.f70788j = obj;
    }

    public final Object b(int i13) {
        int i14 = this.f70787i;
        Object obj = this.f70788j;
        switch (i14) {
            case 1:
            case 2:
            case 3:
            case 4:
                return obj;
            case 5:
                Object obj2 = ((Object[]) obj)[i13];
                if (obj2 != null) {
                    return (Boolean) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            case 6:
                Object obj3 = ((Object[]) obj)[i13];
                if (obj3 != null) {
                    return (Integer) obj3;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            default:
                Object obj4 = ((Object[]) obj)[i13];
                if (obj4 != null) {
                    return (String) obj4;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f70787i) {
        }
        return b(((Number) obj).intValue());
    }
}
