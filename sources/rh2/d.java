package rh2;

import io.embrace.android.embracesdk.internal.config.remote.NetworkCaptureRuleRemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kh2.g2;
import kotlin.collections.CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.z;
import pg2.k;
import pg2.p;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final ai2.b f108347a;

    /* renamed from: b, reason: collision with root package name */
    public final uh2.b f108348b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f108349c;

    /* renamed from: d, reason: collision with root package name */
    public final sg2.a f108350d;

    /* renamed from: e, reason: collision with root package name */
    public final k f108351e;

    /* renamed from: f, reason: collision with root package name */
    public final xh2.d f108352f;

    /* renamed from: g, reason: collision with root package name */
    public final lh2.b f108353g;

    /* renamed from: h, reason: collision with root package name */
    public final v f108354h;

    public d(ai2.b sessionIdTracker, uh2.b preferencesService, nd2.a networkCaptureDataSource, sg2.a configService, k kVar, xh2.d serializer, lh2.b logger) {
        Intrinsics.checkNotNullParameter(sessionIdTracker, "sessionIdTracker");
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(networkCaptureDataSource, "networkCaptureDataSource");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f108347a = sessionIdTracker;
        this.f108348b = preferencesService;
        this.f108349c = networkCaptureDataSource;
        this.f108350d = configService;
        this.f108351e = kVar;
        this.f108352f = serializer;
        this.f108353g = logger;
        this.f108354h = m.b(new g2(this, 4));
    }

    public static String b(long j13, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int intValue = (((long) bArr.length) > j13 ? Long.valueOf(j13) : Integer.valueOf(bArr.length)).intValue();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        kotlin.collections.e eVar = kotlin.collections.h.f80373a;
        int length = bArr.length;
        eVar.getClass();
        kotlin.collections.e.a(0, intValue, length);
        return new String(bArr, 0, intValue, Charsets.UTF_8);
    }

    public final Set a(String url, String method) {
        Iterable iterable;
        String str;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        RemoteConfig remoteConfig = ((sg2.b) this.f108350d).f112883h.f117615b;
        if (remoteConfig == null || (iterable = remoteConfig.f73049d) == null) {
            iterable = s0.f80394a;
        }
        LinkedHashSet I0 = CollectionsKt.I0(iterable);
        if (I0.isEmpty()) {
            return s0.f80394a;
        }
        k kVar = this.f108351e;
        if (kVar != null && (str = ((p) kVar).f100145g) != null && z.p(url, str, false)) {
            return s0.f80394a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : I0) {
            NetworkCaptureRuleRemoteConfig networkCaptureRuleRemoteConfig = (NetworkCaptureRuleRemoteConfig) obj;
            if (StringsKt.E(networkCaptureRuleRemoteConfig.f73023c, method, false) && new Regex(networkCaptureRuleRemoteConfig.f73024d).a(url) && networkCaptureRuleRemoteConfig.f73025e > 0) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet<NetworkCaptureRuleRemoteConfig> I02 = CollectionsKt.I0(arrayList);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (NetworkCaptureRuleRemoteConfig networkCaptureRuleRemoteConfig2 : I02) {
            String id3 = networkCaptureRuleRemoteConfig2.f73021a;
            uh2.a aVar = (uh2.a) this.f108348b;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(id3, "id");
            int i13 = aVar.f122252a.getInt("io.embrace.networkcapturerule" + id3, -1);
            Integer valueOf = i13 == -1 ? null : Integer.valueOf(i13);
            if (valueOf != null && valueOf.intValue() <= 0) {
                linkedHashSet.add(networkCaptureRuleRemoteConfig2);
            }
        }
        I0.removeAll(linkedHashSet);
        I02.removeAll(linkedHashSet);
        return I02;
    }
}
