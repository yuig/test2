package ha0;

import ao2.j0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.report.library.model.ReportData;
import com.pinterest.screens.r0;
import h32.a4;
import h32.i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f68363r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ra0.c f68364s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0 f68365t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, ra0.c cVar, i0 i0Var, bl2.c cVar2) {
        super(2, cVar2);
        this.f68363r = fVar;
        this.f68364s = cVar;
        this.f68365t = i0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f68363r, this.f68364s, this.f68365t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        NavigationImpl w13 = Navigation.w1((ScreenLocation) r0.f51251b.getValue());
        ra0.c cVar = this.f68364s;
        String str = cVar.f106906a;
        f fVar = this.f68363r;
        fVar.getClass();
        i0 i0Var = this.f68365t;
        String j13 = f.j(i0Var);
        a4 a4Var = i0Var.f67082b;
        String name = a4Var != null ? a4Var.name() : null;
        String name2 = a4Var != null ? a4Var.name() : null;
        w13.w0(new ReportData.PinReportData(str, j13, name, cVar.f106908c, name2 == null ? f.j(i0Var) : name2, null, null, null, false), "com.pinterest.EXTRA_REPORT_DATA");
        fVar.f68374b.f(w13);
        return Unit.f80348a;
    }
}
