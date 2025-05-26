package ta0;

import android.app.Activity;
import ao2.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v f116902i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f116903j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x f116904k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u50.r f116905l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(v vVar, ao2.j0 j0Var, x xVar, u50.r rVar) {
        super(1);
        this.f116902i = vVar;
        this.f116903j = j0Var;
        this.f116904k = xVar;
        this.f116905l = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Activity activity = (Activity) obj;
        Intrinsics.checkNotNullParameter(activity, "activity");
        w wVar = (w) this.f116904k;
        v vVar = this.f116902i;
        vVar.getClass();
        ko2.f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(this.f116903j, ko2.e.f80326c, null, new r(this.f116905l, vVar, wVar, activity, null), 2);
        return Unit.f80348a;
    }
}
