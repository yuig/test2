package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k3 extends dl2.i implements Function2 {
    public final /* synthetic */ Function1 A;
    public final /* synthetic */ Function1 B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ j1 D;

    /* renamed from: s, reason: collision with root package name */
    public Object f85423s;

    /* renamed from: t, reason: collision with root package name */
    public Object f85424t;

    /* renamed from: u, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f85425u;

    /* renamed from: v, reason: collision with root package name */
    public long f85426v;

    /* renamed from: w, reason: collision with root package name */
    public int f85427w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f85428x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f85429y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ kl2.l f85430z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(ao2.j0 j0Var, kl2.l lVar, Function1 function1, Function1 function12, Function1 function13, j1 j1Var, bl2.c cVar) {
        super(2, cVar);
        this.f85429y = j0Var;
        this.f85430z = lVar;
        this.A = function1;
        this.B = function12;
        this.C = function13;
        this.D = j1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k3 k3Var = new k3(this.f85429y, this.f85430z, this.A, this.B, this.C, this.D, cVar);
        k3Var.f85428x = obj;
        return k3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k3) create((n3.l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x020b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0 A[Catch: PointerEventTimeoutCancellationException -> 0x00f9, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00f9, blocks: (B:59:0x00ea, B:61:0x00f0, B:64:0x00fd), top: B:58:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd A[Catch: PointerEventTimeoutCancellationException -> 0x00f9, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00f9, blocks: (B:59:0x00ea, B:61:0x00f0, B:64:0x00fd), top: B:58:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c4  */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v43, types: [ao2.l0, bl2.c, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r2v44 */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.k3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
