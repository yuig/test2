package ads_mobile_sdk;

import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class q80 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y80 f9989a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q80(y80 y80Var) {
        super(0);
        this.f9989a = y80Var;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0038 -> B:7:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13;
        int i14;
        int extensionVersion;
        int extensionVersion2;
        int extensionVersion3;
        int extensionVersion4;
        try {
            i14 = Build.VERSION.SDK_INT;
        } catch (Exception e13) {
            ((ks2) this.f9989a.f14135e).a("DeviceProperties.adServicesExtensionVersion", e13);
        }
        if (i14 >= 33) {
            extensionVersion3 = SdkExtensions.getExtensionVersion(33);
            if (extensionVersion3 >= 5) {
                extensionVersion4 = SdkExtensions.getExtensionVersion(1000000);
                i13 = Integer.valueOf(extensionVersion4);
                return i13;
            }
        }
        if (i14 >= 31) {
            extensionVersion = SdkExtensions.getExtensionVersion(31);
            if (extensionVersion >= 9) {
                extensionVersion2 = SdkExtensions.getExtensionVersion(31);
                i13 = Integer.valueOf(extensionVersion2);
                return i13;
            }
        }
        i13 = 0;
        return i13;
    }
}
