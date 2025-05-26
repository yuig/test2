package i1;

import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ni1.y2;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70753i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f70754j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f70755k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Object obj, boolean z13, int i13) {
        super(1);
        this.f70753i = i13;
        this.f70755k = obj;
        this.f70754j = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f70753i;
        boolean z13 = this.f70754j;
        Object obj2 = this.f70755k;
        switch (i13) {
            case 0:
                ((b3.u0) ((b3.d0) obj)).i(!z13 && ((Boolean) ((Function0) obj2).invoke()).booleanValue());
                return Unit.f80348a;
            case 1:
                ar0.u notifyEventListeners = (ar0.u) obj;
                Intrinsics.checkNotNullParameter(notifyEventListeners, "$this$notifyEventListeners");
                notifyEventListeners.e((RecyclerView) obj2, z13);
                return Unit.f80348a;
            case 2:
                ni1.u0 it = (ni1.u0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ni1.u0.e(it, 0, new Pair(Integer.valueOf(m60.x0.TAG_INDEX), Integer.valueOf(((y2) ((l82.e) obj2).f82219b).f90903b)), null, this.f70754j, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 2097131);
            case 3:
                uj2.q it2 = (uj2.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return z13 ? ((dl1.q0) obj2).f55271d.i(it2) : it2;
            case 4:
                Intrinsics.checkNotNullParameter((Unit) obj, "it");
                return new rl1.u(((GestaltAvatar) obj2).O2().f108655i, z13);
            default:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                rn1.b bVar = GestaltText.f49638g;
                ((GestaltText) obj2).n(z13);
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(boolean z13, Object obj, int i13) {
        super(1);
        this.f70753i = i13;
        this.f70754j = z13;
        this.f70755k = obj;
    }
}
