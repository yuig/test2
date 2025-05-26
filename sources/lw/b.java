package lw;

import ao2.j0;
import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85037r;

    /* renamed from: s, reason: collision with root package name */
    public int f85038s;

    /* renamed from: t, reason: collision with root package name */
    public int f85039t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f85040u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f85041v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Integer f85042w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f85043x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f85044y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Integer f85045z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, Integer num, int i13, long j13, Integer num2, bl2.c cVar2) {
        super(2, cVar2);
        this.f85040u = cVar;
        this.f85041v = str;
        this.f85042w = num;
        this.f85043x = i13;
        this.f85044y = j13;
        this.f85045z = num2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f85040u, this.f85041v, this.f85042w, this.f85043x, this.f85044y, this.f85045z, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
    
        if (r3 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ed  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lw.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
