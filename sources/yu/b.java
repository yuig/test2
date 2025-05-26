package yu;

import android.view.View;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class b extends s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f140136j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f140137k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140138i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(2);
        this.f140138i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f140138i;
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
