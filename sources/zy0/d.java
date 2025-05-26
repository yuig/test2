package zy0;

import ao2.j0;
import com.pinterest.api.model.qz;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import py0.e;
import u50.r;
import vy.m;
import x02.x2;

/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final kv1.a f143139a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f143140b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f143141c;

    /* renamed from: d, reason: collision with root package name */
    public final qy0.b f143142d;

    /* renamed from: e, reason: collision with root package name */
    public final e f143143e;

    /* renamed from: f, reason: collision with root package name */
    public final m f143144f;

    public d(kv1.a nuxService, x2 userRepository, b60.b activeUserManager, qy0.b nuxSharedStateRepository, e nuxPinSelectionSEP, m analyticsApi) {
        Intrinsics.checkNotNullParameter(nuxService, "nuxService");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(nuxSharedStateRepository, "nuxSharedStateRepository");
        Intrinsics.checkNotNullParameter(nuxPinSelectionSEP, "nuxPinSelectionSEP");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        this.f143139a = nuxService;
        this.f143140b = userRepository;
        this.f143141c = activeUserManager;
        this.f143142d = nuxSharedStateRepository;
        this.f143143e = nuxPinSelectionSEP;
        this.f143144f = analyticsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(zy0.d r18, int r19, u50.r r20, bl2.c r21) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zy0.d.j(zy0.d, int, u50.r, bl2.c):java.lang.Object");
    }

    public static Map k(qz qzVar, int i13, String str) {
        return z0.g(new Pair("use_case_display_name", qzVar.l()), new Pair("use_case_id", qzVar.getId()), new Pair("age", String.valueOf(i13)), new Pair("gender", str));
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        yy0.r request = (yy0.r) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        j.z(scope, null, null, new a(request, this, eventIntake, scope, null), 3);
    }
}
