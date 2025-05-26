package sq;

import android.view.View;
import com.pinterest.api.model.f30;
import db.m;
import h32.g0;
import h32.u0;
import kg.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends j {

    /* renamed from: c, reason: collision with root package name */
    public final f30 f114967c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f114968d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f114969e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f30 pin, g0 componentType, m clickAction) {
        super(pin, componentType);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        this.f114967c = pin;
        this.f114968d = componentType;
        this.f114969e = clickAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f114967c, eVar.f114967c) && this.f114968d == eVar.f114968d && Intrinsics.d(this.f114969e, eVar.f114969e);
    }

    public final int hashCode() {
        return this.f114969e.hashCode() + ((this.f114968d.hashCode() + (this.f114967c.hashCode() * 31)) * 31);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        n.a(widget);
        Intrinsics.checkNotNullParameter(widget, "widget");
        sh.f.a().F(this.f114977b, u0.PIN_BOARD);
        this.f114969e.invoke();
    }

    @Override // android.text.style.ClickableSpan
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardNameClickableSpan(pin=");
        sb3.append(this.f114967c);
        sb3.append(", componentType=");
        sb3.append(this.f114968d);
        sb3.append(", clickAction=");
        return pk2.f.i(sb3, this.f114969e, ")");
    }
}
