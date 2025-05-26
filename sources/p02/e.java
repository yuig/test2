package p02;

import android.os.Parcelable;
import ao2.j0;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.reportFlow.feature.ReportFlowScreenLocation;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ gx.e f98408r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s02.g f98409s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(gx.e eVar, s02.g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f98408r = eVar;
        this.f98409s = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f98408r, this.f98409s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ll.j jVar = (ll.j) this.f98408r.f66247c;
        NavigationImpl w13 = Navigation.w1(ReportFlowScreenLocation.SETTINGS_RVC_LINKED_BAS_SHEET);
        ArrayList<? extends Parcelable> value = new ArrayList<>(((s02.f) this.f98409s).f110317a);
        Intrinsics.checkNotNullParameter("EXTRA_LINKED_BAS", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        w13.f49942d.putParcelableArrayList("EXTRA_LINKED_BAS", value);
        Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
        jVar.f(w13);
        return Unit.f80348a;
    }
}
