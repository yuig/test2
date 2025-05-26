package sv1;

import android.view.View;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kh2.m2;
import kh2.p2;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import nx.d0;
import yb0.n;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f115384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f115385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f115386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f115387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f115388f;

    public /* synthetic */ c(d0 d0Var, g0 g0Var, HashMap hashMap, q qVar, n nVar, int i13) {
        this.f115383a = i13;
        this.f115384b = d0Var;
        this.f115385c = g0Var;
        this.f115386d = hashMap;
        this.f115387e = qVar;
        this.f115388f = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f115383a;
        n this_apply = this.f115388f;
        q prefsManagerPersisted = this.f115387e;
        HashMap auxData = this.f115386d;
        g0 componentType = this.f115385c;
        d0 pinalytics = this.f115384b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                Intrinsics.checkNotNullParameter(componentType, "$componentType");
                Intrinsics.checkNotNullParameter(auxData, "$auxData");
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "$prefsManagerPersisted");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                pinalytics.h(componentType, u0.BODY_TYPE_FILTER_REMEMBER_NO, auxData);
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "<this>");
                prefsManagerPersisted.remove("PREF_BODY_TYPE_SELECTION");
                m2.f79619c = true;
                this_apply.g(yb0.d.CONFIRM_BUTTON_CLICK);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                Intrinsics.checkNotNullParameter(componentType, "$componenType");
                Intrinsics.checkNotNullParameter(auxData, "$auxData");
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "$prefsManagerPersisted");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                p2.f79649i = null;
                pinalytics.h(componentType, u0.HAIR_PATTERN_FILTER_REMEMBER_NO, auxData);
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "<this>");
                prefsManagerPersisted.remove("PREF_HAIR_PATTERN_SELECTION");
                p2.f79650j = true;
                this_apply.g(yb0.d.CANCEL_BUTTON_CLICK);
                break;
            default:
                Intrinsics.checkNotNullParameter(pinalytics, "$pinalytics");
                Intrinsics.checkNotNullParameter(componentType, "$componentType");
                Intrinsics.checkNotNullParameter(auxData, "$auxData");
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "$prefsManagerPersisted");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                u2.f79717c = null;
                pinalytics.h(componentType, u0.SKIN_TONE_FILTER_REMEMBER_NO, auxData);
                Intrinsics.checkNotNullParameter(prefsManagerPersisted, "<this>");
                prefsManagerPersisted.remove("PREF_SKIN_TONE_SELECTION");
                u2.f79718d = true;
                this_apply.g(yb0.d.CANCEL_BUTTON_CLICK);
                break;
        }
    }
}
