package q1;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101932i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f101933j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f101934k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i13, int i14, int i15) {
        super(0);
        this.f101932i = i15;
        this.f101933j = i13;
        this.f101934k = i14;
    }

    public final String b() {
        int i13 = this.f101932i;
        int i14 = this.f101934k;
        int i15 = this.f101933j;
        switch (i13) {
            case 2:
                return a.a.f("onInserted(): position=", i15, ", count=", i14);
            case 3:
                return a.a.f("onInserted(): position=", i15, ", count=", i14);
            case 4:
                return a.a.f("onMoved(): fromPosition=", i15, ", toPosition=", i14);
            case 5:
                return a.a.f("onMoved(): fromPosition=", i15, ", toPosition=", i14);
            case 6:
                return a.a.f("onRemoved(): position=", i15, ", count=", i14);
            case 7:
                return a.a.f("onRemoved(): position=", i15, ", count=", i14);
            default:
                return a.a.f("onReplaced(): position=", i15, ", count=", i14);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f101932i;
        int i14 = this.f101934k;
        int i15 = this.f101933j;
        switch (i13) {
        }
        return b();
    }
}
