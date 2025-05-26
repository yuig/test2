package lr;

import android.content.Context;
import com.pinterest.api.model.wy0;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes3.dex */
public final class a0 extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f84469d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f84470e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84471f;

    /* renamed from: g, reason: collision with root package name */
    public final wy0 f84472g;

    /* renamed from: h, reason: collision with root package name */
    public final int f84473h;

    /* renamed from: i, reason: collision with root package name */
    public final int f84474i;

    public a0(String text, String str, wy0 wy0Var, int i13, int i14) {
        str = (i14 & 4) != 0 ? null : str;
        wy0Var = (i14 & 8) != 0 ? null : wy0Var;
        Intrinsics.checkNotNullParameter(text, "text");
        this.f84469d = text;
        this.f84470e = null;
        this.f84471f = str;
        this.f84472g = wy0Var;
        this.f84473h = i13;
        this.f84474i = 7000;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        i0 h23;
        Intrinsics.checkNotNullParameter(container, "container");
        String str = this.f84471f;
        if (str == null) {
            str = null;
        }
        wy0 wy0Var = this.f84472g;
        if (wy0Var != null) {
            str = dl2.b.t0(wy0Var);
        }
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer num = this.f84470e;
        if (num != null) {
            h23 = bs1.c.j2(new String[0], num.intValue());
        } else {
            CharSequence a03 = j1.a0(this.f84469d.toString());
            Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
            h23 = bs1.c.h2(a03);
        }
        return new GestaltToast(context, new do1.d(h23, str != null ? new do1.j(str) : null, null, null, 0, this.f84474i, this.f84473h, null, false, 412));
    }
}
