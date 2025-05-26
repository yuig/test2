package i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public g1.g0 f71246r;

    /* renamed from: s, reason: collision with root package name */
    public Function1 f71247s;

    /* renamed from: t, reason: collision with root package name */
    public co2.q f71248t;

    /* renamed from: u, reason: collision with root package name */
    public s2.f f71249u;

    /* renamed from: v, reason: collision with root package name */
    public Object f71250v;

    /* renamed from: w, reason: collision with root package name */
    public int f71251w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f71252x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function0 f71253y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(Function0 function0, bl2.c cVar) {
        super(2, cVar);
        this.f71253y = function0;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        q3 q3Var = new q3(this.f71253y, cVar);
        q3Var.f71252x = obj;
        return q3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q3) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b2 A[LOOP:0: B:17:0x00e7->B:22:0x01b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0153 A[EDGE_INSN: B:23:0x0153->B:24:0x0153 BREAK  A[LOOP:0: B:17:0x00e7->B:22:0x01b2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0155 A[Catch: all -> 0x01ad, TRY_LEAVE, TryCatch #8 {all -> 0x01ad, blocks: (B:53:0x00e9, B:55:0x00f1, B:57:0x0106, B:59:0x0112, B:61:0x011c, B:20:0x0146, B:25:0x0155, B:65:0x012b, B:74:0x0133), top: B:52:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0193 -> B:10:0x0194). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.q3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
