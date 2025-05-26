package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class x80 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y80 f13542a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x80(y80 y80Var) {
        super(0);
        this.f13542a = y80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        Context context;
        try {
            context = this.f13542a.f14134d;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = this.f13542a.f14134d;
            }
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo("com.android.vending", RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            if (packageInfo != null) {
                return packageInfo.versionCode + "." + packageInfo.packageName;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
