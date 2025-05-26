package kotlin.collections;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class j1 extends dl2.i implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;

    /* renamed from: s, reason: collision with root package name */
    public Object f80375s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f80376t;

    /* renamed from: u, reason: collision with root package name */
    public int f80377u;

    /* renamed from: v, reason: collision with root package name */
    public int f80378v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f80379w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f80380x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f80381y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Iterator f80382z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(int i13, int i14, Iterator it, boolean z13, boolean z14, bl2.c cVar) {
        super(2, cVar);
        this.f80380x = i13;
        this.f80381y = i14;
        this.f80382z = it;
        this.A = z13;
        this.B = z14;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j1 j1Var = new j1(this.f80380x, this.f80381y, this.f80382z, this.A, this.B, cVar);
        j1Var.f80379w = obj;
        return j1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((yn2.p) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00aa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x016c -> B:12:0x016f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00fd -> B:30:0x0126). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x013e -> B:29:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x00a2 -> B:59:0x00a3). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
