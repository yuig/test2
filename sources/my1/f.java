package my1;

import ac2.o1;
import android.app.Application;
import android.content.res.Resources;
import ao2.j0;
import c61.m0;
import c61.p0;
import com.pinterest.api.model.wy0;
import hs1.q;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.text.z;
import lh0.n1;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class f extends ip1.c {

    /* renamed from: c, reason: collision with root package name */
    public final q f88515c;

    /* renamed from: d, reason: collision with root package name */
    public final b60.b f88516d;

    /* renamed from: e, reason: collision with root package name */
    public final lb0.q f88517e;

    /* renamed from: f, reason: collision with root package name */
    public final p0 f88518f;

    /* renamed from: g, reason: collision with root package name */
    public final Application f88519g;

    /* renamed from: h, reason: collision with root package name */
    public final o1 f88520h;

    /* renamed from: i, reason: collision with root package name */
    public final bc2.e f88521i;

    /* renamed from: j, reason: collision with root package name */
    public final n1 f88522j;

    /* renamed from: k, reason: collision with root package name */
    public final v f88523k;

    public f(q imageCache, b60.b activeUserManager, lb0.q prefsManagerPersisted, p0 searchLandingService, Application application, o1 videoManager, bc2.e mp4TrackSelector, n1 experiments) {
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(searchLandingService, "searchLandingService");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(videoManager, "videoManager");
        Intrinsics.checkNotNullParameter(mp4TrackSelector, "mp4TrackSelector");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f88515c = imageCache;
        this.f88516d = activeUserManager;
        this.f88517e = prefsManagerPersisted;
        this.f88518f = searchLandingService;
        this.f88519g = application;
        this.f88520h = videoManager;
        this.f88521i = mp4TrackSelector;
        this.f88522j = experiments;
        this.f88523k = m.b(d.f88509i);
    }

    @Override // ip1.c
    public final void a(Function0 onCompleteCallback) {
        Intrinsics.checkNotNullParameter(onCompleteCallback, "onCompleteCallback");
        wy0 f13 = ((b60.d) this.f88516d).f();
        String uid = f13 != null ? f13.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        xj2.b bVar = new xj2.b();
        if (uid.length() != 0) {
            lb0.q qVar = this.f88517e;
            Intrinsics.checkNotNullParameter(qVar, "<this>");
            String d2 = qVar.d("PREF_LAST_TIME_USER_LAND_ON_SEARCH", "");
            if (d2 != null && !z.j(d2)) {
                try {
                    LocalDateTime parse = LocalDateTime.parse(d2);
                    Duration between = Duration.between(parse, LocalDateTime.now());
                    between.toDays();
                    LocalDateTime now = LocalDateTime.now();
                    Objects.toString(parse);
                    Objects.toString(now);
                    if (between.toDays() < 1) {
                        if (!bVar.f135163b) {
                            m0 m0Var = new m0(this.f88518f, true);
                            Resources resources = this.f88519g.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            j.z((j0) this.f88523k.getValue(), null, null, new e(new a61.b(0, resources), this, m0Var, bVar, null), 3);
                        }
                        bk2.c.set(this.f73374a.f135164a, bVar);
                    }
                } catch (Exception unused) {
                }
            }
        }
        super.a(onCompleteCallback);
    }

    public final void c(String str, String str2) {
        str2.getClass();
        ((hs1.m) this.f88515c).q(str, null, null);
    }
}
