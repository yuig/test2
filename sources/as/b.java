package as;

import android.content.Context;
import df.j1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import m60.f0;
import so.oa;

/* loaded from: classes3.dex */
public final class b extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f20414j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f20415k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20416i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(0);
        this.f20416i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20416i) {
            case 0:
                Context context = kb0.a.f79058b;
                return ((oa) ((a) j1.b0(a.class, f0.W()))).m2();
            default:
                Context context2 = kb0.a.f79058b;
                return ((oa) ((a) j1.b0(a.class, f0.W()))).o2();
        }
    }
}
