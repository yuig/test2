package ads_mobile_sdk;

import a.pd;
import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class j12 extends xk2 {

    /* renamed from: f, reason: collision with root package name */
    public final Context f6602f;

    public j12(pd pdVar, a.m mVar, Context context, bt2 bt2Var) {
        super("glBK7l/M9tJ/NOWL+6eedMaFbXdMZ44Ei9A42v/UBnb/QXfnNI2o3Sr/zpY1MLut", "KnImH/kC8fcmE++yddezbhELJgabZsoi/wcDJ1s3JXw=", pdVar, mVar, bt2Var.a(xb0.EVENT_ID_PROCESS_INFO_SIGNALS_TASK));
        this.f6602f = context;
    }

    @Override // ads_mobile_sdk.xk2
    public final void a(Method method, pd pdVar) {
        int i13;
        int i14;
        Object[] objArr = (Object[]) method.invoke("", this.f6602f);
        objArr.getClass();
        synchronized (pdVar) {
            long longValue = ((Long) objArr[0]).longValue();
            pdVar.b();
            wb wbVar = (wb) pdVar.f10110b;
            i13 = wbVar.bitField0_;
            wbVar.bitField0_ = i13 | 4;
            wbVar.atvSignal_ = longValue;
            long longValue2 = ((Long) objArr[1]).longValue();
            pdVar.b();
            wb wbVar2 = (wb) pdVar.f10110b;
            i14 = wbVar2.bitField1_;
            wbVar2.bitField1_ = i14 | 4194304;
            wbVar2.processImportanceSignal_ = longValue2;
        }
    }
}
