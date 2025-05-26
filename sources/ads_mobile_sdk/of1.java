package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class of1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public if1 f9240a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f9241b;

    /* renamed from: c, reason: collision with root package name */
    public cs2 f9242c;

    /* renamed from: d, reason: collision with root package name */
    public int f9243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uf1 f9244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nm.u f9245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ if1 f9246g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of1(if1 if1Var, uf1 uf1Var, nm.u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f9244e = uf1Var;
        this.f9245f = uVar;
        this.f9246g = if1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new of1(this.f9246g, this.f9244e, this.f9245f, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((of1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c A[Catch: all -> 0x00ac, TryCatch #3 {all -> 0x00ac, blocks: (B:33:0x0095, B:35:0x009c, B:37:0x00a3, B:39:0x00a7, B:41:0x00ab, B:42:0x00ae, B:43:0x00b3, B:44:0x00b4, B:45:0x00bb, B:46:0x00bc, B:47:0x00c3, B:48:0x00c4), top: B:32:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #3 {all -> 0x00ac, blocks: (B:33:0x0095, B:35:0x009c, B:37:0x00a3, B:39:0x00a7, B:41:0x00ab, B:42:0x00ae, B:43:0x00b3, B:44:0x00b4, B:45:0x00bb, B:46:0x00bc, B:47:0x00c3, B:48:0x00c4), top: B:32:0x0095 }] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.of1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
