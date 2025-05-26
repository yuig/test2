package v72;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f124413j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f124414k = new f(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124415i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(0);
        this.f124415i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f124415i) {
            case 0:
                return Unit.f80348a;
            default:
                return "Renderer failed in PinCollageGridCell";
        }
    }
}
