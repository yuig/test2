package xh0;

import android.content.Context;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends b {

    /* renamed from: v, reason: collision with root package name */
    public final Context f134975v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltCheckBox f134976w;

    /* renamed from: x, reason: collision with root package name */
    public final String f134977x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, GestaltCheckBox view) {
        super(view);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "checkBox");
        Intrinsics.checkNotNullParameter("", "text");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f134975v = context;
        this.f134976w = view;
        this.f134977x = "";
    }

    @Override // xh0.a
    public final void a() {
        this.f134961u = !this.f134961u;
        this.f134976w.L(new f(this, 1));
    }

    @Override // xh0.b
    public final void k0(sh0.b answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.f134976w.L(new gd0.c(15, answer, this));
    }

    @Override // xh0.b
    public final b o0() {
        Context context = this.f134975v;
        g gVar = new g(context, new GestaltCheckBox(context));
        gVar.f134976w.L(new f(gVar, 0));
        return gVar;
    }
}
