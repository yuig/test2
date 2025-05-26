package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class v extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f55969r;

    /* renamed from: s, reason: collision with root package name */
    public kotlin.jvm.internal.i0 f55970s;

    /* renamed from: t, reason: collision with root package name */
    public int f55971t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f55972u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f55973v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f55974w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f55975x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Function1 function1, i iVar, bl2.c cVar) {
        super(3, cVar);
        this.f55974w = function1;
        this.f55975x = iVar;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        v vVar = new v(this.f55974w, this.f55975x, (bl2.c) obj3);
        vVar.f55972u = (ao2.j0) obj;
        vVar.f55973v = (j) obj2;
        return vVar.invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x001e, code lost:
    
        if (r10.d(r20) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: do2.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
