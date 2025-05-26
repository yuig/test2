package ads_mobile_sdk;

import a.q5;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class sq1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zq1 f11198a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq1(zq1 zq1Var, bl2.c cVar) {
        super(2, cVar);
        this.f11198a = zq1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new sq1(this.f11198a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new sq1(this.f11198a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        Context context = this.f11198a.f14863d;
        vr1 vr1Var = a.ng.f126a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (!vr1Var.f12616a) {
            vr1Var.f12616a = true;
            fs1 a13 = fs1.a();
            a13.f5271c.getClass();
            a.l1 l1Var = new a.l1();
            q5 q5Var = a13.f5270b;
            Handler handler = new Handler();
            q5Var.getClass();
            a13.f5272d = new h90(handler, applicationContext, l1Var, a13);
            p3.f9528d.a(applicationContext);
            hr1.a(applicationContext);
            WindowManager windowManager = wr1.f13193a;
            wr1.f13195c = applicationContext.getResources().getDisplayMetrics().density;
            wr1.f13193a = (WindowManager) applicationContext.getSystemService("window");
            applicationContext.registerReceiver(new le.j(1), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
            yv0.f14420b.f14421a = applicationContext.getApplicationContext();
            o oVar = o.f9079f;
            if (!oVar.f9082c) {
                oVar.f9083d.a(applicationContext);
                hg hgVar = oVar.f9083d;
                hgVar.f5951c = oVar;
                hgVar.b();
                oVar.f9084e = oVar.f9083d.f5950b;
                oVar.f9082c = true;
            }
            yd2.f14206d.f14207a = new WeakReference(applicationContext);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            applicationContext.registerReceiver(new xd2(), intentFilter);
        }
        return Unit.f80348a;
    }
}
