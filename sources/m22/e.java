package m22;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x02.i2;
import x02.x0;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f85717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f85718c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f85719d;

    public /* synthetic */ e(i2 i2Var, String str, List list, int i13) {
        this.f85716a = i13;
        this.f85717b = i2Var;
        this.f85718c = str;
        this.f85719d = list;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f85716a;
        String boardId = this.f85718c;
        List pinIds = this.f85719d;
        i2 this_bulkDeletePins = this.f85717b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this_bulkDeletePins, "$this_bulkDeletePins");
                Intrinsics.checkNotNullParameter(boardId, "$boardId");
                Intrinsics.checkNotNullParameter(pinIds, "$pinIds");
                ((x0) ((bf2.b) this_bulkDeletePins.O).get()).d0(boardId, pinIds);
                break;
            default:
                Intrinsics.checkNotNullParameter(this_bulkDeletePins, "$this_bulkMovePins");
                Intrinsics.checkNotNullParameter(pinIds, "$pinIds");
                ((x0) ((bf2.b) this_bulkDeletePins.O).get()).d0(boardId, pinIds);
                break;
        }
    }
}
