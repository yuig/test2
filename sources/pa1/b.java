package pa1;

import android.content.Context;
import android.widget.Toast;
import b52.c;
import com.pinterest.api.model.wy0;
import h32.u0;
import i92.k;
import ja1.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mo1.d;
import sq0.c0;
import t3.s1;
import wk1.i;
import wk1.q;
import yk1.v;

/* loaded from: classes5.dex */
public final class b extends q {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f99392a;

    /* renamed from: b, reason: collision with root package name */
    public final k f99393b;

    /* renamed from: c, reason: collision with root package name */
    public final v f99394c;

    /* renamed from: d, reason: collision with root package name */
    public final d f99395d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f99396e;

    /* renamed from: f, reason: collision with root package name */
    public final x10.d f99397f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f99398g;

    /* renamed from: h, reason: collision with root package name */
    public final String f99399h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if ((!r2.isEmpty()) == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(uk1.d r2, uj2.q r3, com.pinterest.api.model.wy0 r4, i92.k r5, yk1.a r6, mo1.d r7, qa1.b r8, x10.d r9) {
        /*
            r1 = this;
            java.lang.String r0 = "pinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "networkStateStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "toastUtils"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "viewResources"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "intentHelper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onPostDeactivateAccount"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "settingsApi"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r1.<init>(r2, r3)
            r1.f99392a = r4
            r1.f99393b = r5
            r1.f99394c = r6
            r1.f99395d = r7
            r1.f99396e = r8
            r1.f99397f = r9
            if (r4 == 0) goto L39
            java.util.List r2 = r4.u2()
            goto L3a
        L39:
            r2 = 0
        L3a:
            if (r2 == 0) goto L4d
            java.util.List r2 = r4.u2()
            if (r2 == 0) goto L4d
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 != r3) goto L4d
            goto L4e
        L4d:
            r3 = 0
        L4e:
            r1.f99398g = r3
            if (r4 == 0) goto L58
            java.lang.String r2 = r4.z4()
            if (r2 != 0) goto L5a
        L58:
            java.lang.String r2 = ""
        L5a:
            r1.f99399h = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pa1.b.<init>(uk1.d, uj2.q, com.pinterest.api.model.wy0, i92.k, yk1.a, mo1.d, qa1.b, x10.d):void");
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(new e(0, this.f99392a));
    }

    public final void onBackPressed() {
        getPinalytics().X(u0.BACK_BUTTON);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        ((qa1.e) ((oa1.a) getView())).F0 = null;
        super.onUnbind();
    }

    public final void t3() {
        int i13 = this.f99398g ? c.deactivate_multiple_accounts_confirmation : c.deactivate_account_confirmation_toast;
        oa1.a aVar = (oa1.a) getView();
        String text = s1.d(new Object[]{this.f99399h}, 1, ((yk1.a) this.f99394c).f139224a.getString(i13), "format(...)");
        qa1.e eVar = (qa1.e) aVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(text, "toastMessage");
        Context context = eVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Toast.makeText(context, text, 1).show();
    }

    @Override // wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(oa1.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        qa1.e eVar = (qa1.e) view;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        eVar.F0 = this;
    }
}
