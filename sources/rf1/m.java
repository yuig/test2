package rf1;

import com.pinterest.api.model.bp;
import com.pinterest.api.model.hp;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.zk0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107781i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f107782j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ zk0 f107783k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ bp f107784l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hp f107785m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f107786n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, zk0 zk0Var, bp bpVar, int i13, hp hpVar, String str, int i14) {
        super(1);
        this.f107781i = i14;
        this.f107782j = pVar;
        this.f107783k = zk0Var;
        this.f107784l = bpVar;
        this.f107785m = hpVar;
        this.f107786n = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f107781i;
        hp hpVar = this.f107785m;
        bp bpVar = this.f107784l;
        p pVar = this.f107782j;
        switch (i13) {
            case 0:
                v7 v7Var = (v7) obj;
                sf1.t tVar = (sf1.t) pVar.getView();
                zk0 blockStyle = this.f107783k;
                Intrinsics.checkNotNullExpressionValue(blockStyle, "$blockStyle");
                Boolean o13 = bpVar.o();
                Intrinsics.checkNotNullExpressionValue(o13, "getIsValid(...)");
                boolean booleanValue = o13.booleanValue();
                Double p13 = bpVar.p();
                Intrinsics.checkNotNullExpressionValue(p13, "getStartTime(...)");
                double doubleValue = p13.doubleValue();
                Double l13 = bpVar.l();
                Intrinsics.checkNotNullExpressionValue(l13, "getEndTime(...)");
                double doubleValue2 = l13.doubleValue();
                String b13 = hpVar.b();
                Intrinsics.checkNotNullExpressionValue(b13, "getBoardId(...)");
                Boolean g13 = v7Var.g1();
                Intrinsics.checkNotNullExpressionValue(g13, "getIsCollaborative(...)");
                ((sf1.s) tVar).i(blockStyle, booleanValue, doubleValue, doubleValue2, b13, g13.booleanValue(), this.f107786n, v7Var.l1());
                break;
            default:
                sf1.t tVar2 = (sf1.t) pVar.getView();
                zk0 blockStyle2 = this.f107783k;
                Intrinsics.checkNotNullExpressionValue(blockStyle2, "$blockStyle");
                Boolean o14 = bpVar.o();
                Intrinsics.checkNotNullExpressionValue(o14, "getIsValid(...)");
                boolean booleanValue2 = o14.booleanValue();
                Double p14 = bpVar.p();
                Intrinsics.checkNotNullExpressionValue(p14, "getStartTime(...)");
                double doubleValue3 = p14.doubleValue();
                Double l14 = bpVar.l();
                Intrinsics.checkNotNullExpressionValue(l14, "getEndTime(...)");
                double doubleValue4 = l14.doubleValue();
                String b14 = hpVar.b();
                Intrinsics.checkNotNullExpressionValue(b14, "getBoardId(...)");
                ((sf1.s) tVar2).i(blockStyle2, booleanValue2, doubleValue3, doubleValue4, b14, false, this.f107786n, null);
                break;
        }
        return Unit.f80348a;
    }
}
