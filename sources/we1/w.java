package we1;

import android.view.View;
import com.pinterest.api.model.v7;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final w f129661j = new w(0);

    /* renamed from: k, reason: collision with root package name */
    public static final w f129662k = new w(1);

    /* renamed from: l, reason: collision with root package name */
    public static final w f129663l = new w(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129664i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i13) {
        super(2);
        this.f129664i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f129664i;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter((String) obj, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter((HashMap) obj2, "<anonymous parameter 1>");
                break;
            case 1:
                v7 v7Var = (v7) obj;
                View view = (View) obj2;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(v7Var, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(v7Var, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
                        break;
                }
                break;
            default:
                v7 v7Var2 = (v7) obj;
                View view2 = (View) obj2;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(v7Var2, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(view2, "<anonymous parameter 1>");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(v7Var2, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(view2, "<anonymous parameter 1>");
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
