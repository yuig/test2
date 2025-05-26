package ads_mobile_sdk;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class kt0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public mo2.a f7492a;

    /* renamed from: b, reason: collision with root package name */
    public ku0 f7493b;

    /* renamed from: c, reason: collision with root package name */
    public int f7494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku0 f7495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt0(ku0 ku0Var, bl2.c cVar) {
        super(2, cVar);
        this.f7495d = ku0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new kt0(this.f7495d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new kt0(this.f7495d, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [mo2.a] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v4, types: [mo2.a] */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        ku0 ku0Var;
        mo2.c cVar;
        ?? r13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f7494c;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                ku0Var = this.f7495d;
                mo2.a aVar2 = ku0Var.f7531w;
                this.f7492a = aVar2;
                this.f7493b = ku0Var;
                this.f7494c = 1;
                mo2.c cVar2 = (mo2.c) aVar2;
                if (cVar2.f(null, this) == aVar) {
                    return aVar;
                }
                cVar = cVar2;
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r13 = this.f7492a;
                    try {
                        ue.c.H(obj);
                        r13 = r13;
                        Unit unit = Unit.f80348a;
                        ((mo2.c) r13).i(null);
                        return unit;
                    } catch (Throwable th3) {
                        th = th3;
                        cVar = r13;
                        cVar.i(null);
                        throw th;
                    }
                }
                ku0Var = this.f7493b;
                ?? r33 = this.f7492a;
                ue.c.H(obj);
                cVar = r33;
            }
            Long l13 = new Long(Long.MAX_VALUE);
            this.f7492a = cVar;
            this.f7493b = null;
            this.f7494c = 2;
            if (ku0.a(ku0Var, null, null, null, "{}", l13, null, null, null, this, RecyclerViewTypes.VIEW_TYPE_RECENTLY_SAVED_PRODUCT_HEADER) == aVar) {
                return aVar;
            }
            r13 = cVar;
            Unit unit2 = Unit.f80348a;
            ((mo2.c) r13).i(null);
            return unit2;
        } catch (Throwable th4) {
            th = th4;
            cVar.i(null);
            throw th;
        }
    }
}
