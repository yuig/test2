package ads_mobile_sdk;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class kk1 extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f7345a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7346b;

    /* renamed from: c, reason: collision with root package name */
    public Closeable f7347c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7348d;

    /* renamed from: e, reason: collision with root package name */
    public int f7349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mk1 f7350f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nm.u f7351g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk1(mk1 mk1Var, nm.u uVar, bl2.c cVar) {
        super(1, cVar);
        this.f7350f = mk1Var;
        this.f7351g = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new kk1(this.f7350f, this.f7351g, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new kk1(this.f7350f, this.f7351g, (bl2.c) obj).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf A[Catch: all -> 0x00e6, TryCatch #1 {all -> 0x00e6, blocks: (B:47:0x00b9, B:49:0x00bf, B:50:0x00e9, B:59:0x0054, B:60:0x0082), top: B:58:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9 A[Catch: all -> 0x00e6, TRY_LEAVE, TryCatch #1 {all -> 0x00e6, blocks: (B:47:0x00b9, B:49:0x00bf, B:50:0x00e9, B:59:0x0054, B:60:0x0082), top: B:58:0x0054 }] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.Closeable] */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kk1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
