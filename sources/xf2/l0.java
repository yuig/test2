package xf2;

import io.embrace.android.embracesdk.internal.payload.NetworkCapturedCall;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final Map f134874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i13, String str, String str2, String str3, String id3, String str4) {
        super(t.f134898e, "push-notification");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f134874d = kg.p.e0(z0.g(new Pair("notification.title", str), new Pair("notification.type", str2), new Pair("notification.body", str3), new Pair("notification.id", id3), new Pair("notification.from", str4), new Pair("notification.priority", String.valueOf(i13))));
    }

    @Override // xf2.q0
    public final Map a() {
        return this.f134874d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(NetworkCapturedCall networkCapturedCall) {
        super(r.f134892e);
        Intrinsics.checkNotNullParameter(networkCapturedCall, "networkCapturedCall");
        this.f134874d = kg.p.e0(z0.g(new Pair("duration", String.valueOf(networkCapturedCall.f73206a)), new Pair("end-time", String.valueOf(networkCapturedCall.f73207b)), new Pair(sj2.c.f113031a.f108404b, networkCapturedCall.f73208c), new Pair(sj2.f.f113036a.f108404b, networkCapturedCall.f73209d), new Pair("network-id", networkCapturedCall.f73210e), new Pair("request-body", networkCapturedCall.f73211f), new Pair(tj2.c.f117927a.f108404b, String.valueOf(networkCapturedCall.f73212g)), new Pair("request-query", networkCapturedCall.f73213h), new Pair("http.request.header", String.valueOf(networkCapturedCall.f73214i)), new Pair("request-size", String.valueOf(networkCapturedCall.f73215j)), new Pair("response-body", networkCapturedCall.f73216k), new Pair(tj2.c.f117928b.f108404b, String.valueOf(networkCapturedCall.f73217l)), new Pair("http.response.header", String.valueOf(networkCapturedCall.f73218m)), new Pair("response-size", String.valueOf(networkCapturedCall.f73219n)), new Pair(sj2.c.f113032b.f108404b, String.valueOf(networkCapturedCall.f73220o)), new Pair(tj2.f.f117934a.f108404b, networkCapturedCall.f73221p), new Pair("start-time", String.valueOf(networkCapturedCall.f73222q)), new Pair("url", networkCapturedCall.f73223r), new Pair(sj2.b.f113028a.f108404b, networkCapturedCall.f73224s), new Pair("encrypted-payload", networkCapturedCall.f73225t)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(String url, String webVitals, String coords, int i13) {
        super(z.f134905d, "ui-tap");
        if (i13 != 6) {
            Intrinsics.checkNotNullParameter(webVitals, "type");
            Intrinsics.checkNotNullParameter(coords, "coords");
            this.f134874d = kg.p.e0(z0.g(new Pair("view.name", url), new Pair("tap.type", webVitals), new Pair("tap.coords", coords)));
            return;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(webVitals, "webVitals");
        super(w.f134902e, "webview-info");
        this.f134874d = kg.p.e0(z0.g(new Pair(sj2.f.f113036a.f108404b, url), new Pair("emb.webview_info.web_vitals", webVitals), new Pair("emb.webview_info.tag", coords)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Throwable throwable) {
        super(n.f134879e, "internal-error");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair(sj2.b.f113030c.f108404b, throwable.getClass().getName());
        String str = sj2.b.f113029b.f108404b;
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        pairArr[1] = new Pair(str, kotlin.collections.c0.M(stackTrace, "\n", null, null, 0, null, n0.f134880a, 30));
        String str2 = sj2.b.f113028a.f108404b;
        String message = throwable.getMessage();
        pairArr[2] = new Pair(str2, message == null ? "" : message);
        this.f134874d = z0.g(pairArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(th2.e message) {
        super(l.f134873e);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f134874d = kg.p.e0(z0.g(new Pair("aei_session_id", message.f117659a), new Pair("session_id_error", message.f117660b), new Pair("process_importance", String.valueOf(message.f117661c)), new Pair("pss", String.valueOf(message.f117662d)), new Pair("reason", String.valueOf(message.f117663e)), new Pair("rss", String.valueOf(message.f117664f)), new Pair("exit_status", String.valueOf(message.f117665g)), new Pair("timestamp", String.valueOf(message.f117666h)), new Pair("description", message.f117668j), new Pair("trace_status", message.f117669k)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(s0 attributes) {
        super(k.f134869e);
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f134874d = attributes.c();
    }
}
