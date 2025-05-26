package gn1;

import android.content.Context;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.x;
import fn1.b;
import fn1.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import r5.e;
import u50.i0;

/* loaded from: classes5.dex */
public final class a extends x {

    /* renamed from: e, reason: collision with root package name */
    public final Context f65809e;

    /* renamed from: f, reason: collision with root package name */
    public final b f65810f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, TextInputLayout textInputLayout, b displayState) {
        super(textInputLayout);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textInputLayout, "textInputLayout");
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f65809e = context;
        this.f65810f = displayState;
    }

    @Override // com.google.android.material.textfield.x, q5.b
    public final void d(View host, e info2) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info2, "info");
        super.d(host, info2);
        b bVar = this.f65810f;
        i0 i0Var = bVar.f62678c;
        Context context = this.f65809e;
        CharSequence a13 = i0Var.a(context);
        Integer num = bVar.f62676a;
        String str = "";
        if (num != null) {
            int intValue = num.intValue();
            List list = bVar.f62677b;
            if (list != null) {
                str = ((i0) list.get(intValue)).a(context).toString();
            }
        }
        info2.F("{" + ((Object) a13) + " - " + ((Object) str) + "}");
        CharSequence a14 = bVar.f62679d.a(context);
        if (a14.length() > 0) {
            info2.w(bVar.f62682g == f.ERROR ? a14 : null);
            info2.y(a14);
        } else {
            info2.w(null);
            info2.y(bVar.f62681f.a(context));
        }
    }
}
