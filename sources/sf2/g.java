package sf2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import io.embrace.android.embracesdk.LogExceptionType;
import io.embrace.android.embracesdk.Severity;
import java.util.LinkedHashMap;
import java.util.Map;
import kh2.j2;
import kh2.n0;
import kh2.u2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kv0.p;
import mh2.m;
import net.quikkly.android.utils.BitmapUtils;
import rl2.u;
import xk2.q;
import xk2.s;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u[] f112826h;

    /* renamed from: a, reason: collision with root package name */
    public final p f112827a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f112828b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f112829c;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f112830d;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f112831e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f112832f;

    /* renamed from: g, reason: collision with root package name */
    public final n0 f112833g;

    static {
        d0 d0Var = new d0(g.class, "logService", "getLogService()Lio/embrace/android/embracesdk/internal/logs/LogService;", 0);
        l0 l0Var = k0.f80436a;
        f112826h = new u[]{l0Var.g(d0Var), a.c.l(g.class, "sessionOrchestrator", "getSessionOrchestrator()Lio/embrace/android/embracesdk/internal/session/orchestrator/SessionOrchestrator;", 0, l0Var), a.c.l(g.class, "pushNotificationDataSource", "getPushNotificationDataSource()Lio/embrace/android/embracesdk/internal/capture/crumbs/PushNotificationDataSource;", 0, l0Var), a.c.l(g.class, "serializer", "getSerializer()Lio/embrace/android/embracesdk/internal/serialization/PlatformSerializer;", 0, l0Var), a.c.l(g.class, "attachmentService", "getAttachmentService()Lio/embrace/android/embracesdk/internal/logs/attachments/AttachmentService;", 0, l0Var), a.c.l(g.class, "logger", "getLogger()Lio/embrace/android/embracesdk/internal/logging/EmbLogger;", 0, l0Var)};
    }

    public g(j2 bootstrapper, p sdkCallChecker) {
        Intrinsics.checkNotNullParameter(bootstrapper, "bootstrapper");
        Intrinsics.checkNotNullParameter(sdkCallChecker, "sdkCallChecker");
        this.f112827a = sdkCallChecker;
        this.f112828b = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 9));
        this.f112829c = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 13));
        this.f112830d = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 11));
        this.f112831e = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 12));
        this.f112832f = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 8));
        this.f112833g = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 10));
    }

    public static void d(g gVar, Severity severity, String message, Map map, StackTraceElement[] stackTraceElementArr, String str, LogExceptionType logExceptionType, String str2, String str3, Map map2, gb2.d dVar, int i13) {
        nh2.a aVar = null;
        StackTraceElement[] stackTraceElementArr2 = (i13 & 8) != 0 ? null : stackTraceElementArr;
        String str4 = (i13 & 16) != 0 ? null : str;
        LogExceptionType logExceptionType2 = (i13 & 32) != 0 ? LogExceptionType.NONE : logExceptionType;
        String str5 = (i13 & 64) != 0 ? null : str2;
        String str6 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str3;
        Map customLogAttrs = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? z0.d() : map2;
        gb2.d dVar2 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : dVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logExceptionType2, "logExceptionType");
        Intrinsics.checkNotNullParameter(customLogAttrs, "customLogAttrs");
        if (gVar.f112827a.e("log_message")) {
            try {
                q qVar = s.f135225b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (str5 != null) {
                    ri2.e EXCEPTION_TYPE = sj2.b.f113030c;
                    Intrinsics.checkNotNullExpressionValue(EXCEPTION_TYPE, "EXCEPTION_TYPE");
                    linkedHashMap.put(EXCEPTION_TYPE, str5);
                }
                if (str6 != null) {
                    ri2.e EXCEPTION_MESSAGE = sj2.b.f113028a;
                    Intrinsics.checkNotNullExpressionValue(EXCEPTION_MESSAGE, "EXCEPTION_MESSAGE");
                    linkedHashMap.put(EXCEPTION_MESSAGE, str6);
                }
                u[] uVarArr = f112826h;
                if (stackTraceElementArr2 != null) {
                    xh2.d dVar3 = (xh2.d) gVar.f112831e.a(gVar, uVarArr[3]);
                    if (dVar3 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    String c13 = u2.c1(dVar3, stackTraceElementArr2);
                    if (c13 != null) {
                        str4 = c13;
                    }
                }
                if (str4 != null) {
                    ri2.e EXCEPTION_STACKTRACE = sj2.b.f113029b;
                    Intrinsics.checkNotNullExpressionValue(EXCEPTION_STACKTRACE, "EXCEPTION_STACKTRACE");
                    linkedHashMap.put(EXCEPTION_STACKTRACE, str4);
                }
                if (dVar2 != null) {
                    Map b13 = dVar2.b();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(y0.a(b13.size()));
                    for (Object obj : b13.entrySet()) {
                        linkedHashMap2.put(((xf2.d0) ((Map.Entry) obj).getKey()).f134856b, ((Map.Entry) obj).getValue());
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                }
                if ((dVar2 instanceof nh2.a) && ((nh2.a) dVar2).f90556c == null) {
                    aVar = (nh2.a) dVar2;
                }
                m mVar = (m) gVar.f112828b.a(gVar, uVarArr[0]);
                if (mVar != null) {
                    ((mh2.h) mVar).a(message, severity, logExceptionType2, map, z0.j(linkedHashMap, customLogAttrs), aVar);
                }
                di2.c cVar = (di2.c) gVar.f112829c.a(gVar, uVarArr[1]);
                if (cVar != null) {
                    ((di2.j) cVar).a();
                    Unit unit = Unit.f80348a;
                }
                q qVar2 = s.f135225b;
            } catch (Throwable th3) {
                q qVar3 = s.f135225b;
                ue.c.m(th3);
            }
        }
    }

    public final void a(gb2.d dVar) {
        String str;
        if (dVar.c() != null) {
            nh2.c c13 = dVar.c();
            int i13 = c13 == null ? -1 : f.f112825a[c13.ordinal()];
            if (i13 == -1) {
                str = null;
            } else if (i13 == 1) {
                str = "Supplied attachment exceeds 1Mb limit. This attachment will not be uploaded.";
            } else if (i13 == 2) {
                str = "A maximum of 5 attachments are allowed per session. This attachment will not be uploaded.";
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "An unknown error occurred while processing the attachment.";
            }
            if (str == null) {
                return;
            }
            lh2.b bVar = (lh2.b) this.f112833g.a(this, f112826h[5]);
            if (bVar != null) {
                ((lh2.e) bVar).a(str, new RuntimeException(str));
            }
        }
    }

    public final void b(Throwable throwable, Severity severity, Map map, String str) {
        StackTraceElement[] stackTraceElementArr;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(severity, "severity");
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        String str2 = message;
        String str3 = str == null ? str2 : str;
        Intrinsics.checkNotNullParameter(throwable, "<this>");
        try {
            stackTraceElementArr = throwable.getStackTrace();
        } catch (Exception unused) {
            stackTraceElementArr = null;
        }
        d(this, severity, str3, map, stackTraceElementArr, null, LogExceptionType.HANDLED, throwable.getClass().getSimpleName(), str2, null, null, 784);
    }

    public final void c(String message, Severity severity) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        d(this, severity, message, null, null, null, null, null, null, null, null, 1016);
    }
}
