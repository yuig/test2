package w91;

import com.pinterest.navigation.Navigation;
import com.pinterest.settingsAccount.framework.screens.SettingsAccountFeatureLocation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final e f128601i = new e(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Navigation it = (Navigation) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getF49939a() == SettingsAccountFeatureLocation.SETTINGS_CLAIM_REDESIGN);
    }
}
