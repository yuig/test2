package dz0;

import android.content.Context;
import ao2.j0;
import com.pinterest.feature.onetap.view.OneTapPinVideoGridCell;
import ez0.h;
import ez0.i;
import ez0.j;
import i91.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;
import vb0.e;
import xk2.v;
import yq0.z;
import zf0.f;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56651i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f56652j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f56653k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d0 f56654l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f56655m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f56656n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Context context, d0 d0Var, u uVar, z zVar) {
        super(0);
        this.f56652j = dVar;
        this.f56653k = context;
        this.f56654l = d0Var;
        this.f56655m = uVar;
        this.f56656n = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f56651i;
        z zVar = this.f56656n;
        d dVar = this.f56652j;
        switch (i13) {
            case 0:
                i iVar = dVar.f56659b;
                j0 scope = zVar.f139760f;
                iVar.getClass();
                Context context = this.f56653k;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(scope, "scope");
                d0 pinalytics = this.f56654l;
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                u style = this.f56655m;
                Intrinsics.checkNotNullParameter(style, "style");
                return new h(context, scope, pinalytics, iVar.f60687a, iVar.f60688b, iVar.f60689c, style, iVar.f60690d);
            default:
                j jVar = dVar.f56658a;
                j0 scope2 = zVar.f139760f;
                jVar.getClass();
                Context context2 = this.f56653k;
                Intrinsics.checkNotNullParameter(context2, "context");
                d0 pinalytics2 = this.f56654l;
                Intrinsics.checkNotNullParameter(pinalytics2, "pinalytics");
                u style2 = this.f56655m;
                Intrinsics.checkNotNullParameter(style2, "style");
                Intrinsics.checkNotNullParameter(scope2, "scope");
                v vVar = f.f141903e;
                e.e().getClass();
                return new OneTapPinVideoGridCell(context2, pinalytics2, scope2, bs1.c.q(f.h()), style2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Context context, z zVar, d0 d0Var, u uVar) {
        super(0);
        this.f56652j = dVar;
        this.f56653k = context;
        this.f56656n = zVar;
        this.f56654l = d0Var;
        this.f56655m = uVar;
    }
}
