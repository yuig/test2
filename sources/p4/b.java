package p4;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f98770j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f98771k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f98772l = new b(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98773i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f98773i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f98773i) {
            case 0:
                j jVar = (j) obj;
                jVar.getHandler().post(new a(0, jVar.f98807n));
                break;
            case 1:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
