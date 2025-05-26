package dy;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.pinterest.api.model.wy0;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56523i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f56524j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(1);
        this.f56523i = i13;
        this.f56524j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FirebaseAnalytics firebaseAnalytics;
        int i13 = this.f56523i;
        d dVar = this.f56524j;
        switch (i13) {
            case 0:
                y02.a aVar = (y02.a) obj;
                wy0 f13 = ((b60.d) dVar.f56533f).f();
                String G2 = f13 != null ? f13.G2() : null;
                if (G2 != null && G2.length() != 0) {
                    String[] strArr = e.f56536a;
                    String lowerCase = G2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (c0.y(strArr, lowerCase) && (firebaseAnalytics = dVar.f56534g) != null) {
                        ol.a aVar2 = (aVar == null || !aVar.f136511a) ? ol.a.DENIED : ol.a.GRANTED;
                        ol.a aVar3 = (aVar == null || !aVar.f136511a) ? ol.a.DENIED : ol.a.GRANTED;
                        ol.a aVar4 = (aVar == null || !aVar.f136511a) ? ol.a.DENIED : ol.a.GRANTED;
                        ol.a aVar5 = (aVar == null || !aVar.f136512b) ? ol.a.DENIED : ol.a.GRANTED;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (aVar3 != null) {
                            linkedHashMap.put(ol.b.AD_STORAGE, aVar3);
                        }
                        if (aVar2 != null) {
                            linkedHashMap.put(ol.b.ANALYTICS_STORAGE, aVar2);
                        }
                        if (aVar4 != null) {
                            linkedHashMap.put(ol.b.AD_USER_DATA, aVar4);
                        }
                        if (aVar5 != null) {
                            linkedHashMap.put(ol.b.AD_PERSONALIZATION, aVar5);
                        }
                        firebaseAnalytics.a(linkedHashMap);
                    }
                }
                break;
            default:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                dVar.b("firebase_analytics_user_state_failure", message, null);
                break;
        }
        return Unit.f80348a;
    }
}
