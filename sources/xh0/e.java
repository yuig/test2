package xh0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import bp.j;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends b {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f134969y = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Context f134970v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltButton f134971w;

    /* renamed from: x, reason: collision with root package name */
    public final View.OnClickListener f134972x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, GestaltButton view, View.OnClickListener onClickListener) {
        super(view);
        sh0.b answer = new sh0.b();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "button");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f134970v = context;
        this.f134971w = view;
        this.f134972x = onClickListener;
    }

    @Override // xh0.a
    public final void a() {
        this.f134961u = !this.f134961u;
    }

    @Override // xh0.b
    public final void k0(sh0.b answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.f134971w.d(new hh0.a(answer, 4));
    }

    @Override // xh0.b
    public final b o0() {
        Context context = this.f134970v;
        GestaltButton.SmallSecondaryButton smallSecondaryButton = new GestaltButton.SmallSecondaryButton(6, context, (AttributeSet) null);
        smallSecondaryButton.e(new j(17, this, smallSecondaryButton));
        e eVar = new e(context, smallSecondaryButton, this.f134972x);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Context context2 = eVar.f134970v;
        com.bumptech.glide.c.a1(marginLayoutParams, (int) context2.getResources().getDimension(rh0.a.margin_none), (int) context2.getResources().getDimension(rh0.a.express_survey_item_margin), (int) context2.getResources().getDimension(rh0.a.margin_none), (int) context2.getResources().getDimension(rh0.a.express_survey_item_margin));
        c cVar = c.f134963k;
        GestaltButton gestaltButton = eVar.f134971w;
        bs1.c.s(gestaltButton, cVar);
        gestaltButton.setLayoutParams(marginLayoutParams);
        return eVar;
    }
}
