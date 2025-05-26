package ads_mobile_sdk;

import a.l0;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ne extends hn2 {

    /* renamed from: e, reason: collision with root package name */
    public final Context f8761e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne(Context context) {
        super(il0.CUI_NAME_SDKINIT_INIT_APP_PERMISSIONS);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8761e = context;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.APP_PERMISSIONS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // a.t5
    public final Object c(bl2.c cVar) {
        ?? r33;
        List b03;
        l0 l0Var = cm0.f3958f;
        Context context = this.f8761e;
        Intrinsics.checkNotNullParameter(context, "<this>");
        String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        if (strArr == null || (b03 = kotlin.collections.c0.b0(strArr)) == null) {
            r33 = kotlin.collections.q0.f80391a;
        } else {
            r33 = new ArrayList();
            for (Object obj : b03) {
                String str = (String) obj;
                l0 l0Var2 = cm0.f3958f;
                Intrinsics.f(str);
                if (l0.d(context, str)) {
                    r33.add(obj);
                }
            }
        }
        return new pk0(new me(r33));
    }
}
