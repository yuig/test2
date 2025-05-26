package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g0 extends dl2.i implements Function2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ kotlin.jvm.internal.i0 D;
    public final /* synthetic */ f1 E;
    public final /* synthetic */ kl2.l F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ Function0 H;
    public final /* synthetic */ Function1 I;

    /* renamed from: s, reason: collision with root package name */
    public Object f85344s;

    /* renamed from: t, reason: collision with root package name */
    public Object f85345t;

    /* renamed from: u, reason: collision with root package name */
    public Object f85346u;

    /* renamed from: v, reason: collision with root package name */
    public kotlin.jvm.internal.i0 f85347v;

    /* renamed from: w, reason: collision with root package name */
    public p3 f85348w;

    /* renamed from: x, reason: collision with root package name */
    public n3.q f85349x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f85350y;

    /* renamed from: z, reason: collision with root package name */
    public float f85351z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Function0 function0, kotlin.jvm.internal.i0 i0Var, f1 f1Var, kl2.l lVar, Function2 function2, Function0 function02, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.C = function0;
        this.D = i0Var;
        this.E = f1Var;
        this.F = lVar;
        this.G = function2;
        this.H = function02;
        this.I = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        g0 g0Var = new g0(this.C, this.D, this.E, this.F, this.G, this.H, this.I, cVar);
        g0Var.B = obj;
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((n3.l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x02fe, code lost:
    
        if (m1.i0.d(r1, r2) != false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x017a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0327 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x034f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0157  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x027b -> B:70:0x02bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x02b3 -> B:67:0x02b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0325 -> B:9:0x0328). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
