package iq1;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.qk0;
import com.pinterest.gestalt.text.GestaltText;
import h32.u0;
import hl0.v;
import java.util.HashMap;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.x0;
import nm.o;
import nr0.m;
import so.n6;
import so.p;
import wk1.i;
import wk1.n;
import x02.i2;
import x02.x2;
import y32.f;

/* loaded from: classes5.dex */
public final class e extends n implements ca2.b {

    /* renamed from: a, reason: collision with root package name */
    public qk0 f73426a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73427b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73428c;

    /* renamed from: d, reason: collision with root package name */
    public final qf1.n f73429d;

    /* renamed from: e, reason: collision with root package name */
    public final i2 f73430e;

    /* renamed from: f, reason: collision with root package name */
    public final x2 f73431f;

    /* renamed from: g, reason: collision with root package name */
    public final c2 f73432g;

    /* renamed from: h, reason: collision with root package name */
    public final es.a f73433h;

    /* renamed from: i, reason: collision with root package name */
    public f30 f73434i;

    /* renamed from: j, reason: collision with root package name */
    public final hq1.a f73435j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qk0 qk0Var, String str, boolean z13, String apiEndpoint, wk1.c params, HashMap apiParams, HashMap hashMap, qf1.n nVar, boolean z14, g0 pageSizeProvider, m dynamicGridViewBinderDelegateFactory, i2 pinRepository, x2 userRepository, c2 sharesheetUtils, es.a adFormats) {
        super(params);
        Intrinsics.checkNotNullParameter(apiEndpoint, "apiEndpoint");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f73426a = qk0Var;
        this.f73427b = str;
        this.f73428c = z13;
        this.f73429d = nVar;
        this.f73430e = pinRepository;
        this.f73431f = userRepository;
        this.f73432g = sharesheetUtils;
        this.f73433h = adFormats;
        uk1.d presenterPinalytics = getPresenterPinalytics();
        qa2.n nVar2 = params.f130131b;
        this.f73435j = new hq1.a(apiParams, pageSizeProvider, z14, apiEndpoint, params.f130137h, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar2.f103320a, nVar2, params.f130137h), hashMap);
    }

    @Override // ca2.b
    public final void M0(String str) {
        if (isBound()) {
            ((jq1.n) ((gq1.c) getView())).P7();
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f73435j);
    }

    @Override // wk1.q, yk1.b
    public final void onRestoreInstanceState(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString("basics_cached_model")) != null) {
            this.f73426a = (qk0) new o().b(qk0.class, string);
        }
        super.onRestoreInstanceState(bundle);
    }

    @Override // wk1.q, yk1.b
    public final void onSaveInstance(Bundle bundle) {
        if (this.f73426a != null && bundle != null) {
            bundle.putString("basics_cached_model", new o().k(this.f73426a));
        }
        super.onSaveInstance(bundle);
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return this.f73429d == null && !this.f73428c && ((this instanceof v) ^ true);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0220 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0221  */
    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r3(gq1.c r22) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: iq1.e.r3(gq1.c):void");
    }

    public final void v3() {
        gq1.c cVar = (gq1.c) getView();
        f30 f30Var = this.f73434i;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        jq1.n nVar = (jq1.n) cVar;
        nVar.s7().X(u0.PIN_STORY_PIN_COPY_MATERIALS_BUTTON);
        Context requireContext = nVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltText gestaltText = nVar.f77513t1;
        if (gestaltText == null) {
            Intrinsics.r("keyValuesView");
            throw null;
        }
        CharSequence text = gestaltText.getText();
        GestaltText gestaltText2 = nVar.f77514u1;
        if (gestaltText2 == null) {
            Intrinsics.r("listView");
            throw null;
        }
        String str = ((Object) text) + "\n" + ((Object) gestaltText2.getText());
        String str2 = nVar.f77519z1;
        if (str2 == null) {
            Intrinsics.r("pinTitle");
            throw null;
        }
        String D = a.a.D(str2, "\n", str);
        Resources resources = nVar.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String c23 = bs1.c.c2(x0.copied, resources);
        int value = f.INGREDIENTS_AUTOCOPY.getValue();
        p pVar = nVar.f77503j1;
        if (pVar != null) {
            s0.G0(requireContext, f30Var, D, value, c23, pVar);
        } else {
            Intrinsics.r("ingredientsInviteCodeHandlerFactory");
            throw null;
        }
    }

    public final void w3() {
        f30 f30Var = this.f73434i;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        this.f73432g.p(f.INGREDIENTS_AUTOCOPY.getValue(), f30Var);
    }
}
