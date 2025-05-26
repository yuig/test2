package ta0;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public v f116893r;

    /* renamed from: s, reason: collision with root package name */
    public Context f116894s;

    /* renamed from: t, reason: collision with root package name */
    public u50.r f116895t;

    /* renamed from: u, reason: collision with root package name */
    public String f116896u;

    /* renamed from: v, reason: collision with root package name */
    public int f116897v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u50.r f116898w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v f116899x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w f116900y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Context f116901z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u50.r rVar, v vVar, w wVar, Context context, bl2.c cVar) {
        super(2, cVar);
        this.f116898w = rVar;
        this.f116899x = vVar;
        this.f116900y = wVar;
        this.f116901z = context;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r(this.f116898w, this.f116899x, this.f116900y, this.f116901z, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121 A[Catch: Exception -> 0x012a, TRY_LEAVE, TryCatch #0 {Exception -> 0x012a, blocks: (B:10:0x0085, B:15:0x00b8, B:17:0x00bc, B:19:0x00e2, B:21:0x00e7, B:23:0x00fc, B:27:0x0106, B:29:0x0115, B:33:0x011b, B:34:0x0121, B:35:0x00ac), top: B:9:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac A[Catch: Exception -> 0x012a, TryCatch #0 {Exception -> 0x012a, blocks: (B:10:0x0085, B:15:0x00b8, B:17:0x00bc, B:19:0x00e2, B:21:0x00e7, B:23:0x00fc, B:27:0x0106, B:29:0x0115, B:33:0x011b, B:34:0x0121, B:35:0x00ac), top: B:9:0x0085 }] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ta0.v] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, ta0.v] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, u50.r] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [u50.r] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.lang.String] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ta0.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
