package vb0;

import android.content.pm.PackageInfo;
import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class k extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f125486i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f125487j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i13) {
        super(0);
        this.f125486i = i13;
        this.f125487j = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long longVersionCode;
        int i13;
        int i14 = this.f125486i;
        l lVar = this.f125487j;
        switch (i14) {
            case 0:
                return lVar.f125488a.getPackageManager().getPackageInfo(lVar.f125488a.getPackageName(), 0);
            case 1:
                if (Build.VERSION.SDK_INT < 28) {
                    Object value = lVar.f125491d.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    i13 = ((PackageInfo) value).versionCode;
                } else {
                    Object value2 = lVar.f125491d.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    longVersionCode = ((PackageInfo) value2).getLongVersionCode();
                    i13 = (int) longVersionCode;
                }
                return Integer.valueOf(i13);
            default:
                Object value3 = lVar.f125491d.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                return String.valueOf(((PackageInfo) value3).versionName);
        }
    }
}
