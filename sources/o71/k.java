package o71;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class k extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final yk1.v f93322a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f93323b;

    /* renamed from: c, reason: collision with root package name */
    public final g70.h f93324c;

    /* renamed from: d, reason: collision with root package name */
    public br.d f93325d;

    /* renamed from: e, reason: collision with root package name */
    public int f93326e;

    /* renamed from: f, reason: collision with root package name */
    public String f93327f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yk1.v viewResources, uk1.d presenterPinalytics, uj2.q networkStateStream, l0 typeaheadLogging, g70.h boardNavigator) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(typeaheadLogging, "typeaheadLogging");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f93322a = viewResources;
        this.f93323b = typeaheadLogging;
        this.f93324c = boardNavigator;
        this.f93326e = -1;
        this.f93327f = "";
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        k71.c view = (k71.c) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        r3();
    }

    public final void q3() {
        br.d dVar = this.f93325d;
        if (dVar != null && dVar.f23707e == br.c.BOARD) {
            String str = dVar.f23704b;
            String obj = str != null ? StringsKt.i0(str).toString() : null;
            if (obj == null) {
                obj = "";
            }
            l0.c(this.f93323b, this.f93327f, obj, this.f93326e, "board", null, 48);
            this.f93323b.a(dVar);
            String str2 = dVar.f23703a;
            Intrinsics.checkNotNullExpressionValue(str2, "getUid(...)");
            g70.h.g(this.f93324c, str2, null, null, 6);
        }
    }

    public final void r3() {
        if (isBound()) {
            br.d dVar = this.f93325d;
            if ((dVar != null ? dVar.f23707e : null) == br.c.BOARD && dVar != null) {
                String str = dVar.f23704b;
                if (str == null) {
                    str = "";
                }
                String str2 = dVar.f23716n;
                ((k71.c) getView()).u1(str);
                ((k71.c) getView()).D4(this);
                ((k71.c) getView()).R3(str, str2);
                String str3 = dVar.f23708f;
                Uri.parse(str3);
                if (str3 != null) {
                    Uri parse = Uri.parse(str3);
                    k71.c cVar = (k71.c) getView();
                    Intrinsics.f(parse);
                    cVar.H5(parse);
                }
                if (str2 != null) {
                    ((k71.c) getView()).u(((yk1.a) this.f93322a).f139224a.getString(n42.e.article_by, str2));
                }
            }
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        k71.c view = (k71.c) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        r3();
    }
}
