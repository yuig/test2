package ex1;

import df.j1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f60383j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f60384k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60385i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(0);
        this.f60385i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f60385i) {
            case 0:
                return j1.u0("com.pinterest.closeup.screens.PinFeatureLocation", "PIN");
            default:
                return "TopPinsView";
        }
    }
}
