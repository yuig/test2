package eb1;

import ao2.j0;
import ao2.v0;
import com.pinterest.feature.settings.notifications.a0;
import com.pinterest.feature.settings.notifications.h0;
import dl2.j;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u50.r;

/* loaded from: classes5.dex */
public final class g extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f58238r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h0 f58239s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f58240t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j0 f58241u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f58242v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h0 h0Var, h hVar, j0 j0Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f58239s = h0Var;
        this.f58240t = hVar;
        this.f58241u = j0Var;
        this.f58242v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f58239s, this.f58240t, this.f58241u, this.f58242v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f58238r;
        h0 h0Var = this.f58239s;
        if (i13 == 0) {
            ue.c.H(obj);
            String str = h0Var.f48203e;
            int hashCode = str.hashCode();
            boolean z13 = h0Var.f48204f;
            boolean z14 = (hashCode == -1437251880 ? !str.equals("NO_PUSH") : hashCode == 257712846 ? !str.equals("NONE_IN_APP") : !(hashCode == 815339218 && str.equals("ONLY_REQUIRED"))) ? z13 : !z13;
            ll.j jVar = this.f58240t.f58245a;
            String lowerCase = h0Var.f48201c.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            this.f58238r = 1;
            jVar.getClass();
            ko2.f fVar = v0.f20219a;
            obj = kotlin.jvm.internal.j.M(this, ko2.e.f80326c, new com.pinterest.feature.settings.notifications.j(jVar, lowerCase, h0Var.f48202d, h0Var.f48203e, z14, null));
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        Throwable th3 = (Throwable) obj;
        if (Intrinsics.d(h0Var.f48200b, Boolean.TRUE) && th3 == null) {
            kotlin.jvm.internal.j.z(this.f58241u, null, null, new f(h0Var, null), 3);
        } else {
            this.f58242v.a(new a0(h0Var.f48201c, th3 == null, h0Var.f48204f));
        }
        return Unit.f80348a;
    }
}
