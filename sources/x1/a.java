package x1;

import dl2.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n3.k;
import n3.l0;
import n3.q;

/* loaded from: classes2.dex */
public final class a extends i implements Function2 {

    /* renamed from: s, reason: collision with root package name */
    public q f131551s;

    /* renamed from: t, reason: collision with root package name */
    public k f131552t;

    /* renamed from: u, reason: collision with root package name */
    public int f131553u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f131554v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f131555w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f131555w = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a aVar = new a(this.f131555w, cVar);
        aVar.f131554v = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((l0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x015b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x014d -> B:7:0x0150). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00c7 -> B:29:0x00ca). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
