package u50;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f120563a;

    public j(i colorPrimitive) {
        Intrinsics.checkNotNullParameter(colorPrimitive, "colorPrimitive");
        this.f120563a = colorPrimitive;
    }

    @Override // u50.a0
    public final Object a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ForegroundColorSpan(((Number) this.f120563a.a(context)).intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f120563a, ((j) obj).f120563a);
    }

    public final int hashCode() {
        return this.f120563a.hashCode();
    }

    public final String toString() {
        return "ColorSpanPrimitive(colorPrimitive=" + this.f120563a + ")";
    }

    public j(int i13) {
        this(new g(i13));
    }
}
