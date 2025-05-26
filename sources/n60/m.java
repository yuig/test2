package n60;

import android.app.Application;
import android.content.Context;
import com.pinterest.typeaheadroom.AppDatabase;
import ey.b0;
import ey.t4;
import ja.a0;
import java.util.concurrent.atomic.AtomicBoolean;
import kb.u0;
import kb.w0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m60.f0;

/* loaded from: classes.dex */
public final class m implements xf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final Application f89270a;

    /* renamed from: b, reason: collision with root package name */
    public final tb.l f89271b;

    /* renamed from: c, reason: collision with root package name */
    public final tb0.h f89272c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f89273d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f89274e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f89275f;

    public m(Application application, tb.l telemetryPreferences, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(telemetryPreferences, "telemetryPreferences");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f89270a = application;
        this.f89271b = telemetryPreferences;
        this.f89272c = crashReporting;
        this.f89273d = new AtomicBoolean(true);
        this.f89274e = xk2.m.b(new l(this, 0));
        this.f89275f = xk2.m.b(new l(this, 1));
    }

    @Override // xf0.a
    public final void a() {
        final int i13 = 0;
        new t4(32, b0.TAG_WORKMANAGER_INIT, new Runnable(this) { // from class: n60.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f89267b;

            {
                this.f89267b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i14 = i13;
                m this$0 = this.f89267b;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u0 u0Var = w0.f79048a;
                        Context context = kb0.a.f79058b;
                        d7.b.s0(u0Var.a(f0.j0()), this$0.f89272c);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f89273d.set(false);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Application context2 = this$0.f89270a;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        a0 a13 = se.l.a(context2, AppDatabase.class, "search-typeahead");
                        a13.f75161j = true;
                        a13.f75163l = false;
                        a13.f75164m = true;
                        x92.c.f134369b = (AppDatabase) a13.b();
                        break;
                }
            }
        }, true, true).c();
        v vVar = (v) ((bf2.b) ((se2.a) this.f89275f.getValue())).get();
        vVar.getClass();
        final int i14 = 1;
        new t4(96, 0L, b0.TAG_CRASH_REPORTING, new t(vVar, 1), false, true, false, false).c();
        l0.f82619b = new mc.h(26, new u00.e(this, 4));
        new t4(32, b0.TAG_LOW_PRI_MISC_TASKS, new Runnable(this) { // from class: n60.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f89267b;

            {
                this.f89267b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i142 = i14;
                m this$0 = this.f89267b;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u0 u0Var = w0.f79048a;
                        Context context = kb0.a.f79058b;
                        d7.b.s0(u0Var.a(f0.j0()), this$0.f89272c);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f89273d.set(false);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Application context2 = this$0.f89270a;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        a0 a13 = se.l.a(context2, AppDatabase.class, "search-typeahead");
                        a13.f75161j = true;
                        a13.f75163l = false;
                        a13.f75164m = true;
                        x92.c.f134369b = (AppDatabase) a13.b();
                        break;
                }
            }
        }, true, true).c();
        final int i15 = 2;
        new t4(32, b0.TAG_ROOM_DB_INIT, new Runnable(this) { // from class: n60.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f89267b;

            {
                this.f89267b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i142 = i15;
                m this$0 = this.f89267b;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u0 u0Var = w0.f79048a;
                        Context context = kb0.a.f79058b;
                        d7.b.s0(u0Var.a(f0.j0()), this$0.f89272c);
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f89273d.set(false);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Application context2 = this$0.f89270a;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        a0 a13 = se.l.a(context2, AppDatabase.class, "search-typeahead");
                        a13.f75161j = true;
                        a13.f75163l = false;
                        a13.f75164m = true;
                        x92.c.f134369b = (AppDatabase) a13.b();
                        break;
                }
            }
        }, false, true).c();
        if (this.f89271b.x()) {
            new t4(96, 0L, b0.TAG_SCHEDULE_SUBMIT_NETWORK_METRICS, ((v) ((bf2.b) ((se2.a) this.f89275f.getValue())).get()).a(), false, true, false, false).c();
        }
    }

    @Override // xf0.a
    public final boolean b() {
        return this.f89273d.get();
    }

    @Override // xf0.a
    public final void c() {
        v vVar = (v) ((bf2.b) ((se2.a) this.f89275f.getValue())).get();
        vVar.getClass();
        new t4(96, 0L, b0.TAG_CHROME_SESSION, new t(vVar, 0), false, true, false, false).c();
    }
}
