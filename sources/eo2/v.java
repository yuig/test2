package eo2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class v extends dl2.j implements Function2 {
    public final /* synthetic */ do2.j A;

    /* renamed from: r, reason: collision with root package name */
    public co2.q f59833r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f59834s;

    /* renamed from: t, reason: collision with root package name */
    public int f59835t;

    /* renamed from: u, reason: collision with root package name */
    public int f59836u;

    /* renamed from: v, reason: collision with root package name */
    public int f59837v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f59838w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ do2.i[] f59839x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function0 f59840y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ kl2.l f59841z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(bl2.c cVar, Function0 function0, kl2.l lVar, do2.j jVar, do2.i[] iVarArr) {
        super(2, cVar);
        this.f59839x = iVarArr;
        this.f59840y = function0;
        this.f59841z = lVar;
        this.A = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        v vVar = new v(cVar, this.f59840y, this.f59841z, this.A, this.f59839x);
        vVar.f59838w = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r7 != 0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9 A[LOOP:0: B:16:0x00b9->B:33:?, LOOP_START, PHI: r7 r10
      0x00b9: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:13:0x00b4, B:33:?] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r10v3 kotlin.collections.IndexedValue) = (r10v2 kotlin.collections.IndexedValue), (r10v10 kotlin.collections.IndexedValue) binds: [B:13:0x00b4, B:33:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00fa -> B:8:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0113 -> B:8:0x0099). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eo2.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
