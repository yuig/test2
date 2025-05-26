package y90;

import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements s62.b {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f138136a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f138137b;

    public c(EditText view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f138136a = view;
        this.f138137b = view;
        view.setHintTextColor(dl2.b.y0(view, eo1.a.sema_color_text_subtle));
    }
}
