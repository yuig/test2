package u50;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f120583a;

    /* renamed from: b, reason: collision with root package name */
    public final int f120584b;

    /* renamed from: c, reason: collision with root package name */
    public final i f120585c;

    /* renamed from: d, reason: collision with root package name */
    public final n f120586d;

    public v(int i13, int i14, Integer num, Integer num2) {
        g gVar = num != null ? new g(num.intValue()) : null;
        b0 b0Var = num2 != null ? new b0(num2.intValue()) : null;
        this.f120583a = i13;
        this.f120584b = i14;
        this.f120585c = gVar;
        this.f120586d = b0Var;
    }

    @Override // u50.a0
    public final Object a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = context.getResources().getDrawable(this.f120583a, context.getTheme());
        n nVar = this.f120586d;
        if (nVar != null) {
            int intValue = nVar.a(context).intValue();
            drawable.setBounds(0, 0, intValue, intValue);
        }
        i iVar = this.f120585c;
        if (iVar != null) {
            drawable.setTint(((Number) iVar.a(context)).intValue());
        }
        return new ImageSpan(drawable, this.f120584b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f120583a == vVar.f120583a && this.f120584b == vVar.f120584b && Intrinsics.d(this.f120585c, vVar.f120585c) && Intrinsics.d(this.f120586d, vVar.f120586d);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f120584b, Integer.hashCode(this.f120583a) * 31, 31);
        i iVar = this.f120585c;
        int hashCode = (b13 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        n nVar = this.f120586d;
        return hashCode + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "ImageSpanPrimitive(drawableRes=" + this.f120583a + ", verticalAlignment=" + this.f120584b + ", color=" + this.f120585c + ", size=" + this.f120586d + ")";
    }
}
