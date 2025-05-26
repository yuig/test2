package zf1;

import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f141919j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f141920k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f141921l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f141922m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f141923n = new d(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141924i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f141924i = i13;
    }

    public final void b(Throwable th3) {
        switch (this.f141924i) {
            case 0:
                th3.getMessage();
                HashMap hashMap = new HashMap();
                String message = th3.getMessage();
                if (message != null) {
                    hashMap.put("error_message", message);
                }
                d0 a13 = sh.f.a();
                Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                a13.u(f1.STORY_PIN_FONT_LIST_DOWNLOAD_FAILED, null, null, hashMap, false);
                break;
            case 1:
            default:
                th3.getMessage();
                HashMap hashMap2 = new HashMap();
                String message2 = th3.getMessage();
                if (message2 != null) {
                    hashMap2.put("error_message", message2);
                }
                d0 a14 = sh.f.a();
                Intrinsics.checkNotNullExpressionValue(a14, "get(...)");
                a14.u(f1.STORY_PIN_FONT_LIST_DOWNLOAD_FAILED, null, null, hashMap2, false);
                break;
            case 2:
                HashMap hashMap3 = new HashMap();
                String message3 = th3.getMessage();
                if (message3 != null) {
                    hashMap3.put("error_message", message3);
                }
                d0 a15 = sh.f.a();
                Intrinsics.checkNotNullExpressionValue(a15, "get(...)");
                a15.u(f1.STORY_PIN_FONT_LIST_DOWNLOAD_FAILED, null, null, hashMap3, false);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f141924i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                break;
            case 2:
                b((Throwable) obj);
                break;
            case 3:
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
