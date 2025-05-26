package r60;

import com.pinterest.api.model.wy0;
import i1.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f106321i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f106322j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wy0 f106323k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f106324l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f106325m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f106326n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f106327o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z13, h hVar, wy0 wy0Var, f fVar, f fVar2, String str, String str2) {
        super(0);
        this.f106321i = z13;
        this.f106322j = hVar;
        this.f106323k = wy0Var;
        this.f106324l = fVar;
        this.f106325m = fVar2;
        this.f106326n = str;
        this.f106327o = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z13 = this.f106321i;
        Function1 function1 = this.f106325m;
        Function1 function12 = this.f106324l;
        wy0 wy0Var = this.f106323k;
        h hVar = this.f106322j;
        if (z13) {
            hVar.getClass();
            String uid = wy0Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            ((s60.d) hVar.f106330b).d(uid).o(new dv.a(22, new f1(10, function12)), new dv.a(23, new e(function1, wy0Var, 1)));
        } else {
            hVar.getClass();
            String uid2 = wy0Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            ((s60.d) hVar.f106330b).a(uid2, this.f106326n, this.f106327o).o(new dv.a(24, new f1(9, function12)), new dv.a(25, new e(function1, wy0Var, 0)));
        }
        return Unit.f80348a;
    }
}
