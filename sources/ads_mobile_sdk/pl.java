package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class pl extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f9724a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f9725b;

    /* renamed from: c, reason: collision with root package name */
    public tl f9726c;

    /* renamed from: d, reason: collision with root package name */
    public int f9727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl f9728e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(tl tlVar, bl2.c cVar) {
        super(1, cVar);
        this.f9728e = tlVar;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new pl(this.f9728e, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new pl(this.f9728e, (bl2.c) obj).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:25:0x005e, B:27:0x0062, B:28:0x0089), top: B:24:0x005e, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.pl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
