package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class nr1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public mo2.a f8952a;

    /* renamed from: b, reason: collision with root package name */
    public tr1 f8953b;

    /* renamed from: c, reason: collision with root package name */
    public int f8954c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr1 f8955d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr1(tr1 tr1Var, bl2.c cVar) {
        super(2, cVar);
        this.f8955d = tr1Var;
    }

    public static final void a(tr1 tr1Var, boolean z13) {
        j0 j0Var = tr1Var.f11641b;
        mr1 block = new mr1(tr1Var, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new nr1(this.f8955d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new nr1(this.f8955d, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0037: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:55:0x0037 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:30:0x0033, B:31:0x006b, B:33:0x0073, B:37:0x008d, B:39:0x0091, B:43:0x00e2, B:47:0x0059), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:30:0x0033, B:31:0x006b, B:33:0x0073, B:37:0x008d, B:39:0x0091, B:43:0x00e2, B:47:0x0059), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006a A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v4, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r5v6, types: [mo2.a] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.nr1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
