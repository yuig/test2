package p51;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.pinterest.api.model.gz0;
import com.pinterest.api.model.wy0;
import com.pinterest.ui.components.users.LegoUserRep;
import java.util.List;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;
import oa2.t;
import pe.i;
import vq0.h;
import w01.e0;
import yk1.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final v f98895a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f98896b;

    public c(yk1.a viewResources, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f98895a = viewResources;
        this.f98896b = activeUserManager;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        String str;
        List A4;
        m51.b view = (m51.b) nVar;
        gz0 model = (gz0) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        wy0 wy0Var = model.f38191d;
        String valueOf = String.valueOf(wy0Var.U2());
        wy0 f13 = ((b60.d) this.f98896b).f();
        Drawable drawable = null;
        v vVar = this.f98895a;
        if (f13 == null || !dl2.b.S1(f13, wy0Var.getUid())) {
            List A42 = wy0Var.A4();
            str = (A42 == null || A42.isEmpty() || (A4 = wy0Var.A4()) == null) ? null : (String) A4.get(0);
        } else {
            str = ((yk1.a) vVar).f139224a.getString(vc0.d.self_identifier);
        }
        String str2 = "";
        String str3 = str == null ? "" : str;
        rl1.a R0 = m0.R0(wy0Var, vVar, true);
        v32.a aVar = v32.c.Companion;
        int a13 = model.a();
        aVar.getClass();
        v32.c a14 = v32.a.a(a13);
        if (a14 == null) {
            a14 = v32.c.NONE;
        }
        m51.a viewModel = new m51.a(valueOf, str3, R0, a14, new b01.c(19, view, wy0Var));
        b bVar = (b) view;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        LegoUserRep legoUserRep = bVar.f98893a;
        t.i4(legoUserRep, valueOf, 0, null, 14);
        legoUserRep.P0(str3);
        i.v1(legoUserRep.f52345e, R0);
        legoUserRep.z1(new e0(viewModel, 24));
        AppCompatImageView appCompatImageView = bVar.f98894b;
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] iArr = a.f98892a;
        int i14 = iArr[a14.ordinal()];
        if (i14 == 1) {
            int i15 = sm1.b.ic_reaction_heart_outline_gestalt;
            Object obj2 = d5.a.f53679a;
            Drawable drawable2 = context.getDrawable(i15);
            if (drawable2 != null) {
                drawable = drawable2;
            }
        } else if (i14 == 2) {
            int i16 = ga2.c.ic_comment_reaction_love;
            Object obj3 = d5.a.f53679a;
            drawable = context.getDrawable(i16);
        } else if (i14 == 3) {
            int i17 = ga2.c.ic_comment_reaction_helpful;
            Object obj4 = d5.a.f53679a;
            drawable = context.getDrawable(i17);
        }
        if (drawable != null) {
            appCompatImageView.setImageDrawable(drawable);
        }
        Context context2 = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int i18 = iArr[a14.ordinal()];
        if (i18 == 2) {
            str2 = context2.getString(cb0.e.love);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
        } else if (i18 == 3) {
            str2 = context2.getString(cb0.e.helpful);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
        }
        appCompatImageView.setContentDescription(str2);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        gz0 model = (gz0) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
