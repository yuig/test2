package nk0;

import android.view.View;
import kg.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends cf0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91093a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f91094b;

    public b(int i13, Function0 function0) {
        this.f91093a = i13;
        this.f91094b = function0;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        int i13 = this.f91093a;
        Function0 function0 = this.f91094b;
        switch (i13) {
            case 0:
                n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                function0.invoke();
                break;
            case 1:
                n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                function0.invoke();
                break;
            default:
                n.a(widget);
                Intrinsics.checkNotNullParameter(widget, "widget");
                function0.invoke();
                break;
        }
    }

    public b(Function0 clickHandler) {
        this.f91093a = 0;
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        this.f91094b = clickHandler;
    }
}
