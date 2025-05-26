package ma1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends RelativeLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f86772h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f86773a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f86774b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f86775c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f86776d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f86777e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f86778f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltButton f86779g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(l52.b.view_settings_connected_device_item, (ViewGroup) this, true);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View findViewById = findViewById(l52.a.connected_devices_last_accessed_heading);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f86773a = (GestaltText) findViewById;
        View findViewById2 = findViewById(l52.a.connected_devices_last_accessed_value);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f86774b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(l52.a.connected_devices_location_heading);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f86775c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(l52.a.connected_devices_location_value);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f86776d = (GestaltText) findViewById4;
        View findViewById5 = findViewById(l52.a.connected_devices_device_type_heading);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f86777e = (GestaltText) findViewById5;
        View findViewById6 = findViewById(l52.a.connected_devices_device_type_value);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f86778f = (GestaltText) findViewById6;
        View findViewById7 = findViewById(l52.a.connected_devices_end_activity);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f86779g = (GestaltButton) findViewById7;
    }

    public final void a(p displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f86773a.i(a.f86766j);
        this.f86774b.i(new b(displayState, 0));
        this.f86775c.i(a.f86767k);
        this.f86776d.i(new b(displayState, 1));
        this.f86777e.i(a.f86768l);
        this.f86778f.i(new b(displayState, 2));
        this.f86779g.d(new b(displayState, 3));
    }

    public final void b(p91.v eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.f86779g.e(new defpackage.a(23, eventHandler));
    }
}
