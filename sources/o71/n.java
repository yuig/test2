package o71;

import com.pinterest.api.model.cx;
import com.pinterest.api.model.yw;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final l71.p f93349a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.w f93350b;

    /* renamed from: c, reason: collision with root package name */
    public br.d f93351c;

    /* renamed from: d, reason: collision with root package name */
    public String f93352d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93353e;

    /* renamed from: f, reason: collision with root package name */
    public int f93354f;

    /* renamed from: g, reason: collision with root package name */
    public Date f93355g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(uk1.d presenterPinalytics, uj2.q networkStateStream, l71.p searchTypeaheadListener, m60.w eventManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(searchTypeaheadListener, "searchTypeaheadListener");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f93349a = searchTypeaheadListener;
        this.f93350b = eventManager;
        this.f93354f = -1;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        k71.d view = (k71.d) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        s3();
    }

    public final String q3() {
        yw ywVar;
        cx j13;
        yw ywVar2;
        cx h10;
        String h13;
        br.d dVar = this.f93351c;
        if (dVar != null && (ywVar2 = dVar.f23720r) != null && (h10 = ywVar2.h()) != null && (h13 = h10.h()) != null) {
            return h13;
        }
        br.d dVar2 = this.f93351c;
        if (dVar2 == null || (ywVar = dVar2.f23720r) == null || (j13 = ywVar.j()) == null) {
            return null;
        }
        return j13.h();
    }

    public final void r3(String selectedFilterApiTerm) {
        String q33;
        c71.b0 b0Var;
        yw ywVar;
        Intrinsics.checkNotNullParameter(selectedFilterApiTerm, "selectedFilterApiTerm");
        br.d dVar = this.f93351c;
        if (dVar == null) {
            return;
        }
        if (!this.f93349a.a(dVar, this.f93354f, this.f93353e) || dVar.f23707e == null || this.f93352d == null || (q33 = q3()) == null) {
            return;
        }
        br.c cVar = dVar.f23707e;
        Intrinsics.checkNotNullExpressionValue(cVar, "getItemType(...)");
        String B = pe.i.B(cVar, this.f93353e);
        h61.h F = pe.i.F(cVar, null);
        Date date = this.f93355g;
        String valueOf = date != null ? String.valueOf(new Date().getTime() - date.getTime()) : null;
        String[] values = {q33, B, String.valueOf(this.f93354f)};
        Intrinsics.checkNotNullParameter(values, "values");
        String M = kotlin.collections.c0.M(values, "|", null, null, 0, null, null, 62);
        br.d dVar2 = this.f93351c;
        if (dVar2 != null && (ywVar = dVar2.f23720r) != null) {
            boolean[] zArr = ywVar.f44138e;
            if (zArr.length > 2 && zArr[2]) {
                b0Var = new c71.b0(F, q33, this.f93352d, valueOf, null, null, null, null, null, B, null, null, kotlin.collections.f0.d(M), null, selectedFilterApiTerm, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -590864, 2097151);
                this.f93350b.d(c71.b0.c(b0Var, false, 3));
            }
        }
        b0Var = new c71.b0(F, q33, this.f93352d, valueOf, null, null, null, null, null, B, null, null, kotlin.collections.f0.d(M), selectedFilterApiTerm, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -328720, 2097151);
        this.f93350b.d(c71.b0.c(b0Var, false, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s3() {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o71.n.s3():void");
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        k71.d view = (k71.d) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        s3();
    }
}
