package l61;

import android.content.Context;
import android.net.Uri;
import com.pinterest.api.model.vy;
import com.pinterest.api.model.yy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sq0.c0;
import wk1.i;
import wk1.q;
import yq0.t;

/* loaded from: classes5.dex */
public final class f extends q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f81602a;

    /* renamed from: b, reason: collision with root package name */
    public yy f81603b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81604c;

    /* renamed from: d, reason: collision with root package name */
    public final r61.b f81605d;

    /* renamed from: e, reason: collision with root package name */
    public final t12.b f81606e;

    /* renamed from: f, reason: collision with root package name */
    public final g f81607f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.content.Context r2, com.pinterest.api.model.yy r3, java.lang.String r4, nx.a0 r5, r61.b r6, uk1.e r7, uj2.q r8, t12.b r9) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "noOpPinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "mixpanelManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "pinalyticsFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "networkStateStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "goldStandardService"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            uk1.d r5 = uk1.e.b(r7, r5)
            r1.<init>(r5, r8)
            r1.f81602a = r2
            r1.f81603b = r3
            r1.f81604c = r4
            r1.f81605d = r6
            r1.f81606e = r9
            l61.g r2 = new l61.g
            r3 = 0
            r2.<init>(r3)
            r1.f81607f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l61.f.<init>(android.content.Context, com.pinterest.api.model.yy, java.lang.String, nx.a0, r61.b, uk1.e, uj2.q, t12.b):void");
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f81607f);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        ((d) ((h) getView())).f81597x0 = null;
        super.onUnbind();
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return false;
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(h view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        ((d) view).f81597x0 = this;
        if (this.f81603b != null) {
            u3();
            return;
        }
        ((t) ((h) getView())).setLoadState(yk1.i.LOADING);
        String url = this.f81604c;
        if (url != null) {
            t12.b goldStandardService = this.f81606e;
            Intrinsics.checkNotNullParameter(goldStandardService, "goldStandardService");
            Intrinsics.checkNotNullParameter(url, "url");
            Uri parse = Uri.parse(url);
            int i13 = 0;
            boolean booleanQueryParameter = parse.getBooleanQueryParameter("is_safe", false);
            String queryParameter = parse.getQueryParameter("advisory");
            goldStandardService.a(booleanQueryParameter, queryParameter != null ? StringsKt.toIntOrNull(queryParameter) : null).r(tk2.e.f118017c).l(wj2.c.a()).o(new u51.b(6, new e(this, i13)), new u51.b(7, new e(this, 1)));
        }
    }

    public final void u3() {
        yy yyVar = this.f81603b;
        List<vy> k13 = yyVar != null ? yyVar.k() : null;
        ArrayList arrayList = new ArrayList();
        if (k13 != null) {
            for (vy vyVar : k13) {
                Object value3 = vyVar.f43018a;
                if (value3 != null) {
                    Intrinsics.checkNotNullParameter(value3, "value0");
                } else {
                    value3 = vyVar.f43019b;
                    if (value3 != null) {
                        Intrinsics.checkNotNullParameter(value3, "value1");
                    } else {
                        value3 = vyVar.f43020c;
                        if (value3 != null) {
                            Intrinsics.checkNotNullParameter(value3, "value2");
                        } else {
                            value3 = vyVar.f43021d;
                            if (value3 != null) {
                                Intrinsics.checkNotNullParameter(value3, "value3");
                            } else {
                                value3 = null;
                            }
                        }
                    }
                }
                if (value3 != null) {
                    arrayList.add(value3);
                }
            }
        }
        this.f81607f.k(arrayList);
        loadData();
    }
}
