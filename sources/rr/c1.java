package rr;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Build;
import io.embrace.android.embracesdk.internal.ndk.jni.JniDelegateImpl;
import kh2.h3;
import kh2.j3;
import kh2.l3;
import kh2.m3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class c1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109714i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f109715j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f109716k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f109717l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f109718m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f109719n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f109720o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i13) {
        super(0);
        this.f109714i = i13;
        this.f109715j = obj;
        this.f109716k = obj2;
        this.f109717l = obj3;
        this.f109718m = obj4;
        this.f109719n = obj5;
        this.f109720o = obj6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f109714i;
        Object obj = this.f109720o;
        Object obj2 = this.f109719n;
        Object obj3 = this.f109718m;
        Object obj4 = this.f109717l;
        Object obj5 = this.f109716k;
        Object obj6 = this.f109715j;
        switch (i13) {
            case 0:
                String str = (String) obj6;
                if (str != null && !kotlin.text.z.j(str)) {
                    ((Intent) obj3).putExtra("com.pinterest.EXTRA_DESCRIPTION", str);
                }
                String str2 = (String) obj5;
                if (str2 != null && !kotlin.text.z.j(str2)) {
                    ((Intent) obj3).putExtra("com.pinterest.EXTRA_IMAGE", str2);
                }
                String str3 = (String) obj4;
                if (str3 != null && !kotlin.text.z.j(str3)) {
                    ((Intent) obj3).putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", str3);
                }
                ((qr.h) obj2).l(null);
                ((d1) obj).f109730h.startActivity((Intent) obj3);
                return Unit.f80348a;
            case 1:
                j3 j3Var = (j3) ((h3) obj6);
                j3Var.getClass();
                ActivityManager activityManager = (ActivityManager) j3Var.f79577b.a(j3Var, j3.f79575g[0]);
                if (Build.VERSION.SDK_INT < 30 || activityManager == null) {
                    return null;
                }
                return new ag2.b(((m3) ((l3) obj5)).a(ki2.g.f79814f), ((sg2.b) ((sg2.a) obj4)).f112886k, activityManager, ((kh2.c) ((kh2.a) obj3)).a(), (vf2.b) obj2, ((kh2.d1) ((kh2.b1) obj)).f79456b);
            case 2:
                return new uf2.d(new q4.h((kh2.o) obj6, (l3) obj5, (kh2.b1) obj4, (kh2.q2) obj3, (h3) obj2, 19), new kh2.v0((sg2.a) obj, 2), 12);
            default:
                kh2.m mVar = (kh2.m) ((kh2.k) obj6);
                if (!((sg2.b) mVar.b()).f112877b.f117602c.isNativeCrashCaptureEnabled()) {
                    return null;
                }
                sg2.a b13 = mVar.b();
                kh2.l2 l2Var = (kh2.l2) obj5;
                nf2.n a13 = l2Var.a();
                kh2.d1 d1Var = (kh2.d1) ((kh2.b1) obj4);
                lh2.b bVar = d1Var.f79456b;
                rl2.u[] uVarArr = kh2.l2.f79599h;
                JniDelegateImpl jniDelegateImpl = (JniDelegateImpl) l2Var.f79600a.a(l2Var, uVarArr[0]);
                ki2.a a14 = ((m3) ((l3) obj3)).a(ki2.g.f79812d);
                oh2.g gVar = (oh2.g) l2Var.f79606g.a(l2Var, uVarArr[4]);
                if (gVar == null) {
                    return null;
                }
                return new oh2.d(b13, a13, bVar, jniDelegateImpl, a14, gVar, new jh2.a(), d1Var.f79455a, ((kh2.r0) ((kh2.o0) obj2)).e(), new kh2.z((kh2.q2) obj, 2), (xk2.k) l2Var.f79603d.getValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(String str, Intent intent, String str2, String str3, qr.h hVar, d1 d1Var) {
        super(0);
        this.f109714i = 0;
        this.f109715j = str;
        this.f109718m = intent;
        this.f109716k = str2;
        this.f109717l = str3;
        this.f109719n = hVar;
        this.f109720o = d1Var;
    }
}
