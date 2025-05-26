package c2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class d2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24630i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f24631j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(Object obj, int i13) {
        super(0);
        this.f24630i = i13;
        this.f24631j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f24630i;
        Object obj = this.f24631j;
        switch (i13) {
            case 0:
                ((Function0) obj).invoke();
                return Boolean.TRUE;
            default:
                return Float.valueOf(i2.a((i2) obj).l0(g2.f24761c));
        }
    }
}
