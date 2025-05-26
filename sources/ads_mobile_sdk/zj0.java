package ads_mobile_sdk;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class zj0 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f14796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi.c f14798c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Class f14799d = wi.b.class;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj0(Context context, Context context2, xi.c cVar) {
        super(0);
        this.f14796a = context;
        this.f14797b = context2;
        this.f14798c = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xv0 xv0Var = a.p8.f142a;
        WeakReference weakReference = new WeakReference(this.f14796a);
        Context applicationContext = this.f14797b;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "$applicationContext");
        applicationContext.getClass();
        Context applicationContext2 = this.f14797b;
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "$applicationContext");
        Application application = (Application) applicationContext2;
        application.getClass();
        xi.c cVar = this.f14798c;
        cVar.getClass();
        Class cls = this.f14799d;
        cls.getClass();
        return new n20(applicationContext, application, weakReference, cVar, cls);
    }
}
