package zn1;

import android.content.Context;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.x;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes2.dex */
public final class a extends x {

    /* renamed from: e, reason: collision with root package name */
    public final Context f142287e;

    /* renamed from: f, reason: collision with root package name */
    public final ao1.b f142288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, TextInputLayout textInputLayout, ao1.b displayState) {
        super(textInputLayout);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textInputLayout, "textInputLayout");
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f142287e = context;
        this.f142288f = displayState;
    }

    @Override // com.google.android.material.textfield.x, q5.b
    public final void d(View host, r5.e info2) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info2, "info");
        super.d(host, info2);
        ao1.b bVar = this.f142288f;
        i0 i0Var = bVar.f20032c;
        Context context = this.f142287e;
        CharSequence a13 = i0Var.a(context);
        if (a13.length() > 0) {
            info2.w(bVar.f20035f == yn1.f.ERROR ? a13 : null);
            info2.y(a13);
        } else {
            info2.w(null);
            info2.y(bVar.f20034e.a(context));
        }
    }
}
