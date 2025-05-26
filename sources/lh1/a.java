package lh1;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83521i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f83522j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i13) {
        super(1);
        this.f83521i = i13;
        this.f83522j = dVar;
    }

    public final void b(Activity activity) {
        int i13 = this.f83521i;
        d dVar = this.f83522j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                lu1.b bVar = dVar.f83526b;
                if (bVar != null) {
                    ((lu1.c) bVar).p(activity);
                    return;
                } else {
                    Intrinsics.r("baseActivityHelper");
                    throw null;
                }
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                lu1.b bVar2 = dVar.f83526b;
                if (bVar2 != null) {
                    ((lu1.c) bVar2).p(activity);
                    return;
                } else {
                    Intrinsics.r("baseActivityHelper");
                    throw null;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f83521i) {
            case 0:
                b((Activity) obj);
                break;
            default:
                b((Activity) obj);
                break;
        }
        return Unit.f80348a;
    }
}
