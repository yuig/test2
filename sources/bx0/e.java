package bx0;

import android.view.View;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f24030j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f24031k = new e(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24032i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(2);
        this.f24032i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f24032i;
        switch (i13) {
            case 0:
                View view = (View) obj;
                ((Number) obj2).intValue();
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                        break;
                }
            default:
                View view2 = (View) obj;
                ((Number) obj2).intValue();
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(view2, "<anonymous parameter 0>");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(view2, "<anonymous parameter 0>");
                        break;
                }
        }
        return 0;
    }
}
