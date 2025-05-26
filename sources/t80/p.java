package t80;

import ao2.j0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public a82.b f116714r;

    /* renamed from: s, reason: collision with root package name */
    public Collection f116715s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f116716t;

    /* renamed from: u, reason: collision with root package name */
    public Collection f116717u;

    /* renamed from: v, reason: collision with root package name */
    public int f116718v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f116719w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a82.b f116720x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, a82.b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f116719w = sVar;
        this.f116720x = bVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f116719w, this.f116720x, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008e  */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00a8 -> B:6:0x00a9). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t80.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
