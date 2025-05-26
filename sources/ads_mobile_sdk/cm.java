package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class cm extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f3957a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(Intent intent) {
        super(1);
        this.f3957a = intent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String[] strArr = (String[]) new Regex("/").f(2, it).toArray(new String[0]);
        if (strArr.length == 2) {
            this.f3957a.setComponent(new ComponentName(strArr[0], strArr[1]));
        }
        return Unit.f80348a;
    }
}
