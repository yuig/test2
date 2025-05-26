package sf2;

import android.app.Activity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kh2.d1;
import kh2.j2;
import kh2.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import kv0.p;
import rl2.u;

/* loaded from: classes4.dex */
public final class d implements rf2.a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u[] f112813e;

    /* renamed from: a, reason: collision with root package name */
    public final p f112814a;

    /* renamed from: b, reason: collision with root package name */
    public final og2.a f112815b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f112816c;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f112817d;

    static {
        d0 d0Var = new d0(d.class, "uiLoadTraceEmitter", "getUiLoadTraceEmitter()Lio/embrace/android/embracesdk/internal/capture/activity/UiLoadDataListener;", 0);
        l0 l0Var = k0.f80436a;
        f112813e = new u[]{l0Var.g(d0Var), a.c.l(d.class, "appStartupDataCollector", "getAppStartupDataCollector()Lio/embrace/android/embracesdk/internal/capture/startup/AppStartupDataCollector;", 0, l0Var)};
    }

    public d(j2 bootstrapper, p sdkCallChecker) {
        Intrinsics.checkNotNullParameter(bootstrapper, "bootstrapper");
        Intrinsics.checkNotNullParameter(sdkCallChecker, "sdkCallChecker");
        this.f112814a = sdkCallChecker;
        this.f112815b = ((d1) bootstrapper.f79550b).f79455a;
        this.f112816c = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 3));
        this.f112817d = new n0(new nd2.a(sdkCallChecker, 28), new a(bootstrapper, 2));
    }

    @Override // rf2.a
    public final void addLoadTraceChildSpan(Activity activity, String name, long j13, long j14, Map attributes, List events, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(events, "events");
        if (this.f112814a.e("add_load_trace_child_span")) {
            zf2.e eVar = (zf2.e) this.f112816c.a(this, f112813e[0]);
            if (eVar != null) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                int hashCode = activity.hashCode();
                zf2.i iVar = (zf2.i) eVar;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(attributes, "attributes");
                Intrinsics.checkNotNullParameter(events, "events");
                zf2.h hVar = (zf2.h) iVar.f141947b.get(Integer.valueOf(hashCode));
                if (hVar != null) {
                    kg.p.U(iVar.f141946a, name, j13, j14, hVar.f141944c, null, false, attributes, events, errorCode, RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION);
                }
            }
        }
    }

    @Override // rf2.a
    public final void addStartupTraceChildSpan(String name, long j13, long j14, Map attributes, List events, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(events, "events");
        if (this.f112814a.e("add_startup_trace_child_span")) {
            jg2.a aVar = (jg2.a) this.f112817d.a(this, f112813e[1]);
            if (aVar != null) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(attributes, "attributes");
                Intrinsics.checkNotNullParameter(events, "events");
                ((jg2.c) aVar).f76100i.add(new jg2.b(name, j13, j14, attributes, events, errorCode));
            }
        }
    }
}
