package ib1;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.listAction.GestaltListAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.e0;
import so.jb;
import ye2.o;
import yk1.n;

/* loaded from: classes5.dex */
public final class b extends RelativeLayout implements n, af2.c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f72017g = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f72018a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f72019b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f72020c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltListAction f72021d;

    /* renamed from: e, reason: collision with root package name */
    public final String f72022e;

    /* renamed from: f, reason: collision with root package name */
    public final lu1.b f72023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, d handleAction) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleAction, "handleAction");
        if (!this.f72019b) {
            this.f72019b = true;
            this.f72023f = (lu1.b) ((jb) ((c) generatedComponent())).f113483a.f113961v5.get();
        }
        this.f72020c = handleAction;
        View.inflate(context, e52.b.view_settings_notifications_page_item, this);
        View findViewById = findViewById(e52.a.settings_notifications_page_list_action);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f72021d = (GestaltListAction) findViewById;
        String string = getResources().getString(e52.c.url_notifications_help, e0.a());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f72022e = string;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f72018a == null) {
            this.f72018a = new o(this);
        }
        return this.f72018a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f72018a == null) {
            this.f72018a = new o(this);
        }
        return this.f72018a.generatedComponent();
    }
}
