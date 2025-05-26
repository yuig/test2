package n02;

import ao2.j0;
import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.report.library.model.ReportData;
import df.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes4.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f88814r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f88815s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ReportData.PinReportData f88816t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, ReportData.PinReportData pinReportData, bl2.c cVar) {
        super(2, cVar);
        this.f88815s = oVar;
        this.f88816t = pinReportData;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f88815s, this.f88816t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f88814r;
        ReportData.PinReportData pinReportData = this.f88816t;
        o oVar = this.f88815s;
        if (i13 == 0) {
            ue.c.H(obj);
            k22.m mVar = oVar.f88855c;
            String str = pinReportData.f50389d;
            String a13 = n00.b.a(n00.c.USER_PROFILE);
            this.f88814r = 1;
            obj = mVar.F(str, a13, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if (networkResponse instanceof xz.b) {
            xz.b bVar = (xz.b) networkResponse;
            oVar.f88864l = dl2.b.j1((wy0) bVar.f136205a);
            if (oVar.isBound()) {
                j02.a aVar2 = (j02.a) oVar.getView();
                wy0 creator = (wy0) bVar.f136205a;
                v02.j jVar = (v02.j) aVar2;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(creator, "creator");
                Intrinsics.checkNotNullParameter(pinReportData, "pinReportData");
                GestaltDivider gestaltDivider = jVar.f123808w0;
                if (gestaltDivider == null) {
                    Intrinsics.r("blockDividerTop");
                    throw null;
                }
                j1.W1(gestaltDivider);
                GestaltText gestaltText = jVar.f123806u0;
                if (gestaltText == null) {
                    Intrinsics.r("blockCreatorHeader");
                    throw null;
                }
                gestaltText.i(v02.g.f123790i);
                GestaltDivider gestaltDivider2 = jVar.f123809x0;
                if (gestaltDivider2 == null) {
                    Intrinsics.r("blockDividerBottom");
                    throw null;
                }
                j1.W1(gestaltDivider2);
                String j13 = dl2.b.j1(creator);
                GestaltText gestaltText2 = jVar.f123806u0;
                if (gestaltText2 == null) {
                    Intrinsics.r("blockCreatorHeader");
                    throw null;
                }
                String string = jVar.getResources().getString(h02.e.report_pin_block_creator_title, j13);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                a0.p(gestaltText2, string);
                GestaltSwitchWithLabel gestaltSwitchWithLabel = jVar.f123807v0;
                if (gestaltSwitchWithLabel == null) {
                    Intrinsics.r("blockCreatorSwitch");
                    throw null;
                }
                c0.d.k(gestaltSwitchWithLabel, new v02.h(jVar, creator));
                pe.i.j(gestaltSwitchWithLabel, new v02.i(jVar, pinReportData));
            }
        } else if (networkResponse instanceof xz.a) {
            if (oVar.isBound()) {
                ((nl1.d) ((j02.a) oVar.getView())).D5();
            }
            oVar.f88863k.k(h02.e.report_pin_load_creator_failure);
        }
        return Unit.f80348a;
    }
}
