package s62;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class c extends s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f111249j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f111250k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111251i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(2);
        this.f111251i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f111251i;
        switch (i13) {
            case 0:
                View view = (View) obj;
                ((Number) obj2).floatValue();
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                        break;
                }
                break;
            default:
                View view2 = (View) obj;
                ((Number) obj2).floatValue();
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(view2, "<anonymous parameter 0>");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(view2, "<anonymous parameter 0>");
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
