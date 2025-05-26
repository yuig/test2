package x52;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;
import nx.d0;

/* loaded from: classes4.dex */
public final class m extends dl2.j implements Function2 {
    public final /* synthetic */ File A;
    public final /* synthetic */ int B;
    public final /* synthetic */ File C;
    public final /* synthetic */ Function1 D;

    /* renamed from: r, reason: collision with root package name */
    public int f133882r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f133883s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f133884t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d0 f133885u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ an0.g f133886v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f133887w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function1 f133888x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ke2.c f133889y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ j0 f133890z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z13, d0 d0Var, an0.g gVar, n nVar, Function1 function1, ke2.c cVar, j0 j0Var, File file, int i13, File file2, Function1 function12, bl2.c cVar2) {
        super(2, cVar2);
        this.f133884t = z13;
        this.f133885u = d0Var;
        this.f133886v = gVar;
        this.f133887w = nVar;
        this.f133888x = function1;
        this.f133889y = cVar;
        this.f133890z = j0Var;
        this.A = file;
        this.B = i13;
        this.C = file2;
        this.D = function12;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m mVar = new m(this.f133884t, this.f133885u, this.f133886v, this.f133887w, this.f133888x, this.f133889y, this.f133890z, this.A, this.B, this.C, this.D, cVar);
        mVar.f133883s = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(1:(1:(3:5|6|7)(2:9|10))(1:11))(2:35|(2:37|(1:39))(9:40|22|23|24|25|26|(2:28|(1:30))|6|7))|12|(1:14)(1:34)|15|(1:17)|18|(1:20)|21|22|23|24|25|26|(0)|6|7) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012d, code lost:
    
        x52.n.a(r8, r0, r6);
        r4 = null;
        dl2.b.E(r7, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013a  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x52.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
