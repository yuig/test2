package ly1;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class b extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f85147j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f85148k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f85149l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f85150m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f85151n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f85152o = new b(5);

    /* renamed from: p, reason: collision with root package name */
    public static final b f85153p = new b(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85154i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(0);
        this.f85154i = i13;
    }

    public final Integer b() {
        switch (this.f85154i) {
            case 1:
                try {
                    File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new bf.a(1));
                    if (listFiles != null) {
                        r1 = listFiles.length;
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
                return Integer.valueOf(r1);
            case 2:
                return Integer.valueOf(bf.b.P());
            case 3:
                int doubleValue = ((int) ((Number) d.f85160d.getValue()).doubleValue()) / 10;
                return Integer.valueOf(doubleValue >= 1 ? doubleValue : 1);
            default:
                return Integer.valueOf(bf.b.T());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ly1.b.invoke():java.lang.Object");
    }
}
