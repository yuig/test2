package t3;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115967i;

    /* renamed from: j, reason: collision with root package name */
    public static final e1 f115950j = new e1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e1 f115951k = new e1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e1 f115952l = new e1(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e1 f115953m = new e1(3);

    /* renamed from: n, reason: collision with root package name */
    public static final e1 f115954n = new e1(4);

    /* renamed from: o, reason: collision with root package name */
    public static final e1 f115955o = new e1(5);

    /* renamed from: p, reason: collision with root package name */
    public static final e1 f115956p = new e1(6);

    /* renamed from: q, reason: collision with root package name */
    public static final e1 f115957q = new e1(7);

    /* renamed from: r, reason: collision with root package name */
    public static final e1 f115958r = new e1(8);

    /* renamed from: s, reason: collision with root package name */
    public static final e1 f115959s = new e1(9);

    /* renamed from: t, reason: collision with root package name */
    public static final e1 f115960t = new e1(10);

    /* renamed from: u, reason: collision with root package name */
    public static final e1 f115961u = new e1(11);

    /* renamed from: v, reason: collision with root package name */
    public static final e1 f115962v = new e1(12);

    /* renamed from: w, reason: collision with root package name */
    public static final e1 f115963w = new e1(13);

    /* renamed from: x, reason: collision with root package name */
    public static final e1 f115964x = new e1(14);

    /* renamed from: y, reason: collision with root package name */
    public static final e1 f115965y = new e1(15);

    /* renamed from: z, reason: collision with root package name */
    public static final e1 f115966z = new e1(16);
    public static final e1 A = new e1(17);
    public static final e1 B = new e1(18);
    public static final e1 C = new e1(19);
    public static final e1 D = new e1(20);
    public static final e1 E = new e1(21);
    public static final e1 F = new e1(22);
    public static final e1 G = new e1(23);
    public static final e1 H = new e1(24);
    public static final e1 I = new e1(25);

    /* renamed from: J, reason: collision with root package name */
    public static final e1 f115949J = new e1(26);
    public static final e1 K = new e1(27);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(int i13) {
        super(0);
        this.f115967i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        Boolean bool = Boolean.FALSE;
        switch (this.f115967i) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    ko2.f fVar = ao2.v0.f20219a;
                    choreographer = (Choreographer) kotlin.jvm.internal.j.H(ho2.q.f69782a, new m1(2, null));
                }
                p1 p1Var = new p1(choreographer, bf.b.z(Looper.getMainLooper()));
                return p1Var.plus(p1Var.f116138l);
            case 7:
            case 8:
                return null;
            case 9:
                f2.b("LocalAutofillTree");
                throw null;
            case 10:
                f2.b("LocalClipboardManager");
                throw null;
            case 11:
                f2.b("LocalDensity");
                throw null;
            case 12:
                f2.b("LocalFocusManager");
                throw null;
            case 13:
                f2.b("LocalFontFamilyResolver");
                throw null;
            case 14:
                f2.b("LocalFontLoader");
                throw null;
            case 15:
                f2.b("LocalGraphicsContext");
                throw null;
            case 16:
                f2.b("LocalHapticFeedback");
                throw null;
            case 17:
                f2.b("LocalInputManager");
                throw null;
            case 18:
                f2.b("LocalLayoutDirection");
                throw null;
            case 19:
                return null;
            case 20:
                return bool;
            case 21:
            case 22:
                return null;
            case 23:
                f2.b("LocalTextToolbar");
                throw null;
            case 24:
                f2.b("LocalUriHandler");
                throw null;
            case 25:
                f2.b("LocalViewConfiguration");
                throw null;
            case 26:
                f2.b("LocalWindowInfo");
                throw null;
            default:
                return bool;
        }
    }
}
