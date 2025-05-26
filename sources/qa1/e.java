package qa1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.a4;
import h32.d4;
import i92.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import rm1.q;
import yk1.m;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqa1/e;", "Lyq0/b0;", "", "Loa1/a;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends a<Object> implements oa1.a {
    public uk1.e A0;
    public mr1.a B0;
    public mo1.d C0;
    public x10.d D0;
    public UserDeserializer E0;
    public pa1.b F0;
    public final d4 G0 = d4.SETTINGS;
    public final a4 H0 = a4.ACCOUNT_DEACTIVATE;

    /* renamed from: z0, reason: collision with root package name */
    public k f103205z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(0, new c(this, 0));
        adapter.G(2, new c(this, 1));
        adapter.G(1, new c(this, 2));
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.header_view_back_icon_size);
        q qVar = q.CANCEL;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        int i13 = eo1.b.color_themed_text_default;
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context.getDrawable(drawableRes);
        Intrinsics.checkNotNullParameter(context, "context");
        BitmapDrawable bitmapDrawable = null;
        if (drawable2 != null) {
            drawable = sh.f.d(i13 == 0 ? context.getColor(df0.a.f54892a) : context.getColor(i13), context, drawable2);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            bitmapDrawable = d7.b.p0(drawable, resources, dimensionPixelSize, dimensionPixelSize);
        }
        String string = getString(c52.e.close);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ((GestaltToolbarImpl) toolbar).T(bitmapDrawable, string);
    }

    @Override // yk1.k
    public final m V7() {
        uk1.e eVar = this.A0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        wk2.a aVar = this.f91283h;
        if (aVar == null) {
            Intrinsics.r("currentUserProvider");
            throw null;
        }
        wy0 wy0Var = (wy0) aVar.get();
        k kVar = this.f103205z0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        yk1.a aVar2 = new yk1.a(getResources(), requireContext().getTheme());
        mo1.d dVar = this.C0;
        if (dVar == null) {
            Intrinsics.r("intentHelper");
            throw null;
        }
        b bVar = new b(this);
        x10.d dVar2 = this.D0;
        if (dVar2 != null) {
            return new pa1.b(g13, p73, wy0Var, kVar, aVar2, dVar, bVar, dVar2);
        }
        Intrinsics.r("settingsApi");
        throw null;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        pa1.b bVar = this.F0;
        if (bVar != null) {
            bVar.onBackPressed();
        }
        nl1.d.J7();
        return false;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF22548u0() {
        return this.H0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF22547t0() {
        return this.G0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(b52.b.fragment_close_deactivate_account, b52.a.p_recycler_view);
        eVar.f979c = b52.a.empty_state_container;
        return eVar;
    }
}
