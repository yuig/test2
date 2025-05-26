package gv0;

import android.content.Context;
import com.pinterest.feature.pin.edit.view.AttributeActionView;
import com.pinterest.gestalt.text.GestaltText;
import cv0.i;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import rm1.q;
import vq0.h;
import yk1.n;
import zu0.c;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f66158a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66158a = context;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        int i14;
        AttributeActionView view = (AttributeActionView) nVar;
        i model = (i) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        Integer num = model.f53265b;
        if (num != null) {
            view.getClass();
            i14 = num.intValue();
        } else {
            i14 = -1;
        }
        view.setId(i14);
        int i15 = 0;
        a0.o(view.f47162d, model.f53266c, new Object[0]);
        String str = model.f53270g;
        if (str == null) {
            str = "";
        }
        GestaltText gestaltText = view.f47163e;
        a0.p(gestaltText, str);
        Integer num2 = model.f53268e;
        view.f47164f.i(new c(num2 != null ? bs1.c.f2(view, num2.intValue()) : null, 24));
        Integer num3 = model.f53267d;
        view.L(num3 != null ? num3.intValue() : 0, true);
        q qVar = model.f53269f;
        if (qVar != null) {
            pp2.a.k(gestaltText, new y11.c(i15, qVar, rm1.i.XS));
        } else {
            pp2.a.k(gestaltText, y11.a.f136624l);
        }
        view.setOnClickListener(new com.pinterest.feature.home.view.c(model, 7));
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        i model = (i) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        StringBuilder sb3 = new StringBuilder();
        int i14 = model.f53266c;
        Context context = this.f66158a;
        sb3.append(context.getString(i14));
        sb3.append(" ");
        Integer num = model.f53268e;
        if (num != null) {
            sb3.append(context.getString(num.intValue()));
            sb3.append(" ");
        }
        String str = model.f53270g;
        if (str != null && str.length() > 0) {
            sb3.append(str);
        }
        return sb3.toString();
    }
}
