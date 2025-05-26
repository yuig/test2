package q52;

import com.pinterest.api.model.f30;
import h32.h0;
import h32.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import qz.j;

/* loaded from: classes4.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f102579j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f102580k = new c(1);

    /* renamed from: l, reason: collision with root package name */
    public static final c f102581l = new c(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102582i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f102582i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f102582i;
        switch (i13) {
            case 0:
                j pinsPage = (j) obj;
                Intrinsics.checkNotNullParameter(pinsPage, "pinsPage");
                List list = pinsPage.f105410a;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new r52.a((f30) it.next(), false));
                }
                break;
            case 1:
                h0 update = (h0) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        update.f67047f = u0.BACK_BUTTON;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        update.f67047f = u0.DONE_BUTTON;
                        break;
                }
                break;
            default:
                h0 update2 = (h0) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                        update2.f67047f = u0.BACK_BUTTON;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                        update2.f67047f = u0.DONE_BUTTON;
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
