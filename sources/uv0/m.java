package uv0;

import com.pinterest.api.model.mp0;
import com.pinterest.api.model.vg;
import java.util.ArrayList;
import java.util.List;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends vg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f123178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f123179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(ArrayList arrayList, Unit unit, int i13) {
        super(unit);
        this.f123178b = i13;
        this.f123179c = arrayList;
    }

    @Override // com.pinterest.api.model.vg
    public final /* bridge */ /* synthetic */ Object h(mp0 mp0Var) {
        switch (this.f123178b) {
            case 0:
                l(mp0Var);
                break;
            default:
                l(mp0Var);
                break;
        }
        return Unit.f80348a;
    }

    public final void l(mp0 value9) {
        int i13 = this.f123178b;
        List list = this.f123179c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(value9, "value9");
                if (!value9.k().booleanValue() && k3.p1(value9)) {
                    list.add(value9);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(value9, "value9");
                if (!value9.k().booleanValue() && !k3.p1(value9)) {
                    list.add(value9);
                    break;
                }
                break;
        }
    }
}
