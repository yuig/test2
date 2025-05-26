package cn0;

import ao2.j0;
import co2.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public co2.e f28042r;

    /* renamed from: s, reason: collision with root package name */
    public int f28043s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b0 f28044t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f28045u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ be2.b f28046v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b0 b0Var, i iVar, be2.b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f28044t = b0Var;
        this.f28045u = iVar;
        this.f28046v = bVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f28044t, this.f28045u, this.f28046v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0029 -> B:5:0x002c). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn0.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
