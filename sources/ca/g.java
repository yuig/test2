package ca;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z9.z;

/* loaded from: classes3.dex */
public final class g extends z {

    /* renamed from: k, reason: collision with root package name */
    public String f27044k;

    @Override // z9.z
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        return super.equals(obj) && Intrinsics.d(this.f27044k, ((g) obj).f27044k);
    }

    @Override // z9.z
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f27044k;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // z9.z
    public final void j(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.j(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, n.FragmentNavigator);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
        String className = obtainAttributes.getString(n.FragmentNavigator_android_name);
        if (className != null) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f27044k = className;
        }
        Unit unit = Unit.f80348a;
        obtainAttributes.recycle();
    }

    @Override // z9.z
    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append(" class=");
        String str = this.f27044k;
        if (str == null) {
            sb3.append("null");
        } else {
            sb3.append(str);
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
        return sb4;
    }
}
