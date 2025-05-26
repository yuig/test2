package h72;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class d extends s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f67956j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f67957k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f67958l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f67959m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f67960n = new d(4);

    /* renamed from: o, reason: collision with root package name */
    public static final d f67961o = new d(5);

    /* renamed from: p, reason: collision with root package name */
    public static final d f67962p = new d(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f67963i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(0);
        this.f67963i = i13;
    }

    public final String b() {
        switch (this.f67963i) {
            case 0:
                return "Failure during typeface list download / saving";
            case 1:
                return "Failure during render resources check / download";
            case 2:
                return "Failed to read/map typefaces list";
            case 3:
                return "Failure during typeface init";
            case 4:
                return "Failed to delete typeface file";
            case 5:
                return "Didn't find font in file";
            default:
                return "Failed to load typeface from disk";
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f67963i) {
        }
        return b();
    }
}
