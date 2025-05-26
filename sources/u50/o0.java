package u50;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 implements i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f120576c = new c0(0, -1, 17);

    /* renamed from: a, reason: collision with root package name */
    public final i0 f120577a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f120578b;

    public o0(i0 text, Map spanPrimitives) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanPrimitives, "spanPrimitives");
        this.f120577a = text;
        this.f120578b = spanPrimitives;
    }

    public final i0 b() {
        return this.f120577a;
    }

    @Override // u50.a0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final SpannableStringBuilder a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CharSequence a13 = this.f120577a.a(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a13);
        for (Map.Entry entry : this.f120578b.entrySet()) {
            CharacterStyle characterStyle = (CharacterStyle) ((d0) entry.getKey()).a(context);
            c0 c0Var = (c0) entry.getValue();
            int i13 = c0Var.f120551b;
            if (i13 == -1) {
                i13 = a13.length();
            }
            spannableStringBuilder.setSpan(characterStyle, c0Var.f120550a, i13, c0Var.f120552c);
        }
        return spannableStringBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.f120577a, o0Var.f120577a) && Intrinsics.d(this.f120578b, o0Var.f120578b);
    }

    public final int hashCode() {
        return this.f120578b.hashCode() + (this.f120577a.hashCode() * 31);
    }

    public final String toString() {
        return "StyledString(text=" + this.f120577a + ", spanPrimitives=" + this.f120578b + ")";
    }
}
