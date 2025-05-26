package re1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.y0;
import z32.k0;
import z32.m0;

/* loaded from: classes5.dex */
public final class b extends yk1.c implements z {

    /* renamed from: a, reason: collision with root package name */
    public e50.v f107538a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f107539b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f107540c;

    /* renamed from: d, reason: collision with root package name */
    public p f107541d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 toViewState, uk1.d presenterPinalytics, uj2.q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(toViewState, "toViewState");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f107538a = null;
        this.f107539b = toViewState;
    }

    @Override // re1.z
    public final y0 E1() {
        return null;
    }

    @Override // re1.z
    public final y0 I() {
        return null;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        a0 view = (a0) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        e50.v vVar = this.f107538a;
        if (vVar != null) {
            view.L3();
            view.setVisible(false);
            q3(vVar, this.f107540c);
        }
    }

    public final void q3(e50.v fields, Integer num) {
        m0 m0Var;
        Intrinsics.checkNotNullParameter(fields, "fields");
        Unit unit = null;
        this.f107538a = null;
        this.f107540c = 0;
        this.f107541d = null;
        if (isBound()) {
            a0 a0Var = (a0) getView();
            a0Var.L3();
            a0Var.setVisible(false);
        }
        this.f107538a = fields;
        this.f107540c = num;
        if (isBound()) {
            ((a0) getView()).P5(this);
            Object obj = fields.f57432c;
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null) {
                int intValue = num2.intValue();
                m0.Companion.getClass();
                m0Var = k0.a(intValue);
            } else {
                m0Var = null;
            }
            if (m0Var == null || a.f107537a[m0Var.ordinal()] != 1) {
                ((a0) getView()).setVisible(false);
                return;
            }
            a0 a0Var2 = (a0) getView();
            p pVar = this.f107541d;
            if (pVar == null) {
                pVar = (p) this.f107539b.invoke(fields);
                Intrinsics.g(pVar, "null cannot be cast to non-null type com.pinterest.feature.shopping.shoppingstories.structuredfeed.StoryContract.StructuredFeedHeaderView.GQLHeaderModel");
                this.f107541d = pVar;
            }
            a0Var2.g(pVar);
            if (this.f107541d != null) {
                ((a0) getView()).setVisible(true);
                unit = Unit.f80348a;
            }
            if (unit == null) {
                ((a0) getView()).setVisible(false);
            }
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        a0 view = (a0) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        e50.v vVar = this.f107538a;
        if (vVar != null) {
            view.L3();
            view.setVisible(false);
            q3(vVar, this.f107540c);
        }
    }
}
