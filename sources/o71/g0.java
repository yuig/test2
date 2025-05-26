package o71;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import q71.x0;

/* loaded from: classes5.dex */
public final class g0 extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f93292a;

    /* renamed from: b, reason: collision with root package name */
    public final nu1.a f93293b;

    /* renamed from: c, reason: collision with root package name */
    public br.d f93294c;

    /* renamed from: d, reason: collision with root package name */
    public vh f93295d;

    /* renamed from: e, reason: collision with root package name */
    public int f93296e;

    /* renamed from: f, reason: collision with root package name */
    public final ll.j f93297f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(uk1.d presenterPinalytics, nu1.a inAppNavigator) {
        super(0);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        this.f93292a = presenterPinalytics;
        this.f93293b = inAppNavigator;
        this.f93296e = -1;
        this.f93297f = new ll.j(16, 0);
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        List list;
        kj kjVar;
        String text;
        kj kjVar2;
        String text2;
        k71.n view = (k71.n) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        x0 x0Var = (x0) view;
        x0Var.f102790h = this;
        br.d dVar = this.f93294c;
        if (dVar != null) {
            vh vhVar = dVar.f23719q;
            this.f93295d = vhVar;
            if (vhVar != null && (kjVar2 = vhVar.f42855m) != null && (text2 = kjVar2.a()) != null) {
                Intrinsics.checkNotNullParameter(text2, "text");
                pk.a0.p(x0Var.f102785c, text2);
            }
            vh vhVar2 = this.f93295d;
            if (vhVar2 != null && (kjVar = vhVar2.f42856n) != null && (text = kjVar.a()) != null) {
                Intrinsics.checkNotNullParameter(text, "text");
                pk.a0.p(x0Var.f102784b, text);
            }
            vh vhVar3 = this.f93295d;
            if (vhVar3 == null || (list = vhVar3.f42865w) == null) {
                return;
            }
            ArrayList imageUrls = new ArrayList();
            for (int i13 = 0; i13 < list.size(); i13++) {
                Object obj = list.get(i13);
                Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.api.model.Pin");
                imageUrls.add(((f30) obj).y4());
            }
            Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
            x0Var.f102783a.setVisibility(0);
            String str = (String) CollectionsKt.U(0, imageUrls);
            if (str != null) {
                x0Var.f102786d.loadUrl(str);
            }
            String str2 = (String) CollectionsKt.U(1, imageUrls);
            if (str2 != null) {
                x0Var.f102787e.loadUrl(str2);
            }
            String str3 = (String) CollectionsKt.U(2, imageUrls);
            if (str3 != null) {
                x0Var.f102788f.loadUrl(str3);
            }
            String str4 = (String) CollectionsKt.U(3, imageUrls);
            if (str4 != null) {
                x0Var.f102789g.loadUrl(str4);
            }
        }
    }

    @Override // yk1.b
    public final void onUnbind() {
        ((x0) ((k71.n) getView())).f102790h = null;
        x0 x0Var = (x0) ((k71.n) getView());
        x0Var.getClass();
        Intrinsics.checkNotNullParameter("", "text");
        pk.a0.p(x0Var.f102785c, "");
        x0 x0Var2 = (x0) ((k71.n) getView());
        x0Var2.getClass();
        Intrinsics.checkNotNullParameter("", "text");
        pk.a0.p(x0Var2.f102784b, "");
        x0 x0Var3 = (x0) ((k71.n) getView());
        x0Var3.f102783a.setVisibility(8);
        x0Var3.f102786d.clear();
        x0Var3.f102787e.clear();
        x0Var3.f102788f.clear();
        x0Var3.f102789g.clear();
        super.onUnbind();
    }
}
