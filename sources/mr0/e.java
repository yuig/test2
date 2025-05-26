package mr0;

import android.os.Bundle;
import android.view.View;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.n7;
import sq0.c0;
import yk1.m;
import yq0.k;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmr0/e;", "Lyq0/b0;", "Llr0/b;", "", "<init>", "()V", "didit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends a<lr0.b> implements c0 {
    public n7 A0;
    public c B0 = c.UNDEFINED_PARENT;
    public final d4 C0 = d4.PIN_DID_IT;
    public final a4 D0 = a4.USER_OTHERS;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f88084z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new k(this, 19));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r4 == null) goto L6;
     */
    @Override // nl1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R7(com.pinterest.navigation.Navigation r4) {
        /*
            r3 = this;
            super.R7(r4)
            if (r4 == 0) goto L17
            mr0.b r0 = mr0.c.Companion
            java.lang.String r1 = "com.pinterest.EXTRA_LIKE_PARENT_TYPE"
            r2 = -1
            int r4 = r4.q1(r2, r1)
            r0.getClass()
            mr0.c r4 = mr0.b.a(r4)
            if (r4 != 0) goto L19
        L17:
            mr0.c r4 = mr0.c.UNDEFINED_PARENT
        L19:
            r3.B0 = r4
            mr0.c r0 = mr0.c.UNDEFINED_PARENT
            if (r4 == r0) goto L20
            return
        L20:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "ParentType is undefined."
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mr0.e.R7(com.pinterest.navigation.Navigation):void");
    }

    @Override // yk1.k
    public final m V7() {
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        if (f49940b == null) {
            f49940b = "";
        }
        int i13 = d.f88083a[this.B0.ordinal()] == 1 ? 2 : 1;
        n7 n7Var = this.A0;
        if (n7Var == null) {
            Intrinsics.r("userLikesListPresenterFactory");
            throw null;
        }
        uk1.e eVar = this.f88084z0;
        if (eVar != null) {
            return n7Var.a(f49940b, i13, ((uk1.a) eVar).d(f49940b));
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getU0() {
        return this.D0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getT0() {
        return this.C0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(rf0.b.did_it_like_recycler_swipe, rf0.a.p_recycler_view);
        eVar.c(rf0.a.swipe_container);
        return eVar;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        fo1.a i73 = i7();
        if (i73 != null) {
            int i13 = d.f88083a[this.B0.ordinal()];
            String string = getString((i13 == 3 || i13 == 4) ? qf0.c.community_content_liked_by : ng0.c.likes);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ((GestaltToolbarImpl) i73).b0(string);
        }
    }
}
