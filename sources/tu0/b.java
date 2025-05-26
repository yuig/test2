package tu0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f119319j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f119320k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119321i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(0);
        this.f119321i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f119321i) {
            case 0:
                return 5;
            default:
                return Float.valueOf(16.0f * hf0.b.f69001a);
        }
    }
}
