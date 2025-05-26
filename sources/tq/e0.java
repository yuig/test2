package tq;

import android.content.Context;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h80;
import com.pinterest.api.model.oe0;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.wz;
import com.pinterest.api.model.xh0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class e0 extends PinCloseupBaseModule {

    /* renamed from: a, reason: collision with root package name */
    public wz f118828a;

    /* renamed from: b, reason: collision with root package name */
    public xh0 f118829b;

    /* renamed from: c, reason: collision with root package name */
    public String f118830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public abstract void b();

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        wz u13;
        List y13;
        we0 we0Var;
        xh0 w13;
        List y14;
        we0 we0Var2;
        List r13;
        h80 h80Var;
        List r14;
        h80 h80Var2;
        Intrinsics.checkNotNullParameter(pin, "pin");
        oe0 f63 = pin.f6();
        String str = null;
        if (f63 == null || (r14 = f63.r()) == null || (h80Var2 = (h80) CollectionsKt.firstOrNull(r14)) == null || (u13 = h80Var2.p()) == null) {
            se0 g63 = pin.g6();
            u13 = (g63 == null || (y13 = g63.y()) == null || (we0Var = (we0) CollectionsKt.firstOrNull(y13)) == null) ? null : we0Var.u();
        }
        this.f118828a = u13;
        oe0 f64 = pin.f6();
        if (f64 == null || (r13 = f64.r()) == null || (h80Var = (h80) CollectionsKt.firstOrNull(r13)) == null || (w13 = h80Var.r()) == null) {
            se0 g64 = pin.g6();
            w13 = (g64 == null || (y14 = g64.y()) == null || (we0Var2 = (we0) CollectionsKt.firstOrNull(y14)) == null) ? null : we0Var2.w();
        }
        this.f118829b = w13;
        String z63 = pin.z6();
        if (z63 != null && z63.length() != 0) {
            str = z63;
        }
        if (str == null) {
            str = pin.r4();
        }
        this.f118830c = str;
        super.updatePin(pin);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        super.updateView();
        b();
    }
}
