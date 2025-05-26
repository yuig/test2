package p1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q3.c1[] f98586i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f98587j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q3.r0 f98588k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f98589l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f98590m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f98591n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q3.c1[] c1VarArr, List list, q3.r0 r0Var, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, t tVar) {
        super(1);
        this.f98586i = c1VarArr;
        this.f98587j = list;
        this.f98588k = r0Var;
        this.f98589l = h0Var;
        this.f98590m = h0Var2;
        this.f98591n = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q3.b1 b1Var = (q3.b1) obj;
        q3.c1[] c1VarArr = this.f98586i;
        int length = c1VarArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i14 < length) {
            q3.c1 c1Var = c1VarArr[i14];
            Intrinsics.g(c1Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            q.b(b1Var, c1Var, (q3.o0) this.f98587j.get(i13), this.f98588k.getLayoutDirection(), this.f98589l.f80426a, this.f98590m.f80426a, this.f98591n.f98595a);
            i14++;
            i13++;
        }
        return Unit.f80348a;
    }
}
