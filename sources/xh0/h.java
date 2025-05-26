package xh0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import jc0.m;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes5.dex */
public final class h extends b {

    /* renamed from: v, reason: collision with root package name */
    public final Context f134978v;

    /* renamed from: w, reason: collision with root package name */
    public final FrameLayout f134979w;

    /* renamed from: x, reason: collision with root package name */
    public final sh0.b f134980x;

    /* renamed from: y, reason: collision with root package name */
    public final GestaltText f134981y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, FrameLayout view, sh0.b answer) {
        super(view);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "frameLayout");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f134978v = context;
        this.f134979w = view;
        this.f134980x = answer;
        this.f134981y = new GestaltText(6, context, (AttributeSet) null);
    }

    public static void r0(Context context, FrameLayout frameLayout, boolean z13) {
        int i13 = rh0.b.circle_white_with_dark_gray_boundary;
        if (z13) {
            i13 = rh0.b.circle_dark_gray_selected;
        }
        Object obj = d5.a.f53679a;
        frameLayout.setBackground(context.getDrawable(i13));
    }

    @Override // xh0.a
    public final void a() {
        boolean z13 = !this.f134961u;
        this.f134961u = z13;
        r0(this.f134978v, this.f134979w, z13);
        this.f134981y.i(new m(this.f134961u, 4));
    }

    @Override // xh0.b
    public final void k0(sh0.b answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        GestaltText gestaltText = this.f134981y;
        a0.p(gestaltText, answer.f112918a);
        r0(this.f134978v, this.f134979w, this.f134961u);
        gestaltText.i(new m(this.f134961u, 4));
    }

    @Override // xh0.b
    public final b o0() {
        Context context = this.f134978v;
        h hVar = new h(context, new FrameLayout(context), this.f134980x);
        hh0.a aVar = new hh0.a(hVar, 5);
        GestaltText gestaltText = hVar.f134981y;
        gestaltText.i(aVar);
        Context context2 = hVar.f134978v;
        gestaltText.setHeight((int) context2.getResources().getDimension(rh0.a.express_survey_rating_item));
        gestaltText.setWidth((int) context2.getResources().getDimension(rh0.a.express_survey_rating_item));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = hVar.f134979w;
        frameLayout.addView(gestaltText, layoutParams);
        r0(context2, frameLayout, hVar.f134961u);
        gestaltText.i(new m(hVar.f134961u, 4));
        return hVar;
    }
}
