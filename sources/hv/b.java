package hv;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class b extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f70431j = new b(0);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70432i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(0);
        this.f70432i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f70432i) {
            case 0:
                return Boolean.FALSE;
            default:
                return Unit.f80348a;
        }
    }
}
