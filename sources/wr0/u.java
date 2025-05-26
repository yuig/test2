package wr0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.wy0;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f130915a;

    /* renamed from: b, reason: collision with root package name */
    public final int f130916b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f130917c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f130918d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f130919e;

    /* renamed from: f, reason: collision with root package name */
    public final String f130920f;

    /* renamed from: g, reason: collision with root package name */
    public final wy0 f130921g;

    /* renamed from: h, reason: collision with root package name */
    public final String f130922h;

    /* renamed from: i, reason: collision with root package name */
    public final int f130923i;

    /* renamed from: j, reason: collision with root package name */
    public final Function0 f130924j;

    /* renamed from: k, reason: collision with root package name */
    public final Function0 f130925k;

    public u(f30 pin, int i13, boolean z13, q editAction, q navigateToCloseup) {
        Map A4;
        sr srVar;
        String j13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(editAction, "editAction");
        Intrinsics.checkNotNullParameter(navigateToCloseup, "navigateToCloseup");
        this.f130915a = pin;
        this.f130916b = i13;
        this.f130917c = z13;
        this.f130918d = editAction;
        this.f130919e = navigateToCloseup;
        this.f130920f = (pin == null || (A4 = pin.A4()) == null || (srVar = (sr) A4.get("736x")) == null || (j13 = srVar.j()) == null) ? "" : j13;
        this.f130921g = pin.L3();
        String z63 = pin.z6();
        this.f130922h = z63 != null ? z63 : "";
        Integer C6 = pin.C6();
        Intrinsics.checkNotNullExpressionValue(C6, "getTotalReactionCount(...)");
        this.f130923i = C6.intValue();
        this.f130924j = navigateToCloseup;
        this.f130925k = navigateToCloseup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f130915a, uVar.f130915a) && this.f130916b == uVar.f130916b && this.f130917c == uVar.f130917c && Intrinsics.d(this.f130918d, uVar.f130918d) && Intrinsics.d(this.f130919e, uVar.f130919e);
    }

    public final int hashCode() {
        return this.f130919e.hashCode() + d7.g.b(this.f130918d, ep.b.e(this.f130917c, ep.b.b(this.f130916b, this.f130915a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EngagementTabHeaderViewState(pin=");
        sb3.append(this.f130915a);
        sb3.append(", commentCount=");
        sb3.append(this.f130916b);
        sb3.append(", createdByMe=");
        sb3.append(this.f130917c);
        sb3.append(", editAction=");
        sb3.append(this.f130918d);
        sb3.append(", navigateToCloseup=");
        return pk2.f.i(sb3, this.f130919e, ")");
    }
}
