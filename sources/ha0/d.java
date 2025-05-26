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
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f68366r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f68367s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i0 f68368t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, String str, i0 i0Var, bl2.c cVar) {
        super(2, cVar);
        this.f68366r = fVar;
        this.f68367s = str;
        this.f68368t = i0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f68366r, this.f68367s, this.f68368t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        NavigationImpl w13 = Navigation.w1((ScreenLocation) r0.f51251b.getValue());
        f fVar = this.f68366r;
        fVar.getClass();
        i0 i0Var = this.f68368t;
        String j13 = f.j(i0Var);
        a4 a4Var = i0Var.f67082b;
        w13.w0(new ReportData.UserReportData(this.f68367s, j13, a4Var != null ? a4Var.name() : null), "com.pinterest.EXTRA_REPORT_DATA");
        fVar.f68374b.f(w13);
        return Unit.f80348a;
    }
}
