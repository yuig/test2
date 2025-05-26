package xa1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends LinearLayout implements yk1.n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f134461d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f134462a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f134463b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltIcon f134464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, k handleAction) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        this.f134462a = handleAction;
        View.inflate(context, d52.b.view_settings_menu_item, this);
        View findViewById = findViewById(d52.a.settings_menu_item_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f134463b = (GestaltText) findViewById;
        View findViewById2 = findViewById(d52.a.settings_menu_item_nav_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f134464c = (GestaltIcon) findViewById2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(va1.e1 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5 instanceof va1.d
            r1 = 0
            if (r0 == 0) goto Le
            r0 = r5
            va1.d r0 = (va1.d) r0
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L18
            int r0 = r0.getId()
            r4.setId(r0)
        L18:
            boolean r0 = r5 instanceof va1.j1
            if (r0 == 0) goto L20
            r0 = r5
            va1.j1 r0 = (va1.j1) r0
            goto L21
        L20:
            r0 = r1
        L21:
            java.lang.String r2 = ""
            if (r0 == 0) goto L42
            java.lang.Integer r1 = r0.f125194a
            if (r1 == 0) goto L3b
            int r1 = r1.intValue()
            android.content.Context r3 = r4.getContext()
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r1 = r3.getString(r1)
            if (r1 != 0) goto L42
        L3b:
            java.lang.String r0 = r0.f125195b
            if (r0 != 0) goto L41
            r1 = r2
            goto L42
        L41:
            r1 = r0
        L42:
            if (r1 != 0) goto L45
            goto L46
        L45:
            r2 = r1
        L46:
            com.pinterest.gestalt.text.GestaltText r0 = r4.f134463b
            pk.a0.p(r0, r2)
            boolean r0 = r5 instanceof va1.e
            com.pinterest.gestalt.iconcomponent.GestaltIcon r1 = r4.f134464c
            if (r0 == 0) goto L5b
            xa1.n r0 = new xa1.n
            r2 = 1
            r0.<init>(r5, r2)
            dl2.b.z(r1, r0)
            goto L5e
        L5b:
            kg.t.O(r1)
        L5e:
            qv0.d0 r0 = new qv0.d0
            r1 = 26
            r0.<init>(r1, r4, r5)
            r4.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xa1.o.a(va1.e1):void");
    }
}
