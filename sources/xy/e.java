package xy;

import android.content.Context;
import android.os.Build;
import df.j1;
import ey.j3;
import h32.t1;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import s92.l;
import s92.o;
import xk2.v;

/* loaded from: classes.dex */
public final class e extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f136156j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f136157k = new e(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136158i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(0);
        this.f136158i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f136158i) {
            case 0:
                int value = hf0.b.a().getValue();
                j3 j3Var = j3.f60510a;
                int value2 = j3.e().getValue();
                re2.e eVar = new re2.e();
                wo2.j jVar = new wo2.j();
                v vVar = g.f136159o;
                String c13 = ((m60.d) m60.d.a()).c(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(c13, "getVersionName(...)");
                eVar.f107694a = null;
                eVar.f107695b = null;
                eVar.f107696c = null;
                re2.g w13 = bk.f.w("app.version", c13, eVar, jVar);
                eVar.f107694a = null;
                eVar.f107695b = null;
                eVar.f107696c = null;
                re2.g t13 = bk.f.t("app.type", value, eVar, jVar);
                eVar.f107694a = null;
                eVar.f107695b = null;
                eVar.f107696c = null;
                re2.g t14 = bk.f.t("device.type", value2, eVar, jVar);
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                eVar.f107694a = null;
                eVar.f107695b = null;
                eVar.f107696c = null;
                re2.g w14 = bk.f.w("device.version", MODEL, eVar, jVar);
                int value3 = t1.ANDROID.getValue();
                eVar.f107694a = null;
                eVar.f107695b = null;
                eVar.f107696c = null;
                re2.g t15 = bk.f.t("device.os.type", value3, eVar, jVar);
                String RELEASE = Build.VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                eVar.f107694a = null;
                eVar.f107695b = null;
                eVar.f107696c = null;
                re2.g w15 = bk.f.w("device.os.version", RELEASE, eVar, jVar);
                eVar.f107694a = null;
                eVar.f107695b = null;
                eVar.f107696c = null;
                re2.g w16 = bk.f.w("lc", "pwt", eVar, jVar);
                int value4 = l.USER_NAVIGATION.getValue();
                eVar.f107694a = null;
                eVar.f107695b = null;
                eVar.f107696c = null;
                re2.g t16 = bk.f.t("pwt.cause", value4, eVar, jVar);
                int value5 = o.COMPLETE.getValue();
                eVar.f107694a = null;
                eVar.f107695b = null;
                eVar.f107696c = null;
                return f0.j(w13, t13, t14, w14, t15, w15, w16, t16, bk.f.t("pwt.result", value5, eVar, jVar));
            default:
                Context context = kb0.a.f79058b;
                return (f) j1.b0(f.class, m60.f0.W());
        }
    }
}
