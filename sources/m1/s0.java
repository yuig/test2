package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class s0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f85560r;

    /* renamed from: s, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f85561s;

    /* renamed from: t, reason: collision with root package name */
    public int f85562t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f85563u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t0 f85564v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, bl2.c cVar) {
        super(2, cVar);
        this.f85564v = t0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        s0 s0Var = new s0(this.f85564v, cVar);
        s0Var.f85563u = obj;
        return s0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:22|23|(1:42)|25|26|27|(2:32|(2:34|(1:36)))(2:29|(1:31))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[Catch: CancellationException -> 0x00c5, TryCatch #1 {CancellationException -> 0x00c5, blocks: (B:27:0x00aa, B:29:0x00b0, B:32:0x00c7, B:34:0x00cb), top: B:26:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7 A[Catch: CancellationException -> 0x00c5, TryCatch #1 {CancellationException -> 0x00c5, blocks: (B:27:0x00aa, B:29:0x00b0, B:32:0x00c7, B:34:0x00cb), top: B:26:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0081 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c2 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c9 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d6 -> B:8:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e4 -> B:7:0x0027). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
