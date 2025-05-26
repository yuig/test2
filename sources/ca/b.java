package ca;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;
import z9.z;

/* loaded from: classes3.dex */
public final class b extends z implements z9.e {

    /* renamed from: k, reason: collision with root package name */
    public String f27034k;

    @Override // z9.z
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return super.equals(obj) && Intrinsics.d(this.f27034k, ((b) obj).f27034k);
    }

    @Override // z9.z
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f27034k;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // z9.z
    public final void j(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.j(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, n.DialogFragmentNavigator);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
        String className = obtainAttributes.getString(n.DialogFragmentNavigator_android_name);
        if (className != null) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f27034k = className;
        }
        obtainAttributes.recycle();
    }
}
