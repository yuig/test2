package mp;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import va1.j1;

/* loaded from: classes3.dex */
public final class r extends LinearLayout implements yk1.n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f87881d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f87882a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltIcon f87883b;

    /* renamed from: c, reason: collision with root package name */
    public final q f87884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, xc0.f.conversation_settings_menu_item, this);
        View findViewById = findViewById(xc0.e.conversation_settings_menu_item_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f87882a = (GestaltText) findViewById;
        View findViewById2 = findViewById(xc0.e.conversation_settings_menu_item_nav_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f87883b = (GestaltIcon) findViewById2;
        this.f87884c = new q(z13, this, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(bq0.i item, String conversationId, no1.e conversationDataSource, q12.b conversationService) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(conversationDataSource, "conversationDataSource");
        Intrinsics.checkNotNullParameter(conversationService, "conversationService");
        String str = null;
        va1.d dVar = item instanceof va1.d ? (va1.d) item : null;
        if (dVar != null) {
            setId(dVar.getId());
        }
        j1 j1Var = item instanceof j1 ? (j1) item : null;
        if (j1Var != null) {
            Integer num = j1Var.f125194a;
            String str2 = j1Var.f125195b;
            if (num != null && str2 != null) {
                str2 = getContext().getResources().getString(num.intValue(), str2);
            } else if (num != null) {
                str2 = getContext().getResources().getString(num.intValue());
            } else if (str2 == null) {
                str = "";
            }
            str = str2;
        }
        a0.p(this.f87882a, str != null ? str : "");
        boolean z13 = item instanceof va1.e;
        GestaltIcon gestaltIcon = this.f87883b;
        if (z13) {
            dl2.b.z(gestaltIcon, new p(item, 1));
        } else {
            kg.t.O(gestaltIcon);
        }
        setOnClickListener(new androidx.media3.ui.q(item, conversationId, conversationService, conversationDataSource, 1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        os0.b bVar = os0.b.f97497a;
        os0.b.d().h(this.f87884c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        os0.b bVar = os0.b.f97497a;
        os0.b.d().j(this.f87884c);
    }
}
