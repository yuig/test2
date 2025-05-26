package ads_mobile_sdk;

import a.pd;
import android.content.Context;
import android.os.Build;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import tb.f;

/* loaded from: classes2.dex */
public final class hd extends xk2 {

    /* renamed from: f, reason: collision with root package name */
    public final Map f5914f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f5915g;

    /* renamed from: h, reason: collision with root package name */
    public final zm2 f5916h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5917i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5918j;

    public hd(pd pdVar, a.m mVar, Map map, Context context, zm2 zm2Var, i4 i4Var, bt2 bt2Var) {
        super("ZMDp0Y5cOveBdOnt0/HoaA/nsKiJZqc9LCtHwe0DI/ut9ALV1bJ9Nh9dcTvyOoN5", "ZE1qUHCfVrIok5aPv32MInURm+N00BOyK4Ff0o0EQ30=", pdVar, mVar, bt2Var.a(xb0.EVENT_ID_APP_INFO_SIGNALS_TASK));
        this.f5915g = context;
        this.f5914f = map;
        this.f5916h = zm2Var;
        this.f5917i = i4Var.z();
        this.f5918j = i4Var.C();
    }

    @Override // ads_mobile_sdk.xk2
    public final void a(Method method, pd pdVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        wb wbVar;
        Object[] objArr = (Object[]) method.invoke("", this.f5915g, Integer.valueOf(this.f5916h.ordinal()));
        objArr.getClass();
        String str = "E";
        try {
            com.google.common.util.concurrent.c0 c0Var = (com.google.common.util.concurrent.c0) this.f5914f.get("gs");
            if (c0Var != null && ((Build.VERSION.SDK_INT < 31 || c0Var.isDone()) && (wbVar = (wb) c0Var.get(this.f5917i, TimeUnit.MILLISECONDS)) != null && wbVar.r().length() > 1)) {
                str = wbVar.r();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (str.equals("E")) {
            try {
                com.google.common.util.concurrent.c0 c0Var2 = (com.google.common.util.concurrent.c0) this.f5914f.get("ai");
                if (c0Var2 != null) {
                    String str2 = (String) c0Var2.get(this.f5918j, TimeUnit.MILLISECONDS);
                    if (!f.i0(str2)) {
                        str = str2;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (pdVar) {
            try {
                long longValue = ((Long) objArr[0]).longValue();
                pdVar.b();
                wb wbVar2 = (wb) pdVar.f10110b;
                i13 = wbVar2.bitField0_;
                wbVar2.bitField0_ = i13 | 536870912;
                wbVar2.vcdSignal_ = longValue;
                String str3 = (String) objArr[1];
                pdVar.b();
                wb wbVar3 = (wb) pdVar.f10110b;
                wbVar3.getClass();
                str3.getClass();
                i14 = wbVar3.bitField0_;
                wbVar3.bitField0_ = i14 | 268435456;
                wbVar3.vnmSignal_ = str3;
                String str4 = (String) objArr[2];
                pdVar.b();
                wb wbVar4 = (wb) pdVar.f10110b;
                wbVar4.getClass();
                str4.getClass();
                i15 = wbVar4.bitField1_;
                wbVar4.bitField1_ = i15 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                wbVar4.appIdSignal_ = str4;
                String str5 = (String) objArr[3];
                pdVar.b();
                wb wbVar5 = (wb) pdVar.f10110b;
                wbVar5.getClass();
                str5.getClass();
                i16 = wbVar5.bitField1_;
                wbVar5.bitField1_ = i16 | RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                wbVar5.installerSignal_ = str5;
                String c13 = qk.d.f104039f.f().c((byte[]) objArr[4]);
                pdVar.b();
                wb wbVar6 = (wb) pdVar.f10110b;
                wbVar6.getClass();
                c13.getClass();
                i17 = wbVar6.bitField0_;
                wbVar6.bitField0_ = i17 | 16777216;
                wbVar6.cerSignal_ = c13;
                pdVar.b();
                wb wbVar7 = (wb) pdVar.f10110b;
                wbVar7.getClass();
                str.getClass();
                i18 = wbVar7.bitField0_;
                wbVar7.bitField0_ = i18 | 4194304;
                wbVar7.intSignal_ = str;
                if (bool != null) {
                    gc gcVar = bool.booleanValue() ? gc.ENUM_TRUE : gc.ENUM_FALSE;
                    pdVar.b();
                    wb wbVar8 = (wb) pdVar.f10110b;
                    wbVar8.getClass();
                    wbVar8.launcherActivityEnabled_ = gcVar.f5504a;
                    i19 = wbVar8.bitField2_;
                    wbVar8.bitField2_ = i19 | 32;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
