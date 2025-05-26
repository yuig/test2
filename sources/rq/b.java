package rq;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b extends PinCloseupBaseModule implements cr0.j {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f109104c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final pb0.d f109105a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltText f109106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, pb0.d dateFormatter) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        this.f109105a = dateFormatter;
    }

    public abstract int b();

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        View inflate = View.inflate(getContext(), b(), this);
        Intrinsics.f(inflate);
        g(inflate);
        View findViewById = inflate.findViewById(n80.c.analytics_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f109106b = (GestaltText) findViewById;
        View findViewById2 = inflate.findViewById(n80.c.navigationButton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        if (gestaltButton == null) {
            Intrinsics.r("navigationButton");
            throw null;
        }
        gestaltButton.e(new xo.k(this, 4));
        e().bind(this);
        updateView();
    }

    public abstract er0.d e();

    public abstract void g(View view);

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_PIN_ANALYTICS;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    public final void i(cr0.g lastUpdatedState) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(lastUpdatedState, "lastUpdatedState");
        int i13 = a.f109072a[lastUpdatedState.f53095b.ordinal()];
        if (i13 != 1) {
            Date date = lastUpdatedState.f53097d;
            pb0.d dVar = this.f109105a;
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (date != null) {
                    String string3 = getContext().getString(r80.f.analytics_updated_prefix);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    string = df.j1.Y(string3, new Object[]{dVar.b(date, pb0.b.STYLE_NORMAL, true)}, getBidiFormatter(), 2);
                }
                string = null;
            } else {
                if (date != null) {
                    String string4 = getContext().getString(r80.f.analytics_updated_prefix);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    string = df.j1.Y(string4, new Object[]{dVar.b(date, pb0.b.STYLE_NORMAL, true)}, getBidiFormatter(), 2);
                }
                string = null;
            }
        } else {
            string = getContext().getString(r80.f.creator_stats_updated_realtime);
        }
        int i14 = a.f109073b[lastUpdatedState.f53096c.ordinal()];
        if (i14 == 1) {
            string2 = getContext().getString(n80.f.creator_stats_all_time_pin_realtime);
        } else if (i14 == 2) {
            string2 = getContext().getString(n80.f.creator_stats_30days_realtime);
        } else if (i14 == 3) {
            string2 = getContext().getString(n80.f.creator_stats_all_time_video_realtime);
        } else {
            if (i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = getContext().getString(n80.f.creator_stats_not_ready);
        }
        Intrinsics.f(string2);
        if (string == null || string.length() == 0) {
            GestaltText gestaltText = this.f109106b;
            if (gestaltText != null) {
                pk.a0.p(gestaltText, string2);
                return;
            } else {
                Intrinsics.r("lastUpdatedText");
                throw null;
            }
        }
        GestaltText gestaltText2 = this.f109106b;
        if (gestaltText2 == null) {
            Intrinsics.r("lastUpdatedText");
            throw null;
        }
        String string5 = getContext().getString(n80.f.creator_stats_updated_string);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        pk.a0.p(gestaltText2, df.j1.Y(string5, new Object[]{string, string2}, getBidiFormatter(), 2));
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return e().t3();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        er0.d e13 = e();
        e13.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        e13.f59965d = pin;
        e13.i2();
        super.updatePin(pin);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        super.updateView();
        e().i2();
    }
}
