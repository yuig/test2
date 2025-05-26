package z9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends z {

    /* renamed from: k, reason: collision with root package name */
    public Intent f141141k;

    /* renamed from: l, reason: collision with root package name */
    public String f141142l;

    public static String r(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return kotlin.text.z.n(str, "${applicationId}", packageName);
    }

    @Override // z9.z
    public final boolean equals(Object obj) {
        Intent intent;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        return super.equals(obj) && ((intent = this.f141141k) == null ? ((a) obj).f141141k == null : intent.filterEquals(((a) obj).f141141k)) && Intrinsics.d(this.f141142l, ((a) obj).f141142l);
    }

    @Override // z9.z
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Intent intent = this.f141141k;
        int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.f141142l;
        return filterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // z9.z
    public final void j(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.j(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, v0.ActivityNavigator);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
        String r13 = r(context, obtainAttributes.getString(v0.ActivityNavigator_targetPackage));
        if (this.f141141k == null) {
            this.f141141k = new Intent();
        }
        Intent intent = this.f141141k;
        Intrinsics.f(intent);
        intent.setPackage(r13);
        String string = obtainAttributes.getString(v0.ActivityNavigator_android_name);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.f141141k == null) {
                this.f141141k = new Intent();
            }
            Intent intent2 = this.f141141k;
            Intrinsics.f(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = obtainAttributes.getString(v0.ActivityNavigator_action);
        if (this.f141141k == null) {
            this.f141141k = new Intent();
        }
        Intent intent3 = this.f141141k;
        Intrinsics.f(intent3);
        intent3.setAction(string2);
        String r14 = r(context, obtainAttributes.getString(v0.ActivityNavigator_data));
        if (r14 != null) {
            Uri parse = Uri.parse(r14);
            if (this.f141141k == null) {
                this.f141141k = new Intent();
            }
            Intent intent4 = this.f141141k;
            Intrinsics.f(intent4);
            intent4.setData(parse);
        }
        this.f141142l = r(context, obtainAttributes.getString(v0.ActivityNavigator_dataPattern));
        obtainAttributes.recycle();
    }

    @Override // z9.z
    public final String toString() {
        Intent intent = this.f141141k;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        if (component != null) {
            sb3.append(" class=");
            sb3.append(component.getClassName());
        } else {
            Intent intent2 = this.f141141k;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb3.append(" action=");
                sb3.append(action);
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
        return sb4;
    }
}
