package do0;

import android.util.TypedValue;
import com.pinterest.feature.pin.create.view.BoardSectionCell;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55653i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f55654j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(0);
        this.f55653i = i13;
        this.f55654j = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f55653i;
        b bVar = this.f55654j;
        switch (i13) {
            case 0:
                yk1.a aVar = bVar.C0;
                if (aVar != null) {
                    return Integer.valueOf((int) TypedValue.applyDimension(1, 16, aVar.f139224a.getDisplayMetrics()));
                }
                Intrinsics.r("androidResources");
                throw null;
            default:
                return new BoardSectionCell(bVar.getContext());
        }
    }
}
